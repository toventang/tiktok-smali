package com.ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import h.f.b.l;

public final class EnterpriseRecyclerView extends RecyclerView implements a.b {
    private m O;

    static {
        Covode.recordClassIndex(46341);
    }

    public EnterpriseRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final m getEnterTabManager() {
        return this.O;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.a.b
    public final boolean q() {
        return this.O.f75228a;
    }

    public final void setEnterTabManager(m mVar) {
        l.d(mVar, "");
        this.O = mVar;
    }

    private /* synthetic */ EnterpriseRecyclerView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private EnterpriseRecyclerView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        this.O = new m();
        addOnAttachStateChangeListener(new f());
    }
}
