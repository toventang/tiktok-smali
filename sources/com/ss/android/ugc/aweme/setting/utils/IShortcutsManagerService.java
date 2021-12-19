package com.ss.android.ugc.aweme.setting.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface IShortcutsManagerService {
    static {
        Covode.recordClassIndex(80789);
    }

    void clearClearCacheHelpShortcut(Context context);
}
