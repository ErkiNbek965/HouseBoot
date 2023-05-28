package lenovo.houseproject.entity;



import jakarta.persistence.*;
import lenovo.houseproject.enums.HouseType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "houses")
@Getter
@Setter
@NoArgsConstructor
public class House {
    @Id
    @GeneratedValue(generator = "house_gen",strategy =
            GenerationType.SEQUENCE)
    @SequenceGenerator(name = "house_gen",
            sequenceName = "house_seq",
            allocationSize = 1)
    private Long id;
    @Enumerated(EnumType.STRING)
    private HouseType houseType;
    private String address;
    private int price;
    private int room;
    private String country;
    private String description;
    private Boolean isBooked;
    private String image;

    @ManyToOne(cascade = {PERSIST, DETACH, MERGE, REFRESH})
    private Agency agency;

    @OneToOne(cascade = {ALL},mappedBy = "house")
    private Booking booking;

    public House(HouseType houseType, String address, int price, int room, String country, String description, Boolean isBooked, String image) {
        this.houseType = houseType;
        this.address = address;
        this.price = price;
        this.room = room;
        this.country = country;
        this.description = description;
        this.isBooked = isBooked;
        this.image = image;
    }
}
