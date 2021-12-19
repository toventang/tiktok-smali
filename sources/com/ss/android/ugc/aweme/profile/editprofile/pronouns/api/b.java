package com.ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116176a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final h f116177b = i.a((h.f.a.a) a.f116179a);

    /* renamed from: c  reason: collision with root package name */
    public static final b f116178c = new b();

    private b() {
    }

    static final class a extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116179a = new a();

        static {
            Covode.recordClassIndex(74943);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            Object a2 = SettingsManager.a().a("profile_pronouns_config", a.class, b.f116176a);
            if (a2 == null) {
                a2 = b.f116176a;
            }
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(74942);
    }
}
