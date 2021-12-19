package com.ss.android.ugc.aweme.wiki;

import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.a.a;
import com.google.c.h.a.q;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationService;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.z;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class AddWikiActivity extends com.bytedance.ies.foundation.activity.a implements com.bytedance.ies.dmt.ui.a.b {
    public static final a A = new a((byte) 0);
    private f.a.b.a B = new f.a.b.a();
    private String C = "";
    private SparseArray D;

    /* renamed from: a */
    public CrossPlatformWebView f145071a;

    /* renamed from: b */
    public FrameLayout f145072b;

    /* renamed from: c */
    public LinearLayout f145073c;

    /* renamed from: d */
    public View f145074d;

    /* renamed from: e */
    public TuxNavBar f145075e;

    /* renamed from: f */
    public SingleWebView f145076f;

    /* renamed from: g */
    public boolean f145077g;

    /* renamed from: h */
    public String f145078h;

    /* renamed from: i */
    public String f145079i;

    /* renamed from: j */
    public String f145080j;

    /* renamed from: k */
    public q<a> f145081k;

    /* renamed from: l */
    h.f.a.a<z> f145082l;

    /* renamed from: m */
    public Runnable f145083m;
    public boolean n;
    public long o;
    boolean p;
    public boolean q;
    public String r = "";
    public String s = "";
    String t;
    public boolean u;
    public boolean v;
    public boolean w;
    String x = "";
    int y = -1;
    String z = "";

    static final class l implements DownloadListener {

        /* renamed from: a */
        public static final l f145090a = new l();

        static {
            Covode.recordClassIndex(94878);
        }

        l() {
        }

        public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a */
        public static final n f145092a = new n();

        static {
            Covode.recordClassIndex(94880);
        }

        n() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(94862);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.D;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.D == null) {
            this.D = new SparseArray();
        }
        View view = (View) this.D.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.D.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z2) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94863);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a1, code lost:
            if (r4 == null) goto L_0x01a3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(android.content.Context r21, java.lang.String r22, java.util.Map<java.lang.String, java.lang.String> r23, java.util.Map<java.lang.String, java.lang.String> r24) {
            /*
            // Method dump skipped, instructions count: 788
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wiki.AddWikiActivity.a.a(android.content.Context, java.lang.String, java.util.Map, java.util.Map):void");
        }
    }

    public static final class b extends com.google.gson.b.a<Map<String, ? extends String>> {
        static {
            Covode.recordClassIndex(94864);
        }

        b() {
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(AddWikiActivity addWikiActivity) {
            super(0);
            this.this$0 = addWikiActivity;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.finish();
            return z.f158842a;
        }
    }

    public final TuxNavBar b() {
        TuxNavBar tuxNavBar = this.f145075e;
        if (tuxNavBar == null) {
            h.f.b.l.a("navBar");
        }
        return tuxNavBar;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.b.e());
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        this.B.a();
    }

    private final String f() {
        AnchorPublishStruct a2 = AnchorListManager.a(this.y, this.z);
        if (a2 != null) {
            return AnchorListManager.a(a2);
        }
        return null;
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(AddWikiActivity addWikiActivity) {
            super(0);
            this.this$0 = addWikiActivity;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            AddWikiActivity addWikiActivity = this.this$0;
            CrossPlatformWebView crossPlatformWebView = addWikiActivity.f145071a;
            if (crossPlatformWebView == null) {
                h.f.b.l.a("webView");
            }
            if (!crossPlatformWebView.b()) {
                addWikiActivity.finish();
            } else {
                h.f.a.a<z> aVar = addWikiActivity.f145082l;
                if (aVar != null) {
                    aVar.invoke();
                }
                CrossPlatformWebView crossPlatformWebView2 = addWikiActivity.f145071a;
                if (crossPlatformWebView2 == null) {
                    h.f.b.l.a("webView");
                }
                crossPlatformWebView2.a();
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(AddWikiActivity addWikiActivity) {
            super(0);
            this.this$0 = addWikiActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            AddWikiActivity addWikiActivity = this.this$0;
            new a.b().a(new a.e().a(R.string.fcr).a(new k(addWikiActivity))).b().show(addWikiActivity.getSupportFragmentManager(), "more_panel");
            return z.f158842a;
        }
    }

    public final CrossPlatformWebView a() {
        CrossPlatformWebView crossPlatformWebView = this.f145071a;
        if (crossPlatformWebView == null) {
            h.f.b.l.a("webView");
        }
        return crossPlatformWebView;
    }

    public final boolean d() {
        if (this.w || h.m.p.a(this.f145079i, "Wiki", true) || h.m.p.a(this.f145079i, "Yelp", true) || h.m.p.a(this.f145079i, "TripAdvisor", true) || h.m.p.a(this.f145079i, "Quizlet", true)) {
            return true;
        }
        return false;
    }

    public final String e() {
        String str = "";
        if (TextUtils.isEmpty(str)) {
            SingleWebView singleWebView = this.f145076f;
            if (singleWebView == null) {
                h.f.b.l.a("singleWebView");
            }
            String title = singleWebView.getTitle();
            if (title != null) {
                str = title;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return this.s;
        }
        return str;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        CrossPlatformWebView crossPlatformWebView = this.f145071a;
        if (crossPlatformWebView == null) {
            h.f.b.l.a("webView");
        }
        if (!crossPlatformWebView.b()) {
            super.onBackPressed();
            return;
        }
        h.f.a.a<z> aVar = this.f145082l;
        if (aVar != null) {
            aVar.invoke();
        }
        CrossPlatformWebView crossPlatformWebView2 = this.f145071a;
        if (crossPlatformWebView2 == null) {
            h.f.b.l.a("webView");
        }
        crossPlatformWebView2.a();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", true);
        super.onResume();
        SingleWebView singleWebView = this.f145076f;
        if (singleWebView == null) {
            h.f.b.l.a("singleWebView");
        }
        singleWebView.setDownloadListener(l.f145090a);
        if (this.u) {
            this.B.a(t.a(500, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new m(this), n.f145092a));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onResume", false);
    }

    public static final class o extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.app.f.d $eventBuilder;
        final /* synthetic */ String $title;
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(AddWikiActivity addWikiActivity, String str, com.ss.android.ugc.aweme.app.f.d dVar) {
            super(0);
            this.this$0 = addWikiActivity;
            this.$title = str;
            this.$eventBuilder = dVar;
        }

        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int type = ab.WIKIPEDIA.getTYPE();
            String b2 = new com.google.gson.f().b(new com.ss.android.ugc.aweme.commercialize.b.b.a(this.$title, AddWikiActivity.a(this.this$0)));
            h.f.b.l.b(b2, "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.b.a(new com.ss.android.ugc.aweme.common.a(type, b2, this.$title, null, 1, null, null, false, null, null, null, null, null, 8168, null)));
            this.this$0.finish();
            r.a("add_wiki", this.$eventBuilder.a("language", AddWikiActivity.a(this.this$0)).a("wiki_entry", this.$title).a("key_word", this.this$0.f145078h).a("status", 1).a("content_source", a(this.this$0.getIntent(), "content_source")).a("content_type", a(this.this$0.getIntent(), "content_type")).f66730a);
            return z.f158842a;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final void c() {
        String str;
        String str2;
        Boolean valueOf;
        String str3 = this.r;
        if (h.m.p.a(this.f145079i, "Yelp", true) || h.m.p.a(this.f145079i, "TripAdvisor", true)) {
            str3 = h.m.p.b(str3, new String[]{" - "}).get(0);
        }
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        String a2 = a(getIntent(), "placeholder_enter_from");
        if (a2 == null || a2.length() == 0) {
            str = "video_post_page";
        } else {
            str = a(getIntent(), "placeholder_enter_from");
        }
        com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("enter_from", str);
        String a4 = a(getIntent(), "shoot_way");
        if (!(a4 == null || a4.length() == 0)) {
            a3.a("shoot_way", a4);
        }
        String a5 = a(getIntent(), "creation_id");
        if (!(a5 == null || a5.length() == 0)) {
            a3.a("creation_id", a5);
        }
        JSONObject jSONObject = new JSONObject();
        if (this.v) {
            jSONObject.put("add_from", 2);
            CrossPlatformWebView crossPlatformWebView = this.f145071a;
            if (crossPlatformWebView == null) {
                h.f.b.l.a("webView");
            }
            String currentUrl = crossPlatformWebView.getCurrentUrl();
            if (currentUrl == null) {
                currentUrl = this.C;
            }
            String e2 = e();
            int i2 = this.y;
            String jSONObject2 = jSONObject.toString();
            h.f.b.l.b(jSONObject2, "");
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.b.a(new com.ss.android.ugc.aweme.common.a(i2, jSONObject2, e2, null, 1, null, null, false, currentUrl, null, null, null, this.z, 3816, null)));
            finish();
            com.ss.android.ugc.aweme.app.f.d a6 = a3.a("anchor_type", f()).a("anchor_entry", e2);
            AnchorPublishStruct a7 = AnchorListManager.a(this.y, this.z);
            if (a7 == null || (valueOf = Boolean.valueOf(a7.hadNew)) == null || !valueOf.booleanValue()) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            r.a("choose_anchor", a6.a("new_tag", str2).a("status", 1).f66730a);
            return;
        }
        new o(this, str3, a3).invoke();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.crossplatform.b.d(System.currentTimeMillis() - this.o));
        if (this.f145071a != null) {
            CrossPlatformWebView crossPlatformWebView = this.f145071a;
            if (crossPlatformWebView == null) {
                h.f.b.l.a("webView");
            }
            crossPlatformWebView.d(this);
        }
        String a2 = a(getIntent(), "enter_from");
        if (!(a2 == null || a2.length() == 0) || this.w) {
            String a3 = a(getIntent(), "mob_extra");
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (h.m.p.a(this.f145079i, "Yelp", true)) {
                com.ss.android.ugc.aweme.app.f.d a4 = dVar.a("enter_from", a(getIntent(), "enter_from")).a("anchor_type", "Yelp").a("anchor_entry", a(getIntent(), "anchor_entry")).a("author_id", a(getIntent(), "author_id")).a("group_id", a(getIntent(), "group_id")).a("duration", System.currentTimeMillis() - this.o);
                h.f.b.l.b(a4, "");
                r.a("multi_anchor_stay_time", a(a4, a3).f66730a);
            } else if (h.m.p.a(this.f145079i, "TripAdvisor", true)) {
                com.ss.android.ugc.aweme.app.f.d a5 = dVar.a("enter_from", a(getIntent(), "enter_from")).a("anchor_type", "TripAdvisor").a("anchor_entry", a(getIntent(), "anchor_entry")).a("author_id", a(getIntent(), "author_id")).a("group_id", a(getIntent(), "group_id")).a("duration", System.currentTimeMillis() - this.o);
                h.f.b.l.b(a5, "");
                r.a("multi_anchor_stay_time", a(a5, a3).f66730a);
            } else if (!this.u) {
                h.f.b.l.b(dVar, "");
                com.ss.android.ugc.aweme.app.f.d a6 = a(dVar).a("duration", System.currentTimeMillis() - this.o);
                h.f.b.l.b(a6, "");
                r.a("multi_anchor_stay_time", a(a6, a3).f66730a);
            }
        }
        super.onDestroy();
    }

    public static final class e implements com.ss.android.ugc.aweme.crossplatform.platform.webview.e {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f145084a;

        /* renamed from: b */
        private boolean f145085b;

        static {
            Covode.recordClassIndex(94869);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final boolean b(WebView webView, String str) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void c(WebView webView, String str) {
        }

        e(AddWikiActivity addWikiActivity) {
            this.f145084a = addWikiActivity;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        private static Object a(AddWikiActivity addWikiActivity, String str) {
            Object obj;
            MethodCollector.i(7255);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = addWikiActivity.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = addWikiActivity.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = addWikiActivity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(7255);
                    }
                }
            } else {
                obj = addWikiActivity.getSystemService(str);
            }
            return obj;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str) {
            boolean z;
            String str2;
            boolean z2;
            String str3;
            this.f145084a.q = false;
            FrameLayout frameLayout = this.f145084a.f145072b;
            if (frameLayout == null) {
                h.f.b.l.a("webViewMask");
            }
            frameLayout.setVisibility(8);
            if (this.f145085b) {
                this.f145084a.a((Object) "close", true);
                this.f145084a.a((Object) "back", true);
                this.f145084a.a((Object) "more", false);
                this.f145084a.a(false);
                String a2 = a(this.f145084a.getIntent(), "enter_from");
                if (a2 != null && a2.length() != 0) {
                    if (h.m.p.a(this.f145084a.f145079i, "Yelp", true)) {
                        r.a("request_anchor_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(this.f145084a.getIntent(), "enter_from")).a("anchor_type", "Yelp").a("anchor_entry", a(this.f145084a.getIntent(), "anchor_entry")).a("author_id", a(this.f145084a.getIntent(), "author_id")).a("group_id", a(this.f145084a.getIntent(), "group_id")).a("status", 0).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    } else if (h.m.p.a(this.f145084a.f145079i, "TripAdvisor", true)) {
                        r.a("request_anchor_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(this.f145084a.getIntent(), "enter_from")).a("anchor_type", "TripAdvisor").a("anchor_entry", a(this.f145084a.getIntent(), "anchor_entry")).a("author_id", a(this.f145084a.getIntent(), "author_id")).a("group_id", a(this.f145084a.getIntent(), "group_id")).a("status", 0).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    } else {
                        AddWikiActivity addWikiActivity = this.f145084a;
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        h.f.b.l.b(dVar, "");
                        r.a("request_wiki_detail", addWikiActivity.a(dVar).a("status", 0).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    }
                }
            } else {
                Uri parse = Uri.parse(str);
                h.f.b.l.b(parse, "");
                String a3 = AddWikiActivity.a(parse, "title");
                if (a3 == null || a3.length() == 0) {
                    a3 = this.f145084a.s;
                }
                if ((a3 == null || a3.length() == 0) && (webView == null || (a3 = webView.getTitle()) == null)) {
                    a3 = "";
                }
                if (h.m.p.a(this.f145084a.f145079i, "Yelp", true) || h.m.p.a(this.f145084a.f145079i, "TripAdvisor", true) || h.m.p.a(this.f145084a.f145079i, "Quizlet", true)) {
                    z = true;
                } else {
                    z = h.m.p.a(AddWikiActivity.a(parse, "addButton"), "true", true);
                }
                ISettingService v = SettingServiceImpl.v();
                AddWikiActivity addWikiActivity2 = this.f145084a;
                String a4 = AddWikiActivity.a(parse, "lang");
                if (a4 == null) {
                    a4 = v.h();
                }
                addWikiActivity2.f145080j = a4;
                if (h.m.p.a(this.f145084a.f145079i, "TripAdvisor", true)) {
                    str2 = h.m.p.b(a3, new String[]{" - "}).get(0);
                } else {
                    str2 = a3;
                }
                if (!h.m.p.a(this.f145084a.f145079i, "TripAdvisor", true)) {
                    h.m.p.a(this.f145084a.f145079i, "Yelp", true);
                }
                q<a> qVar = null;
                if (h.f.b.l.a((Object) this.f145084a.f145079i, (Object) "Wiki")) {
                    AddWikiActivity addWikiActivity3 = this.f145084a;
                    if ((z || addWikiActivity3.v) && str2.length() > 0) {
                        qVar = CheckAnchorModerationService.a.a(0, this.f145084a.a().getCurrentUrl(), str2, AddWikiActivity.a(this.f145084a), null);
                    }
                    addWikiActivity3.f145081k = qVar;
                }
                String a5 = a(this.f145084a.getIntent(), "enter_from");
                if (!(a3 == null || a3.length() == 0 || (a5 != null && a5.length() != 0 && (str3 = this.f145084a.r) != null && str3.length() != 0))) {
                    this.f145084a.r = a3;
                    TuxNavBar b2 = this.f145084a.b();
                    com.bytedance.tux.navigation.a.g a6 = new com.bytedance.tux.navigation.a.g().a(a3);
                    String string = this.f145084a.getString(R.string.ty);
                    h.f.b.l.b(string, "");
                    b2.a(a6.b(h.m.p.a(string, "%@", AddWikiActivity.a(str), false)));
                }
                this.f145084a.f145078h = AddWikiActivity.a(parse, "keyword");
                this.f145084a.f145077g = h.m.p.a(AddWikiActivity.a(parse, "noRedirect"), "true", true);
                if (!this.f145084a.u) {
                    this.f145084a.a(parse);
                }
                this.f145084a.f145083m = null;
                AddWikiActivity addWikiActivity4 = this.f145084a;
                if (h.m.p.a(addWikiActivity4.f145079i, "Yelp", true)) {
                    CrossPlatformWebView crossPlatformWebView = addWikiActivity4.f145071a;
                    if (crossPlatformWebView == null) {
                        h.f.b.l.a("webView");
                    }
                    String str4 = "javascript:(function extra(){" + "[].forEach.call(document.getElementsByClassName('lemon--div__32e33__1mboc banner__32e33__39b4o border-color--default__32e33__2oFDT'), el => el.style.display = 'none');" + "document.getElementById('smart-banner').style.display = 'none';" + "document.getElementById('fullscreen-pitch').style.display = 'none';" + "[].forEach.call(document.getElementsByClassName('fullscreen-pitch_close'), el => el.click());" + "})();";
                    h.f.b.l.b(str4, "");
                    z2 = false;
                    CrossPlatformWebView.a(crossPlatformWebView, str4, false, null, 6);
                } else if (h.m.p.a(addWikiActivity4.f145079i, "TripAdvisor", true)) {
                    CrossPlatformWebView crossPlatformWebView2 = addWikiActivity4.f145071a;
                    if (crossPlatformWebView2 == null) {
                        h.f.b.l.a("webView");
                    }
                    String str5 = "javascript:(function extra(){" + "[].forEach.call(document.getElementsByClassName('social-ugc-actions-UploaderActionButton__upload_container--1wUKt social-ugc-actions-SocialFab__overlay--31Qvx'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName('ppr_rup ppr_priv_daodao_mobile_open_app_smart_button_component'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName('cpm-ad-target-mobile-adhesion-MobileAdhesion__fixedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName(' daodao-mobile-app-smartbutton-SmartButton__open_app_smartbutton--YE-xh daodao-mobile-app-smartbutton-SmartButton__is_shown--35tcaedAd--23r8Y cpm-ad-target-mobile-adhesion-MobileAdhesion__loaded--24Qa9'), el => el.style.display = 'none');" + "[].forEach.call(document.getElementsByClassName('hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__ui_persistent_footer--1MGGe hotels-hotel-review-persistent-header-and-footer-PersistentHeaderAndFooter__fixed--8x8LO'), el => el.style.display = 'none');" + "})();";
                    h.f.b.l.b(str5, "");
                    z2 = false;
                    CrossPlatformWebView.a(crossPlatformWebView2, str5, false, null, 6);
                } else {
                    z2 = false;
                }
                this.f145084a.a(z2);
                if (!(a5 == null || a5.length() == 0)) {
                    if (h.m.p.a(this.f145084a.f145079i, "Yelp", true)) {
                        r.a("request_anchor_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(this.f145084a.getIntent(), "enter_from")).a("anchor_type", "Yelp").a("anchor_entry", a(this.f145084a.getIntent(), "anchor_entry")).a("author_id", a(this.f145084a.getIntent(), "author_id")).a("group_id", a(this.f145084a.getIntent(), "group_id")).a("status", 1).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    } else if (h.m.p.a(this.f145084a.f145079i, "TripAdvisor", true)) {
                        r.a("request_anchor_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(this.f145084a.getIntent(), "enter_from")).a("anchor_type", "TripAdvisor").a("anchor_entry", a(this.f145084a.getIntent(), "anchor_entry")).a("author_id", a(this.f145084a.getIntent(), "author_id")).a("group_id", a(this.f145084a.getIntent(), "group_id")).a("status", 1).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    } else if (h.m.p.a(this.f145084a.f145079i, "Quizlet", true)) {
                        r.a("request_anchor_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", a(this.f145084a.getIntent(), "enter_from")).a("anchor_type", "Quizlet").a("anchor_entry", a(this.f145084a.getIntent(), "anchor_entry")).a("author_id", a(this.f145084a.getIntent(), "author_id")).a("group_id", a(this.f145084a.getIntent(), "group_id")).a("status", 1).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    } else {
                        AddWikiActivity addWikiActivity5 = this.f145084a;
                        com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                        h.f.b.l.b(dVar2, "");
                        r.a("request_wiki_detail", addWikiActivity5.a(dVar2).a("status", 1).a("duration", System.currentTimeMillis() - this.f145084a.o).f66730a);
                    }
                }
                if (this.f145084a.n) {
                    this.f145084a.n = false;
                    Object a7 = a(this.f145084a, "input_method");
                    Objects.requireNonNull(a7, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) a7;
                    SingleWebView singleWebView = this.f145084a.f145076f;
                    if (singleWebView == null) {
                        h.f.b.l.a("singleWebView");
                    }
                    inputMethodManager.showSoftInput(singleWebView, 1);
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                this.f145085b = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, String str, Bitmap bitmap) {
            boolean z;
            this.f145085b = false;
            if (h.f.b.l.a((Object) a(this.f145084a.getIntent(), "anchor_type"), (Object) "News")) {
                String str2 = this.f145084a.s;
                if (str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (webView == null || (str2 = webView.getTitle()) == null)) {
                    str2 = "";
                }
                this.f145084a.r = str2;
                TuxNavBar b2 = this.f145084a.b();
                com.bytedance.tux.navigation.a.g a2 = new com.bytedance.tux.navigation.a.g().a(str2);
                String string = this.f145084a.getString(R.string.ty);
                h.f.b.l.b(string, "");
                b2.a(a2.b(h.m.p.a(string, "%@", AddWikiActivity.a(str), false)));
                AddWikiActivity addWikiActivity = this.f145084a;
                Uri parse = Uri.parse(str);
                h.f.b.l.b(parse, "");
                addWikiActivity.a(parse);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.e
        public final void a(WebView webView, int i2, String str, String str2) {
            if (Build.VERSION.SDK_INT < 23) {
                this.f145085b = true;
            }
        }
    }

    public final void setStatusBar(View view) {
        h.f.b.l.d(view, "");
        this.f145074d = view;
    }

    public static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.tux.navigation.a.c, z> {
        final /* synthetic */ boolean $visible;

        static {
            Covode.recordClassIndex(94882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(boolean z) {
            super(1);
            this.$visible = z;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.navigation.a.c cVar) {
            com.bytedance.tux.navigation.a.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            ((com.bytedance.tux.navigation.a.b) cVar2).f45197e = this.$visible;
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AddWikiActivity addWikiActivity) {
            super(1);
            this.this$0 = addWikiActivity;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            bVar2.c(R.string.hf6, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.wiki.AddWikiActivity.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(94866);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    r.a("add_anyway_anchor", new com.ss.android.ugc.aweme.app.f.d().a("anchor_type", this.this$0.this$0.f145079i).a("anchor_entry", this.this$0.this$0.r).f66730a);
                    this.this$0.this$0.c();
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a9e, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.wiki.AddWikiActivity.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(94867);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    h.f.b.l.d(aVar, "");
                    r.a("cancel_anchor", new com.ss.android.ugc.aweme.app.f.d().a("anchor_type", this.this$0.this$0.f145079i).a("anchor_entry", this.this$0.this$0.r).f66730a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a */
        public static final f f145086a = new f();

        static {
            Covode.recordClassIndex(94870);
        }

        f() {
            super(1);
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f145087a);
            baseActivityViewModel2.config(AnonymousClass2.f145088a);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ String a(AddWikiActivity addWikiActivity) {
        String str = addWikiActivity.f145080j;
        if (str == null) {
            h.f.b.l.a("language");
        }
        return str;
    }

    static final class k extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(AddWikiActivity addWikiActivity) {
            super(1);
            this.this$0 = addWikiActivity;
        }

        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            h.f.b.l.d(view, "");
            r.a("tns_tiktok_3Pchanor_report_click", new com.ss.android.ugc.aweme.app.f.d().a("anchor_id", a(this.this$0.getIntent(), "anchor_id")).f66730a);
            Uri.Builder builder = new Uri.Builder();
            builder.appendQueryParameter("report_type", "third_party_anchor").appendQueryParameter("object_id", a(this.this$0.getIntent(), "group_id")).appendQueryParameter("owner_id", a(this.this$0.getIntent(), "author_id")).appendQueryParameter("anchor_id", a(this.this$0.getIntent(), "anchor_id")).appendQueryParameter("report_url", a(this.this$0.getIntent(), "url"));
            com.ss.android.ugc.aweme.compliance.api.a.a().a(this.this$0, builder);
            return z.f158842a;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static String a(String str) {
        String str2;
        h.m.j find$default;
        String b2;
        String a2;
        List<String> b3;
        if (str == null || (find$default = h.m.l.find$default(new h.m.l("https://.+/"), str, 0, 2, null)) == null || (b2 = find$default.b()) == null || (a2 = h.m.p.a(b2, 8)) == null || (b3 = h.m.p.b(a2, new String[]{"/"})) == null || (str2 = b3.get(0)) == null) {
            str2 = "";
        }
        return h.a.n.a(h.a.n.d((List) h.m.p.b(str2, new String[]{"."}), 2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f145089a;

        static {
            Covode.recordClassIndex(94873);
        }

        g(AddWikiActivity addWikiActivity) {
            this.f145089a = addWikiActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
            if (r6.getCode() == 0) goto L_0x011a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 446
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wiki.AddWikiActivity.g.onClick(android.view.View):void");
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a */
        final /* synthetic */ AddWikiActivity f145091a;

        static {
            Covode.recordClassIndex(94879);
        }

        m(AddWikiActivity addWikiActivity) {
            this.f145091a = addWikiActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r13) {
            /*
            // Method dump skipped, instructions count: 393
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.wiki.AddWikiActivity.m.accept(java.lang.Object):void");
        }
    }

    public final com.ss.android.ugc.aweme.app.f.d a(com.ss.android.ugc.aweme.app.f.d dVar) {
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", a(getIntent(), "enter_from")).a("wiki_entry", a(getIntent(), "wiki_entry")).a("author_id", a(getIntent(), "author_id")).a("group_id", a(getIntent(), "group_id")).a("language", a(getIntent(), "language"));
        h.f.b.l.b(a2, "");
        return a2;
    }

    public final void a(Uri uri) {
        boolean z2 = true;
        int i2 = 8;
        if (h.m.p.a(this.f145079i, "Yelp", true) || h.m.p.a(this.f145079i, "TripAdvisor", true)) {
            if (a(getIntent(), "enter_from") == null) {
                LinearLayout linearLayout = this.f145073c;
                if (linearLayout == null) {
                    h.f.b.l.a("addBtn");
                }
                linearLayout.setVisibility(0);
                a("close", true);
                CrossPlatformWebView crossPlatformWebView = this.f145071a;
                if (crossPlatformWebView == null) {
                    h.f.b.l.a("webView");
                }
                a("back", crossPlatformWebView.b());
                a("more", false);
                return;
            }
            LinearLayout linearLayout2 = this.f145073c;
            if (linearLayout2 == null) {
                h.f.b.l.a("addBtn");
            }
            linearLayout2.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView2 = this.f145071a;
            if (crossPlatformWebView2 == null) {
                h.f.b.l.a("webView");
            }
            a("close", crossPlatformWebView2.b());
            a("back", true);
            a("more", d());
        } else if (h.m.p.a(this.f145079i, "Quizlet", true)) {
            if (a(getIntent(), "enter_from") == null) {
                h.m.l lVar = new h.m.l(".*/tt/[0-9]*");
                String uri2 = uri.toString();
                h.f.b.l.b(uri2, "");
                if (lVar.matches(uri2)) {
                    LinearLayout linearLayout3 = this.f145073c;
                    if (linearLayout3 == null) {
                        h.f.b.l.a("addBtn");
                    }
                    linearLayout3.setVisibility(0);
                    a("close", true);
                    CrossPlatformWebView crossPlatformWebView3 = this.f145071a;
                    if (crossPlatformWebView3 == null) {
                        h.f.b.l.a("webView");
                    }
                    a("back", crossPlatformWebView3.b());
                    a("more", false);
                    return;
                }
            }
            LinearLayout linearLayout4 = this.f145073c;
            if (linearLayout4 == null) {
                h.f.b.l.a("addBtn");
            }
            linearLayout4.setVisibility(8);
            CrossPlatformWebView crossPlatformWebView4 = this.f145071a;
            if (crossPlatformWebView4 == null) {
                h.f.b.l.a("webView");
            }
            a("close", crossPlatformWebView4.b());
            a("back", true);
            a("more", d());
        } else if (h.m.p.a(a(uri, "hide_nav_bar"), "1", true)) {
            LinearLayout linearLayout5 = this.f145073c;
            if (linearLayout5 == null) {
                h.f.b.l.a("addBtn");
            }
            linearLayout5.setVisibility(8);
            View view = this.f145074d;
            if (view == null) {
                h.f.b.l.a("statusBar");
            }
            view.setVisibility(8);
            TuxNavBar tuxNavBar = this.f145075e;
            if (tuxNavBar == null) {
                h.f.b.l.a("navBar");
            }
            tuxNavBar.setVisibility(8);
        } else {
            View view2 = this.f145074d;
            if (view2 == null) {
                h.f.b.l.a("statusBar");
            }
            view2.setVisibility(0);
            TuxNavBar tuxNavBar2 = this.f145075e;
            if (tuxNavBar2 == null) {
                h.f.b.l.a("navBar");
            }
            tuxNavBar2.setVisibility(0);
            boolean a2 = h.m.p.a(a(uri, "addButton"), "true", true);
            LinearLayout linearLayout6 = this.f145073c;
            if (linearLayout6 == null) {
                h.f.b.l.a("addBtn");
            }
            if (a2) {
                i2 = 0;
            }
            linearLayout6.setVisibility(i2);
            boolean z3 = !h.m.p.a(a(uri, "close"), "false", true);
            a("close", z3);
            if (!(!h.m.p.a(a(uri, "back"), "false", true)) && z3) {
                z2 = false;
            }
            a("back", z2);
            a("more", d());
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String str;
        int i2;
        String str2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", true);
        activityConfiguration(f.f145086a);
        super.onCreate(bundle);
        setContentView(R.layout.cj);
        View findViewById = findViewById(R.id.ah_);
        h.f.b.l.b(findViewById, "");
        this.f145071a = (CrossPlatformWebView) findViewById;
        View findViewById2 = findViewById(R.id.aha);
        h.f.b.l.b(findViewById2, "");
        this.f145072b = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.h9);
        h.f.b.l.b(findViewById3, "");
        this.f145073c = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.e_f);
        h.f.b.l.b(findViewById4, "");
        this.f145074d = findViewById4;
        View findViewById5 = findViewById(R.id.hq);
        h.f.b.l.b(findViewById5, "");
        this.f145075e = (TuxNavBar) findViewById5;
        View findViewById6 = findViewById(R.id.h9);
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(new g(this));
        }
        CrossPlatformWebView crossPlatformWebView = this.f145071a;
        if (crossPlatformWebView == null) {
            h.f.b.l.a("webView");
        }
        SingleWebView a2 = ((com.ss.android.ugc.aweme.crossplatform.view.j) crossPlatformWebView.a(com.ss.android.ugc.aweme.crossplatform.view.j.class)).a();
        h.f.b.l.b(a2, "");
        this.f145076f = a2;
        Uri data = getIntent().getData();
        if (data != null) {
            str = data.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "third_party_common_webview")) {
            Uri data2 = getIntent().getData();
            if (data2 != null) {
                str2 = data2.getPath();
            } else {
                str2 = null;
            }
            this.u = true;
            if (TextUtils.equals(str2, "/create")) {
                this.v = true;
                String a3 = a(getIntent(), "add_button_url_regex");
                if (a3 == null) {
                    a3 = "";
                }
                this.x = a3;
                this.y = getIntent().getIntExtra(StringSet.type, -1);
                String a4 = a(getIntent(), "subtype");
                if (a4 == null) {
                    a4 = "";
                }
                this.z = a4;
                String a5 = a(getIntent(), "url");
                if (a5 == null) {
                    a5 = "";
                }
                this.C = a5;
            } else if (TextUtils.equals(str2, "/show")) {
                this.w = true;
            }
        }
        String a6 = a(getIntent(), "anchor_type");
        if (a6 == null) {
            a6 = "";
        }
        this.f145079i = a6;
        if (a6.length() == 0) {
            String f2 = f();
            if (f2 == null) {
                f2 = "";
            }
            this.f145079i = f2;
        }
        if ((a(getIntent(), "enter_from") != null && (h.m.p.a(this.f145079i, "Wiki", true) || h.m.p.a(this.f145079i, "Yelp", true) || h.m.p.a(this.f145079i, "TripAdvisor", true) || h.m.p.a(this.f145079i, "Quizlet", true))) || this.w) {
            r.a("tns_tiktok_3Panchor_report_page_view", new com.ss.android.ugc.aweme.app.f.d().a("anchor_id", a(getIntent(), "anchor_id")).f66730a);
        }
        this.o = System.currentTimeMillis();
        String a7 = a(getIntent(), "title");
        if (a7 == null) {
            a7 = "";
        }
        this.s = a7;
        String a8 = a(getIntent(), "url");
        if (a8 == null) {
            a8 = "";
        }
        h.f.b.l.b(a8, "");
        Uri parse = Uri.parse(a8);
        h.f.b.l.b(parse, "");
        if (!TextUtils.equals(parse.getScheme(), "https")) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
            return;
        }
        Uri parse2 = Uri.parse(a8);
        h.f.b.l.b(parse2, "");
        a(parse2);
        Uri parse3 = Uri.parse(a8);
        h.f.b.l.b(parse3, "");
        boolean a9 = h.m.p.a(a(parse3, "noRedirect"), "true", true);
        this.q = a9;
        if (a9) {
            FrameLayout frameLayout = this.f145072b;
            if (frameLayout == null) {
                h.f.b.l.a("webViewMask");
            }
            frameLayout.setVisibility(0);
        }
        CrossPlatformWebView crossPlatformWebView2 = this.f145071a;
        if (crossPlatformWebView2 == null) {
            h.f.b.l.a("webView");
        }
        crossPlatformWebView2.setCustomWebViewStatus(new e(this));
        CrossPlatformWebView crossPlatformWebView3 = this.f145071a;
        if (crossPlatformWebView3 == null) {
            h.f.b.l.a("webView");
        }
        crossPlatformWebView3.setShouldOverrideInterceptor(new d(this));
        a(true);
        getIntent().putExtra("sec_link_scene", "anchors");
        CrossPlatformWebView crossPlatformWebView4 = this.f145071a;
        if (crossPlatformWebView4 == null) {
            h.f.b.l.a("webView");
        }
        CrossPlatformWebView.a(crossPlatformWebView4, a8, false, null, 6);
        CrossPlatformWebView crossPlatformWebView5 = this.f145071a;
        if (crossPlatformWebView5 == null) {
            h.f.b.l.a("webView");
        }
        crossPlatformWebView5.requestFocus();
        CrossPlatformWebView crossPlatformWebView6 = this.f145071a;
        if (crossPlatformWebView6 == null) {
            h.f.b.l.a("webView");
        }
        this.t = crossPlatformWebView6.getCurrentUrl();
        SingleWebView singleWebView = this.f145076f;
        if (singleWebView == null) {
            h.f.b.l.a("singleWebView");
        }
        singleWebView.requestFocus();
        this.n = getIntent().getBooleanExtra("show_keyboard", false);
        com.bytedance.ies.dmt.ui.common.b.a(this);
        Window window = getWindow();
        h.f.b.l.b(window, "");
        View decorView = window.getDecorView();
        h.f.b.l.b(decorView, "");
        decorView.setBackground(new ColorDrawable(androidx.core.content.b.c(this, R.color.a9)));
        CrossPlatformWebView crossPlatformWebView7 = this.f145071a;
        if (crossPlatformWebView7 == null) {
            h.f.b.l.a("webView");
        }
        ((DmtStatusView) crossPlatformWebView7.findViewById(R.id.axu)).a(0);
        CrossPlatformWebView crossPlatformWebView8 = this.f145071a;
        if (crossPlatformWebView8 == null) {
            h.f.b.l.a("webView");
        }
        SingleWebView singleWebView2 = crossPlatformWebView8.f78936a;
        if (singleWebView2 == null) {
            h.f.b.l.a("singleWebView");
        }
        singleWebView2.controlGeolocationPermissions(false);
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i2 = getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i2);
        View view = this.f145074d;
        if (view == null) {
            h.f.b.l.a("statusBar");
        }
        view.setLayoutParams(layoutParams);
        TuxNavBar tuxNavBar = this.f145075e;
        if (tuxNavBar == null) {
            h.f.b.l.a("navBar");
        }
        tuxNavBar.setNavActions(new TuxNavBar.a().a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a("back").a((h.f.a.a<z>) new h(this))).a(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark).a("close").a((h.f.a.a<z>) new i(this))).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_ellipsis_vertical).a("more").a((h.f.a.a<z>) new j(this))).a(new com.bytedance.tux.navigation.a.g()));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.wiki.AddWikiActivity", "onCreate", false);
    }

    public final void a(boolean z2) {
        this.p = z2;
        if (h.m.p.a(this.f145079i, "Wiki", true)) {
            CrossPlatformWebView crossPlatformWebView = this.f145071a;
            if (crossPlatformWebView == null) {
                h.f.b.l.a("webView");
            }
            crossPlatformWebView.a(z2);
        }
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<WebView, String, Boolean> {
        final /* synthetic */ AddWikiActivity this$0;

        static {
            Covode.recordClassIndex(94868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AddWikiActivity addWikiActivity) {
            super(2);
            this.this$0 = addWikiActivity;
        }

        @Override // h.f.a.m
        public final /* synthetic */ Boolean invoke(WebView webView, String str) {
            return Boolean.valueOf(a(webView, str));
        }

        private boolean a(WebView webView, String str) {
            String str2;
            h.f.b.l.d(webView, "");
            h.f.b.l.d(str, "");
            if (this.this$0.f145077g) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.b2c).b();
                return true;
            }
            Uri parse = Uri.parse(str);
            h.f.b.l.b(parse, "");
            String scheme = parse.getScheme();
            boolean booleanExtra = this.this$0.getIntent().getBooleanExtra("disable_app_link", true);
            String path = parse.getPath();
            if (path != null && h.m.p.c(path, ".apk", false)) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.tq).b();
                return true;
            } else if (h.m.p.a(scheme, "intent", true)) {
                if (booleanExtra || this.this$0.w) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.tq).b();
                } else {
                    try {
                        AddWikiActivity addWikiActivity = this.this$0;
                        Intent parseUri = Intent.parseUri(str, 1);
                        h.f.b.l.b(parseUri, "");
                        addWikiActivity.setIntent(parseUri);
                        this.this$0.getIntent().addFlags(268435456);
                        Context context = this.this$0.a().getContext();
                        h.f.b.l.b(context, "");
                        String packageName = context.getPackageName();
                        ComponentName component = this.this$0.getIntent().getComponent();
                        if (component != null) {
                            str2 = component.getPackageName();
                        } else {
                            str2 = null;
                        }
                        if (h.f.b.l.a((Object) packageName, (Object) str2)) {
                            return true;
                        }
                        AddWikiActivity addWikiActivity2 = this.this$0;
                        Intent intent = addWikiActivity2.getIntent();
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, addWikiActivity2);
                        addWikiActivity2.startActivity(intent);
                    } catch (URISyntaxException e2) {
                        e2.printStackTrace();
                    }
                }
                return true;
            } else if (h.m.p.a(scheme, "yelp", true)) {
                if (booleanExtra) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.tq).b();
                } else {
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openSystemBrowser(this.this$0, str);
                }
                return true;
            } else if (h.m.p.a(scheme, "tripadvisor", true)) {
                if (booleanExtra) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.tq).b();
                } else {
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openSystemBrowser(this.this$0, str);
                }
                return true;
            } else if (h.m.p.a(scheme, "market", true)) {
                new com.bytedance.tux.g.b(this.this$0).e(R.string.tq).b();
                return true;
            } else if (!h.m.p.a(this.this$0.f145079i, "Yelp", true) || !h.m.p.a((CharSequence) str, (CharSequence) "&deeplink=", true)) {
                this.this$0.a(true);
                return false;
            } else {
                if (booleanExtra) {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.tq).b();
                } else {
                    String substring = str.substring(h.m.p.a((CharSequence) str, "&deeplink=", 0, false, 6) + 10, str.length());
                    h.f.b.l.b(substring, "");
                    int a2 = h.m.p.a((CharSequence) substring, "&", 0, false, 6);
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = substring.substring(0, a2);
                    h.f.b.l.b(substring2, "");
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openSystemBrowser(this.this$0, URLDecoder.decode(substring2, "UTF-8"));
                }
                return true;
            }
        }
    }

    public static String a(Uri uri, String str) {
        try {
            return uri.getQueryParameter(str);
        } catch (Exception unused) {
            return "";
        }
    }

    private static com.ss.android.ugc.aweme.app.f.d a(com.ss.android.ugc.aweme.app.f.d dVar, String str) {
        try {
            GsonProvider c2 = GsonHolder.c();
            h.f.b.l.b(c2, "");
            for (Map.Entry entry : ((Map) c2.b().a(str, new b().type)).entrySet()) {
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a((String) entry.getKey(), (String) entry.getValue());
                h.f.b.l.b(a2, "");
                dVar = a2;
            }
        } catch (Exception unused) {
        }
        return dVar;
    }

    public final void a(Object obj, boolean z2) {
        TuxNavBar tuxNavBar = this.f145075e;
        if (tuxNavBar == null) {
            h.f.b.l.a("navBar");
        }
        tuxNavBar.a(obj, new p(z2));
    }
}
