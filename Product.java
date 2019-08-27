package com.philips.chatbot.model;

/*
 * The copyright of this file belongs to Koninklijke Philips N.V., 2019.
 */

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter
public class Product {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int productId;
    @Column(name="monitor_name")
    String productName;

    public Product() {

    }

    public Product(int productId, String productName) {
        super();
        this.productId = productId;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + "]";
    }


}

