package com.gukbit.service;

import com.gukbit.domain.AuthUserData;
import com.gukbit.repository.AuthUserDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthUserDataService {
    private final AuthUserDataRepository authUserDataRepository;

    public void updateAuthUserData(AuthUserData authUserData){
        authUserDataRepository.save(authUserData);
    }

    public AuthUserData getAuthUserDataByUserId(String userId){
        return authUserDataRepository.findByUserId(userId);
    }
}
