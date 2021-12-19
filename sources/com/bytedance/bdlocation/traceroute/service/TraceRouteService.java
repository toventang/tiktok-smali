package com.bytedance.bdlocation.traceroute.service;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdlocation.traceroute.TraceRoute;
import com.bytedance.bdlocation.traceroute.c;
import com.bytedance.bdlocation.traceroute.c.b;
import com.bytedance.bdlocation.traceroute.d.a;
import com.bytedance.bdlocation.traceroute.data.HopData;
import com.bytedance.bdlocation.traceroute.data.HopInfo;
import com.bytedance.bdlocation.traceroute.data.TraceEntity;
import com.bytedance.bdlocation.traceroute.data.TracerouteInfo;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

public class TraceRouteService {
    private static Object object = new Object();
    public List<HopData> hopDataList = new ArrayList();
    public List<HopInfo> hopInfoList;
    public Context mContext;
    public TracerouteInfo tracerouteInfo;
    public List<TracerouteInfo> tracerouteInfoList;

    static {
        Covode.recordClassIndex(15505);
    }

    public static ExecutorService com_bytedance_bdlocation_traceroute_service_TraceRouteService_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor() {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        return g.a(a2.a());
    }

    public void resetHopDataList() {
        List<HopData> list = this.hopDataList;
        if (list != null && list.size() > 1) {
            for (int i2 = 0; i2 < this.hopDataList.size() - 1; i2++) {
                for (int size = this.hopDataList.size() - 1; size > i2; size--) {
                    if (this.hopDataList.get(size).getIp().equals(this.hopDataList.get(i2).getIp())) {
                        this.hopDataList.get(i2).getCost().add(this.hopDataList.get(size).getCost().get(0));
                        this.hopDataList.remove(size);
                    }
                }
            }
        }
    }

    private void startTraceRoute(a aVar) {
        execute(this.mContext, aVar.f26367f, aVar.f26365d, aVar.f26366e);
    }

    private void executeTraceRouteInterval(a aVar) {
        if (aVar == null) {
            try {
                b.e();
            } catch (Exception unused) {
                b.e();
            }
        } else {
            boolean z = aVar.f26362a;
            "traceroute server enable is:".concat(String.valueOf(z));
            b.e();
            if (z) {
                int i2 = aVar.f26364c;
                long j2 = com.bytedance.bdlocation.traceroute.a.a.a(this.mContext).f26356a.getLong("trace_router_interval", 0);
                b.e();
                if ((System.currentTimeMillis() / 1000) - j2 < ((long) i2)) {
                    b.e();
                    return;
                }
                double d2 = aVar.f26363b;
                if (d2 >= 1.0d) {
                    startTraceRoute(aVar);
                    return;
                }
                b.e();
                if (((double) (com.bytedance.bdlocation.traceroute.f.a.f26373a.nextInt(99999) + 1)) <= d2 * 100000.0d) {
                    startTraceRoute(aVar);
                }
            }
        }
    }

    private void initConfig(JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("is_debug", false);
        if (optBoolean) {
            b.f26360a.f26359a = true;
        }
        com.bytedance.bdlocation.traceroute.a.f26350b = optBoolean;
        String optString = jSONObject.optString("base_url");
        if (TextUtils.isEmpty(optString) || optString.contains("https") || com.bytedance.bdlocation.traceroute.a.f26350b) {
            com.bytedance.bdlocation.traceroute.a.f26349a = optString;
            com.bytedance.bdlocation.traceroute.a.f26351c = jSONObject.optBoolean("is_privacy_confirmed");
            com.bytedance.bdlocation.traceroute.a.f26352d = jSONObject.optBoolean("is_inner");
            com.bytedance.bdlocation.traceroute.a.f26353e = jSONObject.optBoolean("x-use-boe");
            return;
        }
        throw new IllegalArgumentException("need fix host is https");
    }

    public void executeTraceRoute(Context context, String str, JSONObject jSONObject) {
        this.mContext = context;
        try {
            initConfig(jSONObject);
            executeTraceRouteInterval((a) new f().a(str, a.class));
        } catch (Exception e2) {
            e2.getMessage();
            b.e();
        }
    }

