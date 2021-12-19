package com.ss.android.ugc.aweme.tools.beauty.data;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.d;
import com.ss.android.ugc.aweme.tools.beauty.g.m;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class a implements m.b {
    static {
        Covode.recordClassIndex(90835);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.b
    public final boolean b(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra) {
        l.d(beautyFilterConfig, "");
        l.d(beautyCategoryExtra, "");
        com.ss.android.ugc.aweme.tools.beauty.e.a aVar = com.ss.android.ugc.aweme.tools.beauty.e.a.s;
        l.d(beautyCategoryExtra, "");
        if (aVar.f138935a) {
            return beautyCategoryExtra.getRegionT();
        }
        return beautyCategoryExtra.getRegionM();
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.b
    public final boolean a(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra) {
        l.d(beautyFilterConfig, "");
        l.d(beautyCategoryExtra, "");
        if (d.a(beautyCategoryExtra.getAbGroup()) == beautyFilterConfig.getAbGroup() || beautyFilterConfig.getAbGroup() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.g.m.b
    public final boolean a(BeautyFilterConfig beautyFilterConfig, List<BeautyCategory> list) {
        T t;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        l.d(beautyFilterConfig, "");
        l.d(list, "");
        Iterator<T> it = list.iterator();
        do {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            t = it.next();
        } while (!l.a((Object) t.getBeautyCategoryExtra().getPanelType(), (Object) com.ss.android.ugc.aweme.tools.beauty.a.ALL.getFlag()));
        if (t != null) {
            z = true;
        } else {
            z = false;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (l.a((Object) next.getBeautyCategoryExtra().getPanelType(), (Object) com.ss.android.ugc.aweme.tools.beauty.a.MALE.getFlag())) {
                if (next != null) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            T next2 = it3.next();
            if (l.a((Object) next2.getBeautyCategoryExtra().getPanelType(), (Object) com.ss.android.ugc.aweme.tools.beauty.a.FEMALE.getFlag())) {
                if (next2 != null) {
                    z3 = true;
                }
            }
        }
        z3 = false;
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next3 = it4.next();
            if (a(beautyFilterConfig, next3.getBeautyCategoryExtra())) {
                if (next3 != null) {
                    z4 = true;
                }
            }
        }
        z4 = false;
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            T next4 = it5.next();
            if (b(beautyFilterConfig, next4.getBeautyCategoryExtra())) {
                if (next4 != null) {
                    z5 = true;
                }
            }
        }
        z5 = false;
        if (z || (z2 && z3)) {
            z6 = true;
        } else {
            z6 = false;
        }
        com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT isPanelValid: validG:" + z6 + " all:" + z + " m:" + z2 + " f:" + z3 + " group:" + z4 + " region:" + z5);
        if (!(!list.isEmpty()) || !z6 || !z4 || !z5) {
            return false;
        }
        return true;
    }
}
