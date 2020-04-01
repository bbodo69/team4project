package debate.controller.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import debate.model.dao.DebateDAO;


@Controller
@RequestMapping("/debate/")
public class DebateBean{
	
//	@Autowired
//	private DebateDAO debateDAO = null;

	@RequestMapping("debateBoard.do")
	public String test() throws Exception{

		
		
		
		return "debate/debateBoard";
	}
	
//	@RequestMapping("debateBoardMain.do")
//	public String test2(String pageNum, Model md) throws Exception{
//
//		if(pageNum==null) {
//			pageNum = "1";
//		}
//		
//		int pageSize = 10;
//		int currentPage = Integer.parseInt(pageNum);
//		int startRow = (currentPage - 1) * pageSize + 1;
//		int endRow = currentPage * pageSize;
//		int count = 0;
//		int number = 0;
//		
//		List articleList = null;
//		
//		System.out.println(pageSize);
//		System.out.println(currentPage);
//		System.out.println(startRow);
//		System.out.println(endRow);	
//		
//		
//		return "debate/debateBoardMain";
//	}
	
		
}

