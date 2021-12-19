package com.bytedance.im.core.internal.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.internal.a;
import com.bytedance.im.core.internal.d.k;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.internal.utils.s;
import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsRequestBody;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.RequestBody;
import java.util.List;

public final class n extends w<Void> {
    static {
        Covode.recordClassIndex(23026);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a() {
        return true;
    }

    public n() {
        super(IMCMD.GET_CONFIGS.getValue());
    }

    public final void c() {
        a(0, new RequestBody.Builder().get_configs_body(new GetConfigsRequestBody.Builder().build()).build(), null, new Object[0]);
    }

    public n(b<Void> bVar) {
        super(IMCMD.GET_CONFIGS.getValue(), bVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final boolean a(k kVar) {
        if (kVar == null || kVar.f38725f == null || kVar.f38725f.body == null || kVar.f38725f.body.get_configs_body == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.b.a.w
    public final void a(k kVar, Runnable runnable) {
        if (!kVar.l() || !a(kVar)) {
            b(kVar);
            return;
        }
        GetConfigsResponseBody getConfigsResponseBody = kVar.f38725f.body.get_configs_body;
        List<Config> list = getConfigsResponseBody.configs;
        if (list != null && !list.isEmpty()) {
            a.f38183l = a.a(list);
            for (Config config : list) {
                if (!(config == null || config.conf_name == null || config.conf_value == null)) {
                    String str = config.conf_name;
                    str.hashCode();
                    switch (str.hashCode()) {
                        case -1702692503:
                            if (str.equals("p2pMinInterval")) {
                                a.f38181j = e.a(config.conf_value, a.f38181j);
                                break;
                            } else {
                                continue;
                            }
                        case -1302860124:
                            if (str.equals("conversationMsgRepairCount")) {
                                a.f38178g = e.a(config.conf_value, a.f38178g);
                                break;
                            } else {
                                continue;
                            }
                        case -1289425504:
                            if (str.equals("conversationMsgRepairRatio")) {
                                a.f38179h = e.a(config.conf_value, a.f38179h);
                                break;
                            } else {
                                continue;
                            }
                        case -1287953929:
                            if (str.equals("conversationMsgRepairStart")) {
                                a.f38177f = e.a(config.conf_value, a.f38177f);
                                break;
                            } else {
                                continue;
                            }
                        case -354402478:
                            if (str.equals("dbReportRate")) {
                                a.f38182k = Float.valueOf(e.a(config.conf_value, a.f38182k.floatValue()));
                                s.a();
                                s.f38859a.a("db_report_rate", Float.valueOf(a.f38182k.floatValue()));
                                break;
                            } else {
                                continue;
                            }
                        case 150002420:
                            if (str.equals("repairEnabled")) {
                                a.f38175d = e.a(config.conf_value, a.f38175d);
                                break;
                            } else {
                                continue;
                            }
                        case 849643188:
                            if (str.equals("autoPollingMsgEnabled")) {
                                a.f38172a = e.a(config.conf_value, a.f38172a);
                                break;
                            } else {
                                continue;
                            }
                        case 1056039696:
                            if (str.equals("conversationMsgRepairInterval")) {
                                a.f38176e = e.a(config.conf_value, a.f38176e);
                                break;
                            } else {
                                continue;
                            }
                        case 1217269700:
                            if (str.equals("defaultPollingMsgInterval")) {
                                a.f38174c = e.a(config.conf_value, a.f38174c);
                                break;
                            } else {
                                continue;
                            }
                        case 1263202419:
                            if (str.equals("p2pEnabled")) {
                                a.f38180i = e.a(config.conf_value, a.f38180i);
                                break;
                            } else {
                                continue;
                            }
                        case 2076115403:
                            if (str.equals("triggerPollingMsgEnabled")) {
                                a.f38173b = e.a(config.conf_value, a.f38173b);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
        String b2 = h.f38770a.b(getConfigsResponseBody);
        s.a();
        s.f38859a.a(s.a("imsdk_cloud_config"), b2);
        a((Object) null);
    }
}
