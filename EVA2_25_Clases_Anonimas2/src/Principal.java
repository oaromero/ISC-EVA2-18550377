/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Operaciones oObj = new Operaciones() {
           @Override
           public int suma(int vall, int val2) {
                return vall + val2;
          }

           @Override
           public String suma(String cadel, String cade2) {
              return cadel + cade2; 
           }

           @Override
           public boolean suma(boolean boll, boolean boo2) {
              return boll && boo2;
           }
       };
    }
    
}
interface Operaciones{
    public int suma(int vall, int val2);
    public String suma(String cadel, String cade2);
    public boolean suma(boolean boll, boolean boo2);
}