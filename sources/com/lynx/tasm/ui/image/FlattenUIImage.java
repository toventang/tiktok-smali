package com.lynx.tasm.ui.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.e.q;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.d;
import com.lynx.tasm.behavior.ui.utils.b;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.f;
import com.lynx.tasm.ui.image.b.a;
import com.lynx.tasm.ui.image.j;
import com.lynx.tasm.utils.n;

public class FlattenUIImage extends LynxFlattenUI implements Drawable.Callback, j.a {

    /* renamed from: b  reason: collision with root package name */
    protected final j f56840b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f56841c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f56842d;

    /* renamed from: e  reason: collision with root package name */
    String f56843e;

    /* renamed from: f  reason: collision with root package name */
    String f56844f;

    /* renamed from: g  reason: collision with root package name */
    public String f56845g;

    /* renamed from: h  reason: collision with root package name */
    private com.lynx.tasm.ui.image.b.a f56846h;

    /* renamed from: i  reason: collision with root package name */
    private int f56847i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56848j;

    /* renamed from: k  reason: collision with root package name */
    private float f56849k = -1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f56850l = -1.0f;

    /* renamed from: m  reason: collision with root package name */
    private boolean f56851m;
    private com.facebook.common.h.a<?> n;
    private q.b o = q.b.f47436b;
    private boolean p;
    private boolean q;
    private boolean r;

