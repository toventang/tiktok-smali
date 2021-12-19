package com.bytedance.geckox.e;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.f;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.CombineComponentModel;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.d.b;
import com.bytedance.geckox.policy.d.c;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.geckox.policy.loop.model.LoopRequestModel;
import com.bytedance.q.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class e extends d<Map<String, List<Pair<String, Long>>>, List<UpdatePackage>> {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.geckox.e f29814a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, LoopRequestModel> f29815b;

    /* renamed from: j  reason: collision with root package name */
    private LoopInterval.a f29816j;

    /* renamed from: k  reason: collision with root package name */
    private a f29817k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.q.e f29818l;

    /* renamed from: m  reason: collision with root package name */
    private com.bytedance.geckox.statistic.model.a f29819m = new com.bytedance.geckox.statistic.model.a();
    private Map<String, String> n;
    private b o;
    private int p;

    static {
        Covode.recordClassIndex(17298);
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        boolean z = false;
        this.f29814a = (com.bytedance.geckox.e) objArr[0];
        Map<String, LoopRequestModel> map = (Map) objArr[1];
        this.f29815b = map;
        this.f29816j = (LoopInterval.a) objArr[2];
        this.f29817k = (a) objArr[3];
        this.f29818l = (com.bytedance.q.e) objArr[4];
        TreeMap treeMap = new TreeMap(new Comparator<String>() {
            /* class com.bytedance.geckox.utils.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17487);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        for (String str : map.keySet()) {
            LoopRequestModel loopRequestModel = map.get(str);
            treeMap.put(str, com.bytedance.geckox.utils.b.b(loopRequestModel.getDeployment().getGroupName()) + "-" + com.bytedance.geckox.utils.b.a(loopRequestModel.getDeployment().getTargetChannels()));
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : treeMap.keySet()) {
            stringBuffer.append(str2).append("-").append((String) treeMap.get(str2));
        }
        String stringBuffer2 = stringBuffer.toString();
        this.p = ((Integer) this.f42374h.a("req_type")).intValue();
        this.n = f.a().f29842a;
        b bVar = new b();
        if (this.p == 2) {
            z = true;
        }
        bVar.f29973c = new c(z, true, stringBuffer2, new a(this.f29814a.f29784c, this.f42374h));
        bVar.f29972b = new com.bytedance.geckox.policy.d.a(this.p, this.f29819m);
        this.o = bVar;
    }

    private String b(Map<String, List<Pair<String, Long>>> map) {
        CheckRequestBodyModel checkRequestBodyModel = new CheckRequestBodyModel();
        checkRequestBodyModel.setCommon(f.a().c());
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = f.a().f29843b;
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
        this.f29819m.f30073a = com.bytedance.geckox.d.b.f29780a.f29781b.b(hashMap);
        checkRequestBodyModel.setLocal(hashMap);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        for (String str : this.f29815b.keySet()) {
            hashMap3.put(str, this.f29815b.get(str).getDeployment());
            HashMap hashMap5 = new HashMap();
            if (map2 != null && map2.get(str) != null && map2.get(str).get("business_version") != null) {
                hashMap5.put("business_version", map2.get(str).get("business_version").getValue());
            } else if (f.a().d() != null) {
                hashMap5.put("business_version", f.a().d().getAppVersion());
            } else {
                hashMap5.put("business_version", this.f29814a.f29791j);
            }
            if (this.f29815b.get(str).getCustom() != null) {
                hashMap5.putAll(this.f29815b.get(str).getCustom());
            }
            hashMap4.put(str, hashMap5);
        }
        this.f29819m.f30075c = com.bytedance.geckox.d.b.f29780a.f29781b.b(hashMap4);
        checkRequestBodyModel.setCustom(hashMap4);
        this.f29819m.f30074b = com.bytedance.geckox.d.b.f29780a.f29781b.b(hashMap3);
        com.bytedance.geckox.i.a.a("start get server channel version, deploymentsInfo:" + this.f29819m.f30074b);
        checkRequestBodyModel.setDeployments(hashMap3);
        CheckRequestBodyModel.RequestMeta requestMeta = new CheckRequestBodyModel.RequestMeta(this.p);
        LoopInterval.a aVar = this.f29816j;
        if (aVar != null) {
            requestMeta.setCombineLevel(aVar.name());
        }
        checkRequestBodyModel.setRequestMeta(requestMeta);
        return com.bytedance.geckox.d.b.f29780a.f29781b.b(checkRequestBodyModel);
    }

    private List<UpdatePackage> a(Map<String, List<Pair<String, Long>>> map) {
        String str;
        String str2;
        com.bytedance.geckox.k.d dVar;
        T t;
        Pair<String, String> requestTagHeader;
        int i2 = com.bytedance.geckox.a.a().f29709g;
        if (i2 > 0) {
            str = "/gecko/server/v2/combine/check";
        } else {
            str = "/gecko/server/combine/check";
        }
        String str3 = "https://" + this.f29814a.f29793l + str;
        try {
            this.f29819m.f30079g = this.p;
            com.bytedance.geckox.statistic.model.a aVar = this.f29819m;
            if (i2 > 0) {
                str2 = "combine_v2";
            } else {
                str2 = "combine_v1";
            }
            aVar.f30083k = str2;
            String b2 = b(map);
            this.o.a();
            com.bytedance.geckox.k.c cVar = this.f29814a.f29786e;
            GeckoGlobalConfig d2 = f.a().d();
            if (d2 != null) {
                com.bytedance.geckox.k.c netWork = d2.getNetWork();
                if (netWork instanceof com.bytedance.geckox.k.b) {
                    com.bytedance.geckox.k.b bVar = (com.bytedance.geckox.k.b) netWork;
                    GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = d2.getRequestTagHeaderProvider();
                    HashMap hashMap = new HashMap();
                    if (!(requestTagHeaderProvider == null || (requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(true)) == null)) {
                        hashMap.put(requestTagHeader.first, requestTagHeader.second);
                    }
                    dVar = bVar.a();
                } else {
                    dVar = netWork.a(str3, b2);
                }
            } else {
                dVar = cVar.a(str3, b2);
            }
            this.f29819m.f30078f = dVar.f29923c;
            this.f29819m.f30076d = dVar.f29924d;
            this.f29819m.f30077e = com.bytedance.geckox.statistic.model.a.a(dVar.f29921a);
            if (dVar.f29923c == 200) {
                this.o.b();
                String str4 = dVar.f29922b;
                com.bytedance.geckox.i.a.a("response,logId:", this.f29819m.f30077e);
                try {
                    Response response = (Response) com.bytedance.geckox.d.b.f29780a.f29781b.a(str4, new com.google.gson.b.a<Response<CombineComponentModel>>() {
                        /* class com.bytedance.geckox.e.e.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(17299);
                        }
                    }.type);
                    if (!(this.f29818l == null || (t = response.data) == null)) {
                        this.f29818l.a(t.getGlobalConfig().getCheckUpdate());
                    }
                    if (response.status == 0) {
                        if (response.data != null) {
                            com.bytedance.geckox.b.a.a(this.p, response.data.getUniversalStrategies(), this.n, this.f29817k);
                            List<UpdatePackage> packages = response.data.getPackages();
                            if (packages == null || packages.isEmpty()) {
                                return new ArrayList();
                            }
                            for (UpdatePackage updatePackage : packages) {
                                updatePackage.setLocalVersion(a(map.get(updatePackage.getAccessKey()), updatePackage.getChannel()));
                                updatePackage.setLogId(this.f29819m.f30077e);
                                updatePackage.setApiVersion(this.f29819m.f30083k);
                            }
                            return packages;
                        }
                        this.f29819m.f30076d = "check update error：response.data==null";
                        com.bytedance.geckox.statistic.c.a(this.f29819m);
                        throw new com.bytedance.q.a.a("check update error：response.data==null");
                    } else if (response.status == 2000) {
                        return new ArrayList();
                    } else {
                        String str5 = "check update error，unknown status code，response.status：" + response.status;
                        this.f29819m.f30076d = str5;
                        com.bytedance.geckox.statistic.c.a(this.f29819m);
                        throw new com.bytedance.q.a.a(str5);
                    }
                } catch (Exception e2) {
                    this.f29819m.f30076d = "json parse failed：" + e2.getMessage();
                    com.bytedance.geckox.statistic.c.a(this.f29819m);
                    throw new com.bytedance.q.a.b("json parse failed：" + str4 + " caused by:" + e2.getMessage(), e2);
                }
            } else {
                this.o.c();
                throw new NetworkErrorException("net work get failed, code: " + dVar.f29923c + ", url:" + str3);
            }
        } catch (IOException e3) {
            this.o.c();
            this.f29819m.f30076d = e3.getMessage();
            com.bytedance.geckox.statistic.c.a(this.f29819m);
            throw e3;
        } catch (Exception e4) {
            com.bytedance.geckox.statistic.c.a(this.f29819m);
            throw new com.bytedance.q.a.c("request failed：url:" + str3 + ", caused by:" + e4.getMessage(), e4);
        }
    }

    /* access modifiers changed from: private */
    public Object a(com.bytedance.q.b<List<UpdatePackage>> bVar, Map<String, List<Pair<String, Long>>> map) {
        this.p = ((Integer) bVar.a("req_type")).intValue();
        List<UpdatePackage> a2 = a(map);
        if (a2 == null) {
            return null;
        }
        com.bytedance.geckox.statistic.c.a(this.f29819m);
        return bVar.a(a2);
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
}
