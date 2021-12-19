package com.ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.b.a.a;

final /* synthetic */ class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    static final a.b f107966a = new e();

    static {
        Covode.recordClassIndex(69210);
    }

    private e() {
    }

    @Override // com.bytedance.platform.a.b.a.a.b
    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : HoraeInitTask.f107772a) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
