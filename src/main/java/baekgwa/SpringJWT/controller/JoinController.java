package baekgwa.SpringJWT.controller;

import baekgwa.SpringJWT.dto.JoinDTO;
import baekgwa.SpringJWT.service.JoinService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class JoinController {

    private final JoinService joinService;

    public JoinController(JoinService joinService) {

        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(@RequestBody JoinDTO joinDTO) {
        log.info(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);
        return "ok";
    }

    @PostMapping("/login")
    public String loginTest(){
        log.info("Login Api Test Ok");
        return "OK";
    }
}