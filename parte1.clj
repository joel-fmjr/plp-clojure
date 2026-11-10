(defn sum-squares
  "Recebe dois números x e y e devolve a soma dos seus quadrados."
  [x y]
  (+ (* x x) (* y y)))

(defn circle-area
  "Recebe um raio r e devolve a área do círculo: pi vezes r ao quadrado."
  [r]
  (* Math/PI r r))

(defn age
  "Recebe o ano de nascimento e o ano atual e devolve a idade aproximada."
  [birth-year current-year]
  (- current-year birth-year))

(defn elderly?
  "Recebe uma idade e devolve true se ela for maior que 65, senão false."
  [age]
  (> age 65))

(defn html-item 
  "Recebe uma string e devolve ela entre as tags <li> e </li>."
  [s]
  (str "<li>" s "</li>")
  )

(defn starts-with-a?
  "Recebe uma string e devolve true se ela começa com o caracter \\A."
  [s]
  (= (first s) \A))

(defn verb?
  "Recebe uma string e devolve true se ela termina com o caracter \\r."
  [s]
  (= (last s) \r))

(defn vowel?
  "Recebe um caracter e devolve true se ele é uma vogal minúscula."
  [c]
  (or (= c \a) (= c \e) (= c \i) (= c \o) (= c \u)))

(defn eq-heads?
  "Recebe duas coleções e devolve true se elas têm o mesmo primeiro elemento."
  [coll_1 coll_2]
  (= (first coll_1) (first coll_2)))

(defn vowel-2?
  "Recebe um caracter e devolve true se ele é uma vogal, minúscula ou maiúscula."
  [c]
  (contains? #{\a, \e, \i, \o, \u, \A, \E, \I, \O, \U} c))