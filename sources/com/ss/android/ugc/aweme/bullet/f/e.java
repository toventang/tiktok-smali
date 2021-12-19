package com.ss.android.ugc.aweme.bullet.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.d.a.f;
import com.bytedance.ies.d.a.h;
import com.bytedance.ies.d.a.k;
import com.bytedance.ies.d.a.y;
import com.bytedance.ies.d.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f69310a = new e();

    public static final class b implements k {
        static {
            Covode.recordClassIndex(42736);
        }

        @Override // com.bytedance.ies.d.a.k
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.bytedance.ies.d.a.k
        public final void a(String str, Throwable th) {
            l.d(str, "");
            l.d(th, "");
        }
    }

    public static final class c implements h {
        static {
            Covode.recordClassIndex(42737);
        }

        @Override // com.bytedance.ies.d.a.h
        public final void a(z zVar, y.b bVar) {
            l.d(zVar, "");
            l.d(bVar, "");
        }
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(42734);
    }

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f69311a;

        static {
            Covode.recordClassIndex(42735);
        }

        @Override // com.bytedance.ies.d.a.f
        public final List<String> a() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f69311a) {
                arrayList.addAll(bVar.a());
            }
            return arrayList;
        }

        public a(Collection collection) {
            this.f69311a = collection;
        }
    }
}
