LOOPS - tema

CERINTA

*Un program "Validator de Username" folosind logica Java (bucle do-while și for)*

Reguli de Validare:
○	Lungimea: Trebuie să fie între 6 și 12 caractere, inclusiv.
○	Fără Spații: Nu trebuie să conțină spații. Dacă se introduce un username cu spații, programul trebuie să afișeze o eroare specifică și să ceară din nou input (fără a mai verifica celelalte reguli pentru inputul curent).
○	Cifre: Trebuie să conțină cel puțin o cifră (0-9).



REZOLVARE

- importam clasa Scanner pentru a putea parcurge un text folosind expresii regulate (*import java.util.Scanner;*)
- folosim *Scanner scanner = new Scanner(System.in);* pentru a citi textul introdus de utilizator in urma unui prompt afisat
- folosim o variabila de tip boolean (*isValid* cu valoarea *true* la inceput) pentru a sti daca username-ul este valid
- folosim o bucla *do-while* in care afisam prompt-ul pentru introducerea username-ul, urmand apoi sa parcurgem validarea
- prima validare: lungimea username-ului (folosim o interogare *if* cu o conditionare negativa, adica inafara valorilor permise: *username.length() < 6 || username.length() > 12*)
- in cazul in care username-ul nu are lungimea ceruta, afisam un mesaj corespunzator si transformam variabila *isValid* in *false*, pentru a repeta bucla
- pentru verificarea daca username-ul contine cifre sau spatii folosim o structura *for-each* care parseaza string-ul introdus de utilizator, cautand cifre(*hasDigit*) sau spatii(*hasSpace*)
- in cazul in care gaseste spatii, afisam mesaj corespunzator si iesim din bucla cu *break*, transformand *isValid* in *false* pentru a repeta bucla *do-while*
- in cazul in care gaseste o cifra in username-ul parsat, *hasDigit* devine *true* si *isValid* devine *true*, urmand sa iesim din bucla cu *break*
- daca nu gaseste cifra (*hasDigit* este *false*) atunci afisam mesaj corespunzator si *isValid* devine *false* pentru a repeta bucla *do-while*
- daca *isValid* este *true* la sfarsitul buclei *do-while*, atunci afisam mesaj de confirmare a username-ul cerut



TESTARE

- username avand mai puțin de 6 caractere (e.g. user) -> mesaj de eroare: "Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere."
- username avand mai mult de 12 caractere (e.g. usernamevalid) -> mesaj de eroare: "Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere."
- username continand spatii (e.g. user name) -> mesaj de eroare: "Eroare: Username-ul nu poate conține spatii."
- username avand intre 6 si 12 caractere, insa nu contine cifra (e.g. usernamebun) -> mesaj de eroare: "Eroare: Username-ul trebuie sa contina cel putin o cifra."
- username conform cu cerinta (e.g. user123) -> mesaj de confirmare "Username acceptat: " + username