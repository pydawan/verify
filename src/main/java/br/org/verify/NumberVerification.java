package br.org.verify;

/**
 * <p>
 * Provê verificações diversas para tipos numéricos.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 09/10/2017
 * @since v1.0.0
 */
public class NumberVerification<T extends Number> {
   
   private T value;
   private String exceptionMessage = "";
   
   public NumberVerification(T value) {
      if (value != null) {
         this.value = value;
      } else {
         exceptionMessage = "ATENÇÃO: O valor de referência para verificação passado como parâmetro no construtor não deve ser nulo!";
         throw new IllegalArgumentException(exceptionMessage);
      }
   }
   
   public static <T extends Number> NumberVerification<T> of(T value) {
      NumberVerification<T> nv = new NumberVerification<T>(value);
      return nv;
   }
   
   /**
    * Verifica se um número é um byte.
    * 
    * @param number
    * @return
    */
   public static boolean isByte(Number number) {
      boolean isByte = false;
      if (number != null) {
         isByte = Byte.class.isAssignableFrom(number.getClass());
      }
      return isByte;
   }
   
   /**
    * Verifica se um número é um short.
    * 
    * @param number
    * @return
    */
   public static boolean isShort(Number number) {
      boolean isShort = false;
      if (number != null) {
         isShort = Short.class.isAssignableFrom(number.getClass());
      }
      return isShort;
   }
   
   /**
    * Verifica se um número é um int.
    * 
    * @param number
    * @return
    */
   public static boolean isInteger(Number number) {
      boolean isInteger = false;
      if (number != null) {
         isInteger = Integer.class.isAssignableFrom(number.getClass());
      }
      return isInteger;
   }
   
   /**
    * Verifica se um número é um long.
    * 
    * @param number
    * @return
    */
   public static boolean isLong(Number number) {
      boolean isLong = false;
      if (number != null) {
         isLong = Long.class.isAssignableFrom(number.getClass());
      }
      return isLong;
   }
   
   /**
    * Verifica se um número é um float.
    * 
    * @param number
    * @return
    */
   public static boolean isFloat(Number number) {
      boolean isFloat = false;
      if (number != null) {
         isFloat = Integer.class.isAssignableFrom(number.getClass());
      }
      return isFloat;
   }
   
   /**
    * Verifica se um número é um double.
    * 
    * @param number
    * @return
    */
   public static boolean isDouble(Number number) {
      boolean isDouble = false;
      if (number != null) {
         isDouble = Integer.class.isAssignableFrom(number.getClass());
      }
      return isDouble;
   }
   