    public void execute(final Context context, final ArrayList<String> arrayList, final int i2, final int i3) {
        com_bytedance_bdlocation_traceroute_service_TraceRouteService_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newSingleThreadExecutor().execute(new Runnable() {
            /* class com.bytedance.bdlocation.traceroute.service.TraceRouteService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15506);
            }

            public final void run() {
                com.bytedance.bdlocation.traceroute.e.a aVar;
                if (i2 == 0 || i3 == 0) {
                    b.e();
                    return;
                }
                ArrayList arrayList = arrayList;
                if (arrayList == null || arrayList.size() <= 0) {
                    b.e();
                    return;
                }
                try {
                    TraceEntity traceEntity = new TraceEntity();
                    TraceRouteService.this.tracerouteInfoList = new ArrayList();
                    traceEntity.setTracerouteInfo(TraceRouteService.this.tracerouteInfoList);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        TraceRouteService.this.doTraceRoute(context, (String) it.next(), i2, i3);
                    }
                    String b2 = new f().b(traceEntity);
                    Context context = TraceRouteService.this.mContext;
                    if (!com.bytedance.bdlocation.traceroute.a.f26351c) {
                        b.a();
                    } else if (b2 == null) {
                        b.a();
                    } else if (com.bytedance.bdlocation.traceroute.a.f26352d) {
                        "upload request".concat(String.valueOf(b2));
                        b.d();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("report", com.bytedance.bdlocation.traceroute.internet.a.b(b2));
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("sdk_version", "1.5.6-alpha.2.4-bugfix");
                        String a2 = com.bytedance.bdlocation.traceroute.internet.a.a("/location/report/", linkedHashMap, linkedHashMap2);
                        "upload result:".concat(String.valueOf(a2));
                        b.d();
                        if (!TextUtils.isEmpty(a2) && (aVar = (com.bytedance.bdlocation.traceroute.e.a) new f().a(a2, com.bytedance.bdlocation.traceroute.e.a.class)) != null && aVar.f26370c == 0) {
                            com.bytedance.bdlocation.traceroute.internet.a.a(context);
                        }
                    } else {
                        String a3 = com.bytedance.bdlocation.traceroute.internet.a.a(b2);
                        "setOuterTraceRouterCache upload result:".concat(String.valueOf(a3));
                        b.d();
                        if (!TextUtils.isEmpty(a3)) {
                            try {
                                com.bytedance.bdlocation.traceroute.e.a aVar2 = (com.bytedance.bdlocation.traceroute.e.a) new f().a(a3, com.bytedance.bdlocation.traceroute.e.a.class);
                                if (aVar2 != null && aVar2.f26368a == 0) {
                                    com.bytedance.bdlocation.traceroute.internet.a.a(context);
                                }
                            } catch (Exception e2) {
                                e2.getMessage();
                                b.f();
                            }
                        }
                    }
                } catch (Exception unused) {
                    b.d();
                }
                b.d();
            }
        });
    }

    public void doTraceRoute(final Context context, String str, int i2, final int i3) {
        MethodCollector.i(2226);
        synchronized (object) {
            try {
                b.e();
                TraceRoute a2 = TraceRoute.a();
                a2.f26347b = i2;
                a2.f26348c = i3;
                a2.f26346a = new com.bytedance.bdlocation.traceroute.b() {
                    /* class com.bytedance.bdlocation.traceroute.service.TraceRouteService.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15507);
                    }

                    @Override // com.bytedance.bdlocation.traceroute.b
                    public final void a(c cVar) {
                        b.e();
                    }

                    @Override // com.bytedance.bdlocation.traceroute.b
                    public final void a(String str) {
                        double d2;
                        "traceroute update:".concat(String.valueOf(str));
                        b.e();
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                String[] split = str.split(",");
                                if (split != null && split.length > 0) {
                                    if (split[0].equals("header")) {
                                        TraceRouteService.this.hopInfoList = new ArrayList();
                                        String str2 = split[1];
                                        String str3 = "traceroute to " + str2 + "(" + split[2] + ")," + split[3] + " hops max," + split[4] + " byte packets";
                                        TraceRouteService.this.tracerouteInfo = new TracerouteInfo();
                                        TraceRouteService.this.tracerouteInfo.setDomain(str2);
                                        TraceRouteService.this.tracerouteInfo.setTimestamp(System.currentTimeMillis());
                                        Context context = context;
                                        if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
                                            j.f107224c = com.bytedance.common.utility.l.d(context);
                                        }
                                        TraceRouteService.this.tracerouteInfo.setNetworkType(com.bytedance.common.utility.l.a(j.f107224c));
                                        TraceRouteService.this.tracerouteInfo.setExecInfo(str3);
                                        TraceRouteService.this.tracerouteInfo.setHopInfo(TraceRouteService.this.hopInfoList);
                                        TraceRouteService.this.tracerouteInfoList.add(TraceRouteService.this.tracerouteInfo);
                                    }
                                    if (split[0].equals("hop")) {
                                        int parseInt = Integer.parseInt(split[1]);
                                        String str4 = split[2];
                                        String str5 = split[3];
                                        if (split[4].contains("null")) {
                                            d2 = -1.0d;
                                        } else {
                                            d2 = Double.parseDouble(split[4]);
                                        }
                                        HopData hopData = new HopData();
                                        hopData.setIp(str5);
                                        hopData.setHost(str4);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Double.valueOf(d2));
                                        hopData.setCost(arrayList);
                                        TraceRouteService.this.hopDataList.add(hopData);
                                        if (TraceRouteService.this.hopDataList.size() == i3) {
                                            TraceRouteService.this.resetHopDataList();
                                            HopInfo hopInfo = new HopInfo();
                                            hopInfo.setHop(parseInt);
                                            hopInfo.setHopData(TraceRouteService.this.hopDataList);
                                            TraceRouteService.this.hopDataList = new ArrayList();
                                            TraceRouteService.this.hopInfoList.add(hopInfo);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                                b.d();
                            }
                        }
                    }

                    @Override // com.bytedance.bdlocation.traceroute.b
                    public final void a(int i2, String str) {
                        b.e();
                    }
                };
                a2.a(str);
            } finally {
                MethodCollector.o(2226);
            }
        }
    }
}
