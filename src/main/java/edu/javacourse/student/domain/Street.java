package edu.javacourse.student.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "jc_street")
public class Street
{
    @Id
    @Column(name = "street_code")
    private Long streetCode;
    @Column(name = "street_name")
    private String streetName;

    public Long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Long streetCode) {
        this.streetCode = streetCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
}
