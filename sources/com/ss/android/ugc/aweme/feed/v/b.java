package com.ss.android.ugc.aweme.feed.v;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.cn;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f95149a = 1500;

    /* renamed from: b  reason: collision with root package name */
    public static final b f95150b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final h f95151c = i.a((h.f.a.a) a.f95152a);

    private static int b() {
        return ((Number) f95151c.getValue()).intValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f95152a = new a();

        static {
            Covode.recordClassIndex(60307);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("vboost_feed_scroll_opt_time", 1500));
        }
    }

    static {
        Covode.recordClassIndex(60306);
    }

    public static final int a() {
        if (cn.f89703a) {
            return b();
        }
        return SettingsManager.a().a("vboost_feed_scroll_opt_time", 1500);
    }
}
