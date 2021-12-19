package com.bytedance.common.wschannel.client;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

public interface j {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f27186a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f27187b;

        /* renamed from: c  reason: collision with root package name */
        int f27188c;

        static {
            Covode.recordClassIndex(16024);
        }
    }

    static {
        Covode.recordClassIndex(16023);
    }

    void a(Context context);

    void a(Context context, int i2);

    void a(Context context, SsWsApp ssWsApp);

    void a(Context context, WsChannelMsg wsChannelMsg);

    void a(Context context, boolean z);

    void b(Context context);

    void b(Context context, SsWsApp ssWsApp);
}
