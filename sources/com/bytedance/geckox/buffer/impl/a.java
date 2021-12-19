package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;

public final class a {
    static {
        Covode.recordClassIndex(17275);
    }

    public static com.bytedance.geckox.buffer.a a(File file, long j2) {
        if (j2 <= 0) {
            try {
                return new b(file);
            } catch (Exception e2) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e2.getMessage(), e2);
            }
        } else {
            try {
                return new MMapBuffer(j2, file);
            } catch (Exception unused) {
                com.bytedance.geckox.i.a.a();
                try {
                    return new c(j2, file);
                } catch (Exception e3) {
                    throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e3.getMessage(), e3);
                }
            }
        }
    }
}
