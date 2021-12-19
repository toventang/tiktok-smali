package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.tools.h.a.m;
import com.ss.android.ugc.tools.infosticker.view.internal.d;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import f.a.d.f;
import h.f.b.l;
import java.util.List;

public final class InfoStickerListMetaViewModel extends HumbleViewModel implements au, d {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<m>> f149617a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149618b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f149619c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<List<m>> f149620d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<com.ss.android.ugc.tools.view.widget.b.a> f149621e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.d f149622f;

    static {
        Covode.recordClassIndex(98529);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.d
    public final LiveData<List<m>> a() {
        return this.f149620d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.d
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> b() {
        return this.f149621e;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f149619c.a();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.d
    public final void c() {
        if (!isDestroyed()) {
            com.ss.android.ugc.tools.view.widget.b.a value = this.f149618b.getValue();
            if (value == null || value != com.ss.android.ugc.tools.view.widget.b.a.LOADING) {
                this.f149618b.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                f.a.b.b a2 = this.f149622f.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this));
                l.b(a2, "");
                f.a.j.a.a(a2, this.f149619c);
            }
        }
    }

    static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListMetaViewModel f149624a;

        static {
            Covode.recordClassIndex(98531);
        }

        b(InfoStickerListMetaViewModel infoStickerListMetaViewModel) {
            this.f149624a = infoStickerListMetaViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149624a.f149618b.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
        }
    }

    static final class a<T> implements f<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListMetaViewModel f149623a;

        static {
            Covode.recordClassIndex(98530);
        }

        a(InfoStickerListMetaViewModel infoStickerListMetaViewModel) {
            this.f149623a = infoStickerListMetaViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.t<java.util.List<com.ss.android.ugc.tools.h.a.m>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends m> list) {
            com.ss.android.ugc.tools.view.widget.b.a aVar;
            List<? extends m> list2 = list;
            this.f149623a.f149617a.setValue(list2);
            t<com.ss.android.ugc.tools.view.widget.b.a> tVar = this.f149623a.f149618b;
            if (list2.isEmpty()) {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.EMPTY;
            } else {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.NONE;
            }
            tVar.setValue(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerListMetaViewModel(androidx.lifecycle.m mVar, com.ss.android.ugc.tools.infosticker.a.a.d dVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(dVar, "");
        this.f149622f = dVar;
        t<List<m>> tVar = new t<>();
        this.f149617a = tVar;
        this.f149620d = tVar;
        t<com.ss.android.ugc.tools.view.widget.b.a> tVar2 = new t<>();
        this.f149618b = tVar2;
        this.f149621e = tVar2;
    }
}
