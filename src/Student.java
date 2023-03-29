public class Student {

    int num;
    String name;


    //CONSTRUCTOR IN JAVA
    public Student()
    {

        num=1;
        name="vaishnavi";


    }
    public static void main(String[] args){
        int i,n;

        Student student= new Student();


        //FOR LOOP
        for(i=0;i<10;i++)
        {
            System.out.println(i);

        }


        //While loop
        while(i<=10)
        {
            System.out.println("The value of i is " + i);
            i--;
            if(i==0)
            {
                break;
            }
        }


        //Do while loop
        do {
            System.out.println(i);
            i++;
        }while(i<=10);



        System.out.println("Name of student is " + student.name +"Roll no is " + student.num );

    }



}

