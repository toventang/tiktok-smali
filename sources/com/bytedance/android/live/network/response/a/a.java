package com.bytedance.android.live.network.response.a;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f12148a;

    /* renamed from: b  reason: collision with root package name */
    public String f12149b;

    /* renamed from: c  reason: collision with root package name */
    public String f12150c;

    /* renamed from: d  reason: collision with root package name */
    public String f12151d;

    /* renamed from: e  reason: collision with root package name */
    public long f12152e;

    /* renamed from: f  reason: collision with root package name */
    public String f12153f;

    static {
        Covode.recordClassIndex(6658);
    }

    private a() {
    }

    static a a(f fVar) {
        a aVar = new a();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 != -1) {
                switch (b2) {
                    case 1:
                        aVar.f12148a = (int) fVar.f();
                        break;
                    case 2:
                        aVar.f12149b = fVar.d();
                        break;
                    case 3:
                        aVar.f12150c = fVar.d();
                        break;
                    case 4:
                        aVar.f12151d = fVar.d();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        aVar.f12152e = fVar.f();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        aVar.f12153f = fVar.d();
                        break;
                    default:
                        g.c(fVar);
                        break;
                }
            } else {
                fVar.a(a2);
                if (aVar.f12148a == -1) {
                    throw new IOException("Invalid protobuf data: missing header.statusCode!");
                } else if (aVar.f12152e != -1) {
                    return aVar;
                } else {
                    throw new IOException("Invalid protobuf data: missing header.now!");
                }
            }
        }
    }
}
