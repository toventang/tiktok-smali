package com.bytedance.lighten.loader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.d;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.u;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.e;

public class SmartCircleImageView extends SmartImageView {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f39926a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f39927b;

    /* renamed from: d  reason: collision with root package name */
    private Paint f39928d = new Paint();

    /* renamed from: e  reason: collision with root package name */
    private Bitmap f39929e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f39930f;

    /* renamed from: g  reason: collision with root package name */
    private Canvas f39931g;

    /* renamed from: h  reason: collision with root package name */
    private int f39932h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f39933i;

    static {
        Covode.recordClassIndex(24627);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public void a() {
        super.a();
        e eVar = ((a) getHierarchy()).f47454a;
        if (eVar == null) {
            eVar = new e();
        }
        eVar.f47476b = true;
        ((a) getHierarchy()).a(eVar);
        ((a) getHierarchy()).a(q.b.f47442h);
        d();
    }

    private void d() {
        Bitmap.Config config;
        MethodCollector.i(11868);
        if (!this.f39927b) {
            MethodCollector.o(11868);
            return;
        }
        Drawable drawable = getDrawable();
        this.f39930f = drawable;
        if (drawable == null) {
            MethodCollector.o(11868);
        } else if (getWidth() <= 0 || getHeight() <= 0) {
            MethodCollector.o(11868);
        } else {
            if (this.f39930f.getOpacity() != -1) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            int intrinsicWidth = this.f39930f.getIntrinsicWidth();
            int intrinsicHeight = this.f39930f.getIntrinsicHeight();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = getWidth();
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = getHeight();
            }
            Bitmap bitmap = this.f39929e;
            if (bitmap != null) {
                if (intrinsicWidth == bitmap.getWidth() && intrinsicHeight == this.f39929e.getHeight()) {
                    Canvas canvas = this.f39931g;
                    if (canvas != null) {
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    }
                    MethodCollector.o(11868);
                    return;
                } else if (!this.f39929e.isRecycled()) {
                    this.f39929e.recycle();
                }
            }
            this.f39932h = Math.min(intrinsicWidth, intrinsicHeight) / 2;
            this.f39929e = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
            Canvas canvas2 = new Canvas(this.f39929e);
            this.f39931g = canvas2;
            this.f39930f.setBounds(0, 0, canvas2.getWidth(), this.f39931g.getHeight());
            Bitmap bitmap2 = this.f39929e;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
            this.f39928d.setAntiAlias(true);
            this.f39928d.setShader(bitmapShader);
            MethodCollector.o(11868);
        }
    }

    public SmartCircleImageView(Context context) {
        super(context);
    }

    @Override // com.facebook.drawee.view.c
    public void setController(com.facebook.drawee.h.a aVar) {
        if (this.f39927b) {
            this.f39926a = true;
            setImageDrawable(null);
        }
        super.setController(aVar);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView
    public final void a(u uVar) {
        if (r.a().s) {
            this.f39933i = uVar.J;
        } else {
            this.f39927b = uVar.J;
        }
        if (r.a().s) {
            final k kVar = uVar.F;
            if (kVar == null) {
                uVar.F = new d() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(24628);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, Throwable th) {
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                        if (animatable != null) {
                            SmartCircleImageView.this.f39926a = true;
                            SmartCircleImageView.this.f39927b = true;
                            return;
                        }
                        SmartCircleImageView.this.f39926a = false;
                        SmartCircleImageView.this.f39927b = false;
                    }
                };
            } else {
                uVar.F = new k() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(24629);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri) {
                        kVar.a(uri);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view) {
                        kVar.a(uri, view);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, o oVar) {
                        kVar.a(uri, oVar);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, Throwable th) {
                        kVar.a(uri, th);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, Throwable th) {
                        kVar.a(uri, view, th);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                        if (animatable != null) {
                            SmartCircleImageView.this.f39926a = true;
                            SmartCircleImageView.this.f39927b = true;
                        } else {
                            SmartCircleImageView.this.f39926a = false;
                            SmartCircleImageView.this.f39927b = false;
                        }
                        kVar.a(uri, view, oVar, animatable);
                    }
                };
            }
        } else if (this.f39927b) {
            final k kVar2 = uVar.F;
            if (kVar2 == null) {
                uVar.F = new d() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(24630);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, Throwable th) {
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                        SmartCircleImageView.this.f39926a = true;
                    }
                };
            } else {
                uVar.F = new k() {
                    /* class com.bytedance.lighten.loader.SmartCircleImageView.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(24631);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri) {
                        kVar2.a(uri);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view) {
                        kVar2.a(uri, view);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, o oVar) {
                        kVar2.a(uri, oVar);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, Throwable th) {
                        kVar2.a(uri, th);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, Throwable th) {
                        kVar2.a(uri, view, th);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                        SmartCircleImageView.this.f39926a = true;
                        kVar2.a(uri, view, oVar, animatable);
                    }
                };
            }
        }
        super.a(uVar);
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        if (r.a().s) {
            if (!this.f39927b || !this.f39933i) {
                super.onDraw(canvas);
                return;
            }
            if (this.f39926a) {
                d();
                this.f39926a = false;
            }
            Drawable drawable = this.f39930f;
            if (!(drawable == null || (canvas3 = this.f39931g) == null)) {
                drawable.draw(canvas3);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f39932h, this.f39928d);
        } else if (this.f39927b) {
            if (this.f39926a) {
                d();
                this.f39926a = false;
            }
            Drawable drawable2 = this.f39930f;
            if (!(drawable2 == null || (canvas2 = this.f39931g) == null)) {
                drawable2.draw(canvas2);
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (float) this.f39932h, this.f39928d);
        } else {
            super.onDraw(canvas);
        }
    }

    public SmartCircleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        d();
    }
}
