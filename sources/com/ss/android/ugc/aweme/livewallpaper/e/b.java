package com.ss.android.ugc.aweme.livewallpaper.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f108886a = 24;

    /* renamed from: b  reason: collision with root package name */
    public static final h f108887b = i.a((h.f.a.a) a.f108889a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f108888c = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108889a = new a();

        static {
            Covode.recordClassIndex(69732);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("wall_paper_cache_feed_expire_hour", 24));
        }
    }

    static {
        Covode.recordClassIndex(69731);
    }
}
