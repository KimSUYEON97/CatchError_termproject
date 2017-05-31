package CatchError;

import java.util.*;

public class cafain {
	private int life;
	private int buffer;
	private int buffer_limit;
	
	public void cafain(){
		life=100;
		buffer=0;
		buffer_limit=25;
	}
	
	public void lifeindecrease(int x){
		if(life<100&&life>0){
			if (x==1){//x==1 일때 버그와 부딪힌것
				life--;
			}else if (x==0){//x==0 버그를 잡았을때
				life++;
			}
		}else if (life ==0){
			System.out.println("GameOver");
		}
	}
	
	public int buffupdown(int x){
		if(x==1&&buffer<buffer_limit){
			buffer++;
		}else{
			buffer--;
		}
		if (buffer==buffer_limit){
			return 1;
		}else{
			return 0;
		}
	}
}
