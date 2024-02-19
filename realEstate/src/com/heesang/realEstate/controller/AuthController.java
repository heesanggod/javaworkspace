package com.heesang.realEstate.controller;

import com.heesang.realEstate.dto.request.CheckIdRequestDto;
import com.heesang.realEstate.dto.request.SendCodeRequestDto;
import com.heesang.realEstate.dto.response.CheckIdResponseDto;
import com.heesang.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
	
}
