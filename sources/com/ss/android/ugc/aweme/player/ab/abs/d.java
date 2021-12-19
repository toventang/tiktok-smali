package com.ss.android.ugc.aweme.player.ab.abs;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f115038a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f115039b = i.a((h.f.a.a) a.f115040a);

    public static int a() {
        return ((Number) f115039b.getValue()).intValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115040a = new a();

        static {
            Covode.recordClassIndex(73949);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "video_rsp_log_frequency", 10));
        }
    }

    static {
        Covode.recordClassIndex(73948);
    }
}
