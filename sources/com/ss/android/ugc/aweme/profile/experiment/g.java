package com.ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f116347a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f116348b = i.a((h.f.a.a) a.f116349a);

    public static boolean a() {
        return ((Boolean) f116348b.getValue()).booleanValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116349a = new a();

        static {
            Covode.recordClassIndex(75122);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "horizontal_ui_paradigm_for_advanced_features", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(75121);
    }
}
