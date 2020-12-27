package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    /*
     * [구현체가 없는데 동작하는 이유]
     * 스프링이 MemberRepository 구현체를 만들어서 주입함
     */

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    // @Query 부분이 없어도 관례와 맞으면 실행됨
    @Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
