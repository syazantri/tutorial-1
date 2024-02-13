<h2 align="center">Reflection🪞✨</h2>
<p align="center">
    Syazantri Salsabila - 2206029443 - AdvProg B
    <br>
    <a align="center" href="https://eshop-adpro-syazantri.koyeb.app/">View Site 🔗</a>
</p>
<br>

<details>
    <summary>1️⃣ Module 1 - Coding Standards 💯</summary>
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
</details>
<details>
    <summary>2️⃣ Module 2 - CI/CD & DevOps 👔</summary>
    1. List the code quality issue(s) that you fixed during the exercise and explain your strategy on fixing them.
    <br>
    ~ Jawab:
    <br>
    - Unused import <br>
    Terdapat beberapa import yang tidak digunakan, cara fix nya dengan menghapus import tersebut. <br>
    - Unnecessary modifier <br>
    Terdapat modifier public yang sebenarnya tidak diperlukan karena method-method tersebut berada dalam interface yang mana pada defaultnya public tanpa harus diberi modifier public sebelumnya. Oleh karena itu cara fiixnya adalah dengan menghapus modiifier publiic tersebut. <br>
    - Avoid using implementation class instead of interface
    Pada class ProductRepository.java, saya sebelumnnya menggunakan Hashmap untuk menyimpan pemetaan dari id ke suatu produk. Cara mendeklarasikan hashmap tersebut adalah seperti ini: private HashMap<String, Product> idToProductMap = new HashMap<>(); <br> Setelah itu private HashMap saya ubah (fix) menjadi private Map saja agar deklarasi tersebut merupakan implementasi dari interface (agar mudah diubah jika ada yang mau diubah). <br>
        <hr>
2. Look at your CI/CD workflows (GitHub)/pipelines (GitLab). Do you think the current implementation has met the definition of Continuous Integration and Continuous Deployment? Explain the reasons (minimum 3 sentences)! <br>
        ~ jawab:
        <br>
Menurut saya, implementasi kode saya sekarang sudah menerapkan definisi dari Continuous Integration and Continuous Deployment (CI/CD). Pertama untuk CI, di dalam kode saya sudah ada beberapa file yml seperti ci.yml, pmd_action.yml, dan scorecard.yml. File-file yml tersebut menjadikan ketika ada push kode ke github (ada perubahan kode), akan dilakukan pengecekan dengan run testing yang telah dibuat, serta code scanning analysis. Lalu untuk CD walaupun tidak membuat workflow, mendeploy dengan koyeb memungkinkan saya untuk melakukan CD. Hal itu dapat terlihat ketika ada perubahan yang dipush ke repo github ke branch masternya, koyeb langsung melakukan autodeploy berdasarkan kode terbaru yang telah dipush tersebut.

</details>
