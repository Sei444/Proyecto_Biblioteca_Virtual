package com.example.proyecto_biblioteca_virtual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {

    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> grupoA = new ArrayList<String>();
        grupoA.add("ALGEBRA I");
        grupoA.add("CALCULO I");
        grupoA.add("INTRODUCCION A LA PROGRAMACION");
        grupoA.add("METODOLOGIA DE INVESTIGACION");
        grupoA.add("FISICA GENERAL");

        List<String> grupoB = new ArrayList<String>();
        grupoB.add("ALGEBRA II");
        grupoB.add("CALCULO II");
        grupoB.add("MATEMATICA DISCRETA");
        grupoB.add("ELEMENTOS DE PROGRAMACION");
        grupoB.add("ARQUITECTURA DE COMPUTADORAS");

        List<String> grupoC = new ArrayList<String>();
        grupoC.add("ESTADISTICA I");
        grupoC.add("ECUACIONES DIFERENCIALES");
        grupoC.add("CALCULO NUMERICO");
        grupoC.add("METODOS TECNICAS Y TALLER DE PRG");
        grupoC.add("BASE DE DATOS I");
        grupoC.add("CIRCUITOS ELECTRONICOS");

        List<String> grupoD = new ArrayList<String>();
        grupoD.add("ESTADISTICA II");
        grupoD.add("INVESTIGACION OPERATIVA I");
        grupoD.add("CONTABILIDAD BASICA");
        grupoD.add("SISTEMAS DE INFORMACION I");
        grupoD.add("BASE DE DATOS II");
        grupoD.add("TALLER DE SISTEMAS OPERATIVOS");


        List<String> grupoE = new ArrayList<String>();
        grupoE.add("MERCADOTECNIA");
        grupoE.add("INVESTIGACION OPERATIVA II");
        grupoE.add("SISTEMAS I");
        grupoE.add("SISTEMAS DE INFORMACION II");
        grupoE.add("TALLER DE BASE DE DATOS");
        grupoE.add("APLICACION DE SISTEMAS OPERATIVOS");

        List<String> grupoF = new ArrayList<String>();
        grupoF.add("SISTEMAS ECONOMICOS");
        grupoF.add("SIMULACION DE SISTEMAS");
        grupoF.add("SISTEMAS II");
        grupoF.add("INGENIERIA DE SOFTWARE");
        grupoF.add("INTELIGENCIA ARTIFICIAL");
        grupoF.add("REDES DE COMPUTADORAS");

        List<String> grupoG = new ArrayList<String>();
        grupoG.add("PLANIFICACION Y EVALUACION DE PROYECTOS");
        grupoG.add("DINAMICA DE SISTEMAS");
        grupoG.add("TOPICOS SELECTOS I");
        grupoG.add("TALLER DE INGENIERIA DE SOFTWARE");
        grupoG.add("GESTION DE CALIDAD");
        grupoG.add("REDES AVANZADAS DE COMPUTADORAS");

        List<String> grupoH = new ArrayList<String>();
        grupoH.add("GESTION ESTRATEGICA DE EMPRESAS");
        grupoH.add("TALLER DE SIMULACION DE SISTEMAS");
        grupoH.add("TOPICOS SELECTOS II");
        grupoH.add("METODOLOGIA Y PLANIFICACION DE PROYECTO DE GRADO");
        grupoH.add("EVALUACION Y AUDITORIA DE SISTEMAS");
        grupoH.add("SEGURIDAD DE SISTEMAS<");

        List<String> grupoI = new ArrayList<String>();
        grupoI.add("TOPICOS SELECTOS III");
        grupoI.add("TOPICOS SELECTOS IV");
        grupoI.add("PRACTICA INDUSTRIAL");
        grupoI.add("PROYECTO FINAL");
        grupoI.add("TOPICOS SELECTOS V");
        grupoI.add("TOPICOS SELECTOS VI");


        List<String> grupoElec = new ArrayList<String>();
        grupoElec.add("INGLES I");
        grupoElec.add("INGLES II");
        grupoElec.add("INGLES III");


        expandableListDetail.put("NivelA", grupoA);
        expandableListDetail.put("NivelB", grupoB);
        expandableListDetail.put("NivelC", grupoC);
        expandableListDetail.put("NivelD", grupoD);
        expandableListDetail.put("NivelE", grupoE);
        expandableListDetail.put("NivelF", grupoF);
        expandableListDetail.put("NivelG", grupoG);
        expandableListDetail.put("NivelH", grupoH);
        expandableListDetail.put("NivelI", grupoI);
        expandableListDetail.put("Electivas", grupoElec);

        return expandableListDetail;
    }
}


