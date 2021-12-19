package com.ss.android.ugc.effectmanager;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class AlgorithmUtils {
    public static final AlgorithmUtils INSTANCE = new AlgorithmUtils();

    private AlgorithmUtils() {
    }

    static {
        Covode.recordClassIndex(95166);
    }

    private final List<String> getRequirementsOfEffect(Effect effect) {
        return n.g((Collection) effect.getRequirements());
    }

    private final Map<String, List<String>> convertMap(Map<String, ? extends Object> map) {
        if (CollectionUtil.isMapEmpty(map)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (CollectionUtil.isCollection(value)) {
                List<String> convertListObjToStr = CollectionUtil.convertListObjToStr(CollectionUtil.convertObjectToList(value));
                if (!CollectionUtil.isListEmpty(convertListObjToStr)) {
                    l.a((Object) convertListObjToStr, "");
                    hashMap.put(key, convertListObjToStr);
                }
            }
        }
        return hashMap;
    }

    public static final Map<String, List<String>> getModelNamesOfEffect(Effect effect) {
        l.c(effect, "");
        String modelNames = effect.getModelNames();
        EPLog.d("AlgorithmUtils", "getModelNamesOfEffect->effectId = " + effect.getEffectId() + ", modelNames = " + modelNames);
        Map<String, List<String>> map = null;
        if (TextUtils.isEmpty(modelNames)) {
            return null;
        }
        try {
            map = INSTANCE.convertMap(JsonExtKt.toMap(new JSONObject(modelNames)));
            return map;
        } catch (Exception e2) {
            EPLog.e("AlgorithmUtils", "getModelNamesOfEffect", e2);
            return map;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String[] getResourceNameArrayOfEffect(com.ss.android.ugc.effectmanager.effect.model.Effect r10) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.AlgorithmUtils.getResourceNameArrayOfEffect(com.ss.android.ugc.effectmanager.effect.model.Effect):java.lang.String[]");
    }

    private final String[] mergeRequirementsAndModelNames(String[] strArr, Map<String, ? extends List<String>> map) {
        if (CollectionUtil.isMapEmpty(map)) {
            return strArr;
        }
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            arrayList.addAll((List) entry.getValue());
        }
        ArrayList arrayList2 = new ArrayList();
        if (strArr != null) {
            arrayList2.addAll(i.j(strArr));
        }
        arrayList2.addAll(arrayList);
        Object[] array = arrayList2.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new w("null cannot be cast to non-null type");
    }
}
