package com.ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.deeplink.d.c;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public class DeepLinkActivityV2 extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f79392e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f79393a;

    /* renamed from: b  reason: collision with root package name */
    public final c f79394b = new c();

    /* renamed from: c  reason: collision with root package name */
    public boolean f79395c;

    /* renamed from: d  reason: collision with root package name */
    public Intent f79396d;

    /* renamed from: f  reason: collision with root package name */
    private Uri f79397f;

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f79398g;

    static {
        Covode.recordClassIndex(49307);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f79398g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f79398g == null) {
            this.f79398g = new SparseArray();
        }
        View view = (View) this.f79398g.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f79398g.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49308);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final d a() {
        d dVar = this.f79393a;
        if (dVar == null) {
            l.a("deepLinkData");
        }
        return dVar;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        m.f79501a.a();
        Intent intent = this.f79396d;
        if (intent != null) {
            intent.getData();
            a(this, intent);
            this.f79396d = null;
        }
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f79399a = new b();

        static {
            Covode.recordClassIndex(49309);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f79400a);
            return z.f158842a;
        }
    }

    private final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!com.bytedance.common.utility.m.a(action)) {
            if (action == null) {
                l.b();
            }
            if (p.a((CharSequence) action, "com.ss.android.sdk.", 0, false, 6) == 0) {
                String a2 = a(intent, "open_url");
                if (!com.bytedance.common.utility.m.a(a2)) {
                    try {
                        this.f79397f = Uri.parse(a2);
                    } catch (Exception unused) {
                        return false;
                    }
                }
            }
        }
        if (this.f79397f == null) {
            this.f79397f = intent.getData();
        }
        Uri uri = this.f79397f;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            a(intent, "inner_from");
            String a2 = a(intent, "inner_from");
            if (a2 != null) {
                int hashCode = a2.hashCode();
                if (hashCode != -414536821) {
                    if (hashCode != -274828254) {
                        if (hashCode == 929166351 && a2.equals("require_login")) {
                            c.b("LoginNode");
                            IDeepLinkService.a.a(m.f79501a);
                            return;
                        }
                        return;
                    } else if (a2.equals("switch_account")) {
                        c.b("MultiAccountNode");
                        IDeepLinkService.a.a(m.f79501a);
                        return;
                    } else {
                        return;
                    }
                } else if (a2.equals("new_user_journey")) {
                    c.b("NewUserJourneyNode");
                    IDeepLinkService.a.a(m.f79501a);
                    return;
                } else {
                    return;
                }
            }
        }
        finish();
        this.f79396d = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0122, code lost:
        if (android.text.TextUtils.isEmpty(r0.getExternalRouteMap().get(r1)) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        if (r2 == null) goto L_0x0146;
     */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0337  */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 1413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2.onCreate(android.os.Bundle):void");
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(DeepLinkActivityV2 deepLinkActivityV2, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, deepLinkActivityV2);
        deepLinkActivityV2.startActivity(intent);
    }
}
