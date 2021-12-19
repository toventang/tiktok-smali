package com.ss.android.ugc.gamora.editor.sticker.permission;

import b.i;
import com.bytedance.covode.number.Covode;
import l.b.f;

public interface QuestionAndAnswerApi {
    static {
        Covode.recordClassIndex(96633);
    }

    @f(a = "/tiktok/v1/forum/user/visibility/")
    i<b> getAllowUserToQuestion();
}
