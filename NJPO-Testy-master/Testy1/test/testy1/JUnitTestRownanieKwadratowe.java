package testy1;

import org.junit.Test;
import static org.junit.Assert.*;


public class JUnitTestRownanieKwadratowe {
    
    public JUnitTestRownanieKwadratowe() {
    }

    @Test
    public void TestDeltaUjemna(){
        RownanieKwadratowe rownanie = new RownanieKwadratowe(10, 2, 3);
        assertEquals(rownanie.ObliczLiczbePierwiastkow(), "Delta < 0, brak pierwiastków równania.");
    }
    
    @Test
    public void TestDeltaDodatnia(){
        RownanieKwadratowe rownanie = new RownanieKwadratowe(3, 10, 3);
        assertEquals(rownanie.ObliczLiczbePierwiastkow(), "Delta > 0, istnieją dwa pierwiastki równania");
    }
    
    @Test
    public void TestDeltaZero(){
        RownanieKwadratowe rownanie = new RownanieKwadratowe(1, 2, 1);
        assertEquals(rownanie.ObliczLiczbePierwiastkow(), "Delta = 0, istnieje jeden pierwiastek równania");
    }
    
    @Test
    public void LiczDwaPierwiastki(){
        RownanieKwadratowe rownanie = new RownanieKwadratowe(1, -2, -3);
        rownanie.ObliczLiczbePierwiastkow();
        double[] wyniki = rownanie.obliczPierwiastki();
        assertEquals(3d, wyniki[1],0);
        assertEquals(-1d, wyniki[0],0);
    }
    
    @Test
    public void LiczJedenPierwiastek(){
        RownanieKwadratowe rownanie = new RownanieKwadratowe(4, 4, 1);
        rownanie.ObliczLiczbePierwiastkow();
        double[] wyniki = rownanie.obliczPierwiastki();
        assertEquals(-0.5d, wyniki[0],0);
    }
}
