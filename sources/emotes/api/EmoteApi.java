package emotes.api;

import com.bytedance.android.live.network.a.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import emotes.model.SubEmoteDetailResult;
import f.a.t;

public interface EmoteApi {
    static {
        Covode.recordClassIndex(104323);
    }

    @h(a = "/webcast/sub/privilege/get_sub_emote_detail/")
    @a(a = a.EnumC0254a.ROOM)
    t<d<SubEmoteDetailResult>> getEmotesDetail(@z(a = "for_anchor") boolean z, @z(a = "sec_anchor_id") String str);
}
