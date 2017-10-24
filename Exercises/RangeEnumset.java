package Exercises;

import java.util.EnumSet;

public class RangeEnumset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(RangeClass name:RangeClass.values())
     {
    	 System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", name,name.getDesignation(),name.getAge(),name.getGender(),name.getOrganisation(),name.getState(),name.getCountry());
     }
     
     System.out.println("\n_________________RangeOfValues_________________\n");
     
     for(RangeClass name:EnumSet.range(RangeClass.C, RangeClass.E))  //to get the particular range of enum values between A to E
     {
    	 System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n", name,name.getDesignation(),name.getAge(),name.getGender(),name.getOrganisation(),name.getState(),name.getCountry());
     }
	}

}
 