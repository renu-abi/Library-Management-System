package com.renu.Library.management.system.dal;

import com.renu.Library.management.system.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongodbMemberRepo extends MongoRepository<Member, String> {
}
