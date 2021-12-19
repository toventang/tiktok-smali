package com.bytedance.android.livesdk.util.rxutils.autodispose;

import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import f.a.a.a;
import f.a.l.b;
import f.a.t;
import f.a.z;

/* access modifiers changed from: package-private */
public final class LifecycleEventsObservable extends t<i.a> {

    /* renamed from: a  reason: collision with root package name */
    final i f22124a;

    /* renamed from: b  reason: collision with root package name */
    final b<i.a> f22125b = new b<>();

    static {
        Covode.recordClassIndex(13033);
    }

    static final class ArchLifecycleObserver extends a implements l {

        /* renamed from: a  reason: collision with root package name */
        private final i f22127a;

        /* renamed from: b  reason: collision with root package name */
        private final z<? super i.a> f22128b;

        /* renamed from: c  reason: collision with root package name */
        private final b<i.a> f22129c;

        static {
            Covode.recordClassIndex(13035);
        }

        @Override // f.a.a.a
        public final void a() {
            this.f22127a.b(this);
        }

        /* access modifiers changed from: package-private */
        @v(a = i.a.ON_ANY)
        public final void onStateChange(m mVar, i.a aVar) {
            if (!isDisposed()) {
                if (!(aVar == i.a.ON_CREATE && this.f22129c.i() == aVar)) {
                    this.f22129c.onNext(aVar);
                }
                this.f22128b.onNext(aVar);
            }
        }

        ArchLifecycleObserver(i iVar, z<? super i.a> zVar, b<i.a> bVar) {
            this.f22127a = iVar;
            this.f22128b = zVar;
            this.f22129c = bVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22126a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 13034(0x32ea, float:1.8265E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.i.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.f22126a = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.f22126a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.f22126a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.STARTED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.f22126a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.f22126a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.<clinit>():void");
        }
    }

    LifecycleEventsObservable(i iVar) {
        this.f22124a = iVar;
    }

    @Override // f.a.t
    public final void a(z<? super i.a> zVar) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f22124a, zVar, this.f22125b);
        zVar.onSubscribe(archLifecycleObserver);
        if (!com.bytedance.android.livesdk.util.rxutils.autodispose.a.a.a(com.bytedance.android.livesdk.util.rxutils.autodispose.a.a.a.f22136a)) {
            zVar.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f22124a.a(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f22124a.b(archLifecycleObserver);
        }
    }
}
