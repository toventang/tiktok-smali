package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class InteractionTagInfo implements Serializable {
    @c(a = "interest_level")
    public int interestLevel;
    @c(a = "tagged_users")
    public List<InteractionTagUserInfo> taggedUsers;
    @c(a = "video_label_text")
    public String videoLabelText;

    static {
        Covode.recordClassIndex(59405);
    }

    public InteractionTagInfo() {
        this(0, null, null, 7, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.InteractionTagInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InteractionTagInfo copy$default(InteractionTagInfo interactionTagInfo, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = interactionTagInfo.interestLevel;
        }
        if ((i3 & 2) != 0) {
            str = interactionTagInfo.videoLabelText;
        }
        if ((i3 & 4) != 0) {
            list = interactionTagInfo.taggedUsers;
        }
        return interactionTagInfo.copy(i2, str, list);
    }

    public final int component1() {
        return this.interestLevel;
    }

    public final String component2() {
        return this.videoLabelText;
    }

    public final List<InteractionTagUserInfo> component3() {
        return this.taggedUsers;
    }

    public final InteractionTagInfo copy(int i2, String str, List<InteractionTagUserInfo> list) {
        l.d(str, "");
        return new InteractionTagInfo(i2, str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionTagInfo)) {
            return false;
        }
        InteractionTagInfo interactionTagInfo = (InteractionTagInfo) obj;
        return this.interestLevel == interactionTagInfo.interestLevel && l.a(this.videoLabelText, interactionTagInfo.videoLabelText) && l.a(this.taggedUsers, interactionTagInfo.taggedUsers);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.interestLevel) * 31;
        String str = this.videoLabelText;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_model_InteractionTagInfo_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<InteractionTagUserInfo> list = this.taggedUsers;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "InteractionTagInfo(interestLevel=" + this.interestLevel + ", videoLabelText=" + this.videoLabelText + ", taggedUsers=" + this.taggedUsers + ")";
    }

    public final int getInterestLevel() {
        return this.interestLevel;
    }

    public final List<InteractionTagUserInfo> getTaggedUsers() {
        return this.taggedUsers;
    }

    public final String getVideoLabelText() {
        return this.videoLabelText;
    }

    public final void setInterestLevel(int i2) {
        this.interestLevel = i2;
    }

    public final void setTaggedUsers(List<InteractionTagUserInfo> list) {
        this.taggedUsers = list;
    }

    public final void setVideoLabelText(String str) {
        l.d(str, "");
        this.videoLabelText = str;
    }

    public InteractionTagInfo(int i2, String str, List<InteractionTagUserInfo> list) {
        l.d(str, "");
        this.interestLevel = i2;
        this.videoLabelText = str;
        this.taggedUsers = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteractionTagInfo(int i2, String str, List list, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : list);
    }
}
