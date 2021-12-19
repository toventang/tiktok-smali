package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.a.m;
import h.h;
import h.i;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final m f34115a;

    /* renamed from: b  reason: collision with root package name */
    static final h f34116b = i.a((h.f.a.a) a.f34118a);

    /* renamed from: c  reason: collision with root package name */
    public static final q f34117c = new q();

    private q() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<m> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34118a = new a();

        static {
            Covode.recordClassIndex(20312);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ m invoke() {
            return a();
        }

        private static m a() {
            m mVar;
            try {
                mVar = (m) SettingsManager.a().a("im_sdk_report_task_info", m.class);
            } catch (Throwable unused) {
                mVar = q.f34115a;
            }
            if (mVar == null) {
                return q.f34115a;
            }
            return mVar;
        }
    }

    static {
        Covode.recordClassIndex(20311);
        m mVar = new m();
        mVar.enable = 1;
        mVar.timeoutDurationMs = 30000;
        mVar.executeTooLongMs = 30000;
        mVar.callbackTooLongMs = 5000;
        f34115a = mVar;
    }
}
