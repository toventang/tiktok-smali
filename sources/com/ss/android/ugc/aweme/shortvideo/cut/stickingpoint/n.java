package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public i f126020a;

    /* renamed from: b  reason: collision with root package name */
    public i f126021b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f126022c;

    static {
        Covode.recordClassIndex(82778);
    }

    public final void a(List<? extends VideoSegment> list, int i2, long j2, long j3) {
        i iVar = this.f126021b;
        if (iVar != null) {
            iVar.a(list);
        }
        i iVar2 = this.f126020a;
        if (iVar2 != null) {
            iVar2.a(list);
        }
        if (this.f126022c) {
            i iVar3 = this.f126021b;
            if (iVar3 != null) {
                iVar3.a(list, i2, j2, j3);
                return;
            }
            return;
        }
        i iVar4 = this.f126020a;
        if (iVar4 != null) {
            iVar4.a(list, i2, j2, j3);
        }
    }

    public final boolean a(float f2, float f3, float f4, int i2, int i3) {
        i iVar = this.f126020a;
        if (iVar != null) {
            return iVar.a(f2, f3, f4, i2, i3);
        }
        return false;
    }
}
