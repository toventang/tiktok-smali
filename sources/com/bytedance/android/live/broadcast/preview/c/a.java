package com.bytedance.android.live.broadcast.preview.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import h.z;

public interface a {
    static {
        Covode.recordClassIndex(4071);
    }

    boolean a(C0122a aVar);

    /* renamed from: com.bytedance.android.live.broadcast.preview.c.a$a  reason: collision with other inner class name */
    public static final class C0122a {

        /* renamed from: a  reason: collision with root package name */
        public final Context f8150a;

        /* renamed from: b  reason: collision with root package name */
        public final DataChannel f8151b;

        /* renamed from: c  reason: collision with root package name */
        public final h.f.a.a<z> f8152c;

        static {
            Covode.recordClassIndex(4072);
        }

        public C0122a(Context context, DataChannel dataChannel, h.f.a.a<z> aVar) {
            l.d(context, "");
            l.d(aVar, "");
            this.f8150a = context;
            this.f8151b = dataChannel;
            this.f8152c = aVar;
        }
    }
}
