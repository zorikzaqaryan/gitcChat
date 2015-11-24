package am.gitc.chat.common.model;

import am.gitc.chat.common.converter.UserTokenEnumConverter;

import javax.persistence.*;

@Entity
@Table(name = "person_token")

@NamedQuery(name="findAllUserTokens",
	query="SELECT t FROM UserToken t WHERE t.user.id = :userID")

public class UserToken {

	public enum TokenType {

		EMAIL_CONFIRMATION,

		PASSWORD_RESET
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;

	@ManyToOne
	@JoinColumn(name="person_id")
	private User user;

    @Convert(converter = UserTokenEnumConverter.class)
	@Column(name="type")
//	@Enumerated(EnumType.STRING)
	private TokenType type;

	@Column(name="value")
	private String value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getPerson() {
		return user;
	}

	public void setPerson(User user) {
		this.user= user;
	}

	public TokenType getType() {
		return type;
	}

	public void setType(TokenType type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "PersonToken{" +
			"id=" + id +
			", person=" + user +
			", type=" + type +
			", value='" + value + '\'' +
			'}';
	}
}
