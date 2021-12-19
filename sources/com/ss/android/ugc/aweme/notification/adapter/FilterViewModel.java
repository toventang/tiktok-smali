package com.ss.android.ugc.aweme.notification.adapter;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.f;
import h.f.b.m;
import h.h;
import h.i;

public final class FilterViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f113122a = i.a((h.f.a.a) b.f113125a);

    /* renamed from: b  reason: collision with root package name */
    private final h f113123b = i.a((h.f.a.a) a.f113124a);

    static {
        Covode.recordClassIndex(72732);
    }

    public final t<Integer> a() {
        return (t) this.f113122a.getValue();
    }

    public final t<f> b() {
        return (t) this.f113123b.getValue();
    }

    static final class a extends m implements h.f.a.a<t<f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f113124a = new a();

        static {
            Covode.recordClassIndex(72733);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<f> invoke() {
            return new t();
        }
    }

    static final class b extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113125a = new b();

        static {
            Covode.recordClassIndex(72734);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            t tVar = new t();
            tVar.setValue(Integer.valueOf(a.b.a()));
            return tVar;
        }
    }
}
