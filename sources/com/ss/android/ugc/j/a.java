package com.ss.android.ugc.j;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f148526a = "ug_resource";

    /* renamed from: b  reason: collision with root package name */
    public static final String f148527b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f148528c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final String f148529d = "UGGeckoUtils";

    /* renamed from: com.ss.android.ugc.j.a$a  reason: collision with other inner class name */
    public interface AbstractC4013a {
        static {
            Covode.recordClassIndex(97907);
        }

        void a();
    }

    private a() {
    }

    public static boolean a() {
        return dc.a(f148527b, f148526a);
    }

    static {
        Covode.recordClassIndex(97906);
        k kVar = k.f145061a;
        l.b(kVar, "");
        f148527b = kVar.c();
    }

    public static final class b extends com.bytedance.geckox.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AbstractC4013a f148530a;

        static {
            Covode.recordClassIndex(97908);
        }

        public b(AbstractC4013a aVar) {
            this.f148530a = aVar;
        }

        @Override // com.bytedance.geckox.f.a
        public final void a(String str, long j2) {
            super.a(str, j2);
            this.f148530a.a();
        }
    }
}
