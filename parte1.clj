;; Parte 1 - Definindo novas funções

;; 1. sum-squares
(defn sum-squares
  "Recebe dois números x e y e devolve a soma dos seus quadrados."
  [x y]
  (+ (* x x) (* y y)))

;; 2. circle-area
(defn circle-area
  "Recebe um raio r e devolve a área do círculo: pi vezes r ao quadrado."
  [r]
  (* Math/PI r r))

;; 3. age
(defn age
  "Recebe o ano de nascimento e o ano atual e devolve a idade aproximada."
  [birth-year current-year]
  (- current-year birth-year))

;; 4. elderly?
(defn elderly?
  "Recebe uma idade e devolve true se ela for maior que 65, senão false."
  [age]
  (> age 65))

;; 5. html-item
(defn html-item
  "Recebe uma string e devolve ela entre as tags <li> e </li>."
  [s]
  (str "<li>" s "</li>"))

;; 6. starts-with-a?
(defn starts-with-a?
  "Recebe uma string e devolve true se ela começa com o caracter \\A."
  [s]
  (= (first s) \A))

;; 7. verb?
(defn verb?
  "Recebe uma string e devolve true se ela termina com o caracter \\r."
  [s]
  (= (last s) \r))

;; 8. vowel?
(defn vowel?
  "Recebe um caracter e devolve true se ele é uma vogal minúscula."
  [c]
  (or (= c \a) (= c \e) (= c \i) (= c \o) (= c \u)))

;; 9. eq-heads?
(defn eq-heads?
  "Recebe duas coleções e devolve true se elas têm o mesmo primeiro elemento."
  [c1 c2]
  (= (first c1) (first c2)))

;; 10. vowel-2?
(defn vowel-2?
  "Recebe um caracter e devolve true se ele é uma vogal, minúscula ou maiúscula."
  [c]
  (contains? #{\a \e \i \o \u \A \E \I \O \U} c))
