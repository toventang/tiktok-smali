package com.ss.android.ugc.effectmanager.common.cachemanager;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public final class FileICache$removePattern$$inlined$apply$lambda$1 implements FilenameFilter {
    final /* synthetic */ Pattern $this_apply$inlined;
    final /* synthetic */ FileICache this$0;

    static {
        Covode.recordClassIndex(95272);
    }

    FileICache$removePattern$$inlined$apply$lambda$1(Pattern pattern, FileICache fileICache) {
        this.$this_apply$inlined = pattern;
        this.this$0 = fileICache;
    }

    public final boolean accept(File file, String str) {
        return this.$this_apply$inlined.matcher(str).matches();
    }
}
