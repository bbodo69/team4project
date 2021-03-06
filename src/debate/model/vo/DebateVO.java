package debate.model.vo;

import java.sql.Timestamp;

public class DebateVO {

	private int num;
	private String sub;
	private String link;
	private Timestamp reg;
	private int readcount;
	private int ok;
	private int nok;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Timestamp getReg() {
		return reg;
	}
	public void setReg(Timestamp reg) {
		this.reg = reg;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public int getOk() {
		return ok;
	}
	public void setOk(int ok) {
		this.ok = ok;
	}
	public int getNok() {
		return nok;
	}
	public void setNok(int nok) {
		this.nok = nok;
	}
	
}
