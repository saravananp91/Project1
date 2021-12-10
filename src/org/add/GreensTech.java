package org.add;

public class GreensTech {
	private void greensOmr(String compName) {
		System.out.println("Company Name:"+compName);
	}
	private void greensOmr(int plotNo,String address) {
		System.out.println("Company Address:\nNO."+plotNo+"\n"+address);
	}
	private void greensOmr(String add ,int pinCode) {
		System.out.println(""+add+"\nPin Code:"+pinCode);
	}
	private void greensOmr(long phoneNo,String mailId,String webSite) {
		System.out.println("Phone No:"+phoneNo+"\nMail:"+mailId+"\nWebsite:"+webSite);
		
	}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensOmr("Greens Tech");
		g.greensOmr(19, "OMR,");
		g.greensOmr("Chennai.", 600112);
		g.greensOmr(8939915577l, "contact@greenstechnologies.com","www.greenstech.com");
	}
	
	

}
