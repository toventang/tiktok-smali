package com.ss.android.ugc.aweme.feed.t;

import b.i;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.aweme.video.v;
import java.util.Collection;
import java.util.List;

public final class e implements c<FeedItemList> {

    /* renamed from: a  reason: collision with root package name */
    FeedItemList f93916a;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f93917b;

    /* renamed from: c  reason: collision with root package name */
    private volatile i f93918c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f93919d;

    static {
        Covode.recordClassIndex(59743);
    }

    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final void c() {
        this.f93917b = true;
    }

    private void f() {
        this.f93918c = null;
        this.f93916a = null;
    }

    public static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public FeedItemList b() {
        System.currentTimeMillis();
        FeedItemList feedItemList = this.f93916a;
        if (feedItemList != null) {
            f();
            return feedItemList;
        } else if (this.f93918c == null) {
            return null;
        } else {
            if (!this.f93918c.a()) {
                try {
                    this.f93918c.f();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                if (this.f93918c.c()) {
                    this.f93918c.e().printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            FeedItemList feedItemList2 = this.f93916a;
            f();
            return feedItemList2;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final void a() {
        MethodCollector.i(8101);
        if (!this.f93919d) {
            synchronized (this) {
                try {
                    if (!this.f93919d) {
                        this.f93919d = true;
                        this.f93918c = i.b(new h(this), g.a());
                    }
                } finally {
                    MethodCollector.o(8101);
                }
            }
            return;
        }
        MethodCollector.o(8101);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final /* synthetic */ void a(FeedItemList feedItemList) {
        f();
        this.f93917b = false;
        this.f93919d = false;
        this.f93919d = true;
        this.f93916a = feedItemList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final /* synthetic */ void b(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        FeedItemList feedItemList3 = this.f93916a;
        if (feedItemList3 != null) {
            List<Aweme> items = feedItemList3.getItems();
            if (items == null || items.size() <= 0) {
                this.f93916a = feedItemList2;
                return;
            }
            Aweme aweme = items.get(0);
            items.clear();
            items.add(aweme);
            for (Aweme aweme2 : feedItemList2.getItems()) {
                if (!aweme2.getDesc().equals(aweme.getDesc())) {
                    items.add(aweme2);
                }
            }
            return;
        }
        this.f93916a = feedItemList2;
    }

    public static void a(FeedItemList feedItemList, int i2) {
        Aweme aweme;
        if (feedItemList != null && !b.a((Collection) feedItemList.getItems()) && fq.a.f142946a.a(fp.FEED_FIRST_VIDEO_PRELOAD)) {
            feedItemList.getItems().size();
            ac.a(feedItemList.getItems());
            if (fq.a.f142946a.a(fp.PLAYER_FIRST_VIDEO_PREPARED) && (aweme = feedItemList.getItems().get(0)) != null && aweme.getVideo() != null) {
                if (i2 == 4) {
                    aweme.getAid();
                    aweme.getDesc();
                    v.O().a(aweme);
                } else if (com.ss.android.ugc.aweme.feed.cache.g.a()) {
                    v.O().b(aweme);
                }
            }
        }
    }
}
