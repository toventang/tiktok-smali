package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.DatagramPacket;
import java.util.Arrays;

public class NtpV3Impl implements NtpV3Packet {
    private final byte[] buf = new byte[48];
    private volatile DatagramPacket dp;

    static {
        Covode.recordClassIndex(106363);
    }

    protected static final int ui(byte b2) {
        return b2 & 255;
    }

    protected static final long ul(byte b2) {
        return (long) (b2 & 255);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    public int getPoll() {
        return this.buf[2];
    }

    public int getPrecision() {
        return this.buf[3];
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    public int getReferenceId() {
        return getInt(12);
    }

    public int getRootDelay() {
        return getInt(4);
    }

    public int getRootDispersion() {
        return getInt(8);
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    public int hashCode() {
        return Arrays.hashCode(this.buf);
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    public int getMode() {
        return (ui(this.buf[0]) >> 0) & 7;
    }

    public double getRootDispersionInMillisDouble() {
        double rootDispersion = (double) getRootDispersion();
        Double.isNaN(rootDispersion);
        return rootDispersion / 65.536d;
    }

    public int getStratum() {
        return ui(this.buf[1]);
    }

    public int getVersion() {
        return (ui(this.buf[0]) >> 3) & 7;
    }

    private String idAsString() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        do {
            char c2 = (char) this.buf[i2 + 12];
            if (c2 == 0) {
                break;
            }
            sb.append(c2);
            i2++;
        } while (i2 <= 3);
        return sb.toString();
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public synchronized DatagramPacket getDatagramPacket() {
        DatagramPacket datagramPacket;
        MethodCollector.i(3034);
        if (this.dp == null) {
            byte[] bArr = this.buf;
            this.dp = new DatagramPacket(bArr, bArr.length);
            this.dp.setPort(123);
        }
        datagramPacket = this.dp;
        MethodCollector.o(3034);
        return datagramPacket;
    }

    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum == 0 || stratum == 1) {
                return idAsString();
            }
            if (version == 4) {
                return idAsHex();
            }
        }
        if (stratum >= 2) {
            return idAsIPAddress();
        }
        return idAsHex();
    }

    private String idAsIPAddress() {
        return ui(this.buf[12]) + "." + ui(this.buf[13]) + "." + ui(this.buf[14]) + "." + ui(this.buf[15]);
    }

    public String toString() {
        return "[version:" + getVersion() + ", mode:" + getMode() + ", poll:" + getPoll() + ", precision:" + getPrecision() + ", delay:" + getRootDelay() + ", dispersion(ms):" + getRootDispersionInMillisDouble() + ", id:" + getReferenceIdString() + ", xmitTime:" + getTransmitTimeStamp().toDateString() + " ]";
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    private TimeStamp getTimestamp(int i2) {
        return new TimeStamp(getLong(i2));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setMode(int i2) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) ((i2 & 7) | (bArr[0] & 248));
    }

    @Override // org.apache.commons.net.ntp.NtpV3Packet
    public void setVersion(int i2) {
        byte[] bArr = this.buf;
        bArr[0] = (byte) (((i2 & 7) << 3) | (bArr[0] & 199));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.buf, ((NtpV3Impl) obj).buf);
    }

    private int getInt(int i2) {
        return ui(this.buf[i2 + 3]) | (ui(this.buf[i2]) << 24) | (ui(this.buf[i2 + 1]) << 16) | (ui(this.buf[i2 + 2]) << 8);
    }

    private long getLong(int i2) {
        return (ul(this.buf[i2]) << 56) | (ul(this.buf[i2 + 1]) << 48) | (ul(this.buf[i2 + 2]) << 40) | (ul(this.buf[i2 + 3]) << 32) | (ul(this.buf[i2 + 4]) << 24) | (ul(this.buf[i2 + 5]) << 16) | (ul(this.buf[i2 + 6]) << 8) | ul(this.buf[i2 + 7]);
    }

    private void setTimestamp(int i2, TimeStamp timeStamp) {
        long ntpValue;
        if (timeStamp == null) {
            ntpValue = 0;
        } else {
            ntpValue = timeStamp.ntpValue();
        }
        int i3 = 7;
        do {
            this.buf[i2 + i3] = (byte) ((int) (255 & ntpValue));
            ntpValue >>>= 8;
            i3--;
        } while (i3 >= 0);
    }
}
