package com.facebook.imagepipeline.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.i;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.o.b;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class w extends aa {

    /* renamed from: a  reason: collision with root package name */
    private final AssetManager f48421a;

    static {
        Covode.recordClassIndex(29189);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final String a() {
        return "LocalAssetFetchProducer";
    }

    private static String c(b bVar) {
        return bVar.mSourceUri.getPath().substring(1);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.n.aa
    public final e a(b bVar) {
        MethodCollector.i(13983);
        e b2 = b(this.f48421a.open(c(bVar), 2), b(bVar));
        MethodCollector.o(13983);
        return b2;
    }

    private int b(b bVar) {
        MethodCollector.i(14044);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = this.f48421a.openFd(c(bVar));
            int length = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.o(14044);
            return length;
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            MethodCollector.o(14044);
            return -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            MethodCollector.o(14044);
            throw th;
        }
    }

    public w(Executor executor, i iVar, AssetManager assetManager) {
        super(executor, iVar);
        this.f48421a = assetManager;
    }
}
