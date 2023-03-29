package com.test.collectiontest;

public class Employee {
    private Integer id;
    private String name;
    public Employee(Integer id, String name) { //constructor
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Employee[id=" + id + ",name=" + name + "] " ;

    }
        public boolean equals(Object obj) {
            if (obj == null) // If obj is null,return without comparing obj & Employee class.
                return false;
            if (this.getClass() != obj.getClass())
                return false;
            Employee emp = (Employee) obj;
            return (emp.id == this.id || emp.id.equals(this.id))
                    && (emp.name == this.name || emp.name.equals(this.name));
        }

    @Override
          public int hashCode(){
        int hash=(this.id==null ? 0: this.id.hashCode() ) +
                (this.name==null ? 0: this.name.hashCode());
        return hash;
    }
}

