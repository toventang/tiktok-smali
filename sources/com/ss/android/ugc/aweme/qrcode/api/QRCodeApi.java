package com.ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.a;
import com.bytedance.ies.ugc.aweme.network.f;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.o;

public final class QRCodeApi {

    /* renamed from: a  reason: collision with root package name */
    static final f f119705a = a.a(b.f59141e);

    interface RealApi {
        static {
            Covode.recordClassIndex(77762);
        }

        @o(a = "/aweme/v1/qrcode/info/")
        @e
        q<com.ss.android.ugc.aweme.qrcode.d.a> getQRCodeInfo(@c(a = "schema_type") int i2, @c(a = "object_id") String str, @c(a = "edition_uid") String str2);

        @o(a = "/aweme/v1/fancy/qrcode/info/")
        @e
        q<com.ss.android.ugc.aweme.qrcode.d.a> getQRCodeInfoV2(@c(a = "schema_type") int i2, @c(a = "object_id") String str, @c(a = "meta_params") String str2);
    }

    static {
        Covode.recordClassIndex(77761);
    }

    public static com.ss.android.ugc.aweme.qrcode.d.a a(int i2, String str, String str2) {
        try {
            return ((RealApi) f119705a.a(RealApi.class)).getQRCodeInfoV2(i2, str, str2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
