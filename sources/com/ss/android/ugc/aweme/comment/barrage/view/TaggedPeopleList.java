package com.ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import h.f.b.l;
import java.util.Objects;

public final class TaggedPeopleList extends PowerList {
    static {
        Covode.recordClassIndex(44113);
    }

    public TaggedPeopleList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setMaxLineCount(int i2) {
        RecyclerView.i layoutManager = getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).a(i2);
    }

    private /* synthetic */ TaggedPeopleList(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TaggedPeopleList(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        setLayoutManager(new GridLayoutManager(3));
        addOnAttachStateChangeListener(new f());
    }
}
