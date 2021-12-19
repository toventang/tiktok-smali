package org.apache.commons.net.ntp;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class TimeInfo {
    private List<String> _comments;
    private Long _delay;
    private boolean _detailsComputed;
    private final NtpV3Packet _message;
    private Long _offset;
    private final long _returnTime;

    static {
        Covode.recordClassIndex(106365);
    }

    public NtpV3Packet getMessage() {
        return this._message;
    }

    public int hashCode() {
        return (((int) this._returnTime) * 31) + this._message.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeDetails() {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.TimeInfo.computeDetails():void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeInfo timeInfo = (TimeInfo) obj;
            if (this._returnTime != timeInfo._returnTime || !this._message.equals(timeInfo._message)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j2, boolean z) {
        this(ntpV3Packet, j2, null, z);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j2, List<String> list, boolean z) {
        if (ntpV3Packet != null) {
            this._returnTime = j2;
            this._message = ntpV3Packet;
            this._comments = list;
            if (z) {
                computeDetails();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("message cannot be null");
    }
}
