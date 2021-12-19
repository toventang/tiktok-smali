package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class ae {

    /* renamed from: a  reason: collision with root package name */
    public static final ae f89524a = new ae();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89525b = i.a((h.f.a.a) a.f89526a);

    public static boolean a() {
        return ((Boolean) f89525b.getValue()).booleanValue();
    }

    private ae() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89526a = new a();

        static {
            Covode.recordClassIndex(56265);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "codecoverage_enable", true));
        }
    }

    static {
        Covode.recordClassIndex(56264);
    }
}
