package com.example.proyecto_biblioteca_virtual;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataBD {

    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        for(int i=0; i<=5; i++) {



            List<String> grupoA = new ArrayList<String>();
            grupoA.add("ALGEBRA I");
            grupoA.add("CALCULO I");
            grupoA.add("INTRODUCCION A LA PROGRAMACION");
            grupoA.add("METODOLOGIA DE INVESTIGACION");
            grupoA.add("FISICA GENERAL");


            expandableListDetail.put("NivelA", grupoA);


        }
        return expandableListDetail;
    }
}

