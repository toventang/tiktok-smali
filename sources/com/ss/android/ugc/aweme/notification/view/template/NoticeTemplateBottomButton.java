package com.ss.android.ugc.aweme.notification.view.template;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class NoticeTemplateBottomButton extends NewFollowButton {
    static {
        Covode.recordClassIndex(73284);
    }

    public NoticeTemplateBottomButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ NoticeTemplateBottomButton(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private NoticeTemplateBottomButton(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, (int) R.attr.bo);
        l.d(context, "");
    }
}
