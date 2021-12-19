package com.ss.android.ugc.aweme.shortvideo.cut.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class VEVideoCutterViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f126284a = i.a((h.f.a.a) a.f126285a);

    static {
        Covode.recordClassIndex(82889);
    }

    public final t<a> a() {
        return (t) this.f126284a.getValue();
    }

    static final class a extends m implements h.f.a.a<t<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f126285a = new a();

        static {
            Covode.recordClassIndex(82890);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<a> invoke() {
            return new t();
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        a().setValue(aVar);
    }
}
