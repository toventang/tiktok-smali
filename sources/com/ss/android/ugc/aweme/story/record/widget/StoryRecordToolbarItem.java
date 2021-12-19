package com.ss.android.ugc.aweme.story.record.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.k;
import com.ss.android.ugc.aweme.sticker.t;
import com.ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import h.f.b.l;

public final class StoryRecordToolbarItem extends AVDmtImageView {
    static {
        Covode.recordClassIndex(90591);
    }

    public StoryRecordToolbarItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    private /* synthetic */ StoryRecordToolbarItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StoryRecordToolbarItem(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setOnTouchListener(new t(1.2f, 100, this));
    }
}
