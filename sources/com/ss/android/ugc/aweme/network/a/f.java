package com.ss.android.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f112549a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f112550b = i.a((h.f.a.a) a.f112551a);

    public static final boolean a() {
        return ((Boolean) f112550b.getValue()).booleanValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f112551a = new a();

        static {
            Covode.recordClassIndex(72332);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "power_preload_trigger_enable", false));
        }
    }

    static {
        Covode.recordClassIndex(72331);
    }
}
