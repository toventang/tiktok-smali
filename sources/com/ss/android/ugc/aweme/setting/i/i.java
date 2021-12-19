package com.ss.android.ugc.aweme.setting.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f122222a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final h f122223b = h.i.a((h.f.a.a) a.f122224a);

    private i() {
    }

    public static final boolean a() {
        return ((Boolean) f122223b.getValue()).booleanValue();
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122224a = new a();

        static {
            Covode.recordClassIndex(80131);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(b.a().a(true, "creative_tools_open_enter_edit_v3_opti", false));
        }
    }

    static {
        Covode.recordClassIndex(80130);
    }
}
