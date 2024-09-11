package com.sld.sdd2.user;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

public interface UserRepository extends JpaAttributeConverter<SiteUser, Long> {
}
