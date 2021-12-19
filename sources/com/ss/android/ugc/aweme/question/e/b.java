package com.ss.android.ugc.aweme.question.e;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f119965a;

    /* renamed from: b  reason: collision with root package name */
    private final Message f119966b;

    static {
        Covode.recordClassIndex(77928);
    }

    b(a aVar, Message message) {
        this.f119965a = aVar;
        this.f119966b = message;
    }

    public final void run() {
        this.f119965a.handleMsg(this.f119966b);
    }
}
