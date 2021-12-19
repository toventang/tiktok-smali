package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.h;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public m f1909a = new m(this);

    /* renamed from: b  reason: collision with root package name */
    public final f f1910b;

    /* renamed from: c  reason: collision with root package name */
    public final c f1911c;

    /* renamed from: d  reason: collision with root package name */
    public e f1912d;

    /* renamed from: e  reason: collision with root package name */
    public int f1913e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f1914f = -1;

    /* renamed from: g  reason: collision with root package name */
    public b f1915g = b.NONE;

    /* renamed from: h  reason: collision with root package name */
    public a f1916h = a.RELAXED;

    /* renamed from: i  reason: collision with root package name */
    public int f1917i = 0;

    /* renamed from: j  reason: collision with root package name */
    public h f1918j;

    static {
        Covode.recordClassIndex(582);
    }

    public final boolean d() {
        if (this.f1912d != null) {
            return true;
        }
        return false;
    }

    public final void a() {
        h hVar = this.f1918j;
        if (hVar == null) {
            this.f1918j = new h(h.a.UNRESTRICTED);
        } else {
            hVar.a();
        }
    }

    public final int b() {
        e eVar;
        if (this.f1910b.ag == 8) {
            return 0;
        }
        if (this.f1914f < 0 || (eVar = this.f1912d) == null || eVar.f1910b.ag != 8) {
            return this.f1913e;
        }
        return this.f1914f;
    }

    public final void c() {
        this.f1912d = null;
        this.f1913e = 0;
        this.f1914f = -1;
        this.f1915g = b.STRONG;
        this.f1917i = 0;
        this.f1916h = a.RELAXED;
        this.f1909a.b();
    }

    public enum a {
        RELAXED,
        STRICT;

        static {
            Covode.recordClassIndex(584);
        }
    }

    public enum b {
        NONE,
        STRONG,
        WEAK;

        static {
            Covode.recordClassIndex(585);
        }
    }

    public final String toString() {
        return this.f1910b.ah + ":" + this.f1911c.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.a.a.e$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1919a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 114
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.e.AnonymousClass1.<clinit>():void");
        }
    }

    public enum c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y;

        static {
            Covode.recordClassIndex(586);
        }
    }

    public e(f fVar, c cVar) {
        this.f1910b = fVar;
        this.f1911c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if (r5.f1910b.s() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r2 != androidx.constraintlayout.a.a.e.c.CENTER_Y) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
        if (r2 != androidx.constraintlayout.a.a.e.c.CENTER_X) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007a, code lost:
        if (r3 != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0087, code lost:
        if (r2 != androidx.constraintlayout.a.a.e.c.CENTER_Y) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(androidx.constraintlayout.a.a.e r6, int r7, int r8, androidx.constraintlayout.a.a.e.b r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.e.a(androidx.constraintlayout.a.a.e, int, int, androidx.constraintlayout.a.a.e$b, int, boolean):boolean");
    }
}
