package com.ss.android.ugc.aweme.utils.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final h f142657a = i.a((h.f.a.a) a.f142659a);

    /* renamed from: b  reason: collision with root package name */
    public static final b f142658b = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142659a = new a();

        static {
            Covode.recordClassIndex(93325);
        }

        a() {
            super(0);
        }

        private static boolean a() {
            try {
                return SettingsManager.a().a("eventbus_logger", false);
            } catch (Throwable unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(93324);
    }
}
