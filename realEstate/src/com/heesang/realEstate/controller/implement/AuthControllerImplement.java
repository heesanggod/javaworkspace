package com.heesang.realEstate.controller.implement;

import com.heesang.realEstate.controller.AuthController;
import com.heesang.realEstate.dto.request.CheckIdRequestDto;
import com.heesang.realEstate.dto.request.SendCodeRequestDto;
import com.heesang.realEstate.dto.response.CheckIdResponseDto;
import com.heesang.realEstate.dto.response.SendCodeResponseDto;
import com.heesang.realEstate.interfaces.Code;
import com.heesang.realEstate.service.AuthService;
import com.heesang.realEstate.service.Implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
//	private AuthService authService = new AuthServiceImplement();
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}
	

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckIdResponseDto(Code.VF, null);  // 검증
		
		CheckIdResponseDto response = authService.checkId(request);
		return response;
	}


	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.vaildEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
;		return response;
	}

}
