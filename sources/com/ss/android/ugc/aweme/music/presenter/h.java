package com.ss.android.ugc.aweme.music.presenter;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f111588a;

    /* renamed from: b  reason: collision with root package name */
    private final Message f111589b;

    static {
        Covode.recordClassIndex(71707);
    }

    h(g gVar, Message message) {
        this.f111588a = gVar;
        this.f111589b = message;
    }

    public final void run() {
        this.f111588a.handleMsg(this.f111589b);
    }
}
