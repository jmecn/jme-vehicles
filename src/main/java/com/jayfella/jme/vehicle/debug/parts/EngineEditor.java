package com.jayfella.jme.vehicle.debug.parts;

import com.jayfella.jme.vehicle.Vehicle;
import com.simsilica.lemur.RollupPanel;
import com.simsilica.lemur.props.PropertyPanel;

public class EngineEditor extends VehicleEditor {

    private final Vehicle vehicle;

    public EngineEditor(Vehicle vehicle) {
        super();

        this.vehicle = vehicle;

        addChild(createPowerRollup());
    }

    private RollupPanel createPowerRollup() {

        PropertyPanel propertyPanel = new PropertyPanel("glass");

        /*
        for (int i = 0; i < vehicle.getNumWheels(); i++) {
            propertyPanel.addFloatProperty("Wheel " + i, vehicle.getWheel(i), "accelerationForce", 0, 1, 0.01f);
        }
         */

        propertyPanel.addFloatProperty("Power", vehicle.getEngine(), "power", 0, 10000, 0.01f);

        return new RollupPanel("Power", propertyPanel, "glass");
    }

    @Override
    public void update(float tpf) {
    }
}
