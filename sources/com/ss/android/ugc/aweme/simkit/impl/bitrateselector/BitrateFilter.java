package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.playerkit.a.a;
import com.ss.android.ugc.aweme.playerkit.a.d;
import com.ss.android.ugc.aweme.playerkit.a.f;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.ss.android.ugc.playerkit.simapicommon.a.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class BitrateFilter {

    /* renamed from: a  reason: collision with root package name */
    private final a f133523a = d.a().b();

    static {
        Covode.recordClassIndex(87336);
    }

    public static class Filter {
        @c(a = "allow_gears")
        private List<String> allowGears;
        @c(a = "forbidden_gears")
        private List<String> forbiddenGears;

        static {
            Covode.recordClassIndex(87338);
        }

        public List<String> getAllowGears() {
            return this.allowGears;
        }

        public List<String> getForbiddenGears() {
            return this.forbiddenGears;
        }

        public void setAllowGears(List<String> list) {
            this.allowGears = list;
        }

        public void setForbiddenGears(List<String> list) {
            this.forbiddenGears = list;
        }
    }

    private static Set<String> a(List<Filter> list) {
        HashSet hashSet = new HashSet();
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Filter filter : list) {
            if (!(filter == null || filter.getAllowGears() == null || filter.getAllowGears().size() <= 0)) {
                arrayList.add(filter);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        hashSet.addAll(((Filter) arrayList.get(0)).getAllowGears());
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            Filter filter2 = (Filter) arrayList.get(i2);
            if (!(filter2 == null || filter2.getAllowGears() == null || filter2.getAllowGears().size() <= 0)) {
                hashSet.retainAll(filter2.getAllowGears());
            }
        }
        return hashSet;
    }

    private static List<e> a(List<e> list, Set<String> set) {
        ArrayList arrayList = new ArrayList(list);
        for (e eVar : list) {
            if (set.contains(String.valueOf(eVar.getQualityType()))) {
                arrayList.remove(eVar);
            }
        }
        return arrayList;
    }

    private static List<e> b(List<e> list, Set<String> set) {
        if (set == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        if (set.size() == 0) {
            return arrayList;
        }
        for (e eVar : list) {
            if (set.contains(String.valueOf(eVar.getQualityType()))) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final List<e> a(List<e> list, String str) {
        IDimensionBitrateFilterConfig dimensionBitrateFilterConfig;
        System.currentTimeMillis();
        if (!(list == null || list.size() == 0 || (dimensionBitrateFilterConfig = com.ss.android.ugc.aweme.simkit.d.a().b().getDimensionBitrateFilterConfig()) == null || !dimensionBitrateFilterConfig.a())) {
            a aVar = this.f133523a;
            f b2 = dimensionBitrateFilterConfig.b();
            b2.f115471g = str;
            List<Filter> a2 = aVar.a(b2, new com.google.gson.b.a<Filter>() {
                /* class com.ss.android.ugc.aweme.simkit.impl.bitrateselector.BitrateFilter.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(87337);
                }
            }.type);
            HashSet hashSet = new HashSet();
            if (a2 != null) {
                for (Filter filter : a2) {
                    if (!(filter == null || filter.getForbiddenGears() == null || filter.getForbiddenGears().size() <= 0)) {
                        hashSet.addAll(filter.getForbiddenGears());
                    }
                }
            }
            Set<String> a3 = a(a2);
            List<e> b3 = b(a(list, hashSet), a3);
            com.a.a("filter: forbiddenGears:%s, allowGears:%s, input:%s, output:%s", new Object[]{hashSet, a3, list, b3});
            if (b3.size() != 0) {
                list = b3;
            }
        }
        System.currentTimeMillis();
        return list;
    }
}
