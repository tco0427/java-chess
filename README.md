# java-chess

체스 미션 저장소

## 🛠 기능 구현 목록

* [x] 체스판은 초기에 32개의 기물을 가진다.
* [x] 체스판의 가로 위치는 왼쪽부터 a ~ h 이다.
* [x] 체스판의 세로 위치는 위로 1 ~ 8 이다.
* [x] 체스판의 각 진영은 대문자와 소문자로 구분한다.

---

* [x] source 위치에 있는 기물을 target 위치로 이동시킨다. 
  * `Pawn` : 폰 기물
    * [x] 처음에 두 칸 갈 수 있다.
    * [x] 처음을 제외하고는 한 칸 씩만 움직일 수 있다. 
    * [x] 상대 기물이 대각선에 있는 경우, 대각선으로 한 칸 움직일 수 있다.
  * `Bishop` : 비숍 기물
    * [x] 대각선으로만 이동가능하다. 
    * [x] 이동거리에 제한이 없다. 
  * `Rook` : 룩 기물
    * [x] 상하좌우로만 이동가능하다. 
    * [x] 이동거리에 제한이 없다. 
  * `Knight` : 나이트 기물
    * [x] 상하좌우로 한 칸 이동한 이후, 이동한 방향의 대각선으로 한 칸 이동한다.
  * `King` : 킹 기물
    * [x] 모든 방향으로 한 칸이동 가능하다. 
  * `Queen` : 퀸 기물
    * [x] 모든 방향으로 거리 제한없이 이동할 수 있다. 

---

* [ ] 킹이 잡히면 King이 잡힌 팀이 패배한다. (게임 종료)
* [ ] `status` 명령이 들어오면 각 진영의 점수를 출력해주면서 게임을 종료한다.
  * [ ] queen은 9점, rook은 5점, bishop은 3점, knight는 2.5점으로 계산한다.
  * [ ] pawn의 기본 점수는 1점이지만 같은 file에 같은 색의 폰이 잇는 경우 0.5점으로 계산된다.
  * [ ] king은 점수 계산에 포함되지 않는다.

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
