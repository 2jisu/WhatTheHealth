package com.wthealth.service.exinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculation/*")
public class CalculationRestController {
	
	//Field	
	public CalculationRestController() {
		System.out.println(this.getClass());
	}
	

	
/*	@RequestMapping(value = "getSearchFood", method=RequestMethod.GET)
	public List<Food> getSearchFood(@RequestParam String searchKeyword) throws Exception{
		
		List<String> temp = new ArrayList<String>();
        
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("https://www.myfitnesspal.com/ko/food/calorie-chart-nutrition-facts");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("search"));
   
        // Enter something to search for
        element.sendKeys("찐감자");
        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        ///////////////////////////////////////////////////////////////////////////
      
       
        //List<WebElement> getFoodName = driver.findElements(By.xpath("//*[@id=\"new_food_list\"]"));
        List<WebElement> getFoodName = driver.findElements(By.cssSelector(".food_search_results > li"));
        
        //foodName을 담을 List 생성
        List<String> foodName = new ArrayList<String>();
        //foodCalorie를 담을 List 생성
        List<String> calorie = new ArrayList<String>();
        //foodPiece를 담을 List 생성
        List<String> foodPiece = new ArrayList<String>();
        
        
        for(WebElement food:getFoodName) {
           
           String[] tempName = food.getText().split("\n");
  
           //foodName List add
           foodName.add(tempName[0].replaceAll(" ", ""));
           
           //foodPiece List add(ex..1인분)
           String[] tempCalorie = tempName[1].substring(6).split(",");
           foodPiece.add(tempCalorie[0].replaceAll(" ", ""));
           
           String tempKcal = tempCalorie[1].substring(7);
           calorie.add(tempKcal.replaceAll(" ", ""));
        }
        System.out.println(foodName.get(5));
        System.out.println(foodPiece.get(5));
        System.out.println(calorie.get(5));
        

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
        
       Map<String, Object> foodInfo = new HashMap<String, Object>();
       foodInfo.put("foodName", foodName);
       foodInfo.put("calorie", calorie);
       foodInfo.put("foodPiece", foodPiece);
		
		
		return null; 
	}*/

	
	
}
