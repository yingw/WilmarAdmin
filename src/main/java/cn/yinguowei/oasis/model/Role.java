package cn.yinguowei.oasis.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

/**
 * @author yinguowei 2017/7/23.
 */
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Role {
    @Id @GeneratedValue
    Long id;

    @NotEmpty @NonNull @Column(unique = true, name = "role_key")
    String key;

    @NotEmpty @NonNull @Column(unique = true)
    String name;

    @Column(length = 500)
    String description;
}