package org.example.jwtdemo.repository;

import org.example.jwtdemo.model.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByUsername(String username);
}
