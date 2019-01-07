# springboot_exception_advice

1). 예외 처리 프로세스
    1. ExceptionEnum에 예외 코드, 메세지 정의
    2. 로직에서 예외 발생 ( Exception, CustomException )
    3. AllControllerAdvice의 정의된 @ExceptoinHandler가 예외를 캐치
    4. handle에 정의된 내용대로 ExceptionInfo 형식에 맞추어 Json Body 리턴
