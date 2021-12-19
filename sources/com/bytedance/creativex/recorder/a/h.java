package com.bytedance.creativex.recorder.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f28085a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(16447);
    }

    public static List<ComposerInfo> a(List<BeautyComposerInfo> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        if ((!list.isEmpty()) && list != null) {
            for (T t : list) {
                l.d(t, "");
                arrayList.add(new ComposerInfo(t.f79584a, t.f79585b, t.f79586c));
            }
        }
        return arrayList;
    }
}
