package debate.model.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import debate.model.vo.DebateVO;

public class DebateDAOImple implements DebateDAO{

	private SqlSessionTemplate sqlSession = null;
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public String getDebateArticle(int num) throws Exception{
		
		
		return "";
	}
	
	public int getArticleCount() throws Exception{
	
		int count = (Integer)sqlSession.selectOne("debate.countAll");
		return count;
	}
	
	public List getArticleList(int start, int end) throws Exception{
		
		HashMap map = new HashMap();
		map.put("start", start);
		map.put("end", end);		
		List list = sqlSession.selectList("debate.selectAll", map);
				
		return list;
	}
	
	public void insertDebate(DebateVO vo) throws Exception{
		
		System.out.println(vo.getNum());
		System.out.println(vo.getSub());
		System.out.println(vo.getLink());
		System.out.println(vo.getOk());
		System.out.println(vo.getNok());
		System.out.println(vo.getReg());
		System.out.println(vo.getReadcount());
		
		sqlSession.insert("debate.insertDebate", vo);
				
	}
	
	
}
