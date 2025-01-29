package com.social.media.repository;

import com.social.media.model.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialUserRepo extends JpaRepository<SocialUser, Long> {
}
