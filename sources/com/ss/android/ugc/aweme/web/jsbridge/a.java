package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a implements com.bytedance.ies.web.a.d {

    /* renamed from: c  reason: collision with root package name */
    public static CardStruct f144955c;

    /* renamed from: d  reason: collision with root package name */
    public static CardStruct f144956d;

    /* renamed from: e  reason: collision with root package name */
    public static CardStruct f144957e;

    /* renamed from: f  reason: collision with root package name */
    public static int f144958f;

    /* renamed from: g  reason: collision with root package name */
    public static Aweme f144959g;

    /* renamed from: h  reason: collision with root package name */
    public static Map<String, String> f144960h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public static final C3853a f144961i = new C3853a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f144962a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f144963b;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a$a  reason: collision with other inner class name */
    public static final class C3853a {
        static {
            Covode.recordClassIndex(94791);
        }

        private C3853a() {
        }

        public /* synthetic */ C3853a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(94790);
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f144969a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144970b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f144971c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.ugc.aweme.rich.c.a.f f144972d;

        static {
            Covode.recordClassIndex(94792);
        }

        b(String str, String str2, JSONObject jSONObject, com.bytedance.ies.ugc.aweme.rich.c.a.f fVar) {
            this.f144969a = str;
            this.f144970b = str2;
            this.f144971c = jSONObject;
            this.f144972d = fVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Integer num;
            int i2 = 1;
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enableRichTask", 1).a("openUrl", this.f144969a).a("webUrl", this.f144970b).a("webStatus", this.f144971c.optInt("web_status")).a("openStatus", this.f144971c.optInt("open_status"));
            com.bytedance.ies.ugc.aweme.rich.c.a.f fVar = this.f144972d;
            if (fVar == null || !fVar.f35147a) {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("isComplete", i2);
            com.bytedance.ies.ugc.aweme.rich.c.a.f fVar2 = this.f144972d;
            String str = null;
            if (fVar2 != null) {
                num = Integer.valueOf(fVar2.f35148b);
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("processTaskType", num);
            com.bytedance.ies.ugc.aweme.rich.c.a.f fVar3 = this.f144972d;
            if (fVar3 != null) {
                str = fVar3.f35149c;
            }
            r.a("ad_card_click_method", a4.a("errorMsg", str).f66730a);
            return z.f158842a;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f145005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f145006b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f145007c;

        static {
            Covode.recordClassIndex(94794);
        }

        d(String str, String str2, JSONObject jSONObject) {
            this.f145005a = str;
            this.f145006b = str2;
            this.f145007c = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            r.a("ad_card_click_method", new com.ss.android.ugc.aweme.app.f.d().a("enableRichTask", 0).a("openUrl", this.f145005a).a("webUrl", this.f145006b).a("webStatus", this.f145007c.optInt("web_status")).a("openStatus", this.f145007c.optInt("open_status")).f66730a);
            return z.f158842a;
        }
    }

    public a(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        this.f144963b = weakReference;
    }

    static final class c implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144986a;

        static {
            Covode.recordClassIndex(94793);
        }

        c(a aVar) {
            this.f144986a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.utils.n.a
        public final void sendLog(boolean z) {
            AwemeRawAd awemeRawAd;
            if (z) {
                Context context = this.f144986a.f144963b.get();
                if (context == null) {
                    context = com.bytedance.ies.ugc.appcontext.d.a();
                }
                j.d(context, a.f144959g);
                return;
            }
            Context context2 = this.f144986a.f144963b.get();
            if (context2 == null) {
                context2 = com.bytedance.ies.ugc.appcontext.d.a();
            }
            j.e(context2, a.f144959g);
            Aweme aweme = a.f144959g;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "deeplink_failed", awemeRawAd).c();
        }
    }

    static final class e extends m implements h.f.a.m<f.b, Boolean, f.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f145009a = new e();

        static {
            Covode.recordClassIndex(94795);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(a.f144959g);
            } else {
                a2 = bVar2.a(a.f144959g);
            }
            l.b(a2, "");
            return a2;
        }
    }

    static final class f extends m implements h.f.a.m<f.b, Boolean, f.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f145011a = new f();

        static {
            Covode.recordClassIndex(94796);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(a.f144959g);
            } else {
                a2 = bVar2.a(a.f144959g);
            }
            l.b(a2, "");
            return a2;
        }
    }

    private static Object a(Activity activity, String str) {
        Object obj;
        MethodCollector.i(2710);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = activity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = activity.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(2710);
                }
            }
        } else {
            obj = activity.getSystemService(str);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028a, code lost:
        if (r2 != null) goto L_0x028c;
     */
    @Override // com.bytedance.ies.web.a.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call(com.bytedance.ies.web.a.h r22, org.json.JSONObject r23) {
        /*
        // Method dump skipped, instructions count: 1874
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.a.call(com.bytedance.ies.web.a.h, org.json.JSONObject):void");
    }
}
