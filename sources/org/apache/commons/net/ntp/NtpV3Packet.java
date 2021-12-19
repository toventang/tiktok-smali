package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import java.net.DatagramPacket;

public interface NtpV3Packet {
    static {
        Covode.recordClassIndex(106364);
    }

    DatagramPacket getDatagramPacket();

    TimeStamp getOriginateTimeStamp();

    TimeStamp getReceiveTimeStamp();

    TimeStamp getTransmitTimeStamp();

    void setMode(int i2);

    void setTransmitTime(TimeStamp timeStamp);

    void setVersion(int i2);
}
