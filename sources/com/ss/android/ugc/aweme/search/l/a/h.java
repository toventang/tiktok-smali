package com.ss.android.ugc.aweme.search.l.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.ies.ugc.aweme.network.a.e;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.search.model.d;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, i> f121359a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static i f121360b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f121361c = new h();

    /* renamed from: d  reason: collision with root package name */
    private static long f121362d;

    private h() {
    }

    static {
        Covode.recordClassIndex(79079);
    }

    public static i a(d dVar) {
        if (dVar == null) {
            return j.f121376a;
        }
        i iVar = f121359a.get(Integer.valueOf(dVar.getId()));
        if (iVar == null) {
            return j.f121376a;
        }
        return iVar;
    }

    private static void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            Object obj = jSONObject.get(keys.next());
            if (((obj instanceof Integer) && ((Number) obj).intValue() < 0) || ((obj instanceof Long) && ((Number) obj).longValue() < 0)) {
                keys.remove();
            }
        }
    }

    public static void b(d dVar) {
        Map<Integer, i> map;
        i iVar;
        e.a aVar;
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        i.a aVar2;
        String str2;
        i.a aVar3;
        String str3;
        i.a aVar4;
        String str4;
        i.a aVar5;
        String str5;
        i.a aVar6;
        String str6;
        i.a aVar7;
        String str7;
        i.a aVar8;
        String str8;
        if (dVar != null && (iVar = (map = f121359a).get(Integer.valueOf(dVar.getId()))) != null && iVar.f121363a != 0 && iVar.f121375m != -1) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                iVar.s = (int) (currentTimeMillis - iVar.f121363a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tab_type", iVar.u);
                jSONObject.put("trigger_type", iVar.f121364b);
                jSONObject.put("itemCount", iVar.f121371i);
                jSONObject.put("cost", iVar.s);
                jSONObject.put("netLogId", iVar.f121374l);
                jSONObject.put("status", iVar.f121375m);
                jSONObject.put("errorMsg", iVar.n);
                jSONObject.put("errorCode", iVar.o);
                jSONObject.put("tick_search_start", iVar.f121363a);
                int i2 = 0;
                if (iVar.f121370h != null) {
                    g gVar = iVar.f121370h;
                    if (gVar == null) {
                        l.b();
                    }
                    i requestLog = gVar.getRequestLog();
                    if (requestLog != null) {
                        i.b bVar = requestLog.f66616a;
                        if (bVar != null) {
                            str = bVar.f66626a;
                        } else {
                            str = null;
                        }
                        jSONObject.put("libcore", str);
                        i.c cVar = requestLog.f66617b;
                        if (cVar == null || (aVar8 = cVar.f66627a) == null || (str8 = aVar8.f66618a) == null) {
                            num = null;
                        } else {
                            num = Integer.valueOf(Integer.parseInt(str8));
                        }
                        jSONObject.put("body_recv", num);
                        i.c cVar2 = requestLog.f66617b;
                        if (cVar2 == null || (aVar7 = cVar2.f66627a) == null || (str7 = aVar7.f66619b) == null) {
                            num2 = null;
                        } else {
                            num2 = Integer.valueOf(Integer.parseInt(str7));
                        }
                        jSONObject.put("dns", num2);
                        i.c cVar3 = requestLog.f66617b;
                        if (cVar3 == null || (aVar6 = cVar3.f66627a) == null || (str6 = aVar6.f66620c) == null) {
                            num3 = null;
                        } else {
                            num3 = Integer.valueOf(Integer.parseInt(str6));
                        }
                        jSONObject.put("inner", num3);
                        i.c cVar4 = requestLog.f66617b;
                        if (cVar4 == null || (aVar5 = cVar4.f66627a) == null || (str5 = aVar5.f66621d) == null) {
                            num4 = null;
                        } else {
                            num4 = Integer.valueOf(Integer.parseInt(str5));
                        }
                        jSONObject.put("rtt", num4);
                        i.c cVar5 = requestLog.f66617b;
                        if (cVar5 == null || (aVar4 = cVar5.f66627a) == null || (str4 = aVar4.f66622e) == null) {
                            num5 = null;
                        } else {
                            num5 = Integer.valueOf(Integer.parseInt(str4));
                        }
                        jSONObject.put("send", num5);
                        i.c cVar6 = requestLog.f66617b;
                        if (cVar6 == null || (aVar3 = cVar6.f66627a) == null || (str3 = aVar3.f66624g) == null) {
                            num6 = null;
                        } else {
                            num6 = Integer.valueOf(Integer.parseInt(str3));
                        }
                        jSONObject.put("tcp", num6);
                        i.c cVar7 = requestLog.f66617b;
                        if (cVar7 == null || (aVar2 = cVar7.f66627a) == null || (str2 = aVar2.f66625h) == null) {
                            num7 = null;
                        } else {
                            num7 = Integer.valueOf(Integer.parseInt(str2));
                        }
                        jSONObject.put("ttfb", num7);
                    }
                    g gVar2 = iVar.f121370h;
                    if (gVar2 == null) {
                        l.b();
                    }
                    a requestInfo = gVar2.getRequestInfo();
                    if (requestInfo != null) {
                        if (requestInfo.r > 0) {
                            jSONObject.put("timing_total", requestInfo.r);
                            jSONObject.put("requestStart", requestInfo.f28917e);
                            jSONObject.put("appLevelRequestStart", requestInfo.f28915c);
                            int optInt = jSONObject.optInt("inner");
                            if (optInt > 0) {
                                jSONObject.put("timing_net", requestInfo.r - ((long) optInt));
                            }
                        }
                        e eVar = iVar.r;
                        if (eVar != null) {
                            List<e.a> a2 = eVar.a();
                            if (iVar.f121373k == 1 && a2.size() >= 2) {
                                aVar = a2.get(1);
                            } else if (iVar.f121373k == 0 && a2.size() >= 3) {
                                aVar = a2.get(2);
                            } else if (iVar.f121373k != -1 || a2.size() <= 0) {
                                l.b(a2, "");
                                if (!a2.isEmpty()) {
                                    aVar = a2.get(a2.size() - 1);
                                }
                            } else {
                                aVar = a2.get(0);
                            }
                            if (aVar != null) {
                                int i3 = ((int) (aVar.f35002c - requestInfo.f28917e)) + aVar.f35001b;
                                int i4 = (((int) (aVar.f35003d - aVar.f35002c)) - aVar.f35001b) - aVar.f35000a;
                                int i5 = aVar.f35000a + i4;
                                if (i3 > 0) {
                                    jSONObject.put("timing_total", i3);
                                    jSONObject.put("client_cost", iVar.s - i3);
                                }
                                if (i5 > 0) {
                                    jSONObject.put("timing_gap_end", i5);
                                }
                                if (i4 > 0) {
                                    jSONObject.put("chunk_data_parsing_cost", i4);
                                }
                            }
                        }
                        if (iVar.f121375m == 2) {
                            jSONObject.put("cancel_search_time", iVar.s);
                        }
                        jSONObject.put("view_draw_cost", currentTimeMillis - iVar.f121365c);
                    }
                }
                a(jSONObject);
                jSONObject.put("is_first_search", iVar.p);
                iVar.e();
                jSONObject.put("chunk_data_reading_cost", iVar.f121372j);
                jSONObject.put("hit_chunk_cache", iVar.f121373k);
                if (com.ss.android.ugc.aweme.performance.i.a()) {
                    i2 = 1;
                }
                jSONObject.put("is_poor_performance", i2);
                jSONObject.put("keyword", dVar.getKeyword());
                jSONObject.put("cursor", iVar.v);
                jSONObject.put("network_type", iVar.f121369g);
                com.ss.android.common.c.a.a("search_trigger_refresh_monitor_v2", jSONObject);
                jSONObject.put("native_user_on_bind_view_holder_cost", iVar.q);
                iVar.w = true;
                map.remove(Integer.valueOf(dVar.getId()));
                f121360b = null;
            } catch (Exception e2) {
                e2.printStackTrace();
                iVar.w = true;
                f121359a.remove(Integer.valueOf(dVar.getId()));
                f121360b = null;
            } catch (Throwable th) {
                iVar.w = true;
                f121359a.remove(Integer.valueOf(dVar.getId()));
                f121360b = null;
                throw th;
            }
        }
    }

    public static i a(int i2, d dVar) {
        l.d(dVar, "");
        long currentTimeMillis = System.currentTimeMillis();
        f121362d = currentTimeMillis;
        if (currentTimeMillis - f121362d < 1000) {
            return null;
        }
        d copy = dVar.copy();
        l.b(copy, "");
        i iVar = new i(copy);
        iVar.f121363a = currentTimeMillis;
        iVar.f121364b = i2;
        f121359a.put(Integer.valueOf(copy.getId()), iVar);
        f121360b = iVar;
        return iVar;
    }
}
