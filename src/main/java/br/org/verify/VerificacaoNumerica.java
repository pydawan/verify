package br.org.verify;

import java.util.Arrays;

/**
 * <p>
 * Provê verificações diversas para tipos numéricos.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 09/10/2017
 * @since v1.0.0
 */
public class VerificacaoNumerica<T extends Number> {
   
   private T valor;
   private String mensagemExcecao = "";
   
   public VerificacaoNumerica(T valor) {
      if (valor != null) {
         this.valor = valor;
      } else {
         mensagemExcecao = "ATENÇÃO: O valor de referência para verificação passado como parâmetro no construtor não deve ser nulo!";
         throw new IllegalArgumentException(mensagemExcecao);
      }
   }
   
   public static <T extends Number> VerificacaoNumerica<T> de(T valor) {
      VerificacaoNumerica<T> verificacaoNumerica = new VerificacaoNumerica<T>(valor);
      return verificacaoNumerica;
   }
   
   /**
    * Verifica se um número é um byte.
    * 
    * @param numero
    * @return
    */
   public static boolean eByte(Number numero) {
      boolean eByte = false;
      if (numero != null) {
         eByte = Byte.class.isAssignableFrom(numero.getClass());
      }
      return eByte;
   }
   
   /**
    * Verifica se um número é um short.
    * 
    * @param numero
    * @return
    */
   public static boolean eShort(Number numero) {
      boolean eShort = false;
      if (numero != null) {
         eShort = Short.class.isAssignableFrom(numero.getClass());
      }
      return eShort;
   }
   
   /**
    * Verifica se um número é um int.
    * 
    * @param numero
    * @return
    */
   public static boolean eInteger(Number numero) {
      boolean eInteger = false;
      if (numero != null) {
         eInteger = Integer.class.isAssignableFrom(numero.getClass());
      }
      return eInteger;
   }
   
   /**
    * Verifica se um número é um long.
    * 
    * @param numero
    * @return
    */
   public static boolean eLong(Number numero) {
      boolean eLong = false;
      if (numero != null) {
         eLong = Long.class.isAssignableFrom(numero.getClass());
      }
      return eLong;
   }
   
   /**
    * Verifica se um número é um float.
    * 
    * @param numero
    * @return
    */
   public static boolean eFloat(Number numero) {
      boolean eFloat = false;
      if (numero != null) {
         eFloat = Integer.class.isAssignableFrom(numero.getClass());
      }
      return eFloat;
   }
   
   /**
    * Verifica se um número é um double.
    * 
    * @param numero
    * @return
    */
   public static boolean eDouble(Number numero) {
      boolean eDouble = false;
      if (numero != null) {
         eDouble = Integer.class.isAssignableFrom(numero.getClass());
      }
      return eDouble;
   }
   
