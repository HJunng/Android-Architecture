# Android-Architecture
안드로이드 아키텍처 - MVP 아키텍처 패턴

<img src="https://github.com/user-attachments/assets/26fcc244-b1c1-43c6-b99a-7599bfc50363" alt="alt text" width="300" height="300">

### Model
- 데이터와 관련된 모든 작업을 담당
- ex) 저장된 데이터 가져오기, 외부 API 호출, 파일 읽기/쓰기

### View
- 앱의 화면에 해당
- User의 Event가 발생하는 부분
- ex) Activity, Fragment

### Presenter
- Model과 View의 중개자 역할
- View에서 User의 Event가 발생하면 원하는 데이터를 가져오기 위해 Model 호출
- 또 반대로, Model에서 가져온 데이터를 View에 보여주기 위한 로직(가공)을 처리하고 View에 전달한다.

---
## 프로젝트 소개
<div>
  <img src="https://github.com/user-attachments/assets/c6b2af91-aad2-461c-950d-625e46001733" alt="alt text" width="300" height="600" style="display: inline-block; margin-right: 20px;"> &nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/0e905b73-e6b1-43eb-a5ae-6f90963f76de" alt="alt text" width="300" height="600" style="display: inline-block;">
</div>

> 왼쪽 화면에서 1234 비밀번호를 입력했을 때,
> 오른쪽 화면처럼 "비밀번호 unlock 성공"라고 쓰여진 TextView를 보이게 하는 간단한 로직

