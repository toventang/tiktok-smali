package com.ss.android.ugc.aweme.discover.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f80245a = new z();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80246b = i.a((h.f.a.a) a.f80247a);

    public static int a() {
        return ((Number) f80246b.getValue()).intValue();
    }

    private z() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80247a = new a();

        static {
            Covode.recordClassIndex(49942);
        }

        a() {
            super(0);
        }

        private static int a() {
            try {
                return b.a().a(true, "enable_playlist_icon_in_search_video", 0);
            } catch (Throwable unused) {
                return 0;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(49941);
    }
}
