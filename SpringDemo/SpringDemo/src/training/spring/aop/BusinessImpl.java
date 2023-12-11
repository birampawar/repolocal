package training.spring.aop;

public class BusinessImpl implements Business {
	 
    public void doBusiness(){ // throws Exception {
            System.out.println("I do what I do best, i.e sleep.");
            try {
                    Thread.sleep(2000);
            } catch (InterruptedException e) {
                    System.out.println("How dare you to wake me up?");
            }
            System.out.println("Done with sleeping.");
            //throw new Exception("My own exception");
            
    }

}