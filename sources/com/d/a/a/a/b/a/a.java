package com.d.a.a.a.b.a;

import com.bytedance.covode.number.Covode;

public enum a {
    CLICK("click"),
    INVITATION_ACCEPTED("invitationAccept");
    
    String interactionType;

    static {
        Covode.recordClassIndex(28295);
    }

    private a(String str) {
        this.interactionType = str;
    }

    public final String toString() {
        return this.interactionType;
    }
}
