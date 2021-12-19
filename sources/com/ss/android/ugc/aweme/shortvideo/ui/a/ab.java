package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.record.ar;

public final class ab implements ar {

    /* renamed from: a  reason: collision with root package name */
    public static final a f131251a = new a((byte) 0);

    static {
        Covode.recordClassIndex(85982);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85983);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.ar
    public final Integer a() {
        return Integer.valueOf(g.a().e().getCameraPosition(1));
    }

    public ab() {
        if (c.f115634m.a("key_first_use_camera", true)) {
            c.f115634m.b("key_first_use_camera", false);
            if (b.a().a(true, "rear_camera", false)) {
                a(0);
            } else {
                a(1);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.ar
    public final void a(int i2) {
        g.a().e().setCameraPosition(i2);
    }
}
