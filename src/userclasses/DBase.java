package userclasses;

import com.codename1.db.Cursor;
import com.codename1.db.Database;
import com.codename1.db.Row;
import com.codename1.io.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author OLYJOSH
 */
public class DBase {
    static Database db;
    User us;   
    
    public static Database getDb() {
        return db;
    }
    
    public static void dbStuff(){
    
        try {
            boolean created = Database.exists("budgetTracker.db");
            db = Database.openOrCreate("budgetTracker.db");
            if(db == null){
                System.out.println("SQLite is not supported on this platform");
                return;
            }
            if (!created) {
            
                db.execute("CREATE TABLE IF NOT EXISTS record (" +
                    "  id INTEGER PRIMARY KEY," +
                    "  name TEXT DEFAULT NULL," +
                    "  pass TEXT DEFAULT NULL," +
                    "  descr TEXT DEFAULT NULL," +
                    "  dateCreated TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL" +
                    ");");
                db.execute("CREATE TABLE IF NOT EXISTS tracks (" +
                    "  id INTEGER PRIMARY KEY," +
                    "  recordID INTEGER DEFAULT NULL," +
                    "  amount REAL DEFAULT NULL," +
                    "  balance REAL DEFAULT 0.00," +
                    "  type INTEGER DEFAULT NULL," +
                    "  date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL," +
                    "  refrenceNo TEXT DEFAULT NULL," +
                    "  descr TEXT DEFAULT NULL);");
      
                //amount,balance,type,date,refrenceNo,descr WHERE recordID=?
//            db.execute("insert into record (name,pass,descr) values (?,?,?);", new String[]{"joshua","passworded","testing my db created"});
//            Cursor rSet = db.executeQuery("SELECT * FROM record");
//                    
//            while(rSet.next()){
//                Row r = rSet.getRow();
//                r.getInteger(0);
//                
//                System.out.println("id: "+r.getInteger(0)+"\nname "+r.getString(1)+"\ndateCreated "+r.getString(4));
//            }
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex.getMessage());
        }
        
    }

