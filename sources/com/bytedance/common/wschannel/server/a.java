package com.bytedance.common.wschannel.server;

import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    Map<Integer, IWsApp> f27321a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    Map<Integer, IWsChannelClient> f27322b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    Map<Integer, SocketState> f27323c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(16081);
    }

    a() {
    }
}
