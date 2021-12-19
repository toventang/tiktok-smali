package com.ss.android.ugc.aweme.journey.flow;

import android.content.Context;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.journey.a.c;
import com.ss.android.ugc.aweme.journey.aa;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.step.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;

public final class NewUserJourneyFlowDependencies extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final b f104845a = new b();

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.a<? extends WeakReference<Context>> f104846b = a.f104852a;

    /* renamed from: c  reason: collision with root package name */
    private t<aa> f104847c;

    /* renamed from: d  reason: collision with root package name */
    private ComponentDependencies f104848d;

    /* renamed from: e  reason: collision with root package name */
    private t<Boolean> f104849e;

    /* renamed from: f  reason: collision with root package name */
    private h.f.a.a<z> f104850f;

    /* renamed from: g  reason: collision with root package name */
    private c f104851g;

    static {
        Covode.recordClassIndex(67241);
    }

    static final class a extends m implements h.f.a.a<WeakReference<Context>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f104852a = new a();

        static {
            Covode.recordClassIndex(67242);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(null);
        }
    }

    public final ComponentDependencies a() {
        ComponentDependencies componentDependencies = this.f104848d;
        if (componentDependencies == null) {
            l.a("componentDependencies");
        }
        return componentDependencies;
    }

    public final t<Boolean> b() {
        t<Boolean> tVar = this.f104849e;
        if (tVar == null) {
            l.a("needRefreshLiveData");
        }
        return tVar;
    }

    public final h.f.a.a<z> d() {
        h.f.a.a<z> aVar = this.f104850f;
        if (aVar == null) {
            l.a("onFinishRunnable");
        }
        return aVar;
    }

    public final c c() {
        if (this.f104851g == null) {
            this.f104851g = new c();
        }
        c cVar = this.f104851g;
        if (cVar == null) {
            l.b();
        }
        return cVar;
    }

    public final void a(t<aa> tVar) {
        l.d(tVar, "");
        this.f104847c = tVar;
    }

    public final void b(t<Boolean> tVar) {
        l.d(tVar, "");
        this.f104849e = tVar;
    }

    public final void a(c cVar) {
        l.d(cVar, "");
        this.f104851g = cVar;
    }

    public final void b(h.f.a.a<? extends WeakReference<Context>> aVar) {
        l.d(aVar, "");
        this.f104846b = aVar;
    }

    public final void a(ComponentDependencies componentDependencies) {
        l.d(componentDependencies, "");
        this.f104848d = componentDependencies;
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f104850f = aVar;
    }
}
