package com.bytedance.android.live.network.response.a;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.IOException;

public final class b {
    @c(a = "header")

    /* renamed from: a  reason: collision with root package name */
    public a f12154a;
    @c(a = "body")

    /* renamed from: b  reason: collision with root package name */
    public byte[] f12155b;

    static {
        Covode.recordClassIndex(6659);
    }

    private b() {
    }

    public static b a(f fVar) {
        b bVar = new b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                break;
            } else if (b2 == 1) {
                bVar.f12154a = a.a(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                bVar.f12155b = fVar.c();
            }
        }
        fVar.a(a2);
        if (bVar.f12154a != null) {
            return bVar;
        }
        throw new IOException("Invalid protobuf data: response.header is null!");
    }
}
