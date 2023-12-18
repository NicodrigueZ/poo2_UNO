package DeVeras;

import static org.junit.Assert.*;
import org.junit.Test;
import DeVeras.Aplicacion;
public class AplicacionTest {

	@Test
    public void testSumaConsecutivaCaso1() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 9;
        int expected = 2;
        int result = Aplicacion.sumaConsecutiva(arr, n, x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumaConsecutivaCaso2() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 15;
        int expected = 5;
        int result = Aplicacion.sumaConsecutiva(arr, n, x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumaConsecutivaCaso3() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 6;
        int expected = 2;
        int result = Aplicacion.sumaConsecutiva(arr, n, x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumaConsecutivaCaso4() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 1;
        int expected = 1;
        int result = Aplicacion.sumaConsecutiva(arr, n, x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumaConsecutivaCaso5() {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 12;
        int expected = 3;
        int result = Aplicacion.sumaConsecutiva(arr, n, x);
        assertEquals(expected, result);
        
    }
    
    
}
