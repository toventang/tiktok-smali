package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    static {
        Covode.recordClassIndex(106366);
    }

    public long ntpValue() {
        return this.ntpTime;
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getFraction() {
        return this.ntpTime & 4294967295L;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & 4294967295L;
    }

    public int hashCode() {
        long j2 = this.ntpTime;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS", Locale.US);
            this.simpleFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return this.utcFormatter.format(getDate());
    }

    public TimeStamp(long j2) {
        this.ntpTime = j2;
    }

    public TimeStamp(String str) {
        this.ntpTime = decodeNtpHexString(str);
    }

    public static TimeStamp getNtpTime(long j2) {
        return new TimeStamp(toNtpTime(j2));
    }

    public static TimeStamp parseNtpString(String str) {
        return new TimeStamp(decodeNtpHexString(str));
    }

    public TimeStamp(Date date) {
        long ntpTime2;
        if (date == null) {
            ntpTime2 = 0;
        } else {
            ntpTime2 = toNtpTime(date.getTime());
        }
        this.ntpTime = ntpTime2;
    }

    public static String toString(long j2) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j2 >>> 32) & 4294967295L);
        sb.append('.');
        appendHexString(sb, j2 & 4294967295L);
        return sb.toString();
    }

    public int compareTo(TimeStamp timeStamp) {
        long j2 = this.ntpTime;
        long j3 = timeStamp.ntpTime;
        if (j2 < j3) {
            return -1;
        }
        if (j2 == j3) {
            return 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TimeStamp) || this.ntpTime != ((TimeStamp) obj).ntpValue()) {
            return false;
        }
        return true;
    }

    protected static long decodeNtpHexString(String str) {
        if (str != null) {
            int indexOf = str.indexOf(46);
            if (indexOf != -1) {
                return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
            }
            if (str.length() == 0) {
                return 0;
            }
            return Long.parseLong(str, 16) << 32;
        }
        throw new NumberFormatException("null");
    }

    public static long getTime(long j2) {
        long j3;
        long j4 = (j2 >>> 32) & 4294967295L;
        double d2 = (double) (j2 & 4294967295L);
        Double.isNaN(d2);
        long round = Math.round((d2 * 1000.0d) / 4.294967296E9d);
        if ((2147483648L & j4) == 0) {
            j3 = 2085978496000L;
        } else {
            j3 = -2208988800000L;
        }
        return (j4 * 1000) + j3 + round;
    }

    protected static long toNtpTime(long j2) {
        boolean z;
        long j3 = 2085978496000L;
        if (j2 < 2085978496000L) {
            z = true;
            j3 = -2208988800000L;
        } else {
            z = false;
        }
        long j4 = j2 - j3;
        long j5 = j4 / 1000;
        long j6 = ((j4 % 1000) * 4294967296L) / 1000;
        if (z) {
            j5 |= 2147483648L;
        }
        return j6 | (j5 << 32);
    }

    private static void appendHexString(StringBuilder sb, long j2) {
        String hexString = Long.toHexString(j2);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }
}
