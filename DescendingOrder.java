import java.util.*;

class Q19
{
		public static void main(String arp[])
		{
					int n,i,j,t;
					Scanner sc = new Scanner(System.in);
					System.out.println("enter n");
					n = sc.nextInt();
				
					int x[] = new int[n];
					
					System.out.println("enter elements");
					for(i=0;i<n;i++)
					{
							x[i] = sc.nextInt();
					}

					System.out.println("Display before descending sort");
					
					for(int p:x)
					{
							System.out.print(p+ "    ");
					}

					System.out.println();
					for(i=0;i<=n-2;i++)
					{
							for(j=i+1;j<=n-1;j++)
							{
									if(x[i]<x[j])
									{
											t = x[i];
											x[i]  =x[j];
											x[j] = t;
									}
							}
					}
					System.out.println("Display After descending sort");
					
					for(int p:x)
					{
							System.out.print(p+ "    ");
					}

		}
}
