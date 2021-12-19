package com.bytedance.im.core.i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.proto.StrangerConversation;
import java.util.Map;

public final class g {
    static {
        Covode.recordClassIndex(22862);
    }

    public static void a(h hVar) {
        int mode;
        if (hVar != null && !TextUtils.isEmpty(hVar.getConversationId()) && hVar.getConversationType() == e.a.f37581a && hVar.getCoreInfo() != null && (mode = hVar.getCoreInfo().getMode()) >= 0) {
            hVar.setStranger(a(hVar.getConversationId(), mode));
        }
    }

    public static void a(h hVar, ai aiVar) {
        if (hVar != null && aiVar != null) {
            hVar.setLastMessage(aiVar);
            hVar.setLastMessageIndex(aiVar.getIndex());
            hVar.setUpdatedTime(aiVar.getCreatedAt());
        }
    }

    public static void a(h hVar, StrangerConversation strangerConversation) {
        Map<String, String> localExt = hVar.getLocalExt();
        for (Map.Entry<String, String> entry : strangerConversation.ext.entrySet()) {
            localExt.put(entry.getKey(), entry.getValue());
        }
    }

    private static boolean a(String str, int i2) {
        String[] split = str.split(":");
        if (split.length != 4) {
            return false;
        }
        long a2 = com.bytedance.im.core.internal.utils.e.a(split[2], 0L);
        long a3 = com.bytedance.im.core.internal.utils.e.a(split[3], 0L);
        long c2 = com.bytedance.im.core.internal.utils.e.c();
        if (i2 == 1) {
            if (c2 == a3) {
                return true;
            }
            return false;
        } else if (i2 == 2) {
            if (c2 == a2) {
                return true;
            }
            return false;
        } else if (i2 != 3) {
            return false;
        } else {
            if (c2 == a3 || c2 == a2) {
                return true;
            }
            return false;
        }
    }
}
