/*
 * Copyright (c) - UOL Inc,
 * Todos os direitos reservados
 *
 * Este arquivo e uma propriedade confidencial do Universo Online Inc.
 * Nenhuma parte do mesmo pode ser copiada, reproduzida, impressa ou
 * transmitida por qualquer meio sem autorizacao expressa e por escrito
 * de um representante legal do Universo Online Inc.
 *
 * All rights reserved
 *
 * This file is a confidential property of Universo Online Inc.
 * No part of this file may be reproduced or copied in any form or by
 * any means without written permisson from an authorized person from
 * Universo Online Inc.
 *
 * Historico de revisoes
 * Autor                             Data       Motivo
 * --------------------------------- ---------- -----------------------
 * atomita                        	 8 de nov de 2019	Criacao inicial
 */

package com.jdojo.cls;

public class PassByReferenceValueTest2 {
    public static void changeString(String s2) {
            System.out.println("#2: s2 = " + s2);
            s2 = s2 + " there";
            System.out.println("#3: s2 = " + s2);
    }

    public static void main(String[] args) {
            String s1 = "hi";
            System.out.println("#1: s1 = " + s1);
            PassByReferenceValueTest2.changeString(s1);
            System.out.println("#4: s1 = " + s1);
    }
}