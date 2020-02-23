public class CostEstimation
{
	public double houseConstructionCost(String materialStandard, double areaOfHouse, boolean fullyAutomated)
	{
		double totalCost;
		if(materialStandard.equals("standard")){
			totalCost = 1200 * areaOfHouse;
		}	
		else if(materialStandard.equals("abovestandard")){
			totalCost = 1500 * areaOfHouse;
		}
		else
		{
			if(fullyAutomated && materialStandard.equals("highstandard")){
				totalCost = 2500 * areaOfHouse;
			}
			else
				totalCost = 1800 * areaOfHouse;
		}
		return totalCost;
	}
}