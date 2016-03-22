package zad1;

import java.util.Map;

public class MemLeak {
	
	public final String key;
	
	public MemLeak(String key){
		this.key = key;
	}
	
	public static void main(String[] args){
		try{
			Map<Object, Object> map = System.getProperties();
			

			
			for(int i = 0; i < 100; i++){
				
				map.put(new MemLeak("key"), "value");
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}