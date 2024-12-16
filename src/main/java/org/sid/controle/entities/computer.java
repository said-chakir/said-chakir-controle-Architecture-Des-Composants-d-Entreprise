package org.sid.controle.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class computer {
    @Id
    private Long id_Pc;
    private String proce;
    private String ram;
    private String hardDrive;
    private Double price;
    private String macAddress;
}
