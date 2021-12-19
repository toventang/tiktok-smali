package com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReferenceInfoHint;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(65543);
    }

    public static final ReferenceInfoHint a(ReferenceInfo referenceInfo) {
        l.d(referenceInfo, "");
        return (ReferenceInfoHint) j.a(referenceInfo.hint, ReferenceInfoHint.class);
    }

    public static final boolean a(ai aiVar) {
        l.d(aiVar, "");
        if (aiVar.getMsgType() == 1 || aiVar.getMsgType() == 1030 || aiVar.getMsgType() == 1031) {
            return true;
        }
        return false;
    }
}
