package br.org.verify;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author thiago-amm
 * @version v1.0.0 15/08/2017
 * @since v1.0.0
 */
public final class Verifique {
    
    public static final String STRING_VAZIA = "";
    public static final Object[] ARRAY_VAZIO = new Object[] {};
    public static final List<?> LISTA_VAZIA = new ArrayList<>(0);
    public static final Map<?, ?> MAPA_VAZIO = new HashMap<>(0);
   
   public static boolean eNulo(Object objeto) {
      return objeto == null;
   }
   
   public static boolean eNaoNulo(Object objeto) {
      return !eNulo(objeto);
   }
   
   public static boolean nulo(Object objeto) {
      return eNulo(objeto);
   }
   
   public static boolean naoNulo(Object objeto) {
      return eNaoNulo(objeto);
   }
   
   public static boolean contemNulo(Object... objetos) {
      if (objetos == null) {
         return true;
      } else {
         for (Object objeto : objetos) {
            if (objeto instanceof Object[]) {
               return contemNulo((Object[]) objeto);
            } else if (objeto instanceof Collection) {
               return contemNulo((Collection<?>) objeto);
            } else if (eNulo(objeto)) {
               return true;
            } else {
               
            }
         }
      }
      return false;
   }
   
   public static boolean naoContemNulo(Object... objetos) {
      return !contemNulo(objetos);
   }
   
   public static <E> boolean contemNulo(Collection<E> colecao) {
      if (colecao == null) {
         return true;
      } else {
         for (E elemento : colecao) {
            if (eNulo(elemento)) {
               return true;
            }
         }
      }
      return false;
   }
   
   public static <E> boolean naoContemNulo(Collection<E> colecao) {
      return !contemNulo(colecao);
   }
   
   public static boolean contemNuloOuVazio(Object... objetos) {
      if (eNuloOuVazio(objetos)) {
         return true;
      } else {
         for (Object objeto : objetos) {
            if (objeto instanceof Object[]) {
               return contemNuloOuVazio((Object[]) objeto);
            } else if (objeto instanceof Collection) {
               return contemNuloOuVazio((Collection<?>) objeto);
            } else if (eNuloOuVazio(objeto)) {
               return true;
            } else {
               
            }
         }
      }
      return false;
   }
   
   public static boolean contemVazioOuNulo(Object... objetos) {
      return contemNuloOuVazio(objetos);
   }
   
   public static boolean naoContemNuloOuVazio(Object... objetos) {
      return !contemNuloOuVazio(objetos);
   }
   
   public static boolean naoContemVazioOuNulo(Object... objetos) {
      return naoContemNuloOuVazio(objetos);
   }
   
   public static <E> boolean contemNuloOuVazio(Collection<E> colecao) {
      if (eNuloOuVazio(colecao)) {
         return true;
      } else {
         for (E elemento : colecao) {
            if (eNuloOuVazio(elemento)) {
               return true;
            }
         }
      }
      return false;
   }
   
   public static <E> boolean contemVazioOuNulo(Collection<E> colecao) {
      return contemNuloOuVazio(colecao);
   }
   
   public static <E> boolean naoContemNuloOuVazio(Collection<E> colecao) {
      return !contemNuloOuVazio(colecao);
   }
   
   public static <E> boolean naoContemVazioOuNulo(Collection<E> colecao) {
      return naoContemNuloOuVazio(colecao);
   }
   
   public static boolean eVazio(Object objeto) {
      if (objeto == null) return false;
      if (objeto instanceof String) {
         return ((String) objeto).isEmpty();
      } else if (objeto instanceof Collection) {
         return ((Collection<?>) objeto).isEmpty();
      } else if (objeto instanceof Map) {
         return ((Map<?, ?>) objeto).isEmpty();
      } else if (objeto.getClass().isArray()) {
         return ((Object[]) objeto).length == 0;
      } else {
         return false;
      }
   }
   
   public static boolean vazio(Object objeto) {
      return eVazio(objeto);
   }
   
   public static boolean eNaoVazio(Object objeto) {
      return !eVazio(objeto);
   }
   
   public static boolean naoVazio(Object objeto) {
      return eNaoVazio(objeto);
   }
   
   public static boolean eVazio(String texto) {
      return texto != null && texto.isEmpty();
   }
   
   public static boolean eNaoVazio(String texto) {
      return !eVazio(texto);
   }
   
   public static boolean vazio(String texto) {
      return eVazio(texto);
   }
   
