package com.bytedance.android.ecommerce.ocr.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.ecommerce.c.a;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.k.d;
import com.bytedance.android.ecommerce.ocr.a.k;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import com.bytedance.android.ecommerce.ocr.view.f;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static int f7233f = 10001;

    /* renamed from: g  reason: collision with root package name */
    public static int f7234g = 10002;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f7235a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7236b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public HandlerThread f7237c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f7238d;

    /* renamed from: e  reason: collision with root package name */
    public a f7239e;

    /* renamed from: h  reason: collision with root package name */
    public final Handler.Callback f7240h = new Handler.Callback() {
        /* class com.bytedance.android.ecommerce.ocr.b.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(3476);
        }

        public final boolean handleMessage(Message message) {
            int i2;
            int i3;
            int i4;
            int i5;
            MethodCollector.i(5404);
            if (message.what == b.f7233f) {
                f fVar = (f) message.obj;
                b bVar = b.this;
                if (bVar.f7235a) {
                    try {
                        byte[] bArr = fVar.f7315a;
                        if (bArr != null) {
                            int i6 = fVar.f7317c;
                            int i7 = fVar.f7316b;
                            if (bVar.f7239e != null) {
                                i2 = bVar.f7239e.a(1, i6);
                                i3 = bVar.f7239e.a(0, i7);
                                i4 = bVar.f7239e.a(2, i7);
                                i5 = bVar.f7239e.a(3, i6);
                                if (i4 > i6 || i5 > i7) {
                                    i4 = i6;
                                    i5 = i7;
                                }
                            } else {
                                i4 = i6;
                                i5 = i7;
                                i2 = 0;
                                i3 = 0;
                            }
                            if (i7 * i6 <= bArr.length) {
                                int i8 = fVar.f7317c;
                                int i9 = fVar.f7316b;
                                new BitmapFactory.Options().inJustDecodeBounds = true;
                                YuvImage yuvImage = new YuvImage(bArr, 17, i8, i9, null);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                yuvImage.compressToJpeg(new Rect(0, 0, i8, i9), 100, byteArrayOutputStream);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                Bitmap createBitmap = Bitmap.createBitmap(d.a(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options), 90.0f), i3, i2, i4, i5);
                                if (createBitmap.getByteCount() > 4194304) {
                                    createBitmap = d.a(createBitmap, 4194304);
                                }
                                createBitmap.getByteCount();
                                com.bytedance.android.ecommerce.a.a.b a2 = c.f7063a.k().a();
                                if (TextUtils.isEmpty(a2.f6882f)) {
                                    bVar.a(0, 101, "nonce is empty", null);
                                } else {
                                    a2.f6883g = Base64.encodeToString(d.a(createBitmap), 0);
                                    createBitmap.getByteCount();
                                    e.a(new Runnable(a2, createBitmap) {
                                        /* class com.bytedance.android.ecommerce.ocr.b.b.AnonymousClass3 */

                                        /* renamed from: a  reason: collision with root package name */
                                        final /* synthetic */ com.bytedance.android.ecommerce.a.a.b f7247a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ Bitmap f7248b;

                                        static {
                                            Covode.recordClassIndex(3478);
                                        }

                                        public final void run() {
                                            c.f7063a.c().a(this.f7247a, new a() {
                                                /* class com.bytedance.android.ecommerce.ocr.b.b.AnonymousClass3.AnonymousClass1 */

                                                static {
                                                    Covode.recordClassIndex(3479);
                                                }

                                                @Override // com.bytedance.android.ecommerce.c.a
                                                public final void a(boolean z, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
                                                    MethodCollector.i(6534);
                                                    if (!z) {
                                                        try {
                                                            b.this.a(0, 107, str, bVar);
                                                            MethodCollector.o(6534);
                                                        } catch (Throwable unused) {
                                                            MethodCollector.o(6534);
                                                        }
                                                    } else {
                                                        if (bVar != null && bVar.f6923m) {
                                                            Bitmap bitmap = AnonymousClass3.this.f7248b;
                                                            int i2 = bVar.f6919i.f6902c;
                                                            int i3 = bVar.f6919i.f6903d;
                                                            int i4 = bVar.f6919i.f6906g - bVar.f6919i.f6902c;
                                                            int i5 = bVar.f6919i.f6905f - bVar.f6919i.f6907h;
                                                            Bitmap bitmap2 = null;
                                                            if (i2 + i4 > bitmap.getWidth()) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i3 + i5 > bitmap.getHeight()) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i2 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i3 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i4 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else if (i5 < 0) {
                                                                bitmap.getWidth();
                                                                bitmap.getHeight();
                                                            } else {
                                                                bitmap2 = Bitmap.createBitmap(bitmap, i2, i3, i4, i5);
                                                            }
                                                            bVar.n = bitmap2;
                                                            if (bVar.f6919i.f6909j) {
                                                                bVar.n = d.a(bVar.n, 180.0f);
                                                            }
                                                            if (bVar.n != null) {
                                                                b.this.a(1, 1, "success", bVar);
                                                            }
                                                        }
                                                        MethodCollector.o(6534);
                                                    }
                                                }
                                            });
                                        }

                                        {
                                            this.f7247a = r2;
                                            this.f7248b = r3;
                                        }
                                    });
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                bVar.f7238d.sendMessageDelayed(bVar.f7238d.obtainMessage(b.f7234g), 1000);
            } else if (message.what == b.f7234g) {
                b.this.b();
            }
            MethodCollector.o(5404);
            return true;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.ecommerce.ocr.a.b f7241i;

    /* renamed from: j  reason: collision with root package name */
    private final ThreadLocal<Long> f7242j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private OcrActivity f7243k;

    /* renamed from: l  reason: collision with root package name */
    private final k f7244l = new k() {
        /* class com.bytedance.android.ecommerce.ocr.b.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(3477);
        }

        @Override // com.bytedance.android.ecommerce.ocr.a.k
        public final void a() {
            b.this.b();
        }

        @Override // com.bytedance.android.ecommerce.ocr.a.k
        public final void a(f fVar) {
            MethodCollector.i(5226);
            synchronized (b.this.f7236b) {
                try {
                    if (b.this.f7235a) {
                        b.this.f7238d.obtainMessage(b.f7233f, fVar).sendToTarget();
                    }
                } finally {
                    MethodCollector.o(5226);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(3475);
    }

    public final void a() {
        MethodCollector.i(6522);
        com.bytedance.android.ecommerce.k.k.a();
        synchronized (this.f7236b) {
            try {
                this.f7235a = false;
            } finally {
                MethodCollector.o(6522);
            }
        }
    }

    public final void b() {
        com.bytedance.android.ecommerce.ocr.a.b bVar = this.f7241i;
        if (bVar != null && bVar.f7166f) {
            com.bytedance.android.ecommerce.ocr.a.b bVar2 = this.f7241i;
            bVar2.f7168h.post(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE  
                  (wrap: android.os.Handler : 0x000c: IGET  (r1v0 android.os.Handler) = (r3v0 'bVar2' com.bytedance.android.ecommerce.ocr.a.b) com.bytedance.android.ecommerce.ocr.a.b.h android.os.Handler)
                  (wrap: com.bytedance.android.ecommerce.ocr.a.b$3 : 0x0010: CONSTRUCTOR  (r0v2 com.bytedance.android.ecommerce.ocr.a.b$3) = 
                  (r3v0 'bVar2' com.bytedance.android.ecommerce.ocr.a.b)
                  (wrap: com.bytedance.android.ecommerce.ocr.a.k : 0x000a: IGET  (r2v0 com.bytedance.android.ecommerce.ocr.a.k) = (r4v0 'this' com.bytedance.android.ecommerce.ocr.b.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.ecommerce.ocr.b.b.l com.bytedance.android.ecommerce.ocr.a.k)
                 call: com.bytedance.android.ecommerce.ocr.a.b.3.<init>(com.bytedance.android.ecommerce.ocr.a.b, com.bytedance.android.ecommerce.ocr.a.k):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.bytedance.android.ecommerce.ocr.b.b.b():void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0010: CONSTRUCTOR  (r0v2 com.bytedance.android.ecommerce.ocr.a.b$3) = 
                  (r3v0 'bVar2' com.bytedance.android.ecommerce.ocr.a.b)
                  (wrap: com.bytedance.android.ecommerce.ocr.a.k : 0x000a: IGET  (r2v0 com.bytedance.android.ecommerce.ocr.a.k) = (r4v0 'this' com.bytedance.android.ecommerce.ocr.b.b A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.ecommerce.ocr.b.b.l com.bytedance.android.ecommerce.ocr.a.k)
                 call: com.bytedance.android.ecommerce.ocr.a.b.3.<init>(com.bytedance.android.ecommerce.ocr.a.b, com.bytedance.android.ecommerce.ocr.a.k):void type: CONSTRUCTOR in method: com.bytedance.android.ecommerce.ocr.b.b.b():void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.ecommerce.ocr.a.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
                this = this;
                com.bytedance.android.ecommerce.ocr.a.b r0 = r4.f7241i
                if (r0 == 0) goto L_0x0016
                boolean r0 = r0.f7166f
                if (r0 == 0) goto L_0x0016
                com.bytedance.android.ecommerce.ocr.a.b r3 = r4.f7241i
                com.bytedance.android.ecommerce.ocr.a.k r2 = r4.f7244l
                android.os.Handler r1 = r3.f7168h
                com.bytedance.android.ecommerce.ocr.a.b$3 r0 = new com.bytedance.android.ecommerce.ocr.a.b$3
                r0.<init>(r2)
                r1.post(r0)
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.b.b.b():void");
        }

        public b(com.bytedance.android.ecommerce.ocr.a.b bVar, OcrActivity ocrActivity) {
            com.bytedance.android.ecommerce.k.k.a();
            this.f7241i = bVar;
            this.f7243k = ocrActivity;
        }

        public final void a(int i2, int i3, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
            this.f7238d.removeMessages(f7234g);
            OcrActivity ocrActivity = this.f7243k;
            if (ocrActivity != null) {
                ocrActivity.a(i2, i3, str, bVar);
                this.f7243k = null;
            }
        }
    }
