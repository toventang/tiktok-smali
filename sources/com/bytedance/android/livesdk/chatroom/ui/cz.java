package com.bytedance.android.livesdk.chatroom.ui;

import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;

public abstract class cz extends ClickableSpan {
    static {
        Covode.recordClassIndex(8913);
    }

    public abstract void a(View view);
}
