package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mailtab")
public class Email {
	@Id
	@Column(name="mid")
	private Integer mailId;
	@Column(name="tom")
	private String to;
	@Column(name="frm")
	private String from;
	@Column(name="sub")
	private String subject;
	@Column(name="txt")
	private String text;
	public Email() {
		super();
	}
	public Integer getMailId() {
		return mailId;
	}
	public void setMailId(Integer mailId) {
		this.mailId = mailId;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Email [mailId=" + mailId + ", to=" + to + ", from=" + from + ", subject=" + subject + ", text=" + text
				+ "]";
	}
	
	

}
