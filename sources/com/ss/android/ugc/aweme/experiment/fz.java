package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class fz {

    /* renamed from: a  reason: collision with root package name */
    public static final fz f90119a = new fz();

    /* renamed from: b  reason: collision with root package name */
    private static final h f90120b = i.a((h.f.a.a) a.f90121a);

    public static int a() {
        return ((Number) f90120b.getValue()).intValue();
    }

    private fz() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90121a = new a();

        static {
            Covode.recordClassIndex(56539);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "record_audio_optimize", 0));
        }
    }

    static {
        Covode.recordClassIndex(56538);
    }
}
