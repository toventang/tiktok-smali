package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f34111a = true;

    /* renamed from: b  reason: collision with root package name */
    static final h f34112b = i.a((h.f.a.a) a.f34114a);

    /* renamed from: c  reason: collision with root package name */
    public static final p f34113c = new p();

    private p() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34114a = new a();

        static {
            Covode.recordClassIndex(20310);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.a().a("im_sdk_report_db_metrics_by_tea", true));
        }
    }

    static {
        Covode.recordClassIndex(20309);
    }
}
