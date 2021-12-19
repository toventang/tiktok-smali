package com.ss.android.ugc.aweme.im.sdk.common.controller.g;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(65459);
    }

    private static Map<String, String> a(String str) {
        h a2;
        if (!TextUtils.isEmpty(str) && (a2 = a.C0745a.a().a(str)) != null) {
            return a2.getLocalExt();
        }
        return null;
    }

    private static Integer a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("commercialize.personal_info_count");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void a(List<ai> list) {
        BaseContent content;
        if (!(list == null || list.isEmpty())) {
            for (ai aiVar : list) {
                if (aiVar != null && !aiVar.isSelf() && (content = b.content(aiVar)) != null && content.getType() == 770) {
                    Map a2 = a(aiVar.getConversationId());
                    if (a2 == null) {
                        a2 = new HashMap();
                    }
                    a2.put("commercialize.personal_info_count", "3");
                    a(aiVar.getConversationId(), a2);
                }
            }
        }
    }

    private static void a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            b.a.a(str).b(map, (com.bytedance.im.core.a.a.b<h>) null);
        }
    }

    public static void a(String str, BaseContent baseContent) {
        Map<String, String> a2;
        Integer a3;
        if (baseContent != null && (a3 = a((a2 = a(str)))) != null) {
            if (a3.intValue() > 0) {
                baseContent.setType(771);
            }
            int intValue = a3.intValue() - 1;
            if (intValue > 0) {
                a2.put("commercialize.personal_info_count", Integer.toString(intValue));
            } else {
                a2.remove("commercialize.personal_info_count");
            }
            a(str, a2);
        }
    }
}
