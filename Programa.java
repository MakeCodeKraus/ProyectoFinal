import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int opcionMenuPrincipal;

        do {
            System.out.println("¿Que deseas escuchar?");
            System.out.println("");
            System.out.println("1. Géneros");
            System.out.println("2. Artistas");
            System.out.println("3. Álbumes");
            System.out.println("4. Todas las canciones");
            System.out.println("5. Aleatorio");
            System.out.println("6. Salir");
            System.out.println("");

            opcionMenuPrincipal = dato.nextInt();

            // Opción genero
            if (opcionMenuPrincipal == 1) {
                int genero;
                do {
                    System.out.println("¿Que género deseas escuchar?");
                    System.out.println("");
                    System.out.println("1. Rock en español");
                    System.out.println("2. Pop");
                    System.out.println("3. Reggaetón");
                    System.out.println("4. Rock");
                    System.out.println("5. Detener reproducción");
                    System.out.println("0. Salir");
                    System.out.println("");

                    genero = dato.nextInt();

                    int opcionGenero;

                    if (genero == 1) {

                        do {
                            System.out.println("Rock en español");
                            System.out.println("");
                            System.out.println("1. Cuando sea grande");
                            System.out.println("2. El muelle de San Blás");
                            System.out.println("3. En algún lugar");
                            System.out.println("4. Maldito duende");
                            System.out.println("5. La camisa negra");
                            System.out.println("6. Laura no esta");
                            System.out.println("7. Me gustas tú");
                            System.out.println("8. Me muero");
                            System.out.println("9. Nada valgo sin tu amor");
                            System.out.println("10. Rayando el sol");
                            System.out.println("11. Rosas");
                            System.out.println("12. Tu peor error");
                            System.out.println("13. Vino tinto"); 
                            System.out.println("14. Detener reproducción");                           
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionGenero = dato.nextInt();

                        } while (opcionGenero != 0);

                    } else if (genero == 2) {

                        do {
                            System.out.println("Pop");
                            System.out.println("");
                            System.out.println("1. A Dios le pido");
                            System.out.println("2. Como camarón");
                            System.out.println("3. Dame amor");
                            System.out.println("4. La playa");
                            System.out.println("5. Paris");
                            System.out.println("6. Vivo por ella");
                            System.out.println("7. Yesterday");    
                            System.out.println("8. Detener reproducción");                       
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionGenero = dato.nextInt();

                        } while (opcionGenero != 0);

                    } else if (genero == 3) {

                        do {
                            System.out.println("Reggaeton");
                            System.out.println("");
                            System.out.println("1. La gasolina");
                            System.out.println("2. Mírame");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionGenero = dato.nextInt();

                        } while (opcionGenero != 0);

                    } else if (genero == 4) {

                        do {
                            System.out.println("Rock");
                            System.out.println("");
                            System.out.println("1. Hey Jude");
                            System.out.println("2. Don't cry");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionGenero = dato.nextInt();

                        } while (opcionGenero != 0);                        

                    } else {
                        System.out.println("¡Dato invalido!");
                    }
                } while (genero != 0);
            }
                // Opción Artistas
             else if (opcionMenuPrincipal == 2) {
                int artistas;
                do {
                    System.out.println("¿Que artista deseas escuchar?");
                    System.out.println("");
                    System.out.println("1. Juanes");
                    System.out.println("2. Estopa");
                    System.out.println("3. Cuarteto de nos");
                    System.out.println("4. Erick Rubin");
                    System.out.println("5. Maná");
                    System.out.println("6. Ducah Dho");
                    System.out.println("7. Guns N' Roses");
                    System.out.println("8. Heroes del Silencio");
                    System.out.println("9. The Beatles");
                    System.out.println("10. Daddy Yankee");
                    System.out.println("11. La Oreja de Van Gogh");
                    System.out.println("12. NEK");
                    System.out.println("13. Andrea Bocelli");
                    System.out.println("14. La Quinta Estación");
                    System.out.println("15. Manu Chao");
                    System.out.println("16. Detener reproducción");
                    System.out.println("0. Salir");
                    System.out.println("");

                    artistas = dato.nextInt();

                    int opcionArtistas;

                    if (artistas == 1) {

                        do {
                            System.out.println("Juanes");
                            System.out.println("");
                            System.out.println("1. A Dios le pido");
                            System.out.println("2. La camisa negra");
                            System.out.println("3. Nada valgo sin tu amor");
                            System.out.println("4. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 2) {

                        do {
                            System.out.println("Estopa");
                            System.out.println("");
                            System.out.println("1. Como camarón");
                            System.out.println("2. Vino tinto");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 3) {

                        do {
                            System.out.println("Cuarteto de Nos");
                            System.out.println("");
                            System.out.println("1. Cuando sea grande");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 4) {

                        do {
                            System.out.println("Erick Rubin");
                            System.out.println("");
                            System.out.println("1. Dame amor");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 5) {

                        do {
                            System.out.println("Maná");
                            System.out.println("");
                            System.out.println("1. El muelle de San Blás");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 6) {

                        do {
                            System.out.println("Ducah Dho");
                            System.out.println("");
                            System.out.println("1. En algún lugar");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 7) {

                        do {
                            System.out.println("Guns N' Roses");
                            System.out.println("");
                            System.out.println("1. Don't cry");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 8) {

                        do {
                            System.out.println("Heroes del silencio");
                            System.out.println("");
                            System.out.println("1. Maldito duende");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 9) {

                        do {
                            System.out.println("The Beatles");
                            System.out.println("");
                            System.out.println("1. Hey Jude");
                            System.out.println("2. Yesterday");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 10) {

                        do {
                            System.out.println("Daddy Yankee");
                            System.out.println("");
                            System.out.println("1. La Gasolina");
                            System.out.println("2. Mírame");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 11) {

                        do {
                            System.out.println("La Oreja de Van Gogh");
                            System.out.println("");
                            System.out.println("1. Rosas");
                            System.out.println("2. París");
                            System.out.println("3. La playa");
                            System.out.println("4. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 12) {

                        do {
                            System.out.println("NEK");
                            System.out.println("");
                            System.out.println("1. Laura no esta");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 13) {

                        do {
                            System.out.println("Andrea Bucelli");
                            System.out.println("");
                            System.out.println("1. Vivo por ella");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 14) {

                        do {
                            System.out.println("La Quinta Estación");
                            System.out.println("");
                            System.out.println("1. Me muero");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 15) {

                        do {
                            System.out.println("Manu Chao");
                            System.out.println("");
                            System.out.println("1. Me gustas tu");
                            System.out.println("2. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);


                    } else {
                        System.out.println("¡Dato invalido!");
                    }
                } while (artistas != 0);

                // Opción Album
            } else if (opcionMenuPrincipal == 3) {
                int album;
                do {
                    System.out.println("¿Que Álbum deseas escuchar?");
                    System.out.println("");
                    System.out.println("1. El viaje de Copperpot");
                    System.out.println("2. Mi sangre");
                    System.out.println("3. Detener reproducción");
                    System.out.println("0. Salir");
                    System.out.println("");

                    album = dato.nextInt();

                    int opcionAlbum;

                    if (album == 1) {

                        do {
                            System.out.println("El viaje de Copperpot");
                            System.out.println("");
                            System.out.println("1. París");
                            System.out.println("2. La playa");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionAlbum = dato.nextInt();

                        } while (opcionAlbum != 0);

                    } else if (album == 2) {

                        do {
                            System.out.println("Mi Sangre");
                            System.out.println("");
                            System.out.println("1. Tengo la camisa negra");
                            System.out.println("2. Nada Valgo sin tu amor");
                            System.out.println("3. Detener reproducción");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionAlbum = dato.nextInt();

                        } while (opcionAlbum != 0);

                    } else {
                        System.out.println("¡Dato invalido!");
                    }
                } while (album != 0);

                // opncion
            } else if (opcionMenuPrincipal == 4) {
                int cancion;
                do {
                    System.out.println("¿Que canción deseas escuchar?");
                    System.out.println("");
                    System.out.println("1. A Dios le pido");
                    System.out.println("2. Como Camarón");
                    System.out.println("3. Cuando sea grande");
                    System.out.println("4. Dame amor");
                    System.out.println("5. El muelle de San Blás");
                    System.out.println("6. En algún lugar");
                    System.out.println("7. Don't cry");
                    System.out.println("8. Maldito Duende");
                    System.out.println("9. Hey Jude");
                    System.out.println("10. La camisa negra");
                    System.out.println("11. La gasolina");
                    System.out.println("12. La playa");
                    System.out.println("13. Laura no esta");
                    System.out.println("14. Me gustas tú");
                    System.out.println("15. Me muero");
                    System.out.println("16. Mírame");
                    System.out.println("17. Nada valgo sin tu amor");
                    System.out.println("18. París");
                    System.out.println("19. Rayando el sol");
                    System.out.println("20. Rosas");
                    System.out.println("21. Tu peor error");  
                    System.out.println("22. Vino tinto");
                    System.out.println("23. Vivo por ella");
                    System.out.println("24. Yesterday");
                    System.out.println("25. Detener reproducción");                  
                    System.out.println("0. Salir");
                    System.out.println("");

                    cancion = dato.nextInt();

                    switch (cancion) {
                    case 1:
                        System.out.println("Reproduciendo A Dios le pido");
                        break;
                    case 2:
                        System.out.println("Reproduciendo Como Camarón");
                        break;
                    case 3:
                        System.out.println("Reproduciendo Cuando sea grande");
                        break;
                    case 4:
                        System.out.println("Reproduciendo Dame amor");
                        break;
                    case 5:
                        System.out.println("Reproduciendo El muelle de San Blás");
                        break;
                    case 6:
                        System.out.println("Reproduciendo En algún lugar");
                        break;
                    case 7:
                        System.out.println("Reproduciendo Don't cry");
                        break;
                    case 8:
                        System.out.println("Reproduciendo Maldito Duende");
                        break;
                    case 9:
                        System.out.println("Reproduciendo Hey Jude");
                        break;
                    case 10:
                        System.out.println("Reproduciendo La camisa negra");
                        break;
                    case 11:
                        System.out.println("Reproduciendo La gasolina");
                        break;
                    case 12:
                        System.out.println("Reproduciendo La playa");
                        break;
                    case 13:
                        System.out.println("Reproduciendo Laura no esta");
                        break;
                    case 14:
                        System.out.println("Reproduciendo Me gustas tú");
                        break;
                    case 15:
                        System.out.println("Reproduciendo Me muero");
                        break;
                    case 16:
                        System.out.println("Reproduciendo Mírame");
                        break;
                    case 17:
                        System.out.println("Reproduciendo Nada valgo sin tu amor");
                        break;
                    case 18:
                        System.out.println("Reproduciendo París");
                        break;
                    case 19:
                        System.out.println("Reproduciendo Rayando el sol");
                        break;
                    case 20:
                        System.out.println("Reproduciendo Rosas");
                        break;
                    case 21:
                        System.out.println("Reproduciendo Tu peor error");
                        break;
                    case 22:
                        System.out.println("Reproduciendo Vino tinto");
                        break;
                    case 23:
                        System.out.println("Reproduciendo Vivo por ella");
                        break;
                    case 24:
                        System.out.println("Reproduciendo Yesterday");
                        break;                                                                                                

                    default:
                        System.out.println("¡Dato invalido!");
                        break;
                    }
                } while (cancion != 0);

                // opcion Aleatorio
            } else if (opcionMenuPrincipal == 5) {
                System.out.println("Reproduciendo música aleatoriamente");
            }

        } while (opcionMenuPrincipal != 6);
    }
}
