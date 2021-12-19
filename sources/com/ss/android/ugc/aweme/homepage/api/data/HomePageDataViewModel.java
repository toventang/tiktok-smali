package com.ss.android.ugc.aweme.homepage.api.data;

import android.content.Intent;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.u;
import java.util.concurrent.locks.Lock;

public final class HomePageDataViewModel extends ac {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f99118a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f99119b;

    /* renamed from: c  reason: collision with root package name */
    public final a f99120c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final Lock f99121d = new b();

    /* renamed from: e  reason: collision with root package name */
    public final Message f99122e = new Message();

    /* renamed from: f  reason: collision with root package name */
    public String f99123f;

    /* renamed from: g  reason: collision with root package name */
    public Aweme f99124g;

    /* renamed from: h  reason: collision with root package name */
    public t<String> f99125h = new t<>();

    /* renamed from: i  reason: collision with root package name */
    public t<String> f99126i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public String f99127j;

    /* renamed from: k  reason: collision with root package name */
    public Aweme f99128k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f99129l;

    /* renamed from: m  reason: collision with root package name */
    public int f99130m = 1;
    private final h o = i.a((h.f.a.a) c.f99132a);
    private final h p = i.a((h.f.a.a) b.f99131a);

    public static final class a {
        static {
            Covode.recordClassIndex(63151);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a$a  reason: collision with other inner class name */
        public static final class C2418a implements ad.b {
            static {
                Covode.recordClassIndex(63152);
            }

            C2418a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new HomePageDataViewModel();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static HomePageDataViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, new C2418a()).a(HomePageDataViewModel.class);
            l.b(a2, "");
            return (HomePageDataViewModel) a2;
        }
    }

    static {
        Covode.recordClassIndex(63150);
    }

    public final t<Boolean> a() {
        return (t) this.o.getValue();
    }

    public final t<u<Integer, Integer, Intent>> b() {
        return (t) this.p.getValue();
    }

    static final class b extends m implements h.f.a.a<t<u<? extends Integer, ? extends Integer, ? extends Intent>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99131a = new b();

        static {
            Covode.recordClassIndex(63153);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<u<? extends Integer, ? extends Integer, ? extends Intent>> invoke() {
            t tVar = new t();
            tVar.setValue(null);
            return tVar;
        }
    }

    static final class c extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f99132a = new c();

        static {
            Covode.recordClassIndex(63154);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            t tVar = new t();
            tVar.setValue(null);
            return tVar;
        }
    }

    public final String c() {
        return this.f99125h.getValue();
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f99118a = null;
        b().setValue(null);
    }

    public final void a(String str) {
        this.f99125h.setValue(str);
    }
}
