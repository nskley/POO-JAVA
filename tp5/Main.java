public class Main{

    public static void main(String[] args) {
        System.out.println("::::::::::::::::::: test TrieurSelection  :::::::::::::::::::::::::::::::::::::::::::::::::::");
        TrieurSelection<Integer> liste1=new TrieurSelection<Integer>();
        TrieurSelection<Integer> liste2=new TrieurSelection<Integer>();
        TrieurSelection<Integer> liste3=new TrieurSelection<Integer>();
        for(int i=0; i<20; i++){
            if(i%2==0){
                liste1.add(i,i);
            }
            else{
                liste1.add(i,2*i);
            }
        }
        liste2.setData(liste1.list);
        liste3.setData(liste1.list);
        System.out.println("liste not sorted  : "+liste1.toString());
        System.out.println("time befor sorting: "+System.currentTimeMillis());
        System.out.println("nombre d'iteration: "+liste1.sort());
        System.out.println("time after sorting: "+System.currentTimeMillis());
        System.out.println("list sorted       : "+liste1.getData());
        liste1.swap(2, 9);
        System.out.println("after swap        : "+liste1.getData());
        System.out.println("");
        System.out.println("::::::::::::::::::: test TrieurBulle      :::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("liste not sorted  : "+liste2.toString());
        System.out.println("time befor sorting: "+System.currentTimeMillis());
        System.out.println("nombre d'iteration: "+liste2.sort());
        System.out.println("time after sorting: "+System.currentTimeMillis());
        System.out.println("list sorted       : "+liste2.getData());
        liste2.swap(2, 9);
        System.out.println("after swap        : "+liste2.getData());
    }
}