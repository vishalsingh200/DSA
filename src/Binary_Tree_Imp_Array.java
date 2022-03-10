public class Binary_Tree_Imp_Array {
    static int i = 0;
    static String[] str = new String[10];
    public void Root (String key){
        str[0] = key;
    }
    public void Left_child(String key , int i){
        int a = 2*i + 1;
        if (str[i] == null){
            System.out.printf("can not set child at %d , no parent found\n ", a);
        }
        else{
            str[i] = key;
        }
    }
    public void Right_child(String key , int i){
        int a = 2*i + 2;
        if (str[i] == null){
            System.out.printf("can not set child at %d , no parent found\n ", a);
        }
        else{
            str[i] = key;
        }
    }
    public void print_tree(){
        for (int i = 0; i<10; i++){
            if (str[i]!=null)
                System.out.println(str[i]);
            else
                System.out.println("-");
        }
    }
}
class tree{
    public static void main(String[] args) {
        Binary_Tree_Imp_Array obj = new Binary_Tree_Imp_Array();
        obj.Root("A");
        obj.Left_child("B",1);
        obj.Right_child("C",2);
        obj.Left_child("D",3);
        obj.Right_child("E",4);
        obj.Left_child("F",5);
        obj.Right_child("G",6);
        obj.print_tree();
    }
}

