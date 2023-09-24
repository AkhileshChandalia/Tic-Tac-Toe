package com.akhilesh.tictactoe.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data
public class Bot extends Player{
    private int rank;
}
