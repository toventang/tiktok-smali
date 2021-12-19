package com.ss.android.ugc.aweme.activity.processor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.uikit.a.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;

public final class h extends d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f65537d = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static int f65538h;

    /* renamed from: e  reason: collision with root package name */
    private String f65539e;

    /* renamed from: f  reason: collision with root package name */
    private BroadcastReceiver f65540f;

    /* renamed from: g  reason: collision with root package name */
    private int f65541g;

    static {
        Covode.recordClassIndex(40320);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40321);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void c(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        super.c(aVar);
        this.f65541g++;
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void e(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        super.e(aVar);
        this.f65541g--;
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void p(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        super.p(aVar);
        f.a(aVar);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        super.a(bundle);
        if (bundle.containsKey("abs_Activity_Key")) {
            this.f65539e = bundle.getString("abs_Activity_Key");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void b(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        super.b(aVar);
        d.a a2 = com.bytedance.ies.uikit.a.d.a();
        if (a2 != null) {
            a2.b(aVar);
        }
        f.a(null);
    }

    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void d(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        super.d(aVar);
        BroadcastReceiver broadcastReceiver = this.f65540f;
        if (broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(aVar).unregisterReceiver(broadcastReceiver);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void f(com.bytedance.ies.foundation.activity.a aVar) {
        l.d(aVar, "");
        super.f(aVar);
        d.a a2 = com.bytedance.ies.uikit.a.d.a();
        if (a2 != null) {
            a2.a(aVar);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(com.bytedance.ies.foundation.activity.a aVar) {
        FrameLayout frameLayout;
        T t;
        MethodCollector.i(6063);
        l.d(aVar, "");
        super.a(aVar);
        Iterator<T> it = b().b().iterator();
        while (true) {
            frameLayout = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t instanceof y) {
                break;
            }
        }
        if (!(t instanceof y)) {
            t = null;
        }
        T t2 = t;
        if (t2 == null || !t2.f65565b) {
            View findViewById = aVar.findViewById(R.id.c0);
            if (findViewById == null) {
                MethodCollector.o(6063);
                return;
            }
            ViewParent parent = findViewById.getParent();
            if (!(parent instanceof FrameLayout)) {
                parent = null;
            }
            FrameLayout frameLayout2 = (FrameLayout) parent;
            if (frameLayout2 != null) {
                View findViewById2 = aVar.findViewById(16908290);
                if (findViewById2 instanceof FrameLayout) {
                    frameLayout = findViewById2;
                }
                FrameLayout frameLayout3 = frameLayout;
                if (frameLayout3 == null || frameLayout3.getChildCount() != 1) {
                    MethodCollector.o(6063);
                    return;
                }
                View childAt = frameLayout3.getChildAt(0);
                frameLayout3.removeAllViews();
                frameLayout2.addView(childAt);
                findViewById2.setId(-1);
                frameLayout2.setId(16908290);
                MethodCollector.o(6063);
                return;
            }
            MethodCollector.o(6063);
            return;
        }
        MethodCollector.o(6063);
    }

    public static final class b extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f65542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.foundation.activity.a f65543b;

        static {
            Covode.recordClassIndex(40322);
        }

        b(h hVar, com.bytedance.ies.foundation.activity.a aVar) {
            this.f65542a = hVar;
            this.f65543b = aVar;
        }

        public final void onReceive(Context context, Intent intent) {
            if (!this.f65543b.isFinishing()) {
                this.f65542a.a();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(com.bytedance.ies.foundation.activity.a aVar, Bundle bundle) {
        l.d(aVar, "");
        l.d(bundle, "");
        super.a(aVar, bundle);
        bundle.putString("abs_Activity_Key", this.f65539e);
        bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.bytedance.ies.foundation.activity.d, com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.bytedance.ies.foundation.activity.a r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.activity.processor.h.b(com.bytedance.ies.foundation.activity.a, android.os.Bundle):void");
    }
}
