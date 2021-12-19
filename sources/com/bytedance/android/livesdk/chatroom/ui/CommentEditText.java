package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class CommentEditText extends LiveEditText {

    /* renamed from: a  reason: collision with root package name */
    final List<a> f15799a = new ArrayList();

    interface a {
        static {
            Covode.recordClassIndex(8716);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(8715);
    }

    public boolean onTextContextMenuItem(int i2) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i2);
        if (i2 == 16908322 || i2 == 16908337) {
            for (a aVar : this.f15799a) {
                aVar.a();
            }
        }
        return onTextContextMenuItem;
    }

    public CommentEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
