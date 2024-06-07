    모든 프로젝트(프로그램)은 하나의 main() 메소드가 있어야 하며, main() 메소드는 반드시 1개만 존재해야 한다.
    하나의 소스코드 파일은 하나의 class로 작성한다.
    자바는 객체 지향 프로그래밍(Object Oriented Programming)언어이다.

    객체(Object), 인스턴스(Instance), 클래스(Class)
    - 객체 : 개념. "자동차".
    - 인스턴스 : 객체를 실체화 한 것. "제네시스"
    - 클래스 : 객체를 정의해놓은 것. "제네시스 설계도"
        --> 우리가 작성하는 코드는 설계도다.

### 1. 변수(Variable)

        자바의 변수는 반드시 타입(자료형)을 지정하여 사용.
        한번 타입이 선언된 변수는 다른 타입의 데이터를 저장할 수 없다.

        변수의 타입(Data Type)
        - 변수는 선언될 때의 타입에 따라 저장할 수 있는 값의 종류와 허용범위가 달라짐
        자바는 기본 자료형과 참조 자료형이 있음(저장하는 메모리 영역이 서로 다름)

        기본 자료형(Primitive Type) - Stack 영역에 저장
        1) byte - 1byte (정수)
        2) short - 2byte (정수)
        3) char - 2byte (문자, 정수)
        4) int - 4byte (정수)
        5) long - 8byte (정수)
        6) float - 4byte (실수)
        7) double - 8byte (실수)
        8) boolean - 진리값. true/false.

        참조 자료형(Reference Type)
        - 참조변수 : 인스턴스의 주소를 저장하는 변수
            Heap 영역에 저장되는 데이터의 자료형
        String - 문자열. "" 사이에 값을 작성.

        모니터에 출력하기 위한 명령어
        1) System.out.println - 출력 후 줄 바꿈.
        2) System.out.print - 출력 후 줄을 바꾸지 않음.
