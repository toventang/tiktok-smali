package com.appsflyer.internal.model.event;

import com.bytedance.covode.number.Covode;

public class ProxyEvent extends BackgroundEvent {

    /* renamed from: ɾ  reason: contains not printable characters */
    private String f279;

    static {
        Covode.recordClassIndex(2746);
    }

    @Override // com.appsflyer.internal.model.event.BackgroundEvent
    public String body() {
        return this.f279;
    }

    public ProxyEvent() {
        super(null, null, Boolean.FALSE, null, null);
    }

    public BackgroundEvent body(String str) {
        this.f279 = str;
        return this;
    }
}
