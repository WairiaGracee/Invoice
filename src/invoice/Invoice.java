package invoice;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				System.out.println("*************************Adamson Computers Ltd******************************************");
				System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
				System.out.println("                 VAT REG. TIN 098-765-4321-0000");
				System.out.println("                         SALES INVOICE");
				System.out.println("");
				System.out.println("");
				System.out.println("");
				String soldTo="C026-01-0959/2022";
				String date="28/04/2020";
				System.out.print("Sold to:"+soldTo);                      System.out.println("\t \t \t \t Date:"+date);
				String address="Wairia GraceJane Wanjiku";
				String contact="0100100100";
				System.out.print("Address:"+address);
				System.out.println("\t\t\t\t\t Contact Number:"+contact);
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("========================================================================================");
				int qty1=4;
				int qty2=10;
				int qty3=9;
				int qty4=10;
				String item1="Pencil";
				String item2="Duster";
				String item3="Pens";
				String item4="crayon";
				int unit1=20;
				int unit2=50;
				int unit3=30;
				int unit4=80;
				double amount1=(double)qty1*unit1;
				double amount2=(double)qty2*unit2;
				double amount3=(double)qty3*unit3;
				double amount4=(double)qty4*unit4;
				System.out.println("Qty             |      Item Description          |  Unit Price          |Amount");
				System.out.println("=========================================================================================");
				System.out.print(""+qty1);
				System.out.print("\t\t|\t"+item1);
				System.out.print("\t\t\t |\t"+unit1);
				System.out.printf("\t\t|\t%.2f\n",amount1);
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print(""+qty2);
				System.out.print("\t\t|\t"+item2);
				System.out.print("\t\t\t |\t"+unit2);
				System.out.printf("\t\t|\t%.2f\n",amount2);
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print(""+qty3);
				System.out.print("\t\t|\t"+item3);
				System.out.print("\t\t\t |\t"+unit3);
				System.out.printf("\t\t|\t%.2f\n",amount3);
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.print(""+qty4);
				System.out.print("\t\t|\t"+item4);
				System.out.print("\t\t\t |\t"+unit4);
				System.out.printf("\t\t|\t%.2f\n",amount4);
				System.out.println("==========================================================================================");
				double total=amount1+amount2+amount3+amount4;
				double vat=(16*total)/100;
				double overall=total+vat;
				System.out.printf("                                                   |Sub Total           |%.2f\n",total);
				System.out.println("                                                   =======================================");
				System.out.println("                                                   |VAT(16%)            |"+String.format("%.2f", vat));
				System.out.println("                                                   =======================================");
				System.out.printf("                                                   |Total Amount        |%.2f\n",overall);
				System.out.println("                                                   =======================================");





						

					}

				}

	
