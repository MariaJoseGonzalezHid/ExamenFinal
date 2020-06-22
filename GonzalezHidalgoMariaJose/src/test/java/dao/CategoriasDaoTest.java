
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CategoriasDaoTest{
    
    public CategoriasDaoTest(){
    }
    
    @BeforeClass
    public static void setUpClass(){
    }
    
    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown(){
    }
    

//a que tiene que valer la conexion para probarlo en el JUnit??
    @Test
    public void testGetConexion(){
        System.out.println("getConexion");
        CategoriasDao instance = new CategoriasDao();
        Connection expResult = null;
        Connection result = instance.getConexion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testRead(){
        System.out.println("read");
        Integer idCategoria = 19;
        CategoriasDao instance = new CategoriasDao();
        Categoria result = instance.read(idCategoria);
        assertEquals(result.getId(), idCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsert(){
        System.out.println("insert");
        Categoria categoria = null;
        CategoriasDao instance = new CategoriasDao();
        Integer expResult = null;
        Integer result = instance.insert(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate(){
        System.out.println("update");
        Categoria categoria = null;
        CategoriasDao instance = new CategoriasDao();
        Integer expResult = null;
        Integer result = instance.update(categoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete(){
        System.out.println("delete");
        Integer idCategoria = null;
        CategoriasDao instance = new CategoriasDao();
        Integer expResult = null;
        Integer result = instance.delete(idCategoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testListar(){
        System.out.println("listar");
        Integer posicion = null;
        CategoriasDao instance = new CategoriasDao();
        ArrayList<Categoria> expResult = null;
        ArrayList<Categoria> result = instance.listar(posicion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}