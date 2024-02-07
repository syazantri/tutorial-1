<h2 align="center">Reflection 🪞✨</h2>
<p align="center">Syazantri Salsabila - 2206029443 - AdvProg B</p>
<br>

<details>
    <summary>🐣 Reflection 1 🐣</summary>
  
  Prinsip clean code yang sudah diterapkan:
  <br>
  1. Meaningful Names : Saya rasa seluruh variabel dan method saya sudah memiliki nama yang jelas dan meaningful sepertii misalnya idToProductMap merupakan sebuah hashmap yang berisi pemetaan id ke product.
  2. Function : Fitur pada kode saya ini telah terbagii menjadi fungsi-fungsi yang tiap fungsi hanya menjalankan fokus satu tugas saja.
  3. Error handling : Walaupun tidak semua, saya telah menerapkan beberapa error handling seperti jika id product tidak ditemukan, akan mengirim null, dan jika mendapatkan nilai null, fungsii tidak dijalankan.
  <hr>
  Prinsip secure code yang sudah diterapkan:
  <br>
Dalam menginput quantity barang, saya telah memastikan bahwa inputnya berupa angka.
  <br>
  <hr>
  Cara mengimprove kode:
  <br>
  Bisa dengan menambah handling error misalnya membuat pop-up notifikasi ketika error sehingga user lebih dapat mengetahui apa kesalahannya, bisa juga dengan menambahkan comment ke method-methood yang mungkin kurang jelas maksudnya apa jika dibaca langsung begitu saja tanpa ada comment. Lalu untuk secure coding, bisa ditambah fitur autentikasi pengguna agar productnya hanya bisa dilihat dan diupdate oleh dirinya sendiri.
  <br>
</details>
<details>
    <summary>🐠 Reflection 2 🐠</summary>
  1: Setelah membuat unit test, saya merasa lebih percaya dengan fitur-fitur yang saya buat. Hal ini karena saya telah mengetes apakah fitur tersebut telah berjalan sesuai kemauan saya atauu belum. Dalam sebuah kelas, unit test yang diibuat tidak tentu harus berapa jumlahnya, bergantung pada kompleksitas method-method dalam class tersebut, tetapi untuk code coverage minimum biiasanya disarankan 80%. Untuk memastikan bahwa unit test yang kita buat telah cukup memverifikasi program kita, kita perlu mengecek code coveragenya (disarankan 80% code coverage dengan seluruh fitur telah ditest). Ketika memiliki 100% code coverage, belum tentu kode kita pasti tidak memiliki bug atau error karena bisa saja sudah tercover seluruh fitur tetapi jelek kualitas testnya (tidak sampai edge case).
  <br>
  <hr>
  2: Menurut saya, jika harus membuat class java baru untuk mengecek jumlah item, code saya nantinya tidak terlalu bagus atau clean (menurunkan kualitas kode). Hal itu karena sebenarnya hal yang dilakukan dengan CreateProductFunctionalTest.java, class java yang baru dibuat ini fungsinya cukup mirip yaitu mngecek nama dan mengecek jumlah. Masalah tadi dapat menjadikan code mengandung duplikasi. Maka, solusinya bisa dengan menyatukan kedua class tersebut. Penyatuan code ini akan membuat debugging jauh lebih mudah juga (tidak harus mengecek dua class yang sebenarnya fungsinya mirip).
</details>