    static {
        Covode.recordClassIndex(35394);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.LynxFlattenUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            boolean z2 = false;
            int i2 = 0;
            boolean z3 = false;
            switch (nextKey.hashCode()) {
                case -1937917490:
                    if (nextKey.equals("cap-insets-scale")) {
                        setCapInsetsScale(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1338903714:
                    if (nextKey.equals("skip-redirection")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSkipRedirection(z);
                        continue;
                    }
                    break;
                case -1138223116:
                    if (nextKey.equals("image-config")) {
                        setImageConfig(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -934531685:
                    if (nextKey.equals("repeat")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setRepeat(z3);
                        continue;
                    }
                    break;
                case -629825370:
                    if (nextKey.equals("loop-count")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setLoopCount(i2);
                        continue;
                    }
                    break;
                case -602643660:
                    if (nextKey.equals("fresco-nine-patch")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setFrescoNinePatch(z2);
                        continue;
                    }
                    break;
                case -256430480:
                    if (nextKey.equals("prefetch-width")) {
                        setPreFetchWidth(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 114148:
                    if (nextKey.equals("src")) {
                        setSource(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 3357091:
                    if (nextKey.equals("mode")) {
                        setObjectFit(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 207594941:
                    if (nextKey.equals("prefetch-height")) {
                        setPreFetchHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 313009824:
                    if (nextKey.equals("local-cache")) {
                        setLocalCache(readableMap.isNull(nextKey) ? null : Boolean.valueOf(readableMap.getBoolean(nextKey, false)));
                        continue;
                    }
                    break;
                case 516005201:
                    if (nextKey.equals("cap-insets")) {
                        setCapInsetsBackUp(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 598246771:
                    if (nextKey.equals("placeholder")) {
                        setPlaceholder(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 681292984:
                    if (nextKey.equals("blur-radius")) {
                        setBlurRadius(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1515751784:
                    if (nextKey.equals("capInsets")) {
                        setCapInsets(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.ui.image.j.a
    public final void O_() {
        c();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void renderIfNeeded() {
        b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        this.f56840b.b();
        com.lynx.tasm.ui.image.b.a aVar = this.f56846h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        c();
        b();
    }

    private void c() {
        Drawable drawable = this.f56842d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        this.f56840b.b();
        com.lynx.tasm.ui.image.b.a aVar = this.f56846h;
        if (aVar != null) {
            aVar.a();
        }
        com.facebook.common.h.a<?> aVar2 = this.n;
        if (aVar2 != null) {
            aVar2.close();
            this.n = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.LynxFlattenUI
    public void onAttach() {
        super.onAttach();
        this.f56840b.a();
        this.f56840b.n = true;
        b();
    }

    class a implements a.b {
        static {
            Covode.recordClassIndex(35399);
        }

        @Override // com.lynx.tasm.ui.image.b.a.b
        public final void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                FlattenUIImage.this.invalidate();
                return;
            }
            FlattenUIImage flattenUIImage = FlattenUIImage.this;
            if (flattenUIImage.f56841c != null) {
                flattenUIImage.f56841c.post(new Runnable() {
                    /* class com.lynx.tasm.ui.image.FlattenUIImage.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(35398);
                    }

                    public final void run() {
                        FlattenUIImage.this.invalidate();
                    }
                });
            }
        }

        a() {
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.q) {
            if (this.r) {
                this.f56840b.a(this.f56845g, false);
            } else {
                this.f56840b.a(this.f56845g);
            }
            this.q = false;
        }
        b();
    }

    private void b() {
        if (getWidth() <= 0 && getHeight() <= 0) {
            float f2 = this.f56849k;
            if (f2 > 0.0f) {
                float f3 = this.f56850l;
                if (f3 > 0.0f) {
                    this.f56840b.a((int) f2, (int) f3, this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
                    return;
                }
            }
        }
        this.f56840b.a(getWidth(), getHeight(), this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @m(a = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @m(a = "fresco-nine-patch", f = false)
    public void setFrescoNinePatch(boolean z) {
        this.p = z;
    }

    @m(a = "repeat", f = false)
    public void setRepeat(boolean z) {
        this.f56848j = z;
    }

    @m(a = "skip-redirection", f = false)
    public void setSkipRedirection(boolean z) {
        this.r = z;
    }

    @m(a = "loop-count")
    public void setLoopCount(int i2) {
        if (i2 <= 0) {
            i2 = 0;
        }
        this.f56840b.E = i2;
    }

    @Override // com.lynx.tasm.ui.image.j.a
    public final void a(Drawable drawable) {
        this.f56842d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        c();
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        this.f56840b.a(this.mBitmapConfig);
    }

    @m(a = "mode")
    public void setObjectFit(String str) {
        q.b a2 = g.a(str);
        this.o = a2;
        j jVar = this.f56840b;
        jVar.f56998m = a2;
        jVar.n = true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setParent(d dVar) {
        super.setParent(dVar);
        this.f56840b.a();
    }

    @Override // com.lynx.tasm.ui.image.j.a
    public final void a(com.facebook.common.h.a<?> aVar) {
        if (aVar != null && this.f56851m) {
            this.n = aVar.clone();
            invalidate();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i2) {
        j jVar = this.f56840b;
        b d2 = this.mLynxBackground.d();
        if (jVar.o != d2) {
            jVar.o = d2;
            jVar.n = true;
        } else if (d2 == null || d2.f56399d == null) {
            jVar.n = true;
        }
    }

    @m(a = "capInsets")
    public void setCapInsets(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.f56843e = null;
        } else {
            this.f56843e = str;
        }
        j jVar = this.f56840b;
        jVar.C = this.f56843e;
        jVar.n = true;
    }

    @m(a = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.f56844f = null;
        } else {
            this.f56844f = str;
        }
        j jVar = this.f56840b;
        jVar.D = this.f56844f;
        jVar.n = true;
    }

    @m(a = "local-cache")
    public void setLocalCache(Boolean bool) {
        if (this.f56840b != null) {
            if (bool == null) {
                this.f56851m = false;
            }
            boolean booleanValue = bool.booleanValue();
            this.f56851m = booleanValue;
            this.f56840b.F = booleanValue;
        }
    }

    @m(a = "prefetch-height")
    public void setPreFetchHeight(String str) {
        this.f56850l = n.a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.p);
    }

    @m(a = "prefetch-width")
    public void setPreFetchWidth(String str) {
        this.f56849k = n.a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.p);
    }

    public FlattenUIImage(com.lynx.tasm.behavior.j jVar) {
        super(jVar);
        j jVar2 = new j(jVar, c.b(), this, false);
        this.f56840b = jVar2;
        jVar2.u = new d() {
            /* class com.lynx.tasm.ui.image.FlattenUIImage.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35397);
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(String str) {
                com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(FlattenUIImage.this.getSign(), "error");
                cVar.a("errMsg", str);
                FlattenUIImage.this.mContext.f55897e.a(cVar);
                FlattenUIImage.this.mContext.f55897e.a(new f(FlattenUIImage.this.getSign()));
                FlattenUIImage.this.mContext.a(FlattenUIImage.this.f56845g, "image", str);
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(int i2, int i3) {
                if (FlattenUIImage.this.mEvents != null && FlattenUIImage.this.mEvents.containsKey("load")) {
                    com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(FlattenUIImage.this.getSign(), "load");
                    cVar.a("height", Integer.valueOf(i3));
                    cVar.a("width", Integer.valueOf(i2));
                    FlattenUIImage.this.mContext.f55897e.a(cVar);
                }
            }
        };
        this.f56841c = new Handler(Looper.getMainLooper());
        this.f56847i = 0;
        this.f56848j = false;
    }

    @m(a = "blur-radius")
    public void setBlurRadius(String str) {
        UIBody uIBody = this.mContext.f55901i;
        j jVar = this.f56840b;
        int round = Math.round(n.a(str, uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), this.mContext.p));
        if (round == 0) {
            jVar.f56990e = null;
        } else {
            jVar.f56990e = new com.facebook.imagepipeline.m.b(round);
        }
        jVar.n = true;
    }

    @m(a = "placeholder")
    public void setPlaceholder(String str) {
        j jVar = this.f56840b;
        String a2 = com.lynx.tasm.behavior.ui.image.a.a(jVar.f56986a, str);
        if (jVar.f56988c == null || !jVar.f56988c.f56961a.equals(a2)) {
            if (a2 != null && !a2.isEmpty()) {
                com.lynx.tasm.ui.image.b.c cVar = new com.lynx.tasm.ui.image.b.c(jVar.f56986a, a2);
                jVar.f56988c = cVar;
                if (Uri.EMPTY.equals(cVar.a())) {
                    j.b(a2);
                }
            }
            jVar.n = true;
        }
    }

    @m(a = "src")
    public void setSource(String str) {
        if (!TextUtils.equals(str, this.f56840b.c())) {
            this.f56842d = null;
            com.facebook.common.h.a<?> aVar = this.n;
            if (aVar != null) {
                aVar.close();
                this.n = null;
            }
        }
        this.f56845g = str;
        this.q = true;
        int i2 = this.f56847i + 1;
        this.f56847i = i2;
        com.lynx.tasm.ui.image.b.a aVar2 = this.f56846h;
        if (aVar2 != null) {
            aVar2.a(i2);
        }
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxFlattenUI
    public final void c(Canvas canvas) {
        Bitmap bitmap;
        super.c(canvas);
        if (this.f56842d != null || this.n != null) {
            com.facebook.common.h.a<?> aVar = this.n;
            if (aVar != null && aVar.d() && this.f56851m) {
                Object a2 = this.n.a();
                if (a2 instanceof com.facebook.imagepipeline.j.b) {
                    bitmap = ((com.facebook.imagepipeline.j.b) a2).d();
                } else if (a2 instanceof Bitmap) {
                    bitmap = (Bitmap) a2;
                }
                if (bitmap != null) {
                    LLog.a(4, "Lynx Android Flatten Image", "draw image from local cache");
                    if (com.lynx.tasm.ui.image.a.b.a(getWidth(), getHeight(), bitmap.getWidth(), bitmap.getHeight(), this.o, this.f56843e, this.f56844f, canvas, bitmap)) {
                        return;
                    }
                }
            }
            if (!this.p && this.f56843e != null) {
                LLog.a(4, "Lynx Android Flatten Image", "load origin bitmap to draw image with cap-insets");
                if (this.f56846h == null) {
                    this.f56846h = new com.lynx.tasm.ui.image.b.a(new a(), this.f56847i);
                }
                if (this.f56846h.a(this.mContext, canvas, this.f56840b.s, new a.C1271a(this.f56847i, (float) getWidth(), (float) getHeight(), this.f56848j, this.o, this.f56840b.c(), com.lynx.tasm.ui.image.b.a.a(canvas), this.f56843e, this.f56844f))) {
                    return;
                }
            }
            this.f56842d.draw(canvas);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        com.lynx.tasm.utils.m.a(runnable, drawable);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        com.lynx.tasm.utils.m.a(runnable, drawable, j2);
    }
}
