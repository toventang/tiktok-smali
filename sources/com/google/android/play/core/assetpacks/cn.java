package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cn implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    static final FilenameFilter f52994a = new cn();

    static {
        Covode.recordClassIndex(32733);
    }

    private cn() {
    }

    public final boolean accept(File file, String str) {
        return co.f52995a.matcher(str).matches();
    }
}
