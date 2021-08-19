# vizsgaREMEK
EXAMWORK - IKK - CodeCool

Allure report linkje:
https://davidkirchknopf.github.io/vizsgaREMEK/

A feladat az volt, hogy egy - általunk - tetszőlegesen kiválasztott 
honlapon a megadott opciók szerint úgysmint:

 1 .Regisztráció
 2. Bejelentkezés
 3. Adatkezelési nyilatkozat használata
 4. Adatok listázása
 5. Több oldalas lista bejárása
 6. Új adat bevitel
 7. Ismételt és sorozatos adatbevitel adatforrásból
 8. Meglévő adat módosítás
 9. Adat vagy adatok törlése
 10.Adatok lementése felületről
 11.Kijelentkezés

lehetőségeinkhez mérten, legalább egy tesztesettel fedjünk le, magyarul teszteljük automatizálással. 

Az én választásom, a méltán népszerű http://myvip.com/ oldalra esett.

Az alábbi módokon teszteltem:

Az első lépés a legtöbb esetben, hogy Angol nyelvezetre váltok, majd belépés.

 1 .Regisztráció
Főoldalra belépés, Regisztrációra gombra kattintás, majd adatok kitöltése. Sajnos a Captchat nem tudtam automatizálni, ezért a teszt eset az volt, hogy a Weboldal az alsó regisztráció gomb megnyomása után hiányolja a Captcha kitöltését és hibára fusson, ami megvalósult.

 2. Bejelentkezés
Sikeres belépés tesztelése

 3. Adatkezelési nyilatkozat használata
A bejelentkezés előtt, az adatkezelésre kattintva, a megjelenített szöveg kinyerése, az elmentése majd teszttel annak ellenőrzése, hogy a nyilatkozat egyes elemei szerepelnek e a kimentett fájlban.

 4. Adatok listázása
Nevek kilistázása a Kit ismerhetek fülön, majd annak tesztelése, az adott oldalon tényleg annyi azonos nevü szerepel e, ahány elő van írva.

 5. Több oldalas lista bejárása
Részletes keresés és lapozás, majd annak tesztelése, hogy a megfelelő oldal lett e a művelet végén kiválasztva, ami más szinezést is kapott.

 6. Új adat bevitel
Levél írásának tesztelése, egy megadott szöveg által, majd annak ellenőrzése, hogy sikeresen elküldésre került.

 7. Ismételt és sorozatos adatbevitel adatforrásból
Posztolás egy megadott fájlból, majd annak tesztelése, hogy a poszt elérhető e, ezáltal törölhető -e.

 8. Meglévő adat módosítás
Profil adatainak módosítása egy random függvény generálása által, majd azon tesztelése, hogy sikeresen elmentődött-e.

 9. Adat vagy adatok törlése
Új kép feltöltése, törlése és pontos számozása, ami később hibára fut, ami az oldal helytelen működésé miatt keletkezik.

 10.Adatok lementése felületről
MyVIP Ági nevének letöltése, majd elmentése egy fájlba és ellenőrzése, hogy ténylegesen elmentésre került az adott szöveg.

 11.Kijelentkezés
Sikeres kijelentkezés, majd annak ellenőrzése, hogy az adott oldalra érkeztem.