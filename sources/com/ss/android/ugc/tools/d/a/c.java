package com.ss.android.ugc.tools.d.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.ad;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final b f149162a = new b();

    /* renamed from: b  reason: collision with root package name */
    static final List<Runnable> f149163b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final ExecutorService f149164c = g.a();

    /* renamed from: d  reason: collision with root package name */
    static CountDownLatch f149165d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    public static final c f149166e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final Map<String, Bundle> f149167f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private static final Map<Context, String> f149168g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    private static final Map<Context, String> f149169h = new WeakHashMap();

    /* renamed from: i  reason: collision with root package name */
    private static final Map<Context, Boolean> f149170i = new WeakHashMap();

    private c() {
    }

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149171a = new a();

        static {
            Covode.recordClassIndex(98233);
        }

        a() {
        }

        public final void run() {
            Keva repo = Keva.getRepo("bundle_survive_count_repo");
            l.b(repo, "");
            Map<String, ?> all = repo.getAll();
            l.b(all, "");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Int");
                repo.storeInt(entry.getKey(), ((Integer) value).intValue() + 1);
            }
            b.a();
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f149172a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ byte[] f149173b;

        static {
            Covode.recordClassIndex(98234);
        }

        public final void run() {
            String str = this.f149172a;
            byte[] bArr = this.f149173b;
            l.d(str, "");
            l.d(bArr, "");
            Keva.getRepo("large_transaction_repo").storeBytesJustDisk(str, bArr);
            Keva.getRepo("bundle_survive_count_repo").storeInt(str, 1);
            q.d("Large Transaction write disk uuid: " + this.f149172a);
            c.f149163b.remove(this);
            if (c.f149163b.isEmpty()) {
                c.f149165d.countDown();
            }
        }

        b(String str, byte[] bArr) {
            this.f149172a = str;
            this.f149173b = bArr;
        }
    }

    static {
        Covode.recordClassIndex(98232);
    }

    private static Bundle b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context) {
        l.d(context, "");
        if (!f149170i.containsKey(context)) {
            Map<Context, String> map = f149168g;
            if (map.containsKey(context)) {
                String str = map.get(context);
                Map<String, Bundle> map2 = f149167f;
                Objects.requireNonNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                ad.h(map2).remove(str);
                q.d("Large Transaction, remove memory cache uuid: ".concat(String.valueOf(str)));
            }
        }
    }

    public static void a(Intent intent) {
        int a2;
        Bundle b2 = b(intent);
        if (b2 != null && (a2 = a.a(b2)) >= 512000) {
            q.d("Large Transaction, extra size too large: " + a2 + ", intent: " + intent);
            Bundle b3 = b(intent);
            if (b3 != null) {
                String uuid = UUID.randomUUID().toString();
                l.b(uuid, "");
                q.d("Large Transaction uuid: ".concat(String.valueOf(uuid)));
                Map<String, Bundle> map = f149167f;
                l.b(b3, "");
                map.put(uuid, b3);
                Bundle bundle = new Bundle();
                bundle.putString("activity_bundle_uuid", uuid);
                intent.replaceExtras(bundle);
            }
        }
    }

    private static void b(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        a(intent);
        b(context, intent);
    }

    public static void a(Context context, Bundle bundle) {
        Bundle bundle2;
        l.d(context, "");
        String str = f149168g.get(context);
        if (!(str == null || str.length() == 0 || (bundle2 = f149167f.get(str)) == null)) {
            q.d("Large Transaction, store uuid: ".concat(String.valueOf(str)));
            a(str, bundle2);
        }
        if (bundle != null && a.a(bundle) >= 512000) {
            String uuid = UUID.randomUUID().toString();
            l.b(uuid, "");
            Bundle bundle3 = new Bundle(bundle);
            f149167f.put(uuid, bundle3);
            f149169h.put(context, uuid);
            bundle.clear();
            bundle.putString("save_state_bundle_uuid", uuid);
            q.d("Large Transaction, store state uuid: ".concat(String.valueOf(uuid)));
            a(uuid, bundle3);
        }
        f149170i.put(context, true);
    }

    private static void a(String str, Bundle bundle) {
        byte[] b2 = a.b(bundle);
        if (b2.length != 0) {
            b bVar = new b(str, b2);
            if (f149165d.getCount() == 0) {
                f149165d = new CountDownLatch(1);
            }
            f149163b.add(bVar);
            f149164c.execute(bVar);
            if (f.f34637l) {
                try {
                    f149165d.await(InteractFirstFrameTimeOutDurationSetting.DEFAULT, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void a(Activity activity, Intent intent, int i2) {
        l.d(activity, "");
        l.d(intent, "");
        a(intent);
        activity.startActivityForResult(intent, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        if (r0 != null) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5, android.content.Intent r6, android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.d.a.c.a(android.content.Context, android.content.Intent, android.os.Bundle):void");
    }
}
