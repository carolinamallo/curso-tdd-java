package tirepressuremonitoringsystem;
//Colaborador externo
public class AlarmSpeakerByPrint implements AlarmActivator {
    @Override
    public void activateAlarm() {
        System.out.println("Alarm activated!");
    }

    @Override
    public void deactivateAlarm() {
        System.out.println("Alarm deactivated!");
    }
}
