package com.ss.android.ugc.aweme.crossplatform.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f78489a;

    static {
        Covode.recordClassIndex(48754);
    }

    public final void a() {
        this.f78489a.compareAndSet(false, true);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static d f78490a = new d((byte) 0);

        static {
            Covode.recordClassIndex(48755);
        }
    }

    private d() {
        this.f78489a = new AtomicBoolean(false);
    }

    /* synthetic */ d(byte b2) {
        this();
    }
}
