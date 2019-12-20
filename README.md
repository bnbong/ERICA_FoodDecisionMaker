# ERICA_FoodDecisionMaker

ERICA_FoodDecisionMaker for Linux

Do you have trouble with making decision of what to eat at afternoon or evening everyday?
Or do you lose your tons of time for make decision of what to eat?

In Nowdays, this people is called with 'Decision making disorder'.
It means losing tons of decision making is now become serious problem.

So what things make them hard? this statistics explicate about this.

![결정장애02_f1](./결정장애02_f1.jpg)

So we felt serious about this problem and we decided to make a JAVA programm that help to make a quick decision of what to eat.

Now let us introduce about our programm.

**Important Announcement**

We was decided to make Android application first, But we faced technical limit about using Android Studio.
The main layout of FoodDecisionMaker was Fragment drawer layout. But we can't build effective solution about our layout.
Maybe its because we have many button or any extra events at FoodDecisionMaker, so it was hard to manage all event that occurs in Fragment.

So we changed our development path to create project by JAVA-only source code, not for android.
Sorry for that, and please enjoy our FoodDecisionMaker.

This Programm has...
---------------------------------------

0. The first page that appears on this programm first will teach you how to use it.
1. The roulette that choose one object(restaurant or food menu) that user input.
2. Application's recommend will based on price point, kinds of food, rating, or distance.

How to use?
---------------------------------------
  0. PLEASE **USE 'FoodDecisionMaker.java' File**,  **not** FoodDecisionMakerProject folder
  
  1. You can compile this programm int JAVA compiler, at Linux.
    Linux terminal : type 'javac FoodDecisionMaker.java'
    
  2. When you finished compiling it, run this programm with your own executor or Linux terminal
    Linux terminal : type 'java FoodDecisionMaker'
    
  3. If it compiled successfully, the interface of FoodDecisionMaker will appear soon.
     it says about what is FoodDecisionMaker and skills of it.
  
  4. Soon the user-input dialog comming out. following the interface says, enter one letter like 1, w, q in interface.
  
  5. When programm finished work that user want, programm will close saying "Thank you!". You can re-run programm run executor again.


Development Environment
---------------------------------------

  Ubuntu 18.04.3                                                         
  JAVA OpenJDK 11
  (development tool Visual Studio Code 1.41.0)

We hope it helps your decision making!
Because your time is precious.

Thanks for watching :)

Development Notes
---------------------------------------

Go to Development Notes file.

  1. Development Note/20191111.md
  2. Development Note/20191127.md
  3. Development Note/20191220.md

Maker 
---------------------------------------

JJongmen(박종윤) 소프트웨어학부 1학년 2019030191 -> sub develop, main debugging, translating Korean, adding sources                                                  
bnbong(이준혁) 소프트웨어학부 1학년 2019011758 -> main develop, managing README.md, Development note, sub debugging

-----------------------------------------------------------------------------------------------------------------------------

# ERICA_FoodDecisionMaker
매일 아침이나 점심, 저녁에 무엇을 먹을지 결정하는데 어려움을 겪고 있지 않은가요?
아니면 무엇을 먹을 지 결정하기 위해 많은 시간을 버리고 있지 않나요?

최근 사람들은 이를 '결정 장애'라고 부르기 시작했습니다.
그것은 의사 결정을 잃는 것이 이제는 심각한 문제가 되었다는 것을 의미해요.

그래서 어떤 요인이 결정하는 것을 어렵게 만들까요? 이 통계가 이에 대해 설명하고 있습니다.

![결정장애02_f1](./결정장애02_f1.jpg)

따라서 저희는 이 문제에 대해 진지하게 생각해보았고 무엇을 먹을지에 대한 빠른 결정을 내리는 데 도움이 되는 자바 프로그램을 만들기로 결정하였습니다.

이제 저희가 만든 프로그램 대해 소개하겠습니다.

**안내**

프로젝트를 개발하면서 처음에는 안드로이드 어플리케이션을 개발하려고 했으나, 기술적 한계에 직면하게 되었습니다.
안드로이드 스튜디오의 추가적인 학습을 진행해도 
본 프로젝트의 매인 레이아웃이 되는 Fragment Drawer 레이아웃에 대한 효과적인 솔루션을 개발하지 못했습니다.
아마 이 이유가 본 프로젝트에서 구현해야하는 이벤트가 많다보니 Fragment상에서 이벤트를 처리, 관리하는 솔루션 개발능력의 부족함이 도드라지지 않았나, 생각합니다.

때문에 개발 방향을 안드로이드 앱을 위한 코드가 아닌 JAVA로만 작성된 프로그램을 개발하기로 결정했습니다.
개발 방향대로 진행되지 못한점 정말 죄송합니다. 부디 저희 FoodDecisionMaker을 즐겨주세요!

이 프로그램이 가진 기능!
---------------------------------------

0. 프로그램을 실행시키고 첫 화면에서 어떻게 사용하는지 소개해줍니다.
1. 룰렛이 음식점과 음식 메뉴를 정해줍니다.
2. 가격대, 음식 종류, 평점, 거리 를 기준으로 추천해줍니다.

어떻게 사용하나요?
---------------------------------------
  0. **'FoodDecisionMaker.java'** 파일을 이용하세요!! 'FoodDecisionMakerProject' 폴더에 있는 파일이 아닙니다!!!

  1. 이 프로그램은 리눅스에 깔려 있는 JAVA컴파일러로 컴파일 할 수 있습니다.
    리눅스 터미널 사용법 : 'javac FoodDecisionMaker.java' 를 입력
  
  2. 컴파일이 끝났으면, 터미널이나 자바 실행프로그램을 사용하여 프로그램을 실행시킵니다.
    리눅스 터미널 사용법 : 'java FoodDecisionMaker' 를 입력
  
  3. 프로그램을 실행시키면 FoodDecisionMaker의 설명과 기능들을 보여주는 인터페이스가 나올 것입니다.
  
  4. 곧바로 유저가 입력할수 있는 창이 뜨고, 프로그램의 지시에 따라 명령어를 입력합니다.
  
  5. 프로그램이 제 일을 다 수행하면, 실행기를 다시 작동시키는 것으로 다시 프로그램을 돌릴 수 있습니다.


개발 환경
---------------------------------------

  Ubuntu 18.04.3                                                         
  JAVA OpenJDK 11
  (development tool Visual Studio Code 1.41.0)


저희는 이 이 무엇을 먹을 지 결정하는 데에 도움이 되기를 바랍니다.
여러분들의 시간은 소중하니까요^^

지금까지 봐주셔서 감사합니다 :) 

개발자노트
---------------------------------------

'Development file' 에서 확인하실 수 있습니다.

  1. Development Note/20191111.md
  2. Development Note/20191127.md
  3. Development Note/20191220.md


제작자
---------------------------------------

JJongmen(박종윤) 소프트웨어학부 1학년 2019030191 -> 보조 개발, 메인 디버거, 문서 한글번역작업, 추가적인 소스 추가
bnbong(이준혁) 소프트웨어학부 1학년 2019011758 -> 메인 개발, README.md, Development note 관리, 보조 
