package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34030a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final h f34031b = i.a((h.f.a.a) a.f34033a);

    /* renamed from: c  reason: collision with root package name */
    public static final e f34032c = new e();

    private e() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34033a = new a();

        static {
            Covode.recordClassIndex(20266);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("im_sdk_log_setting", true));
        }
    }

    static {
        Covode.recordClassIndex(20265);
    }
}
