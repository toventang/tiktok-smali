package com.ss.android.ugc.aweme.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public final ExtractFramesModel f69587a;

    static {
        Covode.recordClassIndex(42926);
    }

    public d(ExtractFramesModel extractFramesModel) {
        super((byte) 0);
        this.f69587a = extractFramesModel;
    }

    @Override // com.ss.android.ugc.aweme.c.e
    public final boolean a(e eVar) {
        String str;
        List<FrameItem> allFrames;
        FrameItem frameItem;
        List<FrameItem> allFrames2;
        FrameItem frameItem2;
        l.d(eVar, "");
        if (l.a(eVar, this)) {
            return true;
        }
        if (!(eVar instanceof d)) {
            return false;
        }
        d dVar = (d) eVar;
        if (l.a(dVar.f69587a, this.f69587a)) {
            return true;
        }
        ExtractFramesModel extractFramesModel = this.f69587a;
        String str2 = null;
        if (extractFramesModel == null || (allFrames2 = extractFramesModel.getAllFrames()) == null || (frameItem2 = (FrameItem) n.j((List) allFrames2)) == null) {
            str = null;
        } else {
            str = frameItem2.getPath();
        }
        ExtractFramesModel extractFramesModel2 = dVar.f69587a;
        if (!(extractFramesModel2 == null || (allFrames = extractFramesModel2.getAllFrames()) == null || (frameItem = (FrameItem) n.j((List) allFrames)) == null)) {
            str2 = frameItem.getPath();
        }
        return l.a((Object) str, (Object) str2);
    }
}
