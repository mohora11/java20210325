package p06.lecture.paAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@ForType
public class A05Annotation {
	@ForType
	int field;
}

@Target(ElementType.TYPE)
@interface ForType {}


@Target(ElementType.FIELD)
@interface ForField {}

@Target()
@interface ForField