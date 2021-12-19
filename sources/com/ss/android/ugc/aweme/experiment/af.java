package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static final af f89527a = new af();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89528b = i.a((h.f.a.a) a.f89529a);

    public static boolean a() {
        return ((Boolean) f89528b.getValue()).booleanValue();
    }

    private af() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89529a = new a();

        static {
            Covode.recordClassIndex(56267);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "codecoverage_memory_opt", false));
        }
    }

    static {
        Covode.recordClassIndex(56266);
    }
}
