package com.ss.android.ugc.aweme.feed.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.cache.i;
import com.ss.android.ugc.aweme.feed.experiment.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.preload.s;
import h.a.n;
import h.f.b.z;
import h.m.p;
import h.z;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static volatile FeedItemList f92689a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile FeedItemList f92690b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile String f92691c = "";

    /* renamed from: d  reason: collision with root package name */
    static volatile boolean f92692d;

    /* renamed from: e  reason: collision with root package name */
    static volatile boolean f92693e;

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f92694f;

    /* renamed from: g  reason: collision with root package name */
    static Object f92695g = new Object();

    /* renamed from: h  reason: collision with root package name */
    static volatile boolean f92696h = true;

    /* renamed from: i  reason: collision with root package name */
    static volatile int f92697i = 48;

    /* renamed from: j  reason: collision with root package name */
    public static volatile boolean f92698j;

    /* renamed from: k  reason: collision with root package name */
    public static volatile boolean f92699k;

    /* renamed from: l  reason: collision with root package name */
    public static final h.h f92700l = h.i.a(h.m.SYNCHRONIZED, a.f92702a);

    /* renamed from: m  reason: collision with root package name */
    static boolean f92701m;
    static FeedItemList n;
    public static final e o = new e();
    private static volatile boolean p;
    private static CountDownLatch q = new CountDownLatch(1);
    private static volatile boolean r;
    private static boolean s;
    private static volatile boolean t = true;

    private e() {
    }

    public final void a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("call startCache from ");
        if (z) {
            str = "background";
        } else {
            str = "foreground";
        }
        String.valueOf(sb.append(str).append(" isCaching:").append(f92692d).toString());
        if (!f92692d) {
            long b2 = h.b();
            String d2 = h.d();
            long c2 = h.c();
            String e2 = h.e();
            long j2 = (long) (f92697i * 3600000);
            boolean z2 = System.currentTimeMillis() - b2 >= j2 || TextUtils.isEmpty(d2);
            boolean z3 = System.currentTimeMillis() - c2 >= j2 || TextUtils.isEmpty(e2);
            if (z2) {
                h.a("");
            }
            if (z3) {
                h.b("");
            }
            if (!z2 && !z3 && d()) {
                String d3 = h.d();
                String e3 = h.e();
                boolean b3 = b(d3);
                boolean b4 = b(e3);
                if (!b3) {
                    h.a("");
                }
                if (!b4) {
                    h.b("");
                }
                if (b3 || b4) {
                    return;
                }
            }
            if (i.f92733a == null) {
                f92692d = true;
                f92696h = z;
                com.ss.android.ugc.aweme.cw.g.a().execute(k.f92713a);
            }
        }
    }

    static boolean a(FeedItemList feedItemList, String str) {
        File file;
        MethodCollector.i(9074);
        if (!(feedItemList == null || feedItemList.pbData == null)) {
            if (f92693e) {
                file = new File(str + File.separator + "feed2.pb");
            } else {
                file = new File(str + File.separator + "feed.pb");
            }
            if (b(file)) {
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        feedItemList.pbData.encode(fileOutputStream2);
                        h();
                        String requestId = feedItemList.getRequestId();
                        if (!TextUtils.isEmpty(requestId)) {
                            if (f92693e) {
                                h.d(requestId);
                            } else {
                                h.c(requestId);
                            }
                        }
                        g();
                        cs.a(fileOutputStream2);
                        MethodCollector.o(9074);
                        return true;
                    } catch (Throwable unused) {
                        fileOutputStream = fileOutputStream2;
                        cs.a(fileOutputStream);
                        MethodCollector.o(9074);
                        return false;
                    }
                } catch (Throwable unused2) {
                    cs.a(fileOutputStream);
                    MethodCollector.o(9074);
                    return false;
                }
            }
        }
        MethodCollector.o(9074);
        return false;
    }

    public static boolean a(File file) {
        MethodCollector.i(8829);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(8829);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(8829);
        return delete;
    }

    static final class a extends h.f.b.m implements h.f.a.a<f.a.b.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92702a = new a();

        static {
            Covode.recordClassIndex(58791);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.b invoke() {
            return com.bytedance.ies.ugc.appcontext.f.e().d(AnonymousClass1.f92703a);
        }
    }

    public static void k() {
        p = true;
        q.countDown();
    }

    public static void m() {
        if (f92694f) {
            h.b(0);
        } else {
            h.a(0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f92704a = new b();

        static {
            Covode.recordClassIndex(58793);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                com.ss.android.common.c.a.a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f92705a = new c();

        static {
            Covode.recordClassIndex(58794);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", 200);
                com.ss.android.common.c.a.a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.cache.e$e  reason: collision with other inner class name */
    public static final class CallableC2255e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC2255e f92707a = new CallableC2255e();

        static {
            Covode.recordClassIndex(58796);
        }

        CallableC2255e() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                com.ss.android.common.c.a.a("cache_feed_request", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92709a = new g();

        static {
            Covode.recordClassIndex(58798);
        }

        g() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 1);
                com.ss.android.common.c.a.a("cache_video_request", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Exception f92710a;

        static {
            Covode.recordClassIndex(58799);
        }

        h(Exception exc) {
            this.f92710a = exc;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_success", 0);
                jSONObject.put("errorCode", com.bytedance.ies.b.a.a.a(this.f92710a, (String[]) null));
                com.ss.android.common.c.a.a("cache_video_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f92714a;

        static {
            Covode.recordClassIndex(58803);
        }

        l(int i2) {
            this.f92714a = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", 0);
                jSONObject.put("is_timeout", this.f92714a);
                com.ss.android.common.c.a.a("pull_out_cache_video", jSONObject);
            } catch (Exception unused) {
            }
            return z.f158842a;
        }
    }

    static String b() {
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107194b = a2.getCacheDir();
        }
        File file = com.ss.android.ugc.aweme.lancet.d.f107194b;
        h.f.b.l.b(file, "");
        return file.getAbsolutePath();
    }

    static void g() {
        User c2 = in.c();
        h.f.b.l.b(c2, "");
        h.e(c2.getSecUid());
    }

    public static void j() {
        if (!s) {
            s = true;
            com.ss.android.ugc.aweme.cw.g.a().execute(i.f92711a);
        }
    }

    public static void l() {
        if (!p) {
            try {
                q.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f92706a;

        static {
            Covode.recordClassIndex(58795);
        }

        public d(boolean z) {
            this.f92706a = z;
        }

        public final void run() {
            File file;
            File file2;
            try {
                if (e.f92694f) {
                    h.b("");
                    file = e.a("feed2.pb");
                    file2 = e.a("feed2.json");
                } else {
                    h.a("");
                    file = e.a("feed.pb");
                    file2 = e.a("feed.json");
                }
                if (file != null) {
                    e.a(file);
                }
                if (file2 != null) {
                    e.a(file2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f92708a;

        static {
            Covode.recordClassIndex(58797);
        }

        f(z.e eVar) {
            this.f92708a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f92708a.element == null) {
                    jSONObject.put("is_success", 1);
                } else {
                    jSONObject.put("is_success", 0);
                    jSONObject.put("errorCode", this.f92708a.element.intValue());
                }
                com.ss.android.common.c.a.a("cache_feed_request_response", jSONObject);
            } catch (Exception unused) {
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f92715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f92716b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f92717c;

        static {
            Covode.recordClassIndex(58804);
        }

        m(int i2, int i3, Integer num) {
            this.f92715a = i2;
            this.f92716b = i3;
            this.f92717c = num;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("is_cache", this.f92715a);
                jSONObject.put("is_timeout", this.f92716b);
                jSONObject.put("cache_num", this.f92717c);
                jSONObject.put("from_type", h.f());
                com.ss.android.common.c.a.a("pull_out_cache_video", jSONObject);
            } catch (Exception unused) {
            }
            return h.z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(58790);
    }

    static boolean d() {
        if (a("feed.pb") == null && a("feed.json") == null && a("feed2.pb") == null && a("feed2.json") == null) {
            return false;
        }
        return true;
    }

    static int e() {
        long b2;
        String d2;
        int i2 = f92697i * 3600000;
        if (f92694f) {
            b2 = h.c();
            d2 = h.e();
        } else {
            b2 = h.b();
            d2 = h.d();
        }
        if (i2 <= 0) {
            return 4;
        }
        if (TextUtils.isEmpty(d2)) {
            return 2;
        }
        if (System.currentTimeMillis() - b2 >= ((long) i2)) {
            return 3;
        }
        return 1;
    }

    static void h() {
        if (f92693e) {
            h.b(System.currentTimeMillis());
            h.b("");
        } else {
            h.a(System.currentTimeMillis());
            h.a("");
        }
        h.f("def");
    }

    public static boolean a() {
        boolean z = r;
        if (r) {
            r = false;
        }
        return z;
    }

    public static FeedItemList i() {
        FeedItemList feedItemList;
        List<Aweme> items;
        MethodCollector.i(9273);
        synchronized (f92695g) {
            try {
                feedItemList = f92689a;
            } finally {
                MethodCollector.o(9273);
            }
        }
        if (feedItemList != null) {
            r = true;
            f92699k = true;
        }
        f92689a = null;
        if (!(feedItemList == null || (items = feedItemList.getItems()) == null || items.isEmpty())) {
            try {
                User c2 = in.c();
                h.f.b.l.b(c2, "");
                String secUid = c2.getSecUid();
                if (secUid == null) {
                    secUid = "";
                }
                String string = h.a().getString("feed_video_cache_current_uid", "");
                if (string == null) {
                    string = "";
                }
                if (true ^ h.f.b.l.a((Object) string, (Object) secUid)) {
                    List<Aweme> items2 = feedItemList.getItems();
                    if (items2 != null) {
                        items2.clear();
                    }
                    f92691c = "";
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.b(6, "filterCacheByUid", "filter error:" + e2.getMessage());
            }
        }
        return feedItemList;
    }

    public static boolean n() {
        String str;
        List c2;
        String d2 = h.d();
        if (!(d2 == null || d2.length() == 0 || (a("feed.pb") == null && a("feed.json") == null))) {
            String a2 = com.ss.android.ugc.aweme.video.preload.b.a(h.d());
            if (a2 == null || (c2 = p.c(a2, new String[]{","})) == null || (str = (String) c2.get(0)) == null) {
                str = "";
            }
            if (new File(str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final FeedItemList c() {
        List<Aweme> items;
        boolean g2 = SettingsRequestServiceImpl.i().g();
        FeedItemList d2 = d(g2);
        if (d2 == null) {
            d2 = e(g2);
        }
        if (f92694f) {
            if (!g2) {
                h.b("");
            }
        } else if (!g2) {
            h.a("");
        }
        if (!(d2 == null || (items = d2.getItems()) == null)) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) items, 10));
            for (T t2 : items) {
                h.f.b.l.b(t2, "");
                t2.setItemSourceCategory(1);
                arrayList.add(h.z.f158842a);
            }
        }
        return d2;
    }

    static FeedItemList f() {
        FeedItemList feedItemList;
        Exception e2;
        if (o.a() > 0 && f92690b != null) {
            FeedItemList feedItemList2 = f92690b;
            if (feedItemList2 == null) {
                h.f.b.l.b();
            }
            if (feedItemList2.getItems() != null) {
                FeedItemList feedItemList3 = f92690b;
                if (feedItemList3 == null) {
                    h.f.b.l.b();
                }
                List<Aweme> items = feedItemList3.getItems();
                if (items == null) {
                    h.f.b.l.b();
                }
                if (items.size() > 0) {
                    return f92690b;
                }
            }
        }
        b.i.b(CallableC2255e.f92707a, b.i.f4824a);
        z.e eVar = new z.e();
        eVar.element = null;
        try {
            feedItemList = FeedApiService.a().fetchFeedList(0, 0, 0, 0, null, null, 8, 0, "", null, null, 0, null, null, false);
            if (feedItemList != null) {
                try {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) feedItemList.getItems())) {
                        Iterator<Aweme> it = feedItemList.getItems().iterator();
                        while (it.hasNext()) {
                            Aweme next = it.next();
                            if (next != null && (next.isLive() || com.ss.android.ugc.aweme.story.d.a.g(next))) {
                                it.remove();
                            }
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    eVar.element = (T) Integer.valueOf(com.bytedance.ies.b.a.a.a(e2, (String[]) null));
                    b.i.b(new f(eVar), b.i.f4824a);
                    return feedItemList;
                }
            }
            if (!(f92696h || feedItemList == null || feedItemList.getItems() == null)) {
                if (feedItemList.getItems().size() > 1) {
                    List<Aweme> items2 = feedItemList.getItems();
                    h.f.b.l.b(items2, "");
                    List<Aweme> items3 = feedItemList.getItems();
                    items3.clear();
                    items3.add((Aweme) n.g((List) items2));
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            feedItemList = null;
            eVar.element = (T) Integer.valueOf(com.bytedance.ies.b.a.a.a(e2, (String[]) null));
            b.i.b(new f(eVar), b.i.f4824a);
            return feedItemList;
        }
        b.i.b(new f(eVar), b.i.f4824a);
        return feedItemList;
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92711a = new i();

        static {
            Covode.recordClassIndex(58800);
        }

        i() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
            if (r1 != false) goto L_0x007d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0060 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006d A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0081 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0140 A[Catch:{ all -> 0x01e5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0192 A[Catch:{ all -> 0x01e5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 499
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.e.i.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final k f92713a = new k();

        static {
            Covode.recordClassIndex(58802);
        }

        k() {
        }

        public final void run() {
            Throwable th;
            File file;
            FileOutputStream fileOutputStream;
            Throwable th2;
            File[] listFiles;
            String str;
            int i2 = 8188;
            MethodCollector.i(8188);
            try {
                boolean z = true;
                if (com.bytedance.ies.ugc.appcontext.d.a() != null && !TextUtils.isEmpty(e.f92691c) && (!SettingsRequestServiceImpl.i().g() || a.b.f109011a.f109003d)) {
                    com.bytedance.ies.ugc.appcontext.d.a();
                    String d2 = h.d();
                    String e2 = h.e();
                    String b2 = e.b();
                    if (b2 != null) {
                        File file2 = new File(b2 + File.separator + "feedCache");
                        if (!(!file2.exists() || (listFiles = file2.listFiles()) == null || listFiles.length == 0)) {
                            ArrayList arrayList = new ArrayList(listFiles.length);
                            for (File file3 : listFiles) {
                                String str2 = e.f92691c;
                                if (str2 == null) {
                                    h.f.b.l.b();
                                }
                                h.f.b.l.b(file3, "");
                                String name = file3.getName();
                                h.f.b.l.b(name, "");
                                if (!p.e((CharSequence) str2, (CharSequence) name)) {
                                    if (d2 == null) {
                                        h.f.b.l.b();
                                    }
                                    String name2 = file3.getName();
                                    h.f.b.l.b(name2, "");
                                    if (!p.e((CharSequence) d2, (CharSequence) name2)) {
                                        if (e2 == null) {
                                            h.f.b.l.b();
                                        }
                                        String name3 = file3.getName();
                                        h.f.b.l.b(name3, "");
                                        if (!p.e((CharSequence) e2, (CharSequence) name3)) {
                                            String name4 = file3.getName();
                                            h.f.b.l.b(name4, "");
                                            if (!p.e((CharSequence) "feed2.pb", (CharSequence) name4)) {
                                                String name5 = file3.getName();
                                                h.f.b.l.b(name5, "");
                                                if (!p.e((CharSequence) "feed.pb", (CharSequence) name5)) {
                                                    String name6 = file3.getName();
                                                    h.f.b.l.b(name6, "");
                                                    if (!p.e((CharSequence) "feed2.json", (CharSequence) name6)) {
                                                        String name7 = file3.getName();
                                                        h.f.b.l.b(name7, "");
                                                        if (!p.e((CharSequence) "feed.json", (CharSequence) name7)) {
                                                            if (!TextUtils.isEmpty(file3.getName())) {
                                                                String name8 = file3.getName();
                                                                h.f.b.l.b(name8, "");
                                                                if (p.e((CharSequence) name8, (CharSequence) ".mdl")) {
                                                                    String name9 = file3.getName();
                                                                    h.f.b.l.b(name9, "");
                                                                    List c2 = p.c(name9, new String[]{"."});
                                                                    if (c2 != null) {
                                                                        str = (String) c2.get(0);
                                                                    } else {
                                                                        str = null;
                                                                    }
                                                                    if (!TextUtils.isEmpty(str)) {
                                                                        String str3 = e.f92691c;
                                                                        if (str3 == null) {
                                                                            h.f.b.l.b();
                                                                        }
                                                                        if (str == null) {
                                                                            h.f.b.l.b();
                                                                        }
                                                                        try {
                                                                            if (!p.e((CharSequence) str3, (CharSequence) str)) {
                                                                                if (d2 == null) {
                                                                                    h.f.b.l.b();
                                                                                }
                                                                                if (!p.e((CharSequence) d2, (CharSequence) str)) {
                                                                                    if (e2 == null) {
                                                                                        h.f.b.l.b();
                                                                                    }
                                                                                    if (!p.e((CharSequence) e2, (CharSequence) str)) {
                                                                                        file3.getName();
                                                                                        e.a(file3);
                                                                                    }
                                                                                }
                                                                            }
                                                                            file3.getName();
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            i2 = 8188;
                                                                            e.f92692d = false;
                                                                            MethodCollector.o(i2);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            file3.getName();
                                                            e.a(file3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                arrayList.add(h.z.f158842a);
                            }
                        }
                    }
                }
                FeedItemList f2 = e.f();
                if (!(f2 == null || f2.getItems() == null || f2.getItems().size() <= 0 || com.bytedance.ies.ugc.appcontext.d.a() == null)) {
                    String b3 = e.b();
                    if (b3 != null) {
                        String str4 = b3 + File.separator + "feedCache";
                        File file4 = new File(str4);
                        if (!file4.exists()) {
                            file4.mkdir();
                        }
                        String d3 = h.d();
                        String e3 = h.e();
                        if (!com.bytedance.ies.abmock.b.a().a(true, "feed_cache_fore_backup", false)) {
                            if (TextUtils.isEmpty(d3) || !TextUtils.isEmpty(e3) || !e.f92696h) {
                                z = false;
                            }
                            e.f92693e = z;
                        } else {
                            if (TextUtils.isEmpty(d3) || !TextUtils.isEmpty(e3)) {
                                z = false;
                            }
                            e.f92693e = z;
                        }
                        if (!e.a(f2, str4)) {
                            if (e.f92693e) {
                                file = new File(str4 + File.separator + "feed2.json");
                            } else {
                                file = new File(str4 + File.separator + "feed.json");
                            }
                            if (e.b(file)) {
                                GsonProvider c3 = GsonHolder.c();
                                h.f.b.l.b(c3, "");
                                String b4 = c3.b().b(f2);
                                if (!TextUtils.isEmpty(b4)) {
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            h.f.b.l.b(b4, "");
                                            Charset charset = h.m.d.f158808a;
                                            if (b4 != null) {
                                                byte[] bytes = b4.getBytes(charset);
                                                h.f.b.l.b(bytes, "");
                                                fileOutputStream.write(bytes);
                                                e.h();
                                                e.g();
                                                cs.a(fileOutputStream);
                                            } else {
                                                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                MethodCollector.o(8188);
                                                throw nullPointerException;
                                            }
                                        } catch (Exception unused) {
                                            cs.a(fileOutputStream);
                                            e.a(f2);
                                            e.f92692d = false;
                                            MethodCollector.o(8188);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            cs.a(fileOutputStream);
                                            MethodCollector.o(8188);
                                            throw th2;
                                        }
                                    } catch (Exception unused2) {
                                        fileOutputStream = null;
                                        cs.a(fileOutputStream);
                                        e.a(f2);
                                        e.f92692d = false;
                                        MethodCollector.o(8188);
                                    } catch (Throwable th5) {
                                        th2 = th5;
                                        fileOutputStream = null;
                                        cs.a(fileOutputStream);
                                        MethodCollector.o(8188);
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                }
                e.a(f2);
                e.f92692d = false;
                MethodCollector.o(8188);
            } catch (Throwable th6) {
                th = th6;
                e.f92692d = false;
                MethodCollector.o(i2);
                throw th;
            }
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<Aweme, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92712a = new j();

        static {
            Covode.recordClassIndex(58801);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(Aweme aweme) {
            Aweme aweme2 = aweme;
            h.f.b.l.b(aweme2, "");
            String aid = aweme2.getAid();
            h.f.b.l.b(aid, "");
            return aid;
        }
    }

    static void a(int i2) {
        b.i.b(new l(i2), b.i.f4824a);
    }

    static boolean b(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            file.createNewFile();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        String str2;
        Boolean valueOf;
        if (str == null || f92691c == null || (str2 = f92691c) == null || (valueOf = Boolean.valueOf(p.a((CharSequence) str2, (CharSequence) str, false))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }

    static File a(String str) {
        if (com.bytedance.ies.ugc.appcontext.d.a() == null) {
            return null;
        }
        File file = new File(b() + File.separator + "feedCache" + File.separator + str);
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    public static void b(boolean z) {
        if (!g.f92723b) {
            g.f92723b = true;
            g.f92724c = z;
            FeedItemList feedItemList = n;
            if (feedItemList != null && z) {
                g.a(feedItemList);
            }
            n = null;
        }
    }

    private static String a(Aweme aweme) {
        VideoUrlModel playAddr;
        List<String> urlList;
        VideoUrlModel playAddr2;
        List<String> urlList2;
        List<BitRate> bitRate;
        List<String> urlList3;
        int b2 = o.b();
        if (b2 == 0 || b2 == 2) {
            Video video = aweme.getVideo();
            if (video == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null) {
                return null;
            }
            return urlList.get(0);
        }
        Video video2 = aweme.getVideo();
        if (!(video2 == null || (bitRate = video2.getBitRate()) == null)) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) bitRate, 10));
            T t2 = null;
            for (T t3 : bitRate) {
                if (t3 != null && (t2 == null || t3.getBitRate() > t2.getBitRate())) {
                    t2 = t3;
                }
                arrayList.add(h.z.f158842a);
            }
            if (!(t2 == null || (urlList3 = t2.urlList()) == null || !(!urlList3.isEmpty()))) {
                return urlList3.get(0);
            }
        }
        Video video3 = aweme.getVideo();
        if (video3 == null || (playAddr2 = video3.getPlayAddr()) == null || (urlList2 = playAddr2.getUrlList()) == null) {
            return null;
        }
        return urlList2.get(0);
    }

    static void c(boolean z) {
        String b2;
        File[] listFiles;
        if (com.bytedance.ies.ugc.appcontext.d.a() != null && (b2 = b()) != null) {
            File file = new File(b2 + File.separator + "feedCache");
            int i2 = 0;
            if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
                ArrayList arrayList = new ArrayList(listFiles.length);
                int length = listFiles.length;
                int i3 = 0;
                while (i2 < length) {
                    File file2 = listFiles[i2];
                    if (z) {
                        h.f.b.l.b(file2, "");
                        if ("feed.pb".equals(file2.getName()) || "feed.json".equals(file2.getName())) {
                            a(file2);
                            file2.getName();
                        } else {
                            arrayList.add(h.z.f158842a);
                            i2++;
                        }
                    } else {
                        h.f.b.l.b(file2, "");
                        if ("feed2.pb".equals(file2.getName()) || "feed2.json".equals(file2.getName())) {
                            a(file2);
                            file2.getName();
                        } else {
                            arrayList.add(h.z.f158842a);
                            i2++;
                        }
                    }
                    i3++;
                    arrayList.add(h.z.f158842a);
                    i2++;
                }
                i2 = i3;
            }
            a(1, e(), Integer.valueOf(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (0 == 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r4.getItems().size() > 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r4.getItems().size() > 0) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c2, code lost:
        a(-2, 0, java.lang.Integer.valueOf(r4.getItems().size()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.feed.model.FeedItemList d(boolean r9) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.e.d(boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:9:0x0021] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.feed.model.FeedItemList e(boolean r7) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.e.e(boolean):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    static void a(FeedItemList feedItemList) {
        List<Aweme> items;
        Video video;
        VideoUrlModel playAddr;
        VideoUrlModel playAddr2;
        if (!(feedItemList == null || feedItemList.getItems() == null)) {
            feedItemList.getItems().size();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (!(feedItemList == null || (items = feedItemList.getItems()) == null)) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) items, 10));
            for (T t2 : items) {
                if (!(t2 == null || t2.getVideo() == null)) {
                    Video video2 = t2.getVideo();
                    List<String> list = null;
                    if (!(video2 == null || video2.getPlayAddr() == null || (video = t2.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || playAddr.getUrlList() == null)) {
                        Video video3 = t2.getVideo();
                        if (video3 == null || (playAddr2 = video3.getPlayAddr()) == null || (list = playAddr2.getUrlList()) == null) {
                            h.f.b.l.b();
                        }
                        if (list.size() > 0 && i2 < 2 && a((Aweme) t2, t2.getAid())) {
                            i2++;
                            arrayList.add(t2.getAid());
                            String aid = t2.getAid();
                            if (com.bytedance.ies.ugc.appcontext.d.a() != null && !TextUtils.isEmpty(aid)) {
                                if (f92693e) {
                                    String e2 = h.e();
                                    if (!TextUtils.isEmpty(e2)) {
                                        aid = e2 + ',' + aid;
                                    }
                                    h.b(aid);
                                } else {
                                    String d2 = h.d();
                                    if (!TextUtils.isEmpty(d2)) {
                                        aid = d2 + ',' + aid;
                                    }
                                    h.a(aid);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(h.z.f158842a);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:35|36|37|38|51) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean b(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.e.b(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:45|44|46|47|(1:49)|50|59|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        if (r2 == null) goto L_0x00da;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00c4 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.bytedance.retrofit2.u<com.bytedance.retrofit2.mime.TypedInput> r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cache.e.a(com.bytedance.retrofit2.u, java.lang.String):boolean");
    }

    private static boolean a(Aweme aweme, String str) {
        com.ss.android.ugc.playerkit.simapicommon.a.i a2;
        if (aweme == null) {
            return false;
        }
        com.ss.android.ugc.playerkit.simapicommon.a.i iVar = null;
        if (!f92696h) {
            b.i.b(i.a.f92737a, b.i.f4824a);
            int b2 = o.b();
            if (b2 == 0 || b2 == 1) {
                ac.a(aweme, Integer.MAX_VALUE);
            } else if (!(aweme.isLive() || aweme.getVideo() == null || aweme.getVideo().getProperPlayAddr() == null || s.b() == null || com.ss.android.ugc.aweme.video.preload.o.a() == null)) {
                Aweme clone = aweme.clone();
                CopyOnWriteArrayList<BitRate> copyOnWriteArrayList = new CopyOnWriteArrayList(clone.getVideo().getBitRate());
                if (copyOnWriteArrayList.size() > 0) {
                    BitRate bitRate = null;
                    for (BitRate bitRate2 : copyOnWriteArrayList) {
                        if (bitRate2 != null && (bitRate == null || bitRate2.getBitRate() > bitRate.getBitRate())) {
                            bitRate = bitRate2;
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitRate);
                    clone.getVideo().setBitRate(arrayList);
                }
                if (com.ss.android.ugc.aweme.video.preload.a.a.f143571a) {
                    a2 = com.ss.android.ugc.aweme.video.p.a(com.ss.android.ugc.aweme.video.simcommon.a.a(clone.getVideo()), com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType());
                } else {
                    a2 = com.ss.android.ugc.aweme.video.simcommon.a.a(clone.getVideo().getProperPlayAddr());
                }
                if (a2 != null) {
                    a2.setSourceId(clone.getAid());
                    a2.setRatio(clone.getVideo().getRatio());
                    if (!TextUtils.isEmpty(clone.getVideo().getVideoModelStr())) {
                        a2.setDashVideoModelStr(clone.getVideo().getVideoModelStr());
                    }
                    iVar = a2;
                }
                s.b().a(iVar, Integer.MAX_VALUE, ac.d(aweme), ac.c(aweme), 102400);
            }
            i.f92733a = aweme;
            return true;
        }
        String a3 = a(aweme);
        if (TextUtils.isEmpty(a3)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a4 = com.bytedance.frameworks.baselib.network.http.g.i.a(a3, linkedHashMap);
        String str2 = (String) a4.first;
        String str3 = (String) a4.second;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        b.i.b(g.f92709a, b.i.f4824a);
        h.f.b.l.b(str2, "");
        com.bytedance.ies.ugc.aweme.network.f d2 = com.bytedance.ies.ugc.aweme.network.ext.a.b(str2).a().d();
        h.f.b.l.b(d2, "");
        try {
            u<TypedInput> execute = ((INetworkApi) d2.a(INetworkApi.class)).downloadFile(false, -1, str3, linkedHashMap).execute();
            if (execute == null) {
                return false;
            }
            return a(execute, str);
        } catch (Exception e2) {
            b.i.b(new h(e2), b.i.f4824a);
        }
    }

    static void a(int i2, int i3, Integer num) {
        b.i.b(new m(i2, i3, num), b.i.f4824a);
    }
}
