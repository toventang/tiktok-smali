package com.bytedance.android.livesdk.util.rxutils.autodispose;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.util.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.android.livesdk.util.rxutils.autodispose.b.d;
import com.bytedance.android.livesdk.util.rxutils.autodispose.b.e;
import com.bytedance.covode.number.Covode;
import f.a.f;
import f.a.t;

public final class a implements d<i.a> {

    /* renamed from: a  reason: collision with root package name */
    private static final com.bytedance.android.livesdk.util.rxutils.autodispose.b.a<i.a> f22130a = b.f22142a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdk.util.rxutils.autodispose.b.a<i.a> f22131b;

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleEventsObservable f22132c;

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.b.d
    public final t<i.a> a() {
        return this.f22132c;
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.b.d
    public final com.bytedance.android.livesdk.util.rxutils.autodispose.b.a<i.a> b() {
        return this.f22131b;
    }

    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.ab
    public final f c() {
        return e.a(this);
    }

    static {
        Covode.recordClassIndex(13036);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.b.d
    public final /* synthetic */ i.a d() {
        i.a aVar;
        LifecycleEventsObservable lifecycleEventsObservable = this.f22132c;
        int i2 = LifecycleEventsObservable.AnonymousClass1.f22126a[lifecycleEventsObservable.f22124a.a().ordinal()];
        if (i2 == 1) {
            aVar = i.a.ON_CREATE;
        } else if (i2 == 2) {
            aVar = i.a.ON_START;
        } else if (i2 == 3 || i2 == 4) {
            aVar = i.a.ON_RESUME;
        } else {
            aVar = i.a.ON_DESTROY;
        }
        lifecycleEventsObservable.f22125b.onNext(aVar);
        return this.f22132c.f22125b.i();
    }

    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22133a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 13037(0x32ed, float:1.8269E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$a[] r0 = androidx.lifecycle.i.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.f22133a = r2
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.f22133a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.f22133a     // Catch:{ NoSuchFieldError -> 0x002d }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.f22133a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.f22133a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.f22133a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.lifecycle.i$a r0 = androidx.lifecycle.i.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.util.rxutils.autodispose.a.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.util.rxutils.autodispose.a$a  reason: collision with other inner class name */
    public static class C0485a implements com.bytedance.android.livesdk.util.rxutils.autodispose.b.a<i.a> {

        /* renamed from: a  reason: collision with root package name */
        private final i.a f22134a;

        static {
            Covode.recordClassIndex(13038);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.android.livesdk.util.rxutils.autodispose.b.a, f.a.d.g
        public final /* bridge */ /* synthetic */ i.a apply(i.a aVar) {
            return this.f22134a;
        }

        C0485a(i.a aVar) {
            this.f22134a = aVar;
        }
    }

    private static a a(i iVar, com.bytedance.android.livesdk.util.rxutils.autodispose.b.a<i.a> aVar) {
        return new a(iVar, aVar);
    }

    private a(i iVar, com.bytedance.android.livesdk.util.rxutils.autodispose.b.a<i.a> aVar) {
        this.f22132c = new LifecycleEventsObservable(iVar);
        this.f22131b = aVar;
    }

    private static a a(i iVar, i.a aVar) {
        return a(iVar, new C0485a(aVar));
    }

    public static a a(m mVar, i.a aVar) {
        return a(mVar.getLifecycle(), aVar);
    }
}
