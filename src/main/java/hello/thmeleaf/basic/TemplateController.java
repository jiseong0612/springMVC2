package hello.thmeleaf.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {
	@GetMapping("/fragment")
	public String fragement() {
		return "template/fragment/fragmentMain";
	}

	@GetMapping("/layout")
	public String layout() {
		//레이아웃 메인
		return "template/layout/layoutMain";
	}

}
