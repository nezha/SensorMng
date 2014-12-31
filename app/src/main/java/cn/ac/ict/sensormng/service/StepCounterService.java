package cn.ac.ict.sensormng.service;

import android.hardware.Sensor;

/**
 * StepCounter
 */
public class StepCounterService extends AbstractSensorService {

	@Override
	int getSensorType() {
		return Sensor.TYPE_STEP_COUNTER;
	}
}
