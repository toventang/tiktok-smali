package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.a.i;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Serializable {
    @c(a = "sources")
    private final String[] sources;
    @c(a = "use_output")
    private final Boolean useOutput;

    static {
        Covode.recordClassIndex(85409);
    }

    public a() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ a copy$default(a aVar, String[] strArr, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            strArr = aVar.sources;
        }
        if ((i2 & 2) != 0) {
            bool = aVar.useOutput;
        }
        return aVar.copy(strArr, bool);
    }

    public final String[] component1() {
        return this.sources;
    }

    public final Boolean component2() {
        return this.useOutput;
    }

    public final a copy(String[] strArr, Boolean bool) {
        return new a(strArr, bool);
    }

    public final String toString() {
        return "AudioGraph(sources=" + Arrays.toString(this.sources) + ", useOutput=" + this.useOutput + ")";
    }

    public final String[] getSources() {
        return this.sources;
    }

    public final Boolean getUseOutput() {
        return this.useOutput;
    }

    public final boolean enableMic() {
        String[] strArr = this.sources;
        if (strArr == null || !i.a(strArr, "mic")) {
            return false;
        }
        return true;
    }

    public final boolean enableMusic() {
        String[] strArr = this.sources;
        if (strArr == null || !i.a(strArr, "music")) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        String[] strArr = this.sources;
        int i3 = 0;
        if (strArr != null) {
            i2 = Arrays.hashCode(strArr);
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        Boolean bool = this.useOutput;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return i4 + i3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph");
        String[] strArr = this.sources;
        if (strArr != null) {
            String[] strArr2 = ((a) obj).sources;
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (((a) obj).sources != null) {
            return false;
        }
        if (!l.a(this.useOutput, ((a) obj).useOutput)) {
            return false;
        }
        return true;
    }

    public a(String[] strArr, Boolean bool) {
        this.sources = strArr;
        this.useOutput = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String[] strArr, Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : strArr, (i2 & 2) != 0 ? null : bool);
    }
}
