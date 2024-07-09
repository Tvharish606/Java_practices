package Java_Pratice;

public class pick_divisible_and_convert_prime {
    public static void main(String[] args) {
        int number = 81;
        int div_count = 0;

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                int prime_check_count = 0;
                for (int k = 1; k <= i; k++)
                {
                    if (i % k == 0)
                    {
                        prime_check_count++;

                    }
                }
                if(prime_check_count==2)
                {
                    System.out.println(i+ "is prime number");
                }

            }
        }

    }
}
