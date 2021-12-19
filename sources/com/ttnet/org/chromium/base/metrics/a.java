package com.ttnet.org.chromium.base.metrics;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.library_loader.LibraryLoader;
import java.util.ArrayList;
import java.util.List;

public class a {
    static {
        Covode.recordClassIndex(103329);
    }

    static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public static final List<b> f155279a = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ boolean f155280d = true;

        /* renamed from: b  reason: collision with root package name */
        protected final String f155281b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f155282c;

        static {
            Covode.recordClassIndex(103331);
        }

        /* access modifiers changed from: protected */
        public final void a() {
            if (!f155280d && !Thread.holdsLock(f155279a)) {
                throw new AssertionError();
            } else if (!this.f155282c) {
                f155279a.add(this);
                this.f155282c = true;
            }
        }

        protected b(String str) {
            this.f155281b = str;
        }
    }

    /* renamed from: com.ttnet.org.chromium.base.metrics.a$a  reason: collision with other inner class name */
    public static class C4115a extends b {

        /* renamed from: e  reason: collision with root package name */
        private final List<Boolean> f155278e = new ArrayList();

        static {
            Covode.recordClassIndex(103330);
        }

        public C4115a(String str) {
            super(str);
        }

        public final void a(boolean z) {
            MethodCollector.i(11883);
            synchronized (b.f155279a) {
                try {
                    if (LibraryLoader.f155253b.f155256c) {
                        RecordHistogram.a(this.f155281b, z);
                    } else {
                        this.f155278e.add(Boolean.valueOf(z));
                        a();
                    }
                } finally {
                    MethodCollector.o(11883);
                }
            }
        }
    }

    public static class c extends b {

        /* renamed from: e  reason: collision with root package name */
        private final List<Integer> f155283e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final int f155284f = 2;

        static {
            Covode.recordClassIndex(103332);
        }

        public c(String str) {
            super(str);
        }
    }
}
