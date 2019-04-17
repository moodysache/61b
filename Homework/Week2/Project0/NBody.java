
public class NBody{
	
	public static void main(String [] args){
			 double T =Double.parseDouble(args[0]);
        double dt=Double.parseDouble(args[1]);
        String filename=args[2];
        double radius=readRadius(filename);
        Body[] bodies=readBodies(filename);
                

         StdDraw.setScale(radius * -1, radius);
         StdDraw.picture(0, 0, "images/starfield.jpg");
        for (Body j : bodies) {
            j.draw();
        }
       StdDraw.enableDoubleBuffering();
       double time=0;
       while(time<T){
       		double[]xForces = new double[bodies.length]; 
            double[]yForces = new double[bodies.length]; 
			for (int i = 0; i < bodies.length; i++) {
                xForces[i]=bodies[i].calcNetForceExertedByX(bodies);
                yForces[i]=bodies[i].calcNetForceExertedByY(bodies);
            }
           for (int j = 0; j <bodies.length; j++) {
                bodies[j].update(dt, xForces[j], yForces[j]);
            }
             StdDraw.picture(0, 0,"images/starfield.jpg");
             for (Body j:bodies) {
                j.draw();
            }
             StdDraw.show();
             StdDraw.pause(10);
 			 time += dt;
       }
       		StdOut.printf("%d\n", bodies.length);
			StdOut.printf("%.2e\n", radius);
			for (int i = 0; i < bodies.length; i++) {
    			StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                  bodies[i].xxPos, bodies[i].yyPos, bodies[i].xxVel,
                  bodies[i].yyVel, bodies[i].mass, bodies[i].imgFileName);   
}
	}

	 public static double readRadius(String name)  {
        In reader = new In(name);
        int firstItemInFile = reader.readInt();
        double radius=reader.readDouble();
        return radius;
    }

     public static Body[] readBodies(String name){
        In reader=new In(name);
        Body[] bodies=new Body[reader.readInt()];
        reader.readDouble();
        for (int i=0;i<bodies.length;i++){
            double xPosition = reader.readDouble();
            double yPosition = reader.readDouble();
            double xVelocity = reader.readDouble();
            double yVelocity = reader.readDouble();
            double mass      = reader.readDouble();
            String imgName   = reader.readString();
            bodies[i]=new Body(xPosition,yPosition,xVelocity,yVelocity,mass,imgName);
        }
        reader.close();
        return bodies;
    }
}