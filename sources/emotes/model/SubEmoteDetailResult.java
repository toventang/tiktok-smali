package emotes.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class SubEmoteDetailResult {
    @c(a = "current_emote_detail")
    EmoteListResult currentEmoteDetail;
    @c(a = "current_status")
    int currentState;
    @c(a = "emote_config")
    com.bytedance.android.live.base.model.emoji.c emoteConfig;
    @c(a = "stable_emote_detail")
    EmoteListResult stableEmoteDetail;

    static {
        Covode.recordClassIndex(104345);
    }

    public EmoteListResult getCurrentEmoteDetail() {
        return this.currentEmoteDetail;
    }

    public int getCurrentState() {
        return this.currentState;
    }

    public com.bytedance.android.live.base.model.emoji.c getEmoteConfig() {
        return this.emoteConfig;
    }

    public EmoteListResult getStableEmoteDetail() {
        return this.stableEmoteDetail;
    }

    public void setCurrentEmoteDetail(EmoteListResult emoteListResult) {
        this.currentEmoteDetail = emoteListResult;
    }

    public void setCurrentState(int i2) {
        this.currentState = i2;
    }

    public void setEmoteConfig(com.bytedance.android.live.base.model.emoji.c cVar) {
        this.emoteConfig = cVar;
    }

    public void setStableEmoteDetail(EmoteListResult emoteListResult) {
        this.stableEmoteDetail = emoteListResult;
    }
}
