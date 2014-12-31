package cn.ac.ict.sensormng.service;

import android.hardware.Sensor;

/**
 * StepDetector
 */
public class StepDetectorService extends AbstractSensorService {

	@Override
	int getSensorType() {
		return Sensor.TYPE_STEP_DETECTOR;
	}
}