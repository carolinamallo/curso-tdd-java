package unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tirepressuremonitoringsystem.*;

import static org.mockito.Mockito.*;

public class AlarmTest {
    Alarm alarm;

    Sensor sensorMock;

    AlarmActivator alarmActivator;

    @BeforeEach
    public void setUp(){
        sensorMock = mock(Sensor.class);
        alarmActivator = mock(AlarmActivator.class);
    }

    @Test
    public void alarm_is_on_when_pressureThreshold_is_lower_than_17() {
        when(sensorMock.popNextPressurePsiValue()).thenReturn(16d);
        alarm = new Alarm(sensorMock, alarmActivator, false);

        alarm.check();

        verify(alarmActivator, times(1)).activateAlarm();
    }

    @Test
    public void alarm_is_on_when_pressureThreshold_is_greater_than_21() {
        when(sensorMock.popNextPressurePsiValue()).thenReturn(22d);
        alarm = new Alarm(sensorMock, alarmActivator, false);

        alarm.check();

        verify(alarmActivator, times(1)).activateAlarm();
    }

    @Test
    public void alarm_is_off_when_pressureThreshold_is_between_18_and_20() {
        when(sensorMock.popNextPressurePsiValue()).thenReturn(19d);
        alarm = new Alarm(sensorMock, alarmActivator, true);

        alarm.check();

        verify(alarmActivator, times(1)).deactivateAlarm();
    }
}

