package am.gitc.chat.common.converter;

import am.gitc.chat.common.model.UserToken.TokenType;

import javax.persistence.AttributeConverter;

//@Converter(autoApply = true)
public class UserTokenEnumConverter implements AttributeConverter<TokenType, String> {

	@Override
	public String convertToDatabaseColumn(TokenType token) {
		return token.name();
	}

	@Override
	public TokenType convertToEntityAttribute(String name) {
		return TokenType.valueOf(name);
	}
}
