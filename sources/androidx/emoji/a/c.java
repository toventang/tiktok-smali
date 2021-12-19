package androidx.emoji.a;

import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.KeyEvent;
import androidx.emoji.a.a;
import androidx.emoji.a.g;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a.h f2774a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2775b;

    /* renamed from: c  reason: collision with root package name */
    private a f2776c = new a();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2777d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f2778e;

    static {
        Covode.recordClassIndex(974);
    }

    static boolean a(int i2, int i3) {
        return i2 == -1 || i3 == -1 || i2 != i3;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final ThreadLocal<StringBuilder> f2779a = new ThreadLocal<>();

        /* renamed from: b  reason: collision with root package name */
        private final TextPaint f2780b;

        static {
            Covode.recordClassIndex(975);
        }

        a() {
            TextPaint textPaint = new TextPaint();
            this.f2780b = textPaint;
            textPaint.setTextSize(10.0f);
        }

        private static StringBuilder a() {
            ThreadLocal<StringBuilder> threadLocal = f2779a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            return threadLocal.get();
        }

        public final boolean a(CharSequence charSequence, int i2, int i3) {
            StringBuilder a2 = a();
            a2.setLength(0);
            while (i2 < i3) {
                a2.append(charSequence.charAt(i2));
                i2++;
            }
            return androidx.core.graphics.c.a(this.f2780b, a2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f2781a = 1;

        /* renamed from: b  reason: collision with root package name */
        g.a f2782b;

        /* renamed from: c  reason: collision with root package name */
        g.a f2783c;

        /* renamed from: d  reason: collision with root package name */
        int f2784d;

        /* renamed from: e  reason: collision with root package name */
        int f2785e;

        /* renamed from: f  reason: collision with root package name */
        private final g.a f2786f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f2787g;

        /* renamed from: h  reason: collision with root package name */
        private final int[] f2788h;

        static {
            Covode.recordClassIndex(976);
        }

        static boolean a(int i2) {
            return i2 == 65039;
        }

        /* access modifiers changed from: package-private */
        public final int a() {
            this.f2781a = 1;
            this.f2782b = this.f2786f;
            this.f2785e = 0;
            return 1;
        }

        /* access modifiers changed from: package-private */
        public final boolean b() {
            if (this.f2782b.f2817b.a().b() || a(this.f2784d)) {
                return true;
            }
            if (this.f2787g) {
                if (this.f2788h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2788h, this.f2782b.f2817b.a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        b(g.a aVar, boolean z, int[] iArr) {
            this.f2786f = aVar;
            this.f2782b = aVar;
            this.f2787g = z;
            this.f2788h = iArr;
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        d[] dVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!a(selectionStart, selectionEnd) && (dVarArr = (d[]) editable.getSpans(selectionStart, selectionEnd, d.class)) != null && dVarArr.length > 0) {
            for (d dVar : dVarArr) {
                int spanStart = editable.getSpanStart(dVar);
                int spanEnd = editable.getSpanEnd(dVar);
                if (z) {
                    if (spanStart == selectionStart) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                } else if (spanEnd == selectionStart) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
                if (selectionStart > spanStart && selectionStart < spanEnd) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    private static void a(Spannable spannable, b bVar, int i2, int i3) {
        spannable.setSpan(a.h.a(bVar), i2, i3, 33);
    }

    c(g gVar, a.h hVar, boolean z, int[] iArr) {
        this.f2774a = hVar;
        this.f2775b = gVar;
        this.f2777d = z;
        this.f2778e = iArr;
    }

    private boolean a(CharSequence charSequence, int i2, int i3, b bVar) {
        if (Build.VERSION.SDK_INT < 23 && bVar.a().c() > Build.VERSION.SDK_INT) {
            return false;
        }
        if (bVar.f2773c == 0) {
            bVar.a(this.f2776c.a(charSequence, i2, i3));
        }
        if (bVar.f2773c == 2) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x010a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0118 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x016e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:95:0x015e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:103:0x017c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.CharSequence] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0116, code lost:
        if (a(r17, r4, r13, r7.f2783c.f2817b) == false) goto L_0x0118;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0106 A[Catch:{ all -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0136 A[Catch:{ all -> 0x0190 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji.a.c.a(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
