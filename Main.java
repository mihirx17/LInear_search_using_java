public class Main {
    public static int liner_search(int linear[],int key)
    {
        for (int i=0;i<linear.length;i++)
        {
            if(linear[i]==key)
            {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int linear[]={1,4,5,6,7,89,1};
        int key=7;
        int index=liner_search(linear,key);
        if(index==1)
        {
            System.out.println("not found");
        }
        else {

            System.out.println("your index number " + index);
        }


    }
}