package eval.ms.maven.evalmsback.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class ArticleModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_article")
	private Long id;
	@Column(name="id_categ")
	private String id_categ;
	@Column(name="id_auteur")
	private String id_auteur;
	@Column(name="id_comment")
	private String id_comment;
	@Column(name="date")
	private String date;
	@Column(name="content")
	private String content;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getId_categ() {
		return id_categ;
	}
	public void setId_categ(String id_categ) {
		this.id_categ = id_categ;
	}
	public String getId_auteur() {
		return id_auteur;
	}
	public void setId_auteur(String id_auteur) {
		this.id_auteur = id_auteur;
	}
	public String getId_comment() {
		return id_comment;
	}
	public void setId_comment(String id_comment) {
		this.id_comment = id_comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
