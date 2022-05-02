package Main

//    본격 비빔 프로그램 언어...
class Main {
    static void main(String[] args) {
        def scanner = new Scanner(System.in)
//        print "입력 : "
//        def value = scanner.next()
//        println "출력 : ${value}"

        print "첫번째 값 입력 : "
        def first = scanner.nextInt()
        print("연산자 입력 : ")
        String sign = scanner.next()
        print "두번째 값 입력 : "
        int second = scanner.nextInt()

        if ("+" == sign) println("${first+second}")
        if ("-" == sign) println "${first-second}"
        if ("*" == sign) println "${first*second}"
        if ("/" == sign) println first/second

    }

}
