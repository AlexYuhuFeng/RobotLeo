//Version 0.2
//released: 07.05.17 6:19PM
//changes: 
//1. changed the authentication elements and reordered accordingly
//2. reduced efficiency
//3. improved Accuracy
//
//
//
public float[] satisfy(ArrayList<Float> chargePoints_x,ArrayList<Float> chargePoints_y) {
	//variable declaration
	double dist;
	double xdist;
	double ydist;
	double k1;
	double m1;
	double kP;
	double mP;
	double k2;
	double m2;
	double ptr;
	double xItc;
	double yItc;

	//error cases | non-capture
	if (chargePoints_x == null){
		return null;
	}

	//normal cases
	//6 points at least are needed to location the dock
	for (int i = 0; i < chargePoints_x.size()-5; i++){
		//adjust accordingly
		for (int j = i+1; i < i+5; j++){
			//locate pt1, pt3, pt4
			//check a
			xdist = Math.abs(chargePoints_x.get[j]-chargePoints_x.get[i]);
			ydist = Math.abs(chargePoints_y.get[j]-chargePoints_y.get[i]);
			dist = Math.sqrt(xdist * xdist + ydist * ydist);
			
			if (dist >= 37 && dist <= 57){
				//construct linear func
				k1 = (chargePoints_y.get(j) - chargePoints_y.get(i)) / (chargePoints_x.get(j) - chargePoints_x.get(i));
				kP = -1/k1;
				//Within the boundary
				ptr = j;
				while (ptr>=i+1){
					mP = chargePoints_y.get[ptr]-chargePoints_x.get[ptr]*kP;
					//define intersections
					xItc1 = (mP - m1) / (k1 - kP);
					yItc1 = xItc1 * kP + mP;
					//getDist
					xdist = Math.abs(chargePoints_x.get[ptr]-xItc1);
					ydist = Math.abs(chargePoints_y.get[ptr]-yItc1);
					dist = Math.sqrt(xdist * xdist + ydist * ydist);
					//if h is true
					if (dist >= 42 && dist <=62){
						
					}
				}
			}



		}
		return null;
}

