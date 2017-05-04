package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import java.util.ArrayList;

import static play.mvc.Results.ok;

public class Wireless extends Model {
    private static Wireless instance = null;

    public double standar_time_wl=847*(1/60);
    public int fallos_wl=0;
    public ArrayList<Item> itemsWireless;
    public ArrayList<Item> itemsIntalaccionBBU;
    public ArrayList<Item> itemsGeneralHardware;
    public ArrayList<Item> itemsEquipmentPower;
    public ArrayList<Item> itemsGHQuality;
    public ArrayList<Item> itemsGHQStandart;
    public ArrayList<Item> itemsSignalCables;
    public ArrayList<Item> itemsFibersCommon;
    public ArrayList<Item> itemsBSProducts;
    public ArrayList<Item> itemsAntenna;
    public ArrayList<Item> itemsSiteClean;
    public ArrayList<Item> itemsFInspection;

    public Wireless (){

        itemsWireless = new ArrayList<>();

        itemsIntalaccionBBU = new ArrayList<>();
        itemsGeneralHardware = new ArrayList<>();
        itemsEquipmentPower = new ArrayList<>();
        itemsGHQuality = new ArrayList<>();
        itemsGHQStandart = new ArrayList<>();
        itemsSignalCables = new ArrayList<>();
        itemsFibersCommon = new ArrayList<>();
        itemsBSProducts = new ArrayList<>();
        itemsAntenna = new ArrayList<>();
        itemsSiteClean = new ArrayList<>();
        itemsFInspection = new ArrayList<>();

        Item x = null;

        //Primera
        Item item0 = new Item("Instalación de BBU, RRU y DCBox",0,"","wireless","");
        itemsWireless.add(item0);
        itemsIntalaccionBBU.add(item0);
        x = Item.finderItems.where().like("descripcion", item0.descripcion).findUnique();
        if(x == null){
            item0.save();
        }

        Item item1 = new Item("Todas las medidas anticorrosivas y de impermeabilizacion deben ser adoptadas para equipos y racks outdoor, se incluyen conectores, jumper de antenas y equipos de tilt electrico remoto",4.0,"","wireless","1.1.001");
        itemsWireless.add(item1);
        itemsIntalaccionBBU.add(item1);
        x = Item.finderItems.where().like("descripcion", item1.descripcion).findUnique();
        if(x == null){
            item1.save();
        }

        Item item2 = new Item("Las partes de soporte del rack y BBU  deben ser instaladas correcta y firmemente, todos los tornillos deben ser instalados de acuerdo con los requerimientos.Todas las partes de aislamineto del rack deben ser instaladas como lo son arandelas o placas de impermeabilización. ",1.5,"","wireless","1.1.003");
        itemsWireless.add(item2);
        itemsIntalaccionBBU.add(item2);
        x = Item.finderItems.where().like("descripcion", item2.descripcion).findUnique();
        if(x == null){
            item2.save();
        }

        Item item3 = new Item("El rack, BBU, RRU y equipos RET  deben ser instalado de acuerdo a la posición indicada en el documento de ingeniería.",0.5,"","wireless","1.1.008");
        itemsWireless.add(item3);
        itemsIntalaccionBBU.add(item3);
        x = Item.finderItems.where().like("descripcion", item3.descripcion).findUnique();
        if(x == null){
            item3.save();
        }

        Item item4 = new Item(" Los sobrante de los amarres, tuercas, tornillos y otros elementos  no deben existir dentro, bajo o sobre el rack. ",0.5,"","wireless","1.1.009");
        itemsWireless.add(item4);
        itemsIntalaccionBBU.add(item4);
        x = Item.finderItems.where().like("descripcion", item4.descripcion).findUnique();
        if(x == null){
            item4.save();
        }

        Item item5 = new Item("Las caras del rack deben estar alineadas con la fila de racks correspondientes.",0.2,"","wireless","1.1.010");
        itemsWireless.add(item5);
        itemsIntalaccionBBU.add(item5);
        x = Item.finderItems.where().like("descripcion", item5.descripcion).findUnique();
        if(x == null){
            item5.save();
        }

        Item item6 = new Item("la manila antiestatica debe ser insertada en el orificio del equipo correspondiente.",0.2,"","wireless","1.1.011");
        itemsWireless.add(item6);
        itemsIntalaccionBBU.add(item6);
        x = Item.finderItems.where().like("descripcion", item6.descripcion).findUnique();
        if(x == null){
            item6.save();
        }

        Item item7 = new Item("todos los paneles falsos del equipo deben ser ubicados en sus slots correspondientes.",0.2,"","wireless","1.1.012");
        itemsWireless.add(item7);
        itemsIntalaccionBBU.add(item7);
        x = Item.finderItems.where().like("descripcion", item7.descripcion).findUnique();
        if(x == null){
            item7.save();
        }

        Item item8 = new Item("El rack, BBU and RRU  debe estar sin ningun golpe o daño en su estructura.",1.5,"","wireless","1.1.013");
        itemsWireless.add(item8);
        itemsIntalaccionBBU.add(item8);
        x = Item.finderItems.where().like("descripcion", item8.descripcion).findUnique();
        if(x == null){
            item8.save();
        }

        Item item9 = new Item(" Los puertos de la RRU deben estar apuntado hacia la torre para facilitar el proceso de Operacion y mantenimiento.",2.0,"","wireless","1.1.014");
        itemsWireless.add(item9);
        itemsIntalaccionBBU.add(item9);
        x = Item.finderItems.where().like("descripcion", item9.descripcion).findUnique();
        if(x == null){
            item9.save();
        }

        //======================================================================================================================
        //OTRA
        Item item10 = new Item("General hardware quality standard  Installation of Terminals and so on",0.0,"","wireless","");
        itemsWireless.add(item10);
        itemsGeneralHardware.add(item10);
        x = Item.finderItems.where().like("descripcion", item10.descripcion).findUnique();
        if(x == null){
            item10.save();
        }
        Item item11 = new Item("La instalacion y conexión del cable de alarma debe ser correcta y confiable. ",2.0,"","wireless","2.1.004");
        itemsWireless.add(item11);
        itemsGeneralHardware.add(item11);
        x = Item.finderItems.where().like("descripcion", item11.descripcion).findUnique();
        if(x == null){
            item11.save();
        }
        Item item12 = new Item(" La configuracion de la BBU 3900 es realizada correctamente y deacuerdo a los requerimienos de diseño. Debe ser marquillada si el cliente asi lo requiere.",0.5,"","wireless","2.1.016");
        itemsWireless.add(item12);
        itemsGeneralHardware.add(item12);
        x = Item.finderItems.where().like("descripcion", item12.descripcion).findUnique();
        if(x == null){
            item12.save();
        }
        Item item13 = new Item("El remanente de cable de DC, cable AC, y tierras debe ser cortado de manera que las conexiones a sus respectivos puntos y el tendido de cable sea realizado sobre los elementos diseñados para este fin (escalerillas, canaletas, corazas, etc.) ",0.5 ,"","wireless","2.1.021");
        itemsWireless.add(item13);
        itemsGeneralHardware.add(item13);
        x = Item.finderItems.where().like("descripcion", item13.descripcion).findUnique();
        if(x == null){
            item13.save();
        }

        //===========================================================================
        Item item14 = new Item("Equipment Power and Grounding Cable Common：",0.0,"","wireless","");
        itemsWireless.add(item14);
        itemsEquipmentPower.add(item14);
        x = Item.finderItems.where().like("descripcion", item14.descripcion).findUnique();
        if(x == null){
            item14.save();
        }
        Item item15 = new Item(" La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente. Debe existir 1 posicion para conexión a tierra cerca al Rack para aterrizar la BBU y 1 para el cable DC de cada RRU instalada. ",4,"","wireless","3.1.005");
        itemsWireless.add(item15);
        itemsEquipmentPower.add(item15);
        x = Item.finderItems.where().like("descripcion", item15.descripcion).findUnique();
        if(x == null){
            item15.save();
        }
        Item item16 = new Item("La protección de tierra del cable de poder DC se debe conectar al barraje de tierra que nos provea el cliente. Deben existir 4 posiciones para conexión a tierra cerca al Rack.(Conexion del rack, conexion del cable DC de las tres RRU). ",1.0,"","wireless","3.2.050");
        itemsWireless.add(item16);
        itemsEquipmentPower.add(item16);
        x = Item.finderItems.where().like("descripcion", item16.descripcion).findUnique();
        if(x == null){
            item16.save();
        }

        //==============================================================================
        Item item17 = new Item("General hardware quality standard   Power and Grouding",0.0 ,"","wireless","");
        itemsWireless.add(item17);
        itemsGHQuality.add(item17);
        x = Item.finderItems.where().like("descripcion", item17.descripcion).findUnique();
        if(x == null){
            item17.save();
        }
        Item item18 = new Item("Cables de poder y tierras deben ser conectados correcta y firmemente.",3 ,"","wireless","3.2.004");
        itemsWireless.add(item18);
        itemsGHQuality.add(item18);
        x = Item.finderItems.where().like("descripcion", item18.descripcion).findUnique();
        if(x == null){
            item18.save();
        }
        Item item19 = new Item("Cuando las terminales de cobre son insertadas en las puntas de los cables, ellas deben ser soldadas o ponchadas con la herramienta correcta.",3.0 , "","wireless","3.2.005");
        itemsWireless.add(item19);
        itemsGHQuality.add(item19);
        x = Item.finderItems.where().like("descripcion", item19.descripcion).findUnique();
        if(x == null){
            item19.save();
        }
        Item item20 = new Item("Los cables de poder y de tierra deben ser fabricados sin ningun tipo de empalme o conexión.",1.0,"","wireless","3.2.017");
        itemsWireless.add(item20);
        itemsGHQuality.add(item20);
        x = Item.finderItems.where().like("descripcion", item20.descripcion).findUnique();
        if(x == null){
            item20.save();
        }
        Item item21 = new Item("El cable de señal debe ser tendido separadamente del cable de poder.",1.0 ,"","wireless","3.2.019");
        itemsWireless.add(item21);
        itemsGHQuality.add(item21);
        x = Item.finderItems.where().like("descripcion", item21.descripcion).findUnique();
        if(x == null){
            item21.save();
        }
        Item item22 = new Item(" Todos los equipos que cuenten con chasis metálico deben ser conectados a la tierra del sitio.",1.0 ,"","wireless","3.2.020");
        itemsWireless.add(item22);
        itemsGHQuality.add(item2);
        x = Item.finderItems.where().like("descripcion", item22.descripcion).findUnique();
        if(x == null){
            item22.save();
        }
        Item item23 = new Item("Los cables de poder y tierra deben ser marquillados según formato estándar acordado.",1.0 ,"","wireless","3.2.022");
        itemsWireless.add(item23);
        itemsGHQuality.add(item23);
        x = Item.finderItems.where().like("descripcion", item23.descripcion).findUnique();
        if(x == null){
            item23.save();
        }
        Item item24 = new Item(" La organización del cable de poder y de tierras debe realizarse según el diseño de documento de ingeniería.",0.5 ,"","wireless","3.2.025");
        itemsWireless.add(item24);
        itemsGHQuality.add(item24);
        x = Item.finderItems.where().like("descripcion", item24.descripcion).findUnique();
        if(x == null){
            item24.save();
        }
        Item item25 = new Item("No debe existir cable de cobre desnudo en las terminales de poder y de tierra, estas deben estar protegidas con termoencogible en cada una de las terminales.",0.5,"","wireless","3.2.026");
        itemsWireless.add(item25);
        itemsGHQuality.add(item25);
        x = Item.finderItems.where().like("descripcion", item25.descripcion).findUnique();
        if(x == null){
            item25.save();
        }

        //==================================================================================
        Item item26 = new Item("General hardware quality standard   Base Station",0.0 ,"","wireless","");
        itemsWireless.add(item26);
        itemsGHQStandart.add(item26);
        x = Item.finderItems.where().like("descripcion", item26.descripcion).findUnique();
        if(x == null){
            item26.save();
        }
        Item item27 = new Item("los cables de poder, transmision y feeder no se deben cruzar entre si ni con cables existentes. El tendido debe realizarse segun los requerimientos de diseño. Si son figurados en paralelo, debe existir como minimo 3 cm de espaciamiento entre ellos",0.5,"","wireless","3.2.044");
        itemsWireless.add(item27);
        itemsGHQStandart.add(item27);
        x = Item.finderItems.where().like("descripcion", item27.descripcion).findUnique();
        if(x == null){
            item27.save();
        }
        Item item28 = new Item("El cable de AC , DC,transmisión, alarmas y fibra optica deben ser protegidos por coraza americana desde que sale del rack hasta que llega al punto de conexión. Las corazas deben contar con terminales de conexion y acople en cada una de sus lados. Aplica para sitios donde los recorridos de cable son outdoor.",1.0 ,"","wireless","3.2.049");
        itemsWireless.add(item28);
        itemsGHQStandart.add(item28);
        x = Item.finderItems.where().like("descripcion", item28.descripcion).findUnique();
        if(x == null){
            item28.save();
        }

        //=========================================================================================
        Item item29 = new Item("Signal Cables",0.0,"","wireless","");
        itemsWireless.add(item29);
        itemsSignalCables.add(item29);
        x = Item.finderItems.where().like("descripcion", item29.descripcion).findUnique();
        if(x == null){
            item29.save();
        }
        Item item30 = new Item("No existe daño o ruptura en el conector del cable de señal.",2.0,"","wireless","4.1.001");
        itemsWireless.add(item30);
        itemsSignalCables.add(item30);
        x = Item.finderItems.where().like("descripcion", item30.descripcion).findUnique();
        if(x == null){
            item30.save();
        }
        Item item31 = new Item("Cada cable de señal E1, UTP, JUMPERS, deben ser realizados con las herramientas adecuadas y haber pasado las pruebas de continuidad",2.0,"","wireless","4.1.004");
        itemsWireless.add(item31);
        itemsSignalCables.add(item31);
        x = Item.finderItems.where().like("descripcion", item31.descripcion).findUnique();
        if(x == null){
            item31.save();
        }
        Item item32 = new Item("Para todos los tipos de conectores para cable, deben estar limpios antes de la instalación. Deben ser limpiados de acuerdo a los manuales de instalación del conector.",2.0,"","wireless","4.1.006");
        itemsWireless.add(item32);
        itemsSignalCables.add(item32);
        x = Item.finderItems.where().like("descripcion", item32.descripcion).findUnique();
        if(x == null){
            item32.save();
        }
        Item item33 = new Item("La forma y organización del cable dentro del rack debe ser correcta y como se especifico en el documento de diseño del sitio.  ",0.5,"","wireless","4.1.009");
        itemsWireless.add(item33);
        itemsSignalCables.add(item33);
        x = Item.finderItems.where().like("descripcion", item33.descripcion).findUnique();
        if(x == null){
            item33.save();
        }
        Item item34 = new Item(" cuando los cables de señal deban ser doblados, esta curva debe ser suave, se debe tener cuidado con las esquinas y bordes de elementos de la instalación que pueden lastimar el cable de alguna forma.",0.5,"","wireless","4.1.011");
        itemsWireless.add(item34);
        itemsSignalCables.add(item34);
        x = Item.finderItems.where().like("descripcion", item34.descripcion).findUnique();
        if(x == null){
            item34.save();
        }
        Item item35 = new Item("El cableado debe ser amarrado de forma uniforme y por capas, el amarrado debe ser limpio y los amarres deben asegurar hacia un mismo lado. los cortes de sobrante del amarre no deben tener puntas o filos que puedan afectar elementos de la instalación o a los mismos instaladores.",0.5,"","wireless","4.1.014");
        itemsWireless.add(item35);
        itemsSignalCables.add(item35);
        x = Item.finderItems.where().like("descripcion", item35.descripcion).findUnique();
        if(x == null){
            item35.save();
        }
        Item item36 = new Item(" Los conectores de fibra que no son usados al igual que los puertos en el equipo deben ser protegidos con sus respectivos protectores.",0.3,"","wireless","4.1.020");
        itemsWireless.add(item36);
        itemsSignalCables.add(item36);
        x = Item.finderItems.where().like("descripcion", item36.descripcion).findUnique();
        if(x == null){
            item36.save();
        }
        Item item37 = new Item(" El radio de doblado de un cable coaxial no debe ser menor a 4 cm de diametro.",0.2, "","wireless","4.1.022");
        itemsWireless.add(item37);
        itemsSignalCables.add(item37);
        x = Item.finderItems.where().like("descripcion", item37.descripcion).findUnique();
        if(x == null){
            item37.save();
        }
        Item item38 = new Item("Los cortes de la chaqueta que se realicen del lado del MDF o DDF, deben estar cubiertos con termoencogible.",0.2,"","wireless","4.1.023");
        itemsWireless.add(item38);
        itemsSignalCables.add(item38);
        x = Item.finderItems.where().like("descripcion", item38.descripcion).findUnique();
        if(x == null){
            item38.save();
        }
        Item item39 = new Item("El cable debe doblarse formando una curva o gota despues de que este salga del rack, cambie de direccion de horizontal a vertical y despues de conectarse a la antena.",2.0,"","wireless","4.1.023");
        itemsWireless.add(item39);
        itemsSignalCables.add(item39);
        x = Item.finderItems.where().like("descripcion", item39.descripcion).findUnique();
        if(x == null){
            item39.save();
        }

        //==============================================================================
        Item item40 = new Item("Fibers: Common",0.0,"","wireless","");
        itemsWireless.add(item40);
        itemsFibersCommon.add(item40);
        x = Item.finderItems.where().like("descripcion", item40.descripcion).findUnique();
        if(x == null){
            item40.save();
        }
        Item item41 = new Item("La fibra optica debe ser protegida por espiral plastica al interior del rack y amarrada con velcro.",0.5,"","wireless","5.1.009");
        itemsWireless.add(item41);
        itemsFibersCommon.add(item41);
        x = Item.finderItems.where().like("descripcion", item41.descripcion).findUnique();
        if(x == null){
            item41.save();
        }
        Item item42 = new Item("El remanente de fibra optica debe ser organizado sobre la escalerilla horizontal justo despues de la salida del rack  3 rollos de cable de fibra deben ser realizados por sector uno despues de otro, debidamente marcados con cinta de colores y con un diametro no menor a 15 cm.",0.5,"","wireless","5.1.009");
        itemsWireless.add(item42);
        itemsFibersCommon.add(item42);
        x = Item.finderItems.where().like("descripcion", item42.descripcion).findUnique();
        if(x == null){
            item42.save();
        }
        Item item43 = new Item("La resistencia entre el punto de tierra del equipo instalado debe ser menor o igual a ≤5Ω",6.0,"","wireless","6.1.007");
        itemsWireless.add(item43);
        itemsFibersCommon.add(item43);
        x = Item.finderItems.where().like("descripcion", item43.descripcion).findUnique();
        if(x == null){
            item43.save();
        }
        Item item44 = new Item(" Todas las marquillas del nodo deben ser instaladas, fibra optica, cable DC, cable de tierras, antenas, cable de alarma, cable de transmision, cable coaxial (jumpers) deben ser marquillados a ambos lados es decir del puerto que salen y en el puerto al que entran.  ",0.5,"","wireless","7.1.013");
        itemsWireless.add(item44);
        itemsFibersCommon.add(item44);
        x = Item.finderItems.where().like("descripcion", item44.descripcion).findUnique();
        if(x == null){
            item44.save();
        }
        Item item45 = new Item("Las marquillas para sitios outdoor deben tener recubrimiento impermeabilizante o debe ser plastica preferiblemente, todas las marquillas indoor y outdoor deben ser instaladas en la misma forma para facil lectura.",1.0,"","wireless","7.1.014");
        itemsWireless.add(item45);
        itemsFibersCommon.add(item45);
        x = Item.finderItems.where().like("descripcion", item45.descripcion).findUnique();
        if(x == null){
            item45.save();
        }

        //====================================================================================
        Item item46 = new Item("Base station product installation of rack",0.0,"","wireless","");
        itemsWireless.add(item46);
        itemsBSProducts.add(item46);
        x = Item.finderItems.where().like("descripcion", item46.descripcion).findUnique();
        if(x == null){
            item46.save();
        }
        Item item47 = new Item("La configuracion de los DIP switches y puentes deben ser correctamente ubicados.",1.0,"","wireless","8.1.002");
        itemsWireless.add(item47);
        itemsBSProducts.add(item47);
        x = Item.finderItems.where().like("descripcion", item47.descripcion).findUnique();
        if(x == null){
            item47.save();
        }
        Item item48 = new Item("Las medidas de impermeabilizacion deben ser aplicados sobre conectores que no se van a usar como los que si se usaran. Las conexiones a las antenas, RRU, terminales de coraza americana, conector de DC del lado de la RRU si lo requiere, debe contar con la debida impermeabilización.",1.0,"","wireless","8.1.006");
        itemsWireless.add(item48);
        itemsBSProducts.add(item48);
        x = Item.finderItems.where().like("descripcion", item48.descripcion).findUnique();
        if(x == null){
            item48.save();
        }
        Item item49 = new Item("La instalacion de cables de forma horizontal debe ser realizada sobre las respectivas barras para organizacion de cable, si el cable es tendido verticalmente se debe realizar por las paredes del rack.",0.5,"","wireless","8.1.009");
        itemsWireless.add(item49);
        itemsBSProducts.add(item49);
        x = Item.finderItems.where().like("descripcion", item49.descripcion).findUnique();
        if(x == null){
            item49.save();
        }
        Item item50 = new Item("todos las tapas protectora de los slots del equipo deben ser ubicadas si el puerto no es utilizado.",0.2,"","wireless","8.1.017");
        itemsWireless.add(item50);
        itemsBSProducts.add(item50);
        x = Item.finderItems.where().like("descripcion", item50.descripcion).findUnique();
        if(x == null){
            item50.save();
        }

        //=================================================================================
        Item item51 = new Item("Antenna and Feeder Installation",0.0,"","wireless","");
        itemsWireless.add(item51);
        itemsAntenna.add(item51);
        x = Item.finderItems.where().like("descripcion", item51.descripcion).findUnique();
        if(x == null){
            item51.save();
        }
        Item item52 = new Item("La conexión entre el soporte de la antena y la torre debe ser confiable y firme. El soporte de la RRU debe ser confiable y firme y se debe posicionar según lo requiera el survey back to back, instalación en línea o instalación de la RRU independiente.",3.0,"","wireless","9.1.007");
        itemsWireless.add(item52);
        itemsAntenna.add(item52);
        x = Item.finderItems.where().like("descripcion", item52.descripcion).findUnique();
        if(x == null){
            item52.save();
        }
        Item item53 = new Item("Los conectores de RF deben ser realizados correctamente y siguiendo el proceso de fabricación, de manera que el VSWR sea normal para la operción del sistema.",2.0,"","wireless","9.1.008");
        itemsWireless.add(item53);
        itemsAntenna.add(item53);
        x = Item.finderItems.where().like("descripcion", item53.descripcion).findUnique();
        if(x == null){
            item53.save();
        }
        Item item54 = new Item(" Los azimuth de las antenas debe ser el requerido en el estudio de sitio. El de dirección tendra un error tolerable de ± 5 y el de angulo vertical ± 0.5.",1.0,"","wireless","9.1.012");
        itemsWireless.add(item54);
        itemsAntenna.add(item54);
        x = Item.finderItems.where().like("descripcion", item54.descripcion).findUnique();
        if(x == null){
            item54.save();
        }

        //=====================================================================================
        Item item55 = new Item("Site Clean",0.0,"","wireless","");
        itemsWireless.add(item55);
        itemsSiteClean.add(item55);
        x = Item.finderItems.where().like("descripcion", item55.descripcion).findUnique();
        if(x == null){
            item55.save();
        }
        Item item56 = new Item("El cuarto de equipos debe estar limpio y organizado, las partes sobrantes deben quedar organizadas registradas y entregadas al cliente.",0.2,"","wireless","19.1.005");
        itemsWireless.add(item56);
        itemsSiteClean.add(item56);
        x = Item.finderItems.where().like("descripcion", item56.descripcion).findUnique();
        if(x == null){
            item56.save();
        }

        //=====================================================================================
        Item item57 = new Item("Final Inspection",0.0,"","wireless","");
        itemsWireless.add(item57);
        itemsFInspection.add(item57);
        x = Item.finderItems.where().like("descripcion", item57.descripcion).findUnique();
        if(x == null){
            item57.save();
        }
        Item item58 = new Item("El cooperador debe entregar un reporte fotografico de calidad de la instalacion y el HSQR diligenciado. ",4.0,"","wireless","20.1.001");
        itemsWireless.add(item58);
        itemsFInspection.add(item58);
        x = Item.finderItems.where().like("descripcion", item58.descripcion).findUnique();
        if(x == null){
            item58.save();
        }
        Item item59 = new Item("Toda la documentacion legal como documentos de EPS, ARP, carnet de la empresa y certificado de huawei deben se portado por el cooperador.",1.0,"","wireless","24.1.061");
        itemsWireless.add(item59);
        itemsFInspection.add(item59);
        x = Item.finderItems.where().like("descripcion", item59.descripcion).findUnique();
        if(x == null){
            item59.save();
        }
        Item item60 = new Item("Elementos de seguridad industrial y herramientas adecuadas para la instalacion deben ser llevadas por cada uno de los integrantes de la cuadrilla.",1.0,"","wireless","24.1.062");
        itemsWireless.add(item60);
        itemsFInspection.add(item60);
        x = Item.finderItems.where().like("descripcion", item60.descripcion).findUnique();
        if(x == null){
            item60.save();
        }

    }


   public ArrayList<Item> tomaItems(String wla) {
        if (wla.equals("inst")) {
            return itemsIntalaccionBBU;
        }
        else if (wla.equals("inst2")) {
            return itemsGeneralHardware;
        }
        else if (wla.equals("inst3")) {
            return itemsEquipmentPower;
        }
        else if (wla.equals("inst4")) {
            return itemsGHQuality;
        }
        else if (wla.equals("inst5")) {
            return itemsGHQStandart;
        }
        else if (wla.equals("inst6")) {
            return itemsSignalCables;
        }
        else if (wla.equals("inst7")) {
            return itemsFibersCommon;
        }
        else if (wla.equals("inst8")) {
            return itemsBSProducts;
        }
        else if (wla.equals("inst9")) {
            return itemsAntenna;
        }
        else if (wla.equals("inst10")) {
            return itemsSiteClean;
        }
        else if (wla.equals("inst11")) {
            return itemsFInspection;
        }
        return null;
    }
    public static Wireless getInstance (){
        if(instance==null ){
            instance = new Wireless();
        }
        return instance;
    }
}