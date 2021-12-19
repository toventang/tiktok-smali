package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.h;
import com.facebook.drawee.h.b;
import com.facebook.drawee.view.a;
import com.ss.android.ugc.aweme.lancet.k;

public class c<DH extends b> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio = 0.0f;
    private b<DH> mDraweeHolder;
    private boolean mInitialised = false;
    private boolean mLegacyVisibilityHandlingEnabled = false;
    private final a.C1175a mMeasureSpec = new a.C1175a();

    static {
        Covode.recordClassIndex(28814);
    }

    public void DraweeView__onDraw$___twin___(Canvas canvas) {
        MethodCollector.i(1679);
        super.onDraw(canvas);
        MethodCollector.o(1679);
    }

    public void onDetachedFromWindow() {
        com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow(this);
    }

    public void onDraw(Canvas canvas) {
        com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(this, canvas);
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    /* access modifiers changed from: protected */
    public void onAttach() {
        doAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetach() {
        doDetach();
    }

    /* access modifiers changed from: protected */
    public void doAttach() {
        this.mDraweeHolder.b();
    }

    /* access modifiers changed from: protected */
    public void doDetach() {
        this.mDraweeHolder.c();
    }

    public com.facebook.drawee.h.a getController() {
        return this.mDraweeHolder.f47495b;
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.d();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.f();
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.e();
    }

    public void DraweeView__onDetachedFromWindow$___twin___() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public boolean hasController() {
        if (this.mDraweeHolder.f47495b != null) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public String toString() {
        String str;
        h.a a2 = h.a(this);
        b<DH> bVar = this.mDraweeHolder;
        if (bVar != null) {
            str = bVar.toString();
        } else {
            str = "<no holder set>";
        }
        return a2.a("holder", str).toString();
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public static void com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_simpleDraweeViewOnDetachedFromWindow(c cVar) {
        cVar.DraweeView__onDetachedFromWindow$___twin___();
        k.a(cVar);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f2) {
        if (f2 != this.mAspectRatio) {
            this.mAspectRatio = f2;
            requestLayout();
        }
    }

    public void setController(com.facebook.drawee.h.a aVar) {
        this.mDraweeHolder.a(aVar);
        super.setImageDrawable(this.mDraweeHolder.f());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.b(dh);
        super.setImageDrawable(this.mDraweeHolder.f());
    }

    public c(Context context) {
        super(context);
        MethodCollector.i(1426);
        init(context);
        MethodCollector.o(1426);
    }

    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.a((com.facebook.drawee.h.a) null);
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.a((com.facebook.drawee.h.a) null);
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i2) {
        init(getContext());
        this.mDraweeHolder.a((com.facebook.drawee.h.a) null);
        super.setImageResource(i2);
    }

    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.a((com.facebook.drawee.h.a) null);
        super.setImageURI(uri);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context) {
        try {
            com.facebook.imagepipeline.p.b.a();
            if (this.mInitialised) {
                com.facebook.imagepipeline.p.b.a();
                return;
            }
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = b.a((b) null);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    com.facebook.imagepipeline.p.b.a();
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
            com.facebook.imagepipeline.p.b.a();
        } catch (Throwable th) {
            com.facebook.imagepipeline.p.b.a();
            throw th;
        }
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        maybeOverrideVisibilityHandling();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1427);
        init(context);
        MethodCollector.o(1427);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(com.facebook.drawee.view.c r7, android.graphics.Canvas r8) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.view.c.com_facebook_drawee_view_DraweeView_com_ss_android_ugc_aweme_lancet_DraweeViewLanect_onDraw(com.facebook.drawee.view.c, android.graphics.Canvas):void");
    }

    public void onMeasure(int i2, int i3) {
        MethodCollector.i(1487);
        this.mMeasureSpec.f47492a = i2;
        this.mMeasureSpec.f47493b = i3;
        a.C1175a aVar = this.mMeasureSpec;
        float f2 = this.mAspectRatio;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (f2 > 0.0f && layoutParams != null) {
            if (a.a(layoutParams.height)) {
                aVar.f47493b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f47492a) - paddingLeft)) / f2) + ((float) paddingTop)), aVar.f47493b), 1073741824);
            } else if (a.a(layoutParams.width)) {
                aVar.f47492a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f47493b) - paddingTop)) * f2) + ((float) paddingLeft)), aVar.f47492a), 1073741824);
            }
        }
        super.onMeasure(this.mMeasureSpec.f47492a, this.mMeasureSpec.f47493b);
        MethodCollector.o(1487);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(1429);
        init(context);
        MethodCollector.o(1429);
    }

    public c(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        MethodCollector.i(1431);
        init(context);
        MethodCollector.o(1431);
    }
}
