package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class a implements Serializable, Cloneable {
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    static {
        Covode.recordClassIndex(3580);
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return com.bytedance.android.livesdk.model.utils.a.a(com.bytedance.android.livesdk.model.utils.a.a(17, this.name), this.value);
    }

    public final String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb.append(this.name);
        sb.append("=");
        sb.append(this.value);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!this.name.equals(aVar.name) || !com.bytedance.android.livesdk.model.utils.a.a(this.value, aVar.value)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public a(String str, String str2) {
        if (str != null) {
            this.name = str;
            this.value = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
