package com.ss.android.ugc.aweme.livewallpaper.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f108882a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final h f108883b = i.a((h.f.a.a) C2790a.f108885a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f108884c = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.e.a$a  reason: collision with other inner class name */
    static final class C2790a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2790a f108885a = new C2790a();

        static {
            Covode.recordClassIndex(69730);
        }

        C2790a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("wall_paper_active_check_interval_hour", 2));
        }
    }

    static {
        Covode.recordClassIndex(69729);
    }
}
