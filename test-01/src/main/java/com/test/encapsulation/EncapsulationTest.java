package com.test.encapsulation;

    class Employee {
        private String id; //private field

        public String getId() { //private field accessed inside public method
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    /**
     * JavaMadeSoEasy.com
     */
    public class EncapsulationTest {
        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.setId("1"); //public method can be accessed outside class.
            System.out.println("emp.getId()  >  " + emp.getId());
        }
    }

