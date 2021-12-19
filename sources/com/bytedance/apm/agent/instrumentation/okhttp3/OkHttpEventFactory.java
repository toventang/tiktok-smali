package com.bytedance.apm.agent.instrumentation.okhttp3;

import com.bytedance.covode.number.Covode;
import okhttp3.Call;
import okhttp3.EventListener;

public class OkHttpEventFactory implements EventListener.Factory {
    public EventListener.Factory originFactory;

    static {
        Covode.recordClassIndex(14350);
    }

    public OkHttpEventFactory(EventListener.Factory factory) {
        this.originFactory = factory;
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        EventListener eventListener;
        EventListener.Factory factory = this.originFactory;
        if (factory != null) {
            eventListener = factory.create(call);
        } else {
            eventListener = null;
        }
        return new OkHttpEventListener(eventListener);
    }
}
