package com.bytedance.android.ecommerce.ocr.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import com.bytedance.android.ecommerce.a.b.b;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.android.ecommerce.view.OcrScanView;
import com.bytedance.android.ecommerce.view.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

public class OcrActivity extends d implements com.bytedance.android.ecommerce.c.d {

    /* renamed from: g  reason: collision with root package name */
    private static int f7252g = 250;

    /* renamed from: a  reason: collision with root package name */
    public OcrCameraPreview f7253a;

    /* renamed from: b  reason: collision with root package name */
    public OcrTitleView f7254b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7255c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7256d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f7257e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7258f = "OcrActivity";

    /* renamed from: h  reason: collision with root package name */
    private ImageView f7259h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7260i;

    /* renamed from: j  reason: collision with root package name */
    private b f7261j;

    /* renamed from: k  reason: collision with root package name */
    private OcrScanView f7262k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f7263l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7264m;

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(3482);
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
        this.f7253a.d();
    }

    public void finish() {
        super.finish();
        if (!this.f7264m) {
            c.f7063a.k().a(0, 105, "user cancel", (b) null);
        }
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        a.b(this);
        super.onResume();
        if (Build.VERSION.SDK_INT < 23) {
            this.f7253a.c();
        } else if (androidx.core.content.b.a(this, "android.permission.CAMERA") == 0) {
            this.f7253a.c();
        } else if (!this.f7260i) {
            androidx.core.app.a.a(this, new String[]{"android.permission.CAMERA"}, f7252g);
            this.f7260i = true;
        } else if (this.f7255c) {
            a(0, 104, "User denied camera permission", null);
        }
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    public final void a(int i2) {
        this.f7253a.a(i2);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        requestWindowFeature(1);
        this.f7261j = new b(this);
        setContentView(R.layout.bt);
        b bVar = this.f7261j;
        if (bVar.a()) {
            bVar.f7291b = new e(bVar.f7290a);
            bVar.f7291b.f7306b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: IPUT  
                  (wrap: com.bytedance.android.ecommerce.ocr.view.b$1 : 0x002c: CONSTRUCTOR  (r0v31 com.bytedance.android.ecommerce.ocr.view.b$1) = (r3v0 'bVar' com.bytedance.android.ecommerce.ocr.view.b) call: com.bytedance.android.ecommerce.ocr.view.b.1.<init>(com.bytedance.android.ecommerce.ocr.view.b):void type: CONSTRUCTOR)
                  (wrap: com.bytedance.android.ecommerce.ocr.view.e : 0x0028: IGET  (r1v5 com.bytedance.android.ecommerce.ocr.view.e) = (r3v0 'bVar' com.bytedance.android.ecommerce.ocr.view.b) com.bytedance.android.ecommerce.ocr.view.b.b com.bytedance.android.ecommerce.ocr.view.e)
                 com.bytedance.android.ecommerce.ocr.view.e.b com.bytedance.android.ecommerce.ocr.view.e$a in method: com.bytedance.android.ecommerce.ocr.view.OcrActivity.onCreate(android.os.Bundle):void, file: classes7.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: CONSTRUCTOR  (r0v31 com.bytedance.android.ecommerce.ocr.view.b$1) = (r3v0 'bVar' com.bytedance.android.ecommerce.ocr.view.b) call: com.bytedance.android.ecommerce.ocr.view.b.1.<init>(com.bytedance.android.ecommerce.ocr.view.b):void type: CONSTRUCTOR in method: com.bytedance.android.ecommerce.ocr.view.OcrActivity.onCreate(android.os.Bundle):void, file: classes7.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.ecommerce.ocr.view.b, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 23 more
                */
            /*
            // Method dump skipped, instructions count: 197
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.view.OcrActivity.onCreate(android.os.Bundle):void");
        }

        @Override // androidx.fragment.app.e, androidx.core.app.a.AbstractC0026a
        public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
            if (i2 != f7252g) {
                return;
            }
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f7253a.c();
            } else if (!isFinishing()) {
                String a2 = c.f7063a.h().a("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_usernotice");
                String a3 = c.f7063a.h().a("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_userok");
                String a4 = c.f7063a.h().a("pipo_payin_dropin_cashier_bindcard_cardnumber_ocrpopup_usercancel");
                AnonymousClass3 r1 = new a.AbstractC0097a() {
                    /* class com.bytedance.android.ecommerce.ocr.view.OcrActivity.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(3485);
                    }

                    @Override // com.bytedance.android.ecommerce.view.a.AbstractC0097a
                    public final void a() {
                        OcrActivity.this.finish();
                    }

                    @Override // com.bytedance.android.ecommerce.view.a.AbstractC0097a
                    public final void b() {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", OcrActivity.this.getPackageName(), null));
                        OcrActivity ocrActivity = OcrActivity.this;
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, ocrActivity);
                        ocrActivity.startActivity(intent);
                        OcrActivity.this.f7255c = true;
                    }
                };
                com.bytedance.android.ecommerce.view.a aVar = new com.bytedance.android.ecommerce.view.a(this);
                aVar.f7329b = a2;
                aVar.f7330c = a4;
                aVar.f7331d = a3;
                aVar.f7328a = r1;
                aVar.show();
            }
        }

        @Override // com.bytedance.android.ecommerce.c.d
        public final void a(int i2, int i3, String str, b bVar) {
            try {
                c.f7063a.k().a(i2, i3, str, bVar);
            } finally {
                this.f7264m = true;
                finish();
            }
        }
    }
