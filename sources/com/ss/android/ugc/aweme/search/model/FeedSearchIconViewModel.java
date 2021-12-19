package com.ss.android.ugc.aweme.search.model;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class FeedSearchIconViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121488a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f121489b = i.a((h.f.a.a) b.f121492a);

    /* renamed from: c  reason: collision with root package name */
    private final h f121490c = i.a((h.f.a.a) d.f121494a);

    /* renamed from: d  reason: collision with root package name */
    private final h f121491d = i.a((h.f.a.a) c.f121493a);

    static {
        Covode.recordClassIndex(79145);
    }

    public final NextLiveData<Integer> a() {
        return (NextLiveData) this.f121489b.getValue();
    }

    public final NextLiveData<Boolean> b() {
        return (NextLiveData) this.f121490c.getValue();
    }

    public final NextLiveData<Boolean> c() {
        return (NextLiveData) this.f121491d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79146);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static FeedSearchIconViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(FeedSearchIconViewModel.class);
            l.b(a2, "");
            return (FeedSearchIconViewModel) a2;
        }
    }

    static final class b extends m implements h.f.a.a<NextLiveData<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f121492a = new b();

        static {
            Covode.recordClassIndex(79147);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<Integer> invoke() {
            return new NextLiveData();
        }
    }

    static final class c extends m implements h.f.a.a<NextLiveData<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f121493a = new c();

        static {
            Covode.recordClassIndex(79148);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<Boolean> invoke() {
            return new NextLiveData();
        }
    }

    static final class d extends m implements h.f.a.a<NextLiveData<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f121494a = new d();

        static {
            Covode.recordClassIndex(79149);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NextLiveData<Boolean> invoke() {
            return new NextLiveData();
        }
    }

    public final void d() {
        a().postValue(2);
    }

    public final boolean e() {
        return l.a((Object) b().getValue(), (Object) true);
    }
}
