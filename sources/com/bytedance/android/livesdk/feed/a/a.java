package com.bytedance.android.livesdk.feed.a;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.core.g.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.android.live.core.paging.a.b;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.livesetting.feed.I18nZhibozhongAnimationTagSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.util.rxutils.i;
import com.bytedance.covode.number.Covode;
import f.a.l.c;
import java.util.HashMap;
import java.util.Map;

public abstract class a extends b<FeedItem> {

    /* renamed from: j  reason: collision with root package name */
    public Handler f17224j;

    /* renamed from: k  reason: collision with root package name */
    FeedDataKey f17225k;

    /* renamed from: l  reason: collision with root package name */
    public Map<String, Long> f17226l;

    /* renamed from: m  reason: collision with root package name */
    Map<String, Long> f17227m;
    public Map<String, Long> n;
    c<e<FeedItem, Long>> o;
    c<FeedItem> p;
    public c<Object> q;
    public c<Object> r;
    public c<Boolean> s;
    c<Object> t;
    public boolean u;
    public Map<Integer, com.bytedance.android.live.core.g.a> v;
    public Object[] w;
    public boolean x;
    public boolean y;
    private h z;

    static {
        Covode.recordClassIndex(9564);
    }

    public int c(int i2) {
        return -8888;
    }

    /* renamed from: com.bytedance.android.livesdk.feed.a.a$a  reason: collision with other inner class name */
    static class C0362a extends j.e<FeedItem> {
        static {
            Covode.recordClassIndex(9565);
        }

        private C0362a() {
        }

        /* synthetic */ C0362a(byte b2) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* bridge */ /* synthetic */ boolean a(FeedItem feedItem, FeedItem feedItem2) {
            FeedItem feedItem3 = feedItem;
            if (feedItem3.type == feedItem2.type && feedItem3.type == 1003) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* bridge */ /* synthetic */ boolean b(FeedItem feedItem, FeedItem feedItem2) {
            FeedItem feedItem3 = feedItem;
            if (feedItem3.type == feedItem2.type && feedItem3.type == 1003) {
                return true;
            }
            return false;
        }
    }

    public final void c() {
        a(this.f17226l, false);
    }

    public final void b() {
        this.f17224j.removeCallbacksAndMessages(null);
        if (I18nZhibozhongAnimationTagSetting.INSTANCE.getValue()) {
            this.t.onNext(i.f22198c);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.core.paging.a.b
    public final /* synthetic */ int a(FeedItem feedItem) {
        FeedItem feedItem2 = feedItem;
        if (feedItem2 == null) {
            return -8888;
        }
        return c(feedItem2.type);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.bytedance.android.live.core.paging.a.b
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        FeedItem feedItem;
        super.onViewDetachedFromWindow(viewHolder);
        int b2 = b(viewHolder.getAdapterPosition());
        if (b2 >= 0 && b2 < b(getItemCount()) && (feedItem = (FeedItem) a(b2)) != null && feedItem.item != null) {
            String mixId = feedItem.item.getMixId();
            if (this.f17226l.get(mixId) != null) {
                long longValue = this.f17226l.get(mixId).longValue();
                Long l2 = this.f17227m.get(mixId);
                if (l2 == null) {
                    l2 = 0L;
                }
                this.f17227m.put(mixId, Long.valueOf(l2.longValue() + ((System.nanoTime() / 1000000) - longValue)));
                this.f17226l.remove(mixId);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.bytedance.android.live.core.paging.a.b
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        FeedItem feedItem;
        super.onViewAttachedToWindow(viewHolder);
        if (!this.u) {
            int b2 = b(viewHolder.getAdapterPosition());
            if (b2 >= 0 && b2 < b(getItemCount()) && (feedItem = (FeedItem) a(b2)) != null && feedItem.item != null) {
                String mixId = feedItem.item.getMixId();
                if (this.y) {
                    if (!this.x) {
                        b.a.a("livesdk_explore_page_show").a().a("show_type", "normal").a("has_banner", com.bytedance.android.b.a.a.f6785g.c()).b();
                        this.x = true;
                    }
                    if (this.f17226l.get(mixId) == null) {
                        this.f17226l.put(mixId, Long.valueOf(System.nanoTime() / 1000000));
                    }
                } else {
                    if (this.n == null) {
                        this.n = new HashMap();
                    }
                    this.n.put(mixId, -1L);
                }
            }
            com.bytedance.android.live.core.performance.b.a(b.a.LiveFeedInit, com.bytedance.android.live.core.performance.b.a("viewholder", viewHolder.getClass().toString()));
        }
    }

    public a(Map<Integer, com.bytedance.android.live.core.g.a> map, h hVar) {
        this(new C0362a((byte) 0), map, hVar);
    }

    @Override // com.bytedance.android.live.core.paging.a.b
    public final RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        com.bytedance.android.live.core.g.a aVar = this.v.get(Integer.valueOf(i2));
        if (aVar == null) {
            return new com.bytedance.android.live.core.paging.a.a(viewGroup);
        }
        return aVar.a(viewGroup, this.w);
    }

    private void a(String str, long j2) {
        FeedItem b2;
        if (j2 > 0 && j2 >= 50 && (b2 = this.z.b(this.f17225k, str)) != null) {
            this.o.onNext(new e<>(b2, Long.valueOf(j2)));
        }
    }

    public final void a(Map<String, Long> map, boolean z2) {
        if (!(map == null || map.size() == 0)) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                String key = entry.getKey();
                long longValue = entry.getValue().longValue();
                if (!z2 && longValue > 0) {
                    longValue = (System.nanoTime() / 1000000) - longValue;
                }
                a(key, longValue);
            }
            map.clear();
        }
    }

    private a(j.e<FeedItem> eVar, Map<Integer, com.bytedance.android.live.core.g.a> map, h hVar) {
        super(eVar);
        this.f17224j = new Handler(Looper.getMainLooper());
        this.o = new c<>();
        this.p = new c<>();
        this.q = new c<>();
        this.r = new c<>();
        this.s = new c<>();
        this.t = new c<>();
        this.y = true;
        this.v = map;
        this.z = hVar;
        this.f17226l = new HashMap();
        this.f17227m = new HashMap();
        this.p.a(new b(this), c.f17229a);
    }
}
