package com.ss.android.ugc.aweme.commercialize.l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f74494a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f74495b = i.a((h.f.a.a) a.f74496a);

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f74496a = new a();

        static {
            Covode.recordClassIndex(45945);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("enable_rich_ad_tracker", false));
        }
    }

    public static boolean a() {
        return SettingsManager.a().a("enable_rich_ad_tracker", false);
    }

    static {
        Covode.recordClassIndex(45944);
    }
}
