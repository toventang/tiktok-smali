package com.bytedance.android.live.d;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;
import h.p;

public interface b extends a {
    static {
        Covode.recordClassIndex(4769);
    }

    p<String, String> getNextLowerLevelDefinition();

    boolean isAudienceLowestDefinition();

    void reportAnchorDefinitionBtnShow();

    void reportAudienceDefinitionBtnShow(String str, String str2, String str3);

    void reportAudienceDefinitionDialogSelectSuccess(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void reportAudienceDefinitionTipsShow(String str, String str2, String str3);

    void reportAudienceRotateBtnClick(String str, long j2, String str2);

    void reportAudienceRotateBtnShow(String str);

    void showDefinitionSelectionDialog(Context context, boolean z);
}
