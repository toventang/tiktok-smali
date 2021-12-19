package com.ss.android.ugc.aweme.crossplatform.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f78491a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f78492b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f78493c = i.a((h.f.a.a) C1825a.f78494a);

    public static boolean a() {
        return ((Boolean) f78493c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.abtest.a$a  reason: collision with other inner class name */
    static final class C1825a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1825a f78494a = new C1825a();

        static {
            Covode.recordClassIndex(48758);
        }

        C1825a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("enable_use_onreceivederror_for_safety", true));
        }
    }

    static {
        Covode.recordClassIndex(48757);
    }
}