   /**
    * Verifica se o valor armazenado é menor que o parâmetro numérico informado.
    * 
    * @param numero
    * @return
    */
   public boolean menorQue(T numero) {
      boolean eMenorQue = false;
      if (numero != null) {
         if (eByte(numero)) {
            eMenorQue = valor.byteValue() < numero.byteValue();
         } else if (eShort(numero)) {
            eMenorQue = valor.shortValue() < numero.shortValue();
         } else if (eInteger(numero)) {
            eMenorQue = valor.intValue() < numero.intValue();
         } else if (eLong(numero)) {
            eMenorQue = valor.longValue() < numero.longValue();
         } else if (eFloat(numero)) {
            eMenorQue = valor.floatValue() < numero.floatValue();
         } else if (eDouble(numero)) {
            eMenorQue = valor.doubleValue() < numero.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eMenorQue;
   }
   
   public boolean naoMenorQue(T numero) {
      return !menorQue(numero);
   }
   
   public boolean menorQueOuIgual(T numero) {
      boolean eMenorQueOuIgual = false;
      if (numero != null) {
         if (eByte(numero)) {
            eMenorQueOuIgual = valor.byteValue() <= numero.byteValue();
         } else if (eShort(numero)) {
            eMenorQueOuIgual = valor.shortValue() <= numero.shortValue();
         } else if (eInteger(numero)) {
            eMenorQueOuIgual = valor.intValue() <= numero.intValue();
         } else if (eLong(numero)) {
            eMenorQueOuIgual = valor.longValue() <= numero.longValue();
         } else if (eFloat(numero)) {
            eMenorQueOuIgual = valor.floatValue() <= numero.floatValue();
         } else if (eDouble(numero)) {
            eMenorQueOuIgual = valor.doubleValue() <= numero.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eMenorQueOuIgual;
   }
   
   public boolean naoMenorQueOuIgual(T numero) {
      return !menorQueOuIgual(numero);
   }
   
   public boolean igual(T numero) {
      boolean eIgual = false;
      if (numero != null) {
         if (eByte(numero)) {
            eIgual = valor.byteValue() == numero.byteValue();
         } else if (eShort(numero)) {
            eIgual = valor.shortValue() == numero.shortValue();
         } else if (eInteger(numero)) {
            eIgual = valor.intValue() == numero.intValue();
         } else if (eLong(numero)) {
            eIgual = valor.longValue() == numero.longValue();
         } else if (eFloat(numero)) {
            eIgual = valor.floatValue() == numero.floatValue();
         } else if (eDouble(numero)) {
            eIgual = valor.doubleValue() == numero.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eIgual;
   }
   
   public boolean naoIgual(T numero) {
      return !igual(numero);
   }
   
   public boolean maiorQue(T numero) {
      boolean eMaiorQue = false;
      if (numero != null) {
         if (eByte(numero)) {
            eMaiorQue = valor.byteValue() > numero.byteValue();
         } else if (eShort(numero)) {
            eMaiorQue = valor.shortValue() > numero.shortValue();
         } else if (eInteger(numero)) {
            eMaiorQue = valor.intValue() > numero.intValue();
         } else if (eLong(numero)) {
            eMaiorQue = valor.longValue() > numero.longValue();
         } else if (eFloat(numero)) {
            eMaiorQue = valor.floatValue() > numero.floatValue();
         } else if (eDouble(numero)) {
            eMaiorQue = valor.doubleValue() > numero.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eMaiorQue;
   }
   
   public boolean naoMaiorQue(T numero) {
      return !maiorQue(numero);
   }
   
   public boolean maiorQueOuIgual(T numero) {
      boolean eMaiorQueOuIgual = false;
      if (numero != null) {
         if (eByte(numero)) {
            eMaiorQueOuIgual = valor.byteValue() >= numero.byteValue();
         } else if (eShort(numero)) {
            eMaiorQueOuIgual = valor.shortValue() >= numero.shortValue();
         } else if (eInteger(numero)) {
            eMaiorQueOuIgual = valor.intValue() >= numero.intValue();
         } else if (eLong(numero)) {
            eMaiorQueOuIgual = valor.longValue() >= numero.longValue();
         } else if (eFloat(numero)) {
            eMaiorQueOuIgual = valor.floatValue() >= numero.floatValue();
         } else if (eDouble(numero)) {
            eMaiorQueOuIgual = valor.doubleValue() >= numero.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eMaiorQueOuIgual;
   }
   
   public boolean naoMaiorQueOuIgual(T numero) {
      return !maiorQueOuIgual(numero);
   }
   
   public boolean estaEntre(T inicio, T fim) {
      boolean estaEntre = false;
      if (inicio == null || fim == null) {
         mensagemExcecao = "ATENÇÃO: Os valores inicial e final do intervalo numérico a ser verificado devem ser informados.";
         throw new IllegalArgumentException(mensagemExcecao);
      } else {
         if (eByte(inicio)) {
            estaEntre = valor.byteValue() >= inicio.byteValue() && valor.byteValue() <= fim.byteValue();
         } else if (eShort(inicio)) {
            estaEntre = valor.shortValue() >= inicio.shortValue() && valor.shortValue() <= fim.shortValue();
         } else if (eInteger(inicio)) {
            estaEntre = valor.intValue() >= inicio.intValue() && valor.intValue() <= fim.intValue();
         } else if (eLong(inicio)) {
            estaEntre = valor.longValue() >= inicio.longValue() && valor.longValue() <= fim.longValue();
         } else if (eFloat(inicio)) {
            estaEntre = valor.floatValue() >= inicio.floatValue() && valor.floatValue() <= fim.floatValue();
         } else if (eDouble(inicio)) {
            estaEntre = valor.doubleValue() >= inicio.doubleValue() && valor.doubleValue() <= fim.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return estaEntre;
   }
   
   public boolean naoEstaEntre(T inicio, T fim) {
      return !estaEntre(inicio, fim);
   }
   
   public boolean estaFora(T inicio, T fim) {
      return naoEstaEntre(inicio, fim);
   }
   
   public boolean naoEstaFora(T inicio, T fim) {
      return estaEntre(inicio, fim);
   }
   
   public boolean estaEm(T[] colecao) {
      boolean estaEm = false;
      if (colecao != null && colecao.length > 0) {
         estaEm = Arrays.asList(colecao).contains(valor);
      }
      return estaEm;
   }
   
   public boolean naoEstaEm(T[] colecao) {
      return !estaEm(colecao);
   }
   
   public boolean eZero() {
      boolean eZero = false;
      if (valor != null) {
         if (eByte(valor)) {
            eZero = valor.byteValue() == 0;
         } else if (eShort(valor)) {
            eZero = valor.shortValue() == 0;
         } else if (eInteger(valor)) {
            eZero = valor.intValue() == 0;
         } else if (eLong(valor)) {
            eZero = valor.longValue() == 0;
         } else if (eFloat(valor)) {
            eZero = valor.floatValue() == 0;
         } else if (eDouble(valor)) {
            eZero = valor.doubleValue() == 0;
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eZero;
   }
   
   public boolean eNaoZero() {
      return !eZero();
   }
   
   public boolean zero() {
      return eZero();
   }
   
   public boolean naoZero() {
      return eNaoZero();
   }
   
   public boolean eNegativo() {
      boolean eNegativo = false;
      if (valor != null) {
         if (eByte(valor)) {
            eNegativo = valor.byteValue() < 0;
         } else if (eShort(valor)) {
            eNegativo = valor.shortValue() < 0;
         } else if (eInteger(valor)) {
            eNegativo = valor.intValue() < 0;
         } else if (eLong(valor)) {
            eNegativo = valor.longValue() < 0;
         } else if (eFloat(valor)) {
            eNegativo = valor.floatValue() < 0;
         } else if (eDouble(valor)) {
            eNegativo = valor.doubleValue() < 0;
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return eNegativo;
   }
   
   public boolean eNaoNegativo() {
      return !eNegativo();
   }
   
   public boolean negativo() {
      return eNegativo();
   }
   
   public boolean naoNegativo() {
      return eNaoNegativo();
   }
   
   
   public boolean ePositivo() {
      boolean ePositivo = false;
      if (valor != null) {
         if (eByte(valor)) {
            ePositivo = valor.byteValue() > 0;
         } else if (eShort(valor)) {
            ePositivo = valor.shortValue() > 0;
         } else if (eInteger(valor)) {
            ePositivo = valor.intValue() > 0;
         } else if (eLong(valor)) {
            ePositivo = valor.longValue() > 0;
         } else if (eFloat(valor)) {
            ePositivo = valor.floatValue() > 0;
         } else if (eDouble(valor)) {
            ePositivo = valor.doubleValue() > 0;
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return ePositivo;
   }
   
   public boolean eNaoPositivo() {
      return !ePositivo();
   }
   
   public boolean positivo() {
      return ePositivo();
   }
   
   public boolean naoPositivo() {
      return eNaoPositivo();
   }
   
}
