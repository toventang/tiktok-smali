package com.ss.android.ugc.aweme.challenge.g;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f69978a;

    /* renamed from: b  reason: collision with root package name */
    private final Message f69979b;

    static {
        Covode.recordClassIndex(43141);
    }

    b(a aVar, Message message) {
        this.f69978a = aVar;
        this.f69979b = message;
    }

    public final void run() {
        this.f69978a.handleMsg(this.f69979b);
    }
}
