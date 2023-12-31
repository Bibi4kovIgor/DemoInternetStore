package edu.lemon.DemoInternetStore.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "documents")
public class DocumentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "tax_id")
    @NonNull private Long taxId;

    @Column(name = "passport")
    private String passport;

    @Column(name = "additional_info")
    private String additionalInfo;

}
