package com.lynx.tasm.image;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.lynx.a.b;
import com.lynx.a.d;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.c.f;
import com.lynx.tasm.utils.o;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f56709a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final a f56710b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f56711c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public String f56712d;

    /* renamed from: e  reason: collision with root package name */
    public int f56713e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f56714f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f56715g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f56716h;

    /* renamed from: i  reason: collision with root package name */
    private final d f56717i;

    /* renamed from: j  reason: collision with root package name */
    private final d f56718j;

    /* renamed from: k  reason: collision with root package name */
    private final LynxBaseUI f56719k;

    /* renamed from: l  reason: collision with root package name */
    private final j f56720l;

    /* renamed from: m  reason: collision with root package name */
    private String f56721m;
    private int n;
    private int o;
    private Bitmap.Config p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private o[] v;
    private float[] w;
    private int[] x;
    private Boolean y;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(35348);
        }

        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(35340);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x025d, code lost:
        if (r7.equals("") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0266, code lost:
        if (r7.equals("scaleToFill") != false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x026f, code lost:
        if (r7.equals("none") != false) goto L_0x0271;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.lynx.tasm.behavior.v r17) {
        /*
        // Method dump skipped, instructions count: 1228
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.c.a(com.lynx.tasm.behavior.v):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, com.lynx.tasm.c.a> map) {
        if (map == null) {
            this.r = false;
            this.q = false;
            return;
        }
        this.q = map.containsKey("load");
        this.r = map.containsKey("error");
    }

    public final void a(Throwable th, String str) {
        if (this.r && this.u && TextUtils.equals(this.f56721m, str)) {
            this.u = false;
            com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(this.f56719k.getSign(), "error");
            cVar.a("errMsg", th != null ? th.getCause() : "unknown reason");
            this.f56720l.f55897e.a(cVar);
            this.f56720l.f55897e.a(new f(this.f56719k.getSign()));
            this.f56720l.a(str, "image", Log.getStackTraceString(th));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.f56716h = null;
        this.f56717i.release();
        this.f56718j.release();
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f56716h = null;
        this.f56717i.destroy();
        this.f56718j.destroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.image.c$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56735a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 35347(0x8a13, float:4.9532E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.react.bridge.ReadableType[] r0 = com.lynx.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.tasm.image.c.AnonymousClass5.f56735a = r2
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.tasm.image.c.AnonymousClass5.f56735a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.react.bridge.ReadableType r0 = com.lynx.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.image.c.AnonymousClass5.<clinit>():void");
        }
    }

    public final void a() {
        if (this.y != null && this.f56716h != null) {
            ShadowNode b2 = this.f56719k.mContext.b(this.f56719k.getSign());
            if (b2 instanceof AutoSizeImage) {
                ((AutoSizeImage) b2).a(this.y.booleanValue(), this.f56716h.getWidth(), this.f56716h.getHeight(), this.f56719k.getWidth(), this.f56719k.getHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        Boolean bool;
        int i2 = this.s;
        int i3 = this.t;
        if (i2 <= 0) {
            i2 = this.n;
        }
        if (i3 <= 0) {
            i3 = this.o;
        }
        if (i2 <= 0 && i3 <= 0 && ((bool = this.y) == null || !bool.booleanValue())) {
            return;
        }
        if (this.f56714f) {
            if (this.f56716h == null && !TextUtils.isEmpty(this.f56712d)) {
                a(this.f56712d, i2, i3);
            }
            if (!TextUtils.isEmpty(this.f56721m)) {
                b(this.f56721m, i2, i3);
                return;
            }
            return;
        }
        if (this.f56716h == null && !TextUtils.isEmpty(this.f56712d)) {
            c(this.f56712d, i2, i3);
        }
        if (!TextUtils.isEmpty(this.f56721m)) {
            d(this.f56721m, i2, i3);
        }
    }

    private void e() {
        float f2;
        int i2;
        this.f56709a.f56675a = null;
        if (!com.lynx.tasm.utils.c.a((float) this.s, 0.0f) && !com.lynx.tasm.utils.c.a((float) this.t, 0.0f)) {
            int i3 = 0;
            if (this.v != null) {
                int i4 = 0;
                while (true) {
                    o[] oVarArr = this.v;
                    if (i4 < oVarArr.length) {
                        if (oVarArr[i4] != null && oVarArr[i4].f57046a > 0.0f) {
                            o[] oVarArr2 = this.v;
                            int i5 = i4 + 1;
                            if (oVarArr2[i5] != null && oVarArr2[i5].f57046a > 0.0f) {
                                if (this.w == null) {
                                    this.w = new float[8];
                                }
                                this.f56709a.f56675a = this.w;
                                int i6 = 0;
                                while (true) {
                                    o[] oVarArr3 = this.v;
                                    if (i6 >= oVarArr3.length) {
                                        break;
                                    }
                                    if (oVarArr3[i6] == null) {
                                        this.w[i6] = 0.0f;
                                    } else if (oVarArr3[i6].f57047b == o.a.PERCENTAGE) {
                                        float[] fArr = this.w;
                                        float f3 = this.v[i6].f57046a / 100.0f;
                                        if (i6 % 2 == 0) {
                                            i2 = this.s;
                                        } else {
                                            i2 = this.t;
                                        }
                                        fArr[i6] = f3 * ((float) i2);
                                    } else {
                                        this.w[i6] = this.v[i6].f57046a;
                                    }
                                    i6++;
                                }
                                float[] fArr2 = this.w;
                                int i7 = this.s;
                                if (fArr2[0] + fArr2[2] > ((float) i7)) {
                                    f2 = Math.min(((float) i7) / (fArr2[0] + fArr2[2]), 1.0f);
                                } else {
                                    f2 = 1.0f;
                                }
                                int i8 = this.s;
                                if (fArr2[4] + fArr2[6] > ((float) i8)) {
                                    f2 = Math.min(((float) i8) / (fArr2[4] + fArr2[6]), f2);
                                }
                                int i9 = this.t;
                                if (fArr2[1] + fArr2[7] > ((float) i9)) {
                                    f2 = Math.min(((float) i9) / (fArr2[1] + fArr2[7]), f2);
                                }
                                int i10 = this.t;
                                if (fArr2[3] + fArr2[5] > ((float) i10)) {
                                    f2 = Math.min(((float) i10) / (fArr2[3] + fArr2[5]), f2);
                                }
                                if (f2 < 1.0f) {
                                    do {
                                        fArr2[i3] = fArr2[i3] * f2;
                                        i3++;
                                    } while (i3 < 8);
                                    return;
                                }
                                return;
                            }
                        }
                        i4 += 2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private static o a(ReadableArray readableArray, int i2) {
        o.a aVar;
        float f2 = (float) readableArray.getDouble(i2);
        if (f2 <= 0.0f) {
            return null;
        }
        if (readableArray.getInt(i2 + 1) == 1) {
            aVar = o.a.PERCENTAGE;
        } else {
            aVar = o.a.PX;
        }
        return new o(f2, aVar);
    }

    public final void a(Bitmap bitmap, String str) {
        if (this.q && this.u && TextUtils.equals(this.f56721m, str)) {
            this.u = false;
            com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(this.f56719k.getSign(), "load");
            cVar.a("width", Integer.valueOf(bitmap.getWidth()));
            cVar.a("height", Integer.valueOf(bitmap.getHeight()));
            this.f56720l.f55897e.a(cVar);
        }
    }

    private void b(final String str, int i2, int i3) {
        if (!this.f56715g) {
            str = com.lynx.tasm.behavior.ui.image.a.a(this.f56720l, str);
        }
        com.lynx.tasm.behavior.ui.image.a.a(this.f56720l, str, (float) i2, (float) i3, new f.a() {
            /* class com.lynx.tasm.image.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(35343);
            }

            @Override // com.lynx.tasm.behavior.f.a
            public final void a(Object obj, final Throwable th) {
                if (!(obj instanceof Bitmap)) {
                    LLog.a(6, "LynxImage", "need bitmap! ");
                    return;
                }
                final Bitmap bitmap = (Bitmap) obj;
                AnonymousClass1 r2 = new Runnable() {
                    /* class com.lynx.tasm.image.c.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35344);
                    }

                    public final void run() {
                        c.this.f56716h = bitmap;
                        if (c.this.f56710b != null) {
                            c.this.f56710b.a(bitmap);
                        }
                        c.this.a();
                        if (bitmap == null) {
                            c.this.a(th, str);
                        } else {
                            c.this.a(bitmap, str);
                        }
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    r2.run();
                } else {
                    c.this.f56711c.post(r2);
                }
            }
        });
    }

    c(j jVar, LynxBaseUI lynxBaseUI, a aVar) {
        this.f56720l = jVar;
        this.f56719k = lynxBaseUI;
        this.f56710b = aVar;
        d a2 = com.lynx.a.f.a().a();
        this.f56717i = a2;
        d a3 = com.lynx.a.f.a().a();
        this.f56718j = a3;
        if (a2 == null || a3 == null) {
            throw new RuntimeException("set image loader first!");
        }
    }

    private void a(int i2, ReadableMap readableMap, String str) {
        if (this.x == null) {
            this.x = new int[4];
        }
        this.x[i2] = readableMap.getInt(str);
        int[] iArr = this.x;
        if (iArr[i2] < 0) {
            iArr[i2] = (int) com.lynx.tasm.utils.j.a(3.0f);
        }
    }

    private void c(final String str, int i2, int i3) {
        Uri parse;
        if (!this.f56715g) {
            str = com.lynx.tasm.behavior.ui.image.a.a(this.f56720l, str);
        }
        b.a aVar = new b.a();
        aVar.f55053d = this.p;
        aVar.f55052c = this.f56713e;
        aVar.f55050a = i2;
        aVar.f55051b = i3;
        b a2 = aVar.a();
        d dVar = this.f56718j;
        j jVar = this.f56720l;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        dVar.load(jVar, parse, a2, new com.lynx.a.c() {
            /* class com.lynx.tasm.image.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(35345);
            }

            @Override // com.lynx.a.c
            public final void a(Bitmap bitmap) {
                if (c.this.f56710b != null) {
                    c.this.f56710b.b(bitmap);
                }
            }

            @Override // com.lynx.a.c
            public final void b(Bitmap bitmap) {
                if (c.this.f56710b != null) {
                    c.this.f56710b.b(bitmap);
                }
            }

            @Override // com.lynx.a.c
            public final void a(Throwable th) {
                if (c.this.f56710b != null) {
                    c.this.f56710b.b(null);
                }
            }

            @Override // com.lynx.a.c
            public final void b(Throwable th) {
                if (c.this.f56710b != null) {
                    c.this.f56710b.b(null);
                }
            }
        });
    }

    private void d(final String str, int i2, int i3) {
        Uri parse;
        if (!this.f56715g) {
            str = com.lynx.tasm.behavior.ui.image.a.a(this.f56720l, str);
        }
        b.a aVar = new b.a();
        aVar.f55053d = this.p;
        aVar.f55052c = this.f56713e;
        aVar.f55050a = i2;
        aVar.f55051b = i3;
        b a2 = aVar.a();
        d dVar = this.f56717i;
        j jVar = this.f56720l;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        dVar.load(jVar, parse, a2, new com.lynx.a.c() {
            /* class com.lynx.tasm.image.c.AnonymousClass4 */

            static {
                Covode.recordClassIndex(35346);
            }

            @Override // com.lynx.a.c
            public final void a(Bitmap bitmap) {
                c.this.f56716h = bitmap;
                if (c.this.f56710b != null) {
                    c.this.f56710b.a(bitmap);
                }
                c.this.a();
                c.this.a(bitmap, str);
            }

            @Override // com.lynx.a.c
            public final void b(Bitmap bitmap) {
                c.this.f56716h = bitmap;
                if (c.this.f56710b != null) {
                    c.this.f56710b.a(bitmap);
                }
            }

            @Override // com.lynx.a.c
            public final void a(Throwable th) {
                c.this.f56716h = null;
                if (c.this.f56710b != null) {
                    c.this.f56710b.a(null);
                }
                c.this.a(th, str);
            }

            @Override // com.lynx.a.c
            public final void b(Throwable th) {
                c.this.f56716h = null;
                if (c.this.f56710b != null) {
                    c.this.f56710b.a(null);
                }
            }
        });
    }

    private void a(final String str, int i2, int i3) {
        if (!this.f56715g) {
            str = com.lynx.tasm.behavior.ui.image.a.a(this.f56720l, str);
        }
        com.lynx.tasm.behavior.ui.image.a.a(this.f56720l, str, (float) i2, (float) i3, new f.a() {
            /* class com.lynx.tasm.image.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35341);
            }

            @Override // com.lynx.tasm.behavior.f.a
            public final void a(Object obj, Throwable th) {
                if (!(obj instanceof Bitmap)) {
                    LLog.a(6, "LynxImage", "need bitmap! ");
                    return;
                }
                final Bitmap bitmap = (Bitmap) obj;
                AnonymousClass1 r2 = new Runnable() {
                    /* class com.lynx.tasm.image.c.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35342);
                    }

                    public final void run() {
                        if (c.this.f56710b != null) {
                            c.this.f56710b.b(bitmap);
                        }
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    r2.run();
                } else {
                    c.this.f56711c.post(r2);
                }
            }
        });
    }

    private void b(int i2, ReadableMap readableMap, String str) {
        if (this.v == null) {
            this.v = new o[8];
        }
        ReadableArray array = readableMap.getArray(str);
        int i3 = 0;
        if (i2 == -1) {
            if (array == null || array.size() != 16) {
                do {
                    this.v[i3] = null;
                    i3++;
                } while (i3 < 8);
                return;
            }
            do {
                this.v[i3] = a(array, i3 * 2);
                i3++;
            } while (i3 < 8);
        } else if (array == null || array.size() != 4) {
            o[] oVarArr = this.v;
            oVarArr[i2] = null;
            oVarArr[i2 + 1] = null;
        } else {
            this.v[i2] = a(array, 0);
            this.v[i2 + 1] = a(array, 2);
        }
    }

    public final void a(int i2, float f2, float f3) {
        if (this.v == null) {
            this.v = new o[8];
        }
        int i3 = (i2 - 1) * 2;
        this.v[i3 + 0] = new o(f2, o.a.PX);
        this.v[i3 + 1] = new o(f3, o.a.PX);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        if (i6 != this.s || i7 != this.t || i6 <= 0 || i7 <= 0) {
            this.s = i2;
            this.t = i3;
            this.f56709a.f56678d = i2;
            this.f56709a.f56679e = this.t;
            this.f56709a.f56681g = i4;
            this.f56709a.f56682h = i5;
            this.f56709a.f56683i = i6;
            this.f56709a.f56684j = i7;
            if (this.x == null) {
                this.x = new int[4];
            }
            int[] iArr = this.x;
            iArr[0] = i8;
            iArr[1] = i9;
            iArr[2] = i10;
            iArr[3] = i11;
            this.f56709a.f56685k = iArr;
            e();
            b();
        }
    }
}
