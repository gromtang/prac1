interface Inter2{
    void show();
}

class Anonymous {
    public static Inter2 method(){
        return new Inter2(){
            public void show(){
                System.out.println("HelloWorld");
            }
        };
    }
    class Inner{}
}

class OuterDemo{
    public static void main(String[] args) {
        Anonymous.method().show();//一道面试题，关于匿名内部类。
    }
    Anonymous.Inner ai = new Anonymous().new Inner();
}//内部类的使用