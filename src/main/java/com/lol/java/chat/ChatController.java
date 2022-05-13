package com.lol.java.chat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {
//	private Logger logger = LoggerFactory.getLogger(ChatController.class);
	
	@Autowired
	private ChatService chatService;
	
	@RequestMapping("/chat.do")
	public String chat(HttpSession session, Model model, HttpServletRequest request, ChatVO vo){
		session.setAttribute("user_no", request.getParameter("user_no"));
		session.setAttribute("summoner_id", request.getParameter("summoner_id"));
		session.setAttribute("ban", Integer.parseInt(request.getParameter("ban")));
		session.setAttribute("solo_tier", request.getParameter("solo_tier"));
		
		model.addAttribute("profile_icon", chatService.user_info(vo));
		
		model.addAttribute("solo_tier", request.getParameter("solo_tier"));
		
		if(request.getParameter("user_no") == null) {
			return "redirect:http://localhost:8080/login.jsp";
		}
		return "chat/chat";
	}
	
	
	@RequestMapping("/chatBronze.do")
	public String chatBronze(HttpSession session, Model model, HttpServletRequest request, ChatVO vo) {
		session.getAttribute("user_no");
		session.getAttribute("summoner_id");
		session.getAttribute("ban");
		session.getAttribute("solo_tier");
		
		if(session.getAttribute("user_no") == null) {
			return "redirect:http://localhost:8080/login.jsp";
		} 
		else {
				model.addAttribute("user_no", request.getParameter("user_no"));
				model.addAttribute("summoner_id", request.getParameter("summoner_id"));
				model.addAttribute("ban", request.getParameter("ban"));
				model.addAttribute("solo_tier", request.getParameter("solo_tier"));

				model.addAttribute("profile_icon", chatService.user_info(vo));
				
				return "chat/chatBronze";
		}
	}
	
	@RequestMapping("/chatGold.do")
	public String chatGold(HttpSession session, Model model, HttpServletRequest request, ChatVO vo) {
		session.getAttribute("user_no");
		session.getAttribute("summoner_id");
		session.getAttribute("ban");
		session.getAttribute("solo_tier");
		
		if(session.getAttribute("user_no") == null) {
			return "redirect:http://localhost:8080/login.jsp";
		} 
		else {
				model.addAttribute("user_no", request.getParameter("user_no"));
				model.addAttribute("summoner_id", request.getParameter("summoner_id"));
				model.addAttribute("ban", request.getParameter("ban"));
				model.addAttribute("solo_tier", request.getParameter("solo_tier"));

				model.addAttribute("profile_icon", chatService.user_info(vo));
				
				return "chat/chatGold";
		}
	}
	
	
	@RequestMapping("/chatMaster.do")
	public String chatMaster(HttpSession session, Model model, HttpServletRequest request, ChatVO vo){
		session.getAttribute("user_no");
		session.getAttribute("summoner_id");
		session.getAttribute("ban");
		session.getAttribute("solo_tier");
		
		if(session.getAttribute("user_no") == null) {
			return "redirect:http://localhost:8080/login.jsp";
		} 
		else {
				model.addAttribute("user_no", request.getParameter("user_no"));
				model.addAttribute("summoner_id", request.getParameter("summoner_id"));
				model.addAttribute("ban", request.getParameter("ban"));
				model.addAttribute("solo_tier", request.getParameter("solo_tier"));

				model.addAttribute("profile_icon", chatService.user_info(vo));
				
				return "chat/chatMaster";
		}
	}
	
	
	@RequestMapping("/chatUnrank.do")
	public String chatUnrank(HttpSession session, Model model, HttpServletRequest request, ChatVO vo) {
		session.getAttribute("user_no");
		session.getAttribute("summoner_id");
		session.getAttribute("ban");
		session.getAttribute("solo_tier");
		
		if(session.getAttribute("user_no") == null) {
			return "redirect:http://localhost:8080/login.jsp";
		} 
		else {
				
				model.addAttribute("user_no", request.getParameter("user_no"));
				model.addAttribute("summoner_id", request.getParameter("summoner_id"));
				model.addAttribute("ban", request.getParameter("ban"));
				model.addAttribute("solo_tier", request.getParameter("solo_tier"));

				model.addAttribute("profile_icon", chatService.user_info(vo));
				
				return "chat/chatUnranked";
		}
	}
}
