package org.example.jwtdemo.service;

import org.example.jwtdemo.model.Member;
import org.example.jwtdemo.model.Salt;
import org.example.jwtdemo.repository.MemberRepository;
import org.example.jwtdemo.util.SaltUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void signUpUser(Member member) {
        String password = member.getPassword();
        String salt = SaltUtil.genSalt();
        member.setSalt(new Salt(salt));
        member.setPassword(SaltUtil.encodePassword(salt, password));
        memberRepository.save(member);
    }

    @Override
    public Member loginUser(String id, String password) throws Exception {
        Member member = memberRepository.findByUsername(id);
        if (member == null) throw new Exception("멤버가 조회되지 않음");
        String salt = member.getSalt().getSalt();
        password = SaltUtil.encodePassword(salt, password);
        if (!member.getPassword().equals(password))
            throw new Exception("비밀번호가 틀립니다.");
        return member;
    }
}