package org.acme;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NinjaCatFact {
    private String fact;    
    private int length;
    
}
