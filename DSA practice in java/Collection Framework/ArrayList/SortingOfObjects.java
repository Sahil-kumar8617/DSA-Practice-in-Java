import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;



public  class SortingOfObjects {
    public static class Student{
        String Name;
        int Age;
        int Marks;

        Student(String Name,int Age,int Marks){
             this.Name=Name;
             this.Age=Age;
             this.Marks=Marks;

        } 

        public String toString(){
            return Name +" | Age :- "+ Age +" | Marks:-"+ Marks;
        }

    }

    
    public static void main(String[] args) {
        
    ArrayList<Student> StudentList=new ArrayList<Student>();

     StudentList.add(new Student("sahil", 22, 76));
    StudentList.add(new Student("Priya", 27, 86));
    StudentList.add(new Student("Vaibhav", 20, 50));

      Collections.sort(StudentList, new Comparator<Student>() {
        
            public int compare(Student s1, Student s2) {
                if (s2.Marks != s1.Marks) {
                    return s2.Marks - s1.Marks; // Descending by marks
                } else {
                    return s1.Age - s2.Age;     // Ascending by age
                }
            }
        });


for (Student s : StudentList) {
    System.out.println(s);
}

    
        
    }
    
}
