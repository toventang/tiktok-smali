package com.ss.android.ugc.aweme.livewallpaper.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f108891a = 172;

    /* renamed from: b  reason: collision with root package name */
    public static final d f108892b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final h f108893c = i.a((h.f.a.a) a.f108894a);

    public static int a() {
        return ((Number) f108893c.getValue()).intValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108894a = new a();

        static {
            Covode.recordClassIndex(69735);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("wallpaper_plugin_version_code", 172));
        }
    }

    static {
        Covode.recordClassIndex(69734);
    }
}
