class Body{
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public Body(double xP, double yP, double xV,
              double yV, double m, String img){
        this.xxPos=xP;
        this.yyPos=yP;
        this.xxVel=xV;
        this.yyVel=yV;
        this.mass=m;
        this.imgFileName=img;
              }
              public Body(Body b){
              this(b.xxPos,b.yyPos,b.xxVel,b.yyVel,b.mass,b.imgFileName);
              
              }
    public double calcDistance(Body b){
    		return Math.sqrt(Math.pow(b.xxPos-this.xxPos,2)+Math.pow(b.yyPos-this.yyPos,2));
    }

}