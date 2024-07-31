package com.ramya.factorypattern;
public class GetPlanFactory {
	public BillPlans getPlan(String planType)
	{
		if(planType == null)
		{
			return null;
		}
		if(planType.equalsIgnoreCase("DomesticPlans"))
				{
					return new DomesticPlans();
				}
		else if (planType.equalsIgnoreCase("CommercialPlans"))
				{
			return new CommercialPlans();
				}
		else if (planType.equalsIgnoreCase("InstitutionalPlans"))
					{
				return new InstitutionalPlans();
	}
		return null;


}
}

