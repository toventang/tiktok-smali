package com.ss.android.ugc.aweme.prop.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.model.g;
import java.util.ArrayList;
import java.util.List;

public final class e extends s {
    public List<g> I;
    public String J;

    static {
        Covode.recordClassIndex(76778);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s
    public final SmartRoute a(Aweme aweme, s.c cVar) {
        SmartRoute a2 = super.a(aweme, cVar);
        if (this.I != null) {
            a2.withParam("feed_data_sticker_model", new ArrayList(this.I));
        }
        String str = this.J;
        if (str != null) {
            a2.withParam("feed_data_sticker_group_id", str);
        }
        return a2;
    }
}
