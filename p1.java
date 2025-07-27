
 class p1{
 	public static void main(String[]args){
		int row=9;
		  for(int i=1;i<=row;i++){
			for(int j=i;j<row;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");   //p==1
			}
			System.out.println();
		}
    }
 }
/*
//hollow diamond
int n=7;
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(j<n-i)
        System.out.print("*");
        else
        System.out.print(" ");
    }
    for(int j=0;j<n;j++){
        if(j<i)
        System.out.print(" ");         // p===2
        else
        System.out.print("*");
    }
System.out.println();
}
for(int k=1;k<=n;k++){
    for(int j=0;j<n;j++){
        if(j<k)
        System.out.print("*");
        else
        System.out.print(" ");
    }
    for(int j=0;j<n;j++){
        if(j<n-k)
        System.out.print(" ");
        else
        System.out.print("*");
    }
    System.out.println();

  }
    }
 }
//Java Program to Print the Hollow Diamond Star Pattern
int row=11;
for(int i=1;i<=row;i++){
    for(int j=1;j<=row;j++){
        if(i+j==7 || i-j==5 || j-i==5 || j+i==17 )
        System.out.print("* ");                      //p==3
        else
        System.out.print(" ");
    }
    System.out.println();
}
 
// triangle
int row =7;
for(int i=2; i<row;i++){
    for(int j=1; j<i;j++){
        System.out.print("* ");         //p==4
    }
    System.out.println();
}
for(int i=row; i>=1;i--){
    for(int j=1; j<i;j++){
        System.out.print("* ");
    }
    System.out.println();
}
    
 //intersect of two hollow triangle(infinity)
int row=5;
for(int i=row;i>=1;i--){
    for(int j=row;j>i;j--){

        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        if(j==1 || j==2*i-1 || (i==5 && j%2==1))     //p==5
       System.out.print("*");
       else 
       System.out.print(" ");

    }
    System.out.println();
}
for(int i=2;i<=row;i++){
    for(int j=row;j>i;j--){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-0;j++){
        if(j==1 || j==2*i-1 || (i==5 && j%2==1))
        System.out.print("*");
        else
        System.out.print(" ");
    }
    System.out.println();
}
    
 int row=7;
 for(int i=1;i<=row;i++){
    for(int j=1;j<=i;j++){
        if(j==1 || i==j || (i==7 && j%2==1))  //p==6
        System.out.print("*");
        else
        System.out.print(" ");
    }
    
    System.out.println();
 }

//hollow square
int row=7;
for(int i=1;i<=row;i++){
    for(int j=1;j<=row;j++){
        if((i==1 && j%2==1) || j==1  || j==7 || (i==7 && j%2==1))  //p==7
        System.out.print("*");
        else
        System.out.print(" ");
    }
    System.out.println();
}

int row=7;
for(int i=0;i<row;i++){
    for(int j=0;j<row;j++){
        if(j<row-i)
        System.out.print("*");
        else
        System.out.print(" ");
    }                                 //p==8
    for(int j=0;j<row;j++){
        if(j<i)
        System.out.print(" ");
        else
        System.out.print("*");
    }
    System.out.println();  
}
for(int i=1;i<=row;i++){
    for(int j=0;j<row;j++){
        if(j<i)
        System.out.print("*");
        else
        System.out.print(" ");
    }
    for(int j=0;j<row;j++){
        if(j<row-i)
        System.out.print(" ");
        else
        System.out.print("*");
}

    System.out.println();
}
     

 int row=11;
 for(int i=1;i<=row;i++){
	for(int j=1;j<=row;j++){
		if(i==j || (i==6 && j%2==1) || j==6 || (i==1 && j%2==1) || j==1 ||(i==11 && j%2==1) || j==11 || 12-i==j)
		System.out.print("* "); 		
		else
 		System.out.print(" ");
 	}                             //p==9
 	System.out.println();
 }


 class p1
 {
 public static String concation(){
	 int num=65;
	 String val="";
	 for(int i=1;i<=5;i++){
		 val=val+(char)num+"";
		 num++;                         //p==10
		 
	 }
	 return val;
 }
 public static void main(String[]args){
	 String msg=concation();
	 System.out.println(msg);
 }
 }

 //puzzle

class p1 {

    public static void main(String[] args) {
        int roomNumber = 1607;
        calculateFloorAndRoom(roomNumber);
    }

    public static void calculateFloorAndRoom(int roomNumber) {
        if (roomNumber <= 0) {
            System.out.println("Invalid room number");
            
        }
                                                       //p==11
        int floor = 0;
        int roomsOnFloor;

        while (roomNumber>=0) {
            if (floor % 2 == 0) {
                // Even floor has 10 rooms
                roomsOnFloor = 10;
            } else {
                // Odd floor has 5 rooms
                roomsOnFloor = 5;
            }

            if (roomNumber <= roomsOnFloor) {
                System.out.println("Room is on Floor " + (floor + 1));
                break;
            }
            roomNumber -= roomsOnFloor;
            floor++;
        }
    }
}
*/

