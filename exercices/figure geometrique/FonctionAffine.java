public class FonctionAffine{
    float equation[];
    public FonctionAffine(float coef_dir, float ord_origine){
        this.equation[0]=coef_dir;
        this.equation[1]=-1;
        this.equation[2]=ord_origine;
    }
    public FonctionAffine(float a, float b, float c){
        this.equation[0]=a;
        this.equation[1]=b;
        this.equation[2]=c;
    }

    public void equationDroite(Point p1, Point p2){
        //Droite D=new Doite(0,0);
        this.equation[0]=p2.y-p1.y;
        this.equation[1]=p1.x-p2.x;
        this.equation[2]=p1.y*(p2.x-p1.x)-p1.x*(p2.y-p1.y);
    }

    public float image(Point p){
        if (this.equation[1]!=0){
            return -(this.equation[0]/this.equation[1])*p.x -(this.equation[3]/this.equation[1]);
        }
    }

    public boolean estAuDessus(Point p){
        if(this.equation[1]!=0){
            return this.image(p)>=p.y;
        }
        else{
            return p.x>=-this.equation[2]/this.equation[0];
        }
    }

    public boolean estEnDessus(Point p){
        if(this.equation[1]!=0){
            return this.image(p)<p.y;
        }
        else{
            return p.x<-this.equation[2]/this.equation[0];
        }
    }

    public boolean memeSituationQue(Point p1, Point p2){
        if((this.estAuDessus(p1) && this.estAuDessus(p1)) || (this.estEnDessus(p1) && this.estEnDessus(p2))){
            return true;
        }
        else{
            return false;
        }
    }
}