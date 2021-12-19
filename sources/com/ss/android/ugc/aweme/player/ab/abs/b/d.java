package com.ss.android.ugc.aweme.player.ab.abs.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f115031a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f115032b = i.a((h.f.a.a) a.f115033a);

    public static int a() {
        return ((Number) f115032b.getValue()).intValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115033a = new a();

        static {
            Covode.recordClassIndex(73943);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "player_prerender_need_check_video_duration", 0));
        }
    }

    static {
        Covode.recordClassIndex(73942);
    }
}
