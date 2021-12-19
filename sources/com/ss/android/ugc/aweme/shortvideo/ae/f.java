package com.ss.android.ugc.aweme.shortvideo.ae;

import com.bytedance.covode.number.Covode;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.tools.utils.q;
import java.util.ArrayList;
import java.util.List;

public final class f implements com.google.c.a.f<AVTextExtraStruct, TextExtraStruct> {
    static {
        Covode.recordClassIndex(82059);
    }

    public static ArrayList<TextExtraStruct> a(List<AVTextExtraStruct> list) {
        if (list == null) {
            return null;
        }
        return ap.a((Iterable) ap.a(list, new f()));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.c.a.f
    public final /* synthetic */ TextExtraStruct a(AVTextExtraStruct aVTextExtraStruct) {
        AVTextExtraStruct aVTextExtraStruct2 = aVTextExtraStruct;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setCid(aVTextExtraStruct2.getCid());
        textExtraStruct.setHashTagName(aVTextExtraStruct2.getHashTagName());
        textExtraStruct.setUserId(aVTextExtraStruct2.getUserId());
        textExtraStruct.setAtUserType(aVTextExtraStruct2.getAtUserType());
        textExtraStruct.setType(aVTextExtraStruct2.getType());
        textExtraStruct.setStart(aVTextExtraStruct2.getStart());
        textExtraStruct.setEnd(aVTextExtraStruct2.getEnd());
        textExtraStruct.setAwemeId(aVTextExtraStruct2.getAwemeId());
        textExtraStruct.setSubType(aVTextExtraStruct2.getSubType());
        textExtraStruct.setSecUid(aVTextExtraStruct2.getmSecUid());
        if (aVTextExtraStruct2.getStart() < 0 || aVTextExtraStruct2.getEnd() < 0) {
            q.a("TextExtraStruct#getStart && TextExtraStruct#getEnd must be >= 0, actual: " + aVTextExtraStruct2.toString());
        }
        return textExtraStruct;
    }
}
