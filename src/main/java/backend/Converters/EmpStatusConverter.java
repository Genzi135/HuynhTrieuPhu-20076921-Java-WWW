package backend.Converters;

import backend.emuns.EmpStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class EmpStatusConverter implements AttributeConverter<EmpStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(EmpStatus attribute) {
        if (attribute == null)
            return null;
        return attribute.ordinal();
    }

    @Override
    public EmpStatus convertToEntityAttribute(Integer dbData) {
//
        if (dbData == null) {
            return null;
        }
        return Stream.of(EmpStatus.values())
                .filter(c -> c.ordinal() == dbData)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
