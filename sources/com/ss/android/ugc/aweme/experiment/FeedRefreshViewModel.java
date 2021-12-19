package com.ss.android.ugc.aweme.experiment;

import android.app.Activity;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class FeedRefreshViewModel extends ac {

    /* renamed from: b  reason: collision with root package name */
    public static final a f89506b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f89507a = i.a((h.f.a.a) c.f89511a);

    /* renamed from: c  reason: collision with root package name */
    private final h f89508c = i.a((h.f.a.a) d.f89512a);

    /* renamed from: d  reason: collision with root package name */
    private final h f89509d = i.a((h.f.a.a) b.f89510a);

    static {
        Covode.recordClassIndex(56247);
    }

    public final t<Boolean> a() {
        return (t) this.f89509d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56248);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static FeedRefreshViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(FeedRefreshViewModel.class);
            l.b(a2, "");
            return (FeedRefreshViewModel) a2;
        }
    }

    static final class b extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89510a = new b();

        static {
            Covode.recordClassIndex(56249);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    static final class c extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89511a = new c();

        static {
            Covode.recordClassIndex(56250);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            return new t();
        }
    }

    static final class d extends m implements h.f.a.a<t<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f89512a = new d();

        static {
            Covode.recordClassIndex(56251);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<String> invoke() {
            return new t();
        }
    }

    public static final FeedRefreshViewModel a(Activity activity) {
        l.d(activity, "");
        if (activity instanceof e) {
            return a.a((e) activity);
        }
        return null;
    }
}
