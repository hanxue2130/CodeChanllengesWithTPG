package com.code.Challenges.Read;
import com.code.Challenges.Class.Customer;

import java.io.*;
import java.math.BigDecimal;
import java.text.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/*
. No clean up of resources  ✔
. No tests provided
. Doesn’t use latest Java standards. Ie, var, streams
. Only demonstrated use of a List rather than Maps.  This made retrieval a bit difficult. ✔
. Not using meaning full variable names.  Ie, list and list1   ✔
. No error handling for date parsing.      ✔
 */
public class Read {
    public static void main(String[] args) throws Exception {
        getFile();
    }
    public static void getFile() {
        int lineNumber = 0;
        HashMap<String, Customer> customerDetails = new HashMap<>();
        try {
            File csvFile = new File("src/test/template.csv");
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line = "";
            br.readLine();
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] arr = line.split(",");
                Customer newCustomer = new Customer();
                newCustomer.setName(arr[3]);
                newCustomer.setMoney(arr[4]);
                newCustomer.setBeginTime(arr[1]);
                if (customerDetails.containsKey(arr[3])) {
                    BigDecimal db = new BigDecimal(arr[4]);
                    customerDetails.get(arr[3]).money = customerDetails.get(arr[3]).money.add(db);
                    customerDetails.get(arr[3]).endTime = arr[1];
                } else {
                    customerDetails.put(arr[3], newCustomer);
                    customerDetails.get(arr[3]).beginTime = arr[1];
                }
            }
            br.close();
            print(customerDetails);
        } catch (FileNotFoundException ex) {
                System.out.println("no file is founded！");
            } catch (IOException ex) {
                System.out.println("way of reading file is wrong！");
            }
    }
    public static void print(HashMap<String, Customer> customerDetails){
        try{
            for (String k : customerDetails.keySet()) {
                if(customerDetails.get(k).endTime == null){
                    customerDetails.get(k).endTime = customerDetails.get(k).beginTime;
                }
                System.out.println(customerDetails.get(k).name);
                DecimalFormat df = new DecimalFormat("#,###.00");
                System.out.println(df.format(customerDetails.get(k).money));
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                Date date = dateFormat.parse( customerDetails.get(k).beginTime.split("\\.")[0]);
                Date date1 = dateFormat.parse(customerDetails.get(k).endTime.split("\\.")[0]);
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
                System.out.println(sdf.format(date)+"->"+sdf.format(date1));
                System.out.println();
            }
        }
        catch(ParseException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}






