package com.ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f93021a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final a f93022b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f93023c = i.a((h.f.a.a) C2261a.f93024a);

    public static boolean a() {
        return ((Boolean) f93023c.getValue()).booleanValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.a$a  reason: collision with other inner class name */
    static final class C2261a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2261a f93024a = new C2261a();

        static {
            Covode.recordClassIndex(58996);
        }

        C2261a() {
            super(0);
        }

        private static boolean a() {
            try {
                return SettingsManager.a().a("advance_omsdk_session_start_timing", false);
            } catch (Throwable unused) {
                return a.f93021a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }
    }

    static {
        Covode.recordClassIndex(58995);
    }
}
