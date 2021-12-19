package com.ss.android.ugc.aweme.deeplink.actions;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.deeplink.actions.a.b;
import h.f.b.l;
import h.p;
import h.z;
import java.util.HashMap;

public final class QnAAction extends b<z> {
    static {
        Covode.recordClassIndex(49340);
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final String getTargetPageName() {
        return "question_detail";
    }

    @Override // com.ss.android.ugc.aweme.deeplink.actions.a.b
    public final p<String, HashMap<String, Object>> buildInnerUrl(String str, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        return new p<>("//qna/detail", hashMap);
    }
}
