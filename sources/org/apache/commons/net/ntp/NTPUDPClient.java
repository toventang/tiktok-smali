package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

public final class NTPUDPClient extends DatagramSocketClient {
    private int _version = 3;

    static {
        Covode.recordClassIndex(106362);
    }

    public final TimeInfo getTime(InetAddress inetAddress) {
        return getTime(inetAddress, 123);
    }

    public final TimeInfo getTime(InetAddress inetAddress, int i2) {
        if (!isOpen()) {
            open();
        }
        NtpV3Impl ntpV3Impl = new NtpV3Impl();
        ntpV3Impl.setMode(3);
        ntpV3Impl.setVersion(this._version);
        DatagramPacket datagramPacket = ntpV3Impl.getDatagramPacket();
        datagramPacket.setAddress(inetAddress);
        datagramPacket.setPort(i2);
        NtpV3Impl ntpV3Impl2 = new NtpV3Impl();
        DatagramPacket datagramPacket2 = ntpV3Impl2.getDatagramPacket();
        ntpV3Impl.setTransmitTime(TimeStamp.getCurrentTime());
        this._socket_.send(datagramPacket);
        this._socket_.receive(datagramPacket2);
        return new TimeInfo(ntpV3Impl2, System.currentTimeMillis(), false);
    }
}
