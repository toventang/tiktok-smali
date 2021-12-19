package dmt.av.video.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.i;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f156772a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f156773b = new ArrayList();

    static {
        Covode.recordClassIndex(104124);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104125);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // dmt.av.video.b.e
    public final i a(com.bytedance.creativex.editor.preview.a aVar) {
        T t;
        i a2;
        l.d(aVar, "");
        Iterator<T> it = this.f156773b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.a(aVar) != null) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (a2 = t2.a(aVar)) == null) {
            return new c().a(aVar);
        }
        return a2;
    }

    @Override // dmt.av.video.b.e
    public final void a(d dVar, int i2) {
        l.d(dVar, "");
        if (i2 >= 0) {
            this.f156773b.add(i2, dVar);
        } else {
            this.f156773b.add(dVar);
        }
    }
}
