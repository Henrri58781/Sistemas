/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Metodos.Hash;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Henrr
 */
public class PruebasUnitarias {
    Hash prueba = new Hash ();
@Test
public void testHash1(){
     
    assertEquals(1, prueba.hasSimple("57673"));
    assertEquals("Excelente", prueba.SumaCaracteres("57673"));
}

@Test
public void testHash2Mio(){
    
    assertEquals(1, prueba.hasSimple("58781"));
    assertEquals("Excelente", prueba.SumaCaracteres("58781"));
}

@Test
public void testHash3(){
    
    assertEquals(1, prueba.hasSimple("58808"));
    assertEquals("Excelente", prueba.SumaCaracteres("58808"));
}

@Test
public void testHash4(){
   
    assertEquals(0, prueba.hasSimple("50126"));
    assertEquals("Reprobado", prueba.SumaCaracteres("50126"));
}

@Test
public void testHash5(){
   
    assertEquals(1, prueba.hasSimple("47218"));
    assertEquals("Reprobado", prueba.SumaCaracteres("47218"));
}

}
