package com.ss.android.ugc.aweme.services.superentrance;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.g;

public final class SuperEntranceEvent implements b {
    public static final Companion Companion = new Companion(null);
    private String iconUrl;
    private boolean show;
    private String tipText;
    private int type;

    static {
        Covode.recordClassIndex(79833);
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79834);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final boolean getShow() {
        return this.show;
    }

    public final String getTipText() {
        return this.tipText;
    }

    public final int getType() {
        return this.type;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setTipText(String str) {
        this.tipText = str;
    }

    public final void setType(int i2) {
        this.type = i2;
    }

    public SuperEntranceEvent(int i2, boolean z) {
        this.type = i2;
        this.show = z;
    }
}
