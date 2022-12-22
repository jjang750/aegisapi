# aegisapi
이지스 오픈 api

### Spring Boot
The following guides illustrate how to use some features concretely:

![img.png](img.png)

# VPC
![img_1.png](img_1.png)
vpc 이름은 new-vpc

# Subnet
![img_3.png](img_3.png)

서브넷은 총 4개 만드는데 public01, private01은
같은 가용영역으로 만든다.
![img_4.png](img_4.png)
![img_5.png](img_5.png)
public01, private01 서브넷은 가용영역을 ap-northeast-2a에 만들고,\
public02, private02 서브넷은 가용영역을 ap-northeast-2b에 만든다.\
다 만들고 나면 아래와 같이 목록이 생성되어야 한다.
![img_6.png](img_6.png)


# 인터넷 게이트웨이
![img_7.png](img_7.png)

![img_11.png](img_11.png)

# NAT 게이트웨이
※ nat 게이트웨이를 생성 하기 전 인터넷 게이트웨이가 VPC에 연결 되어 있어야 한다.

![img_8.png](img_8.png)
nat 게이트웨이를 만들때 탄력적IP할당 버튼을 눌러 ID를 생성한다.

# 라우팅 테이블
![img_9.png](img_9.png)

![img_10.png](img_10.png)
![img_12.png](img_12.png)
![img_13.png](img_13.png)

![img_15.png](img_15.png)

![img_14.png](img_14.png)


# 보안그룹
![img_16.png](img_16.png)

![img_17.png](img_17.png)






# 성공
![img_2.png](img_2.png)

