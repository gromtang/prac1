public class StandardClass {

    private String name;
    private int size;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    //public StandardClass(){} 这是构造方法，方法名必须和类名相同
    //public sta(){} 这样就不行

}
