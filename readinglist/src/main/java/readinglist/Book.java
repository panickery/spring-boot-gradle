package readinglist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Setting JPA Entity to add @Entity Annotation
@Entity
public class Book {
	
//	엔티티의 유일성을 식별하고 자동으로 값을 제공하는 필드로 지정
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String reader;
	private String isbn;
	private String title;
	private String author;
	private String description;
	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id=id;
	}
	
	public String getReader() {
		return reader;
	}
	
	public void setReader(String reader) {
		this.reader=reader;
	}
	
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescriptions(String description)
	{
		this.description=description;
	}

}
