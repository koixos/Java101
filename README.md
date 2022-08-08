# Java101
Kodluyoruz JAVA101 eğitimi ödevleri

---
## Bölüm 1 - Temel Kavramlar ve Değişkenler

### **Not Ortalaması Hesaplama Programı**
 Kullanıcıdan aldığı çeşitli ders notlarının *-herhangi bir katsayılandırma yapmadan-* ortalamasını hesaplar.
  
### **KDV Tutarı Hesaplama Programı**
Kullanıcıdan aldığı para miktarına göre KDV'li tutar hesaplar. Eğer asıl miktar ***1000 TL ve altındaysa %18*, *1000 TL üstündeyse %8*** oranında KDV uygulanır.
  
### **Üçgende Çevre ve Alan Hesaplama Programı**
Kullanıcıdan aldığı kenar uzunluklarına göre üçgenin çevresini ve alanını hesaplar.
  
### **Taksimetre Hesaplama Programı**
Kullanıcıdan aldığı mesafeye göre ödenecek taksimetre tutarını hesaplar. Taksimetre açılış ücreti 10 TL, kilometre başına taksimetre ücreti 2.20 TL'dir. 20 TL altı mesafelerde sabit olarak 20 TL alınmaktadır.
  
### **Daire Diliminde Alan Hesaplama Programı**
Kullanıcıdan aldığı yarıçap ve merkez açısı ölçüsüne göre daire diliminin alanını hesaplar.
  
### **Vücut Kitle Endeksi Hesaplama Programı**
 Kullanıcıdan aldığı boy ve kilo değerlerine göre VKE hesaplar.
  
### **Manav Kasa Tutarı Hesaplama Programı**
Kullanıcıdan aldığı meyve/sebzelerin kilo miktarlarına göre ödenmesi gereken toplam tutarı hesaplar.

---
## Bölüm 2 - Koşullu Ifadeler ve Kod Blokları

### **Basit Hesap Makinesi**
Kullanıcıdan aldığı iki sayı değeri ve işlem koduyla istenilen hesaplamayı yapar. (Yalnızca dört işlem yapabilir: toplama, çıkarma, çarpma, bölme.)
  
### **Kullanıcı Giriş Ekranı**
Sisteme kayıtlı olduğu varsayılan bir kullanıcı için giriş ekranıdır. Alınan kullanıcı adı ve şifre bilgilerini sistemde kayıtlı olan bilgilerle kıyaslar. Şifre hatalı olması durumunda sıfırlama seçeneği sunar.

### **Sınıfı Geçme/Kalma Durumu Sorgulama**
Kullanıcıdan aldığı notların genel ortalamasına göre hesaplama yapar. *Girilen not değerleri 0-100 aralığında değilse ortalamaya 0 olarak katılır.*

### **Sıcaklığa Göre Etkinlik Önerme**
Kullanıcıdan alınan hava sıcaklığı derecesine göre yapılabilecek aktivite önerir.

### **Sayı Sıralama**
Kullanıcıdan aldığı 3 sayıyı küçükten büyüğe sıralar.

### **Burç Bulma**
Kullanıcıdan aldığı doğum ayı ve günü değerlerine göre kullanıcının burcunu hesaplar. Geçersiz değerler girilmesi durumunda hata verir. (**örn: ay -> 2 , gün -> 30 : HATA, Şubat 30 çekemez**)

### **Uçak Bileti Hesaplama**
Kullanıcıdan aldığı mesafe, yaş ve yolculuk tipine göre bilet fiyatı hesaplar.
* Kilometre başına 0.10 TL ücret alınır.
* Yaş 12'den küçükse %50, 12-24 aralığındaysa %10, 65'ten büyükse %30 indirim uygulanır.
* Gidiş-Dönüş seçeneği seçildiyse her bir bilete %10 indirim uygulanır.

### **Çin Zodyağı Hesaplama**
Kullanıcının doğum yılına göre Çin Zodyağını hesaplar.

### **Artık Yıl Mı?**
Kullanıcıdan aldığı yılın artık yıl olup olmadığını kontrol eder.
* **Artık yıllar 4 rakamının katı olan yıllardır.** (1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024)
* **100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır.** (1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.)

---
## Bölüm 3 - Döngüler

### **3 ve 4 ile Tam Bölünen Sayıların Ortalamasını Hesaplama**
Sıfırdan *-sıfır dahil değil-* Kullanıcıdan alınan limit değere kadar olan sayılardan 3 ve 4 ile tam bölünen sayıların ortalamasını hesaplar.

### **Çift ve 4'ün Katı Olan Sayıların Toplamı**
Tek bir sayı girilene kadar kullanıcıdan sayı alır. Bunlardan 4'ün katı olan sayıları toplayıp sonucu bastırır.

