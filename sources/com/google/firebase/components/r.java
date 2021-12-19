package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.b.a;
import com.google.firebase.b.b;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Map.Entry f54342a;

    /* renamed from: b  reason: collision with root package name */
    private final a f54343b;

    static {
        Covode.recordClassIndex(33738);
    }

    r(Map.Entry entry, a aVar) {
        this.f54342a = entry;
        this.f54343b = aVar;
    }

    public final void run() {
        Map.Entry entry = this.f54342a;
        ((b) entry.getKey()).a(this.f54343b);
    }
}
