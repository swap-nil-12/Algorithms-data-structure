package javarevisited;

public class intersection {
		int intersectionPoint = -1;
		int x;
		int y;

		public int intersectionpoint(int[] arrA, int[] arrB) {
			while (x < arrA.length && y < arrB.length) {
				if (arrA[x] > arrB[y])
					y++;
				else if (arrA[x] < arrB[y])
					x++;
				else {
					intersectionPoint = arrA[x];
					return intersectionPoint;
				}
			}
			return intersectionPoint;
		}

		public static void main(String[] args) throws java.lang.Exception {
			int[] a = { 1, 2, 3, 6, 8, 10 };
			int[] b = { 4, 5, 6, 11, 15, 20 };
			intersection i = new intersection();
			System.out.println("Intersection point is : " + i.intersectionpoint(a, b));

		}
	}

