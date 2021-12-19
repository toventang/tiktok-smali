package com.ss.android.ugc.aweme.feed;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.cache.e;
import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.w;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class x {

    /* renamed from: b  reason: collision with root package name */
    public static final int f95288b = 200;

    /* renamed from: c  reason: collision with root package name */
    public static final a f95289c = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f95290f = "FeedReqAppLogUtil";

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f95291a = fq.a.f142946a.a(fp.FEED_REQ);

    /* renamed from: d  reason: collision with root package name */
    private long f95292d;

    /* renamed from: e  reason: collision with root package name */
    private final Fragment f95293e;

    public static final class a {
        static {
            Covode.recordClassIndex(60356);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f95308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f95309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FeedAppLogParams f95310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Exception f95311d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f95312e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f95313f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f95314g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f95315h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f95316i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f95317j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ long f95318k;

        static {
            Covode.recordClassIndex(60357);
        }

        b(x xVar, int i2, FeedAppLogParams feedAppLogParams, Exception exc, long j2, String str, String str2, String str3, String str4, boolean z, long j3) {
            this.f95308a = xVar;
            this.f95309b = i2;
            this.f95310c = feedAppLogParams;
            this.f95311d = exc;
            this.f95312e = j2;
            this.f95313f = str;
            this.f95314g = str2;
            this.f95315h = str3;
            this.f95316i = str4;
            this.f95317j = z;
            this.f95318k = j3;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return x.a(this.f95309b, this.f95310c, this.f95311d, this.f95312e, this.f95313f, this.f95314g, this.f95315h, this.f95316i, this.f95317j, this.f95318k);
        }
    }

    static {
        Covode.recordClassIndex(60355);
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f95320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f95321b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f95322c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f95323d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f95324e;

        static {
            Covode.recordClassIndex(60358);
        }

        c(x xVar, String str, String str2, String str3, String str4) {
            this.f95320a = xVar;
            this.f95321b = str;
            this.f95322c = str2;
            this.f95323d = str3;
            this.f95324e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            s a2 = new s().a("is_first", String.valueOf(this.f95320a.f95291a ? 1 : 0)).a("feed_tab", this.f95321b).a("top_activity", this.f95322c).a("request_method", this.f95323d).a("duration", this.f95324e);
            Context a3 = d.a();
            if (TextUtils.isEmpty(j.f107223b) || !j.b() || j.c()) {
                j.f107223b = l.e(a3);
            }
            JSONObject a4 = a2.a("access", j.f107223b).a();
            r.onEvent(MobClick.obtain().setEventName("feed_request").setLabelName("perf_monitor").setJsonObject(a4));
            r.b("feed_request", a4);
            com.ss.android.ugc.aweme.metrics.b.a.a("feed_request", a4);
            return null;
        }
    }

    public x(Fragment fragment) {
        this.f95293e = fragment;
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.f95292d = SystemClock.elapsedRealtime();
        long j2 = a.f91452a;
        long j3 = 0;
        a.f91452a = 0;
        if (j2 > 0) {
            j3 = SystemClock.elapsedRealtime() - j2;
        }
        String l2 = Long.toString(j3);
        i.b(new c(this, s.f93858b.name(), s.b(), str, l2), r.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.ss.android.ugc.aweme.feed.ad a(org.json.JSONObject r23, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r24) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.a(org.json.JSONObject, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams):com.ss.android.ugc.aweme.feed.ad");
    }

    public final void a(int i2, String str, FeedAppLogParams feedAppLogParams) {
        boolean z;
        h.f.b.l.d(str, "");
        long j2 = this.f95292d;
        boolean z2 = this.f95291a;
        Fragment fragment = this.f95293e;
        if (fragment == null || fragment.getUserVisibleHint()) {
            z = false;
        } else {
            z = true;
        }
        h.f.b.l.d(str, "");
        i.b(new w.b(fq.a.f142946a.a(fp.FEED_FIRST_REQUEST_RESPONSE), i2, SystemClock.elapsedRealtime() - a.f91453b, feedAppLogParams, str, SystemClock.elapsedRealtime() - j2), r.a());
        if (!(feedAppLogParams == null || feedAppLogParams.mData == null)) {
            FeedItemList feedItemList = feedAppLogParams.mData;
            h.f.b.l.b(feedItemList, "");
            if (feedItemList.isFromLocalCache) {
                return;
            }
        }
        i.b(new w.a(i2, feedAppLogParams, z, SystemClock.elapsedRealtime() - j2, z2, str, s.f93858b.name()), r.a());
    }

    public final void a(int i2, String str, FeedAppLogParams feedAppLogParams, Exception exc) {
        int i3;
        h.f.b.l.d(str, "");
        boolean z = e.f92699k;
        e.f92699k = false;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f95292d;
        long currentTimeMillis = System.currentTimeMillis();
        String name = s.f93858b.name();
        String b2 = s.b();
        if (z) {
            i3 = -1;
        } else if (this.f95291a) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        i.b(new b(this, i2, feedAppLogParams, exc, elapsedRealtime, String.valueOf(i3), str, name, b2, z, currentTimeMillis), r.a());
        if (k.f93528b < 0) {
            k.f93528b = SystemClock.elapsedRealtime();
        }
        if (!z) {
            this.f95291a = false;
        }
        if (i2 == 1) {
            am.a(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Void a(int r20, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams r21, java.lang.Exception r22, long r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, boolean r29, long r30) {
        /*
        // Method dump skipped, instructions count: 887
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.x.a(int, com.ss.android.ugc.aweme.feed.model.FeedAppLogParams, java.lang.Exception, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long):java.lang.Void");
    }
}
