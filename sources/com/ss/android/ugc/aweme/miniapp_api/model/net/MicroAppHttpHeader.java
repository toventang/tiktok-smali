package com.ss.android.ugc.aweme.miniapp_api.model.net;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class MicroAppHttpHeader {
    private final String name;
    private final String value;

    static {
        Covode.recordClassIndex(70223);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int i2;
        String str = this.name;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.value;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.name;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.value;
        if (str3 != null) {
            str2 = str3;
        }
        return append.append(str2).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!l.a(getClass(), obj.getClass()))) {
            return false;
        }
        MicroAppHttpHeader microAppHttpHeader = (MicroAppHttpHeader) obj;
        if (true ^ l.a((Object) this.name, (Object) microAppHttpHeader.name)) {
            return false;
        }
        return l.a((Object) this.value, (Object) microAppHttpHeader.value);
    }

    public MicroAppHttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }
}
