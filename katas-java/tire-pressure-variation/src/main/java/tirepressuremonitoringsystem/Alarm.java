package tirepressuremonitoringsystem;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    private Sensor sensor;
    private AlarmActivator alarmActivator; //Es una interfaz

    private boolean alarmOn;

    public Alarm(){
        sensor = new RandomSensor();
        alarmActivator = new AlarmSpeakerByPrint();
        alarmOn = false;
    }

    public Alarm(Sensor sensor, AlarmActivator alarmActivator, boolean alarmOn) {
        this.sensor = sensor;
        this.alarmActivator = alarmActivator;
        this.alarmOn = alarmOn;
    }

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue) {
            if(!isAlarmOn()) {
                alarmOn = true;
                alarmActivator.activateAlarm();
            }
        } else {
            if(isAlarmOn()) {
                alarmOn = false;
                alarmActivator.deactivateAlarm();
            }
        }
    }

    private boolean isAlarmOn() {
        return alarmOn;
    }
}
