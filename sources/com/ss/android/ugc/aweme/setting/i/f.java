package com.ss.android.ugc.aweme.setting.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f122213a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f122214b = i.a((h.f.a.a) a.f122215a);

    public static boolean a() {
        return ((Boolean) f122214b.getValue()).booleanValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122215a = new a();

        static {
            Covode.recordClassIndex(80125);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "creative_tools_open_als_optimize", false));
        }
    }

    static {
        Covode.recordClassIndex(80124);
    }
}
