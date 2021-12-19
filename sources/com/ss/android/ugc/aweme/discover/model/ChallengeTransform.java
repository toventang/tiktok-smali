package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ChallengeTransform implements Serializable {
    @c(a = "action")
    public String action;
    @c(a = "icon")
    public UrlModel iconUrlModel;
    @c(a = "text")
    public String text;

    static {
        Covode.recordClassIndex(50883);
    }

    public ChallengeTransform() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChallengeTransform copy$default(ChallengeTransform challengeTransform, String str, UrlModel urlModel, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = challengeTransform.text;
        }
        if ((i2 & 2) != 0) {
            urlModel = challengeTransform.iconUrlModel;
        }
        if ((i2 & 4) != 0) {
            str2 = challengeTransform.action;
        }
        return challengeTransform.copy(str, urlModel, str2);
    }

    public final String component1() {
        return this.text;
    }

    public final UrlModel component2() {
        return this.iconUrlModel;
    }

    public final String component3() {
        return this.action;
    }

    public final ChallengeTransform copy(String str, UrlModel urlModel, String str2) {
        return new ChallengeTransform(str, urlModel, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeTransform)) {
            return false;
        }
        ChallengeTransform challengeTransform = (ChallengeTransform) obj;
        return l.a(this.text, challengeTransform.text) && l.a(this.iconUrlModel, challengeTransform.iconUrlModel) && l.a(this.action, challengeTransform.action);
    }

    public final int hashCode() {
        String str = this.text;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.iconUrlModel;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.action;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ChallengeTransform(text=" + this.text + ", iconUrlModel=" + this.iconUrlModel + ", action=" + this.action + ")";
    }

    public final String getAction() {
        return this.action;
    }

    public final UrlModel getIconUrlModel() {
        return this.iconUrlModel;
    }

    public final String getText() {
        return this.text;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setIconUrlModel(UrlModel urlModel) {
        this.iconUrlModel = urlModel;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public ChallengeTransform(String str, UrlModel urlModel, String str2) {
        this.text = str;
        this.iconUrlModel = urlModel;
        this.action = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeTransform(String str, UrlModel urlModel, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : urlModel, (i2 & 4) != 0 ? null : str2);
    }
}
