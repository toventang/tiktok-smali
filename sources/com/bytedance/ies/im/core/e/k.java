package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static final h f34088a = i.a((h.f.a.a) a.f34090a);

    /* renamed from: b  reason: collision with root package name */
    public static final k f34089b = new k();

    private k() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34090a = new a();

        static {
            Covode.recordClassIndex(20298);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("im_sdk_pull_recent_cmd_parallel", false));
        }
    }

    static {
        Covode.recordClassIndex(20297);
    }
}
