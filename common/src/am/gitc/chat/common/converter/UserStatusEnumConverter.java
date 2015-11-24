package am.gitc.chat.common.converter;

import am.gitc.chat.common.model.UserStatus;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter(autoApply = true)
public class UserStatusEnumConverter implements AttributeConverter<UserStatus, Integer> {

	@Override
	public Integer convertToDatabaseColumn(UserStatus status) {
		return status.getValue();
	}

	@Override
	public UserStatus convertToEntityAttribute(Integer value) {
		return UserStatus.valueOf(value);
	}
}
