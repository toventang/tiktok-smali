package com.ss.android.ugc.aweme.video.b;

import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f143278a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f143279b = i.a((h.f.a.a) a.f143280a);

    public static final boolean a() {
        return ((Boolean) f143279b.getValue()).booleanValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143280a = new a();

        static {
            Covode.recordClassIndex(93779);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "use_own_player_high_level", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(93778);
    }
}
