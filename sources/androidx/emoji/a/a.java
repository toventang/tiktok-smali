package androidx.emoji.a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f2742h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static volatile a f2743i;

    /* renamed from: a  reason: collision with root package name */
    public final C0042a f2744a;

    /* renamed from: b  reason: collision with root package name */
    final f f2745b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f2746c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f2747d;

    /* renamed from: e  reason: collision with root package name */
    final int[] f2748e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2749f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2750g;

    /* renamed from: j  reason: collision with root package name */
    private final ReadWriteLock f2751j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<d> f2752k;

    /* renamed from: l  reason: collision with root package name */
    private int f2753l = 3;

    /* renamed from: m  reason: collision with root package name */
    private final Handler f2754m;
    private final int n;

    public static abstract class d {
        static {
            Covode.recordClassIndex(968);
        }

        public void a() {
        }
    }

    public interface f {
        static {
            Covode.recordClassIndex(970);
        }

        void a(g gVar);
    }

    public static abstract class g {
        static {
            Covode.recordClassIndex(971);
        }

        public abstract void a(g gVar);

        public abstract void a(Throwable th);
    }

    static class h {
        static {
            Covode.recordClassIndex(972);
        }

        h() {
        }

        static d a(b bVar) {
            return new h(bVar);
        }
    }

    /* renamed from: androidx.emoji.a.a$a  reason: collision with other inner class name */
    public static class C0042a {

        /* renamed from: a  reason: collision with root package name */
        final a f2755a;

        static {
            Covode.recordClassIndex(964);
        }

        /* access modifiers changed from: package-private */
        public CharSequence a(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
            return charSequence;
        }

        public void a(EditorInfo editorInfo) {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2755a.b();
        }

        C0042a(a aVar) {
            this.f2755a = aVar;
        }
    }

    static {
        Covode.recordClassIndex(963);
    }

    public final boolean d() {
        if (c() == 1) {
            return true;
        }
        return false;
    }

    static final class b extends C0042a {

        /* renamed from: b  reason: collision with root package name */
        volatile c f2756b;

        /* renamed from: c  reason: collision with root package name */
        volatile g f2757c;

        static {
            Covode.recordClassIndex(965);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.a.a.C0042a
        public final void a() {
            try {
                this.f2755a.f2745b.a(new g() {
                    /* class androidx.emoji.a.a.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(966);
                    }

                    @Override // androidx.emoji.a.a.g
                    public final void a(Throwable th) {
                        b.this.f2755a.a(th);
                    }

                    @Override // androidx.emoji.a.a.g
                    public final void a(g gVar) {
                        b bVar = b.this;
                        bVar.f2757c = gVar;
                        bVar.f2756b = new c(bVar.f2757c, new h(), bVar.f2755a.f2747d, bVar.f2755a.f2748e);
                        bVar.f2755a.b();
                    }
                });
            } catch (Throwable th) {
                this.f2755a.a(th);
            }
        }

        b(a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.a.a.C0042a
        public final void a(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2757c.f2812a.a());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2755a.f2746c);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.emoji.a.a.C0042a
        public final CharSequence a(CharSequence charSequence, int i2, int i3, int i4, boolean z) {
            return this.f2756b.a(charSequence, i2, i3, i4, z);
        }
    }

    public static a a() {
        boolean z;
        a aVar;
        synchronized (f2742h) {
            if (f2743i != null) {
                z = true;
            } else {
                z = false;
            }
            androidx.core.g.g.a(z, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            aVar = f2743i;
        }
        return aVar;
    }

    public final int c() {
        this.f2751j.readLock().lock();
        try {
            return this.f2753l;
        } finally {
            this.f2751j.readLock().unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public static class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final List<d> f2767a;

        /* renamed from: b  reason: collision with root package name */
        private final Throwable f2768b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2769c;

        static {
            Covode.recordClassIndex(969);
        }

        public final void run() {
            int size = this.f2767a.size();
            int i2 = 0;
            if (this.f2769c != 1) {
                while (i2 < size) {
                    this.f2767a.get(i2);
                    i2++;
                }
                return;
            }
            while (i2 < size) {
                this.f2767a.get(i2).a();
                i2++;
            }
        }

        e(Collection<d> collection, int i2) {
            this(collection, i2, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.emoji.a.a$d[] */
        /* JADX WARN: Multi-variable type inference failed */
        e(d dVar, int i2) {
            this(Arrays.asList(androidx.core.g.g.a(dVar, "initCallback cannot be null")), i2, null);
        }

        e(Collection<d> collection, int i2, Throwable th) {
            androidx.core.g.g.a(collection, "initCallbacks cannot be null");
            this.f2767a = new ArrayList(collection);
            this.f2769c = i2;
            this.f2768b = th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void b() {
        ArrayList arrayList = new ArrayList();
        this.f2751j.writeLock().lock();
        try {
            this.f2753l = 1;
            arrayList.addAll(this.f2752k);
            this.f2752k.clear();
            this.f2751j.writeLock().unlock();
            this.f2754m.post(new e(arrayList, this.f2753l));
        } catch (Throwable th) {
            this.f2751j.writeLock().unlock();
            throw th;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final f f2759a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2760b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2761c;

        /* renamed from: d  reason: collision with root package name */
        int[] f2762d;

        /* renamed from: e  reason: collision with root package name */
        Set<d> f2763e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2764f;

        /* renamed from: g  reason: collision with root package name */
        int f2765g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f2766h;

        static {
            Covode.recordClassIndex(967);
        }

        protected c(f fVar) {
            androidx.core.g.g.a(fVar, "metadataLoader cannot be null.");
            this.f2759a = fVar;
        }
    }

    public final CharSequence a(CharSequence charSequence) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        return a(charSequence, length);
    }

    public static a a(c cVar) {
        if (f2743i == null) {
            synchronized (f2742h) {
                if (f2743i == null) {
                    f2743i = new a(cVar);
                }
            }
        }
        return f2743i;
    }

    private a(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2751j = reentrantReadWriteLock;
        this.f2746c = cVar.f2760b;
        this.f2747d = cVar.f2761c;
        this.f2748e = cVar.f2762d;
        this.f2749f = cVar.f2764f;
        this.f2750g = cVar.f2765g;
        this.f2745b = cVar.f2759a;
        int i2 = cVar.f2766h;
        this.n = i2;
        this.f2754m = new Handler(Looper.getMainLooper());
        androidx.c.b bVar = new androidx.c.b();
        this.f2752k = bVar;
        if (cVar.f2763e != null && !cVar.f2763e.isEmpty()) {
            bVar.addAll(cVar.f2763e);
        }
        int i3 = Build.VERSION.SDK_INT;
        b bVar2 = new b(this);
        this.f2744a = bVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f2753l = 0;
            } catch (Throwable th) {
                this.f2751j.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            bVar2.a();
        }
    }

    public final void a(d dVar) {
        androidx.core.g.g.a(dVar, "initCallback cannot be null");
        this.f2751j.writeLock().lock();
        try {
            int i2 = this.f2753l;
            if (i2 != 1) {
                if (i2 != 2) {
                    this.f2752k.add(dVar);
                }
            }
            this.f2754m.post(new e(dVar, this.f2753l));
        } finally {
            this.f2751j.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f2751j.writeLock().lock();
        try {
            this.f2753l = 2;
            arrayList.addAll(this.f2752k);
            this.f2752k.clear();
            this.f2751j.writeLock().unlock();
            this.f2754m.post(new e(arrayList, this.f2753l, th));
        } catch (Throwable th2) {
            this.f2751j.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence a(CharSequence charSequence, int i2) {
        return a(charSequence, 0, i2, Integer.MAX_VALUE, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        if (java.lang.Character.isLowSurrogate(r1) != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008b, code lost:
        if (java.lang.Character.isHighSurrogate(r1) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[LOOP:2: B:25:0x0046->B:36:0x006a, LOOP_START, PHI: r2 r3 
      PHI: (r2v5 boolean) = (r2v4 boolean), (r2v6 boolean) binds: [B:23:0x0042, B:36:0x006a] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v5 int) = (r3v4 int), (r3v8 int) binds: [B:23:0x0042, B:36:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.view.inputmethod.InputConnection r10, android.text.Editable r11, int r12, int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.a.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public final CharSequence a(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.core.g.g.a(d(), "Not initialized yet");
        androidx.core.g.g.a(i2, "start cannot be negative");
        androidx.core.g.g.a(i3, "end cannot be negative");
        androidx.core.g.g.a(i4, "maxEmojiCount cannot be negative");
        if (i2 <= i3) {
            z = true;
        } else {
            z = false;
        }
        androidx.core.g.g.a(z, (Object) "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        if (i2 <= charSequence.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        androidx.core.g.g.a(z2, (Object) "start should be < than charSequence length");
        if (i3 <= charSequence.length()) {
            z3 = true;
        } else {
            z3 = false;
        }
        androidx.core.g.g.a(z3, (Object) "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 == 1) {
            z4 = true;
        } else if (i5 != 2) {
            z4 = this.f2746c;
        } else {
            z4 = false;
        }
        return this.f2744a.a(charSequence, i2, i3, i4, z4);
    }
}
