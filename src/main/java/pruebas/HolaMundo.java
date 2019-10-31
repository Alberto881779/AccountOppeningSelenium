package pruebas;

import org.junit.*;

public class HolaMundo {
    @BeforeClass
    public static void antes_de_todos() {
        System.out.println("AL INICIO DE LA CLASE");
    }

    @Before
    public void antes_de_la_prueba() {
        System.out.println("antes de las pruebas");
    }

    @Test
    public void prueba() {
        System.out.println("al ejecutar la prueba 1");
    }

    @Test
    public void prueba2() {
        System.out.println("al ejecutar la prueba 2");
    }

    @Test
    public void prueba3() {
        System.out.println("al ejecutar la prueba 3");
    }

    @After
    public void despues_de_la_prueba() {
        System.out.println("despues de la prueba");
    }

    @AfterClass
    public static void final_de_la_prueba() {
        System.out.println("FINAL DE  LA CLASE");
    }
}
