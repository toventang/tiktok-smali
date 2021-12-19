package com.bytedance.helios.sdk.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.g;
import com.bytedance.helios.api.b.n;
import com.bytedance.helios.api.config.ApiInfo;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.f.c.r;
import com.bytedance.helios.sdk.utils.f;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import java.util.Map;

public final class b implements g {
    static {
        Covode.recordClassIndex(17903);
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ ApiInfo $apiInfo$inlined;
        final /* synthetic */ n $event$inlined;
        final /* synthetic */ Map.Entry $it;
        final /* synthetic */ Map $this_apply$inlined;

        static {
            Covode.recordClassIndex(17904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Map.Entry entry, Map map, ApiInfo apiInfo, n nVar) {
            super(0);
            this.$it = entry;
            this.$this_apply$inlined = map;
            this.$apiInfo$inlined = apiInfo;
            this.$event$inlined = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(((com.bytedance.helios.sdk.f.a.b) this.$it.getValue()).a(this.$event$inlined, this.$apiInfo$inlined));
        }
    }

    @Override // com.bytedance.helios.api.b.g
    public final void a(n nVar) {
        l.c(nVar, "");
        for (T t : HeliosEnvImpl.INSTANCE.getApiInfoList(nVar.f30673b, nVar.f30672a)) {
            Map d2 = ag.d(HeliosEnvImpl.INSTANCE.getBaseExpressionEnv());
            for (Map.Entry<String, com.bytedance.helios.sdk.f.a.b> entry : HeliosEnvImpl.INSTANCE.getMonitorConditions().entrySet()) {
                d2.put(entry.getKey(), new a(entry, d2, t, nVar));
            }
            for (T t2 : t.getMonitorConfigs()) {
                boolean a2 = r.a(t2.getEffectExpression(), d2);
                f.a("Helios-Control-Api", "MonitorHandler isEffectConfig=" + a2 + " effectExpression=" + t2.getEffectExpression() + " id=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                if (a2) {
                    nVar.y.f30652d = t;
                    nVar.y.f30653e = t2;
                    boolean a3 = r.a(t2.getConditionExpression(), d2);
                    f.a("Helios-Control-Api", "MonitorHandler isCondition=" + a3 + " conditionExpression=" + t2.getConditionExpression() + " id=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                    if (a3) {
                        nVar.y.f30655g.add(t2);
                    }
                }
            }
        }
    }
}
