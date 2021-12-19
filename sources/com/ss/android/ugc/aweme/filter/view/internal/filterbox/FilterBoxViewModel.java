package com.ss.android.ugc.aweme.filter.view.internal.filterbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.filter.repository.a.h;
import com.ss.android.ugc.aweme.filter.repository.a.i;
import com.ss.android.ugc.aweme.filter.view.a.f;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import h.f.b.l;
import h.p;
import h.v;

public final class FilterBoxViewModel extends HumbleViewModel implements au, g {

    /* renamed from: a  reason: collision with root package name */
    public final t<p<f.a, com.ss.android.ugc.aweme.filter.repository.a.a>> f95786a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public h f95787b;

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f95788c;

    /* renamed from: d  reason: collision with root package name */
    private final i f95789d;

    static {
        Covode.recordClassIndex(60703);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.g
    public final LiveData<p<f.a, com.ss.android.ugc.aweme.filter.repository.a.a>> a() {
        return this.f95786a;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.g
    public final void c() {
        h hVar = this.f95787b;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        f.a.b.b bVar = this.f95788c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f95788c = null;
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.g
    public final void b() {
        f.a.b.b bVar = this.f95788c;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f95788c = null;
        this.f95787b = null;
        if (!isDestroyed()) {
            this.f95786a.setValue(v.a(f.a.LOADING, null));
            this.f95788c = this.f95789d.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this));
        }
    }

    static final class b<T> implements f.a.d.f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterBoxViewModel f95791a;

        static {
            Covode.recordClassIndex(60705);
        }

        b(FilterBoxViewModel filterBoxViewModel) {
            this.f95791a = filterBoxViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f95791a.f95786a.setValue(v.a(f.a.ERROR, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.g
    public final void a(com.ss.android.ugc.aweme.filter.repository.a.b bVar) {
        l.d(bVar, "");
        h hVar = this.f95787b;
        if (hVar != null) {
            hVar.a(bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.view.internal.filterbox.g
    public final void b(com.ss.android.ugc.aweme.filter.repository.a.b bVar) {
        l.d(bVar, "");
        h hVar = this.f95787b;
        if (hVar != null) {
            hVar.b(bVar);
        }
    }

    static final class a<T> implements f.a.d.f<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterBoxViewModel f95790a;

        static {
            Covode.recordClassIndex(60704);
        }

        a(FilterBoxViewModel filterBoxViewModel) {
            this.f95790a = filterBoxViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(h hVar) {
            h hVar2 = hVar;
            this.f95790a.f95787b = hVar2;
            com.ss.android.ugc.aweme.filter.repository.a.a a2 = hVar2.a();
            if (a2.f95531b.isEmpty()) {
                this.f95790a.f95786a.setValue(v.a(f.a.EMPTY, null));
            } else {
                this.f95790a.f95786a.setValue(v.a(f.a.OK, a2));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterBoxViewModel(m mVar, com.ss.android.ugc.aweme.filter.repository.a.i iVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(iVar, "");
        this.f95789d = iVar;
    }
}
