package jpabook.jpashop;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// lombok 사용
@Getter @Setter
public class Member {

    //식별자 //자동생성
    @Id @GeneratedValue
    private Long id;
    private String username;
}
