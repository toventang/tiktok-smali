package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class InteractionTagInfoEvent implements b {
    public final Aweme aweme;

    static {
        Covode.recordClassIndex(59406);
    }

    public static /* synthetic */ InteractionTagInfoEvent copy$default(InteractionTagInfoEvent interactionTagInfoEvent, Aweme aweme2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aweme2 = interactionTagInfoEvent.aweme;
        }
        return interactionTagInfoEvent.copy(aweme2);
    }

    public final InteractionTagInfoEvent copy(Aweme aweme2) {
        l.d(aweme2, "");
        return new InteractionTagInfoEvent(aweme2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InteractionTagInfoEvent) && l.a(this.aweme, ((InteractionTagInfoEvent) obj).aweme);
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
        return "InteractionTagInfoEvent(aweme=" + this.aweme + ")";
    }

    public InteractionTagInfoEvent(Aweme aweme2) {
        l.d(aweme2, "");
        this.aweme = aweme2;
    }
}
