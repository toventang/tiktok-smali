package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class InteractionTagLabelEvent implements b {
    public final Aweme aweme;

    static {
        Covode.recordClassIndex(59409);
    }

    public static /* synthetic */ InteractionTagLabelEvent copy$default(InteractionTagLabelEvent interactionTagLabelEvent, Aweme aweme2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme2 = interactionTagLabelEvent.aweme;
        }
        return interactionTagLabelEvent.copy(aweme2);
    }

    public final InteractionTagLabelEvent copy(Aweme aweme2) {
        l.d(aweme2, "");
        return new InteractionTagLabelEvent(aweme2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InteractionTagLabelEvent) && l.a(this.aweme, ((InteractionTagLabelEvent) obj).aweme);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            return aweme2.hashCode();
        }
        return 0;
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public final String toString() {
        return "InteractionTagLabelEvent(aweme=" + this.aweme + ")";
    }

    public InteractionTagLabelEvent(Aweme aweme2) {
        l.d(aweme2, "");
        this.aweme = aweme2;
    }
}
