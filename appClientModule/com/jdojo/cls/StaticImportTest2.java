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

import static java.lang.System.out;
import static java.lang.Math.*;
 
public class StaticImportTest2 {
        public static void main(String[] args) {
                double radius = 2.9;
                double area = PI * radius * radius;
 
                out.println("Value of PI is: " + PI);
                out.println("Radius of circle: " + radius);
                out.println("Area of circle: " + area);
                out.println("Square root of 2.0: " + sqrt(2.0));
        }
}