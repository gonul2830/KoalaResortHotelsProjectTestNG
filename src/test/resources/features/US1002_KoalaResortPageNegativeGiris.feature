@K.N.
Feature: US1002 Koala Resort Page Negative Giris

  Background: sayfayi acma
    Given Kullanıcı KOALARESORTHOTELS sayfasına gider
    Then Log in yazisina tiklar

  Scenario: TC02 kullanici gecersiz surname ile giremez

    And gecersiz username girer
    And   gecerli password girer
    And   Login butonuna basar
    And kullanici sayfaya giris yapamadigini kontrol eder

  Scenario: TC03 kullanici gecersiz password  ile giremez

    And gecerli username girer
    Then gecersiz password girer
    And   Login butonuna basar
    And kullanici sayfaya giris yapamadigini kontrol eder

  Scenario: TC04 kullanici gecersiz surname & password  ile giremez

    And gecersiz username girer
    Then gecersiz password girer
    And   Login butonuna basar
    Then kullanici sayfaya giris yapamadigini kontrol eder
    And   sayfayi kapatir