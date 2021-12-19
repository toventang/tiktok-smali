package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class GroupChatBlockedView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    private HashMap f100594g;

    static {
        Covode.recordClassIndex(64349);
    }

    public GroupChatBlockedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View b(int i2) {
        if (this.f100594g == null) {
            this.f100594g = new HashMap();
        }
        View view = (View) this.f100594g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f100594g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    private /* synthetic */ GroupChatBlockedView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private GroupChatBlockedView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4824);
        View.inflate(context, R.layout.a74, this);
        MethodCollector.o(4824);
    }
}
