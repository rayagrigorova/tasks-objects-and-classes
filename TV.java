package classes;

public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;
	
	public TV(){
		channel = 0;
		volumeLevel = 1;
		on = false;
	}
	
	public void turnOn(){on = true;}
	public void turnOff(){on = false;}
	
	public void setChannel(int newChannel){
		if(newChannel >= 0 && newChannel <= 120){
			channel = newChannel;
		}
		else{
			System.out.println("Invalid channel");
		}
		return;
	}
	
	public void setVolume(int newVolume){
		if(newVolume >= 1 && newVolume <=7){
			volumeLevel = newVolume;
		}
		else{
			System.out.println("The volume level is invalid");
		}
		return;
	}
	
	public void channelUp(){
		channel = (channel < 120)? channel + 1 : 0;
		return;
	}
	
	public void channelDown(){
		channel = (channel > 0)? channel - 1 : 120;
		return;
	}
	
	public void volumeUp(){ 
		volumeLevel = (volumeLevel < 7 )? volumeLevel + 1 : 7;
		return;
	}
	
	public void volumeDown(){
		volumeLevel = (volumeLevel > 1)? volumeLevel - 1 : 1;
		return;
	}
	
	
}
