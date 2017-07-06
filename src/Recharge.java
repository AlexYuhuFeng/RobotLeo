import java.util.LinkedList;

public class Recharge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//接收到的距离数组
		double polarDis [] = {224组数据};
		//只取-45～+45
		double xCords   [] = new double [180];
		double yCords   [] = new double [180];
		int counter = 0;
		LinkedList front = new LinkedList();
		LinkedList curr = front;
		for (int i = 0; i < xCords.length-1;i++){
			//这里没有进行坐标修正,需要根据图的大小和中心点决定
			xCords[i] = polarDis[i + 22] * Math.cos(45 + 0.5*counter);
			yCords[i] = polarDis[i + 22] * Math.sin(45 + 0.5*counter);
			//新建链表节点
			MyNode o = new MyNode (xCords[i],yCords[i],null,null);
			
			//如果大于等于h（初步合格），就放进链表内
			if (o.getDis(o, o.prev) >= 52&&curr.next=!null){
				curr.next = o;
				curr = curr.next;
			}
		}
		
			//每次判断需要四个节点所以
			curr = front;
			while (curr.next.next.next!=null){
				if (curr.satify(curr,curr.next.curr.next.next,curr.next.next.next)){
					sendCords(curr,curr.next.next);
				}
			}
	}
	//打印坐标：格式（“x1坐标；y1坐标；x2坐标；y2坐标")
	public String sendCords(MyNode <E> a,MyNode <E>b){
		double x = 47*(b.getY()-a.getY())/93;
		double y = 47*(b.getX()-b.getX())/93;
		return Double.toString(x) + ";" + Double.toString(y) + ";" + b.getX().toString(x) + ";" + b.getY().toString(x);
		
	}
}
