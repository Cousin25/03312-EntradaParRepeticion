/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**  @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 * 
 * Con ayuda del IDE NetBeans realizar un proyecto de tipo Aplicación Java
 * llamado EntradaParRepeticion que permita introducir por consola un número
 * par. En caso de error o que el valor no cumpla la condición impuesta se
 * mostrará un mensaje de advertencia y se volverá a repetir el proceso de
 * entrada hasta que se introduzca un valor correcto. Finalmente se mostrará el
 * valor por pantalla en el formato:
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        int numPar;
        boolean todoOK = true;

        do {
            try {
                System.out.print("Introduzca un número par: ");
                numPar = SCN.nextInt();
                boolean par = numPar % 2 == 0;
                if (par) {
                    System.out.printf("Número par .............: %d%n", numPar);
                    todoOK = false;
                } else {
                    System.out.printf("%d No es un número par, vuelve a intentarlo: %n", numPar);

                }

            } catch (Exception e) {
                System.out.println("Error de entrada, vuelve a intentarlo: ");
            } finally {
                SCN.nextLine();
            }

        } while (todoOK);

    }

}