   /**
    * Verifica se o valor armazenado é menor que o parâmetro numérico informado.
    * 
    * @param number
    * @return
    */
   public boolean lessThan(T number) {
      boolean isLessThan = false;
      if (number != null) {
         if (isByte(number)) {
            isLessThan = value.byteValue() < number.byteValue();
         } else if (isShort(number)) {
            isLessThan = value.shortValue() < number.shortValue();
         } else if (isInteger(number)) {
            isLessThan = value.intValue() < number.intValue();
         } else if (isLong(number)) {
            isLessThan = value.longValue() < number.longValue();
         } else if (isFloat(number)) {
            isLessThan = value.floatValue() < number.floatValue();
         } else if (isDouble(number)) {
            isLessThan = value.doubleValue() < number.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return isLessThan;
   }
   
   public boolean notLessThan(T number) {
      return !lessThan(number);
   }
   
   public boolean lt(T number) {
      return lessThan(number);
   }
   
   public boolean nlt(T number) {
      return notLessThan(number);
   }
   
   public boolean lessThanOrEqual(T number) {
      boolean isLessThanOrEqual = false;
      if (number != null) {
         if (isByte(number)) {
            isLessThanOrEqual = value.byteValue() <= number.byteValue();
         } else if (isShort(number)) {
            isLessThanOrEqual = value.shortValue() <= number.shortValue();
         } else if (isInteger(number)) {
            isLessThanOrEqual = value.intValue() <= number.intValue();
         } else if (isLong(number)) {
            isLessThanOrEqual = value.longValue() <= number.longValue();
         } else if (isFloat(number)) {
            isLessThanOrEqual = value.floatValue() <= number.floatValue();
         } else if (isDouble(number)) {
            isLessThanOrEqual = value.doubleValue() <= number.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return isLessThanOrEqual;
   }
   
   public boolean notLessThanOrEqual(T number) {
      return !lessThanOrEqual(number);
   }
   
   public boolean lte(T number) {
      return lessThanOrEqual(number);
   }
   
   public boolean nlte(T number) {
      return notLessThanOrEqual(number);
   }
   
   public boolean equal(T number) {
      boolean isEqual = false;
      if (number != null) {
         if (isByte(number)) {
            isEqual = value.byteValue() == number.byteValue();
         } else if (isShort(number)) {
            isEqual = value.shortValue() == number.shortValue();
         } else if (isInteger(number)) {
            isEqual = value.intValue() == number.intValue();
         } else if (isLong(number)) {
            isEqual = value.longValue() == number.longValue();
         } else if (isFloat(number)) {
            isEqual = value.floatValue() == number.floatValue();
         } else if (isDouble(number)) {
            isEqual = value.doubleValue() == number.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return isEqual;
   }
   
   public boolean notEqual(T number) {
      return !equal(number);
   }
   
   public boolean eq(T number) {
      return equal(number);
   }
   
   public boolean neq(T number) {
      return notEqual(number);
   }
   
   public boolean greatherThan(T number) {
      boolean isGreatherThan = false;
      if (number != null) {
         if (isByte(number)) {
            isGreatherThan = value.byteValue() > number.byteValue();
         } else if (isShort(number)) {
            isGreatherThan = value.shortValue() > number.shortValue();
         } else if (isInteger(number)) {
            isGreatherThan = value.intValue() > number.intValue();
         } else if (isLong(number)) {
            isGreatherThan = value.longValue() > number.longValue();
         } else if (isFloat(number)) {
            isGreatherThan = value.floatValue() > number.floatValue();
         } else if (isDouble(number)) {
            isGreatherThan = value.doubleValue() > number.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return isGreatherThan;
   }
   
   public boolean notGreatherThan(T number) {
      return !greatherThan(number);
   }
   
   public boolean gt(T number) {
      return greatherThan(number);
   }
   
   public boolean ngt(T number) {
      return notGreatherThan(number);
   }
   
   public boolean greatherThanOrEqual(T number) {
      boolean isGreatherThanOrEqual = false;
      if (number != null) {
         if (isByte(number)) {
            isGreatherThanOrEqual = value.byteValue() >= number.byteValue();
         } else if (isShort(number)) {
            isGreatherThanOrEqual = value.shortValue() >= number.shortValue();
         } else if (isInteger(number)) {
            isGreatherThanOrEqual = value.intValue() >= number.intValue();
         } else if (isLong(number)) {
            isGreatherThanOrEqual = value.longValue() >= number.longValue();
         } else if (isFloat(number)) {
            isGreatherThanOrEqual = value.floatValue() >= number.floatValue();
         } else if (isDouble(number)) {
            isGreatherThanOrEqual = value.doubleValue() >= number.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return isGreatherThanOrEqual;
   }
   
   public boolean notGreatherThanOrEqual(T number) {
      return !greatherThanOrEqual(number);
   }
   
   public boolean gte(T number) {
      return greatherThanOrEqual(number);
   }
   
   public boolean ngte(T number) {
      return notGreatherThanOrEqual(number);
   }
   
   public boolean between(T start, T end) {
      boolean isBetween = false;
      if (start == null || end == null) {
         exceptionMessage = "ATENÇÃO: Os valores inicial e final do intervalo numérico a ser verificado devem ser informados.";
         throw new IllegalArgumentException(exceptionMessage);
      } else {
         if (isByte(start)) {
            isBetween = value.byteValue() >= start.byteValue() && value.byteValue() <= end.byteValue();
         } else if (isShort(start)) {
            isBetween = value.shortValue() >= start.shortValue() && value.shortValue() <= end.shortValue();
         } else if (isInteger(start)) {
            isBetween = value.intValue() >= start.intValue() && value.intValue() <= end.intValue();
         } else if (isLong(start)) {
            isBetween = value.longValue() >= start.longValue() && value.longValue() <= end.longValue();
         } else if (isFloat(start)) {
            isBetween = value.floatValue() >= start.floatValue() && value.floatValue() <= end.floatValue();
         } else if (isDouble(start)) {
            isBetween = value.doubleValue() >= start.doubleValue() && value.doubleValue() <= end.doubleValue();
         } else {
            // BigInteger
            // BigDecimal
         }
      }
      return isBetween;
   }
   
   public boolean notBetween(T start, T end) {
      return !between(start, end);
   }
   
   public boolean btw(T start, T end) {
      return between(start, end);
   }
   
   public boolean nbtw(T start, T end) {
      return notBetween(start, end);
   }
   
}
