package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34014a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final a f34015b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f34016c = i.a((h.f.a.a) C0751a.f34017a);

    public static final boolean a() {
        return ((Boolean) f34016c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.ies.im.core.c.a$a  reason: collision with other inner class name */
    static final class C0751a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0751a f34017a = new C0751a();

        static {
            Covode.recordClassIndex(20259);
        }

        C0751a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("async_imsdk_login_and_msg_pull", true));
        }
    }

    static {
        Covode.recordClassIndex(20258);
    }
}
