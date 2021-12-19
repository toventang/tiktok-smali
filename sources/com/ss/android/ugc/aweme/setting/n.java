package com.ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f122354a = new n();

    /* renamed from: b  reason: collision with root package name */
    private static final h f122355b = i.a((h.f.a.a) a.f122357a);

    public static boolean a() {
        return ((Boolean) f122355b.getValue()).booleanValue();
    }

    private n() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122357a = new a();

        static {
            Covode.recordClassIndex(80225);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "studio_use_cache_in_duet", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(80224);
    }
}
