package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f34037a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f34038b = i.a((h.f.a.a) a.f34039a);

    public static boolean a() {
        return ((Boolean) f34038b.getValue()).booleanValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34039a = new a();

        static {
            Covode.recordClassIndex(20270);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (SettingsManager.a().a("iic_local_x_tt_token", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(20269);
    }
}
