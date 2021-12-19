package com.ss.android.ugc.aweme.feed;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.newmedia.h;
import com.ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.utils.bq;
import com.ss.android.ugc.aweme.commercialize.utils.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.h.a;
import com.ss.android.ugc.aweme.feed.k.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.p.b.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.utils.dw;
import h.f.b.l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f93527a;

    /* renamed from: b  reason: collision with root package name */
    public static long f93528b = -1;

    /* renamed from: c  reason: collision with root package name */
    static volatile Boolean f93529c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f93530d;

    /* renamed from: e  reason: collision with root package name */
    public static long f93531e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static long f93532f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static long f93533g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f93534h = true;

    /* renamed from: i  reason: collision with root package name */
    public static volatile boolean f93535i;

    /* renamed from: j  reason: collision with root package name */
    public static b f93536j;

    /* renamed from: k  reason: collision with root package name */
    public static Queue<Runnable> f93537k;

    /* renamed from: l  reason: collision with root package name */
    static boolean f93538l;

    /* renamed from: m  reason: collision with root package name */
    public static String f93539m;
    public static Throwable n;
    public static long o;
    public static com.bytedance.ttnet.d.b p;
    public static JSONObject q;
    private static final long r = TimeUnit.SECONDS.toMillis(3);

    static class c extends Handler {
        static {
            Covode.recordClassIndex(59259);
        }

        c() {
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.obj == null) {
                k.a("load_empty_feed", "");
                k.b("no_response", "fake_failed");
            } else if (message.obj instanceof Exception) {
                k.a("exec_failed", "");
                k.b("no_response", "fake_failed");
            } else if (k.b()) {
                k.f93536j.f93553b = true;
                k.f93536j.f93552a.sendMessage(Message.obtain(message));
                k.f93527a = false;
                k.f93536j = null;
                k.a("fake_response", "");
                k.b("no_response", "fake_response");
            } else {
                k.a("valid_response_received_after_do_fake", "");
                k.b("no_response", "valid_response");
            }
        }
    }

    public static boolean e() {
        if (d.c().a("cold_start_times", 0) <= 1) {
            return true;
        }
        return false;
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(59253);
    }

    public static boolean b() {
        Boolean bool = f93527a;
        if (bool == null || !bool.booleanValue() || f93536j == null) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        com.bytedance.ies.ugc.appcontext.d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = f();
        }
        return j.f107229h;
    }

    static class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        private Callable f93544a;

        static {
            Covode.recordClassIndex(59257);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            if (BuildConfigAllServiceImpl.b().a()) {
                return k.d();
            }
            AwemeService.b();
            com.ss.android.ugc.aweme.feed.h.a.a();
            Object b2 = com.ss.android.ugc.aweme.feed.t.d.f93914a.a(4).b();
            a.b.f109011a.b("feed_api_to_ui_response", false);
            a.b.f109011a.a("feed_ui_response_to_post_msg", false);
            if (b2 == null) {
                k.a((Object) null, false, 0L);
            } else if (!((FeedItemList) b2).isFromLocalCache) {
                return b2;
            } else {
                long a2 = d.a().a("key_feed_cache_time");
                if (System.currentTimeMillis() - a2 <= 0) {
                    k.a(b2, false, a2);
                    return b2;
                }
                k.a(b2, true, a2);
            }
            return this.f93544a.call();
        }

        a(Callable callable) {
            this.f93544a = callable;
        }
    }

    public static FeedItemList c() {
        String a2 = c.a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        FeedItemList feedItemList = (FeedItemList) dw.a(a2, FeedItemList.class);
        if (feedItemList == null || feedItemList.getItems() == null) {
            return feedItemList;
        }
        ArrayList<Aweme> arrayList = new ArrayList(2);
        int size = feedItemList.getItems().size();
        int nextInt = new Random().nextInt(size);
        int nextInt2 = new Random().nextInt(size);
        if (nextInt2 == nextInt) {
            nextInt2 = (nextInt + 1) % size;
        }
        arrayList.add(feedItemList.getItems().get(nextInt));
        arrayList.add(feedItemList.getItems().get(nextInt2));
        for (Aweme aweme : arrayList) {
            aweme.setFakeResponse(true);
            aweme.setItemSourceCategory(2);
        }
        feedItemList.items = arrayList;
        return feedItemList;
    }

    public static FeedItemList d() {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        MethodCollector.i(8351);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            inputStream = com.bytedance.ies.ugc.appcontext.d.a().getAssets().open("feed_response.json");
            try {
                byte[] bArr = new byte[1024];
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Throwable unused) {
                        cs.a(inputStream);
                        cs.a(byteArrayOutputStream);
                        MethodCollector.o(8351);
                        return null;
                    }
                }
                FeedItemList feedItemList = (FeedItemList) GsonHolder.c().b().a(new String(byteArrayOutputStream.toByteArray()), FeedItemList.class);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                long j2 = r;
                if (currentTimeMillis2 < j2) {
                    Thread.sleep(j2 - currentTimeMillis2);
                }
                cs.a(inputStream);
                cs.a(byteArrayOutputStream);
                MethodCollector.o(8351);
                return feedItemList;
            } catch (Throwable unused2) {
                byteArrayOutputStream = null;
                cs.a(inputStream);
                cs.a(byteArrayOutputStream);
                MethodCollector.o(8351);
                return null;
            }
        } catch (Throwable unused3) {
            inputStream = null;
            byteArrayOutputStream = null;
            cs.a(inputStream);
            cs.a(byteArrayOutputStream);
            MethodCollector.o(8351);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public Handler f93552a;

        /* renamed from: b  reason: collision with root package name */
        boolean f93553b;

        static {
            Covode.recordClassIndex(59258);
        }

        private b(Handler handler) {
            this.f93552a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            k.f93527a = false;
            k.f93536j = null;
            if (this.f93553b && message.obj != null && (message.obj instanceof FeedItemList)) {
                ((FeedItemList) message.obj).setReplaceFake();
            }
            this.f93552a.handleMessage(message);
        }

        /* synthetic */ b(Handler handler, byte b2) {
            this(handler);
        }
    }

    private static void a(Runnable runnable) {
        if (f93532f != -1) {
            com.ss.android.b.a.a.a.a(runnable);
            return;
        }
        if (f93537k == null) {
            f93537k = new LinkedBlockingQueue();
        }
        f93537k.offer(runnable);
    }

    public static String a(FeedItemList feedItemList) {
        StringBuilder sb = new StringBuilder();
        if (!com.bytedance.common.utility.collection.b.a((Collection) feedItemList.getItems())) {
            for (Aweme aweme : feedItemList.getItems()) {
                sb.append(aweme.getAid()).append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void a(final String str, final String str2) {
        a(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59254);
            }

            public final void run() {
                n.a("aweme_feed_0vv", new com.ss.android.ugc.aweme.app.f.c().a("message", str).a("network_connected", Boolean.valueOf(k.a())).a("mainCreate2ResumeDuration", Long.valueOf(k.f93532f)).a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(k.f93533g)).a("requestId", str2).a());
            }
        });
    }

    public static void b(final String str, final String str2) {
        a(new Runnable() {
            /* class com.ss.android.ugc.aweme.feed.k.AnonymousClass2 */

            static {
                Covode.recordClassIndex(59255);
            }

            public final void run() {
                JSONObject a2 = new com.ss.android.ugc.aweme.app.f.c().a("fake_reason", str).a("fake_type", str2).a("has_network", String.valueOf(k.a())).a("mainCreate2ResumeDuration", Long.valueOf(k.f93532f)).a("sMainActivityCreate2FeedRequestDuration", Long.valueOf(k.f93533g)).a();
                r.onEvent(MobClick.obtain().setEventName("fake_feed_response").setLabelName("perf_monitor").setJsonObject(a2));
                r.a("fake_feed_response", a2);
                com.ss.android.ugc.aweme.metrics.b.a.a("fake_feed_response", a2);
            }
        });
    }

    static void a(FeedItemList feedItemList, int i2) {
        Long creativeId;
        MethodCollector.i(8333);
        List<Aweme> items = feedItemList.getItems();
        com.ss.android.ugc.aweme.commercialize.c.a aVar = o.f93622a;
        if (!com.bytedance.common.utility.collection.b.a((Collection) items)) {
            int size = items.size();
            for (int i3 = 0; i3 < size; i3++) {
                Aweme aweme = items.get(i3);
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                    aVar.a(aweme);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "receive", aweme.getAwemeRawAd()).c();
                }
            }
        }
        LegacyCommercializeServiceImpl.l().i().a(feedItemList);
        List<Aweme> items2 = feedItemList.getItems();
        com.ss.android.ugc.aweme.commercialize.c.a aVar2 = p.f93627a;
        if (!com.bytedance.common.utility.collection.b.a((Collection) items2)) {
            for (int size2 = items2.size() - 1; size2 >= 0; size2--) {
                Aweme aweme2 = items2.get(size2);
                if (aweme2 != null && aweme2.isAd()) {
                    AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                    if (!(awemeRawAd != null && awemeRawAd.isHideIfExists() && awemeRawAd.isAppAd() && com.ss.android.common.util.f.b(com.bytedance.ies.ugc.appcontext.d.a(), awemeRawAd.getPackageName()))) {
                        break;
                    }
                    aVar2.a(awemeRawAd, "feed_download_ad");
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("feed_download_ad", "hide_app", awemeRawAd).c();
                    items2.remove(size2);
                }
            }
        }
        a(feedItemList.getItems(), feedItemList.getRequestId(), i2);
        List<Aweme> items3 = feedItemList.getItems();
        if (items3 != null) {
            for (Aweme aweme3 : items3) {
                if (!(aweme3 == null || aweme3.getAid() == null)) {
                    Set<String> set = e.f75756a;
                    String aid = aweme3.getAid();
                    l.b(aid, "");
                    set.add(aid);
                    if (aweme3.isAd()) {
                        try {
                            AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                            if (!(awemeRawAd2 == null || (creativeId = awemeRawAd2.getCreativeId()) == null)) {
                                e.f75757b.add(Long.valueOf(creativeId.longValue()));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            bq.a(e.f75757b);
        }
        if (h.f59976a && feedItemList.localExtra != null) {
            String str = feedItemList.localExtra.get("aweme_id");
            com.ss.android.ugc.aweme.feed.h.a a2 = com.ss.android.ugc.aweme.feed.h.a.a();
            List<Aweme> items4 = feedItemList.getItems();
            if (items4 != null) {
                synchronized (a2) {
                    try {
                        a2.b();
                        Iterator<Aweme> it = items4.iterator();
                        while (it.hasNext()) {
                            Aweme next = it.next();
                            if (next != null && !m.a(str, next.getAid())) {
                                for (a.C2264a aVar3 : a2.f93305a) {
                                    if (aVar3 != null && m.a(aVar3.f93309a, next.getAid())) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(8333);
                        throw th;
                    }
                }
            }
        }
        List<Aweme> items5 = feedItemList.getItems();
        if (items5 != null) {
            int size3 = items5.size();
            for (int i4 = 0; i4 < size3; i4++) {
                items5.get(i4).getUploadMiscInfoStruct();
            }
        }
        MethodCollector.o(8333);
    }

    public static void a(Object obj, boolean z, long j2) {
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        String str = "0";
        if (obj == null || !(obj instanceof FeedItemList)) {
            dVar.a("is_cache", str).a("is_timeout", str).a("cache_num", 0).a("group_id_list", "").a("cache_time", j2);
        } else {
            com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("is_cache", "1");
            if (z) {
                str = "1";
            }
            FeedItemList feedItemList = (FeedItemList) obj;
            a2.a("is_timeout", str).a("cache_num", feedItemList.getItems().size()).a("group_id_list", a(feedItemList)).a("cache_time", j2).a("from_type", com.ss.android.ugc.aweme.feed.cache.h.f());
        }
        r.a("pull_out_cache_video", dVar.f66730a);
    }

    public static void a(List<Aweme> list, String str, int i2) {
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Aweme aweme = list.get(i3);
                aweme.setRequestId(str);
                if (!aweme.isLiveNoDeduplicate() || !com.ss.android.ugc.aweme.feed.ab.f.a()) {
                    aweme = AwemeService.b().a(aweme);
                }
                RequestIdService.a().a(aweme.getAid() + (i2 + 0), str, i3);
                list.set(i3, aweme);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: com.ss.android.ugc.aweme.feed.k$b */
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(int i2, int i3, WeakHandler weakHandler, Callable callable, int i4, boolean z, Lock lock) {
        WeakHandler weakHandler2;
        Callable callable2;
        MethodCollector.i(8297);
        if (!z || i2 != 0 || (!(f93527a == null || i3 == 0) || weakHandler == null)) {
            weakHandler2 = weakHandler;
            callable2 = callable;
        } else {
            f93527a = true;
            if (f93531e != -1) {
                f93533g = SystemClock.elapsedRealtime() - f93531e;
            }
            b bVar = new b(weakHandler, (byte) 0);
            f93536j = bVar;
            callable2 = new a(callable);
            weakHandler2 = bVar;
        }
        if (com.ss.android.ugc.aweme.feed.p.b.a() && com.ss.android.ugc.aweme.feed.p.b.a(i2, 1) && com.ss.android.ugc.aweme.feed.p.b.a()) {
            synchronized (com.ss.android.ugc.aweme.feed.p.b.f.f93679e) {
                try {
                    com.ss.android.ugc.aweme.feed.p.b.f.f93678d = new f.a(weakHandler, (byte) 0);
                } catch (Throwable th) {
                    MethodCollector.o(8297);
                    throw th;
                }
            }
        }
        i.b(new n(new m(callable2, weakHandler2, i2, i4, lock)), g.a());
        MethodCollector.o(8297);
    }
}
