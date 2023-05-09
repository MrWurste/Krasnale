# Krasnale
Część pierwsza:
Bartosz Mróż:
"Jeden krasnal ma za zadanie załadować wszystkie plecaki z zapasami na podróż do lasu. Niestety, ten krasnal nie do końca przestrzegał instrukcji pakowania, więc kilka przedmiotów musi zostać przestawionych.
Każdy plecak ma dwie duże komory. Wszystkie przedmioty danego typu mają trafić dokładnie do jednej z dwóch przegródek. Krasnal, który pakował, nie przestrzegał tej zasady dla dokładnie jednego rodzaju przedmiotu na plecak.
Krasnale sporządziły listę wszystkich przedmiotów znajdujących się obecnie w każdym plecaku (dane wejściowe), ale potrzebują twojej pomocy w znalezieniu błędów. Każdy typ elementu jest identyfikowany pojedynczą małą lub wielką literą (to znaczy a i A odnoszą się do różnych typów elementów)
Lista przedmiotów dla każdego plecaka jest podana jako znaki w jednym wierszu. Dany plecak zawsze ma taką samą liczbę przedmiotów w każdej z dwóch przegródek, więc pierwsza połowa znaków reprezentuje przedmioty w pierwszej komorze, podczas gdy druga połowa znaków reprezentuje przedmioty w drugiej komorze.
Załóżmy na przykład, że masz następującą listę zawartości z sześciu plecaków:
vJrwpWtwJgWrhcsFMMfFFhFp
jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
PmmdzqPrVvPwwTWBwg
wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
ttgJtRGJQctTZtZT
CrZsJsPPZsGzwwsLwLmpwMDw
Pierwszy plecak zawiera przedmioty vJrwpWtwJgWrhcsFMMfFFhFp, co oznacza, że jego pierwsza komora zawiera przedmioty vJrwpWtwJgWr, podczas gdy druga komora zawiera przedmioty hcsFMMfFFhFp. Jedynym typem przedmiotu, który pojawia się w obu przegródkach, jest p.
Drugie przegródki plecaka zawierają jqHRNqRjqzjGDLGL oraz rsFMfFZSrLrFZsSL. Jedynym typem przedmiotu, który pojawia się w obu przegródkach, jest L.
Komory trzeciego plecaka zawierają PmmdzqPrV oraz vPwwTWBwg; Jedynym typem elementu jest litera P.
Przegródki czwartego plecaka dzielą tylko typ przedmiotu v
Przegródki piątego plecaka dzielą tylko typ przedmiotu t
Przegródki szóstego plecaka dzielą tylko typ przedmiotu s
Aby nadać priorytet zmianie rozmieszczenia elementów, każdy typ elementu można przekonwertować na priorytet:
Typy elementów pisane małymi literami mają priorytety od 1 do 26 (a = 1, z = 26)
Typy elementów pisane wielkimi literami mają priorytety od 27 do 52 (A = 27, Z = 52)
W powyższym przykładzie priorytet typu przedmiotu, który pojawia się w obu przegródkach każdego plecaka, wynosi 16 (p), 38 (L), 42 (P), 22 (v), 20 (t) i 19 (s); Suma tych priorytetów to 157.
Znajdź typ przedmiotu, który pojawia się w obu przegródkach każdego plecaka. Jaka jest suma priorytetów tych typów towarów? (edited)"
Część 2:
Bartosz Mróz:
Krasnale wybierają się do lasu na wycieczkę. Każdy z nich bierze zapasy w plecak. Krasnale są jednak bardzo dokładne, ponieważ wcześniej spisują ile kalorii zawiera każdy posiłek, który zabrał krasnal do plecaka. Dane zapisane są w postaci:
1000
2000
3000
4000
5000
6000
7000
8000
9000
10000
To znaczy, że pierwszy krasnal wziął posiłki o ilości 1000, 2000, 3000 kalorii, drugi 4000, trzeci 5000 i 6000 itd. – pusta linia oddziela krasnale.
Krasnale muszą wiedzieć do kogo zwrócić się jeżeli skończy im się jedzenie – a zwracać będą się do krasnala, który posiada najwięcej kalorii w plecaku. Dlatego zanim wyjdą na wyprawę sumują ile kalorii niesie ze sobą każdy krasnal. W tym przypadku pierwszy krasnal niesie 6000 kalorii, drugi 4000, trzeci 11 000, czwarty 24 000, piąty 10 000, zatem naszym krasnalem jest czwarty z 24 000 kalorii.
Znajdź krasnala, który ma ze sobą najwięcej kalorii – ile niesie kalorii?
Dodatkowo krasnale wiedzą, że mogą wyjeść wszystkie zapasy od tego krasnala zatem chcą mieć w zapasie łącznie trzech krasnali, którzy niosą najwięcej kalorii na plecach.
W powyższym przykładzie jest to czwarty, trzeci i piąty elf, zatem suma kalorii, które niosą to 45000.
Znajdź trzy najlepsze krasnale z największą ilością kalorii. Ile kalorii noszą w sumie te krasnale?
