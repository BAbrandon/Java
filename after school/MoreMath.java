public class MoreMath{
  static double answer;
  public static double squareArea(double side){
    double answer = side * side;
    return answer;
  }
  public static double rectangleArea(double length, double width){
    answer = length*width;
    return answer;
  }
  public static double parallelogramArea(double base1, double height){
    answer = base1 * height;
    return answer;
  }
  public static double triangleArea(double base1, double height){
    answer = .5*(base1*height);
    return answer;
  }
  public static double trapezoidArea(double base1, double base2, double height){
    answer = .5*(base1 + base2)*height;
    return answer;
  }
  public static double circleArea(double radius){
    answer = (Math.PI)*radius*radius;
    return answer;
  }
  public static double squarePerimeter(double side){
    answer =2*(side+side);
    return answer;
  }
  public static double rectanglePerimeter(double length, double width){
    answer = 2*(length + width);
    return answer;
  }
  public static double circumference(double radius){
    answer = (Math.PI)*(2*radius);
    return answer;
  }
  public static double cubeSurfaceArea(double side){
    answer = 6* (Math.pow(side,2));
    return answer;
  }
  public static double squarePrismSurfaceArea(double side, double height){
    answer = (2*(side+side))*height+((2)*(side*side));
    return answer;
  }
  public static double rectangularPrismSurfaceArea(double length, double width, double height){
    answer = (2*(length + width))*height + (2* (length*width)) ;
    return answer;
  }
  public static double sphereSurfaceArea(double radius){
    answer = 4*(Math.PI)*(radius*radius);
    return answer;
  }
  public static double cubeVolume(double side){
    answer = side*side*side;
    return answer;
  }
  public static double squarePrismVolume(double side, double height){
    answer = side*side*height;
    return answer;
  }
  public static double rectangularPrismVolume(double length, double width, double height){
    answer= length*width*height; 
    return answer;
  }
  public static double pyramidVolume(double side, double height){
    answer = (side*side* height)/3;
    return answer;
  }
  public static double cylinderVolume(double radius, double height){
    answer = (3.14*radius*radius)*height;
    return answer;
  }
  public static double coneVolume(double radius, double height){
    answer = ((3.14*radius*radius)*height)/3;
    return answer;
  }
  public static double sphereVolume(double radius){
    answer = (3.14*radius*radius*radius*4)/3;
    return answer;
  }
}
















