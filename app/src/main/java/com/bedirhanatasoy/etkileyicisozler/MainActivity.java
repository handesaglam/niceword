package com.bedirhanatasoy.etkileyicisozler;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> sozler;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(1);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        sozler = new ArrayList<>();

        sozler.add("Öyle güzel susarım ki, sağır olursun.");

        sozler.add("Ey yalnızlık nikâh mı kıydın bana. Helalimmişsin gibi her gece giriyorsun koynuma.");

        sozler.add("Büyük adamın hatası da büyük olur.");

        sozler.add("Yağmurlar düşünce tenime her damlayı sen sanıp aşk bildim. Ve biliyor musun gölgeni bile çok özledim.");

        sozler.add("Yanmak var, yanmak var. Odun yanınca kül olur, insan yanınca kul olur!");

        sozler.add("Bir hayli kırgınım. Kime olduğunu, neden olduğunu bilmeden. Belki hayata, belki kendime, belki de dilimden düşmeyen keşke’lere.");

        sozler.add("Silahlanma dünyanın en pahalı hurdalığıdır.");

        sozler.add("Kapı açılır, sen yeter ki vurmayı bil. Ne zaman bilmem, sen yeter ki o kapıda durmayı bil.");

        sozler.add("Yanaklarım dururken canımı sıkman çok saçma.");

        sozler.add("Ertelemek yaşamın mayasını kaçırır. Kızdıysan bağır, sevindiysen söyle, özlediysen arkasından ");

        sozler.add("Özlemek, ölmekten sadece iki harf fazla be çocuk…");

        sozler.add("Hadi simit satanı anladım, kestane satanı da. Peki ya dost satan, o da mı ekmek parası?");

        sozler.add("Öğrendim ki; her yarayı saran zaman değil sevgidir.");

        sozler.add("Ne diye böbürlenip büyükleniyorsun? Doğumun bir damla su, ölümün bir avuç toprak değil mi?");

        sozler.add("Sarhoşken söylenen her söz, ayıkken düşünülmüştür.");

        sozler.add("Birer birer, seve seve çıktığım aşk basamaklarını; onar onar, söve söve iniyorum ");

        sozler.add("Üç şeyi kötü günlerinde dene, dostunu, sabrını ve eşini.");

        sozler.add("Arkadaş kaybetmek diye bir şey yoktur, kimin gerçek arkadaşın olduğunu fark etmek diye bir şey vardır.");

        sozler.add("Bir öleni geri getiremezsiniz, bir de kaybolan güveni.");

        sozler.add("Mutlu olmak kimin umrunda, sen yanımda oI yeter.");

        sozler.add("Ben dostlarımı hiç satmadım! Çünkü ya beş para etmez çıktılar ya da paha biçilemez…");

        sozler.add("Bekârken iki gözünü aç, evlendikten sonra birini kapat.");

        sozler.add("Ben birini çok sevmek, ona çok güvenmek istiyorum. O biri de sen ol istiyorum. Çok mu çok şey istiyorum?");

        sozler.add("Kardeşlerimi tanrı yarattı; fakat dostlarımı ben buldum.");

        sozler.add("Uykumun içinde bir rüya, rüyamda bir gece, gecede ben. Bir yere gidiyorum, delice… Aklımda sen.");

        sozler.add("Öpülen bütün nimetler içinde en güzeli senin dudakların.");

        sozler.add("Allah kuluna üç şekilde cevap verir; ‘evet’ der, istediğini verir; ‘hayır’ der, daha iyisini verir; ‘bekle’ der ve en iyisini verir…");

        sozler.add("Uykular ikiye ayrılır; gece gelmeyenler, sabah gitmeyenler.");

        sozler.add("Hayat sana arka arkaya dikenlerini gösteriyorsa sakın üzülme, aksine sevin. Çünkü çok yakında gülü de gösterecektir.");

        sozler.add("Kim bilir kaç kişi ayrı yataklarda birbirine sarılarak uyuyordur.");

        sozler.add("Kimse eşit doğmaz. Ama herkes eşit ölür. İşte onun için ölüm, acı bir son değildir. Hayatımızın yegâne adil başlangıcı ve biricik fırsat eşitliğidir.");

        sozler.add("Hiç yanımda olmayan birinin, hep aklımda olması çok tuhaf değil mi?");

        sozler.add("Paslı bir yalnızlıktı avuçlarımda, ardımda bir yürek yükü rüzgâr. Ne zaman sevmeye koyulsam, doğrulup çoğaldı ayrılıklar.");

        sozler.add("Tekrar tekrar aynı şakaya gülmeyiz ama defalarca aynı şeye ağlayabiliriz.");

        sozler.add("Sen bakma benim bu kadar hüzünlü şeyler yazdığıma, ben çok gülerim. Ve gülerken hiç kimse yalan olduğunu anlayamaz.");

        sozler.add("Ne kazandığını bilmiyorum ama umarım beni kaybettiğine değmiştir.");

        sozler.add("Benim ayağımın altıda müsait başımın üstü de nerede olacağını sen belirle.");

        sozler.add("Ayna benim en iyi arkadaşımdır, çünkü ben ağladığımda, o asla gülmez.");

        sozler.add("Önce sevdiğiniz terk eder sizi, ardından uykunuz. Sonra ne sevdiğiniz geri gelir ne de uykunuz.");

        sozler.add("Düzelir her şey bir gün ama bil ki, canın yanmadan mutlu olamazsın.");

        sozler.add("Ve nefrete sevgiden daha çok güvenirim, dedi şeytan; çünkü nefretin sahtesi olmaz!");

        sozler.add("Tanıdığımıza pişman olduklarımız çoğaldıkça, yeni tanışacaklarımızdan korkar olduk.");

        sozler.add("Sabret ki her şey hissettiğin kadar derin ve sonsuz olsun. Sabret ki her şey gönlünce olsun.");

        sozler.add("Seni sevdim seninle sevgili oldum, hatamı yaptım evet. Bir daha yapar mıyım? EVET…");

        sozler.add("Zayıf insanlar intikam alır, güçlü insanlar affeder, zeki insanlar umursamazlar.");

        sozler.add("En basit yalanları gözüme bakarak söyleyen ahmaklar tanıdım. Bense onların cahil cesaretlerine ve kuş beyinlerine hayrandım.");

        sozler.add("Akıllı bir erkek dünyanın en güzel kadınını sevmez, dünyasını güzelleştiren kadını sever.");

        sozler.add("Allah erkeğe altını haram kılmıştır, neden mi? Çünkü erkeğe yakışan tek mücevher, kadındır.");

        sozler.add("Kimi çiftler vardır, ne birbirlerinin hayatına girmeyi ne de çıkmayı becerebilirler.");

        sozler.add("Veda etmek için önce bir araya gelmek gerekir. Bu acımasız hayat sana veda edebilme şansını bile çok gördü bana.");

        sozler.add("Umulmadık bir gün olabilir bugün. Bir çay söyle yağmurların kokusunda.");

        sozler.add("Bir daha âşık olmayacağım dersin, sonra biri gelir seni kocaman kahverengi gözleriyle kendine aşık eder. Öylece kalırsın.");

        sozler.add("İnsanların da yan etkileri var. Bazıları başını döndürürken, bazıları mideni bulandırabiliyor.");

        sozler.add("‘Gitme!’ diyebilecek kadar güçlü olmalı insan. Çünkü hiç kimse, kaybettiklerini unutabilecek kadar güçlü değil.");

        sozler.add("Kaç megapiksel kamerayla fotoğraf çekersen çek, yüzündeki şerefsizlik ifadesi hiç gitmeyecek be adam!");

        sozler.add("Ve dövüşebilirim… Doğru bulduğum, haklı bulduğum, güzel bulduğum her şey ve herkes için; yaşım başım buna engel değil!");


        sozler.add("Bazen bir söz yoktur. O gün ne olduğunu özetleyecek zekice bir alıntı yoktur. Bazen gün, sadece biter.");

        sozler.add("Mutlu olmak her şeyin yolunda olması demek değildir. Mutlu olmak, görmezden gelme konusunda ustalaşmak demek.");

        sozler.add("İyi geçinmek, iki kişinin kusursuz olmasıyla değil, birbirlerinin kusurlarını hoş görmesiyle olur.");

        sozler.add("Bazı şarkıların sözlerini unutsan da melodileri aklında kalır. İnsanların da neler yaptığını unutursun; ama hissettirdikleri…");


        sozler.add("Ben kendimi sensizliğe alıştırıyorum. Sen de kendini bensizliğe alıştır diye.");

        sozler.add("Çok sevdiğin ama geri döndüremeyeceğin kişilerin en kötü yanı; onları her hatırladığında, seni tekrar tekrar terk etmeleridir.");

        sozler.add("Çok şey vardı anlatılacak. O yüzden sustum… Birini söylesem diğeri yarım kalacaktı. Az zamana çok şey sığdırmamız gerekiyordu.. Ben de sadece gözlerinin içine bakıp sustum… Sen duydun mu, sustukları mı?");


        sozler.add("Etkileyici güzel sözleri bulacağınız en kaliteli güzel sözler sitemizden sizler için birbirinden etkileyici kaliteli sözleri bir araya getirdik.");

        sozler.add("Öyle güzel susarım ki, sağır olursun.");

        sozler.add("Ey yalnızlık nikâh mı kıydın bana. Helalimmişsin gibi her gece giriyorsun koynuma.");


        sozler.add("Büyük adamın hatası da büyük olur.");

        sozler.add("Yağmurlar düşünce tenime her damlayı sen sanıp aşk bildim. Ve biliyor musun gölgeni bile çok özledim.");

        sozler.add("Yanmak var, yanmak var. Odun yanınca kül olur, insan yanınca kul olur!");

        sozler.add("Bir hayli kırgınım. Kime olduğunu, neden olduğunu bilmeden. Belki hayata, belki kendime, belki de dilimden düşmeyen keşke’lere.");

        sozler.add("Silahlanma dünyanın en pahalı hurdalığıdır.");

        sozler.add("Kapı açılır, sen yeter ki vurmayı bil. Ne zaman bilmem, sen yeter ki o kapıda durmayı bil.");

        sozler.add("Yanaklarım dururken canımı sıkman çok saçma.");

        sozler.add("Ertelemek yaşamın mayasını kaçırır. Kızdıysan bağır, sevindiysen söyle, özlediysen arkasından koş.");

        sozler.add("Özlemek, ölmekten sadece iki harf fazla be çocuk…");

        sozler.add("Hadi simit satanı anladım, kestane satanı da. Peki ya dost satan, o da mı ekmek parası?");

        sozler.add("Öğrendim ki; her yarayı saran zaman değil sevgidir.");

        sozler.add("Ne diye böbürlenip büyükleniyorsun? Doğumun bir damla su, ölümün bir avuç toprak değil mi?");

        sozler.add("Sarhoşken söylenen her söz, ayıkken düşünülmüştür.");

        sozler.add("Birer birer, seve seve çıktığım aşk basamaklarını; onar onar, söve söve iniyorum şimdi.");

        sozler.add("Üç şeyi kötü günlerinde dene, dostunu, sabrını ve eşini.");

        sozler.add("Arkadaş kaybetmek diye bir şey yoktur, kimin gerçek arkadaşın olduğunu fark etmek diye bir şey vardır.");

        sozler.add("Bir öleni geri getiremezsiniz, bir de kaybolan güveni.");

        sozler.add("Ben dostlarımı hiç satmadım! Çünkü ya beş para etmez çıktılar ya da paha biçilemez…");

        sozler.add("Bekârken iki gözünü aç, evlendikten sonra birini kapat.");

        sozler.add("Ben birini çok sevmek, ona çok güvenmek istiyorum. O biri de sen ol istiyorum. Çok mu çok şey istiyorum?");

        sozler.add("Kardeşlerimi tanrı yarattı; fakat dostlarımı ben buldum.");

        sozler.add("Uykumun içinde bir rüya, rüyamda bir gece, gecede ben. Bir yere gidiyorum, delice… Aklımda sen.");

        sozler.add("Öpülen bütün nimetler içinde en güzeli senin dudakların.");

        sozler.add("Allah kuluna üç şekilde cevap verir; ‘evet’ der, istediğini verir; ‘hayır’ der, daha iyisini verir; ‘bekle’ der ve en iyisini verir…");

        sozler.add("Uykular ikiye ayrılır; gece gelmeyenler, sabah gitmeyenler.");

        sozler.add("Hayat sana arka arkaya dikenlerini gösteriyorsa sakın üzülme, aksine sevin. Çünkü çok yakında gülü de gösterecektir.");

        sozler.add("Kim bilir kaç kişi ayrı yataklarda birbirine sarılarak uyuyordur.");

        sozler.add("Kimse eşit doğmaz. Ama herkes eşit ölür. İşte onun için ölüm, acı bir son değildir. Hayatımızın yegâne adil başlangıcı ve biricik fırsat eşitliğidir.");

        sozler.add("Hiç yanımda olmayan birinin, hep aklımda olması çok tuhaf değil mi?");

        sozler.add("Paslı bir yalnızlıktı avuçlarımda, ardımda bir yürek yükü rüzgâr. Ne zaman sevmeye koyulsam, doğrulup çoğaldı ayrılıklar.");

        sozler.add("Tekrar tekrar aynı şakaya gülmeyiz ama defalarca aynı şeye ağlayabiliriz.");

        sozler.add("Sen bakma benim bu kadar hüzünlü şeyler yazdığıma, ben çok gülerim. Ve gülerken hiç kimse yalan olduğunu anlayamaz.");

        sozler.add("Ne kazandığını bilmiyorum ama umarım beni kaybettiğine değmiştir.");

        sozler.add("Benim ayağımın altıda müsait başımın üstü de nerede olacağını sen belirle.");

        sozler.add("Ayna benim en iyi arkadaşımdır, çünkü ben ağladığımda, o asla gülmez.");

        sozler.add("Önce sevdiğiniz terk eder sizi, ardından uykunuz. Sonra ne sevdiğiniz geri gelir ne de uykunuz.");

        sozler.add("Düzelir her şey bir gün ama bil ki, canın yanmadan mutlu olamazsın.");

        sozler.add("Ve nefrete sevgiden daha çok güvenirim, dedi şeytan; çünkü nefretin sahtesi olmaz!");

        sozler.add("Tanıdığımıza pişman olduklarımız çoğaldıkça, yeni tanışacaklarımızdan korkar olduk.");

        sozler.add("Sabret ki her şey hissettiğin kadar derin ve sonsuz olsun. Sabret ki her şey gönlünce olsun.");

        sozler.add("Anlatmak istemiyor değilim anlaşılmayacağıma eminim bu susmaktan sayılmaz.");

        sozler.add("Seni sevdim seninle sevgili oldum, hatamı yaptım evet. Bir daha yapar mıyım? EVET…");

        sozler.add("Zayıf insanlar intikam alır, güçlü insanlar affeder, zeki insanlar umursamazlar.");

        sozler.add("En basit yalanları gözüme bakarak söyleyen ahmaklar tanıdım. Bense onların cahil cesaretlerine ve kuş beyinlerine hayrandım.");

        sozler.add("Akıllı bir erkek dünyanın en güzel kadınını sevmez, dünyasını güzelleştiren kadını sever.");

        sozler.add("Allah erkeğe altını haram kılmıştır, neden mi? Çünkü erkeğe yakışan tek mücevher, kadındır.");

        sozler.add("Kimi çiftler vardır, ne birbirlerinin hayatına girmeyi ne de çıkmayı becerebilirler.");

        sozler.add("Veda etmek için önce bir araya gelmek gerekir. Bu acımasız hayat sana veda edebilme şansını bile çok gördü bana.");

        sozler.add("Umulmadık bir gün olabilir bugün. Bir çay söyle yağmurların kokusunda.");

        sozler.add("Bir daha âşık olmayacağım dersin, sonra biri gelir seni kocaman kahverengi gözleriyle kendine aşık eder. Öylece kalırsın.");

        sozler.add("İnsanların da yan etkileri var. Bazıları başını döndürürken, bazıları mideni bulandırabiliyor.");

        sozler.add("‘Gitme!’ diyebilecek kadar güçlü olmalı insan. Çünkü hiç kimse, kaybettiklerini unutabilecek kadar güçlü değil.");

        sozler.add("Kaç megapiksel kamerayla fotoğraf çekersen çek, yüzündeki şerefsizlik ifadesi hiç gitmeyecek be adam!");

        sozler.add("Ve dövüşebilirim… Doğru bulduğum, haklı bulduğum, güzel bulduğum her şey ve herkes için; yaşım başım buna engel değil!");

        sozler.add("Bazen bir söz yoktur. O gün ne olduğunu özetleyecek zekice bir alıntı yoktur. Bazen gün, sadece biter.");

        sozler.add("Mutlu olmak her şeyin yolunda olması demek değildir. Mutlu olmak, görmezden gelme konusunda ustalaşmak demek.");

        sozler.add("İyi geçinmek, iki kişinin kusursuz olmasıyla değil, birbirlerinin kusurlarını hoş görmesiyle olur.");

        sozler.add("Bazı şarkıların sözlerini unutsan da melodileri aklında kalır. İnsanların da neler yaptığını unutursun; ama hissettirdikleri…");

        sozler.add("Ben kendimi sensizliğe alıştırıyorum. Sen de kendini bensizliğe alıştır diye.");

        sozler.add("Çok sevdiğin ama geri döndüremeyeceğin kişilerin en kötü yanı; onları her hatırladığında, seni tekrar tekrar terk etmeleridir.");

        sozler.add("Çok şey vardı anlatılacak. O yüzden sustum… Birini söylesem diğeri yarım kalacaktı. Az zamana çok şey sığdırmamız gerekiyordu.. Ben de sadece gözlerinin içine bakıp sustum… Sen duydun mu, sustukları mı?");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(sozler.get(0));
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i!=0){
                    i--;
                }else{
                    i=sozler.size()-1;
                }

                openText(i);
            }
        });
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i!=sozler.size()-1){
                    i++;
                }else{
                    i=0;
                }

                openText(i);
            }
        });

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest request = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)        // All emulators
                .addTestDevice("4F12AB9BA8ECC56B2F8F1B9E9A6457B7")  // My Galaxy Nexus test phone
                .build();
        mAdView.loadAd(request);

    }

    public void openText(int i){
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(sozler.get(i));
    }
}