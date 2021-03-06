package uz.pdp.appwarehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"product_id","amount","price","outputs_id"}))
public class OutputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Product  product;

    @Column(nullable = false)
    private Double  amount;

    @Column(nullable = false)
    private Double  price;

    @ManyToOne
    private Outputs outputs;

}
