package ai.developer.code.closestToZero;

import java.math.*;

class Solution {

	static double closestToZero(double[] ts) {
		// https://files.codingame.com/pub/temps.html
		if (ts.length == 0) return 0;

		double closest = ts[0];
		for (double i : ts) {
			double abs = Math.abs(i);
			double absClosest = Math.abs(closest);
			if (abs < absClosest) {
				closest = i;
			} else if (abs == absClosest && closest < 0) {
				closest = i;
			}
		}
		return closest;
	}
}