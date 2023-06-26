// https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
package basic;

    import java.lang.reflect.*;
    import java.util.*;

    class Student3{
        private String name;
        private String id;
        private String email;

        public String getName() {
            return name;
        }
        public String getId() {
            return id;
        }
        public String getEmail() {
            return email;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setId(String id) {
            this.id = id;
        }
        public void setEmail(String email) {
            this.email = email;
        }
    }

    public class P051AdvancedReflectionAttributes {

        public static void main(String[] args){
            Class<Student3> student = Student3.class;
            Method[] methods = student.getMethods();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method m : methods){
                methodList.add(m.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }
    }




