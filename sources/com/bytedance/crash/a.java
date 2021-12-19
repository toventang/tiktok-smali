package com.bytedance.crash;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.util.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends q<CrashType, AttachUserData> {
    public ICrashFilter mFilter;
    final Map<String, String> mTagMap = new HashMap();

    static {
        Covode.recordClassIndex(16133);
    }

    public final ICrashFilter getCrashFilter() {
        return this.mFilter;
    }

    public final Map<String, String> getTagMap() {
        return this.mTagMap;
    }

    public final List<AttachUserData> getAttachUserData(CrashType crashType) {
        return getList(crashType);
    }

    /* access modifiers changed from: package-private */
    public final void a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            removeAll(attachUserData);
        } else {
            removeInList(crashType, attachUserData);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if (str2 == null) {
            this.mTagMap.remove(str);
        } else {
            this.mTagMap.put(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            addMulti(attachUserData, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE, CrashType.CUSTOM_JAVA);
            return;
        }
        add(crashType, attachUserData);
    }
}
