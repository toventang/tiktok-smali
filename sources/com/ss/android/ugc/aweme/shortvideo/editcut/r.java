package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.x;

public interface r {
    static {
        Covode.recordClassIndex(84204);
    }

    long a();

    void a(long j2, x.f fVar, boolean z);

    boolean d();

    public static final class a {
        static {
            Covode.recordClassIndex(84205);
        }

        public static /* synthetic */ void a(r rVar, long j2, x.f fVar, boolean z, int i2) {
            if ((i2 & 2) != 0) {
                fVar = x.f.EDITOR_SEEK_FLAG_LastSeek;
            }
            if ((i2 & 4) != 0) {
                z = true;
            }
            rVar.a(j2, fVar, z);
        }
    }
}
