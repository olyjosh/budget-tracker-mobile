package userclasses;
//
import ca.weblite.codename1.components.charts.Chart;
import ca.weblite.codename1.components.charts.ChartBuilder;
import ca.weblite.codename1.components.charts.ChartView; 
import ca.weblite.codename1.components.charts.Line;
import ca.weblite.codename1.components.charts.Series;
import com.codename1.components.WebBrowser;
import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.spinner.DateTimeSpinner;
import com.codename1.ui.table.DefaultTableModel;
import com.codename1.ui.table.Table;
import com.codename1.ui.table.TableModel;
import com.codename1.ui.util.Resources;
import generated.StateMachineBase;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Joshua Aroke (OLYJOSH)
 */
public class StateMachine extends StateMachineBase {
    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }
    
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
        DBase.dbStuff();
    }

    boolean toReg,s=false;
    //boolean reg = false;
    User us;
    Table table;
    TableModel model;
    String detailAmt,detailDesc,detailBal, detailDate;
    short seclectedRow;
    public static int rowCount;
    
    @Override
    protected void postMain(final Form f) {
        passCorrect(f);
        final TextField userf = findUserf(f);
        userf.addDataChangeListener(new DataChangedListener() {

            public void dataChanged(int type, int index) {
                if(!DBase.isAvail(userf.getText())){
                    findAvail().setText("record already exist");
                    f.repaint();
                    s=false;
                }else{
                    findAvail().setText("");s=true;
                    f.repaint();
                }
            }
        });
   
    }
            
    private boolean passCorrect(final Form f){
        
        TextField findPassf = findPassf(f);
        
        DataChangedListener x = new DataChangedListener() {
            public void dataChanged(int type, int index) {
                String pass = findPassf(f).getText();
                String conf = findConfF(f).getText();
                if(!pass.equals(conf)){
                    s=false;
                    findNotMatch(f).setText("password does not match");
                    findNotMatch(f).setTickerEnabled(true);
                    f.repaint();
                }
                else {
                    findNotMatch(f).setText("");
                    f.repaint();
                    s=true;
                }
                
            }
        };
        //findPassf.addDataChangeListener(x);
        findConfF(f).addDataChangeListener(x);
        return s;
    }
    
    

    @Override
    protected void onMain_ButtonAction(Component c, ActionEvent event) {
        Form f=c.getComponentForm();
        String u= findUserf(f).getText();
        String p= findPassf(f).getText();
        String d= findDescrF(f).getText();
        String cc=findConfF(f).getText();
        String sc=findCapitalf(f).getText();
        if(u.length()<1|| p.length()<1 ||  cc.length()<1 || !cc.equals(findPassf().getText())){
            Dialog.show("Invalid entries", "Please fill all fields correctly", "Ok", null);
            s=false;
        }else if(!s){
            Dialog.show("Invalid entries", "Please fill all fields correctly", "Ok", null);
        }else{ 
            String []regedData = DBase.reg(new String[]{u,p,d},Double.parseDouble(sc));
            if(regedData!=null){
                us = new User(Integer.parseInt(regedData[0]), regedData[1],regedData[2], Double.parseDouble(sc), regedData[3],regedData[4] );
                Form showForm = showForm("Home", null);
                showForm.setTitle(regedData[1]);
                //us = new User;
            }
        }
    
    }

    @Override
    protected void onLoginForm_LoginAction(Component c, ActionEvent event) {
        String username = findUsename().getText();
        String[] login = DBase.login(new String[]{username,findPassword().getText()});
        if (login!=null){
            showForm("Home", null);
            us = new User(Integer.parseInt(login[0]), login[1],login[2], 0.00,login[4], login[3] );
            
            try {
                us.setBalance(DBase.balance());
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            Form showForm = showForm("Home", null);
            showForm.setTitle(login[1]);
        }
        else Dialog.show("","invalid username or password", "Try Again", null);
        
    }

    @Override
    protected void onEntry_ButtonAction(Component c, ActionEvent event) {
        final Form f = c.getComponentForm();
        System.out.println(Display.getInstance().getCurrent().getTitle());
        String amount = findAmountF(f).getText();
        int selectedIndex = findTypeF(c).getSelectedIndex();
        Date currentDate = findDateTimeSpinnerF(f).getCurrentDate();
        
        String ref = findRefF(f).getText();
        String desc = findDescF(f).getText();
        boolean exp=false;
        if(selectedIndex==0){
            exp=true;
        }
        DBase.addRecord(exp, Double.parseDouble(amount), ref, desc);
        Dialog dg = (Dialog)Display.getInstance().getCurrent();
        dg.dispose();
        dg=new Dialog();
        dg.setLayout(new BorderLayout());
        dg.addComponent(BorderLayout.CENTER,new Label("Entry added"));
        dg.setTimeout(800);
        dg.showModeless();
       
        Display.getInstance().callSeriallyAndWait(new Runnable() {
            public void run() {
                model=new DefaultTableModel(head,DBase.tableData());
                
                table.setModel(model);
        try {
                double bal=DBase.balance();
                us.setBalance(bal);
                //findBalanceL(f).setText("NGN "+bal);
        } catch (IOException ex) {
        }
            }
        });
        
        
    }

    
    @Override
    protected void postEntry(Form f) {
        Dialog dg=(Dialog)f;
        dg.setDisposeWhenPointerOutOfBounds(true);
        DateTimeSpinner sp = findDateTimeSpinnerF(f);
        try {
            sp.setStartDate(DateFormat.getDateInstance().parse(us.getDateCreated()));
            sp.setEndDate(Calendar.getInstance().getTime());
            //sp.setEndDate(new Date());
            sp.setCurrentHour(Calendar.HOUR_OF_DAY);
            sp.setCurrentMinute(Calendar.MINUTE);
            sp.setCurrentDate(DateFormat.getDateInstance().parse(us.getDateCreated()));
        } catch (ParseException ex) {
        }
        f.repaint();
        System.out.println("date created :"+us.getDateCreated());
        
    }
    
    //User detailUser;
    
    @Override
    protected void postHome(final Form f) {
        table=new MyTable(new DefaultTableModel(head, new Object[][]{}));//{
//
////            @Override
////            public void pointerDragged(int x, int y) {
////                setModelToTable();
////                super.pointerDragged(x, y); //To change body of generated methods, choose Tools | Templates.
////                final Dialog dg = (Dialog)showForm("Detail", null);
////                int r = this.getSelectedRow();
////                dg.setDisposeWhenPointerOutOfBounds(true);
////                
////            }
//            
//        };
        table.setInnerBorderMode(Table.INNER_BORDERS_NONE);
        findContainer(f).addComponent(/*BorderLayout.CENTER,*/table );
        setModelToTable();
        //model.getValueAt(rowCount, );
        
        //findBalanceL(f).setText("NGN "+us.getBalance());
        //tabiliEfficy(f, table);
        
    }

    private void setModelToTable(){
        Object[][] tableData = DBase.tableData();
        if(tableData!=null){
        model=new DefaultTableModel(head,tableData);
        //String[] s= {"Name","Name","Name"};
        //String[][] bod = {{"Ade","Joshua","Dapo"},{"Vectra","Josh","Demisdeek"}};
        //model = new DefaultTableModel(s, bod, true);
        rowCount = model.getRowCount();
        table.setModel(model);
        }
    }
    
    Timer timer;
    private void tabiliEfficy(final Form f, Table t){
        
        f.addPointerPressedListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //System.out.println("component at "+f.getComponentAt(evt.getX(),evt.getY()).getName());
                //if(f.getComponentAt(evt.getX(),evt.getY()).getName().equals("table")){
                String valueAt =""+ table.getModel().getValueAt(table.getSelectedRow(), table.getSelectedColumn());
                System.out.println(valueAt);
                timer = new Timer();
                    timer.schedule(new  TimerTask() {
                        @Override
                        public void run() {
                            //Dialog.show("", "Pressed for long", "Ok",null);
                            Dialog d = (Dialog)showForm("Detail", null);
                            d.setDisposeWhenPointerOutOfBounds(true);
                        }
                    }, 650);
                    
                //}
            }
        });
        f.addPointerReleasedListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                timer.cancel();
            }
        });
    }
    
    String []head = new String[]{"Description","Amount","Balance","Transaction Type","Date","REF ID"};


    @Override
    protected void beforeEntry(Form f) {
        DateTimeSpinner sp = findDateTimeSpinnerF(f);
        try {
            sp.setStartDate(DateFormat.getDateInstance().parse(us.getDateCreated()));
        } catch (ParseException ex) {
        }
        sp.setEndDate(Calendar.getInstance().getTime());
        sp.setCurrentHour(Calendar.HOUR_OF_DAY);
        sp.setCurrentMinute(Calendar.MINUTE);
        System.out.println("date created :"+us.getDateCreated());
    }

    @Override
    protected void postDetail(Form f) {
        int r =table.getSelectedRow(),c=table.getSelectedColumn();
                
        findDescrL(f).setText(""+model.getValueAt(c, r));
        findDateL(f).setText(""+model.getValueAt(c, r));
        findAmtL(f).setText(""+model.getValueAt(c, r));
        findTypeL(f).setText(""+model.getValueAt(c, r));
        findBalL(f).setText(""+model.getValueAt(c, r));
    }

    @Override
    protected void beforeDetail(Form f) {
        
    }
    
   

    @Override
    protected void postChartForm(Form f) {
       
        //findContainer(f).addComponent(BorderLayout.CENTER,UTility.openChart());
        
    }
    
    @Override
    protected void beforeChartForm(Form f) {
        double[] pie = DBase.pie();
        double sum=pie[0]+pie[1];
        findSpanLabel(f).setText("Pie-chart of Income/Expenditure.\nTotal sum:  NGN "+sum);
        Chart ch = new ChartBuilder().newPieChart(pie, new String[]{"Income","Expenditure"});
        ChartView chartView = new ca.weblite.codename1.components.charts.ChartView(ch);
//        //findContainer(f).addComponent(BorderLayout.CENTER,new ca.weblite.codename1.components.charts.ChartView(ch));
        chartView.initLater();
        findContainer(f).addComponent(BorderLayout.CENTER,chartView);
    }
    
    

