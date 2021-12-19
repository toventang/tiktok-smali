package com.bytedance.android.live.p;

import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.z;

public enum l {
    INTERACTION(R.layout.bg4),
    INTERACTION_PK(R.layout.bg5),
    COHOST(R.layout.bg1),
    MULTIGUEST(R.layout.bg8),
    SLOT(R.layout.bfz),
    AUDIENCE_SLOT(R.layout.bfx),
    QUESTION(2131234538, 0),
    STICKER_DONATION(2131234651, R.string.e0s),
    SHARE(2131234561, R.string.gyt),
    EFFECT(2131234428, 0),
    CLOSE_ROOM(2131234595, 0),
    MORE(2131234508, 0),
    REVERSE_CAMERA(2131234546, R.string.eai),
    REVERSE_MIRROR(2131234552, R.string.e_y),
    INTRO(2131234487, R.string.edq),
    PAUSE_LIVE(2131234516, R.string.dw2),
    SETTING(2131234494, R.string.e7g),
    COMMENT(2131234419, R.string.gyb),
    STREAM_KEY(2131234589, R.string.emx),
    TOPICS(2131234878, R.string.ec7),
    TASK(2131233985, R.string.eew),
    BEAUTY(2131234594, R.string.eaf),
    STICKER(2131234497, R.string.e8j),
    PROPS(2131234493, R.string.duh),
    GIFT(R.layout.bg3),
    FAST_GIFT(R.layout.bg3),
    BROADCAST_GIFT(2131234439, R.string.eak),
    DUMMY_GIFT(2131234653, R.string.gqz),
    DUMMY_FAST_GIFT(R.layout.bg3),
    DUMMY_BROADCAST_GIFT(2131234652, R.string.eak),
    REDENVELOPE(2131234600, R.string.eox);
    
    private int drawable;
    public boolean isButtonVisible = true;
    public boolean isEnableClick = true;
    public boolean isRedDotVisible;
    private Integer layoutId;
    private int titleId;

    public final int getDrawable() {
        return this.drawable;
    }

    public final Integer getLayoutId() {
        return this.layoutId;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    private static g a() {
        return ((h) a.a(h.class)).toolbarManager();
    }

    public final Integer getRTLDrawable() {
        if (!y.g() || m.f12165a[ordinal()] != 1) {
            return null;
        }
        return 2131234539;
    }

    static {
        Covode.recordClassIndex(6677);
    }

    public final View getView(DataChannel dataChannel) {
        g a2 = a();
        if (a2 != null) {
            return a2.a(this);
        }
        return null;
    }

    public final z hide(DataChannel dataChannel) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.c(this, dataChannel);
        return z.f158842a;
    }

    public final z hideRedDot(DataChannel dataChannel) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, dataChannel, false);
        return z.f158842a;
    }

    public final boolean isRedDotShowing(DataChannel dataChannel) {
        g a2 = a();
        if (a2 != null) {
            return a2.d(this, dataChannel);
        }
        return false;
    }

    public final z show(DataChannel dataChannel) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.b(this, dataChannel);
        return z.f158842a;
    }

    public final z showRedDot(DataChannel dataChannel) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, dataChannel, true);
        return z.f158842a;
    }

    public final z unload(DataChannel dataChannel) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, dataChannel);
        return z.f158842a;
    }

    public final z setBackgroundResource(DataChannel dataChannel, int i2) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, i2);
        return z.f158842a;
    }

    public final z setEnableClick(DataChannel dataChannel, boolean z) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.b(this, dataChannel, z);
        return z.f158842a;
    }

    public final z setRedDotVisible(DataChannel dataChannel, boolean z) {
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, dataChannel, z);
        return z.f158842a;
    }

    public final z load(DataChannel dataChannel, f fVar) {
        h.f.b.l.d(fVar, "");
        g a2 = a();
        if (a2 == null) {
            return null;
        }
        a2.a(this, dataChannel, fVar);
        return z.f158842a;
    }

    private l(int i2) {
        this.layoutId = Integer.valueOf(i2);
    }

    public final void load(DataChannel dataChannel, f fVar, boolean z) {
        h.f.b.l.d(fVar, "");
        this.isButtonVisible = z;
        g a2 = a();
        if (a2 != null) {
            a2.a(this, dataChannel, fVar);
        }
    }

    private l(int i2, int i3) {
        this.drawable = i2;
        this.titleId = i3;
    }
}
