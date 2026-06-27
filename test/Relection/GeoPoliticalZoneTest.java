package Relection;

import Reflection.GeoPoliticalZone;
import Reflection.State;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class GeoPoliticalZoneTest {
    @Test
    public void Benue_BelongsToNorthCentral() {
        assertSame(GeoPoliticalZone.NORTH_CENTRAL, State.BENUE.getGeoPoliticalZone());
    }
    @Test
    public void ADAMAWA_BelongsToNorthEast() {
        assertSame(GeoPoliticalZone.NORTH_EAST, State.ADAMAWA.getGeoPoliticalZone());
    }
    @Test
    public void KADUNA_BelongsToNorthWest() {
        assertSame(GeoPoliticalZone.NORTH_WEST, State.KADUNA.getGeoPoliticalZone());
    }
    @Test
    public void ABIA_BelongsToSouthEast() {
        assertSame(GeoPoliticalZone.SOUTH_EAST, State.ABIA.getGeoPoliticalZone());
    }
    @Test
    public void AKWA_IBOM_BelongsToSouthSouth() {
        assertSame(GeoPoliticalZone.SOUTH_SOUTH, State.AKWA_IBOM.getGeoPoliticalZone());
    }
    @Test
    public void LAGOS_BelongsToSouthWest() {
        assertSame(GeoPoliticalZone.SOUTH_WEST, State.LAGOS.getGeoPoliticalZone());
    }

}
