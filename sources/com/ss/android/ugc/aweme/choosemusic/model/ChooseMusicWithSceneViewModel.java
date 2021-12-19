package com.ss.android.ugc.aweme.choosemusic.model;

import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.choosemusic.model.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ChooseMusicWithSceneViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public boolean f70572a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f70573b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPagerBottomSheetBehavior<View> f70574c;

    /* renamed from: d  reason: collision with root package name */
    public String f70575d;

    /* renamed from: e  reason: collision with root package name */
    public String f70576e;

    /* renamed from: f  reason: collision with root package name */
    private final h f70577f = i.a((h.f.a.a) b.f70582a);

    /* renamed from: g  reason: collision with root package name */
    private final h f70578g = i.a((h.f.a.a) a.f70581a);

    /* renamed from: h  reason: collision with root package name */
    private final h f70579h = i.a((h.f.a.a) c.f70583a);

    /* renamed from: i  reason: collision with root package name */
    private final h f70580i = i.a((h.f.a.a) d.f70584a);

    static {
        Covode.recordClassIndex(43521);
    }

    public final t<t> a() {
        return (t) this.f70577f.getValue();
    }

    public final t<s> b() {
        return (t) this.f70578g.getValue();
    }

    public final t<a> c() {
        return (t) this.f70579h.getValue();
    }

    public final t<a> d() {
        return (t) this.f70580i.getValue();
    }

    static final class b extends m implements h.f.a.a<t<t>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f70582a = new b();

        static {
            Covode.recordClassIndex(43523);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<t> invoke() {
            return new t();
        }
    }

    static final class a extends m implements h.f.a.a<t<s>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70581a = new a();

        static {
            Covode.recordClassIndex(43522);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<s> invoke() {
            t tVar = new t();
            tVar.setValue(new s());
            return tVar;
        }
    }

    static final class c extends m implements h.f.a.a<t<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f70583a = new c();

        static {
            Covode.recordClassIndex(43524);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<a> invoke() {
            t tVar = new t();
            tVar.setValue(a.c.f70594a);
            return tVar;
        }
    }

    static final class d extends m implements h.f.a.a<t<a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f70584a = new d();

        static {
            Covode.recordClassIndex(43525);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<a> invoke() {
            t tVar = new t();
            tVar.setValue(a.c.f70594a);
            return tVar;
        }
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        c().setValue(aVar);
    }

    public final void a(s sVar) {
        l.d(sVar, "");
        b().setValue(sVar);
    }
}
