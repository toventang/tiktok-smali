package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class e implements Serializable {
    @c(a = "device_id")
    private final Long device_id;
    @c(a = "device_name")
    private final String device_name;

    static {
        Covode.recordClassIndex(39376);
    }

    public static /* synthetic */ e copy$default(e eVar, String str, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eVar.device_name;
        }
        if ((i2 & 2) != 0) {
            l2 = eVar.device_id;
        }
        return eVar.copy(str, l2);
    }

    public final String component1() {
        return this.device_name;
    }

    public final Long component2() {
        return this.device_id;
    }

    public final e copy(String str, Long l2) {
        return new e(str, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.device_name, eVar.device_name) && l.a(this.device_id, eVar.device_id);
    }

    public final int hashCode() {
        String str = this.device_name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l2 = this.device_id;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Device(device_name=" + this.device_name + ", device_id=" + this.device_id + ")";
    }

    public final Long getDevice_id() {
        return this.device_id;
    }

    public final String getDevice_name() {
        return this.device_name;
    }

    public e(String str, Long l2) {
        this.device_name = str;
        this.device_id = l2;
    }
}
