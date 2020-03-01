package eval.ms.maven.evalmsback.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class CommentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_comment")
	private Long id;
	@Column(name="id_auteur")
	private Long id_auteur;
	@Column(name="date")
	private String date;
	@Column(name="text")
	private String text;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_auteur() {
		return id_auteur;
	}
	public void setId_auteur(Long id_auteur) {
		this.id_auteur = id_auteur;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
