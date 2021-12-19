package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.StrArray;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(42231);
    }

    public static final BeautyMobParam a(List<ComposerBeauty> list) {
        boolean z;
        l.d(list, "");
        StrArray strArray = new StrArray();
        StrArray strArray2 = new StrArray();
        StrArray strArray3 = new StrArray();
        StrArray strArray4 = new StrArray();
        StrArray strArray5 = new StrArray();
        StrArray strArray6 = new StrArray();
        for (T t : list) {
            String parentId = t.getParentId();
            if (parentId == null || parentId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                strArray4.add(t.getEffect().getEffectId());
                strArray5.add(t.getEffect().getName());
                strArray6.add(String.valueOf(((float) t.getProgressValue()) / 100.0f));
            } else {
                strArray.add(t.getEffect().getEffectId());
                strArray2.add(t.getEffect().getName());
                strArray3.add(String.valueOf(((float) t.getProgressValue()) / 100.0f));
            }
        }
        String strArray7 = strArray.toString();
        l.b(strArray7, "");
        String strArray8 = strArray2.toString();
        l.b(strArray8, "");
        String strArray9 = strArray3.toString();
        l.b(strArray9, "");
        String strArray10 = strArray4.toString();
        l.b(strArray10, "");
        String strArray11 = strArray5.toString();
        l.b(strArray11, "");
        String strArray12 = strArray6.toString();
        l.b(strArray12, "");
        return new BeautyMobParam(strArray7, strArray8, strArray9, strArray10, strArray11, strArray12);
    }

    public static final b a(b bVar, BeautyMobParam beautyMobParam) {
        BeautyMobParam beautyMobParam2 = beautyMobParam;
        l.d(bVar, "");
        if (beautyMobParam2 == null) {
            beautyMobParam2 = new BeautyMobParam(null, null, null, null, null, null, 63, null);
        }
        b a2 = bVar.a("beautify_child_id_list", beautyMobParam2.getBeautifyChildIdListStr()).a("beautify_child_name_list", beautyMobParam2.getBeautifyChildNameListStr()).a("beautify_child_value_list", beautyMobParam2.getBeautifyChildValueListStr()).a("beautify_parent_id_list", beautyMobParam2.getBeautifyParentIdListStr()).a("beautify_parent_name_list", beautyMobParam2.getBeautifyParentNameListStr()).a("beautify_parent_value_list", beautyMobParam2.getBeautifyParentValueListStr());
        l.b(a2, "");
        return a2;
    }
}
