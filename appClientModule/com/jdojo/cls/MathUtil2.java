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

public class MathUtil2 {
    public static int max(int x, int y) {
            int max = x;
            if (y > max) {
                    max = y;
            }
            return max;
    }

    public static int max(int x, int y, int z) {
            int max = x;
            if (y > max) {
                    max = y;
            }
     
            if (z > max) {
                    max = z;
            }
            return max;
    }
}