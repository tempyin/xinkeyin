package DayLianXi1;

import java.util.Scanner;

public class LianXi1 {
	
	public static void main(String[] args){
		 
		Scanner  s  =new Scanner(System.in);
		System.out.println("输入年份");
		int a  = s.nextInt();
		if(a>0&& a<1){
			System.out.println("新员工");
		}else if( a>1 &&a<5 ){
			System.out.println("普通员工");
		}else if( a>5&& a<10){
			System.out.println("老员工");
		}else if( a>10&& a<15){
			System.out.println("资深员工");
		}else if(a>=15){
			System.out.println("功勋员工");
		}else {
			System.out.println("不是该公司员工");
		}
	}
}

