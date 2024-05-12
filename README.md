# Kütüphane Yönetim Sistemi

Bu proje, kütüphane yönetimini kolaylaştırmak için geliştirilmiş bir Java uygulamasıdır. 
Kitapları, yazarları, yayınevlerini ve kategorileri yönetmek için temel CRUD (Create, Read, Update, Delete) işlemlerini gerçekleştirir.

## Proje Yapısı

Proje, Java dilinde geliştirilmiş ve Maven proje yöneticisi kullanılarak yapılandırılmıştır. Temel bileşenleri şunlardır:

- **Author (Yazar):** Yazarların bilgilerini temsil eden sınıftır.
- **Book (Kitap):** Kütüphanedeki kitapların bilgilerini temsil eden sınıftır.
- **BookBorrowing (Kitap Ödünç Alma):** Kullanıcıların kitapları ödünç aldığı zamanın bilgilerini temsil eden sınıftır.
- **Category (Kategori):** Kitapların kategorilerini temsil eden sınıftır.
- **Publisher (Yayınevi):** Yayınevlerinin bilgilerini temsil eden sınıftır.

Her bir sınıf, ilgili veritabanı tablosunu temsil eder ve ilişkisel veritabanı modellemesi kullanılarak birbirleriyle ilişkilendirilmiştir.

## Gereksinimler

Projenin çalıştırılması için aşağıdaki yazılımların yüklü olması gerekmektedir:

- Java Development Kit (JDK) 21 veya üzeri
- Apache Maven
- PostgreSQL veritabanı

## Kurulum

1. **Java Development Kit (JDK) kurulumu:** Oracle JDK veya OpenJDK adresinden JDK'yi indirip kurun.

2. **Apache Maven kurulumu:** Maven adresinden Maven'i indirip kurun.

3. **PostgreSQL veritabanı kurulumu:** PostgreSQL adresinden PostgreSQL'i indirip kurun.

4. **Veritabanı Ayarları:**
    - `persistence.xml` dosyasındaki veritabanı bağlantı ayarlarını kendi veritabanı bilgilerinizle güncelleyin.

5. **Projeyi derleme ve çalıştırma:**
    - Terminal veya Komut İstemi'ni açın.
    - Proje dizinine gidin.
    - `mvn clean install` komutunu çalıştırarak projeyi derleyin ve paketleyin.
    - Derleme işlemi başarıyla tamamlandıktan sonra, `mvn spring-boot:run` komutunu kullanarak uygulamayı çalıştırın.

6. **Uygulamayı test etme:**
    - Uygulamayı başarıyla çalıştırdıktan sonra, [http://localhost:8080](http://localhost:8080) adresine giderek uygulamaya erişebilirsiniz.

## Kullanım

Uygulama başlatıldığında, kullanıcılar kütüphanedeki kitapları görüntüleyebilir, 
yeni kitaplar ekleyebilir, varolan kitapları güncelleyebilir veya silebilir. 
Aynı işlemler yazarlar, yayınevleri ve kategoriler için de yapılabilir.

## Katkıda Bulunma

Katkıda bulunmak isterseniz, lütfen bir GitHub pull isteği gönderin. Önerileriniz ve katkılarınız memnuniyetle karşılanacaktır.

