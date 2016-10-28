package PZM.puzzle_solver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase de algoritmo de resolución de problemas
 *
 */
public class PuzzleSolve
{
	/**
	 * Ejecuta un ejemplo del algoritmo de resolución de problemas
	 * @param args - Argumentos de main que se pasan por consola (no son necesarios en este ejemplo)
	 */
    public static void main( String[] args )
    {
        ArrayList<String> U = new ArrayList<String>();
        U.add("a");
        U.add("b");
        U.add("c");
        U.add("d");
        ArrayList<String> S = new ArrayList<String>();
        puzzle_solve(4,S,U);
    }
/**
 * Algoritmo de resolución de problemas. Retorna subconjuntos S con k elementos a partir de un
 * conjunto base U.
 * @param k - Número de soluciones.
 * @param S - Array de subconjunto.
 * @param U - Array de conjunto principal.
 */
    public static void puzzle_solve(int k, ArrayList<String> S, ArrayList<String> U)
    {
    	for (int i = 0; i<U.size(); i++)
    	{
    		S.add(U.get(i));
    		U.remove(i);
    		if (k == 1)
    		{
    				System.out.println(S);
    		}
    		else
    		{
    			Collections.sort(U);
    			puzzle_solve(k-1,S,U);
    		}
    		String e = S.get(S.size()-1);
    		S.remove(S.size()-1);
    		U.add(e);
    		Collections.sort(U);
    	}

    }

   /* private static int suma(ArrayList<String> l)
    {
    	int suma = 0;
    	for (int i = 0; i<l.size(); i++)
    	{
    		suma+=l.get(i);
    	}
    	return suma;
    }*/
}
