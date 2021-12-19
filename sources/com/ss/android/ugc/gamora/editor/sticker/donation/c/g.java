package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class g implements Serializable {
    @c(a = "end")
    private Integer endIndex;
    @c(a = "start")
    private Integer startIndex;

    static {
        Covode.recordClassIndex(96450);
    }

    public static /* synthetic */ g copy$default(g gVar, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = gVar.startIndex;
        }
        if ((i2 & 2) != 0) {
            num2 = gVar.endIndex;
        }
        return gVar.copy(num, num2);
    }

    public final Integer component1() {
        return this.startIndex;
    }

    public final Integer component2() {
        return this.endIndex;
    }

    public final g copy(Integer num, Integer num2) {
        return new g(num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.startIndex, gVar.startIndex) && l.a(this.endIndex, gVar.endIndex);
    }

    public final int hashCode() {
        Integer num = this.startIndex;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.endIndex;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "TextHighlight(startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ")";
    }

    public final Integer getEndIndex() {
        return this.endIndex;
    }

    public final Integer getStartIndex() {
        return this.startIndex;
    }

    public final void setEndIndex(Integer num) {
        this.endIndex = num;
    }

    public final void setStartIndex(Integer num) {
        this.startIndex = num;
    }

    public g(Integer num, Integer num2) {
        this.startIndex = num;
        this.endIndex = num2;
    }
}
