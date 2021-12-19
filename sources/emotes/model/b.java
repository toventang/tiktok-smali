package emotes.model;

import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.live.base.model.emoji.d;
import com.bytedance.covode.number.Covode;

public final class b implements com.bytedance.android.e.a.a.b<SubEmoteDetailResult> {
    static {
        Covode.recordClassIndex(104347);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ SubEmoteDetailResult a(f fVar) {
        SubEmoteDetailResult subEmoteDetailResult = new SubEmoteDetailResult();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return subEmoteDetailResult;
            } else if (b2 == 1) {
                subEmoteDetailResult.stableEmoteDetail = a.b(fVar);
            } else if (b2 == 2) {
                subEmoteDetailResult.currentEmoteDetail = a.b(fVar);
            } else if (b2 == 3) {
                subEmoteDetailResult.emoteConfig = d.b(fVar);
            } else if (b2 != 4) {
                g.c(fVar);
            } else {
                subEmoteDetailResult.currentState = fVar.e();
            }
        }
    }
}
