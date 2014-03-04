package Exercise2;
import sheffield.*;

public class Lissajou {
	public static void main(String[] args){
		EasyGraphics g = new EasyGraphics(400, 400, 200, 200);
		g.setResizable(true);
		g.moveTo(0, -200);
		g.lineTo(0, 200);
		g.moveTo(-200, 0);
		g.lineTo(200, 0);
		double t = 0.0;
		//double x = 0.0;
		//double y = 0.0;
		//g.moveTo(0.0, 1.0);
		double i = Math.PI;
		g.moveTo(100*Math.sin(-10*i), 200*Math.sin(-5*i+i/6));
		for(t =-i+0.01;t<=i;t+=0.01){
			double x0 = 10*t;
			double y0 = 5*t+ i/6;
			g.lineTo(100*Math.sin(x0), 200*Math.cos(y0));
		}
	}
}
