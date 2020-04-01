package debate.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

public class DebateDAO {

	private SqlSessionTemplate sqlSession = null;
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public String getDebateArticle(int num) {
		
		
		
		
		return "";
	}
	
	public int getArticleCount() throws Exception{
		
		int count = (Integer)sqlSession.selectOne("debate.countAll");
		
		return count;
	}
	
	
	
	
	
}
