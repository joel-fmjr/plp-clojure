(load-file "parte1.clj")

(defn itemize
  "Recebe uma lista de nomes e devolve a sequência com html-item aplicado a cada um."
  [names]
  (map html-item names))

(defn only-vowels
  "Recebe uma string e devolve outra contendo somente as suas vogais."
  [s]
  (apply str (filter vowel-2? s)))

(defn only-elderly
  "Recebe uma lista de idades e devolve somente as que são de idosos (maiores que 65)."
  [ages]
  (filter elderly? ages))

(defn long-word?
  "Recebe uma string e devolve true se ela tem mais de 10 caracteres."
  [s]
  ( > (count s) 10))

(defn only-long-words
  "Recebe uma lista de palavras e devolve somente as que têm mais de 10 caracteres."
  [words]
  (filter long-word? words))

(defn only-even
  "Recebe uma lista de números e devolve somente os pares."
  [numbers]
  (filter even? numbers))

(defn between-60-and-80?
  "Recebe um número e devolve true se ele está entre 60 e 80 (inclusive)."
  [x]
  (and (>= x 60) (<= x 80)))

(defn only-between-60-and-80
  "Recebe uma lista de números e devolve somente os que estão entre 60 e 80 (inclusive(?))."
  [numbers]
  (filter between-60-and-80? numbers))

(defn space?
  "Recebe um caracter e devolve true se ele é um espaço."
  [c]
  (= c \space))

(defn count-spaces
  "Recebe uma string e devolve a quantidade de espaços que ela contém."
  [s]
  (count (filter space? s)))

(defn calc-areas
  "Recebe uma lista de raios e devolve a lista das áreas dos círculos correspondentes."
  [radii]
  (map circle-area radii))

(defn char-found?
  "Recebe um caracter c e uma string s e devolve true se c aparece em s."
  [c s]
  (boolean (seq (filter #(= c %) s))))