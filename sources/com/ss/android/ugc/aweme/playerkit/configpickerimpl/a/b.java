package com.ss.android.ugc.aweme.playerkit.configpickerimpl.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public f f115495a;

    /* renamed from: b  reason: collision with root package name */
    public List<List<ConditionConfig>> f115496b;

    /* renamed from: c  reason: collision with root package name */
    public List<ConditionConfig> f115497c;

    static {
        Covode.recordClassIndex(74139);
    }

    public final List<List<ConditionConfig>> a() {
        Type type = new a<List<ConditionConfig>>() {
            /* class com.ss.android.ugc.aweme.playerkit.configpickerimpl.a.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(74140);
            }
        }.type;
        List<ConditionConfig> a2 = a((List) com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(this.f115495a.f115465a, type), (List) com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.b.a(this.f115495a.f115466b, type));
        Collections.sort(a2, new a());
        ArrayList arrayList = new ArrayList();
        this.f115497c = arrayList;
        arrayList.addAll(a2);
        return a(a2);
    }

    private static List<List<ConditionConfig>> a(List<ConditionConfig> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < size - i2; i3++) {
                int i4 = i2 + i3;
                arrayList2.add(list.get(i4));
                int i5 = i4 + 1;
                if (i5 < size && list.get(i5).a() < list.get(i2).a()) {
                    break;
                }
            }
            arrayList.add(arrayList2);
            i2 += arrayList2.size();
        }
        return arrayList;
    }

    private static List<ConditionConfig> a(List<ConditionConfig> list, List<ConditionConfig> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }
}
