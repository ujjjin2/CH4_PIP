package org.zerock.guestbook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
@Getter
abstract class BaseEntity {

    @CreatedDate//생성시간
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate//최종 수정시간
    @Column(name ="moddate" )
    private LocalDateTime modDate;

}
