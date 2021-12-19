package com.ss.android.ugc.aweme.feed.cache;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.experiment.da;
import com.ss.android.ugc.aweme.experiment.db;
import com.ss.android.ugc.aweme.experiment.dc;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import com.ss.android.ugc.aweme.video.v;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f92722a;

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f92723b;

    /* renamed from: c  reason: collision with root package name */
    static volatile boolean f92724c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f92725d = new g();

    private g() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f92726a;

        static {
            Covode.recordClassIndex(58809);
        }

        a(Aweme aweme) {
            this.f92726a = aweme;
        }

        public final void run() {
            g.a(this.f92726a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f92727a;

        static {
            Covode.recordClassIndex(58810);
        }

        b(Aweme aweme) {
            this.f92727a = aweme;
        }

        public final void run() {
            g.a(this.f92727a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f92728a;

        static {
            Covode.recordClassIndex(58811);
        }

        c(Aweme aweme) {
            this.f92728a = aweme;
        }

        public final void run() {
            g.a(this.f92728a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f92729a;

        static {
            Covode.recordClassIndex(58812);
        }

        d(Aweme aweme) {
            this.f92729a = aweme;
        }

        public final void run() {
            g.a(this.f92729a);
        }
    }

    static {
        Covode.recordClassIndex(58808);
    }

    public static boolean a() {
        if (!f92723b || !f92724c) {
            return false;
        }
        return true;
    }

    public static void a(Aweme aweme) {
        if (aweme != null && aweme.getVideo() != null && !f92722a) {
            if ((!da.f89762a || a.b.f109011a.f109002c) && fq.a.f142946a.a(fp.PLAYER_FIRST_VIDEO_PREPARED)) {
                a.b.f109011a.b("feed_player_to_render", false);
                a.b.f109011a.b("feed_get_cache_to_render", false);
                a.b.f109011a.a("feed_get_cache_render_duration", false);
                v.O().b(aweme);
                a.b.f109011a.b("feed_get_cache_render_duration", false);
                a.b.f109011a.a("feed_render_to_focus", false);
                a.b.f109011a.a("feed_render_to_ui", false);
            }
        }
    }

    public static void a(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() > 0 && a()) {
            Aweme aweme = feedItemList.getItems().get(0);
            if (!dc.f89764a) {
                com.ss.android.ugc.aweme.cw.g.a().execute(new a(aweme));
            } else if (n.a()) {
                if (db.f89763a) {
                    new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new b(aweme));
                } else {
                    a(aweme);
                }
            } else if (db.f89763a) {
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new c(aweme));
            } else {
                m.f68150a.execute(new d(aweme));
            }
        }
    }
}
