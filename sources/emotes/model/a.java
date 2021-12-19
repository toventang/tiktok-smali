package emotes.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.emoji.e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class a implements b<EmoteListResult> {
    static {
        Covode.recordClassIndex(104346);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ EmoteListResult a(f fVar) {
        return b(fVar);
    }

    public static EmoteListResult b(f fVar) {
        EmoteListResult emoteListResult = new EmoteListResult();
        emoteListResult.emoteList = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return emoteListResult;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                emoteListResult.emoteList.add(e.b(fVar));
            }
        }
    }
}
