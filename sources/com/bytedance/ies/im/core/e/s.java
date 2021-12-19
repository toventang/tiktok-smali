package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.a.g;
import h.f.b.m;
import h.h;
import h.i;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final g f34124a;

    /* renamed from: b  reason: collision with root package name */
    static final h f34125b = i.a((h.f.a.a) a.f34127a);

    /* renamed from: c  reason: collision with root package name */
    public static final s f34126c = new s();

    private s() {
    }

    static final class a extends m implements h.f.a.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34127a = new a();

        static {
            Covode.recordClassIndex(20316);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return a();
        }

        private static g a() {
            g gVar;
            try {
                gVar = (g) SettingsManager.a().a("im_sdk_trace_config", g.class);
            } catch (Throwable unused) {
                gVar = s.f34124a;
            }
            if (gVar == null) {
                return s.f34124a;
            }
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(20315);
        g gVar = new g();
        gVar.enableNetworkTrace = true;
        gVar.logCmdUsage = true;
        f34124a = gVar;
    }
}
