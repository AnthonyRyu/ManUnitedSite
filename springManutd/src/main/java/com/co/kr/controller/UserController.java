package com.co.kr.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.co.kr.domain.BoardListDomain;
//import com.co.kr.domain.SoccerListDomain;
import com.co.kr.domain.LoginDomain;
import com.co.kr.domain.SoccerListDomain;
import com.co.kr.service.SoccerUploadService;
//import com.co.kr.service.SoccerUploadService;
import com.co.kr.service.UploadService;
import com.co.kr.service.UserService;
import com.co.kr.util.CommonUtils;
import com.co.kr.util.NetworkInfo;
import com.co.kr.util.Pagination;
import com.co.kr.vo.LoginVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j 
@RequestMapping(value = "/")
public class UserController {
	
	// 진입점
		@GetMapping("/index")
		public String index(){
			return "index.html";
		}
		
		// players
		@GetMapping("/players")
		public String players(){
			return "players.html";
		}
		
		// articles
		@GetMapping("/articles")
		public String articles(){
			return "articles.html";
		}
		
		// articles
		@GetMapping("/members")
		public String members(){
			return "member.html";
		}
		
		// login
		@GetMapping("/login")
		public String login(){
			return "login.html";
		}	
		
		// articles
		@GetMapping("/signup")
		public String signup(){
			return "signin/signin.html";
		}	
	
	