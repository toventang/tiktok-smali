package dmt.av.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f156703a;

    /* renamed from: b  reason: collision with root package name */
    public final String f156704b;

    static {
        Covode.recordClassIndex(104074);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f156703a, cVar.f156703a) && l.a(this.f156704b, cVar.f156704b);
    }

    public final int hashCode() {
        String str = this.f156703a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f156704b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AVSeparatorConfig(audioRecordWorkSpace=" + this.f156703a + ", originSoundDir=" + this.f156704b + ")";
    }

    public c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f156703a = str;
        this.f156704b = str2;
    }
}
