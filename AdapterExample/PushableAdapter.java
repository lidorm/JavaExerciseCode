package test;

import test.Moveable.Direction;

public class PushableAdapter implements Pushable {

	Moveable m_move;
	public PushableAdapter(Moveable a_move)
	{
		m_move = a_move;
	}
	
	public void push(int heading) {
		if(heading < 0 || heading > 359)
		{
			return;
		}
		
		if(heading >= 45 && heading <= 134)
		{
			m_move.moveMe(Direction.right);
			return;
		}
		
		if(heading >= 135 && heading <= 224)
		{
			m_move.moveMe(Direction.down);
			return;
		}
		
		if(heading >= 225 && heading <= 314)
		{
			m_move.moveMe(Direction.left);
			return;
		}
		
		m_move.moveMe(Direction.up);
	}

}
