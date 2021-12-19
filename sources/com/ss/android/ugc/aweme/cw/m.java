package com.ss.android.ugc.aweme.cw;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private n f79179a;

    /* renamed from: b  reason: collision with root package name */
    private a f79180b;

    public interface a {
        static {
            Covode.recordClassIndex(49134);
        }

        ExecutorService a(l lVar);
    }

    static {
        Covode.recordClassIndex(49133);
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final m f79181a = new m((byte) 0);

        static {
            Covode.recordClassIndex(49135);
        }
    }

    private m() {
        this.f79179a = new n();
        this.f79180b = new d();
    }

    /* synthetic */ m(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final ExecutorService a(l lVar, boolean z) {
        ExecutorService a2 = this.f79180b.a(lVar);
        if (g.f79144a.f79151a) {
            this.f79179a.a(lVar.f79165a, a2, z);
        }
        return a2;
    }
}
