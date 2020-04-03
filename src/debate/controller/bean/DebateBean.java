package debate.controller.bean;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import debate.model.dao.DebateDAOImple;
import debate.model.vo.DebateVO;


@Controller
@RequestMapping("/debate/")
public class DebateBean{
	
	@Autowired
	private DebateDAOImple debateDAO = null;
	
	@RequestMapping("test.do")
	public String test() {
		
		return "debate/test";
	}

	@RequestMapping("debateBoard.do")
	public String debataBoard(DebateVO vo, int num, int pageNum, Model md) throws Exception{
		
		System.out.println(num + " = num");
		vo = debateDAO.getArticle(num);	
		md.addAttribute("pageNum", pageNum);
		md.addAttribute("article", vo);
		
		return "debate/debateBoard";
	}
	
	@RequestMapping("debateBoardMain.do")
	public String List(String pageNum, Model md) throws Exception{

		System.out.println("aaaaaaaaaaa");
		if(pageNum==null) {
			pageNum = "1";
		}
		
		int pageSize = 10;
		int currentPage = Integer.parseInt(pageNum);
		int startRow = (currentPage - 1) * pageSize + 1;
		int endRow = currentPage * pageSize;
		int count = 0;
		int number = 0;
		
		List articleList = null;
		System.out.println("1111");
		count = debateDAO.getArticleCount();
		if(count > 0) {
			System.out.println("2222");
			articleList = debateDAO.getArticleList(startRow, endRow);			
		}else {
			articleList = Collections.EMPTY_LIST;
		}
		number = count - (currentPage-1)*pageSize;
		System.out.println("3333");
		md.addAttribute("articleList", articleList);
		md.addAttribute("currentPage", currentPage);
		md.addAttribute("startRow", startRow);
		md.addAttribute("endRow", endRow);
		md.addAttribute("count", count);
		md.addAttribute("pageSize", pageSize);
		md.addAttribute("pageSize", pageSize);
		md.addAttribute("number", number);
		
		return "debate/debateBoardMain";
	}
	
	
	@RequestMapping("debateForm.do")
	public String debateForm() {
				
		return "debate/debateForm";
	}
	
	@RequestMapping("debatePro.do")
	public String debatePro(DebateVO vo) throws Exception {
		
		debateDAO.insertDebate(vo);		
		
		return "debate/debateBoardMain";
	}
	
	@RequestMapping("debateReple.do")
	public String debateReple() {
		
		return "debate/debateReple";
	}
	
	@RequestMapping("debateReplePro.do")
	@ResponseBody
	public String debateReplePro(String comment) {
		
		System.out.println(comment);
		return "success";
	}
	
}

