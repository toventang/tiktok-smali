package com.ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener;
import java.util.HashMap;

final /* synthetic */ class u implements ICrashEffectIdInfoListener {

    /* renamed from: a  reason: collision with root package name */
    static final ICrashEffectIdInfoListener f107996a = new u();

    static {
        Covode.recordClassIndex(69233);
    }

    private u() {
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener
    public final void setEffectIdInfo(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        Npth.addTags(hashMap);
    }
}