   public static boolean naoVazio(String texto) {
      return eNaoVazio(texto);
   }
   
   public static boolean contemVazio(String... textos) {
      if (textos != null) {
         for (String texto : textos) {
            if (eVazio(texto)) {
               return true;
            }
         }
      }
      return false;
   }
   
   public static boolean naoContemVazio(String... textos) {
      return !contemVazio(textos);
   }
   
   public static boolean contemVazioOuNulo(String... textos) {
      if (eNaoNulo((Object[]) textos)) {
         for (String texto : textos) {
            if (eVazioOuNulo(texto)) {
               return true;
            }
         }
      }
      return false;
   }
   
   public static boolean naoContemVazioOuNulo(String... textos) {
      return !contemVazioOuNulo(textos);
   }
   
   public static <E> boolean eVazio(Collection<E> colecao) {
      return colecao != null && colecao.isEmpty();
   }
   
   public static <E> boolean eNaoVazio(Collection<E> colecao) {
      return !eVazio(colecao);
   }
   
   public static <E> boolean vazio(Collection<E> colecao) {
      return eVazio(colecao);
   }
   
   public static <E> boolean naoVazio(Collection<E> colecao) {
      return eNaoVazio(colecao);
   }
   
   public static <K, V> boolean eNulo(Map<K, V> mapa) {
      return mapa == null;
   }
   
   public static <K, V> boolean eNaoNulo(Map<K, V> mapa) {
      return mapa != null;
   }
   
   public static <K, V> boolean nulo(Map<K, V> mapa) {
      return eNulo(mapa);
   }
   
   public static <K, V> boolean naoNulo(Map<K, V> mapa) {
      return eNaoNulo(mapa);
   }
   
   public static <K, V> boolean eNuloOuVazio(Map<K, V> mapa) {
      return mapa == null || mapa.isEmpty();
   }
   
   public static <K, V> boolean eNaoNuloOuVazio(Map<K, V> mapa) {
      return mapa != null && !mapa.isEmpty();
   }
   
   public static boolean eNuloOuVazio(Object objeto) {
      // null.
      if (objeto == null) {
         return true;
      }
      // empty.
      if (objeto instanceof String) {
         return ((String) objeto).isEmpty();
      } else if (objeto instanceof Collection) {
         return ((Collection<?>) objeto).isEmpty();
      } else if (objeto instanceof Map) {
         return ((Map<?, ?>) objeto).isEmpty();
      } else if (objeto.getClass().isArray()) {
         return ((Object[]) objeto).length == 0;
      } else {
         return false;
      }
   }
   
   public static boolean eNaoNuloOuVazio(Object objeto) {
      return !eNuloOuVazio(objeto);
   }
   
   public static boolean nuloOuVazio(Object objeto) {
      return eNuloOuVazio(objeto);
   }
   
   public static boolean naoNuloOuVazio(Object objeto) {
      return eNaoNuloOuVazio(objeto);
   }
   
   public static <K, V> boolean nuloOuVazio(Map<K, V> mapa) {
      return eNuloOuVazio(mapa);
   }
   
   public static <K, V> boolean naoNuloOuVazio(Map<K, V> mapa) {
      return naoNuloOuVazio(mapa);
   }
   
   public static <K, V> boolean eVazio(Map<K, V> mapa) {
      return mapa != null && mapa.isEmpty();
   }
   
   public static <K, V> boolean eNaoVazio(Map<K, V> mapa) {
      return mapa != null && !mapa.isEmpty();
   }
   
   public static <K, V> boolean vazio(Map<K, V> mapa) {
      return eVazio(mapa);
   }
   
   public static <K, V> boolean naoVazio(Map<K, V> mapa) {
      return eNaoVazio(mapa);
   }
   
   public static boolean eVazioOuNulo(Object objeto) {
      // null.
      if (objeto == null) {
         return true;
      }
      // empty.
      if (objeto instanceof String) {
         return ((String) objeto).isEmpty();
      } else if (objeto instanceof Collection) {
         return ((Collection<?>) objeto).isEmpty();
      } else if (objeto instanceof Map) {
         return ((Map<?, ?>) objeto).isEmpty();
      } else if (objeto.getClass().isArray()) {
         return ((Object[]) objeto).length == 0;
      } else {
         return false;
      }
   }
   
   public static boolean eNaoVazioOuNulo(Object objeto) {
      return !eVazioOuNulo(objeto);
   }
   
   public static boolean vazioOuNulo(Object objeto) {
      return eVazioOuNulo(objeto);
   }
   
