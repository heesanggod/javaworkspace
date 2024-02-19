package com.heesang.realEstate.service;

import com.heesang.realEstate.dto.request.CheckIdRequestDto;
import com.heesang.realEstate.dto.request.SendCodeRequestDto;
import com.heesang.realEstate.dto.response.CheckIdResponseDto;
import com.heesang.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto);
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);
}
