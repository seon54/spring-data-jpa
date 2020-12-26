package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    /**
     * [구현체가 없는데 동작하는 이유]
     * 스프링이 MemberRepository 구현체를 만들어서 주입함
     */
}
