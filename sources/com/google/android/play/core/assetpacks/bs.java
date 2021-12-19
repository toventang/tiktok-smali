package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bs implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    private final String f52915a;

    static {
        Covode.recordClassIndex(32711);
    }

    bs(String str) {
        this.f52915a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f52915a).concat("-")) && str.endsWith(".apk");
    }
}
