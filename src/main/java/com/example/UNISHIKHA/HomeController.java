package com.example.UNISHIKHA;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String notes() {
		return "notes";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/notes")
	public String notesPage() {
		return "notes";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/login")
	public String handleLogin() {
		return "redirect:/dashboard";
	}

	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}

	@GetMapping({ "/live-class", "/liveclass" })
	public String liveClass() {
		return "live-class";
	}

	@GetMapping({ "/assignment", "/assignments" })
	public String assignment() {
		return "assignment";
	}

	@GetMapping({ "/quiz", "/quizzes" })
	public String quiz() {
		return "quiz";
	}

	@GetMapping({ "/project", "/projects", "/myprojects", "/my-projects" })
	public String projects() {
		return "myproject";
	}

	@GetMapping({ "/community", "/communities" })
	public String community() {
		return "community";
	}

	@GetMapping({ "/certificate", "/certificates", "/mycertificate", "/my-certificates" })
	public String certificates() {
		return "mycertificate";
	}

	@GetMapping("/explore")
	public String explore() {
		return "explore";
	}

	@GetMapping({ "/mycourses", "/my-courses" })
	public String myCourses() {
		return "my-courses";
	}

	@GetMapping({ "/registration", "/regtration" })
	public String registration() {
		return "registration";
	}

	@PostMapping({ "/registration", "/regtration" })
	public String handleRegistration() {
		return "redirect:/login";
	}
}