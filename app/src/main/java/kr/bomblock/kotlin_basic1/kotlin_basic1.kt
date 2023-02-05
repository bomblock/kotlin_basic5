package kr.bomblock.kotlin_basic1
//todo 탑래벨 상수 이다. 일반적으로 fanal 처럼 사용 가능하다.그리고 앞에 const 를 써서 컴파일시 우위를 정할 수 있다.
const val num = 20

fun main () {
    //todo 1.변수 선언은 var 을 써준다 변수 선언 그리고 값을 대입해준다.
    //todo 2. 코틀린은 타입을 추론해주는 기능이 있어서 따로 안써도 되지만 써주면 다음과 같이 쓸수 있따.
    var i :Int =10
    var name : String = "재승"
    var point : Double = 3.3

    i = 20
}