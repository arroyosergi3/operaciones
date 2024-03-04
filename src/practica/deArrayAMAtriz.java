package practica;

public class deArrayAMAtriz {

	public static void main(String[] args) {
        int a[] = new int [25];
        inicializaArray(a);
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
        System.out.println();
        System.out.println();
        int m[][] = new int [(int)Math.sqrt(a.length)][(int)Math.sqrt(a.length)];
        m = DeArrayAMatriz(a);
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    
    
    }
    
    public static void inicializaArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = ((int)Math.round(Math.random() * 100));
        }
    }

    public static int[][] DeArrayAMatriz(int a[]) {
        int lon =(int) Math.sqrt(a.length);
        int m[][] = new int[lon][lon]; 
        int index = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = a[index];
                index++;
            }
        }
return m;
    }



}
