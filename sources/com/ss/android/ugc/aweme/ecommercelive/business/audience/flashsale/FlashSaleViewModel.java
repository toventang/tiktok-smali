package com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class FlashSaleViewModel extends AndroidViewModel {

    /* renamed from: e  reason: collision with root package name */
    public static final a f87804e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f87805b;

    /* renamed from: c  reason: collision with root package name */
    public final t<List<c>> f87806c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<List<c>> f87807d = new t<>();

    /* renamed from: f  reason: collision with root package name */
    private List<? extends c> f87808f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f87809g = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(55219);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55220);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ z.a $needUpdate;
        final /* synthetic */ c $owner;
        final /* synthetic */ List $stateChangedList;

        static {
            Covode.recordClassIndex(55221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List list, c cVar, z.a aVar) {
            super(0);
            this.$stateChangedList = list;
            this.$owner = cVar;
            this.$needUpdate = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.$stateChangedList.add(this.$owner);
            this.$needUpdate.element = true;
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FlashSaleViewModel f87810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f87811b;

        static {
            Covode.recordClassIndex(55222);
        }

        c(FlashSaleViewModel flashSaleViewModel, List list) {
            this.f87810a = flashSaleViewModel;
            this.f87811b = list;
        }

        public final void run() {
            if (this.f87810a.f87805b) {
                this.f87810a.b(this.f87811b);
            }
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        a();
        this.f87808f = null;
    }

    public final void a() {
        if (this.f87805b) {
            this.f87809g.removeCallbacksAndMessages(null);
            this.f87805b = false;
            this.f87806c.setValue(new ArrayList());
            this.f87807d.setValue(new ArrayList());
        }
    }

    public final void a(List<? extends c> list) {
        l.d(list, "");
        if (!this.f87805b) {
            this.f87805b = true;
            this.f87808f = list;
            b(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashSaleViewModel(Application application) {
        super(application);
        l.d(application, "");
    }

    public final c a(h.f.a.b<? super c, Boolean> bVar) {
        l.d(bVar, "");
        List<? extends c> list = this.f87808f;
        if (list == null) {
            return null;
        }
        for (c cVar : list) {
            if (bVar.invoke(cVar).booleanValue()) {
                return cVar;
            }
        }
        return null;
    }

    public final void b(List<? extends c> list) {
        a b2;
        if (!(list == null || list.isEmpty())) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (c cVar : list) {
                if (cVar.a() && (b2 = cVar.b()) != null) {
                    z.a aVar = new z.a();
                    aVar.element = false;
                    b2.a(new b(arrayList, cVar, aVar));
                    if (b2.a() || b2.b()) {
                        aVar.element = true;
                        z = true;
                    }
                    if (aVar.element) {
                        arrayList2.add(cVar);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                this.f87807d.setValue(arrayList2);
            }
            if (!arrayList.isEmpty()) {
                this.f87806c.setValue(arrayList);
            }
            if (z) {
                this.f87809g.postDelayed(new c(this, list), Math.max(0L, 1000 - (SystemClock.elapsedRealtime() - elapsedRealtime)));
            }
        }
    }
}
