package com.bytedance.covode.number;

import android.content.Context;
import java.io.File;

public abstract class Covode {

    public interface b {
        boolean a(File file);
    }

    /* access modifiers changed from: protected */
    public abstract boolean report(b bVar);

    /* access modifiers changed from: protected */
    public abstract boolean start(a aVar);

    private static CovodeNumberImpl getImpl() {
        return CovodeNumberImpl.f27397a;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.covode.a.a f27395a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f27396b;

        public final a a(String str) {
            this.f27395a.f27390a = str;
            return this;
        }

        public a(Context context) {
            com.bytedance.covode.a.a aVar = new com.bytedance.covode.a.a();
            this.f27395a = aVar;
            aVar.f27391b = context;
        }

        public final a a(boolean z) {
            this.f27395a.f27392c = z;
            return this;
        }
    }

    public static boolean reportCollections(b bVar) {
        return getImpl().report(bVar);
    }

    public static boolean startCollecting(a aVar) {
        return getImpl().start(aVar);
    }

    public static void recordClassIndex(int i2) {
        CovodeNumberImpl impl = getImpl();
        if (impl.f27399b == null) {
            a aVar = CovodeNumberImpl.f27398c;
            if (aVar != null && aVar.f27404c) {
                if (i2 < 32767) {
                    aVar.f27403b.add(Short.valueOf((short) i2));
                } else {
                    aVar.f27402a.add(Integer.valueOf(i2));
                }
            }
        } else if (impl.f27399b.f27396b) {
            impl.recordClassIndexToFile(i2);
        }
    }
}
