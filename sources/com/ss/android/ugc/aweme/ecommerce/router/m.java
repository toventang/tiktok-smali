package com.ss.android.ugc.aweme.ecommerce.router;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.i;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.z;

public abstract class m {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final Strategy$lifecycleObserver$1 f87181a;

    /* renamed from: b  reason: collision with root package name */
    private final h f87182b;

    /* renamed from: g  reason: collision with root package name */
    public b f87183g;

    /* renamed from: h  reason: collision with root package name */
    public Uri f87184h;

    /* renamed from: i  reason: collision with root package name */
    public Uri f87185i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f87186j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f87187k;

    /* renamed from: l  reason: collision with root package name */
    public final e f87188l;

    /* renamed from: m  reason: collision with root package name */
    public final i f87189m;

    public enum b {
        UNKNOWN,
        NATIVE,
        FALLBACK;

        static {
            Covode.recordClassIndex(54715);
        }
    }

    static {
        Covode.recordClassIndex(54713);
    }

    public m() {
        this(null, null, 3);
    }

    public final com.ss.android.ugc.aweme.ecommerce.router.view.a i() {
        return (com.ss.android.ugc.aweme.ecommerce.router.view.a) this.f87182b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54714);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.router.view.a> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(54716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.router.view.a invoke() {
            e eVar = null;
            if (n.f87191a[this.this$0.f87183g.ordinal()] != 1) {
                return null;
            }
            e eVar2 = this.this$0.f87188l;
            if (eVar2 == null) {
                i iVar = this.this$0.f87189m;
                if (iVar != null) {
                    eVar = iVar.getActivity();
                }
            } else {
                eVar = eVar2;
            }
            IStrategyService b2 = StrategyService.b();
            if (eVar == null) {
                l.b();
            }
            Uri uri = this.this$0.f87185i;
            if (uri == null) {
                l.b();
            }
            return b2.a(eVar, uri, this.this$0.f87186j);
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f87183g = bVar;
    }

    public void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        int i2 = n.f87192b[this.f87183g.ordinal()];
        if (i2 == 1) {
            com.ss.android.ugc.aweme.ecommerce.router.view.a i3 = i();
            if (i3 == null || !i3.a()) {
                aVar.invoke();
            }
        } else if (i2 != 2) {
            aVar.invoke();
        } else {
            aVar.invoke();
        }
    }

    public final void a(Activity activity, Bundle bundle) {
        boolean z;
        com.ss.android.ugc.aweme.ecommerce.router.view.a i2;
        l.d(activity, "");
        if (bundle != null) {
            z = bundle.getBoolean("tiktokec_fallback_is_reconstructed");
        } else {
            z = false;
        }
        this.f87187k = z;
        if (n.f87193c[this.f87183g.ordinal()] == 1 && (i2 = i()) != null) {
            i2.a(activity, bundle);
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        com.ss.android.ugc.aweme.ecommerce.router.view.a i2;
        l.d(activity, "");
        if (bundle != null) {
            bundle.putBoolean("tiktokec_fallback_is_reconstructed", true);
        }
        if (n.f87194d[this.f87183g.ordinal()] == 1 && (i2 = i()) != null) {
            i2.b(activity, bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m(androidx.fragment.app.e r3, androidx.appcompat.app.i r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.f87188l = r3
            r2.f87189m = r4
            com.ss.android.ugc.aweme.ecommerce.router.m$b r0 = com.ss.android.ugc.aweme.ecommerce.router.m.b.UNKNOWN
            r2.f87183g = r0
            r0 = 1
            r2.f87186j = r0
            com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1 r1 = new com.ss.android.ugc.aweme.ecommerce.router.Strategy$lifecycleObserver$1
            r1.<init>(r2)
            r2.f87181a = r1
            if (r3 != 0) goto L_0x002e
            if (r4 == 0) goto L_0x003b
        L_0x0019:
            androidx.lifecycle.i r0 = r4.getLifecycle()
            if (r0 == 0) goto L_0x0022
            r0.a(r1)
        L_0x0022:
            com.ss.android.ugc.aweme.ecommerce.router.m$c r0 = new com.ss.android.ugc.aweme.ecommerce.router.m$c
            r0.<init>(r2)
            h.h r0 = h.i.a(r0)
            r2.f87182b = r0
            return
        L_0x002e:
            androidx.lifecycle.i r0 = r3.getLifecycle()
            if (r0 == 0) goto L_0x0038
            r0.a(r1)
            goto L_0x0022
        L_0x0038:
            if (r4 == 0) goto L_0x0022
            goto L_0x0019
        L_0x003b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "At least one of theContext or theFragment should be initialized"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.router.m.<init>(androidx.fragment.app.e, androidx.appcompat.app.i):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(e eVar, i iVar, int i2) {
        this((i2 & 1) != 0 ? null : eVar, (i2 & 2) != 0 ? null : iVar);
    }
}
