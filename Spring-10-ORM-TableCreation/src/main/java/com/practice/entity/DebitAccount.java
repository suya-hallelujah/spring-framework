package com.practice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
public class DebitAccount extends Account{

    private BigDecimal overDraftFee;
}
