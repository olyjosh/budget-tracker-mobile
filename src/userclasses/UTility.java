package userclasses;

import com.codename1.ui.Component;


/**
 *
 * @author OLYJOSH
 */
public class UTility {
    
//    public static String currencyFormatter(String s){
//        System.out.println("val:\n"+s+"\n");
//        StringBuffer bf=new StringBuffer();
//        int n=0,p=0;
//        if(s.startsWith("-")){n=1;bf.append('-');}
//        if(s.contains(".")){p=s.indexOf(".");}else{p=s.length()-1;}
//        //String a=s.substring(n, s.indexOf(".")); 
//        String a=s.substring(n, p); 
//        String b=s.substring(p);
//        char[] c = a.toCharArray();
//        for (int i = c.length; i > 0; i--) {
//            if(i%4==0){bf.append(',');}
//            bf.append(c[i]);
//        }
//        return bf.append(b).toString();
//    }
    
//    public static String currencyFormatter(String s){
//        StringBuffer bf=new StringBuffer(s);
////        String a=s.substring(0, s.indexOf("."));
//        bf.insert(0, ",");
//        bf.insert(2, ",");
//        return bf.insert(3, ",").toString();
//    }
//    
//     public Component drawChat(){
//        Context conte = new Context();
//        CategorySeries cs = new CategorySeries("Expenditure");
//        cs.add("Ade",23);
//        cs.add("Josh",53);
//        cs.add("Dave",73);
////        cs.add("Mal",23);
////        cs.add("Bun",88);
////        cs.add("Onye",60);
//        
//        
//        DefaultRenderer dr = new DefaultRenderer();
//        SimpleSeriesRenderer sir = new SimpleSeriesRenderer();
//        sir.setGradientStart(0, 0);
//        sir.setGradientStop(3, 255);
//        dr.addSeriesRenderer(sir);
//        
//        View v = ChartFactory.getPieChartView(conte, cs, dr);
//        Component c = v.getPeer();
//        return c;
//    }
//    
//        public static Component openChart(){
// 
//        // Pie Chart Section Names
//        String[] code = new String[] {
//            "Eclair & Older", "Froyo", "Gingerbread", "Honeycomb",
//            "IceCream Sandwich", "Jelly Bean"
//        };
// 
//        // Pie Chart Section Value
//        double[] distribution = { 3.9, 12.9, 55.8, 1.9, 23.7, 1.8 } ;
// 
//        // Color of each Pie Chart Sections
//        //int[] colors = { Color.BLUE, Color.MAGENTA, Color.GREEN, Color.CYAN, Color.LTGRAY,Color.YELLOW };
//        int[] colors = {125,222,232,255,200,111};
// 
//        // Instantiating CategorySeries to plot Pie Chart
//        CategorySeries distributionSeries = new CategorySeries(" Android version distribution as on October 1, 2012");
//        for(int i=0 ;i < distribution.length;i++){
//            // Adding a slice with its values and name to the Pie Chart
//            distributionSeries.add(code[i], distribution[i]);
//        }
// 
//        // Instantiating a renderer for the Pie Chart
//        DefaultRenderer defaultRenderer  = new DefaultRenderer();
//        for(int i = 0 ;i<distribution.length;i++){
//            SimpleSeriesRenderer seriesRenderer = new SimpleSeriesRenderer();
//            seriesRenderer.setColor(colors[i]);
//            //seriesRenderer.setDisplayChartValues(true);
//            // Adding a renderer for a slice
//            defaultRenderer.addSeriesRenderer(seriesRenderer);
//        }
// 
//        defaultRenderer.setChartTitle("Android version distribution as on October 1, 2012 ");
//        defaultRenderer.setChartTitleTextSize(20);
//        defaultRenderer.setZoomButtonsVisible(true);
// 
//        // Creating an intent to plot bar chart using dataset and multipleRenderer
//        Intent intent = ChartFactory.getPieChartIntent(new Context(), distributionSeries , defaultRenderer, "AChartEnginePieChartDemo");
// 
//        // Start Activity
//        //startActivity(intent);
//        View v = ChartFactory.getPieChartView(new Context(), distributionSeries, defaultRenderer);
//        Component c = v.getPeer();
//        return c;
//    }
   
    public static String abt="This particular thesis is aimed at providing basic " +
"software that will aid in the daily financial transaction" +
" of households. Studies indicated that vast levels " +
"of financial mismanagement occur in a number of " +
"households(Particularly in Nigeria), as such becoming " +
"an issue considering the situation of this current economy." +
"This software assists in rectifying or minimizing this"
+ "particularly problem, which is vital to the circulation of fund in a" +
"household. Moreover, the software will improve and aid the formation of " +
"household budgets on a monthly basis." +
"\n" +
"\n" +
"\tThe software functions as a budget tracker and a " +
"record for future reference. The software can have many" +
" users, and new users can register on the main interface" +
"of the program.The users can log in when the program start." +
"After login, the user can start transactions to add " +
"expenses income and recurring costs. These transactions " +
"can be saved for further reuse, and can be cancelled." +
"The user can also use the software to find out how much" +
"they are saving or losing over a period of time. The " +
"application also allows the user to specify a date range" +
" and see the net flow of money in and out ot thehouse " +
"budget for that time period.";
    
    
    
}
