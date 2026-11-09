;; Parte 2 - Começando a usar funções de alta ordem

;; Reaproveita as funções definidas na Parte 1
(load-file "parte1.clj")

;; 1. itemize
(defn itemize
  "Recebe uma lista de nomes e devolve a sequência com html-item aplicado a cada um."
  [names]
  (map html-item names))

;; 2. only-vowels
(defn only-vowels
  "Recebe uma string e devolve outra contendo somente as suas vogais."
  [s]
  (apply str (filter vowel-2? s)))