   public static boolean naoVazioOuNulo(Object objeto) {
      return eNaoVazioOuNulo(objeto);
   }
   
   public static boolean existe(Object objeto) {
      return eNaoNulo(objeto);
   }
   
   public static boolean naoExiste(Object objeto) {
      return eNulo(objeto);
   }
   
   public static boolean eVazioOuNulo(Object... objetos) {
      if (!eVazioOuNulo((Object) objetos)) {
         for (Object objeto : objetos) {
            if (eVazioOuNulo(objeto)) {
               return true;
            }
         }
         return false;
      }
      return true;
   }
   
   public static boolean eNaoVazioOuNulo(Object... objetos) {
      return !eVazioOuNulo(objetos);
   }
   
   public static boolean vazioOuNulo(Object... objetos) {
      return eVazioOuNulo(objetos);
   }
   
   public static boolean naoVazioOuNulo(Object... objetos) {
      return eNaoVazioOuNulo(objetos);
   }
   
   public static boolean vazio(Object... objetos) {
      if (objetos != null) {
         for (Object objeto : objetos) {
            if (vazio(objeto)) {
               return true;
            }
         }
         return false;
      }
      return true;
   }
   
   public static boolean eArray(Object objeto) {
      return (objeto instanceof Object[] || objeto.getClass().isArray());
   }
   
   public static boolean array(Object objeto) {
      return eArray(objeto);
   }
   
   public static boolean eNaoArray(Object objeto) {
      return !eArray(objeto);
   }
   
   public static boolean naoArray(Object objeto) {
      return eNaoArray(objeto);
   }
   
   public static boolean eLista(Object objeto) {
      return objeto instanceof java.util.List;
   }
   
   public static boolean eNaoLista(Object objeto) {
      return !eLista(objeto);
   }
   
   public static boolean lista(Object objeto) {
      return eLista(objeto);
   }
   
   public static boolean naoLista(Object objeto) {
      return eNaoLista(objeto);
   }
   
   public static boolean eMapa(Object objeto) {
      return objeto instanceof java.util.Map;
   }
   
   public static boolean eNaoMapa(Object objeto) {
      return !eMapa(objeto);
   }
   
   public static boolean mapa(Object objeto) {
      return eMapa(objeto);
   }
   
   public static boolean naoMapa(Object objeto) {
      return eNaoMapa(objeto);
   }
   
   public static boolean eArrayOuLista(Object objeto) {
      return eArray(objeto) || eLista(objeto);
   }
   
   public static boolean eNaoArrayOuLista(Object objeto) {
      return !eArrayOuLista(objeto);
   }
   
   public static boolean arrayOuLista(Object objeto) {
      return eArrayOuLista(objeto);
   }
   
   public static boolean naoArrayOuLista(Object objeto) {
      return !arrayOuLista(objeto);
   }
   
   public static boolean ePar(Object objeto) {
      boolean ePar = false;
      if (eNaoNuloOuVazio(objeto)) {
         if (eArray(objeto) && Array.getLength(objeto) == 2) {
            ePar = true;
         }
         if (eLista(objeto) && ((List<?>) objeto).size() == 2) {
            ePar = true;
         }
      }
      return ePar;
   }
   
   public static boolean par(Object objeto) {
      return ePar(objeto);
   }
   
   public static boolean eNaoPar(Object objeto) {
      return !ePar(objeto);
   }
   
   public static boolean naoPar(Object objeto) {
      return eNaoPar(objeto);
   }
   
   public static boolean contemSoPares(Object... objetos) {
      if (eNaoNuloOuVazio(objetos)) {
         for (Object objeto : objetos) {
            if (eNaoPar(objeto)) {
               return false;
            }
         }
         return true;
      }
      return false;
   }
   
   public static boolean somentePares(Object... objetos) {
      return contemSoPares(objetos);
   }
   
   public static boolean naoContemSomentePares(Object... objetos) {
      return !contemSoPares(objetos);
   }
   
   public static boolean naoSomentePares(Object... objetos) {
      return naoContemSomentePares(objetos);
   }
   
   public static <T extends Number> VerificacaoNumerica<T> verificacaoNumerica(T numero) {
      return VerificacaoNumerica.<T>de(numero);
   }
   
   public static <T extends Number> VerificacaoNumerica<T> verificarNumero(T numero) {
      return verificacaoNumerica(numero);
   }
   
   public static <T extends Number> VerificacaoNumerica<T> numero(T numero) {
      return verificacaoNumerica(numero);
   }

   
}
