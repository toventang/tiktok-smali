package com.bytedance.helios.sdk.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.d;
import com.bytedance.helios.api.b.b;
import com.bytedance.helios.api.b.c;
import com.bytedance.helios.api.b.f;
import com.bytedance.helios.api.b.i;
import com.bytedance.helios.api.b.p;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import h.a.n;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f30837a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f30838b = n.b("0", "-1", "false", "[]", "{}");

    public static final class a {
        static {
            Covode.recordClassIndex(17913);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(17912);
    }

    private static boolean a(Map.Entry<String, String> entry) {
        if (entry.getKey().length() <= 0 || entry.getValue().length() <= 0 || f30838b.contains(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.helios.api.b.c
    public final void a(f fVar) {
        String str;
        boolean a2;
        String str2;
        String str3;
        long j2;
        Object obj;
        boolean z;
        Object obj2;
        String str4;
        long j3;
        boolean z2;
        String obj3;
        b bVar;
        Set<String> set;
        String str5 = "";
        l.c(fVar, str5);
        com.bytedance.helios.api.b.n nVar = (com.bytedance.helios.api.b.n) fVar;
        l.c(nVar, str5);
        p pVar = com.bytedance.helios.sdk.g.b.f30988b;
        if (pVar != null) {
            if (h.m.p.b(nVar.p, "AppOpsException_", false)) {
                nVar.h("app_ops_config");
                com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.o + " enable=" + pVar.f30693a + " eventId=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                a2 = pVar.f30693a;
            } else if (l.a((Object) nVar.p, (Object) "AppAutoStartException")) {
                nVar.h("auto_start_config");
                com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.o + " enable=" + pVar.f30694b + " eventId=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                a2 = pVar.f30694b;
            } else {
                com.bytedance.helios.api.b.e eVar = com.bytedance.helios.sdk.g.b.f30990d.get(Integer.valueOf(nVar.f30673b));
                if (eVar != null) {
                    nVar.h("api_");
                    a2 = com.bytedance.helios.sdk.g.b.a(nVar, eVar);
                    com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.o + " enable=" + a2 + " eventId=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                } else {
                    com.bytedance.helios.sdk.d.e b2 = com.bytedance.helios.sdk.e.b(nVar.f30673b);
                    if (b2 == null || (str = b2.f30873a) == null) {
                        str = nVar.f30672a;
                    }
                    com.bytedance.helios.api.b.e eVar2 = com.bytedance.helios.sdk.g.b.f30989c.get(str);
                    if (eVar2 != null) {
                        nVar.h("resource_");
                        a2 = com.bytedance.helios.sdk.g.b.a(nVar, eVar2);
                        com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.o + "  enable=" + a2 + " eventId=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                    } else {
                        nVar.h("default_");
                        a2 = com.bytedance.helios.sdk.g.b.a(nVar, pVar.f30696d);
                        com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "isPrivacyEventEnabled logType=" + nVar.o + "  enable=" + a2 + " eventId=" + nVar.f30673b + " startedTime=" + nVar.f30683l, (String) null, 12);
                    }
                }
            }
            if (a2) {
                Set<String> set2 = nVar.y.f30654f;
                if (set2 == null || set2.isEmpty()) {
                    str2 = str5;
                } else {
                    str2 = com.bytedance.helios.sdk.utils.c.a(set2);
                }
                i iVar = nVar.z;
                if (iVar == null || (set = iVar.f30661a) == null || set.isEmpty()) {
                    str3 = str5;
                } else {
                    str3 = com.bytedance.helios.sdk.utils.c.a(set);
                }
                b bVar2 = nVar.B;
                if (bVar2 == null || bVar2.f30648b == 0 || (bVar = nVar.B) == null) {
                    j2 = 0;
                } else {
                    j2 = bVar.f30648b - bVar.f30647a;
                }
                String valueOf = String.valueOf(nVar.f30673b);
                String str6 = nVar.p;
                String str7 = nVar.f30675d;
                String str8 = nVar.f30674c;
                String str9 = nVar.f30681j;
                String str10 = nVar.f30680i;
                String str11 = nVar.f30678g;
                String valueOf2 = String.valueOf(nVar.f30683l);
                com.bytedance.helios.api.b.a aVar = nVar.A;
                if (aVar != null) {
                    obj = Long.valueOf(aVar.f30643b);
                } else {
                    obj = str5;
                }
                String obj4 = obj.toString();
                String str12 = nVar.f30677f;
                if (!nVar.w || !a.f30805b) {
                    z = false;
                } else {
                    z = true;
                }
                String valueOf3 = String.valueOf(z);
                com.bytedance.helios.api.b.a aVar2 = nVar.A;
                if (aVar2 != null) {
                    obj2 = Integer.valueOf(aVar2.f30642a);
                } else {
                    obj2 = str5;
                }
                String obj5 = obj2.toString();
                String valueOf4 = String.valueOf(nVar.f30682k);
                com.bytedance.helios.api.b.a aVar3 = nVar.A;
                if (aVar3 == null || (str4 = aVar3.f30644c) == null) {
                    str4 = str5;
                }
                boolean z3 = nVar.r;
                boolean z4 = nVar.r;
                String str13 = nVar.v;
                String a3 = com.bytedance.helios.sdk.utils.c.a(nVar.n);
                String a4 = com.bytedance.helios.sdk.utils.b.a(nVar.u);
                String str14 = nVar.s;
                b bVar3 = nVar.B;
                if (bVar3 != null) {
                    j3 = bVar3.f30647a;
                } else {
                    j3 = 0;
                }
                if (j2 >= HeliosEnvImpl.INSTANCE.getApiTimeOutDuration()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String valueOf5 = String.valueOf(z2);
                boolean z5 = nVar.x;
                String str15 = nVar.C;
                if (str15 == null) {
                    str15 = str5;
                }
                List<? extends Object> list = nVar.D;
                if (!(list == null || (obj3 = list.toString()) == null)) {
                    str5 = obj3;
                }
                a(new d(valueOf, str6, str8, str7, str9, str10, str11, valueOf2, obj4, a3, valueOf3, str4, obj5, valueOf4, str2, str12, z3, z4, str3, a4, str13, str14, j3, j2, valueOf5, z5, str15, str5, nVar.E, com.bytedance.helios.sdk.utils.b.a(nVar.F)), nVar.w);
            }
        }
    }

    private final void a(d dVar, boolean z) {
        d a2 = d.a(new StackTraceElement(getClass().getName(), "", "", 0), dVar.r, dVar.f30827d, dVar.x, true, "EnsureNotReachHere", "helios_log_type");
        l.a((Object) a2, "");
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("EventId", dVar.f30824a);
        aVar.put("EventType", dVar.f30825b);
        aVar.put("EventName", dVar.f30826c);
        aVar.put("EventSubType", dVar.f30827d);
        aVar.put("EventCurrentPage", dVar.f30828e);
        aVar.put("EventTriggerScene", dVar.f30829f);
        aVar.put("EventPageStack", dVar.f30830g);
        aVar.put("EventStartedTime", dVar.f30831h);
        aVar.put("EventReportTime", dVar.f30832i);
        aVar.put("EventStartedExtraInfo", dVar.f30833j);
        aVar.put("EventStartedReflectionStatus", String.valueOf(dVar.s));
        aVar.put("EventAnchorReportCount", dVar.n);
        aVar.put("EventTotalAnchorTimeDelay", dVar.o);
        aVar.put("EventALogIsUpload", dVar.f30835l);
        aVar.put("EventCheckType", dVar.f30836m);
        aVar.put("EventRuleNames", dVar.q);
        aVar.put("EventFrequencyNames", dVar.u);
        aVar.put("EventWarningTypes", dVar.v);
        aVar.put("EventUserRegion", dVar.w);
        aVar.put("SDKVersion", dVar.A);
        aVar.put("CallCloseTime", String.valueOf(dVar.y));
        aVar.put("CloseCostTime", String.valueOf(dVar.z));
        aVar.put("isSystemApiTimeOut", dVar.B);
        aVar.put("CrpCallingType", dVar.D);
        aVar.put("CrpCallingEvents", dVar.E);
        aVar.put("permissionType", dVar.F);
        aVar.put("monitorScene", dVar.G);
        for (Map.Entry entry : aVar.entrySet()) {
            if (a(entry)) {
                a2.c((String) entry.getKey(), (String) entry.getValue());
            }
        }
        androidx.c.a aVar2 = new androidx.c.a();
        aVar2.put("EventId", dVar.f30824a);
        aVar2.put("EventType", dVar.f30825b);
        aVar2.put("EventName", dVar.f30826c);
        aVar2.put("EventSubType", dVar.f30827d);
        aVar2.put("EventCurrentPage", dVar.f30828e);
        aVar2.put("EventTriggerScene", dVar.f30829f);
        aVar2.put("EventStartedReflectionStatus", String.valueOf(dVar.s));
        aVar2.put("EventCheckType", dVar.f30836m);
        aVar2.put("EventRuleNames", dVar.q);
        aVar2.put("EventFrequencyNames", dVar.u);
        aVar2.put("EventWarningTypes", dVar.v);
        aVar2.put("EventUserRegion", dVar.w);
        aVar2.put("EventAnchorReportCount", dVar.n);
        if (dVar.C || l.a((Object) dVar.f30824a, (Object) "102600") || l.a((Object) dVar.f30824a, (Object) "100003") || l.a((Object) dVar.f30824a, (Object) "100012")) {
            aVar2.put("EventStartedExtraInfo", dVar.f30833j);
        }
        aVar2.put("isSystemApiTimeOut", dVar.B);
        aVar2.put("CrpCallingType", dVar.D);
        aVar2.put("permissionType", dVar.F);
        aVar2.put("monitorScene", dVar.G);
        for (Map.Entry entry2 : aVar2.entrySet()) {
            if (a(entry2)) {
                a2.a((String) entry2.getKey(), (String) entry2.getValue());
            }
        }
        com.bytedance.crash.j.i.a(a2);
        if (z) {
            a.b();
        }
        com.bytedance.helios.sdk.utils.f.a("Helios-Log-Monitor-Ability-Api-Call", "monitorToNpth eventId=" + dVar.f30824a + " eventName=" + dVar.f30826c + ' ' + "eventStartedTime=" + dVar.f30831h + ' ' + "crpCallingType=" + dVar.D + ' ' + "crpCallingEvents=" + dVar.E, (String) null, 12);
        com.bytedance.helios.sdk.utils.f.b("Helios-Log-Monitor-Ability-Api-Call", "monitorToNpth (custom)\n" + a2.f27557a.get("custom"));
        com.bytedance.helios.sdk.utils.f.b("Helios-Log-Monitor-Ability-Api-Call", "monitorToNpth (filters)\n" + a2.f27557a.get("filters"));
    }
}
