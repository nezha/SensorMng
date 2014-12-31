package cn.ac.ict.sensormng.service;

import android.hardware.Sensor;

/**
 * SignificantMotion
 */
public class SignificantMotionService extends AbstractSensorService {

	@Override
	int getSensorType() {
		return Sensor.TYPE_SIGNIFICANT_MOTION;
	}
}
