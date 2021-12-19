package com.ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.ss.android.ugc.aweme.shortvideo.util.bo;

final /* synthetic */ class br implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final bo.a f132276a;

    /* renamed from: b  reason: collision with root package name */
    private final a f132277b;

    static {
        Covode.recordClassIndex(86635);
    }

    br(bo.a aVar, a aVar2) {
        this.f132276a = aVar;
        this.f132277b = aVar2;
    }

    public final void run() {
        this.f132276a.a(this.f132277b);
    }
}
