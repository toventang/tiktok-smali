package com.bytedance.android.a.b.c;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final class a {
    static {
        Covode.recordClassIndex(3232);
    }

    static void a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            list.remove("__IDFA__");
            list.remove("{IDFA}");
            list.remove("__UDID__");
            list.remove("{UDID}");
        }
    }

    static List<String> a(boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("__TS__");
            arrayList.add("{TS}");
            arrayList.add("__UA__");
            arrayList.add("{UA}");
        } else {
            arrayList.add("__TS__");
            arrayList.add("{TS}");
            arrayList.add("__UA__");
            arrayList.add("{UA}");
            arrayList.add("__ANDROIDID__");
            arrayList.add("{ANDROIDID}");
            arrayList.add("__ANDROIDID1__");
            arrayList.add("{ANDROIDID1}");
            arrayList.add("__AAID__");
            arrayList.add("{AAID}");
            arrayList.add("__OPENUDID__");
            arrayList.add("{OPENUDID}");
            arrayList.add("__OS__");
            arrayList.add("{OS}");
            arrayList.add("__IP__");
            arrayList.add("{IP}");
            arrayList.add("__LBS__");
            arrayList.add("{LBS}");
            arrayList.add("__GEO__");
            arrayList.add("{GEO}");
            arrayList.add("__UOO__");
            arrayList.add("{UOO}");
            arrayList.add("__DEVICE_ID__");
            arrayList.add("{DEVICE_ID}");
            arrayList.add("__OS_STR__");
            arrayList.add("{OS_STR}");
        }
        return arrayList;
    }
}
