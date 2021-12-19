package com.ss.android.ugc.aweme.notification.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f113110a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final h f113111b = i.a((h.f.a.a) C2887a.f113113a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f113112c = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.ab.a$a  reason: collision with other inner class name */
    static final class C2887a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2887a f113113a = new C2887a();

        static {
            Covode.recordClassIndex(72725);
        }

        C2887a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("inbox_mus_use_has_more", true));
        }
    }

    static {
        Covode.recordClassIndex(72724);
    }
}
