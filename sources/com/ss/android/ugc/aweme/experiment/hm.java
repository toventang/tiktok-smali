package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class hm {

    /* renamed from: a  reason: collision with root package name */
    public static final hm f90223a = new hm();

    /* renamed from: b  reason: collision with root package name */
    private static final h f90224b = i.a((h.f.a.a) a.f90225a);

    public static boolean a() {
        return ((Boolean) f90224b.getValue()).booleanValue();
    }

    private hm() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90225a = new a();

        static {
            Covode.recordClassIndex(56595);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (!b.a().a(true, "wallpaper_engine_ttplayer_ab", false)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56594);
    }
}
