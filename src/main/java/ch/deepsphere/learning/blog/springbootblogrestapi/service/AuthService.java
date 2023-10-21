package ch.deepsphere.learning.blog.springbootblogrestapi.service;

import ch.deepsphere.learning.blog.springbootblogrestapi.dto.LoginDto;
import ch.deepsphere.learning.blog.springbootblogrestapi.dto.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
