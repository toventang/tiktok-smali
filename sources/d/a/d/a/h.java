package d.a.d.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.File;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f156633a;

    /* renamed from: b  reason: collision with root package name */
    private final File f156634b;

    static {
        Covode.recordClassIndex(103995);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("[component=").append(this.f156633a).append(", canonicalPath=");
        File file = this.f156634b;
        String str2 = null;
        if (file != null) {
            str = file.getCanonicalPath();
        } else {
            str = null;
        }
        StringBuilder append2 = append.append(str).append(", absolutePath=");
        File file2 = this.f156634b;
        if (file2 != null) {
            str2 = file2.getAbsolutePath();
        }
        return append2.append(str2).append(']').toString();
    }

    public h(String str) {
        File file;
        this.f156633a = str;
        if (str != null) {
            file = new File(str).getAbsoluteFile();
        } else {
            file = null;
        }
        this.f156634b = file;
    }

    public final h a(String str) {
        l.c(str, "");
        if (this.f156634b == null) {
            return null;
        }
        File absoluteFile = new File(this.f156634b.getAbsolutePath(), str).getAbsoluteFile();
        l.a((Object) absoluteFile, "");
        return new h(absoluteFile.getAbsolutePath());
    }
}
