import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

public class ShoppingTester {

	public static void main(String[] args) {
		//  Auto-generated method stub
		
//		Shopper stacy = new Shopper("Stacy");
//		
//		ShopperHelper sh = new ShopperHelper();
//		
//		sh.InsertShopper(stacy);
//		
//		ListDetailsHelper ldh = new ListDetailsHelper();
//		ListDetails stacyList = new ListDetails("Stacy's List", LocalDate.now(), stacy);
//		
//		ldh.insertNewListDetails(stacyList);
//		
//		List<ListDetails> allLists = ldh.getLists();
//		
//		for(ListDetails a: allLists) {
//			System.out.println(a.toString());
//		}

		
		Shopper eevee = new Shopper("Eevee");
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem shampoo = new ListItem("Target","Shampoo");
		ListItem brush = new ListItem("Target", "Brush");
		
		List<ListItem> eeveesItems = new ArrayList<ListItem>();
		eeveesItems.add(shampoo);
		eeveesItems.add(brush);
		
		ListDetails eeveesList = new ListDetails("Eevee's ShoppingList", LocalDate.now(), eevee);
		eeveesList.setListOfItems(eeveesItems);
		
		ldh.insertNewListDetails(eeveesList);
		
		List<ListDetails> allLists = ldh.getLists();
		for(ListDetails a: allLists) {
			System.out.println(a.toString());
		}
	}
}
