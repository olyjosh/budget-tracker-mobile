package userclasses;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Dialog;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.table.Table;
import com.codename1.ui.table.TableModel;
import com.codename1.ui.util.UITimer;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author OLYJOSH
 */
public class MyTable extends Table{

    String currencyVal;
    
    public MyTable(){}
    
    public MyTable(TableModel tm){
        super(tm);
    }

    
    
    @Override
    protected Component createCell(final Object value, final int row, final int column, boolean editable) {
        //(Label) super.createCell(value, row, column, editable);
// 
//        currencyVal=""+value;
//        if(column==1 || column==2){
//            String v = String.valueOf(value);
            currencyVal=""+value;//UTility.currencyFormatter(""+value);
//            
//        }
        //boolean isRow=true;
//        if(row>=0 /* && isRow*/){
                        //This to get the date since date can be null from th table
//            if(column==4&&value!=null){
//                isRow=true;
//            }else{isRow=false;}
            Label l = new Label(""+currencyVal);
            if(row % 2 == 0) {
                l.setUIID("evenRow");
                l.getStyle().setBgTransparency(0);
                
//                if(column>=6){
//                Button but = new Button("edit");
//                but.addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent evt) {
//                        System.out.println("row: "+row + " col: "+column+"  value : "+String.valueOf(value));
//                    }
//                });
//                //but.setUIID("oddRow");
//                but.getStyle().setBgTransparency(0);
//                return but;
//                }
                
            } else {
                l.setUIID("oddRow");
                l.getStyle().setBgTransparency(0);
                
                //Rendering a delete button on a row
//                if(column==6){
//                Button but = new Button("edit");
//                but.addActionListener(new ActionListener() {
//                    public void actionPerformed(ActionEvent evt) {
//                        System.out.println("row: "+row + " col: "+column+"  value : "+String.valueOf(value));
//                    }
//                });
//                //but.setUIID("oddRow");
//                but.getStyle().setBgTransparency(0);
//                return but;
//                }
            }
            

            
//            return l;
//        }
        if(row<0){
            Label createCell = (Label)super.createCell(value, row, column, editable);
            createCell.setUIID("TableTitleLabel");
            return createCell;
        }
            //return (Label)super.createCell(value, row, column, editable);
        return l;
    }

//    @Override
//    public void pointerDragged(int x, int y) {
//        super.pointerDragged(x, y); //To change body of generated methods, choose Tools | Templates.
//        System.out.println("x: "+x+"y: "+y);
//        
//        int selectedRow = this.getSelectedRow();
//        
//        
//        
//    }


}
