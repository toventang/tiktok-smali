package h.e;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.File;

public final class p extends f {
    static {
        Covode.recordClassIndex(105170);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(File file, File file2, String str) {
        super(file, file2, str);
        l.d(file, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(File file, File file2, String str, int i2, g gVar) {
        this(file, (i2 & 2) != 0 ? null : file2, (i2 & 4) != 0 ? null : str);
    }
}
