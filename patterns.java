class patterns
{
	public static void main(String[] args) 
	{
//        // Number pattern 

// 	int row=5;
// 	for(int i=1;i<=row;i++){
// 		for(int j=i;j<=row;j++){               //p==5
// 			System.out.print(j+" ");
// 		}
// 		System.out.println();
//     }

// int  row=5;
// for(int i=1;i<=row;i++){
// 	for(int j=1;j<=row;j++){          // p==2
// 		System.out.print(i+" ");
// 	}
// 	System.out.println();
// }

// int  row=5;
// for(int i=1;i<=row;i++){

// 	for(int j=1;j<=row;j++){            //p==1
// 		System.out.print(j+" ");
// 	}
// 	System.out.println();
// }

// int row=5;
// for(int i=1;i<=row;i++){
// 	for(int j=1;j<i;j++){
// 	System.out.print(1+" ");      //p==3

// 	}
// 	System.out.println();
// }

// int row=5;
// for(int i=1;i<=row;i++){
// 	for(int j=1;j<=row;j++){
// 		if(i%2==0)
// 		System.out.print(0+" ");    //p==4
// 		else
// 		System.out.print(1+" ");
// 	}
// 	System.out.println();
// }

// int row=5;
// for(int i=1;i<=row;i++){
// 	for(int j=5;j>=i;j--){
// 		System.out.print(i+" ");    //p==6
// 	}
// 	System.out.println();
// }


// int row=6;
// char alphabet='A';
// for(int i=1;i<=row;i++){            //p==8
// 	for(int j=1;j<i;j++){
// 		System.out.print((char)alphabet+" ");
// 		++alphabet;
// 	}
// 	System.out.println();
// }

// int row=5;
// for(int i=row;i>=1;i--){
// 	for(int j=i;j>=1;j--){
// 		System.out.print(j+" ");     //p==9
// 	}
// 	System.out.println();
// }

// int row=5;
// for(int i=row;i>=1;i--){
// 	for(int j=i;j>=1;j--){
// 		if(j%2==0)
// 		System.out.print(0+" ");    //p===7
// 		else
// 		System.out.print(1+" ");
// 	}
// 	System.out.println();
// }
// }

 
// int rows=5,num=0;
// for (int i = 1; i <= rows; i++) {
// 	num=num+i;
// 	for(int j=1;j<=rows;j++){
// 		System.out.print(num%2+" ");
// 		num++;
// 	}
// 	num=0;
// System.out.println();
// }

// int row=5;
// char alpha='A';
// for(int i=0;i<=row;i++){
// 	for(int j=row;j>i;j--){
// 		System.out.print(" ");
// 	}
// 	for(int j=0;j<2*i-1;j++){
// 		System.out.print((char)(alpha+j));   //p===12
		
// 	}
// 	System.out.println();
// }
// int row=5;
// int col=9;
// for(int i=row;i>=0;i--){
// 	for(int j=col;j>=i;j--){
// 		System.out.print(" "); //p===13
// 	}
// 	for(int j=1;j<=2*i-1;j++){
// 		if(j%2==0)
// 		System.out.print(0);
// 		else
// 		System.out.print(1);
		
// 	}
// 	System.out.println();
// }

// int row=4;
// int col=7;
// for(int i=row;i>1;i--){
// 	for(int j=col;j>=i;j--){
// 		System.out.print(" ");   //p===14
// 	}
// 	for(int j=1;j<=2*i-1;j++){
// 		if(i%2==1)
// 		System.out.print(0);
// 		else
// 		System.out.print(1);
// 	}
// 	System.out.println();
// }
// for(int i=1;i<=row;i++){
// 	for(int j=col;j>=i;j--){
// 		System.out.print(" ");
// 	}
// 	for(int j=1;j<=2*i-1;j++){
// 		if(i%2==1)
// 		System.out.print(0);
// 		else
// 		System.out.print(1);
// 	}
// 	System.out.println();
// }


// //alpabetical pattern

// int row=3;
// char alpha='a';
// for(int i=0;i<=row;i++){
// 	for(int j=row;j>=i;j--){
// 		System.out.print(" ");   //p==15
// 	}
// 	for(int j=0;j<i;j++){
// 		System.out.print((char)(alpha+j));
// 	}
// 	for(int j=i;j>=0;j--){

// 		System.out.print((char)(alpha+j));
// 	}
// 	System.out.println();
// }
// for(int i=2;i>=0;i--){
// 	for(int j=row;j>=i;j--){
// 		System.out.print(" ");
// 	}
// 	for(int j=0;j<i;j++){
// 		System.out.print((char)(alpha+j));
// 	}
// 	for(int j=i;j>=0;j--){

// 		System.out.print((char)(alpha+j));
// 	}
// 	System.out.println();
// }

//  int row=5;
//  int num=0;

// for(int i=1;i<=row;i++){
// 	 num=num+i;
// 	for(int j=1;j<=i;j++){
// 		System.out.print(num+" ");         //p==11
// 		num= num+row-j;

// 	} 
// 	num=0;
// 	System.out.println();
// }
  
//   int product=1;         //1
//   int a=1;

//   while(a<=5){
// 	product*=a;
// 	a++;
//   }
//   System.out.println(product);

// int sum=0;           //2
// int a=0;
// while(a<=100){
// 	if(a%4==0 && a%8==0)
// 	sum+=a;
// 	a++;
// }
// System.out.println("Sum of numbers divisible by 4 and 8 is: "+sum);

// int sum=0;              //3
// int i=65;
// while(i<=70){
// 	sum+=i;
// 	i++;
// }
// System.out.println("Sum of first five character is :"+sum);

// int product = 1;
// int i=1;
// while(i<=100){
// 	if(i%3==0 && i%7==0){
// 		product*=i;
// 	}
// 	i++;
// }
// System.out.println("Product of numbers from 0 to 100 divisible by 3 and 7:"+product);

// int sum=0;        //p=8
// int n=0;
// while(n<=150){
// 	if(n%2==0)
// 	sum+=n;
// 	n++;
// }
// System.out.println("sum of event even numbers up to 150:"+sum);
	
// int num=456;
// int sum=0;
// int remain=0;                       //p=9
// while(num>0){
// 	remain=num%10;
// 	num=num/10;
// 	sum=sum+remain;
	
//  }
//  System.out.println("Sum of each digit is: "+sum);

// int num=456;
// int product=1;
// int remain=0;                       //p=10
// while(num>0){
// 	remain=num%10;
// 	num /=10;
// 	product*=remain;
// }
// System.out.println("Product of each digit of number is: "+product);


// int alpha=105;
// for(int i=1;i<=5;i++){
// 	System.out.print((char)alpha+" ");
// 	alpha--;
// }    

//  char ch='A';                  //p===7
//  for( ch ='A'; ch<='E'; ch++){
//  	System.out.println(ch+"="+(int)ch);
//  }

// //blank triangel,square,diamond pattern

// int count=0;
// for(int i=65;i<=97;i++){
// 	if(i==65 || i==69 || i==73 || i==79 || i==85)
// 	count++;
// }
// System.out.println("Vowels are :"+count);
	

int row=5;
for(int i=1;i<row;i++){
	for(int j=5;j>i;j--){
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++){
		if(j==1 || j==2*i-1)
		System.out.print("*");
		else
		System.out.print(" ");
	}System.out.println();

}
for(int i=4;i>=1;i--){
for(int j=5;j>i;j--){
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++){
		if(j==1 || j==2*i-1)
		System.out.print("*");
		else
		System.out.print(" ");
	}
	System.out.println();
}
}
}