### **4'ün ve 5'in Kuvvetlerini Hesaplama**
Kullanıcıdan alınan sınır değere kadar 4'ün ve 5'in kuvvetlerini hesaplar.

### **Kombinasyon Hesaplama**
Kullanıcıdan aldığı verilere göre kombinasyon hesabı yapar.

### **Kuvvet Hesaplama**
Kullanıcıdan aldığı tabanın istenilen kuvvetini hesaplar.

### **Basamak Değeri Hesaplama**
Kullanıcıdan aldığı sayının basamak değerlerinin toplamını hesaplar.

### **Harmonik Seri Hesaplama**
Kullanıcıdan aldığı sayının harmonik serisini hesaplar.

### **Yıldızlarla ELmas Çizme**
Kullanıcıdan aldığı basamak sayısına göre yıldızlarla elmas çizer.

### **ATM Projesi**
Basit ATM işlemleri sunar: para yatırma, para çekme, bakiye sorgulama gibi. *-Sisteme kayıtlı olduğu varsayılan-* kullanıcıdan giriş bilgileri istenir. Toplamda 3 deneme hakkı vardır, maksimum üç denemeden sonra hesap bloke olur. Sisteme giriş yaptıktan sonra menüden istenilen işlem seçilir.

### **EBOB - EKOK Hesaplama**
Kullanıcıdan aldığı iki sayının EBOB ve EKOK'unu hesaplar.

### **Maksimum - Minimum Belirleme**
Kullanıcının girdiği sayılar arasından maksimum ve minimum değerleri bulur.

### **Ters Üçgen Çizme**
Kullanıcıdan aldığı basamak sayısına göre ters bir üçgen çizer.

### **Asal Sayı Bulma**
1-100 arasındaki asal sayıları bulur.

### **Fibonacci Serisi Hesaplama**
Eleman sayısı kullanıcıdan alınan Fibonacci serisini hesaplar.

---
## Bölüm 4 - Metotlar

### **Palindrom Sayı Mı?**
Kullanıcıdan alınan bir sayının Palindromik olup olmadığına bakar.
* Palindrom Sayı: Iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

### **Recursive ile Fibonacci Serisi Hesaplama**
Eleman sayısı kullanıcıdan alınan Fibonacci serisini recursive metotla hesaplar.

### **Geliştirilmiş Hesap Makinesi**
4 işlem haricinde mod alma, üs alma, faktöriyel hesaplama, *(dikdörtgen/kare için)* alan ve çevre hesaplama gibi işlevlere sahiptir.

### **Recursive ile Üs Hesaplama**
Kullanıcıdan alınan taban ve kuvvet değerlerine göre recursive metot ile üs hesaplar.

### **Recursive ile Asallık Kontrol Etme**
Kullanıcıdan alınan sayının asal olup olmadığını recursive metot ile kontrol eder.

### **Recursive ile Sayı Deseni Oluşturma**
Kullanıcıdan alınan sayı ile kurala göre desen oluşturur.
* Sayının 0 veya negatif olduğu yere kadar sayıdan 5 eksiltilir. Sayı negatif veya 0 olduktan sonra tekrar 5 artırılır.
* **örn:** sayı: 16 --> Çıktı: 16 11 6 1 -4 1 6 11 16

---
## Bölüm 5: Sınıflar

### **Basit Öğrenci Bilgi Sistemi Taslağı**
Öğrenci ve öğretmenler için oluşturulmuş, arayüzsüz, basit bilgi sistemi taslağı.

### **Boks Oyunu Taslağı**
Sisteme girilen oyuncuların hasar ve sağlık değerlerine göre basit bir oyun tasarlar.
* Ilk hamleyi yapacak oyuncu %50 şansla seçilir.
* Hedefin ıskalama şansı değerine göre rakibin hamlesi bloklanabilir.

### **Maaş Hesaplayıcı**
Çalışanın bilgilerine göre net maaşını hesaplar.
* Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
* Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
* Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücreti hesaplanacak.
* Çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
* Çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
* Çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
---
## Bölüm 6: Diziler

### **Harmonik Ortalama Hesaplama**
Kullanıcıdan aldığı serinin harmonik ortalamasını hesaplar.

### **En Yakın Maks/Min Sayıyı Bulma**
Kullanıcıdan alınan seride, istenilen sayıya en yakın maksimum ve minimum değerleri bulur.

### **Matriks ile "B" Harfi Oluşturma**
Çok boyutlu dizi kullanarak ekrana "B" harfini bastırır.

### **Dizideki Tekrarlayan Çift Sayıları Belirleme**
Girilen dizideki tekrarlayan çift sayıları indisleriyle birlikte gösterir.

### **Dizideki Elemanları Sıralama**
Kullanıcıdan alınan bir dizideki elemanları küçükten büyüğe sıralar.3

## **Links**
[patika.dev](https://www.patika.dev)
