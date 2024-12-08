package hc.model;

import java.util.Date;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;

public interface BasePerson extends GenericEntity {

	EntityType<BasePerson> T = EntityTypes.T(BasePerson.class);

	String getName();
	void setName(String name);

	Date getBirthDate();
	void setBirthDate(Date birthDate);

	Integer getWeight();
	void setWeight(Integer weight);

}
