package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

public final class ap implements ar {

    /* renamed from: a  reason: collision with root package name */
    public static final a f130055a = new a((byte) 0);

    static {
        Covode.recordClassIndex(85338);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85339);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.ar
    public final Integer a() {
        return Integer.valueOf(Keva.getRepo("DefaultCameraFacingStore").getInt("default_camera_facing", 1));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.ar
    public final void a(int i2) {
        Keva.getRepo("DefaultCameraFacingStore").storeInt("default_camera_facing", i2);
    }
}
