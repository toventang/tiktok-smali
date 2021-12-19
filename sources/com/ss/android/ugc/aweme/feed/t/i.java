package com.ss.android.ugc.aweme.feed.t;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public final class i implements c<FeedItemList> {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f93934a;

    /* renamed from: b  reason: collision with root package name */
    private FeedItemList f93935b;

    /* renamed from: c  reason: collision with root package name */
    private volatile b.i f93936c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f93937d;

    static {
        Covode.recordClassIndex(59750);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final /* bridge */ /* synthetic */ void b(FeedItemList feedItemList) {
    }

    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final void c() {
        this.f93934a = true;
    }

    private void g() {
        this.f93936c = null;
        this.f93935b = null;
    }

    public static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public FeedItemList b() {
        FeedItemList feedItemList = this.f93935b;
        if (feedItemList != null) {
            g();
            return feedItemList;
        } else if (this.f93936c == null) {
            return null;
        } else {
            if (!this.f93936c.a()) {
                try {
                    this.f93936c.f();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            try {
                if (this.f93936c.c()) {
                    this.f93936c.e().printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            FeedItemList feedItemList2 = this.f93935b;
            g();
            return feedItemList2;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final void a() {
        MethodCollector.i(10259);
        if (!this.f93937d) {
            synchronized (this) {
                try {
                    if (!this.f93937d) {
                        this.f93937d = true;
                        this.f93936c = b.i.b(new k(this), g.a());
                    }
                } finally {
                    MethodCollector.o(10259);
                }
            }
            return;
        }
        MethodCollector.o(10259);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.t.c
    public final /* synthetic */ void a(FeedItemList feedItemList) {
        g();
        this.f93934a = false;
        this.f93937d = false;
        this.f93937d = true;
        this.f93935b = feedItemList;
    }
}
