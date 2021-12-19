package com.ss.android.ugc.tools.infosticker.view.internal.base;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.view.internal.k;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import f.a.d.f;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseInfoStickerStateViewModel<DATA> extends HumbleViewModel implements k<DATA>, k {

    /* renamed from: a  reason: collision with root package name */
    public final t<Map<DATA, p<c, Integer>>> f149541a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public final t<d<List<DATA>>> f149542b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<d<List<DATA>>> f149543c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    private f.a.b.a f149544d;

    static {
        Covode.recordClassIndex(98468);
    }

    /* access modifiers changed from: protected */
    public abstract f.a.t<am<DATA, c, Integer>> b(DATA data);

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<Map<DATA, p<c, Integer>>> j() {
        return this.f149541a;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<d<List<DATA>>> k() {
        return this.f149542b;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final LiveData<d<List<DATA>>> l() {
        return this.f149543c;
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        f.a.b.a aVar = this.f149544d;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f149544d = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseInfoStickerStateViewModel(m mVar) {
        super(mVar);
        l.d(mVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInfoStickerStateViewModel f149546a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f149547b;

        static {
            Covode.recordClassIndex(98470);
        }

        b(BaseInfoStickerStateViewModel baseInfoStickerStateViewModel, Object obj) {
            this.f149546a = baseInfoStickerStateViewModel;
            this.f149547b = obj;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            Map<DATA, p<c, Integer>> linkedHashMap;
            BaseInfoStickerStateViewModel baseInfoStickerStateViewModel = this.f149546a;
            Map<DATA, p<c, Integer>> value = baseInfoStickerStateViewModel.f149541a.getValue();
            if (value != null) {
                linkedHashMap = ag.d(value);
            } else {
                linkedHashMap = new LinkedHashMap<>();
            }
            linkedHashMap.remove(this.f149547b);
            baseInfoStickerStateViewModel.f149541a.setValue(linkedHashMap);
            BaseInfoStickerStateViewModel.a(this.f149546a.f149543c, this.f149547b);
        }
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.k
    public final void a(DATA data) {
        Map<DATA, p<c, Integer>> linkedHashMap;
        if (!isDestroyed()) {
            Map<DATA, p<c, Integer>> value = this.f149541a.getValue();
            if (value == null || !value.containsKey(data)) {
                Map<DATA, p<c, Integer>> value2 = this.f149541a.getValue();
                if (value2 != null) {
                    linkedHashMap = ag.d(value2);
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put(data, v.a(c.UNKNOWN, 0));
                this.f149541a.setValue(linkedHashMap);
                f.a.b.b a2 = b(data).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.b.a.a()).a(new a(this), new b(this, data));
                f.a.b.a aVar = this.f149544d;
                if (aVar == null) {
                    aVar = new f.a.b.a();
                    this.f149544d = aVar;
                }
                aVar.a(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f<am<DATA, c, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseInfoStickerStateViewModel f149545a;

        static {
            Covode.recordClassIndex(98469);
        }

        a(BaseInfoStickerStateViewModel baseInfoStickerStateViewModel) {
            this.f149545a = baseInfoStickerStateViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Map<DATA, p<c, Integer>> linkedHashMap;
            Map<DATA, p<c, Integer>> linkedHashMap2;
            Map<DATA, p<c, Integer>> linkedHashMap3;
            am amVar = (am) obj;
            A a2 = amVar.f39387a;
            B b2 = amVar.f39388b;
            C c2 = amVar.f39389c;
            int i2 = d.f149585a[b2.ordinal()];
            if (i2 == 1) {
                BaseInfoStickerStateViewModel baseInfoStickerStateViewModel = this.f149545a;
                Map<DATA, p<c, Integer>> value = baseInfoStickerStateViewModel.f149541a.getValue();
                if (value != null) {
                    linkedHashMap = ag.d(value);
                } else {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.remove(a2);
                baseInfoStickerStateViewModel.f149541a.setValue(linkedHashMap);
                BaseInfoStickerStateViewModel.a(this.f149545a.f149542b, a2);
            } else if (i2 != 2) {
                BaseInfoStickerStateViewModel baseInfoStickerStateViewModel2 = this.f149545a;
                Map<DATA, p<c, Integer>> value2 = baseInfoStickerStateViewModel2.f149541a.getValue();
                if (value2 != null) {
                    linkedHashMap3 = ag.d(value2);
                } else {
                    linkedHashMap3 = new LinkedHashMap<>();
                }
                linkedHashMap3.put(a2, v.a(b2, c2));
                baseInfoStickerStateViewModel2.f149541a.setValue(linkedHashMap3);
            } else {
                BaseInfoStickerStateViewModel baseInfoStickerStateViewModel3 = this.f149545a;
                Map<DATA, p<c, Integer>> value3 = baseInfoStickerStateViewModel3.f149541a.getValue();
                if (value3 != null) {
                    linkedHashMap2 = ag.d(value3);
                } else {
                    linkedHashMap2 = new LinkedHashMap<>();
                }
                linkedHashMap2.remove(a2);
                baseInfoStickerStateViewModel3.f149541a.setValue(linkedHashMap2);
                BaseInfoStickerStateViewModel.a(this.f149545a.f149543c, a2);
            }
        }
    }

    public static void a(t<d<List<DATA>>> tVar, DATA data) {
        List arrayList;
        List<DATA> a2;
        d<List<DATA>> value = tVar.getValue();
        if (value == null || (a2 = value.a()) == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = n.g((Collection) a2);
        }
        arrayList.add(data);
        tVar.setValue(new d<>(arrayList));
    }
}
