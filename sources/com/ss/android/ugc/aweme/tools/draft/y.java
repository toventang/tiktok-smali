package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class y implements v.a {

    /* renamed from: a  reason: collision with root package name */
    private final DraftBoxActivity f139955a;

    static {
        Covode.recordClassIndex(91462);
    }

    y(DraftBoxActivity draftBoxActivity) {
        this.f139955a = draftBoxActivity;
    }

    @Override // com.ss.android.ugc.aweme.port.in.v.a
    public final void a(String[] strArr, int[] iArr) {
        DraftBoxActivity draftBoxActivity = this.f139955a;
        if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
            new a(draftBoxActivity).a(R.string.bci).a();
            draftBoxActivity.finish();
        } else if (iArr[0] == 0) {
            draftBoxActivity.g();
        } else {
            new a(draftBoxActivity).a(R.string.bci).a();
            draftBoxActivity.finish();
        }
    }
}
