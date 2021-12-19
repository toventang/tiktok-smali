package com.ss.android.ugc.aweme.commerce.a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.x.b.f;
import com.d.a.a.a.b.a.b;
import com.d.a.a.a.b.k;
import com.ss.android.ugc.aweme.ad.feed.b.e;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commerce.a.a.a.d;
import com.ss.android.ugc.aweme.commerce.a.l;
import com.ss.android.ugc.aweme.commerce.i;
import com.ss.android.ugc.aweme.commercialize.feed.az;
import com.ss.android.ugc.aweme.commercialize.feed.c;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.ai;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.l.h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f73300a = a.class.getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    private static volatile a f73301l;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f73302b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c  reason: collision with root package name */
    public boolean f73303c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f73304d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f73305e;

    /* renamed from: f  reason: collision with root package name */
    public int f73306f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f73307g = true;

    /* renamed from: h  reason: collision with root package name */
    public long f73308h = -1;

    /* renamed from: i  reason: collision with root package name */
    public Aweme f73309i = null;

    /* renamed from: j  reason: collision with root package name */
    public AbstractC1635a f73310j;

    /* renamed from: k  reason: collision with root package name */
    public Handler f73311k = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    private Map<String, b> f73312m = Collections.synchronizedMap(new HashMap());
    private Map<String, d> n = Collections.synchronizedMap(new HashMap());
    private Map<String, com.d.a.a.a.b.b> o = Collections.synchronizedMap(new HashMap());
    private Map<String, com.ss.android.ugc.aweme.commerce.a.a.a.a> p = Collections.synchronizedMap(new HashMap());
    private l q;
    private Handler r = new Handler(Looper.getMainLooper());
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private WeakReference<View> w = null;
    private long x = -1;
    private Runnable y = new Runnable() {
        /* class com.ss.android.ugc.aweme.commerce.a.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(45143);
        }

        public final void run() {
            long c2 = a.this.c();
            long b2 = a.this.b();
            if (b2 != 0 && a.this.f73310j != null) {
                a.this.a(c2, b2);
                a.this.f73311k.postDelayed(this, 200);
            }
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commerce.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1635a {
        static {
            Covode.recordClassIndex(45144);
        }

        void a();

        void a(long j2, long j3, long j4);

        void b();

        void c();
    }

    public final void a(View view, Aweme aweme) {
        this.w = new WeakReference<>(view);
        this.f73309i = aweme;
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void a(Aweme aweme, Context context, View view, String str) {
        this.t = com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme);
        this.s = com.ss.android.ugc.aweme.commercialize.e.a.b.aw(aweme);
        if (aweme != null && bs.c(aweme) && aweme.getAwemeRawAd().getOmVast().isEnableContentUrl) {
            this.f73302b.put(j.d(aweme), str);
        }
        com.ss.android.ugc.aweme.commerce.a.b.a.f73374a = aweme;
        com.ss.android.ugc.aweme.commerce.a.b.a.a("sessionStart");
        if (com.ss.android.ugc.aweme.feed.experiment.a.a() || SharePrefCache.inst().getEnableBindItemCallOMSDK().c().intValue() != 0) {
            a(context, aweme, view);
            b(context, aweme, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void a(Aweme aweme, Context context, View view) {
        com.ss.android.ugc.aweme.commerce.a.b.a.a("skipped");
        if (!this.u) {
            b a2 = a(context, aweme, view);
            if (a2 != null) {
                a2.g();
                this.u = true;
            }
            d b2 = b(context, aweme, view);
            if (b2 != null) {
                b2.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void a(Aweme aweme, Context context, View view, int i2) {
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AdOM onPlayComplete ");
        if (i2 == 1) {
            com.ss.android.ugc.aweme.commerce.a.b.a.a("complete");
            String d2 = j.d(aweme);
            b bVar = this.f73312m.get(d2);
            if (bVar != null) {
                bVar.d();
            }
            d b2 = b(context, aweme, view);
            if (b2 != null) {
                com.ss.android.ugc.aweme.commerce.a.a.d.a.a(b2.f73331a);
                b2.f73331a.e();
            }
            com.d.a.a.a.b.b bVar2 = this.o.get(d2);
            this.v = true;
            a(d2, aweme);
            com.ss.android.ugc.aweme.commerce.a.a.a.a aVar = this.p.get(d2);
            if (aVar != null) {
                aVar.b();
            }
            a(d2, bVar2);
            long b3 = b();
            a(b3, b3);
        }
        bs.a("complete", aweme, "play_over");
        this.f73306f++;
        this.f73303c = false;
        this.f73304d = false;
        this.f73305e = false;
    }

    public final void e() {
        this.f73311k.removeCallbacks(this.y);
    }

    static {
        Covode.recordClassIndex(45140);
    }

    public final View a() {
        WeakReference<View> weakReference = this.w;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static a d() {
        MethodCollector.i(10636);
        if (f73301l == null) {
            synchronized (a.class) {
                try {
                    if (f73301l == null) {
                        f73301l = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10636);
                    throw th;
                }
            }
        }
        a aVar = f73301l;
        MethodCollector.o(10636);
        return aVar;
    }

    public final long b() {
        e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
        az a3 = c.a.a();
        if (this.t && a2 != null) {
            return a2.g();
        }
        if (!this.s || a3 == null) {
            return v.O().j();
        }
        return a3.c();
    }

    public final long c() {
        e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
        az a3 = c.a.a();
        if (this.t && a2 != null) {
            return a2.f();
        }
        if (!this.s || a3 == null) {
            return v.O().n();
        }
        return a3.d();
    }

    private a() {
        l lVar = new l(com.bytedance.ies.ugc.appcontext.d.a());
        this.q = lVar;
        lVar.f73387c = new l.a(lVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        intentFilter.addAction("android.media.STREAM_MUTE_CHANGED_ACTION");
        l.a(lVar.f73385a, lVar.f73387c, intentFilter);
        lVar.f73386b = true;
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void a(Aweme aweme) {
        f(aweme);
    }

    private static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static void c(Aweme aweme) {
        if (bs.b(aweme) && br.a(aweme, 3)) {
            bs.a("start", aweme, "play");
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void b(Aweme aweme) {
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            f(aweme);
        }
    }

    public final void d(Aweme aweme) {
        this.t = com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme);
        this.s = com.ss.android.ugc.aweme.commercialize.e.a.b.aw(aweme);
        com.ss.android.ugc.aweme.commerce.a.b.a.f73374a = aweme;
        this.f73311k.removeCallbacks(this.y);
        this.f73311k.postDelayed(this.y, 200);
    }

    static float a(Context context) {
        int i2;
        AudioManager audioManager = (AudioManager) a(b(context), DataType.AUDIO);
        int i3 = -1;
        if (audioManager != null) {
            i2 = audioManager.getStreamVolume(3);
            i3 = audioManager.getStreamMaxVolume(3);
        } else {
            i2 = -1;
        }
        float f2 = 0.0f;
        if (i2 > 0 && i3 > 0) {
            f2 = ((float) i2) / ((float) i3);
        }
        return ((float) ((int) (f2 * 1000.0f))) * 0.001f;
    }

    private static List<k> e(Aweme aweme) {
        if (TextUtils.isEmpty(j.a(aweme)) || TextUtils.isEmpty(j.b(aweme))) {
            return Collections.emptyList();
        }
        try {
            URL url = new URL(j.a(aweme));
            String b2 = j.b(aweme);
            String c2 = j.c(aweme);
            if (TextUtils.isEmpty(c2)) {
                c2 = "placementId=1&placementName=test";
            }
            if (c2.contains("{TS}") || c2.contains("__TS__")) {
                String valueOf = String.valueOf(System.currentTimeMillis());
                c2 = c2.replace("{TS}", valueOf).replace("__TS__", valueOf);
            }
            return Collections.singletonList(k.a(b2, url, c2));
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return Collections.emptyList();
        }
    }

    private void f(Aweme aweme) {
        this.f73306f = 0;
        this.f73310j = null;
        this.q.f73388d = null;
        com.ss.android.ugc.aweme.commerce.a.b.a.a("sessionFinish");
        String d2 = j.d(aweme);
        com.d.a.a.a.b.b bVar = this.o.get(d2);
        a(d2, aweme);
        com.ss.android.ugc.aweme.commerce.a.a.a.a aVar = this.p.get(d2);
        if (aVar != null) {
            aVar.b();
        }
        a(j.d(aweme), bVar);
        this.f73311k.removeCallbacks(this.y);
        this.f73303c = false;
        this.f73304d = false;
        this.f73305e = false;
        this.u = false;
        this.v = false;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12257);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
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
                    MethodCollector.o(12257);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public final void b(Aweme aweme, Context context) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        f fVar;
        Set<String> set;
        if (this.f73306f == 0 && bs.b(aweme)) {
            if (!(aweme == null || !aweme.isAd() || !br.a(aweme, 3) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (set = fVar.viewableSet) == null)) {
                bs.a(n.t(set), "viewable", aweme);
            }
            j.b(context, "viewable", aweme, j.a(context, aweme, false, j.a(this.f73306f + 1)));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "viewable", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(this.f73306f + 1)).c();
        }
    }

    private void a(String str, com.d.a.a.a.b.b bVar) {
        this.o.remove(str);
        this.f73312m.remove(str);
        this.p.remove(str);
        this.n.remove(str);
        this.f73302b.remove(str);
        this.r.postDelayed(new b(new com.d.a.a.a.b.b[]{bVar}), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
    }

    private void a(String str, Aweme aweme) {
        int a2 = com.ss.android.ugc.aweme.commercialize.f.a.a();
        com.d.a.a.a.b.b bVar = this.o.get(str);
        if (a2 > 0 && bVar != null) {
            if (!this.v) {
                a(aweme, (Context) null, (View) null);
            }
            this.r.postDelayed(new h(bVar), (long) (a2 * 1000));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e1 A[Catch:{ all -> 0x0118 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.d.a.a.a.b.b a(com.ss.android.ugc.aweme.feed.model.Aweme r16, android.content.Context r17) {
        /*
        // Method dump skipped, instructions count: 364
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.a.a.a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context):com.d.a.a.a.b.b");
    }

    public final void a(long j2, long j3) {
        long j4 = this.x;
        if (j2 != j4 && j3 != 0) {
            AbstractC1635a aVar = this.f73310j;
            if (aVar != null) {
                float f2 = (float) j3;
                float f3 = ((float) j2) / f2;
                float f4 = ((float) j4) / f2;
                if (f3 >= 0.25f && f4 < 0.25f && f4 > 0.0f) {
                    aVar.a();
                }
                if (f3 >= 0.5f && f4 < 0.5f && f4 > 0.0f) {
                    this.f73310j.b();
                }
                if (f3 >= 0.75f && f4 < 0.75f && f4 > 0.0f) {
                    this.f73310j.c();
                }
                this.f73310j.a(this.x, j2, j3);
            }
            this.x = j2;
        }
    }

    public final b a(Context context, Aweme aweme, View view) {
        String d2 = j.d(aweme);
        b bVar = this.f73312m.get(d2);
        if (bVar == null && (bVar = c(aweme, context, view)) != null) {
            this.f73312m.put(d2, bVar);
        }
        return bVar;
    }

    private b c(Aweme aweme, Context context, View view) {
        com.d.a.a.a.b.b a2;
        if (!this.f73307g || (a2 = a(aweme, context)) == null || view == null) {
            return null;
        }
        b a3 = b.a(a2);
        a2.a(view);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
            int b2 = com.bytedance.common.utility.n.b(context);
            int a4 = com.bytedance.common.utility.n.a(context);
            List<View> a5 = j.a(findViewById, b2, a4);
            a5.remove(view);
            for (View view2 : a5) {
                a2.b(view2);
            }
            View findViewById2 = activity.findViewById(R.id.dqk);
            if (findViewById2 != null) {
                for (View view3 : j.a(findViewById2, b2, a4)) {
                    a2.c(view3);
                }
            }
        }
        a2.a();
        com.d.a.a.a.b.a a6 = com.d.a.a.a.b.a.a(a2);
        a6.a(com.d.a.a.a.b.a.d.a(com.d.a.a.a.b.a.c.STANDALONE));
        a6.a();
        return a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r4 != null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.commerce.a.a.a.d b(android.content.Context r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.a.a.b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View):com.ss.android.ugc.aweme.commerce.a.a.a.d");
    }

    public final void b(Aweme aweme, Context context, View view) {
        b a2;
        if (aweme != null && !this.v && (a2 = a(context, aweme, view)) != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a2.a(com.d.a.a.a.b.a.a.CLICK);
            } else {
                this.r.post(new d(a2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void c(Aweme aweme, Context context, View view, int i2) {
        if (aweme != null) {
            if (i2 == 0) {
                com.ss.android.ugc.aweme.commerce.a.b.a.a("bufferFinish");
                b a2 = a(context, aweme, view);
                if (a2 != null) {
                    com.d.a.a.a.e.d.b(a2.f46326a);
                    a2.f46326a.f46358c.a("bufferFinish");
                }
                d b2 = b(context, aweme, view);
                if (b2 != null) {
                    com.ss.android.ugc.aweme.commerce.a.a.d.a.a(b2.f73331a);
                    b2.f73331a.f73327e = System.nanoTime();
                }
            }
            bs.a("bufferEnd", aweme, (String) null);
            j.b(context, "buffer_end", aweme, j.a(context, aweme, false, j.a(this.f73306f + 1)));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "buffer_end", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(this.f73306f + 1)).c();
        }
    }

    public final void e(Aweme aweme, Context context, View view, int i2) {
        if (aweme != null) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AdOM onPlayResume ");
            if (i2 == 0) {
                com.ss.android.ugc.aweme.commerce.a.b.a.a("resume");
                b a2 = a(context, aweme, view);
                if (a2 != null) {
                    a2.f();
                }
                d b2 = b(context, aweme, view);
                if (b2 != null) {
                    com.ss.android.ugc.aweme.commerce.a.a.d.a.a(b2.f73331a);
                    b2.f73331a.f73327e = System.nanoTime();
                    com.ss.android.ugc.aweme.commerce.a.a.e.b.f73363a.a();
                }
            }
            bs.a("resume", aweme, (String) null);
            j.b(context, "resume", aweme, j.a(context, aweme, false, j.a(this.f73306f + 1)));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "resume", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(this.f73306f + 1)).c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    @Override // com.ss.android.ugc.aweme.commerce.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(com.ss.android.ugc.aweme.feed.model.Aweme r9, android.content.Context r10, android.view.View r11, int r12) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.a.a.d(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, android.view.View, int):void");
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void b(Aweme aweme, Context context, View view, int i2) {
        if (aweme != null) {
            if (i2 == 0) {
                com.ss.android.ugc.aweme.commerce.a.b.a.a("bufferStart");
                b a2 = a(context, aweme, view);
                if (a2 != null) {
                    com.d.a.a.a.e.d.b(a2.f46326a);
                    a2.f46326a.f46358c.a("bufferStart");
                }
                d b2 = b(context, aweme, view);
                if (b2 != null) {
                    com.ss.android.ugc.aweme.commerce.a.a.d.a.a(b2.f73331a);
                    b2.f73331a.e();
                }
            }
            bs.a("bufferStart", aweme, (String) null);
            j.b(context, "buffer_start", aweme, j.a(context, aweme, false, j.a(this.f73306f + 1)));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "buffer_start", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(this.f73306f + 1)).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce.i
    public final void a(final Context context, final Aweme aweme, final View view, boolean z) {
        aweme.getDesc();
        if (z) {
            this.f73310j = new AbstractC1635a() {
                /* class com.ss.android.ugc.aweme.commerce.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(45141);
                }

                @Override // com.ss.android.ugc.aweme.commerce.a.a.AbstractC1635a
                public final void a() {
                    b a2;
                    if (!a.this.f73303c) {
                        a aVar = a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        if (aVar.f73306f == 0 && (a2 = aVar.a(context, aweme, view)) != null) {
                            a2.a();
                        }
                        bs.a("firstQuartile", aweme, "play_25");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            aj.a("play_25", aweme.getRawAdPlayNodeTrackUrlList(25), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new e(aweme));
                            j.b(context, "first_quartile", aweme, j.a(context, aweme, false, j.a(aVar.f73306f + 1)));
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "first_quartile", awemeRawAd).a("play_order", Integer.valueOf(aVar.f73306f + 1)).c();
                        }
                    }
                    a.this.f73303c = true;
                }

                @Override // com.ss.android.ugc.aweme.commerce.a.a.AbstractC1635a
                public final void b() {
                    b a2;
                    if (!a.this.f73304d) {
                        a aVar = a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "trackSecondQuartile");
                        if (aVar.f73306f == 0 && (a2 = aVar.a(context, aweme, view)) != null) {
                            a2.b();
                        }
                        bs.a("midpoint", aweme, "play_50");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            aj.a("play_50", aweme.getRawAdPlayNodeTrackUrlList(50), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new f(aweme));
                            j.b(context, "midpoint", aweme, j.a(context, aweme, false, j.a(aVar.f73306f + 1)));
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "midpoint", awemeRawAd).a("play_order", Integer.valueOf(aVar.f73306f + 1)).c();
                        }
                    }
                    a.this.f73304d = true;
                }

                @Override // com.ss.android.ugc.aweme.commerce.a.a.AbstractC1635a
                public final void c() {
                    b a2;
                    if (!a.this.f73305e) {
                        a aVar = a.this;
                        Aweme aweme = aweme;
                        Context context = context;
                        View view = view;
                        if (aVar.f73306f == 0 && (a2 = aVar.a(context, aweme, view)) != null) {
                            a2.c();
                        }
                        bs.a("thirdQuartile", aweme, "play_75");
                        if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            aj.a("play_75", aweme.getRawAdPlayNodeTrackUrlList(75), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new g(aweme));
                            j.b(context, "third_quartile", aweme, j.a(context, aweme, false, j.a(aVar.f73306f + 1)));
                            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "third_quartile", awemeRawAd).a("play_order", Integer.valueOf(aVar.f73306f + 1)).c();
                        }
                    }
                    a.this.f73305e = true;
                }

                @Override // com.ss.android.ugc.aweme.commerce.a.a.AbstractC1635a
                public final void a(long j2, long j3, long j4) {
                    long j5;
                    h hVar;
                    AwemeRawAd awemeRawAd;
                    ai omVast;
                    f fVar;
                    List<com.bytedance.x.b.b> list;
                    Aweme aweme = aweme;
                    if (br.a(aweme, 3) && j2 != j3) {
                        if (j2 < j3) {
                            j5 = j2;
                        } else {
                            j5 = -1;
                        }
                        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
                            hVar = h.l.c.f158758a;
                        } else {
                            hVar = h.l.k.d(n.t(list), new bs.z());
                        }
                        Iterator a2 = h.l.k.a(hVar, (h.f.a.b) new bs.aa(j4, j3, j5)).a();
                        while (a2.hasNext()) {
                            com.bytedance.x.b.e eVar = (com.bytedance.x.b.e) a2.next();
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            String str = eVar.offset;
                            h.f.b.l.b(str, "");
                            bs.a(h.l.k.a(eVar.url), "cpv_" + timeUnit.toSeconds(bs.a(j4, str)) + 's', aweme);
                        }
                    }
                    if (a.this.f73306f == 0 && j2 < InteractFirstFrameTimeOutDurationSetting.DEFAULT && j3 >= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                        a.this.b(aweme, context);
                    }
                }
            };
            this.q.f73388d = new l.b() {
                /* class com.ss.android.ugc.aweme.commerce.a.a.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(45142);
                }

                @Override // com.ss.android.ugc.aweme.commerce.a.l.b
                public final void a() {
                    a aVar = a.this;
                    Aweme aweme = aweme;
                    Context context = context;
                    if (aweme != null) {
                        bs.a("unmute", aweme, (String) null);
                        j.d(context, aweme, aVar.f73306f + 1);
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "unmute", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(aVar.f73306f + 1)).a("playervol", Float.valueOf(a.a(context))).c();
                    }
                }

                @Override // com.ss.android.ugc.aweme.commerce.a.l.b
                public final void b() {
                    a aVar = a.this;
                    Aweme aweme = aweme;
                    Context context = context;
                    if (aweme != null) {
                        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "AdOM playerMute ");
                        bs.a("mute", aweme, (String) null);
                        j.c(context, aweme, aVar.f73306f + 1);
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "mute", aweme.getAwemeRawAd()).a("play_order", Integer.valueOf(aVar.f73306f + 1)).a("playervol", Float.valueOf(0.0f)).c();
                    }
                }
            };
            return;
        }
        f(aweme);
    }
}
