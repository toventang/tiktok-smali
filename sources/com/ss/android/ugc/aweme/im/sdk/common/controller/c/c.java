package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f102198a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final c f102199b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f102200c = i.a((h.f.a.a) a.f102201a);

    private static int b() {
        return ((Number) f102200c.getValue()).intValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102201a = new a();

        static {
            Covode.recordClassIndex(65398);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("im_enable_group_invite_entry", 1));
        }
    }

    public static boolean a() {
        if (b() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(65397);
    }
}
