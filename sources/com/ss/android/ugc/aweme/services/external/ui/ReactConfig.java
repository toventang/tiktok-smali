package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import h.f.b.l;

public final class ReactConfig {
    private final int minDuration;
    private final String originVideo;
    private final String outputDir;
    private final ReactionParams params;
    private final User reactionFromAuthor;

    static {
        Covode.recordClassIndex(79712);
    }

    public static int com_ss_android_ugc_aweme_services_external_ui_ReactConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ ReactConfig copy$default(ReactConfig reactConfig, String str, String str2, ReactionParams reactionParams, User user, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = reactConfig.originVideo;
        }
        if ((i3 & 2) != 0) {
            str2 = reactConfig.outputDir;
        }
        if ((i3 & 4) != 0) {
            reactionParams = reactConfig.params;
        }
        if ((i3 & 8) != 0) {
            user = reactConfig.reactionFromAuthor;
        }
        if ((i3 & 16) != 0) {
            i2 = reactConfig.minDuration;
        }
        return reactConfig.copy(str, str2, reactionParams, user, i2);
    }

    public final String component1() {
        return this.originVideo;
    }

    public final String component2() {
        return this.outputDir;
    }

    public final ReactionParams component3() {
        return this.params;
    }

    public final User component4() {
        return this.reactionFromAuthor;
    }

    public final int component5() {
        return this.minDuration;
    }

    public final ReactConfig copy(String str, String str2, ReactionParams reactionParams, User user, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(reactionParams, "");
        l.d(user, "");
        return new ReactConfig(str, str2, reactionParams, user, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactConfig)) {
            return false;
        }
        ReactConfig reactConfig = (ReactConfig) obj;
        return l.a(this.originVideo, reactConfig.originVideo) && l.a(this.outputDir, reactConfig.outputDir) && l.a(this.params, reactConfig.params) && l.a(this.reactionFromAuthor, reactConfig.reactionFromAuthor) && this.minDuration == reactConfig.minDuration;
    }

    public final int hashCode() {
        String str = this.originVideo;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.outputDir;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ReactionParams reactionParams = this.params;
        int hashCode3 = (hashCode2 + (reactionParams != null ? reactionParams.hashCode() : 0)) * 31;
        User user = this.reactionFromAuthor;
        if (user != null) {
            i2 = user.hashCode();
        }
        return ((hashCode3 + i2) * 31) + com_ss_android_ugc_aweme_services_external_ui_ReactConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.minDuration);
    }

    public final String toString() {
        return "ReactConfig(originVideo=" + this.originVideo + ", outputDir=" + this.outputDir + ", params=" + this.params + ", reactionFromAuthor=" + this.reactionFromAuthor + ", minDuration=" + this.minDuration + ")";
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getOutputDir() {
        return this.outputDir;
    }

    public final ReactionParams getParams() {
        return this.params;
    }

    public final User getReactionFromAuthor() {
        return this.reactionFromAuthor;
    }

    public ReactConfig(String str, String str2, ReactionParams reactionParams, User user, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(reactionParams, "");
        l.d(user, "");
        this.originVideo = str;
        this.outputDir = str2;
        this.params = reactionParams;
        this.reactionFromAuthor = user;
        this.minDuration = i2;
    }
}
