package com.faacarneiro.certification_faac.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.faacarneiro.certification_faac.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("fabio@email.com") && dto.getTechnology().equals("java")) {
            return true;
        }
        return false;
    }
}
