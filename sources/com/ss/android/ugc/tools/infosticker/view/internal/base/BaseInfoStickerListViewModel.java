package com.ss.android.ugc.tools.infosticker.view.internal.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.infosticker.view.internal.e;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import f.a.ab;
import f.a.d.f;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class BaseInfoStickerListViewModel<DATA> extends HumbleViewModel implements e<DATA>, e {

    /* renamed from: a  reason: collision with root package name */
    public final t<List<DATA>> f149533a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149534b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f149535c;

    /* renamed from: d  reason: collision with root package name */
    private f.a.b.a f149536d;

    static {
        Covode.recordClassIndex(98463);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public LiveData<Object> e() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract ab<List<DATA>> h();

    /* access modifiers changed from: protected */
    public abstract ab<List<DATA>> i();

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<List<DATA>> b() {
        return this.f149533a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> c() {
        return this.f149534b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public LiveData<com.ss.android.ugc.tools.view.widget.b.a> d() {
        return this.f149535c;
    }

    private f.a.b.a a() {
        f.a.b.a aVar = this.f149536d;
        if (aVar != null) {
            return aVar;
        }
        f.a.b.a aVar2 = new f.a.b.a();
        this.f149536d = aVar2;
        return aVar2;
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        f.a.b.a aVar = this.f149536d;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f149536d = null;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void f() {
        if (!isDestroyed()) {
            com.ss.android.ugc.tools.view.widget.b.a value = this.f149534b.getValue();
            if (value == null || !(value == com.ss.android.ugc.tools.view.widget.b.a.EMPTY || value == com.ss.android.ugc.tools.view.widget.b.a.LOADING)) {
                List<DATA> value2 = this.f149533a.getValue();
                if (value2 != null) {
                    l.b(value2, "");
                    if (true ^ value2.isEmpty()) {
                        return;
                    }
                }
                this.f149534b.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                a().a(h().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this)));
            }
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public final void g() {
        if (!isDestroyed()) {
            com.ss.android.ugc.tools.view.widget.b.a value = this.f149534b.getValue();
            if (value == null || value == com.ss.android.ugc.tools.view.widget.b.a.NONE) {
                List<DATA> value2 = this.f149533a.getValue();
                if (value2 == null || !value2.isEmpty()) {
                    com.ss.android.ugc.tools.view.widget.b.a value3 = this.f149535c.getValue();
                    if (value3 == null || !(value3 == com.ss.android.ugc.tools.view.widget.b.a.EMPTY || value3 == com.ss.android.ugc.tools.view.widget.b.a.LOADING)) {
                        this.f149535c.setValue(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
                        a().a(i().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new c(this), new d(this)));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInfoStickerListViewModel f149538a;

        static {
            Covode.recordClassIndex(98465);
        }

        b(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f149538a = baseInfoStickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149538a.f149534b.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInfoStickerListViewModel f149540a;

        static {
            Covode.recordClassIndex(98467);
        }

        d(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f149540a = baseInfoStickerListViewModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f149540a.f149535c.setValue(com.ss.android.ugc.tools.view.widget.b.a.ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f<List<? extends DATA>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInfoStickerListViewModel f149537a;

        static {
            Covode.recordClassIndex(98464);
        }

        a(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f149537a = baseInfoStickerListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.tools.view.widget.b.a aVar;
            List<DATA> list = (List) obj;
            this.f149537a.f149533a.setValue(list);
            t<com.ss.android.ugc.tools.view.widget.b.a> tVar = this.f149537a.f149534b;
            if (list.isEmpty()) {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.EMPTY;
            } else {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.NONE;
            }
            tVar.setValue(aVar);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.e
    public void a(com.ss.android.ugc.tools.h.a.m mVar) {
        l.d(mVar, "");
        l.d(mVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f<List<? extends DATA>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInfoStickerListViewModel f149539a;

        static {
            Covode.recordClassIndex(98466);
        }

        c(BaseInfoStickerListViewModel baseInfoStickerListViewModel) {
            this.f149539a = baseInfoStickerListViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<DATA> arrayList;
            com.ss.android.ugc.tools.view.widget.b.a aVar;
            List list = (List) obj;
            t<List<DATA>> tVar = this.f149539a.f149533a;
            List<DATA> value = this.f149539a.f149533a.getValue();
            if (value != null) {
                arrayList = n.g((Collection) value);
            } else {
                arrayList = new ArrayList<>();
            }
            l.b(list, "");
            arrayList.addAll(list);
            tVar.setValue(arrayList);
            t<com.ss.android.ugc.tools.view.widget.b.a> tVar2 = this.f149539a.f149535c;
            if (list.isEmpty()) {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.EMPTY;
            } else {
                aVar = com.ss.android.ugc.tools.view.widget.b.a.NONE;
            }
            tVar2.setValue(aVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoStickerListViewModel(m mVar) {
        super(mVar);
        l.d(mVar, "");
        t<List<DATA>> tVar = new t<>();
        this.f149533a = tVar;
        t<com.ss.android.ugc.tools.view.widget.b.a> tVar2 = new t<>();
        this.f149535c = tVar2;
        tVar.setValue(z.INSTANCE);
        tVar2.setValue(com.ss.android.ugc.tools.view.widget.b.a.NONE);
    }
}
