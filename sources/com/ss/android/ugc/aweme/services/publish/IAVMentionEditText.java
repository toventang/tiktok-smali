package com.ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

public interface IAVMentionEditText {
    static {
        Covode.recordClassIndex(79772);
    }

    void addHashTag(String str);

    boolean addMentionText(int i2, String str, String str2, String str3, boolean z);

    List<TextExtraStruct> getStarAtlasExtraList();

    void removeHashTag();

    void removeStarAtlas();

    void setStarAtlasMentionTextColor(int i2);
}
