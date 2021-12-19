package com.ss.android.ugc.aweme.discover.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f80995a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f80996b = i.a((h.f.a.a) a.f80997a);

    public static boolean a() {
        return ((Boolean) f80996b.getValue()).booleanValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80997a = new a();

        static {
            Covode.recordClassIndex(50352);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("dynamic_cover_decode_config", false));
        }
    }

    static {
        Covode.recordClassIndex(50351);
    }
}
