package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class MixFlowParam implements Serializable {
    private final String eventType;
    private final String from;

    static {
        Covode.recordClassIndex(59419);
    }

    public static /* synthetic */ MixFlowParam copy$default(MixFlowParam mixFlowParam, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mixFlowParam.eventType;
        }
        if ((i2 & 2) != 0) {
            str2 = mixFlowParam.from;
        }
        return mixFlowParam.copy(str, str2);
    }

    public final String component1() {
        return this.eventType;
    }

    public final String component2() {
        return this.from;
    }

    public final MixFlowParam copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new MixFlowParam(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixFlowParam)) {
            return false;
        }
        MixFlowParam mixFlowParam = (MixFlowParam) obj;
        return l.a(this.eventType, mixFlowParam.eventType) && l.a(this.from, mixFlowParam.from);
    }

    public final int hashCode() {
        String str = this.eventType;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.from;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "MixFlowParam(eventType=" + this.eventType + ", from=" + this.from + ")";
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getFrom() {
        return this.from;
    }

    public MixFlowParam(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.eventType = str;
        this.from = str2;
    }
}
