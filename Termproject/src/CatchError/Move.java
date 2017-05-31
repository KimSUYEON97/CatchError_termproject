package CatchError;

import java.util.*;

public class Move {
	public static void main(String[] args){
		int[] axis_x = new int[15];
		int[] axis_y = new int[15];
		
		double random=Math.random();
		int value= (int)(random*10)+1;
		
		char [][] plate = new char[42][32];
		int width=42;
		int height=32;
		int num=0;
		while(num<value){
			int loop=0;
			while(loop<15){
				
				double random_x=Math.random();
				int x= ((int)(random_x*100)+1)/3;
				
				double random_y=Math.random();
				int y= ((int)(random_y*100)+1)/3;
				if (x>=width||y>=height){
					loop--;
				}else{
					axis_x[loop]=x;
					axis_y[loop]=y;
					plate[y][x]='бс';
				}
				loop++;
			}
			loop=0;
			
			while(loop<9){
				for(int i=0;i<width;i++){
					for(int j=0;j<height;j++){
						System.out.print(plate[i][j]);
						if(plate[i][j]!=0){
							plate[i][j]='бр';
						}
					}
					System.out.println();
				}
				System.out.println("---------------------");
				if(loop%4==1){//▒т║╗ move1   
					for(int i=0;i<15;i++){
						axis_x[i]++;
						axis_y[i]++;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}else if(loop%4==2){
					for(int i=0;i<15;i++){
						axis_x[i]++;
						axis_y[i]--;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}else if(loop%4==3){
					for(int i=0;i<15;i++){
						axis_y[i]++;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}else if(loop%4==0){
					for(int i=0;i<15;i++){
						axis_x[i]--;
						axis_y[i]--;
						plate[axis_x[i]][axis_y[i]]='бс';
					}
				}
				
				loop++;
			}
			num++;
		}

	}
}
