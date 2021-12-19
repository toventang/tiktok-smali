package com.ss.android.ugc.aweme.friends.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class RelativeUserAvatarListView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f97128a;

    /* renamed from: b  reason: collision with root package name */
    private int f97129b;

    /* renamed from: c  reason: collision with root package name */
    private final int f97130c;

    static {
        Covode.recordClassIndex(61714);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private /* synthetic */ RelativeUserAvatarListView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RelativeUserAvatarListView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(2534);
        this.f97128a = (int) n.b(context, 16.0f);
        this.f97129b = (int) n.b(context, 20.0f);
        this.f97130c = (int) n.b(context, 1.0f);
        MethodCollector.o(2534);
    }
}
