<div align="center">

<h2> Melting </h2>

<img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/SERVER/assets/84909012/69c47d49-bbf2-4413-b0cc-58c2cd37bf34"  alt="서비스대표-이미지" />
<div>처음 만난 사람들과 사용하는 아이스브레이킹 게임</div>

</div>

<h2> ERDiagram </h2>

<img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/SERVER/assets/84909012/4aa68a4e-08b4-440c-836a-f5313c193401"  alt="ERDiagram" />


<h2> ✨ 멜팅 주요 기능 </h2>

<h3> 1️⃣ 얼음 녹이기 </h3>

<img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/CLIENT/assets/98469609/188d609d-96b4-4203-a700-13a5cd233858"  alt="기능1-대표이미지" />
<div ><strong> TMI 공개 및 작성자 공개 </strong>   <br/>작성한 TMI를 보고 팀원들이 TMI의 주인이 누구인지 맞힙니다</div>

<h3> 2️⃣ 방 만들기 </h3>
<img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/CLIENT/assets/98469609/4ed304f0-9628-4dde-a6f5-2b2edf631608"  alt="기능2-대표이미지" />
<div ><strong> 방 만들기 </strong> <br/>방을 만들어 처음 만난 사람들이 이용할 수 있는 아이스브레이킹 게임으로 진입할 수 있도록 합니다</div>

<h3> 3️⃣ TMI 입력하기 </h3>
<img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/CLIENT/assets/98469609/46540bd0-b69b-4db8-8cb7-f32b807585c3"  alt="기능3-대표이미지" />

<div ><strong> 오늘, 당신의 TMI 는 무엇인가요? </strong>   <br/> 돌아가며 자신의 TMI를 입력합니다</div>

<h2> 👥 Team </h2>

✨ 우리 팀의 성과 : 페어 프로그래밍(Pair Programming) 시도!

<table align="center">
    <tr align="center">
      <td style="min-width: 150px;">
            <a href="https://github.com/bbabbi">
              <img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/SERVER/assets/84909012/4e414b94-5fa7-4885-8407-e1c519782b9e" width="200" alt="깃허브계정-프로필사진"/>
              <br />
              <b>bbabbi</b>
            </a>
        </td>
      <td style="min-width: 150px;">
            <a href="https://github.com/Yangdaehan">
              <img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/SERVER/assets/84909012/520c01cf-1588-467d-823d-4fc898751108" width="200" alt="깃허브계정-프로필사진">
              <br />
              <b>Yangdaehan</b>
            </a>
        </td>
    </tr>
    <tr align="center">
       <td>
            채영 <br/>
      </td>
       <td>
            대한 <br/>
      </td>
    </tr>
  	<tr align="center">
       <td>
            페어프로그래밍(방 생성 API, TMI 입력 및 방 입장 API, TMI 멤버별 조회 API <br/>
      </td>
       <td>
            페어프로그래밍(방 생성 API, TMI 입력 및 방 입장 API, TMI 멤버별 조회 API <br/>
      </td>
    </tr>
</table>

<h2> 🛠 기술스택 </h2>


<br/>

<h2>  📄 컨벤션 및 브랜치 전략 </h2>

<br/>

## 🖋️ 커밋 컨벤션

|   **태그**   |           **설명**            |
|:----------:| :---------------------------: |
|   [FEAT]   |   새로운 기능을 구현한 경우   |
|   [FIX]    |     버그 수정, 오류 해결      |
| [REFACTOR] |     코드 수정 및 리팩토링     |
|  [STYLE]   |      스타일 추가 및 수정      |
|   [DOCS]   |     문서 추가, 수정, 삭제     |
|   [INIT]   |      개발 환경 초기 세팅      |
|  [CHORE]   | 그 외 자잘한 수정 (주석 삭제) |

<br />


## 📁 폴더 구조

```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂org
 ┃ ┃ ┃ ┗ 📂sopt
 ┃ ┃ ┃ ┃ ┗ 📂sopkathonweb1
 ┃ ┃ ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ErrorMessage.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ErrorResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SuccessMessage.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SuccessStatusResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜GlobalExceptionHandler.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜JpaAuditingConfig.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ApiResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseApiResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜BaseApiResponseNonData.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoomController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TestController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BaseTimeEntity.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Room.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜User.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂request
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoomCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserEnterRequest.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜BusinessException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ForbiddenException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜NotFoundException.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RoomRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RoomService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SopkathonWeb1Application.java
 ┃ ┗ 📂resources
 ┃ ┃ ┗ 📜application.yml
 ┗ 📂test
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂org
 ┃ ┃ ┃ ┗ 📂sopt
 ┃ ┃ ┃ ┃ ┗ 📂sopkathonweb1
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SopkathonWeb1ApplicationTests.java
```


<h2> 서버 Before and After</h2>
<h3>피곤함이 느껴지는 잠죽자 서버s</h3>
<img src="https://github.com/NOW-SOPT-SOPKATHON-WEB1/SERVER/assets/84909012/6c01f04f-ac35-44a6-beee-31ef0636a283" alt="서버 팀원 사진 2"/>
