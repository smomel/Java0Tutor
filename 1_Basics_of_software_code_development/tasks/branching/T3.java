/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */

public class T3 {

	public static void main(String[] args) {
		// задаем координаты точек
		double x1 = -4, y1 = 4;
		double x2 = -1, y2 = -1;
		double x3 = 2, y3 = -6;
		
		double max, katet1, katet2;
		double angleA, angleB;
		boolean res;
		
		// 1. Точки будут на одной прямой, если совпадают все координаты по х или по у
		if ( ( (x1 == x2) && (x1 == x3) ) || ( (y1 == y2) && (y1 == y3) ) ) {
			res = true;
		} else {
			
			// 2. Точки будут на одной прямой, если они лежат на гипотенузе прямоугольного треугольника
			// для этого вычислим последовательно катеты треугольника и значения углов, если углы равны, то точки на гипотенузе
			
			// упорядочим точки на координатной плоскости в направлении по оси Х слева направо
			if (x1 > x2) { max = x1; x1 = x2; x2 = max;	max = y1; y1 = y2; y2 = max;}			
			if (x1 > x3) { max = x1; x1 = x3; x3 = max;	max = y1; y1 = y3; y3 = max;}			
			if (x2 > x3) { max = x2; x2 = x3; x3 = max; max = y2; y2 = y3; y3 = max;}	
			
			// определяем значение катетов первого треугольника (х1, у1) - (х2, у2)
			katet1 = Math.abs(x2 - x1);
			katet2 = Math.abs(y2 - y1);
			
			// находим значение угла первого треугольника
			angleA = Math.atan( (double) katet1 / katet2 );
			
			// определяем значение катетов второго треугольника (х1, у1) - (х3, у3)
			katet1 = Math.abs(x3 - x1);
			katet2 = Math.abs(y3 - y1);
			
			// находим значение угла первого треугольника
			angleB = Math.atan( (double) katet1 / katet2 );
			
			// сравниваем углы
			res = (angleA == angleB) ? true : false;			
						
			//System.out.println("x = " + x1 + ", " + x2 + ", " + x3);
			//System.out.println("y = " + y1 + ", " + y2 + ", " + y3);
			//System.out.println("катеты = " + katet1 + ":" + katet2);
			//System.out.println("Угол А = " + angleA + ", угол В = " + angleB);
		}		
		
		if (res) {
			System.out.print("Точки расположены на одной прямой");
		} else {
			System.out.print("Точки не расположены на одной прямой");
		}
	}

}
