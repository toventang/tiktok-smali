package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import h.f.b.l;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f95153a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(60308);
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f95161a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f95162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f95163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FeedAppLogParams f95164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f95165e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f95166f;

        static {
            Covode.recordClassIndex(60310);
        }

        b(boolean z, int i2, long j2, FeedAppLogParams feedAppLogParams, String str, long j3) {
            this.f95161a = z;
            this.f95162b = i2;
            this.f95163c = j2;
            this.f95164d = feedAppLogParams;
            this.f95165e = str;
            this.f95166f = j3;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            String str;
            String str2 = "";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("is_first", String.valueOf(this.f95161a));
                jSONObject.put("is_success", String.valueOf(this.f95162b));
                if (this.f95161a) {
                    jSONObject.put("app_to_success", String.valueOf(this.f95163c));
                }
                FeedAppLogParams feedAppLogParams = this.f95164d;
                if (feedAppLogParams == null || feedAppLogParams.mLastFeedItemList == null) {
                    jSONObject.put("cache_count", "null");
                    jSONObject.put("is_cache", "null");
                    jSONObject.put("cache_time", "null");
                } else {
                    FeedItemList feedItemList = this.f95164d.mLastFeedItemList;
                    l.b(feedItemList, str2);
                    boolean z = feedItemList.isFromLocalCache;
                    jSONObject.put("is_cache", String.valueOf(z));
                    if (z) {
                        FeedItemList feedItemList2 = this.f95164d.mLastFeedItemList;
                        l.b(feedItemList2, str2);
                        str = String.valueOf(feedItemList2.getItems().size());
                    } else {
                        str = "-1";
                    }
                    jSONObject.put("cache_count", str);
                    if (z) {
                        str2 = String.valueOf(d.a().a("key_feed_cache_time"));
                    }
                    jSONObject.put("cache_time", str2);
                    if (z) {
                        jSONObject.put("cache_aid", k.a(this.f95164d.mLastFeedItemList));
                    }
                }
                jSONObject.put("request_method", this.f95165e);
                jSONObject.put("duration", String.valueOf(this.f95166f));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            n.a("feed_cache_response", jSONObject);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f95154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedAppLogParams f95155b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f95156c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f95157d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f95158e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f95159f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f95160g;

        static {
            Covode.recordClassIndex(60309);
        }

        a(int i2, FeedAppLogParams feedAppLogParams, boolean z, long j2, boolean z2, String str, String str2) {
            this.f95154a = i2;
            this.f95155b = feedAppLogParams;
            this.f95156c = z;
            this.f95157d = j2;
            this.f95158e = z2;
            this.f95159f = str;
            this.f95160g = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x010c  */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() {
            /*
            // Method dump skipped, instructions count: 270
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.w.a.call():java.lang.Object");
        }
    }
}
