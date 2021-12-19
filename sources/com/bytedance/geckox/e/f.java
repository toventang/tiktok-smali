package com.bytedance.geckox.e;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.e;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CombineComponentModel;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.d.b;
import com.bytedance.geckox.policy.d.c;
import com.bytedance.geckox.policy.v4.model.V4RequestModel;
import com.bytedance.geckox.utils.l;
import com.bytedance.q.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class f extends d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: a  reason: collision with root package name */
    private e f29821a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, V4RequestModel> f29822b;

    /* renamed from: j  reason: collision with root package name */
    private a f29823j;

    /* renamed from: k  reason: collision with root package name */
    private OptionCheckUpdateParams f29824k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.q.e f29825l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.geckox.statistic.model.a f29826m = new com.bytedance.geckox.statistic.model.a();
    private Map<String, String> n;
    private b o;
    private int p;

    static {
        Covode.recordClassIndex(17300);
    }

    private void a() {
        Map<String, V4RequestModel> map = this.f29822b;
        if (!(map == null || this.f29823j == null)) {
            for (Map.Entry<String, V4RequestModel> entry : map.entrySet()) {
                String key = entry.getKey();
                V4RequestModel value = entry.getValue();
                if (value.getDeployment() != null) {
                    for (CheckRequestBodyModel.TargetChannel targetChannel : value.getDeployment().getTargetChannels()) {
                        String str = targetChannel.channelName;
                        Long b2 = l.b(this.f29821a.o, key, str);
                        if (b2 != null) {
                            String a2 = l.a(this.f29821a.o, key, str, b2.longValue());
                            LocalPackageModel localPackageModel = new LocalPackageModel(key, str);
                            localPackageModel.setChannelPath(a2);
                            localPackageModel.setLatestVersion(b2.longValue());
                            this.f29823j.a(localPackageModel);
                        } else {
                            return;
                        }
                    }
                    continue;
                }
            }
        }
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        checkRequestBodyModel.setCommon(com.bytedance.geckox.f.a().c());
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = com.bytedance.geckox.f.a().f29843b;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<Pair<String, Long>>> entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Pair<String, Long> pair : entry.getValue()) {
                CheckRequestBodyModel.LocalChannel localChannel = new CheckRequestBodyModel.LocalChannel();
                localChannel.localVersion = (Long) pair.second;
                hashMap2.put(pair.first, localChannel);
            }
            hashMap.put(entry.getKey(), hashMap2);
        }
        this.f29826m.f30073a = com.bytedance.geckox.d.b.f29780a.f29781b.b(hashMap);
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (String str : this.f29822b.keySet()) {
            hashMap3.put(str, this.f29822b.get(str).getDeployment());
            HashMap hashMap5 = new HashMap();
            if (map2 != null && map2.get(str) != null && map2.get(str).get("business_version") != null) {
                hashMap5.put("business_version", map2.get(str).get("business_version").getValue());
            } else if (com.bytedance.geckox.f.a().d() != null) {
                hashMap5.put("business_version", com.bytedance.geckox.f.a().d().getAppVersion());
            } else {
                hashMap5.put("business_version", this.f29821a.f29791j);
            }
            if (this.f29822b.get(str).getCustom() != null) {
                hashMap5.putAll(this.f29822b.get(str).getCustom());
            }
            hashMap4.put(str, hashMap5);
        }
        this.f29826m.f30074b = com.bytedance.geckox.d.b.f29780a.f29781b.b(hashMap3);
        com.bytedance.geckox.i.a.a("start get server channel version, deploymentsInfo:" + this.f29826m.f30074b);
        checkRequestBodyModel.setDeployments(hashMap3);
        checkRequestBodyModel.setCustom(hashMap4);
        checkRequestBodyModel.setRequestMeta(new CheckRequestBodyModel.RequestMeta(this.p));
        return com.bytedance.geckox.d.b.f29780a.f29781b.b(checkRequestBodyModel);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        boolean z = false;
        this.f29821a = (e) objArr[0];
        this.f29822b = (Map) objArr[1];
        this.f29823j = (a) objArr[2];
        this.f29824k = (OptionCheckUpdateParams) objArr[3];
        this.f29825l = (com.bytedance.q.e) objArr[4];
        this.p = ((Integer) this.f42374h.a("req_type")).intValue();
        Map<String, V4RequestModel> map = this.f29822b;
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* class com.bytedance.geckox.utils.b.AnonymousClass4 */

            static {
                Covode.recordClassIndex(17488);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        for (String str : map.keySet()) {
            V4RequestModel v4RequestModel = map.get(str);
            treeMap.put(str, com.bytedance.geckox.utils.b.c(v4RequestModel.getDeployment().getGroupName()) + "-" + com.bytedance.geckox.utils.b.a(v4RequestModel.getDeployment().getTargetChannels()));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : treeMap.keySet()) {
            stringBuffer.append(str2).append("-").append((String) treeMap.get(str2));
        }
        String stringBuffer2 = stringBuffer.toString();
        this.n = com.bytedance.geckox.f.a().f29842a;
        b bVar = new b();
        bVar.f29972b = new com.bytedance.geckox.policy.d.a(this.p, this.f29826m);
        if (this.p == 2) {
            z = true;
        }
        bVar.f29973c = new c(z, this.f29824k.isEnableRetry(), stringBuffer2, new a(this.f29821a.f29784c, this.f42374h));
        this.o = bVar;
        if (this.f29824k.getInnerRequestByUser()) {
            this.o.f29971a = new com.bytedance.geckox.policy.d.d(this.f29824k.isEnableThrottle(), stringBuffer2, this.f29826m);
        }
    }

    private List<UpdatePackage> a(Map<String, List<Pair<String, Long>>> map) {
        String str;
        String str2;
        com.bytedance.geckox.k.d dVar;
        T t;
        boolean z;
        int i2 = com.bytedance.geckox.a.a().f29709g;
        if (i2 > 0) {
            str = "/gecko/server/v5/package";
        } else {
            str = "/gecko/server/v4/package";
        }
        String str3 = "https://" + this.f29821a.f29793l + str;
        try {
            this.f29826m.f30079g = this.p;
            com.bytedance.geckox.statistic.model.a aVar = this.f29826m;
            if (i2 > 0) {
                str2 = "update_v5";
            } else {
                str2 = "update_v4";
            }
            aVar.f30083k = str2;
            int i3 = com.bytedance.geckox.a.a().f29708f;
            if (i3 <= 0 || ((float) i3) <= com.bytedance.geckox.utils.a.a()) {
                String b2 = b(map);
                this.o.a();
                com.bytedance.geckox.k.c cVar = this.f29821a.f29786e;
                GeckoGlobalConfig d2 = com.bytedance.geckox.f.a().d();
                if (d2 != null) {
                    com.bytedance.geckox.k.c netWork = d2.getNetWork();
                    if (netWork instanceof com.bytedance.geckox.k.b) {
                        com.bytedance.geckox.k.b bVar = (com.bytedance.geckox.k.b) netWork;
                        GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = d2.getRequestTagHeaderProvider();
                        HashMap hashMap = new HashMap();
                        if (requestTagHeaderProvider != null) {
                            if (!this.f29824k.getInnerRequestByUser()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Pair<String, String> requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(z);
                            if (requestTagHeader != null) {
                                hashMap.put(requestTagHeader.first, requestTagHeader.second);
                            }
                        }
                        dVar = bVar.a();
                    } else {
                        dVar = netWork.a(str3, b2);
                    }
                } else {
                    dVar = cVar.a(str3, b2);
                }
                this.f29826m.f30078f = dVar.f29923c;
                this.f29826m.f30076d = dVar.f29924d;
                this.f29826m.f30077e = com.bytedance.geckox.statistic.model.a.a(dVar.f29921a);
                if (dVar.f29923c == 200) {
                    this.o.b();
                    String str4 = dVar.f29922b;
                    com.bytedance.geckox.i.a.a("response,logId:", this.f29826m.f30077e);
                    try {
                        Response response = (Response) com.bytedance.geckox.d.b.f29780a.f29781b.a(str4, new com.google.gson.b.a<Response<CombineComponentModel>>() {
                            /* class com.bytedance.geckox.e.f.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(17301);
                            }
                        }.type);
                        if (!(this.f29825l == null || (t = response.data) == null)) {
                            this.f29825l.a(t.getGlobalConfig().getCheckUpdate());
                        }
                        if (response.status == 0) {
                            if (response.data != null) {
                                com.bytedance.geckox.b.a.a(this.p, response.data.getUniversalStrategies(), this.n, this.f29823j);
                                List<UpdatePackage> packages = response.data.getPackages();
                                if (packages == null || packages.isEmpty()) {
                                    a();
                                    return new ArrayList();
                                }
                                for (UpdatePackage updatePackage : packages) {
                                    updatePackage.setLocalVersion(a(map.get(updatePackage.getAccessKey()), updatePackage.getChannel()));
                                    updatePackage.setLogId(this.f29826m.f30077e);
                                    updatePackage.setApiVersion(this.f29826m.f30083k);
                                }
                                return packages;
                            }
                            this.f29826m.f30076d = "check update error：response.data==null";
                            com.bytedance.geckox.statistic.c.a(this.f29826m);
                            throw new com.bytedance.q.a.a("check update error：response.data==null");
                        } else if (response.status == 2000) {
                            a();
                            return new ArrayList();
                        } else {
                            String str5 = "check update error，unknown status code，response.status：" + response.status;
                            this.f29826m.f30076d = str5;
                            com.bytedance.geckox.statistic.c.a(this.f29826m);
                            throw new com.bytedance.q.a.a(str5);
                        }
                    } catch (Exception e2) {
                        this.f29826m.f30076d = "json parse failed：" + e2.getMessage();
                        com.bytedance.geckox.statistic.c.a(this.f29826m);
                        throw new com.bytedance.q.a.b("json parse failed：" + str4 + " caused by:" + e2.getMessage(), e2);
                    }
                } else {
                    this.o.c();
                    throw new NetworkErrorException("net work get failed, code: " + dVar.f29923c + ", url:" + str3);
                }
            } else {
                this.f29826m.f30081i = 800;
                this.f29826m.f30076d = "cancel request, not available storage";
                throw new com.bytedance.q.a.e(800, "cancel request, not available storage", new Throwable("cancel request, not available storage"));
            }
        } catch (IOException e3) {
            this.o.c();
            this.f29826m.f30076d = e3.getMessage();
            com.bytedance.geckox.statistic.c.a(this.f29826m);
            throw e3;
        } catch (com.bytedance.q.a.e e4) {
            com.bytedance.geckox.statistic.c.a(this.f29826m);
            throw e4;
        } catch (com.bytedance.q.a.c e5) {
            com.bytedance.geckox.statistic.c.a(this.f29826m);
            throw e5;
        } catch (Exception e6) {
            com.bytedance.geckox.statistic.c.a(this.f29826m);
            throw new com.bytedance.q.a.c("request failed：url:" + str3 + ", caused by:" + e6.getMessage(), e6);
        }
    }

    private static long a(List<Pair<String, Long>> list, String str) {
        if (list == null) {
            return 0;
        }
        for (Pair<String, Long> pair : list) {
            if (((String) pair.first).equals(str)) {
                return ((Long) pair.second).longValue();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public Object a(com.bytedance.q.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) {
        Object a2 = bVar.a("delay_from_launch");
        if (a2 != null) {
            long longValue = ((Long) a2).longValue();
            if (longValue != -1) {
                this.f29826m.f30084l = longValue;
            }
        }
        Object a3 = bVar.a("delay_in_queue");
        if (a3 != null) {
            this.f29826m.f30085m = ((Long) a3).longValue();
        }
        Object a4 = bVar.a("is_merged");
        if (a4 != null) {
            this.f29826m.n = ((Integer) a4).intValue();
        }
        List<UpdatePackage> a5 = a(map);
        if (a5 == null) {
            return null;
        }
        com.bytedance.geckox.statistic.c.a(this.f29826m);
        return bVar.a(a5);
    }
}
