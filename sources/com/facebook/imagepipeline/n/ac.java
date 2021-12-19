package com.facebook.imagepipeline.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class ac extends aa {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f48126a;

    static {
        Covode.recordClassIndex(29082);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "LocalResourceFetchProducer";
    }

    private static int c(b bVar) {
        return Integer.parseInt(bVar.mSourceUri.getPath().substring(1));
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        MethodCollector.i(13882);
        e b2 = b(this.f48126a.openRawResource(c(bVar)), b(bVar));
        MethodCollector.o(13882);
        return b2;
    }

    private int b(b bVar) {
        MethodCollector.i(13932);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f48126a.openRawResourceFd(c(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.o(13932);
            return length;
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            MethodCollector.o(13932);
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            MethodCollector.o(13932);
            throw th;
        }
    }

    public ac(Executor executor, i iVar, Resources resources) {
        super(executor, iVar);
        this.f48126a = resources;
    }
}
