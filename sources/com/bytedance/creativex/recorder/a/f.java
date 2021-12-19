package com.bytedance.creativex.recorder.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f28071a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(16440);
    }

    public static final List<BeautyComposerInfo> a(List<BeautyComposerInfo> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!l.a((Object) t.f79584a, (Object) "EFFECT_ID_TYPE_FILTER")) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
