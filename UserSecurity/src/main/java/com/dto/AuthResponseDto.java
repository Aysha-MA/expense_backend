package com.dto;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponseDto {
	private String token; 
	private Long userId;
	private String username;
    private String email;
}