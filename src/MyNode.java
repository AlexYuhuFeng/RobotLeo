
public class MyNode<E>{
	private double xC;
	private double yC;
	MyNode <E> prev;
	MyNode <E> next;
	
	public MyNode(double a, double b, MyNode <E> m, MyNode <E> n){
		this.xC = a;
		this.yC = b;
		this.prev = m;
		this.next =n;
	}
	
	public double getX(){
		return this.xC;
	}
	
	public double getY(){
		return this.yC;
	}
	
	public double getDis(MyNode <E> a, MyNode <E> b){
		double Xdif = Math.abs(a.xC-b.xC);
		double Ydif = Math.abs(a.yC-b.yC);
		double dist = Math.sqrt(Xdif * Xdif + Ydif * Ydif);
		return dist;
	}
	
	public boolean satisfy(MyNode <E> a, MyNode <E> b, MyNode <E> c, MyNode <E> d){
		//检查内容（a,b,c）
		double k1; double m1; double k2; double m2_1; double m2_2; double xItc1; double yItc1; double xItc2; double yItc2;
		//建立线性方程方程
		k1 = (c.getY()-a.getY())/(c.getX()-a.getX());
		m1 = a.getY()-a.getX()*k1;
		//作垂线
		k2 = -1/k1;
		m2_1 = b.getY()-b.getX()*k2;
		m2_2 = d.getY()-d.getX()*k2;
		//找交点1
		xItc1 = (m2_1-m1)/(k1-k2);
		yItc1 = xItc1*k2 + m2_1;
		//找交点2
		xItc2 = (m2_2-m1)/(k1-k2);
		yItc2 = xItc2*k2 + m2_2;
		//判断a,b,c,h1,h2
		double Xdist1 = Math.abs(b.getX()-xItc1);
		double Ydist1 = Math.abs(b.getY()-yItc1);
		//h1
		if (Math.sqrt(Xdist1*Xdist1+Ydist1*Ydist1)==52){
		Xdist1 = Math.abs(d.getX()-xItc2);
		Ydist1 = Math.abs(d.getY()-yItc2);
		//h2
		if (Math.sqrt(Xdist1*Xdist1+Ydist1*Ydist1)==52){
		if (Math.sqrt(Xdist1*Xdist1+Ydist1*Ydist1)==47){
			Xdist1 = Math.abs(xItc1-a.getX());
			Ydist1 = Math.abs(yItc1-a.getY());
			//判断a
			if (Math.sqrt(Xdist1*Xdist1+Ydist1*Ydist1)==47){
				Xdist1 = Math.abs(c.getX()-xItc1);
				Ydist1 = Math.abs(c.getY()-yItc1);
				//判断b
				if (Math.sqrt(Xdist1*Xdist1+Ydist1*Ydist1)==46){
					Xdist1 = Math.abs(xItc2-c.getX());
					Ydist1 = Math.abs(xItc2-c.getY());
					//判断
					if (Math.sqrt(Xdist1*Xdist1+Ydist1*Ydist1)==37){
						return true;
					}
				}	
			}
		}
		}
		}
		return false;
		
	}
	
}
