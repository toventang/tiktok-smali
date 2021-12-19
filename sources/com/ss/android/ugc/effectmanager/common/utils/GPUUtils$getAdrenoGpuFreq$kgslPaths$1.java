package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public final class GPUUtils$getAdrenoGpuFreq$kgslPaths$1 implements FilenameFilter {
    public static final GPUUtils$getAdrenoGpuFreq$kgslPaths$1 INSTANCE = new GPUUtils$getAdrenoGpuFreq$kgslPaths$1();

    static {
        Covode.recordClassIndex(95341);
    }

    GPUUtils$getAdrenoGpuFreq$kgslPaths$1() {
    }

    public final boolean accept(File file, String str) {
        l.a((Object) file, "");
        if (file.isDirectory()) {
            l.a((Object) str, "");
            if (p.a((CharSequence) str, (CharSequence) "kgsl", false)) {
                return true;
            }
        }
        return false;
    }
}
