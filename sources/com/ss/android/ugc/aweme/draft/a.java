package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.c;
import h.f.b.l;
import java.util.List;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f83129a;

    static {
        Covode.recordClassIndex(51832);
    }

    @Override // com.ss.android.ugc.aweme.draft.d
    public final DraftCheckResult a() {
        List<String> list;
        CanvasVideoData canvasVideoData = this.f83129a.W.bo;
        if (canvasVideoData != null) {
            list = canvasVideoData.getSourceInfo();
        } else {
            list = null;
        }
        return e.a(list);
    }

    public a(c cVar) {
        l.d(cVar, "");
        this.f83129a = cVar;
    }
}
