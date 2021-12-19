package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class AVTextExtraStructHelper {
    public static final AVTextExtraStructHelper INSTANCE = new AVTextExtraStructHelper();

    private AVTextExtraStructHelper() {
    }

    static {
        Covode.recordClassIndex(84403);
    }

    public static final AVTextExtraStruct createCommentStruct(int i2, int i3, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 2;
        aVTextExtraStruct.start = i2;
        aVTextExtraStruct.end = i3;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createQuestionStruct(int i2, int i3, String str) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 3;
        aVTextExtraStruct.start = i2;
        aVTextExtraStruct.end = i3;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createAtStruct(int i2, int i3, String str, String str2) {
        l.d(str, "");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.start = i2;
        aVTextExtraStruct.end = i3;
        aVTextExtraStruct.userId = str;
        if (str2 == null) {
            str2 = "";
        }
        aVTextExtraStruct.mSecUid = str2;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createDuetStruct(int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.atUserType = "";
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = 1;
        aVTextExtraStruct.start = i2;
        aVTextExtraStruct.end = i3;
        aVTextExtraStruct.userId = str;
        aVTextExtraStruct.awemeId = str2;
        return aVTextExtraStruct;
    }

    public static final AVTextExtraStruct createQaStickerStruct(int i2, int i3, String str, int i4) {
        AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
        aVTextExtraStruct.type = 0;
        aVTextExtraStruct.subType = i4;
        aVTextExtraStruct.start = i2;
        aVTextExtraStruct.end = i3;
        aVTextExtraStruct.userId = str;
        return aVTextExtraStruct;
    }
}
