package debate.model.dao;

import java.util.List;

import debate.model.vo.DebateVO;

public interface DebateDAO {

	public String getDebateArticle(int num) throws Exception;
	
	public int getArticleCount() throws Exception;
	
	public List getArticleList(int startRow, int endRow) throws Exception;
	
	public void insertDebate(DebateVO vo) throws Exception;
	
	public DebateVO getArticle(int num) throws Exception;
	
	public int getReadcount(int num) throws Exception;
	
}
