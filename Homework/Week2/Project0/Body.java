class Body{
  public static final double G=6.67e-11;
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
    public double calcDistance(Body b){   //r^2=dx^2+dy^2
      return Math.sqrt(Math.pow(b.xxPos-this.xxPos,2)+Math.pow(b.yyPos-this.yyPos,2));
  }

    public double calcForceExertedBy(Body b){   //F=(G⋅m1⋅m2)/r^2
      double distance=calcDistance(b);
      return (G*this.mass*b.mass)/Math.pow(distance,2);
  }

    public double calcForceExertedByX(Body b){
       return calcForceExertedBy(b)*(b.xxPos-this.xxPos)/calcDistance(b);

    }
     public double calcForceExertedByY(Body b){
      return calcForceExertedBy(b)*(b.yyPos-this.yyPos)/calcDistance(b);
    }

}