    public static String [] reg(String [] datas, double sc) {
        String []returnedData = null;
        try {
            db.execute("insert into record (name,pass,descr) values (?,?,?);", datas);
            addRecord(true, sc, "", "");
            Cursor rSet = db.executeQuery("select * from record where name=?", new String[]{datas[0]});
            while (rSet.next()) {
            Row row = rSet.getRow();
            returnedData=new String[]{String.valueOf(row.getInteger(0)),row.getString(1),row.getString(2),row.getString(3),row.getString(4)};
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
            return returnedData=null;
        }
        return returnedData;
    }
    
    public static boolean isAvail(String name){
        boolean val = true;
        try {
            Cursor rSet = db.executeQuery("SELECT * FROM record WHERE name=?", new String[]{name});
            while (rSet.next()) {
                val=false;
            }
        } catch (IOException ex) {
        }
        return val;
    }
    
    public static String[] login(String []auth){
        boolean val = true;
        String[] x = null;
        try {
            
            Cursor rSet = db.executeQuery("SELECT * FROM record WHERE name=? AND pass=?", auth);
            while (rSet.next()) {
                Row row = rSet.getRow();
                x=new String[]{String.valueOf(row.getInteger(0)),row.getString(1),row.getString(2),row.getString(3),row.getString(4)};
//            
//                Row r = rSet.getRow();
//                x= new Object[]{r.getInteger(0),r.getString(1),r.getString(2),r.getString(3),r.getString(4)};
//                //val=false;
            }
//            db.close();
//            System.out.println("BALANCE: "+balance());
            //User.setBalance(balance());
//            User us = new User();
//            us.setBalance(balance());
            //System.out.println(U);
        } catch (IOException ex) {
        }
        
        return x;
    }
    
    
private static Object[][] dataToArray(Cursor resultSet){  
   
   Object[][] data = null ;  
   try {  
      int numcols = resultSet.getColumnCount();  
      data = new Object[20][numcols];    
      int i=0;
      while (resultSet.next()) {  
          
          Row r = resultSet.getRow();
          for (int j = 0; j < numcols; j++) { 
              String dat =r.getString(j);
              if(j==3){
                  if(dat.equals("1"))dat="Income"; else dat="Expenditure";
              }
              data[i][j]=dat;
          }  
          i++;
      }  
      
   } catch(IOException e) {  
       e.printStackTrace();
   }
   
   
   return data;   
}  


static Object[][] retArray;

private static Object[][] rSetToArray(Cursor resultSet){
        String message = "";String newMessage = "";//double totalAmount = 0,totalQuantity=0;
        StringBuilder st = new StringBuilder();
        Object[][] returnArray = null;
        int numcols = 0 ;
        try {
            numcols = resultSet.getColumnCount();  
            while(resultSet.next()){
                Row r = resultSet.getRow();
                for (int i = 0; i < numcols; i++) { 
                String dat =r.getString(i);
                if(i==3){
                    if(dat.equals("1"))dat="Income"; else dat="Expenditure";
                }
                message += dat+"@@";
            }
                message.substring(0,message.length()-2);
                st.append(message+"QQQ");
                message = "";
            }

        }catch(IOException e) {  
            e.printStackTrace();
        }
        
        if(st != null && st.length() >= 1)
        {
         message = st.toString();
         newMessage = message.substring(0, message.length()-3);
         String[] first = Util.split(newMessage, "QQQ");
         int secondLen = Util.split(first[0], "@@").length;
         returnArray = new Object[first.length][secondLen];
         for(int i=0;i<first.length;i++)
             { 
                String[] second = Util.split(first[i], "@@");
                for(int j=0;j<second.length;j++)
                {
                    String a=second[j];
                    returnArray[i][j] = a;
                }
             }
            retArray=returnArray;
        }
        return retArray;
    }
    
   
public static void addRecord(boolean exp, double amount,String ref, String des){
//        try {
//            db.executeQuery("SELECT * FROM tracks where recorId=?",new String[]{String.valueOf(User.userID)});
//        } catch (IOException ex) {
//        }
        //us=new User();
    String type;
        if(exp){
            User.balance-=amount;type="0";
        }
        else {
            User.balance+=amount;type="1";
        }
        try {
            db.execute("insert into tracks (recordID,amount,balance,type,refrenceNo,descr) values (?,?,?,?,?,?);",
                    new String[]{String.valueOf(User.getUserID()),String.valueOf(amount),String.valueOf(User.getBalance()),type,ref, des});
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Balane before oeration"+ User.getBalance());
    }
    
    
    public static Object[][] tableData(){
        Object[][] x=null;
        try {
            Cursor executeQuery = db.executeQuery("SELECT descr,amount,balance,type,date,refrenceNo FROM tracks WHERE recordID=?", new String[]{""+User.getUserID()});
            
            //x = dataToArray(executeQuery);
            x=rSetToArray(executeQuery);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return x;
    }
    
    public static double balance() throws IOException{
        Cursor rSet = db.executeQuery("SELECT balance FROM tracks WHERE recordID=? ORDER BY date DESC LIMIT 1",new String[]{""+User.getUserID()});
        System.out.println("Static Id: "+User.getUserID());
        double bal = 0.00d;    
        while(rSet.next()){
            bal=rSet.getRow().getDouble(0);
        }
        return bal;
    } 
    
    public static void deleteRecord(String name, String recordID){
                        
        try {
            db.execute("DELETE FROM record where name=?",new String[]{""});
            db.execute("DELETE FROM tracks where recordID=?",new String[]{recordID});
            //return status;
        } catch (IOException ex) {
        }
    }
    
    public static void changePass(String newPass, String name){
        try {
             db.execute("UPDATE record SET pass=? WHERE name=?",new String[]{newPass,name});
       } catch (IOException ex) {
        }
       } 
    
    
    public static double[] pie(){
        //double[][] x=null;
        double inc=0,exp=0;
        try {
            Cursor resultSet = db.executeQuery("SELECT amount,type FROM tracks WHERE recordID=?", new String[]{""+User.getUserID()});
            
            //x = dataToArray(executeQuery);
            //x=rSetToArray(executeQuery);
            
            while(resultSet.next()){
                Row r = resultSet.getRow();
                double aDouble = r.getDouble(0);
                if(r.getInteger(1)==1){
                    inc+=aDouble;
                }else{
                    exp+=aDouble;
                }
            }

        
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return new double[]{inc,exp};
    }
    
}
