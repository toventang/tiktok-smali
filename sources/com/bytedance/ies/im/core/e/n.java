package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    static final h f34104a = i.a((h.f.a.a) a.f34106a);

    /* renamed from: b  reason: collision with root package name */
    public static final n f34105b = new n();

    private n() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34106a = new a();

        static {
            Covode.recordClassIndex(20306);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("im_sdk_recover_version", 0));
        }
    }

    static {
        Covode.recordClassIndex(20305);
    }
}
