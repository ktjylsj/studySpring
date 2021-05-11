package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);         // Optional -> Java 8에서 생긴 기능으로 null처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
