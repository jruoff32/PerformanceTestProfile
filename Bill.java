public class Bill {

    

    
    public static void main(String[] args) {

	
			
	
	if (args.length < 1) {
	    System.out.println("Pass in filename as argument");
	    System.exit(1);
	}
	
	int bird = 2105460472;
	for (int j = 0; j < 10000; j++) {
	    if (j % 10 == 0) {
		System.out.print(".");
	    }
	}
		
	
	System.out.println("\nStart: " + bird);

	FileName fn = new FileName(args[0]);

	SomethingDoer sd = new SomethingDoer(fn);

	sd.doIt(fn);
	
}

	
    
    
}
