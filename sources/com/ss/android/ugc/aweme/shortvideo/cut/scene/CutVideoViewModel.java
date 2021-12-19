package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import h.f.b.l;
import h.f.b.m;

public final class CutVideoViewModel extends BaseJediViewModel<CutVideoState> {

    /* renamed from: a  reason: collision with root package name */
    public ad f125546a;

    static {
        Covode.recordClassIndex(82442);
    }

    public final void a() {
        c(b.f125548a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoState(null, null, 3, null);
    }

    public final ad b() {
        ad adVar = this.f125546a;
        if (adVar == null) {
            l.a("cutVideoModel");
        }
        return adVar;
    }

    public final boolean g() {
        ad adVar = this.f125546a;
        if (adVar == null) {
            l.a("cutVideoModel");
        }
        if (adVar.f125552a.size() > 1) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        ad adVar = this.f125546a;
        if (adVar == null) {
            l.a("cutVideoModel");
        }
        if (!adVar.f125564m) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f125546a == null) {
            return false;
        }
        ad adVar = this.f125546a;
        if (adVar == null) {
            l.a("cutVideoModel");
        }
        if (adVar.f125560i != null) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        ad adVar = this.f125546a;
        if (adVar == null) {
            l.a("cutVideoModel");
        }
        if (l.a((Object) "system_upload", (Object) adVar.f125563l)) {
            return false;
        }
        ad adVar2 = this.f125546a;
        if (adVar2 == null) {
            l.a("cutVideoModel");
        }
        if (l.a((Object) "lv_sync", (Object) adVar2.f125563l)) {
            return false;
        }
        return f.c();
    }

    public final String k() {
        if (this.f125546a == null) {
            return null;
        }
        ad adVar = this.f125546a;
        if (adVar == null) {
            l.a("cutVideoModel");
        }
        if (adVar.f125558g == null) {
            return null;
        }
        ad adVar2 = this.f125546a;
        if (adVar2 == null) {
            l.a("cutVideoModel");
        }
        t tVar = adVar2.f125558g;
        if (tVar == null) {
            l.b();
        }
        return tVar.getAppId();
    }

    public final void a(ad adVar) {
        l.d(adVar, "");
        this.f125546a = adVar;
    }

    static final class a extends m implements h.f.a.b<CutVideoState, CutVideoState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f125547a = new a();

        static {
            Covode.recordClassIndex(82443);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoState invoke(CutVideoState cutVideoState) {
            CutVideoState cutVideoState2 = cutVideoState;
            l.d(cutVideoState2, "");
            return CutVideoState.copy$default(cutVideoState2, null, new p(), 1, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<CutVideoState, CutVideoState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f125548a = new b();

        static {
            Covode.recordClassIndex(82444);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CutVideoState invoke(CutVideoState cutVideoState) {
            CutVideoState cutVideoState2 = cutVideoState;
            l.d(cutVideoState2, "");
            return CutVideoState.copy$default(cutVideoState2, new p(), null, 2, null);
        }
    }
}
