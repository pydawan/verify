package br.org.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import br.org.verify.Verify;

/**
 * <p>Responsável por testar as verificações (métodos) da biblioteca Verify.</p>
 * 
 * @author thiago-amm
 * @version v1.0.0 15/08/2017
 * @since v1.0.0
 */
public class VerifyTest {
   
   public static List<String> NULL_LIST = null;
   public static Map<String, Object> NULL_MAP = null;
   
   public static List<String> EMPTY_LIST = new ArrayList<>();
   public static Map<String, Object> EMPTY_MAP = new HashMap<>();
   
   @Test
   public void testIsNull() {
      Assert.assertTrue(Verify.isNull(null));
      Assert.assertTrue(Verify.isNull(NULL_LIST));
      Assert.assertTrue(Verify.isNull(NULL_MAP));
      Assert.assertTrue(Verify.Null(null));
   }
   
   @Test
   public void testIsNotNull() {
      Assert.assertTrue(Verify.isNotNull(""));
      Assert.assertTrue(Verify.isNotNull(EMPTY_LIST));
      Assert.assertTrue(Verify.isNotNull(EMPTY_MAP));
      Assert.assertTrue(Verify.notNull(""));
   }
   
   @Test
   public void testIsEmpty() {
      Assert.assertTrue(Verify.isEmpty(""));
      Assert.assertTrue(Verify.isEmpty(EMPTY_LIST));
      Assert.assertTrue(Verify.isEmpty(EMPTY_MAP));
      Assert.assertTrue(Verify.empty(""));
   }
   
   @Test
   public void testIsNotEmpty() {
      Assert.assertTrue(Verify.isNotEmpty("Java"));
      Assert.assertTrue(Verify.isNotEmpty(Arrays.asList("Java", "Python", "Groovy", "Scala", "Clojure")));
      
      Map<String, Object> map = new HashMap<>();
      map.put("nome", "Thiago Alexandre");
      map.put("sobrenome", "Martins Monteiro");
      Assert.assertTrue(Verify.isNotEmpty(map));
      
      Assert.assertTrue(Verify.notEmpty("JVM"));
   }
   
   @Test
   public void testIsNullOrEmpty() {
      Assert.assertTrue(Verify.isNullOrEmpty(null));
      Assert.assertTrue(Verify.isNullOrEmpty(""));
      Assert.assertTrue(Verify.isNullOrEmpty(NULL_LIST));
      Assert.assertTrue(Verify.isNullOrEmpty(EMPTY_LIST));
      Assert.assertTrue(Verify.nullOrEmpty(null));
      Assert.assertFalse(Verify.isNullOrEmpty("a"));
      Assert.assertTrue(Verify.isNullOrEmpty((Object[]) null));
      Assert.assertTrue(Verify.isNullOrEmpty(new ArrayList<>(0)));
      Assert.assertTrue(Verify.isNullOrEmpty(new HashMap<>(0)));
   }
   
   @Test
   public void testIsNotNullOrEmpty() {
      Assert.assertFalse(Verify.isNotNullOrEmpty(null));
      Assert.assertFalse(Verify.isNotNullOrEmpty(""));
   }
   
   @Test
   public void testContainsNull() {
      Assert.assertTrue(Verify.containsNull(new Object[] { Arrays.asList(null, "a", "b") }));
      Assert.assertFalse(Verify.notContainsEmptyOrNull(new Object[] { Arrays.asList() }));
   }
   
   @Test
   public void testNumberVerification() {
      NumberVerification<Integer> nv = new NumberVerification<>(10);
      Assert.assertTrue(nv.lessThan(50));
   }
   
   @Test
   public void testNumberVerificationDSL() {
      Assert.assertTrue(Verify.verifyNumber(5).between(1, 10));
      Assert.assertTrue(Verify.verifyNumber(5).in(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
   }
   
   
}
