
public class CouponNumber {

	public static void main(String[] args) {
		/*
         * initiating char and int variable
         */
        char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max=100000000;
        /*
         * using random operation till max value
         */
        int random=(int) (Math.random()*max);
        /*
         * modifiable string object is created
         */
        StringBuffer sb=new StringBuffer();

        
        /*
         * using loop to print multiple output
         */
        while (random>0)
        {
        	/*
        	 * append is used to concatenate the random with char.length
        	 */
            sb.append(chars[random % chars.length]);
            /*
             *  '/' is  is used to escape a special character after this sign in a string
             */
            random /= chars.length;
        }
        
        String couponCode=sb.toString();
        System.out.println("Coupon Code: "+couponCode);
	}

}
