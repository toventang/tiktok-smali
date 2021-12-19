package com.ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;

public class a extends RecyclerView {
    private List<Object> O;

    static {
        Covode.recordClassIndex(42160);
    }

    public int getEndItemIndex() {
        if (!q()) {
            return getAdapter().getItemCount() - 1;
        }
        return 0;
    }

    public int getFirstPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return d(getChildAt(0));
    }

    public int getLastPosition() {
        if (getChildCount() <= 0) {
            return -1;
        }
        return d(getChildAt(getChildCount() - 1));
    }

    public int getStartItemIndex() {
        if (!q()) {
            return 0;
        }
        return getAdapter().getItemCount() - 1;
    }

    private boolean q() {
        if (getLayoutManager() instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) getLayoutManager()).f3901f;
        }
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).f3780l;
        }
        return false;
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        List<Object> list = this.O;
        if (list != null) {
            Iterator<Object> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        addOnAttachStateChangeListener(new f());
    }
}
