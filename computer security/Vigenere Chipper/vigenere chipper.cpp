#include<iostream>
#include<string.h>
#define MAX 999

// Coded by Aditya Fajri (1800018359)
 
using namespace std;
 
int main(){
	
	// Plaintext yang akan di enkripsi, dan kunci yang digunakan
	char SPASI = ' ' ;
    char plainText[MAX] = "TEKNIK INFORMATIKA FTI UNIVERSITAS AHMAD DAHLAN YOGYAKARTA";
    char key[MAX] = "GADALAWAN";
    
    // Mengetahui panjang plaintext & key
    int panjangPlainText = strlen(plainText);
	int panjangKey = strlen(key);
	int i, j;
	
	// Deklarasi kunci baru, karena vigenere kuncinya berulang tiap huruf plaintext
    char keyBaru[panjangPlainText], enkripsi[panjangPlainText], dekripsi[panjangPlainText];
 
    for(i = 0, j = 0; i < panjangPlainText; i++, j++){
    	
    	// Mereset kunci jika sudah sampai huruf terakhir, dan mengulang dari huruf awal lagi
        if(j == panjangKey){
        	j = 0;	
		}
		
		// Proses membuat kunci yang baru
		if(plainText[i] == SPASI){
			keyBaru[i] = SPASI;
			j--;
		}else {
			keyBaru[i] = key[j];
		}
 
    }
 	
 	// Karena fungsi mencari panjang dimulai dari 1, dan Array dimulai dari 0, maka kita
 	// meng NULL kan indeks terakhir
    keyBaru[i] = '\0';
	
	// Proses Enkripsi
    for(i = 0; i < panjangPlainText; i++){
    	if (plainText[i] != SPASI){
			// Menggunakan rumus yang ada di modul + convert ascii dengan perintah 'A'	
    		enkripsi[i] = ((plainText[i] + keyBaru[i]) % 26) + 'A';
		}else {
			enkripsi[i] = SPASI;
		}
		
	}
	
	for(i = 0; i < panjangPlainText; i++){
		if (plainText[i] != SPASI){
			// Menggunakan rumus yang ada di modul + convert ascii dengan perintah 'A'
			dekripsi[i] = (((enkripsi[i] - keyBaru[i]) + 26) % 26) + 'A';
		}else {
			dekripsi[i] = SPASI;
		}
	}
    
    // Karena fungsi mencari panjang dimulai dari 1, dan Array dimulai dari 0, maka kita
 	// meng NULL kan indeks terakhir
    enkripsi[i] = '\0';
 
 
    cout<<"Plaintext : "<<plainText << endl;
    cout<<"Kunci : "<<key << endl;
    cout<<"Kunci Baru : "<<keyBaru << endl;
    cout<<"Enkripsi : "<<enkripsi << endl;
    cout<<"Dekripsi : "<<dekripsi << endl;

	return 0;
}
