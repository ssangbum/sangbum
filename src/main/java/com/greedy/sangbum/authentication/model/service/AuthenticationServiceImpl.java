package com.greedy.sangbum.authentication.model.service;

import com.greedy.sangbum.member.model.dao.MemberDAO;
import com.greedy.sangbum.member.model.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    private final MemberDAO memberDAO;

    @Autowired
    public AuthenticationServiceImpl(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MemberDTO member = memberDAO.findMemberById(username);

        System.out.println();
        return null;
    }

    @Override
    public Map<String, List<String>> getPermitListMap() {
        return null;
    }

}
