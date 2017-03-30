package drone;

public class Drone implements StandardDrone{
	private int a=30;
			int b=30;
	        int c;

	public String moveUp() 
	{
		if (a>10 && a<40)
		{
			if (c>10 && c<40) 
			{
				if((b<10 && b>=0)||(b<50 && b>=40))
				{
					b++;
				}
			}
			else if(b<50)
			{
				b++;
			}
		}
		else if(b<50){
			b++;
		}
		return getFormatedCoordinates() ;
	}


	public String moveDown()
	{
		if(a>10 && a<40)
		{
			if(c>10 && c<40)
			{
				if((b<=10 && b>0) || (b<=50 && b>40))
				{
					b--;
				}
			}
			else if(b<50)
			{
				b--;
			}
		}
		else if(b>0){
			b--;
		}
		return getFormatedCoordinates();
	}


	@Override
	public String moveRight()
	{
		if (b>10 && b<40)
		{
			if (c>10 && c<40) 
			{
				if((a<10 && a>=0)||(a<50 && a>=40))
				{
					a++;
				}
			}
			else if(a<50)
			{
				a++;
			}
		}
		else if(a<50)
		{
			a++;
		}
		return getFormatedCoordinates() ;
	}
	public String moveLeft()
	{
		if(b>10 && b<40)
		{
			if(c>10 && c<40)
			{
				if((a<=10 && a>0) || (a<=50 && a>40))
				{
					a--;
				}
			}
			else if(a>0)
			{
				a--;
			}
		}
		else if(a>0){
			a--;
		}
		return getFormatedCoordinates();
	}


	@Override
	public String moveBack()
	{
		if(b>10 && b<40)
		{
			if(a>10 && a<40)
			{
				if((c<=10 && c>0) || (c<=50 && c>40))
				{
					c--;
				}
			}
			else if(c>0)
			{
				c--;
			}
		}
		else if(c>0)
		{
			c--;
		}
		return getFormatedCoordinates();
	}

	
	public String moveForth() 
	{
		if (b>10 && b<40)
		{
			if (a>10 && a<40)
			{
				if((c<10 && c>=0)||(c<50 && c>=40))
				{
					c++;
				}
			}
			else if(c<50){
				c++;
			}
		}
		else if(c<50){
			c++;
		}
		return getFormatedCoordinates() ;
	}

	@Override
	public String getFormatedCoordinates()
	{
		return "Drone position: "+"("+a+","+b+","+c+")" ; // vraæa pozicje koordinata
	}

}

