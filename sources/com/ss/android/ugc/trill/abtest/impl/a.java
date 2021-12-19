package com.ss.android.ugc.trill.abtest.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

public final class a extends com.ss.android.ugc.trill.abtest.a<Boolean> {
    static {
        Covode.recordClassIndex(98950);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.trill.abtest.a
    public final /* synthetic */ Boolean a() {
        return false;
    }

    public static void a(String str) {
        r.onEvent(MobClick.obtain().setLabelName(str).setEventName("recall_popup"));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r3 = com.bytedance.ies.ugc.appcontext.f.j();
     */
    @Override // com.ss.android.ugc.trill.abtest.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ boolean a(java.lang.Boolean r6) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.trill.abtest.impl.a.a(java.lang.Object):boolean");
    }
}
