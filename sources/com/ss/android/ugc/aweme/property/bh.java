package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class bh {

    /* renamed from: a  reason: collision with root package name */
    public static final bh f118366a = new bh();

    /* renamed from: b  reason: collision with root package name */
    private static final h f118367b = i.a((h.f.a.a) a.f118370a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f118368c = i.a((h.f.a.a) c.f118372a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f118369d = i.a((h.f.a.a) b.f118371a);

    public static final boolean a() {
        return ((Boolean) f118367b.getValue()).booleanValue();
    }

    public static final int b() {
        return ((Number) f118368c.getValue()).intValue();
    }

    public static final int c() {
        return ((Number) f118369d.getValue()).intValue();
    }

    private bh() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118370a = new a();

        static {
            Covode.recordClassIndex(76876);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.bytedance.ies.abmock.b.a().a(true, "creative_tools_monitor_fps_and_lag", false));
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118371a = new b();

        static {
            Covode.recordClassIndex(76877);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("creative_tools_ui_lag_monitor_duration", 5000));
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f118372a = new c();

        static {
            Covode.recordClassIndex(76878);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("creative_tools_ui_block_threshold", 500));
        }
    }

    static {
        Covode.recordClassIndex(76875);
    }
}
