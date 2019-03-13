public class Univers<N,Q,R>{
    protected N entier;
    protected Q rationnel;
    protected R reel;
    public class SuperNombre{
        protected Univers<N,Q,R> snbr[];
        public SuperNombre(int tmax){
            this.snbr=new GenCouple<N,Q,R> [tmax];
        }
    }
}