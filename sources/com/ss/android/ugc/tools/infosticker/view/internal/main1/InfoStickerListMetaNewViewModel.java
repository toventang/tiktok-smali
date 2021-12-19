package com.ss.android.ugc.tools.infosticker.view.internal.main1;

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

public final class InfoStickerListMetaNewViewModel extends HumbleViewModel implements au, d {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<m>> f149825a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149826b;

    /* renamed from: c  reason: collision with root package name */
    private final f.a.b.a f149827c;

    /* renamed from: d  reason: collision with root package name */
    private final LiveData<List<m>> f149828d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<com.ss.android.ugc.tools.view.widget.b.a> f149829e;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.a f149830f;

    static {
        Covode.recordClassIndex(98647);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.d
    public final LiveData<List<m>> a() {
        return this.f149828d;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.d
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> b() {
        return this.f149829e;
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f149827c.a();
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.d
    public final void c() {
        if (!isDestroyed()) {
            com.ss.android.ugc.tools.view.widget.b.a value = this.f149826b.getValue();
            if (value == null || value != com.ss.android.ugc.tools.view.widget.b.a.LOADING) {
                this.f149826b.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                f.a.b.b a2 = this.f149830f.d().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this));
                l.b(a2, "");
                f.a.j.a.a(a2, this.f149827c);
            }
        }
    }

    static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListMetaNewViewModel f149832a;

        static {
            Covode.recordClassIndex(98649);
        }

        b(InfoStickerListMetaNewViewModel infoStickerListMetaNewViewModel) {
            this.f149832a = infoStickerListMetaNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149832a.f149826b.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
        }
    }

    static final class a<T> implements f<List<? extends m>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InfoStickerListMetaNewViewModel f149831a;

        static {
            Covode.recordClassIndex(98648);
        }

        a(InfoStickerListMetaNewViewModel infoStickerListMetaNewViewModel) {
            this.f149831a = infoStickerListMetaNewViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.lifecycle.t<java.util.List<com.ss.android.ugc.tools.h.a.m>> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(List<? extends m> list) {
            com.ss.android.ugc.tools.view.widget.b.a aVar;
            List<? extends m> list2 = list;
            this.f149831a.f149825a.setValue(list2);
            t<com.ss.android.ugc.tools.view.widget.b.a> tVar = this.f149831a.f149826b;
            if (list2.isEmpty()) {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.EMPTY;
            } else {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.NONE;
            }
            tVar.setValue(aVar);
        }
    }
}
