package org.sopt.sopkathonweb1.service;

import lombok.RequiredArgsConstructor;
import org.sopt.sopkathonweb1.common.dto.ErrorMessage;
import org.sopt.sopkathonweb1.domain.Member;
import org.sopt.sopkathonweb1.exception.NotFoundException;
import org.sopt.sopkathonweb1.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Member findTmibyId(Long memberId) {
        return userRepository.findById(memberId).orElseThrow(
            () -> new NotFoundException(ErrorMessage.MEMBER_NOT_FOUND)
        );
    }

}
