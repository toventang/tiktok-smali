package com.bytedance.android.live.copyrightreview.helper;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final CopyrightViolationHelper f8839a;

    static {
        Covode.recordClassIndex(4522);
    }

    b(CopyrightViolationHelper copyrightViolationHelper) {
        this.f8839a = copyrightViolationHelper;
    }

    public final boolean handleMessage(Message message) {
        CopyrightViolationHelper copyrightViolationHelper = this.f8839a;
        if (message.what == 1) {
            if (copyrightViolationHelper.f8831a == null || copyrightViolationHelper.f8831a.isShowing()) {
                return false;
            }
            copyrightViolationHelper.f8831a.show();
            return true;
        } else if (message.what != 2 || copyrightViolationHelper.f8832b == null || copyrightViolationHelper.f8832b.isShowing()) {
            return false;
        } else {
            copyrightViolationHelper.f8836f.run();
            return true;
        }
    }
}
