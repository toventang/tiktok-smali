package com.ss.android.ugc.aweme.player.ab.abs.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f115034a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f115035b = i.a((h.f.a.a) a.f115036a);

    public static boolean a() {
        return ((Boolean) f115035b.getValue()).booleanValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f115036a = new a();

        static {
            Covode.recordClassIndex(73945);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "player_scroll_prerender_range_enable", true));
        }
    }

    static {
        Covode.recordClassIndex(73944);
    }
}
