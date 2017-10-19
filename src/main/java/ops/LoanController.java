
package ops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoanController{
	@RequestMapping("/")
	public String display()
	{
	return "home";
	}
}
