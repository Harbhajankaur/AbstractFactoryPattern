package abstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")){
	         return new RoundedSquare();
		}else if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE"))
		{
			return new RoundedRectangle();
		}
		 return null;
	}
	
}
