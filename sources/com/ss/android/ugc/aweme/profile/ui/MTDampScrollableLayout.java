package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import h.f.b.l;

public final class MTDampScrollableLayout extends DampScrollableLayout {
    public static final a P = new a((byte) 0);
    private boolean Q;

    static {
        Covode.recordClassIndex(75427);
    }

    public MTDampScrollableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75428);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean getMFlag3() {
        return this.Q;
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout
    public final boolean b() {
        return super.b();
    }

    public final void setMFlag3(boolean z) {
        this.Q = z;
    }

    private /* synthetic */ MTDampScrollableLayout(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MTDampScrollableLayout(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
    }
}
