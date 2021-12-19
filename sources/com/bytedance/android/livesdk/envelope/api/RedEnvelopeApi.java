package com.bytedance.android.livesdk.envelope.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.envelope.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.ab;

public interface RedEnvelopeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17154a = a.f17155a;

    static {
        Covode.recordClassIndex(9517);
    }

    @h(a = "/webcast/envelope/list/")
    ab<d<e>> getRedEnvelopList(@z(a = "room_id") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f17155a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(9518);
        }
    }
}
