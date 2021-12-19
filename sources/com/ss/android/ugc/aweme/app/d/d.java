package com.ss.android.ugc.aweme.app.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.Map;

public final class d implements AttachUserData {
    static {
        Covode.recordClassIndex(41057);
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return null;
    }
}
