package croz.webapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

@Entity
@Table(name="joke")
@EntityListeners(AuditingEntityListener.class)
@Component
public class Joke {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_joke")
	private int id;
	
	@NotEmpty
	@Column(name="content")
	private String content;

	@Column(name="likes", columnDefinition="INT DEFAULT 0")
	private int likes;

	@Column(name="dislikes", columnDefinition="INT DEFAULT 0")
	private int dislikes;
	
	@ManyToOne
	@JoinColumn(name="id_category")
	@NotNull
	private Category category;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	} 
	
	@Override
	public String toString() {
		return "Joke [id=" + id + ", content=" + content + ", likes=" + likes + ", dislikes=" + dislikes + ", idCat="
				+ 0 + "]";
	}	
}
