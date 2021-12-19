package com.ss.android.ugc.aweme.profile.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f116630a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f116631b = i.a((h.f.a.a) a.f116632a);

    private d() {
    }

    static final class a extends m implements h.f.a.a<ThirdPartyBindingEntry> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116632a = new a();

        static {
            Covode.recordClassIndex(75355);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ThirdPartyBindingEntry invoke() {
            return new ThirdPartyBindingEntry(false, false, false, 7, null);
        }
    }

    static {
        Covode.recordClassIndex(75354);
    }

    public static final ThirdPartyBindingEntry a() {
        try {
            ThirdPartyBindingEntry thirdPartyBindingEntry = (ThirdPartyBindingEntry) SettingsManager.a().a("third_party_binding", ThirdPartyBindingEntry.class);
            if (thirdPartyBindingEntry == null) {
                return (ThirdPartyBindingEntry) f116631b.getValue();
            }
            return thirdPartyBindingEntry;
        } catch (Throwable unused) {
        }
    }
}
