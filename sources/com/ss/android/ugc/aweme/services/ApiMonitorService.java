package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.h;
import h.i;
import h.m;

public final class ApiMonitorService extends AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    public static final h instance$delegate = i.a(m.SYNCHRONIZED, ApiMonitorService$Companion$instance$2.INSTANCE);

    public static final class Companion {
        static {
            Covode.recordClassIndex(79418);
        }

        public final ApiMonitorService getInstance() {
            return (ApiMonitorService) ApiMonitorService.instance$delegate.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private ApiMonitorService() {
    }

    static {
        Covode.recordClassIndex(79417);
    }

    public /* synthetic */ ApiMonitorService(g gVar) {
        this();
    }
}
