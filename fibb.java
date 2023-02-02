//fibb.java
// class fibb{

// public static void main(String args[]){

// int n1=0,n2=1,n3,count=20;    
// System.out.println(n1+ "" +n2);

// for(int i =2;i<count;i++){

// n3=n1+n2;

// System.out.println(" "+n3);
// n1 = n2;
// n2 = n3;


// }
// }




//}





//prime numbers with 20 numbers

// class fibb{
// static void check(int n){
//     int flag = 0;
//     for(int i = 1;i<n;i++){

//         if(n%i==0){
//             break;

//         }
//         flag=1;

//     }
//     if(flag==1){
//         System.out.println(n);
//     }
// }

// public static void main(String args[]){

// for(int i=1;i<=20;i++){

//     check(i);

// }

// }

// }

class fibb{


public static void main(String args[]){
int num=60,count;
for(int i=1;i<=num;i++){
    count = 0;
    for(int j=2;j<=i/2;j++){
        
        if(i%j==0){
            count++;
            break;
        }
        
    }
    if(count==0){
        System.out.println(i);
    }

}

}

}
//update code with armstrong

// class fibb{


// public static void main(String args[]){
//  int i = 20;
//         int i1 = i;
//         int rm=0;
//         int sm=0 ;  int len = 0;
//         while( i1> 0 )
//         {
//             i1=i1/10;
//             len++;
//         }
//         System.out.println(len);

//         i1=i;
//         while(i1>0)
//         {
//             rm=i1%10;
//             sm+= (Math.pow(rm,len));
//             i1=i1/10;
//         }

//         if(sm==i)
//         {
//             System.out.println("Armstrong");
//         }
//         else
//         {
//             System.out.println("NOT Armstrong");
//         }
// }

// }