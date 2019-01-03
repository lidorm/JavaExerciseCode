package test;
public class Level {
	
	interface OnChangeInterface
	{
		void runChange();
	}
	
	char[][] data;
	OnChangeInterface onChange = null;
	
	public Level(char[][] data) {
		this.data=data;
	}

	public void changeData(int row,int col,char c){
		data[row][col]=c;
		
		if(onChange != null)
			onChange.runChange();
	}
}
