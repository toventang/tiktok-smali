package com.ss.android.ugc.aweme.tools.draft;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cs.d.a.a;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.tools.utils.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class aj {
    static {
        Covode.recordClassIndex(91110);
    }

    public static void a(List<c> list) {
        if (!h.a(list)) {
            a aVar = new a();
            for (c cVar : list) {
                if (cVar != null) {
                    aVar.a(cVar);
                    cVar.C = aVar.a();
                }
            }
        }
    }

    private static String b(List<c> list) {
        String str;
        if (k.a(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (c cVar : list) {
            String str2 = cVar.O;
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split(",");
                for (String str3 : split) {
                    if (!sb.toString().contains(str3)) {
                        if (sb.length() == 0) {
                            str = "";
                        } else {
                            str = ",";
                        }
                        sb.append(str).append(str3);
                    }
                }
            }
        }
        return sb.toString();
    }

    static List<c> a(List<com.ss.android.ugc.aweme.tools.draft.g.a<Object>> list, boolean z) {
        if (b.a((Collection) list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.ss.android.ugc.aweme.tools.draft.g.a<Object> aVar = list.get(i2);
            if (!(aVar == null || aVar.f139774b == null)) {
                ArrayList<c> arrayList2 = aVar.f139774b;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    c cVar = arrayList2.get(i3);
                    if (cVar != null) {
                        if (i3 == 0 && cVar.f83185f != null && !TextUtils.isEmpty(cVar.f83185f.getName())) {
                            c cVar2 = new c();
                            cVar2.f83185f = cVar.f83185f;
                            if (z) {
                                cVar2.x = 5;
                            } else {
                                cVar2.x = 1;
                            }
                            cVar2.O = b(arrayList2);
                            arrayList.add(cVar2);
                        }
                        if (i3 == arrayList2.size() - 1) {
                            cVar.z = true;
                        } else {
                            cVar.z = false;
                        }
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
