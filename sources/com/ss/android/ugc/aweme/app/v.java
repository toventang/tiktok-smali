package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.d.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class v implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public long f66890a;

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.i.a.a f66891b;

    /* renamed from: c  reason: collision with root package name */
    private aj<Long> f66892c;

    /* renamed from: d  reason: collision with root package name */
    private volatile long f66893d;

    static {
        Covode.recordClassIndex(41203);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(156, new g(v.class, "onQueryUserFinishedEvent", b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static v f66895a = new v((byte) 0);

        static {
            Covode.recordClassIndex(41205);
        }
    }

    public final long a() {
        return Math.max(0L, this.f66893d);
    }

    private v() {
        this.f66891b = new com.ss.android.ugc.aweme.i.a.a() {
            /* class com.ss.android.ugc.aweme.app.v.AnonymousClass1 */

            static {
                Covode.recordClassIndex(41204);
            }

            @Override // com.ss.android.ugc.aweme.i.a.a
            public final aj<Long> a() {
                return SharePrefCache.inst().getLastFeedTime();
            }
        };
        aj<Long> lastFeedCount = SharePrefCache.inst().getLastFeedCount();
        this.f66892c = lastFeedCount;
        this.f66893d = lastFeedCount.c().longValue();
        EventBus.a(EventBus.a(), this);
        this.f66890a = SharePrefCache.inst().getLastFeedTime().c().longValue();
    }

    /* synthetic */ v(byte b2) {
        this();
    }

    private void a(long j2) {
        this.f66893d = j2;
        this.f66892c.b(Long.valueOf(this.f66893d));
    }

    @r(b = true)
    public void onQueryUserFinishedEvent(b bVar) {
        AwemeService.b().a(0);
        a(-1);
    }

    public final void a(FeedItemList feedItemList) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f66891b.b(currentTimeMillis)) {
                a(-1);
            }
            a(this.f66893d + 1);
            this.f66891b.a(currentTimeMillis);
            long j2 = this.f66893d;
            if (!(feedItemList == null || feedItemList.getItems() == null)) {
                for (Aweme aweme : feedItemList.getItems()) {
                    aweme.setFeedCount(j2);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
