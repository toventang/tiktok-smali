package com.bytedance.sdk.bdlynx.container;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.e.f;
import com.bytedance.sdk.bdlynx.view.BDLynxView;
import com.bytedance.sdk.bdlynx.view.e;
import com.bytedance.sdk.bdlynx.view.g;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BDLynxActivity extends Activity {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, BDLynxActivity> f43684e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final a f43685f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f43686a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f43687b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43688c;

    /* renamed from: d  reason: collision with root package name */
    public String f43689d;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f43690g;

    public final View a(int i2) {
        if (this.f43690g == null) {
            this.f43690g = new HashMap();
        }
        View view = (View) this.f43690g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f43690g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26736);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final BDLynxView a() {
        View findViewById = findViewById(R.id.s3);
        l.a((Object) findViewById, "");
        return (BDLynxView) findViewById;
    }

    static {
        Covode.recordClassIndex(26735);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
        if (this.f43688c) {
            LynxDevtoolGlobalHelper.getInstance().showDebugView((ViewGroup) a(R.id.s4));
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        String str;
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        BDLynxView bDLynxView = (BDLynxView) a(R.id.s3);
        String str2 = bDLynxView.f43779b;
        if (!(str2 == null || str2.length() == 0 || g.f43821b.get(str2) == null)) {
            Integer num = g.f43821b.get(str2);
            if (num == null) {
                l.a();
            }
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                g.f43820a.remove(str2);
                g.f43821b.remove(str2);
            } else {
                g.f43821b.put(str2, Integer.valueOf(intValue));
            }
        }
        LynxView lynxView = bDLynxView.f43778a;
        if (lynxView == null) {
            l.a("lynxView");
        }
        lynxView.destroy();
        if (this.f43688c && (str = this.f43686a) != null) {
            f43684e.remove(str);
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BDLynxActivity f43691a;

        static {
            Covode.recordClassIndex(26737);
        }

        @Override // com.bytedance.sdk.bdlynx.e.e
        public final void a(int i2) {
        }

        @Override // com.bytedance.sdk.bdlynx.e.f
        public final void b(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            l.c(aVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(BDLynxActivity bDLynxActivity) {
            this.f43691a = bDLynxActivity;
        }

        @Override // com.bytedance.sdk.bdlynx.e.f
        public final void a(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            l.c(aVar, "");
            this.f43691a.a().getLynxView().removeAllViews();
            ((BDLynxView) this.f43691a.a(R.id.s3)).a(aVar, "");
        }
    }

    public static final class c implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BDLynxActivity f43692a;

        static {
            Covode.recordClassIndex(26738);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(BDLynxActivity bDLynxActivity) {
            this.f43692a = bDLynxActivity;
        }

        @Override // com.bytedance.sdk.bdlynx.container.c
        public final void a(String str) {
            l.c(str, "");
            this.f43692a.a().getLynxView().removeAllViews();
            this.f43692a.a().a((e) str, "");
        }

        @Override // com.bytedance.sdk.bdlynx.container.c
        public final void b(String str) {
            l.c(str, "");
            this.f43692a.a().getLynxView().removeAllViews();
            this.f43692a.a().a((e) str, "");
        }

        @Override // com.bytedance.sdk.bdlynx.container.c
        public final void a(b bVar) {
            l.c(bVar, "");
            BDLynxActivity bDLynxActivity = this.f43692a;
            l.c(bVar, "");
            String str = bDLynxActivity.f43689d;
            if (str == null) {
                l.a("scope");
            }
            l.c(str, "");
            com.bytedance.sdk.bdlynx.e.b bVar2 = com.bytedance.sdk.bdlynx.a.f43611a.get(str);
            if (bVar2 == null) {
                bVar2 = new com.bytedance.sdk.bdlynx.e.c();
                com.bytedance.sdk.bdlynx.a.f43611a.put(str, bVar2);
            }
            bVar2.a(bVar.f43695b, bVar.f43696c, bVar.f43697d, new b(bDLynxActivity));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        if (r1.equals("https") != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r1.equals("http") != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        r0 = r3.toString();
        h.f.b.l.a((java.lang.Object) r0, "");
        r2.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bdlynx.container.BDLynxActivity.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.c(strArr, "");
        l.c(iArr, "");
        l.c(this, "");
        l.c(strArr, "");
        l.c(iArr, "");
        l.c(this, "");
        l.c(strArr, "");
        l.c(iArr, "");
        com.bytedance.sdk.bdlynx.a.d.a.f43661a.a(com.bytedance.sdk.bdlynx.a.e.a.class);
    }
}
