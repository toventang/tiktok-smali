package dmt.av.video.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f156759a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f156760b;

    /* renamed from: c  reason: collision with root package name */
    public final String f156761c;

    static {
        Covode.recordClassIndex(104111);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f156759a, bVar.f156759a) && l.a(this.f156760b, bVar.f156760b) && l.a(this.f156761c, bVar.f156761c);
    }

    public final int hashCode() {
        List<String> list = this.f156759a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f156760b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f156761c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ConcatIntermediateProduct(concatIntermediateVideoPath=" + this.f156759a + ", concatIntermediateAudioPath=" + this.f156760b + ", dirName=" + this.f156761c + ")";
    }

    public b(List<String> list, List<String> list2, String str) {
        l.d(list, "");
        l.d(list2, "");
        l.d(str, "");
        this.f156759a = list;
        this.f156760b = list2;
        this.f156761c = str;
    }
}
