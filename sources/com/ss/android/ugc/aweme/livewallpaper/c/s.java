package com.ss.android.ugc.aweme.livewallpaper.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.livewallpaper.c.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class s implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public final int f108861a;

    /* renamed from: b  reason: collision with root package name */
    public final int f108862b;

    /* renamed from: c  reason: collision with root package name */
    public String f108863c = "TextureQueue";

    /* renamed from: d  reason: collision with root package name */
    private final int f108864d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f108865e;

    /* renamed from: f  reason: collision with root package name */
    private List<h> f108866f;

    /* renamed from: g  reason: collision with root package name */
    private List<h> f108867g;

    static {
        Covode.recordClassIndex(69714);
    }

    /* access modifiers changed from: package-private */
    public static class a extends n implements n.b {
        static {
            Covode.recordClassIndex(69715);
        }

        @Override // com.ss.android.ugc.aweme.livewallpaper.c.n
        public final void e() {
            super.e();
        }

        @Override // com.ss.android.ugc.aweme.livewallpaper.c.n.b
        public final void a(h hVar) {
            this.f108832a = null;
        }

        private a(int i2, int i3, int i4, n.b bVar) {
            super(i2, i3, i4, bVar);
        }

        public static h a(int i2, int i3, int i4, n.b bVar) {
            return new a(i4, i2, i3, bVar);
        }
    }

    public final void b() {
        MethodCollector.i(9494);
        synchronized (this) {
            try {
                a(this.f108866f);
                a(this.f108867g);
                synchronized (this.f108866f) {
                    try {
                        Iterator<h> it = this.f108866f.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).e();
                        }
                        this.f108866f.clear();
                    } finally {
                        MethodCollector.o(9494);
                    }
                }
                synchronized (this.f108867g) {
                    try {
                        this.f108867g.clear();
                        this.f108867g.notifyAll();
                    } finally {
                        MethodCollector.o(9494);
                    }
                }
            } finally {
                MethodCollector.o(9494);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008a, code lost:
        if (r6 == null) goto L_0x008f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074 A[Catch:{ all -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.livewallpaper.c.h a() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.c.s.a():com.ss.android.ugc.aweme.livewallpaper.c.h");
    }

    private static int a(List<h> list) {
        int size;
        MethodCollector.i(9312);
        synchronized (list) {
            try {
                size = list.size();
            } finally {
                MethodCollector.o(9312);
            }
        }
        return size;
    }

    @Override // com.ss.android.ugc.aweme.livewallpaper.c.n.b
    public final void a(h hVar) {
        MethodCollector.i(9646);
        synchronized (this.f108867g) {
            try {
                this.f108867g.add(hVar);
                this.f108867g.notifyAll();
            } finally {
                MethodCollector.o(9646);
            }
        }
    }

    public s(int i2, int i3, int i4) {
        this.f108861a = i3;
        this.f108862b = i4;
        this.f108864d = i2;
        this.f108865e = false;
        this.f108866f = new ArrayList();
        this.f108867g = new ArrayList();
    }
}
