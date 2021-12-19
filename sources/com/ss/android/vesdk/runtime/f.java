package com.ss.android.vesdk.runtime;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.an;
import java.io.File;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private String f151454a;

    static {
        Covode.recordClassIndex(99581);
    }

    public final String a() {
        return a(DataType.AUDIO) + File.separator + System.currentTimeMillis() + "_record.wav";
    }

    public f(String str) {
        this.f151454a = str;
    }

    private String a(String str) {
        File file = new File(this.f151454a, str);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        an.d("VEResManager", "mkdirs failed, workspace path: " + this.f151454a);
        return "";
    }

    public static String a(String str, String str2) {
        File file = new File(str, str2);
        if (file.exists() || file.mkdirs()) {
            return file.getAbsolutePath();
        }
        an.d("VEResManager", "mkdirs failed, workspace path: ".concat(String.valueOf(str)));
        return "";
    }
}
