package com.ss.android.ugc.effectmanager.algorithm;

import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.common.ModelNameProcessor;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.regex.Pattern;

public final class AssetManagerWrapper {
    private final AssetManager mAssetManager;
    private final Pattern mExclusionPattern;

    static {
        Covode.recordClassIndex(95209);
    }

    public final AssetManager getWrapped() {
        return this.mAssetManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000d, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean exists(java.lang.String r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r1.open(r2)     // Catch:{ IOException -> 0x000d, all -> 0x000b }
            if (r0 == 0) goto L_0x0009
            r0.close()     // Catch:{ IOException -> 0x0009 }
        L_0x0009:
            r0 = 1
            return r0
        L_0x000b:
            r0 = move-exception
            throw r0
        L_0x000d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.algorithm.AssetManagerWrapper.exists(java.lang.String):boolean");
    }

    public final InputStream open(String str) {
        MethodCollector.i(922);
        String nameOfModel = ModelNameProcessor.getNameOfModel(str);
        Pattern pattern = this.mExclusionPattern;
        if (pattern == null || !pattern.matcher(nameOfModel).matches()) {
            InputStream open = this.mAssetManager.open(str, 2);
            MethodCollector.o(922);
            return open;
        }
        FileNotFoundException fileNotFoundException = new FileNotFoundException(str + " manually excluded by DownloadableModelSupport.exclusionPattern");
        MethodCollector.o(922);
        throw fileNotFoundException;
    }

    public AssetManagerWrapper(AssetManager assetManager, Pattern pattern) {
        this.mAssetManager = assetManager;
        this.mExclusionPattern = pattern;
    }
}
