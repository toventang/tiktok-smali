package h.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.File;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final File f158681a;

    /* renamed from: b  reason: collision with root package name */
    public final List<File> f158682b;

    static {
        Covode.recordClassIndex(105152);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f158681a, eVar.f158681a) && l.a(this.f158682b, eVar.f158682b);
    }

    public final int hashCode() {
        File file = this.f158681a;
        int i2 = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<File> list = this.f158682b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.f158681a + ", segments=" + this.f158682b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(File file, List<? extends File> list) {
        l.d(file, "");
        l.d(list, "");
        this.f158681a = file;
        this.f158682b = list;
    }
}