//    @Override
//    protected void onLogin_Button1Action(Component c, ActionEvent event) {
//
//Chat code sample here 
//
//    
//        Form hi = new Form("Pie Chart");
//hi.setLayout(new BorderLayout());
//ChartBuilder b = new ChartBuilder();
//Chart chart = b.newPieChart(
//        new double[]{10, 22, 45,77,40,96},
//        new String[]{"BC", "Alberta", "Saskatchewan","A","B","C"}
//);
//ChartView v = new ChartView(chart);
//
//v.initLater();
//hi.addComponent(BorderLayout.CENTER, v);
//hi.show();
//    
//    }

   

    @Override
    protected void onChangepass_Button1Action(Component c, ActionEvent event) {
        ((Dialog)c.getComponentForm()).dispose();
    
    }

    private boolean compareNewPasswords(Form f){
        return findNewPass(f).getText().equals(findRetypePass(f).getText());
    }
    
    @Override
    protected void postChangepass(final Form f) {
        final Label warn = findLabel3(f);
        warn.setVisible(false);
//        ((Dialog)f).setDisposeWhenPointerOutOfBounds(true);
//        findRetypePass(f).addDataChangeListener(new DataChangedListener() {
//            public void dataChanged(int type, int index) {
//                if(!compareNewPasswords(f)){
//                    warn.setVisible(true);
//                }
//            }
//        });
    }

    @Override
    protected void onChangepass_ButtonAction(Component c, ActionEvent event) {
        Form f = c.getComponentForm();
        String newpasss = findNewPass().getText();
        if(findOldPass(f).getText()!=null && newpasss!=null){
            if(findLabel3(f).isVisible()){
                Dialog.show("Not Valid Entry", "Please Correct password entries", "Ok", null);
            }else{
                if(User.getPassword().equals(findOldPass(f).getText())){
                    DBase.changePass(User.getUser(), newpasss);
                    User.setPassword(newpasss);
                    ((Dialog)f).dispose();
                    Dialog.show("Success!", "Password change Successfully", "Ok", null);
                }else{ 
                    Dialog.show("Wrong password", "Wrong password entry!", "Ok", null);
                    System.out.println("PROB="+User.getPassword()+":"+ findOldPass(f).getText());
                }
            }
        }else Dialog.show("Not Valid Entry", "Password can not be empty", "Ok", null);
    }
    
    
    

    @Override
    protected boolean onHomeDeleteThisRecord() {
        if(Dialog.show("Confirm", "Are you sure want to delete this record?\nThis Operation can not be undo", "Yes","Cancel")){
            DBase.deleteRecord(User.getUser(), ""+User.getUserID());
            showForm("EmptyForm", null);
        }
        return true;
    }

    @Override
    protected void postAbout(Form f) {
        findSpanLabel(f).setText(UTility.abt);
    }

    

    @Override
    protected void beforeHome(Form f) {
        f.removeCommand(f.getBackCommand());
    }

    @Override
    protected void onHome_ButtonAction(Component c, ActionEvent event) {
        try {
            Dialog.show("", "Your balance is: NGN "+DBase.balance(),"Dismiss", null);
        } catch (IOException ex) {
        }
    
    }
}