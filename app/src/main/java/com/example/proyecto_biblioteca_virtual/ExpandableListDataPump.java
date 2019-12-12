package com.example.proyecto_biblioteca_virtual;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {

    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> grupoA = new ArrayList<String>();
        grupoA.add("Algebra 1");
        grupoA.add("Calculo 1");
        grupoA.add("Fisica General");
        grupoA.add("Ingles 1");
        grupoA.add("Introduccion A La Programacion");
        grupoA.add("Metodologia De Investigacion");

        List<String> grupoB = new ArrayList<String>();
        grupoB.add("Algebra 2");
        grupoB.add("Arquitectura De Computadoras 1");
        grupoB.add("Calculo 2");
        grupoB.add("Elementos de Programacion Y Estructura De Datos");
        grupoB.add("Matematica Discreta");

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


        expandableListDetail.put("Nivel A", grupoA);
        expandableListDetail.put("Nivel B", grupoB);
        expandableListDetail.put("Nivel C", grupoC);
        expandableListDetail.put("Nivel D", grupoD);
        expandableListDetail.put("Nivel E", grupoE);
        expandableListDetail.put("Nivel F", grupoF);
        expandableListDetail.put("Nivel G", grupoG);
        expandableListDetail.put("Nivel H", grupoH);
        expandableListDetail.put("Nivel I", grupoI);
        expandableListDetail.put("Electivas", grupoElec);

        return expandableListDetail;
    }
}


