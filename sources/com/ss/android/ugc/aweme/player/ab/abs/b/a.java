package com.ss.android.ugc.aweme.player.ab.abs.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f115021a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f115022b = i.a((h.f.a.a) C2944a.f115024a);

    public static int a() {
        return ((Number) f115022b.getValue()).intValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.player.ab.abs.b.a$a  reason: collision with other inner class name */
    static final class C2944a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2944a f115024a = new C2944a();

        static {
            Covode.recordClassIndex(73937);
        }

        C2944a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "player_prerender_check_cache_size", 204800));
        }
    }

    static {
        Covode.recordClassIndex(73936);
    }
}
