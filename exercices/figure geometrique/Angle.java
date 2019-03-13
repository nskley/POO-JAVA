public class Angle{
    Double angle;
    String unite;
    public Angle(Double x,String unite){
        this.angle=x;
        this.unite=unite;
    }

    public void rad_degre(){
        if(this.unite=="radian"){
            this.angle=(this.angle/Math.PI)*180.0;
            this.unite="degre";
        }
    }
    public void degre_rad(){
        if(this.unite=="degre"){
            this.angle=(this.angle/180.0)*Math.PI;
            this.unite="radian";
        }
    }

    public void mesPrincipale(){
        if(this.unite=="degre"){
            this.degre_rad();
        }
        while(this.angle<=-Math.PI){
            this.angle-=2*Math.PI;
        }
        while(this.angle>Math.PI){
            this.angle-=2*Math.PI;
        }

    }


    
    public static void main(String[] args) {
        Angle a=new Angle(45.0, "degre");
        a.mesPrincipale();
        System.out.println(a.angle);
        System.out.println(Math.PI/4);
    }
    
}