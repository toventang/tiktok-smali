package com.ss.android.ugc.aweme.legoImp.task;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ht;
import f.a.d.f;
import java.lang.reflect.Array;

final /* synthetic */ class ad implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f107944a = new ad();

    static {
        Covode.recordClassIndex(69184);
    }

    private ad() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue() && Build.VERSION.SDK_INT < 23 && ht.f143075a != null) {
            try {
                Object obj2 = ht.f143075a.get(null);
                if (obj2 != null) {
                    int length = Array.getLength(obj2);
                    for (int i2 = 0; i2 < length; i2++) {
                        Array.set(obj2, i2, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
