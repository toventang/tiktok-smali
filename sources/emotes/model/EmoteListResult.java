package emotes.model;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class EmoteListResult {
    @c(a = "emote_list")
    List<EmoteModel> emoteList;

    static {
        Covode.recordClassIndex(104344);
    }

    public List<EmoteModel> getEmoteList() {
        return this.emoteList;
    }

    public void setEmoteList(List<EmoteModel> list) {
        this.emoteList = list;
    }
}
