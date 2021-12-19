package com.bytedance.geckox;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e.d;
import com.bytedance.geckox.e.f;
import com.bytedance.geckox.e.i;
import com.bytedance.geckox.e.j;
import com.bytedance.geckox.e.k;
import com.bytedance.geckox.e.m;
import com.bytedance.geckox.e.n;
import com.bytedance.geckox.e.o;
import com.bytedance.geckox.e.p;
import com.bytedance.geckox.e.q;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.f.b;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CheckRequestParamModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.v4.model.V4DeploymentModel;
import com.bytedance.geckox.policy.v4.model.V4RequestModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.q.c;
import com.bytedance.q.e;
import com.bytedance.q.h;
import com.bytedance.q.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class g {
    static {
        Covode.recordClassIndex(17332);
    }

    static void a(Map<String, V4RequestModel> map, Map<String, CheckRequestParamModel> map2, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (!map2.isEmpty()) {
            Map<String, Map<String, Object>> customParam = optionCheckUpdateParams.getCustomParam();
            if (customParam == null) {
                customParam = new HashMap<>();
            }
            for (Map.Entry<String, CheckRequestParamModel> entry : map2.entrySet()) {
                String key = entry.getKey();
                CheckRequestParamModel value = entry.getValue();
                Map<String, Object> map3 = customParam.get(key);
                V4RequestModel v4RequestModel = new V4RequestModel(new HashMap(), new V4DeploymentModel());
                if (map3 != null) {
                    v4RequestModel.getCustom().putAll(map3);
                }
                map.put(key, v4RequestModel);
                List<CheckRequestBodyModel.TargetChannel> targetChannels = value.getTargetChannels();
                List<CheckRequestBodyModel.TargetChannel> targetChannels2 = v4RequestModel.getDeployment().getTargetChannels();
                if (targetChannels != null && !targetChannels.isEmpty()) {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : targetChannels) {
                        Iterator<CheckRequestBodyModel.TargetChannel> it = targetChannels2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().channelName.equals(targetChannel.channelName)) {
                                    break;
                                }
                            } else {
                                targetChannels2.add(targetChannel);
                                break;
                            }
                        }
                    }
                }
                List<V4DeploymentModel.a> groupName = v4RequestModel.getDeployment().getGroupName();
                if (targetChannels2.isEmpty()) {
                    String group = value.getGroup();
                    if (!TextUtils.isEmpty(group) && !"default".equals(group)) {
                        Iterator<V4DeploymentModel.a> it2 = groupName.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (it2.next().f30025a.equals(group)) {
                                    break;
                                }
                            } else {
                                groupName.add(new V4DeploymentModel.a(group));
                                break;
                            }
                        }
                    }
                    if (groupName.isEmpty()) {
                        throw new RuntimeException("group can not be default or empty!");
                    }
                }
            }
        }
    }

    public static List<h> a() {
        ArrayList arrayList = new ArrayList();
        h.a a2 = new h.a().a(com.bytedance.geckox.e.g.class);
        a2.f42380b = b.a(com.bytedance.geckox.e.g.class);
        arrayList.add(a2.a());
        return arrayList;
    }

    public static com.bytedance.q.b<List<UpdatePackage>> a(e eVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        List<h> a2 = a();
        a2.addAll(b(eVar, optionCheckUpdateParams));
        return c.a(a2);
    }

    private static h c(e eVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        l.b bVar = new l.b();
        bVar.a("patch").a(a(eVar, optionCheckUpdateParams, true));
        bVar.a("full").a(a(eVar, optionCheckUpdateParams, false));
        return bVar.a(d.class);
    }

    public static List<h> b(e eVar, OptionCheckUpdateParams optionCheckUpdateParams) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        a listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        h.a a2 = new h.a().a(com.bytedance.geckox.e.l.class);
        a2.f42381c = new Object[]{eVar.f29783b, optionCheckUpdateParams};
        arrayList.add(a2.a());
        h.a a3 = new h.a().a(m.class);
        a3.f42381c = new Object[]{listener};
        arrayList.add(a3.a());
        l.b bVar = new l.b();
        bVar.f42387a = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.a(listener), b.a(com.bytedance.geckox.e.c.class));
        bVar.a("branch_zip").a(a(eVar, optionCheckUpdateParams, 0)).a(new h.a().a(com.bytedance.q.g.class).a());
        bVar.a("branch_single_file").a(a(eVar, optionCheckUpdateParams, 1)).a(new h.a().a(com.bytedance.q.g.class).a());
        bVar.a("branch_zstd").a(c(eVar, optionCheckUpdateParams)).a(new h.a().a(com.bytedance.q.g.class).a());
        arrayList.add(bVar.a(com.bytedance.geckox.e.c.class));
        h.a a4 = new h.a().a(p.class);
        a4.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.b(listener), b.a(p.class));
        arrayList.add(a4.a());
        return arrayList;
    }

    private static h a(e eVar, OptionCheckUpdateParams optionCheckUpdateParams, int i2) {
        l.b bVar = new l.b();
        bVar.a("patch").a(a(eVar, i2, optionCheckUpdateParams, true));
        bVar.a("full").a(a(eVar, i2, optionCheckUpdateParams, false));
        return bVar.a(d.class);
    }

    private static List<h> a(e eVar, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        a listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        h.a a2 = new h.a().a(o.class);
        a2.f42381c = new Object[]{Boolean.valueOf(optionCheckUpdateParams.isEnableDownloadAutoRetry())};
        a2.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.e(listener), b.a(o.class));
        arrayList.add(a2.a());
        h.a a3 = new h.a().a(com.bytedance.geckox.e.b.class);
        a3.f42381c = new Object[]{eVar, listener};
        a3.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.f(listener), b.a(com.bytedance.geckox.e.b.class));
        arrayList.add(a3.a());
        h.a a4 = new h.a().a(com.bytedance.geckox.e.a.a.class);
        a4.f42381c = new Object[]{eVar};
        a4.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.d(listener), b.a(com.bytedance.geckox.e.a.a.class));
        arrayList.add(a4.a());
        if (z) {
            h.a a5 = new h.a().a(com.bytedance.geckox.e.a.b.class);
            a5.f42381c = new Object[0];
            a5.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.d(listener), b.a(com.bytedance.geckox.e.a.b.class));
            arrayList.add(a5.a());
        } else {
            h.a a6 = new h.a().a(q.class);
            a6.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.d(listener), b.a(q.class));
            arrayList.add(a6.a());
        }
        h.a a7 = new h.a().a(n.class);
        a7.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.c(listener), b.a(n.class));
        arrayList.add(a7.a());
        return arrayList;
    }

    public static com.bytedance.q.b<Object> a(e eVar, List<GlobalConfigSettings.SyncItem> list, OptionCheckUpdateParams optionCheckUpdateParams, e eVar2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (GlobalConfigSettings.SyncItem syncItem : list) {
            String accessKey = syncItem.getAccessKey();
            ArrayList arrayList = new ArrayList();
            if (syncItem.getGroup() != null) {
                for (String str : syncItem.getGroup()) {
                    arrayList.add(new V4DeploymentModel.a(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            if (syncItem.getTarget() != null) {
                for (String str2 : syncItem.getTarget()) {
                    arrayList2.add(new CheckRequestBodyModel.TargetChannel(str2));
                }
            }
            V4RequestModel v4RequestModel = new V4RequestModel(new HashMap(), new V4DeploymentModel(arrayList, arrayList2));
            concurrentHashMap.put(accessKey, v4RequestModel);
            Map<String, OptionCheckUpdateParams.CustomValue> map = f.a().f29843b.get(accessKey);
            if (map != null && !map.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, OptionCheckUpdateParams.CustomValue> entry : map.entrySet()) {
                    hashMap.put(entry.getKey(), entry.getValue().getValue());
                }
                v4RequestModel.getCustom().putAll(hashMap);
            }
        }
        return a(eVar, concurrentHashMap, optionCheckUpdateParams, eVar2);
    }

    public static com.bytedance.q.b<Object> a(e eVar, Map<String, V4RequestModel> map, OptionCheckUpdateParams optionCheckUpdateParams, e eVar2) {
        if (optionCheckUpdateParams == null) {
            optionCheckUpdateParams = new OptionCheckUpdateParams();
        }
        a listener = optionCheckUpdateParams.getListener();
        List<h> a2 = a();
        h.a a3 = new h.a().a(i.class);
        a3.f42381c = new Object[]{Boolean.valueOf(optionCheckUpdateParams.getInnerRequestByUser())};
        a2.add(a3.a());
        h.a a4 = new h.a().a(f.class);
        a4.f42381c = new Object[]{eVar, map, listener, optionCheckUpdateParams, eVar2};
        a4.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.a(f.class, listener), b.a(f.class));
        a2.add(a4.a());
        if (!optionCheckUpdateParams.getInnerRequestByUser()) {
            a2.add(new h.a().a(com.bytedance.geckox.e.h.class).a());
        }
        a2.add(new h.a().a(k.class).a());
        a2.addAll(b(eVar, optionCheckUpdateParams));
        return c.a(a2);
    }

    private static List<h> a(e eVar, int i2, OptionCheckUpdateParams optionCheckUpdateParams, boolean z) {
        a listener = optionCheckUpdateParams.getListener();
        ArrayList arrayList = new ArrayList();
        h.a a2 = new h.a().a(o.class);
        a2.f42381c = new Object[]{Boolean.valueOf(optionCheckUpdateParams.isEnableDownloadAutoRetry())};
        a2.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.e(listener), b.a(o.class));
        arrayList.add(a2.a());
        h.a a3 = new h.a().a(com.bytedance.geckox.e.b.class);
        a3.f42381c = new Object[]{eVar, listener};
        a3.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.f(listener), b.a(com.bytedance.geckox.e.b.class));
        arrayList.add(a3.a());
        if (z) {
            h.a a4 = new h.a().a(j.class);
            a4.f42381c = new Object[]{eVar};
            a4.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.d(listener), b.a(j.class));
            arrayList.add(a4.a());
        }
        if (i2 == 0) {
            h.a a5 = new h.a().a(q.class);
            a5.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.d(listener), b.a(q.class));
            arrayList.add(a5.a());
        }
        h.a a6 = new h.a().a(n.class);
        a6.f42380b = new com.bytedance.q.b.b(com.bytedance.geckox.statistic.b.c(listener), b.a(n.class));
        arrayList.add(a6.a());
        return arrayList;
    }
}
