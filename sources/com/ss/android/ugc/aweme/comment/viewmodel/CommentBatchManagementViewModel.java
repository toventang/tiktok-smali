package com.ss.android.ugc.aweme.comment.viewmodel;

import androidx.fragment.app.e;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.comment.model.Comment;
import h.f.b.l;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Map;

public final class CommentBatchManagementViewModel extends ac implements au {

    /* renamed from: e  reason: collision with root package name */
    public static final a f72893e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f72894a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Comment> f72895b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Comment> f72896c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, com.ss.android.ugc.aweme.comment.barrage.c> f72897d = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    private final h f72898f = i.a((h.f.a.a) c.f72901a);

    /* renamed from: g  reason: collision with root package name */
    private final h f72899g = i.a((h.f.a.a) b.f72900a);

    static {
        Covode.recordClassIndex(44900);
    }

    public final t<Boolean> a() {
        return (t) this.f72898f.getValue();
    }

    public final t<Integer> b() {
        return (t) this.f72899g.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44901);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static CommentBatchManagementViewModel a(e eVar) {
            l.d(eVar, "");
            ac a2 = a(ae.a(eVar, (ad.b) null), "CommentBatchManagementViewModel", CommentBatchManagementViewModel.class);
            l.b(a2, "");
            return (CommentBatchManagementViewModel) a2;
        }

        private static ac a(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f72900a = new b();

        static {
            Covode.recordClassIndex(44902);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            t tVar = new t();
            tVar.setValue(0);
            return tVar;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f72901a = new c();

        static {
            Covode.recordClassIndex(44903);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            t tVar = new t();
            tVar.setValue(false);
            return tVar;
        }
    }

    public final void c() {
        this.f72894a = 0;
        this.f72895b.clear();
        this.f72896c.clear();
    }
}
