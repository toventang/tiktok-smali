package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEListener;
import h.p;
import java.util.List;

public interface i {
    static {
        Covode.recordClassIndex(82347);
    }

    void a(int i2, int i3);

    void a(int i2, int i3, List<? extends VideoSegment> list);

    void a(int i2, VideoSegment videoSegment);

    void a(e eVar, VEListener.q qVar);

    void a(List<? extends VideoSegment> list);

    void a(List<? extends VideoSegment> list, int i2, long j2, long j3);

    void a(List<? extends VideoSegment> list, boolean z);

    void a(boolean z, p<Long, Long> pVar);

    void a(boolean z, boolean z2, List<? extends VideoSegment> list);

    boolean a(float f2, float f3, float f4, int i2, int i3);

    boolean a(int i2, float f2);

    void b(int i2, float f2);

    void b(int i2, int i3);

    void c(int i2, int i3);

    public static final class a {
        static {
            Covode.recordClassIndex(82348);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.cut.i */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(i iVar, boolean z, p pVar, int i2) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                pVar = null;
            }
            iVar.a(z, pVar);
        }

        public static /* synthetic */ boolean a(i iVar, float f2, float f3, float f4, int i2) {
            float f5 = f4;
            float f6 = f3;
            if ((i2 & 2) != 0) {
                f6 = 1.0f;
            }
            if ((i2 & 4) != 0) {
                f5 = 1.0f;
            }
            return iVar.a(f2, f6, f5, 0, 0);
        }
    }
}
