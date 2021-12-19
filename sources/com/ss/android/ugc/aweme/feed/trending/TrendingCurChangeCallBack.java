package com.ss.android.ugc.aweme.feed.trending;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.v;

public final class TrendingCurChangeCallBack extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f93940b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<p<Aweme, Boolean>> f93941a = new t<>();

    static {
        Covode.recordClassIndex(59753);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(59754);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.feed.trending.TrendingCurChangeCallBack$a$a  reason: collision with other inner class name */
        public static final class C2277a<T> implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ m f93942a;

            static {
                Covode.recordClassIndex(59755);
            }

            C2277a(m mVar) {
                this.f93942a = mVar;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                p pVar = (p) obj;
                if (pVar != null) {
                    this.f93942a.invoke(pVar.getFirst(), pVar.getSecond());
                }
            }
        }

        public static t<p<Aweme, Boolean>> a(e eVar) {
            l.d(eVar, "");
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(TrendingCurChangeCallBack.class);
            l.b(a2, "");
            return ((TrendingCurChangeCallBack) a2).f93941a;
        }

        public static void a(e eVar, Aweme aweme, boolean z) {
            if (eVar != null) {
                a(eVar).setValue(v.a(aweme, Boolean.valueOf(z)));
            }
        }
    }
}
