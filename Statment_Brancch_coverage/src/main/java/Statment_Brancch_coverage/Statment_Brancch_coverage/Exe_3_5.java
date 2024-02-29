package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class Exe_3_5 {
	

	public static boolean checkOut (double cart,int craditRaiting, statusClass.status status) {
		boolean approved = false;
		if (status == statusClass.status.gold) {
			if (cart < 3_500.00) {
				approved = true;
			}
			else {
				if(craditRaiting > 650) {
					approved = true;
				}
			}
		}
		else {
			if (status == statusClass.status.silver) {
				if (cart < 2_500.00) {
					approved = true;
				}
				else {
					if (craditRaiting > 750) {
						approved = true;
					}
				}
			}
			else {
				if (cart < 1_500.00) {
					approved = true;
				}
				else {
					if (craditRaiting > 800){
						approved = true;
					}
				}
			}
		}
			return approved;
	}

}
