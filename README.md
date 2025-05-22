# 트로트 리스트 (Trot List) 🎵

한국 트로트 가수들의 노래 목록을 확인할 수 있는 Android 앱입니다.

## 📱 앱 소개

트로트 리스트는 인기 트로트 가수들의 대표곡을 한눈에 볼 수 있는 간단하고 직관적인 앱입니다. 
현재 영탁을 포함한 3명의 가수의 노래 목록을 제공하며, 각 가수별로 구분된 화면에서 노래 리스트를 확인할 수 있습니다.

<!-- 메인 화면 스크린샷을 여기에 추가하세요 -->
![Screenshot_20250522-160159](https://github.com/user-attachments/assets/42bc77f1-0442-4eaf-9a9f-5db9b55cec08)


## ✨ 주요 기능

- **3명의 트로트 가수 노래 목록 제공**
- **가수별 전용 화면** (Fragment 기반 네비게이션)
- **직관적인 UI/UX** (RecyclerView를 활용한 스크롤 가능한 리스트)
- **간편한 네비게이션** (하단 이미지 탭으로 가수 전환)

<!-- 기능별 화면 스크린샷들을 여기에 추가하세요 -->
### 가수별 화면
1. 영탁

![Screenshot_20250522-160159](https://github.com/user-attachments/assets/8f69c497-b1c9-4151-b901-4b1da04c9746)

2. 임영웅

![Screenshot_20250522-160148](https://github.com/user-attachments/assets/954b8b9b-d9b6-492d-93ee-4c6e5542f04b)


3. 송가인

![Screenshot_20250522-160140](https://github.com/user-attachments/assets/0857f91a-18c3-4136-b7c2-e869a2538838)

## 🛠 기술 스택

- **언어**: Kotlin
- **최소 SDK**: 24 (Android 7.0)
- **타겟 SDK**: 35 (Android 14)
- **아키텍처**: MVVM 패턴
- **UI 프레임워크**: 
  - Navigation Component
  - Fragment
  - RecyclerView
  - ConstraintLayout

## 📁 프로젝트 구조

```
app/src/main/
├── java/com/griotold/trot_list/
│   ├── MainActivity.kt          # 메인 액티비티
│   ├── Singer1Fragment.kt       # 영탁 화면
│   ├── Singer2Fragment.kt       # 임영웅 화면
│   ├── Singer3Fragment.kt       # 송가인 화면
│   └── RVAdapter.kt            # RecyclerView 어댑터
├── res/
│   ├── layout/                 # 레이아웃 파일들
│   ├── drawable/               # 이미지 리소스
│   ├── navigation/             # 네비게이션 그래프
│   └── values/                 # 색상, 문자열 등
└── AndroidManifest.xml
```

## 🚀 설치 및 실행

### 사전 요구사항
- Android Studio Arctic Fox 이상
- Android SDK 24 이상
- Kotlin 1.8.0 이상

### 설치 방법
1. 프로젝트 클론
```bash
git clone [repository-url]
cd trot_list
```

2. Android Studio에서 프로젝트 열기

3. 빌드 및 실행
```bash
./gradlew build
```


## 📱 사용법

1. **앱 실행**: 앱을 실행하면 첫 번째 가수(영탁)의 노래 목록이 표시됩니다.

2. **가수 전환**: 화면 하단의 가수 이미지를 터치하여 다른 가수의 노래 목록으로 이동할 수 있습니다.

3. **노래 목록 확인**: 각 화면에서 해당 가수의 대표곡들을 스크롤하여 확인할 수 있습니다.


*다른 가수들의 곡목은 해당 화면에서 확인하실 수 있습니다.*

## 🔧 개발 정보

### 주요 컴포넌트
- **Navigation Component**: Fragment 간 네비게이션 관리
- **RecyclerView**: 효율적인 리스트 표시
- **ViewBinding**: 타입 안전한 뷰 참조

### 빌드 설정
```kotlin
android {
    compileSdk = 35
    defaultConfig {
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
```

## 📋 TODO

- [ ] 노래 재생 기능 추가
- [ ] 가수 정보 상세 페이지
- [ ] 즐겨찾기 기능
- [ ] 검색 기능
- [ ] 더 많은 가수 추가
- [ ] 다크 모드 지원

## 👤 개발자

**griotold**
- GitHub: [@griotold](https://github.com/griotold)

## 📞 문의

프로젝트에 대한 질문이나 제안사항이 있으시면 언제든지 연락해 주세요!

---

⭐ 이 프로젝트가 도움이 되셨다면 별표를 눌러주세요!
