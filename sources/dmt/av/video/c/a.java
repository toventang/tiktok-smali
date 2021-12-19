package dmt.av.video.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ttve.nativePort.d;
import com.ss.android.ugc.aweme.application.o;
import com.ss.android.ugc.aweme.df.f;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import java.util.List;

public final class a implements d.AbstractC1335d {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f156872a;

    static {
        Covode.recordClassIndex(104195);
    }

    public a(boolean z) {
        this.f156872a = z;
    }

    @Override // com.ss.android.ttve.nativePort.d.AbstractC1335d
    public final boolean a(List<String> list) {
        l.d(list, "");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            for (T t : list) {
                System.currentTimeMillis();
                if (o.f66957b.get(t) == null) {
                    Librarian.a(t);
                }
                System.currentTimeMillis();
            }
        } catch (Throwable th) {
            f.a(th, "VESDK load so");
            if (this.f156872a) {
                throw th;
            }
        }
        bj.a("av-performance, SafeLibraryLoader: load all so cost time:  " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return true;
    }
}
