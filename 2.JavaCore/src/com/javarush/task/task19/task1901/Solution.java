package com.javarush.task.task19.task1901;

/* 
TableAdapter
Класс Solution должен содержать public static интерфейс ATable.
Класс Solution должен содержать public static интерфейс BTable.
Класс Solution должен содержать public static класс TableAdapter.
Класс TableAdapter должен реализовывать интерфейс BTable.
Класс TableAdapter должен содержать приватное поле aTable типа ATable.
Класс TableAdapter должен содержать конструктор с параметром ATable.
Класс TableAdapter должен переопределять метод getHeaderText согласно заданию.
*/

public class Solution {
    public static void main(String[] args) {
//        //это пример вывода
//        ATable aTable = new ATable() {
//            @Override
//            public String getCurrentUserName() {
//                return "Amigo";
//            }
//
//            @Override
//            public String getTableName() {
//                return "DashboardTable";
//            }
//        };
//
//        BTable table = new TableAdapter(aTable);
//        System.out.println(table.getHeaderText());
//    }
//
//    public static class TableAdapter implements BTable {
//       private ATable aTable;
//        public TableAdapter(ATable aTable)
//        {
//            this.aTable = aTable;
//        }
//
//
//        @Override
//        public String getHeaderText() {
//            String userTable = "[" + aTable.getCurrentUserName()+ "]" + " : " + aTable.getTableName();
//
//            return userTable;
//        }
//    }
//
//    public interface ATable {
//        String getCurrentUserName();
//        String getTableName();
//    }
//
//    public interface BTable {
//        String getHeaderText();
        new Thread(new Runnable(){
            public void run(){
                for (int i =0;i<10000;i++) {
                    System.out.println("ouch!");
                }
            }
        }).start();

        new Thread(new Runnable(){
            public void run(){
                for (int j =0;j<10000;j++)
                    System.out.println("Wooooow!");
                }

        }).start();
    }
}