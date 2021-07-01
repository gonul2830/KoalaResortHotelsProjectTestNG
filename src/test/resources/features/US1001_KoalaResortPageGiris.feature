@K.P.
Feature: US1001 Koala Resort Page Giris

  Scenario: TC_01 kullanici pozitive girişi

    Given Kullanıcı KOALARESORTHOTELS sayfasına gider
    Then  Log in yazisina tiklar
    And   gecerli username girer
    And   gecerli password girer
    And   Login butonuna basar
    Then  sayfaya giris yaptigini kontrol eder
    And   sayfayi kapatir