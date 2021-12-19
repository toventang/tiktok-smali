package com.ss.android.ugc.aweme.interest;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.journey.ah;
import com.ss.android.ugc.aweme.journey.ai;
import com.ss.android.ugc.aweme.journey.step.interestselector.f;
import com.ss.android.ugc.aweme.journey.step.interestselector.g;
import com.ss.android.ugc.aweme.journey.w;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(67166);
    }

    public static final p<List<w>, JSONArray> a(g gVar) {
        l.d(gVar, "");
        HashSet<b> hashSet = gVar.f105108b;
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (T t : hashSet) {
            String str = gVar.f105109c.get(t.f104762a).f104837a;
            String str2 = t.f104763b;
            int i3 = t.f104762a;
            int i4 = t.f104764c;
            linkedList.add(new w(str, (byte) 0));
            JSONObject jSONObject = new JSONObject();
            i2++;
            jSONObject.put("select_rank", i2);
            jSONObject.put("interest", str2);
            jSONObject.put("category", str);
            jSONObject.put("show_rank", i3 + 1);
            jSONObject.put("topic_rank", i4 + 1);
            jSONArray.put(jSONObject);
        }
        return new p<>(linkedList, jSONArray);
    }

    public static final d a(String str, boolean z) {
        l.d(str, "");
        d a2 = new d().a("is_default_interests_list", z ? 1 : 0).a("enter_from", str);
        l.b(a2, "");
        return a2;
    }

    public static final p<List<w>, JSONArray> a(com.ss.android.ugc.aweme.journey.step.interestselector.a aVar, boolean z) {
        l.d(aVar, "");
        List<Number> k2 = n.k(aVar.f105042c);
        JSONArray jSONArray = new JSONArray();
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        for (Number number : k2) {
            int intValue = number.intValue();
            w wVar = aVar.f105043d.get(intValue);
            w wVar2 = new w(wVar.f105209a, (byte) 0);
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("select_rank", i2 + 1);
            }
            jSONObject.put("show_rank", intValue + 1).put("interest", wVar.f105209a).put("category", wVar.f105209a);
            jSONArray.put(jSONObject);
            linkedList.add(wVar2);
            i2++;
        }
        return new p<>(linkedList, jSONArray);
    }

    public static final d a(String str, String str2, String str3, long j2, g gVar) {
        ai aiVar;
        List<ah> list;
        ah ahVar;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int i2 = f.f105089j;
        int i3 = 0;
        if (i2 >= 0) {
            int i4 = 0;
            while (true) {
                Integer num = f.f105090k.get(Integer.valueOf(i4));
                if (num == null) {
                    l.b();
                }
                int intValue = num.intValue();
                if (intValue >= 0) {
                    int i5 = 0;
                    while (true) {
                        if (gVar != null) {
                            List<ai> list2 = gVar.f105109c;
                            if (!(list2 == null || (aiVar = list2.get(i4)) == null || (list = aiVar.f104840d) == null || (ahVar = list.get(i5)) == null)) {
                                f.f105086c.add(ahVar.f104832a);
                            }
                        }
                        if (i5 == intValue) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
        }
        d a2 = new d().a("enter_from", str).a("stay_time", j2).a("exit_method", str2);
        if (!TextUtils.isEmpty(str3)) {
            a2.a("interests_list", str3);
        }
        LinkedHashSet<String> linkedHashSet = f.f105086c;
        StringBuilder sb = new StringBuilder();
        if (!linkedHashSet.isEmpty()) {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                if (i3 != linkedHashSet.size() - 1) {
                    sb.append(",");
                }
                i3++;
            }
            a2.a("interests_cnt", linkedHashSet.size());
            a2.a("interests_show_list", sb.toString());
        }
        Integer a3 = HybridABInfoService.b().a();
        if (a3 != null) {
            a2.a("is_ab_backend_resp_received", a3.intValue());
        }
        l.b(a2, "");
        return a2;
    }

    public static final d a(String str, String str2, String str3, long j2, com.ss.android.ugc.aweme.journey.step.interestselector.a aVar, FlexboxLayoutManager flexboxLayoutManager) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        d a2 = new d().a("enter_from", str).a("stay_time", j2).a("exit_method", str2);
        if (!TextUtils.isEmpty(str3)) {
            a2.a("interests_list", str3);
        }
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            if (flexboxLayoutManager == null) {
                l.b();
            }
            int C = flexboxLayoutManager.C() - 1;
            int i2 = 0;
            if (C >= 0) {
                while (true) {
                    sb.append(aVar.f105043d.get(i2).f105209a);
                    if (i2 != C) {
                        sb.append(",");
                    }
                    if (i2 == C) {
                        break;
                    }
                    i2++;
                }
            }
            a2.a("interests_cnt", C + 1);
            a2.a("interests_show_list", sb.toString());
        }
        Integer a3 = HybridABInfoService.b().a();
        if (a3 != null) {
            a2.a("is_ab_backend_resp_received", a3.intValue());
        }
        l.b(a2, "");
        return a2;
    }
}
