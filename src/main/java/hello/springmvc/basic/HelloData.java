package hello.springmvc.basic;

import lombok.Data;

@Data // 게터&세터 자동 생성
public class HelloData {
    private String username;
    private int age;
}
