package com.bytedance.android.live.effect.api;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public interface d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f9655b = a.f9656a;

    static {
        Covode.recordClassIndex(4914);
    }

    void a(Handler handler);

    void a(Handler handler, DataChannel dataChannel, boolean z);

    void a(DataChannel dataChannel, boolean z);

    void a(DataChannel dataChannel, boolean z, String str, boolean z2, int i2);

    void a(String str, float f2, int i2, boolean z);

    void b(DataChannel dataChannel, boolean z, String str, boolean z2, int i2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9656a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(4915);
        }
    }
}
