package com.ss.android.ugc.aweme.challenge.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Challenge f69918a;

    static {
        Covode.recordClassIndex(43115);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f69918a, ((a) obj).f69918a);
        }
        return true;
    }

    public final int hashCode() {
        Challenge challenge = this.f69918a;
        if (challenge != null) {
            return challenge.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ChallengeCollectEvent(challenge=" + this.f69918a + ")";
    }

    public a(Challenge challenge) {
        l.d(challenge, "");
        this.f69918a = challenge;
    }
}
