package com.ss.android.ugc.aweme.im.sdk.common.controller.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f102194a = 16;

    /* renamed from: b  reason: collision with root package name */
    public static final b f102195b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final h f102196c = i.a((h.f.a.a) a.f102197a);

    public static int a() {
        return ((Number) f102196c.getValue()).intValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102197a = new a();

        static {
            Covode.recordClassIndex(65396);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("im_group_max_members", 16));
        }
    }

    static {
        Covode.recordClassIndex(65395);
    }
}
