import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class main {

	private static String xpathExpression;

    public static void nextQuestion(WebDriver driver)
    {
    	WebElement TriviaNextButton = driver.findElement(By.id("nextquest"));
        TriviaNextButton.click();
    }
    public static void nextQuestionS(WebDriver driver)
    {
    	WebElement TriviaNextButton = driver.findElement(By.id("btnnext"));
        TriviaNextButton.click();
    }
    
    public static void nextQuestionToAnswer(WebDriver driver)
    {
    	WebElement TriviaBackButton = driver.findElement(By.id("btnnext"));
        TriviaBackButton.click();
    }
    
    public static void SanityTest(WebDriver driver) throws InterruptedException
    {

		 
		 
		 driver.get("https://svcollegetest.000webhostapp.com/");
		 
		 start = driver.findElement(By.id("startB"));
		 start.click();
	        
	        for(int i = 0 ; i < 3 ; i++)    // building the trivia - inputing the questions and the answers.
	        {
	        	field = driver.findElement(By.name("question"));
	        	field.sendKeys("A?");
	            Thread.sleep(sleepTime);

	            nextButton = driver.findElement(By.id("nextquest"));
	            nextButton.click();

	            field = driver.findElement(By.name("answer1"));
	            field.sendKeys("B");
	            Thread.sleep(sleepTime);

	            field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
	            field.sendKeys("B");
	            Thread.sleep(sleepTime);
	            
	            field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
	            field.sendKeys("B");
	            Thread.sleep(sleepTime);
	            
	            field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
	            field.sendKeys("B");
	            Thread.sleep(sleepTime);

	            radioButton = driver.findElement(By.name("answer"));
	            radioButton.click();
	            Thread.sleep(sleepTime);

	            nextButton = driver.findElement(By.id("nextquest"));
	            nextButton.click();
	            Thread.sleep(sleepTime);
	        }
	        
	      
	        //  start playing the game.
	        
	        play = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
	        play.click();
	        Thread.sleep(sleepTime);
	        
	        //  answer1
	        
	        radioButton = driver.findElement(By.name("answertest2"));
	        radioButton.click();
	        Thread.sleep(sleepTime);

	        nextQuestionS(driver);
	        Thread.sleep(sleepTime);

	        //  answer2
	        
	        radioButton = driver.findElement(By.name("answertest1"));
	        radioButton.click();
	        Thread.sleep(sleepTime);

	        nextQuestionS(driver);

	        Thread.sleep(sleepTime);
	        
	        //  answer3

	        radioButton = driver.findElement(By.name("answertest0"));
	        radioButton.click();
	        Thread.sleep(sleepTime);

	        nextQuestionS(driver);

	        Thread.sleep(sleepTime);

	        driver.close();
    }

    public static void FuctionalityTest (WebDriver driver) throws InterruptedException
    {
    	driver.get("https://svcollegetest.000webhostapp.com/");
		
		start = driver.findElement(By.id("startB"));
		start.click(); 
		
		//  building the trivia
		
		//  question 1
		
		field=driver.findElement(By.name("question"));
		field.sendKeys("who is the current prime minister of Israel"); //bug#1 - a question mark is not automatically added 
		Thread.sleep(sleepTime);
		
		nextButton = driver.findElement(By.id("nextquest"));
		nextButton.click();
        
		field = driver.findElement(By.name("answer1"));
		field.sendKeys("Benjamin Netanyahu");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Ehud Olmert");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Ehud Barak");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Benny Gantz");
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[1]/input"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        

        nextQuestion(driver);
        Thread.sleep(sleepTime);
        
        //  question 2
        
        field = driver.findElement(By.name("question"));
        field.sendKeys("what is the name of the first man on the moon?");
        Thread.sleep(sleepTime);
        
        nextButton = driver.findElement(By.id("nextquest"));
        nextButton.click();
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.name("answer1"));
        field.sendKeys("Neil Armstrong");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Lance Armstrong");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Neil Young");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Buzz Aldrin");
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
     //  click back to insert again question 2
        backButton = driver.findElement(By.id("backquest"));
        backButton.click();
        Thread.sleep(sleepTime);
        
        //  question 2 again
        
        
        nextButton = driver.findElement(By.id("nextquest"));
        nextButton.click();
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.name("answer1"));
        field.sendKeys("Neil Armstrong");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Lance Armstrong");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Neil Young");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Buzz Aldrin");
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestion(driver);

        Thread.sleep(sleepTime);   
        
        
     //  question 3
        
        field = driver.findElement(By.name("question"));
        field.sendKeys("what is the name of the first president of Israel?");
        Thread.sleep(sleepTime);
        
        nextButton = driver.findElement(By.id("nextquest"));
        nextButton.click();
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.name("answer1"));
        field.sendKeys("Haim Wiseman");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Moshe Katsav");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Reuven Rivlin");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Ezer Wiseman");
        Thread.sleep(sleepTime);
        
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestion(driver);

        Thread.sleep(sleepTime);
        
        
        quitButton = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]"));
        quitButton.click();
        Thread.sleep(sleepTime); //bug#2 - the game does not go back 
        
        play = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
        play.click();
        Thread.sleep(sleepTime);
        
        //  start playing the trivia
        
        
        //  round 1  - successful result
        
        
        radioButton = driver.findElement(By.name("answertest2"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        backButton = driver.findElement(By.xpath("//*[@id=\"btnback\"]"));
        backButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        		
        radioButton = driver.findElement(By.name("answertest1"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answertest0"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        
        tryAgain = driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]"));
        tryAgain.click();
        Thread.sleep(sleepTime);
        
        
        
        
      //  round 2  - not successful result
           
          
     //   writing the next round with one wrong answer to show the "failed" option according to the "srs"  
        
        
        radioButton = driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        
        radioButton = driver.findElement(By.name("answertest1"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answertest0"));
        radioButton.click();
        Thread.sleep (sleepTime);
        nextQuestionToAnswer(driver);   // bug#3-there is one incorrect answer and the last page shows "success" not accurate to the "srs" 
        
        tryAgain = driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[1]"));
        tryAgain.click();
        Thread.sleep(sleepTime);
        
        
     //  round 3  - not successful
         
     // writing the next round with all the wrong answers(to show the "failed" option)
        
        radioButton = driver.findElement(By.xpath("//*[@id=\"2\"]/input[2]"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.xpath("//*[@id=\"1\"]/input[3]"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.xpath("//*[@id=\"0\"]/input[4]"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        
        quitButton = driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]"));
        quitButton.click();
    }
    
    
    public static void CompatibilityTest (WebDriver driver1) throws InterruptedException
    {
    	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Owner\\Downloads\\geckodriver-v0.26.0-win64//geckodriver.exe");
 		
 		
 		driver1.get("https://svcollegetest.000webhostapp.com/");
 		Thread.sleep(sleepTime);

 		 start = driver1.findElement(By.id("startB"));
 		 start.click();
 	        
 	        for(int i = 0 ; i < 3 ; i++)    // building the trivia - inputing the questions and the answers.
 	        {
 	        	field = driver1.findElement(By.name("question"));
 	        	field.sendKeys("A?");
 	            Thread.sleep(sleepTime);

 	            nextButton = driver1.findElement(By.id("nextquest"));
 	            nextButton.click();

 	            field = driver1.findElement(By.name("answer1"));
 	            field.sendKeys("B");
 	            Thread.sleep(sleepTime);

 	            field = driver1.findElement(By.xpath("(//input[@name='answer1'])[2]"));
 	            field.sendKeys("B");
 	            Thread.sleep(sleepTime);
 	            
 	            field = driver1.findElement(By.xpath("(//input[@name='answer1'])[3]"));
 	            field.sendKeys("B");
 	            Thread.sleep(sleepTime);
 	            
 	            field = driver1.findElement(By.xpath("(//input[@name='answer1'])[4]"));
 	            field.sendKeys("B");
 	            Thread.sleep(sleepTime);

 	            radioButton = driver1.findElement(By.name("answer"));
 	            radioButton.click();
 	            Thread.sleep(sleepTime);

 	            nextButton = driver1.findElement(By.id("nextquest"));
 	            nextButton.click();
 	            Thread.sleep(sleepTime);
 	        }
 	        
 	      
 	        // ------ start play the game.
 	        
 	        play = driver1.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
 	        play.click();
 	        Thread.sleep(sleepTime);
 	        
 	        // --- answer1
 	        
 	        radioButton = driver1.findElement(By.name("answertest2"));
 	        radioButton.click();
 	        Thread.sleep(sleepTime);

 	        nextQuestionS(driver1);
 	        Thread.sleep(sleepTime);

 	        // --- answer2
 	        
 	        radioButton = driver1.findElement(By.name("answertest1"));
 	        radioButton.click();
 	        Thread.sleep(sleepTime);

 	        nextQuestionS(driver1);

 	        Thread.sleep(sleepTime);
 	        
 	        // --- answer3

 	        radioButton = driver1.findElement(By.name("answertest0"));
 	        radioButton.click();
 	        Thread.sleep(sleepTime);

 	        nextQuestionS(driver1);

 	        Thread.sleep(sleepTime);
 	        
 	        driver1.close();
    }
    public static void IntegrationTest (WebDriver driver) throws InterruptedException
    {

        //  question 1
        
        driver.get("https://svcollegetest.000webhostapp.com/");
        
        tryAgain = driver.findElement(By.id("startB"));
        tryAgain.click(); 
        
        field=driver.findElement(By.name("question"));
        field.sendKeys("who is the current prime minister of Israel"); 
		
		WebElement TriviaNextButtonI = driver.findElement(By.id("nextquest"));
        TriviaNextButtonI.click();
        
        field = driver.findElement(By.name("answer1"));
        field.sendKeys("Benjamin Netanyahu");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Ehud Olmert");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Ehud Barak");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Benny Gantz");
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestion(driver);
        Thread.sleep(sleepTime);
        
        //  question 2
        
        field = driver.findElement(By.name("question"));
        field.sendKeys("what is the name of the first man on the moon?");
        Thread.sleep(sleepTime);
        
        tryAgain = driver.findElement(By.id("nextquest"));
        tryAgain.click();
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.name("answer1"));
        field.sendKeys("Neil Armstrong");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Lance Armstrong");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Neil Young");
        Thread.sleep(sleepTime);

        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Buzz Aldrin");
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestion(driver);
        Thread.sleep(sleepTime);
        
        //  question 3
        
        field = driver.findElement(By.name("question"));
        field.sendKeys("what is the name of the first president of Israel?");
        Thread.sleep(sleepTime);
        
        nextButton = driver.findElement(By.id("nextquest"));
        nextButton.click();
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.name("answer1"));
        field.sendKeys("Haim Wiseman");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[2]"));
        field.sendKeys("Moshe Katsav");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[3]"));
        field.sendKeys("Reuven Rivlin");
        Thread.sleep(sleepTime);
        
        field = driver.findElement(By.xpath("(//input[@name='answer1'])[4]"));
        field.sendKeys("Ezer Wiseman");
        Thread.sleep(sleepTime);
        
        
        radioButton = driver.findElement(By.name("answer"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestion(driver);

        Thread.sleep(sleepTime);
        
        // playing the trivia
        
        play = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
        play.click();
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answertest2"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
       
        radioButton = driver.findElement(By.name("answertest1"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextQuestionToAnswer(driver);
        Thread.sleep(sleepTime);
        
        radioButton = driver.findElement(By.name("answertest0"));
        radioButton.click();
        Thread.sleep(sleepTime);
        
        nextButton = driver.findElement(By.xpath("//*[@id=\"btnnext\"]"));
        nextButton.click();
        Thread.sleep(sleepTime);
      
        
        ShareOnFacebook = driver.findElement(By.xpath("//*[@id=\"fackBook2\"]/img"));
        ShareOnFacebook.click();
        Thread.sleep(sleepTime);
        
        
		driver.switchTo().alert().accept(); // bug#4- does not share the results with facebook an error message appear 
		Thread.sleep(sleepTime);
		 driver.close();
		
		
    }
    
    
	public static WebElement radioButton;
	public static WebElement nextButton;
	public static WebElement quitButton;
	public static  WebElement backButton;
	public static  WebElement tryAgain;
	public static  WebElement field;
	public static  WebElement start;
	public static  WebElement play;
	public static  WebElement ShareOnFacebook;
	
	public static int sleepTime = 1500;    // the speed of the test - time of the brakes.
	
	
	public static void main(String[] args) throws InterruptedException {

		 // -----------------
		//  Sanity test
	   // ------------------ 
		
		WebDriver driver = new ChromeDriver();
		
		SanityTest(driver);
		
		Thread.sleep(sleepTime);
		
	   // ------------------
	  //  functionality test
	 // ------------------
		
		driver = new ChromeDriver();
		
		FuctionalityTest (driver);
		
        Thread.sleep(sleepTime);
        
         // ------------------
        // integration test------repeating the building&playing the game part once again to share the results on facebook  
       // ------------------
        
        IntegrationTest (driver);
		
        Thread.sleep(sleepTime);
        
         // ------------------
        // compatibility test
       // ------------------
		
		
		
        FirefoxDriver driver1 = new FirefoxDriver();
        
        CompatibilityTest (driver1);
        
        Thread.sleep(sleepTime);
		 
		 
		
    
       
	}

}
