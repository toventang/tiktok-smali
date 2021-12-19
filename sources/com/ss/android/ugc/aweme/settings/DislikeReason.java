package com.ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class DislikeReason {
    @c(a = "id")
    private String id;
    @c(a = "text")
    private String text;

    static {
        Covode.recordClassIndex(80832);
    }

    public DislikeReason() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DislikeReason copy$default(DislikeReason dislikeReason, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dislikeReason.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dislikeReason.text;
        }
        return dislikeReason.copy(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.text;
    }

    public final DislikeReason copy(String str, String str2) {
        return new DislikeReason(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeReason)) {
            return false;
        }
        DislikeReason dislikeReason = (DislikeReason) obj;
        return l.a(this.id, dislikeReason.id) && l.a(this.text, dislikeReason.text);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DislikeReason(id=" + this.id + ", text=" + this.text + ")";
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public DislikeReason(String str, String str2) {
        this.id = str;
        this.text = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DislikeReason(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
