package Reflection;

public enum State {
    BENUE(GeoPoliticalZone.NORTH_CENTRAL),
    FCT(GeoPoliticalZone.NORTH_CENTRAL),
    KOGI(GeoPoliticalZone.NORTH_CENTRAL),
    KWARA(GeoPoliticalZone.NORTH_CENTRAL),
    NASSAWARA(GeoPoliticalZone.NORTH_CENTRAL),
    NIGER(GeoPoliticalZone.NORTH_CENTRAL),
    PLATEAU(GeoPoliticalZone.NORTH_CENTRAL),

    ADAMAWA(GeoPoliticalZone.NORTH_EAST),
    BAUCHI(GeoPoliticalZone.NORTH_EAST),
    BORNO(GeoPoliticalZone.NORTH_EAST),
    GOMBE(GeoPoliticalZone.NORTH_EAST),
    TARABA(GeoPoliticalZone.NORTH_EAST),
    YOBE(GeoPoliticalZone.NORTH_EAST),

    KADUNA(GeoPoliticalZone.NORTH_WEST),
    KASTINA(GeoPoliticalZone.NORTH_WEST),
    KANO(GeoPoliticalZone.NORTH_WEST),
    KEBBI(GeoPoliticalZone.NORTH_WEST),
    SOKOTO(GeoPoliticalZone.NORTH_WEST),
    JIGAWA(GeoPoliticalZone.NORTH_WEST),
    ZAMFARA(GeoPoliticalZone.NORTH_WEST),

    ABIA(GeoPoliticalZone.SOUTH_EAST),
    ANAMBRA(GeoPoliticalZone.SOUTH_EAST),
    EBONYI(GeoPoliticalZone.SOUTH_EAST),
    ENUGU(GeoPoliticalZone.SOUTH_EAST),
    IMO(GeoPoliticalZone.SOUTH_EAST),

    AKWA_IBOM(GeoPoliticalZone.SOUTH_SOUTH),
    BAYELSA(GeoPoliticalZone.SOUTH_SOUTH),
    CROSS_RIVER(GeoPoliticalZone.SOUTH_SOUTH),
    DELTA(GeoPoliticalZone.SOUTH_SOUTH),
    EDO(GeoPoliticalZone.SOUTH_SOUTH),
    RIVERS(GeoPoliticalZone.SOUTH_SOUTH),

    EKITI(GeoPoliticalZone.SOUTH_WEST),
    LAGOS(GeoPoliticalZone.SOUTH_WEST),
    OSUN(GeoPoliticalZone.SOUTH_WEST),
    ONDO(GeoPoliticalZone.SOUTH_WEST),
    OGUN(GeoPoliticalZone.SOUTH_WEST),;

//    YOBE(GeoPoliticalZone.SOUTH_SOUTH),
//    YOBE(GeoPoliticalZone.SOUTH_SOUTH),
//    YOBE(GeoPoliticalZone.SOUTH_SOUTH),
//    YOBE(GeoPoliticalZone.SOUTH_SOUTH),
//    YOBE(GeoPoliticalZone.SOUTH_SOUTH),
//    YOBE(GeoPoliticalZone.SOUTH_SOUTH),


    private final GeoPoliticalZone geoPoliticalZone;

    State(GeoPoliticalZone geoPoliticalZone) {
        this.geoPoliticalZone = geoPoliticalZone;
    }

    public GeoPoliticalZone getGeoPoliticalZone() {
        return geoPoliticalZone;
    }
}
