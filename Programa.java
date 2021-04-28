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
                    System.out.println("1. Género 1");
                    System.out.println("2. Género 2");
                    System.out.println("0. Salir");
                    System.out.println("");

                    genero = dato.nextInt();

                    int opcionGenero;

                    if (genero == 1) {

                        do {
                            System.out.println("Genero 1");
                            System.out.println("");
                            System.out.println("1. Canción 1");
                            System.out.println("2. Canción 2");
                            System.out.println("3. Canción 3");
                            System.out.println("4. Canción 4");
                            System.out.println("5. Canción 5");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionGenero = dato.nextInt();

                        } while (opcionGenero != 0);

                    } else if (genero == 2) {

                        do {
                            System.out.println("Genero 2");
                            System.out.println("");
                            System.out.println("1. Canción 1");
                            System.out.println("2. Canción 2");
                            System.out.println("3. Canción 3");
                            System.out.println("4. Canción 4");
                            System.out.println("5. Canción 5");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionGenero = dato.nextInt();

                        } while (opcionGenero != 0);

                    } else {
                        System.out.println("¡Dato invalido!");
                    }
                } while (genero != 0);

                // Opción Artistas
            } else if (opcionMenuPrincipal == 2) {
                int artistas;
                do {
                    System.out.println("¿Que artista deseas escuchar?");
                    System.out.println("");
                    System.out.println("1. Artista 1");
                    System.out.println("2. Artista 2");
                    System.out.println("0. Salir");
                    System.out.println("");

                    artistas = dato.nextInt();

                    int opcionArtistas;

                    if (artistas == 1) {

                        do {
                            System.out.println("Artista 1");
                            System.out.println("");
                            System.out.println("1. Canción 1");
                            System.out.println("2. Canción 2");
                            System.out.println("3. Canción 3");
                            System.out.println("4. Canción 4");
                            System.out.println("5. Canción 5");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionArtistas = dato.nextInt();

                        } while (opcionArtistas != 0);

                    } else if (artistas == 2) {

                        do {
                            System.out.println("Artista 2");
                            System.out.println("");
                            System.out.println("1. Canción 1");
                            System.out.println("2. Canción 2");
                            System.out.println("3. Canción 3");
                            System.out.println("4. Canción 4");
                            System.out.println("5. Canción 5");
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
                    System.out.println("1. Álbum 1");
                    System.out.println("2. Álbum 2");
                    System.out.println("0. Salir");
                    System.out.println("");

                    album = dato.nextInt();

                    int opcionAlbum;

                    if (album == 1) {

                        do {
                            System.out.println("Álbum 1");
                            System.out.println("");
                            System.out.println("1. Canción 1");
                            System.out.println("2. Canción 2");
                            System.out.println("3. Canción 3");
                            System.out.println("4. Canción 4");
                            System.out.println("5. Canción 5");
                            System.out.println("0. Salir");
                            System.out.println("");

                            opcionAlbum = dato.nextInt();

                        } while (opcionAlbum != 0);

                    } else if (album == 2) {

                        do {
                            System.out.println("Álbum 2");
                            System.out.println("");
                            System.out.println("1. Canción 1");
                            System.out.println("2. Canción 2");
                            System.out.println("3. Canción 3");
                            System.out.println("4. Canción 4");
                            System.out.println("5. Canción 5");
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
                    System.out.println("1. Canción 1");
                    System.out.println("2. Canción 2");
                    System.out.println("3. Canción 3");
                    System.out.println("4. Canción 4");
                    System.out.println("0. Salir");
                    System.out.println("");

                    cancion = dato.nextInt();

                    switch (cancion) {
                    case 1:
                        System.out.println("Reproduciendo canción 1");
                        break;
                    case 2:
                        System.out.println("Reproduciendo canción 2");
                        break;
                    case 3:
                        System.out.println("Reproduciendo canción 3");
                        break;
                    case 4:
                        System.out.println("Reproduciendo canción 4");
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

         

        } while(opcionMenuPrincipal != 6);
    }
}
