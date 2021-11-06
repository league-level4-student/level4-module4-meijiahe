package _04_hospital;

public class VideoGameRunner {

	enum Nums{

	    

	    ZERO(0), ONE(1), TWO(2), THREE(3);

	    

	    int num;

	    

	    private Nums(int num) {

	        this.num = num;

	    }

	    

	    public int getNum() {

	        return num;

	    }



	}



	

	    public static void main(String[] args) {

	        Nums num = Nums.TWO;

	        

	        System.out.println(num.getNum());

	    }

	}
