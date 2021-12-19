package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class NamedValue {
    private final String name;
    private final Content value;

    static {
        Covode.recordClassIndex(64053);
    }

    public static /* synthetic */ NamedValue copy$default(NamedValue namedValue, String str, Content content, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = namedValue.name;
        }
        if ((i2 & 2) != 0) {
            content = namedValue.value;
        }
        return namedValue.copy(str, content);
    }

    public final String component1() {
        return this.name;
    }

    public final Content component2() {
        return this.value;
    }

    public final NamedValue copy(String str, Content content) {
        l.d(str, "");
        l.d(content, "");
        return new NamedValue(str, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NamedValue)) {
            return false;
        }
        NamedValue namedValue = (NamedValue) obj;
        return l.a(this.name, namedValue.name) && l.a(this.value, namedValue.value);
    }

    public final int hashCode() {
        String str = this.name;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Content content = this.value;
        if (content != null) {
            i2 = content.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "NamedValue(name=" + this.name + ", value=" + this.value + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final Content getValue() {
        return this.value;
    }

    public NamedValue(String str, Content content) {
        l.d(str, "");
        l.d(content, "");
        this.name = str;
        this.value = content;
    }
}
