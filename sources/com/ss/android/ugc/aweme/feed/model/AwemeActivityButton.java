package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class AwemeActivityButton implements Serializable {
    @c(a = b.f37372a)
    public String color;
    @c(a = "label")
    public String label;

    static {
        Covode.recordClassIndex(59313);
    }

    public AwemeActivityButton() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AwemeActivityButton copy$default(AwemeActivityButton awemeActivityButton, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = awemeActivityButton.label;
        }
        if ((i2 & 2) != 0) {
            str2 = awemeActivityButton.color;
        }
        return awemeActivityButton.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.color;
    }

    public final AwemeActivityButton copy(String str, String str2) {
        return new AwemeActivityButton(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivityButton)) {
            return false;
        }
        AwemeActivityButton awemeActivityButton = (AwemeActivityButton) obj;
        return l.a(this.label, awemeActivityButton.label) && l.a(this.color, awemeActivityButton.color);
    }

    public final int hashCode() {
        String str = this.label;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.color;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AwemeActivityButton(label=" + this.label + ", color=" + this.color + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public AwemeActivityButton(String str, String str2) {
        this.label = str;
        this.color = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeActivityButton(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
