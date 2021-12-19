package com.ss.android.legoimpl;

import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ca.a;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f59628a;

    static {
        Covode.recordClassIndex(36820);
    }

    b(a aVar) {
        this.f59628a = aVar;
    }

    public final void run() {
        a.a(Process.myTid());
    }
}
