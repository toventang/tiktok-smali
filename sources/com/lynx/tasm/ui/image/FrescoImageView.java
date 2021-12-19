package com.lynx.tasm.ui.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.k.g;
import com.facebook.drawee.c.d;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.c.f;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.f;
import com.lynx.tasm.ui.image.b.a;
import com.lynx.tasm.ui.image.b.d;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FrescoImageView extends SimpleDraweeView {
    public static ConcurrentHashMap<String, b> sUrlImageSizeMap = new ConcurrentHashMap<>();
    private com.lynx.tasm.ui.image.b.a mBigImageHelper;
    private Bitmap.Config mBitmapConfig = null;
    private com.lynx.tasm.behavior.ui.utils.b mBorderRadii = null;
    private com.lynx.tasm.ui.image.b.c mCachedImageSource;
    private final Object mCallerContext;
    private String mCapInsets = null;
    private String mCapInsetsScale = null;
    private d mControllerForTesting;
    private d mControllerListener;
    private boolean mCoverStart;
    private com.facebook.imagepipeline.o.b mCurImageRequest;
    public boolean mDisableDefaultPlaceholder = false;
    private final com.facebook.drawee.c.b mDraweeControllerBuilder;
    private int mFadeDurationMs = -1;
    private boolean mFixFrescoBug;
    private boolean mFrescoNinePatch = false;
    private GlobalImageLoadListener mGlobalImageLoadListener;
    private ReadableMap mHeaders;
    private com.lynx.tasm.ui.image.b.c mImagePlaceholder;
    public com.lynx.tasm.ui.image.b.c mImageSource;
    protected boolean mIsBorderRadiusDirty;
    protected boolean mIsDirty;
    public boolean mIsFrescoAttach = false;
    public boolean mIsFrescoVisible = false;
    private boolean mIsNoSubSampleMode = false;
    private com.facebook.imagepipeline.m.b mIterativeBoxBlurPostProcessor;
    public d mLoaderCallback;
    private Drawable mLoadingImageDrawable;
    private int mLoopCount = 0;
    private int mOverlayColor;
    private float mPreFetchHeight = -1.0f;
    private float mPreFetchWidth = -1.0f;
    private boolean mProgressiveRenderingEnabled;
    private String mRawSrc;
    public com.facebook.common.h.a<?> mRef = null;
    private boolean mRepeat;
    private f mResizeMethod = f.AUTO;
    private int mRetryCount;
    private q.b mScaleType = q.b.f47436b;
    private int mShowCnt;
    public int mSourceImageHeight = 0;
    public int mSourceImageWidth = 0;
    private final List<com.lynx.tasm.ui.image.b.c> mSources;
    public com.facebook.common.h.a<Bitmap> mTempPlaceHolder = null;
    private boolean mUseLocalCache = false;

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void markDirty() {
        this.mIsDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onImageRequestLoaded() {
    }

    /* access modifiers changed from: protected */
    public void onPostprocessorPreparing(List<com.facebook.imagepipeline.o.d> list) {
    }

    public q.b getFrescoScaleType() {
        return this.mScaleType;
    }

    /* access modifiers changed from: protected */
    public int getLoopCount() {
        return this.mLoopCount;
    }

    public void setFrescoAttach() {
        doAttach();
    }

    static {
        Covode.recordClassIndex(35402);
    }

    private boolean hasMultipleSources() {
        if (this.mSources.size() > 1) {
            return true;
        }
        return false;
    }

    private void onSourceSetted() {
        int i2 = this.mShowCnt + 1;
        this.mShowCnt = i2;
        com.lynx.tasm.ui.image.b.a aVar = this.mBigImageHelper;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    public void setFrescoVisible() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    class a implements a.b {
        static {
            Covode.recordClassIndex(35406);
        }

        @Override // com.lynx.tasm.ui.image.b.a.b
        public final void a() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                FrescoImageView.this.invalidate();
            } else {
                FrescoImageView.this.postInvalidate();
            }
        }

        a() {
        }
    }

    @Override // com.facebook.drawee.view.c
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mIsFrescoVisible) {
            setFrescoVisible();
        }
        if (this.mIsFrescoAttach) {
            setFrescoAttach();
        }
    }

    private boolean isSupportPostProcess() {
        com.lynx.tasm.ui.image.b.c cVar = this.mImageSource;
        if (cVar == null) {
            return false;
        }
        String lowerCase = cVar.a().toString().toLowerCase();
        if (lowerCase.endsWith(".gif") || lowerCase.endsWith(".apng")) {
            return false;
        }
        return true;
    }

    private void setSourceImage() {
        this.mImageSource = null;
        if (!this.mSources.isEmpty()) {
            if (hasMultipleSources()) {
                d.a a2 = com.lynx.tasm.ui.image.b.d.a(getWidth(), getHeight(), this.mSources);
                this.mImageSource = a2.f56965a;
                this.mCachedImageSource = a2.f56966b;
                return;
            }
            this.mImageSource = this.mSources.get(0);
        }
    }

    public void destroy() {
        com.lynx.tasm.ui.image.b.a aVar = this.mBigImageHelper;
        if (aVar != null) {
            aVar.a();
        }
        com.facebook.common.h.a<?> aVar2 = this.mRef;
        if (aVar2 != null) {
            aVar2.close();
            this.mRef = null;
        }
        if (this.mTempPlaceHolder != null) {
            com.facebook.drawee.f.a aVar3 = (com.facebook.drawee.f.a) getHierarchy();
            if (aVar3 != null) {
                aVar3.a(1, (Drawable) null);
            }
            this.mTempPlaceHolder.close();
            this.mTempPlaceHolder = null;
        }
    }

    public String getSrc() {
        List<com.lynx.tasm.ui.image.b.c> list = this.mSources;
        if (list == null || list.size() <= 0 || this.mSources.get(0) == null) {
            return null;
        }
        return this.mSources.get(0).a().toString();
    }

    public void maybeUpdateView() {
        if ((this.mIsDirty && !hasMultipleSources() && getWidth() > 0 && getHeight() > 0) || this.mPreFetchWidth > 0.0f || this.mPreFetchHeight > 0.0f) {
            if (getWidth() <= 0 || getHeight() <= 0) {
                tryFetchImage((int) this.mPreFetchWidth, (int) this.mPreFetchHeight, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            } else {
                maybeUpdateViewInternal(getWidth(), getHeight(), getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
    }

    public void fixFrescoWebPBug(boolean z) {
        this.mFixFrescoBug = z;
    }

    public void setBorderColor(int i2) {
        this.mIsDirty = true;
    }

    public void setBorderWidth(float f2) {
        this.mIsDirty = true;
    }

    public void setDisableDefaultPlaceHolder(boolean z) {
        this.mDisableDefaultPlaceholder = z;
    }

    public void setFadeDuration(int i2) {
        this.mFadeDurationMs = i2;
    }

    public void setFrescoNinePatch(boolean z) {
        this.mFrescoNinePatch = z;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setImageLoaderCallback(d dVar) {
        this.mLoaderCallback = dVar;
    }

    public void setLocalCache(boolean z) {
        this.mUseLocalCache = z;
    }

    public void setLoopCount(int i2) {
        this.mLoopCount = i2;
    }

    public void setNoSubSampleMode(boolean z) {
        this.mIsNoSubSampleMode = z;
    }

    public void setPreFetchHeight(float f2) {
        this.mPreFetchHeight = f2;
    }

    public void setPreFetchWidth(float f2) {
        this.mPreFetchWidth = f2;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public void setRepeat(boolean z) {
        this.mRepeat = z;
    }

    /* access modifiers changed from: protected */
    public com.facebook.imagepipeline.o.c createImageRequestBuilder(Uri uri) {
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri);
        com.lynx.tasm.ui.image.b.b.a(a2);
        return a2;
    }

    public void setBitmapConfig(Bitmap.Config config) {
        this.mBitmapConfig = config;
        this.mIsDirty = true;
    }

    public void setBorderRadius(com.lynx.tasm.behavior.ui.utils.b bVar) {
        this.mBorderRadii = bVar;
        this.mIsDirty = true;
        this.mIsBorderRadiusDirty = true;
    }

    public void setCapInsets(String str) {
        this.mCapInsets = str;
        this.mIsDirty = true;
    }

    public void setCapInsetsScale(String str) {
        this.mCapInsetsScale = str;
        this.mIsDirty = true;
    }

    public void setCoverStart(boolean z) {
        this.mCoverStart = z;
        this.mIsDirty = true;
    }

    public void setOverlayColor(int i2) {
        this.mOverlayColor = i2;
        this.mIsDirty = true;
    }

    public void setPlaceholder(String str) {
        setPlaceholder(str, true);
    }

    public void setResizeMethod(f fVar) {
        this.mResizeMethod = fVar;
        this.mIsDirty = true;
    }

    public void setScaleType(q.b bVar) {
        this.mScaleType = bVar;
        this.mIsDirty = true;
    }

    public void setSrcSkippingRedirection(String str) {
        setSrc(str, false);
    }

    public void setControllerListener(com.facebook.drawee.c.d dVar) {
        this.mControllerForTesting = dVar;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    public void setSrc(String str) {
        this.mRawSrc = str;
        this.mRetryCount = 1;
        setSrc(str, true);
    }

    private static com.facebook.drawee.f.a buildHierarchy(Context context) {
        com.facebook.drawee.f.b bVar = new com.facebook.drawee.f.b(context.getResources());
        bVar.t = e.b(0.0f);
        return bVar.a();
    }

    private void warnImageSource(String str) {
        LLog.c("Lynx", "Warning: Image source \"" + str + "\" doesn't exist");
    }

    @Override // com.facebook.drawee.view.c
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable th) {
            LLog.d("Lynx FrescoImageView", "catch onTouchEvent exception: " + th.toString());
            return false;
        }
    }

    public void setBlurRadius(int i2) {
        if (i2 == 0) {
            this.mIterativeBoxBlurPostProcessor = null;
        } else {
            this.mIterativeBoxBlurPostProcessor = new com.facebook.imagepipeline.m.b(i2);
        }
        this.mIsDirty = true;
    }

    private boolean shouldResize(com.lynx.tasm.ui.image.b.c cVar) {
        if (cVar == null) {
            return false;
        }
        if (this.mResizeMethod == f.AUTO) {
            if (g.d(cVar.a()) || g.c(cVar.a())) {
                return true;
            }
            return false;
        } else if (this.mResizeMethod == f.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public boolean retryWithRawSrc(String str) {
        if (str != null && str.equals(this.mRawSrc) && str.startsWith("http")) {
            int i2 = this.mRetryCount;
            this.mRetryCount = i2 - 1;
            if (i2 > 0) {
                setSrc(str, false);
                maybeUpdateView();
                return true;
            }
        }
        return false;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable drawable;
        com.lynx.tasm.ui.image.b.e a2 = com.lynx.tasm.ui.image.b.e.a();
        Context context = getContext();
        int a3 = a2.a(context, str);
        com.facebook.drawee.e.b bVar = null;
        if (a3 > 0 && (drawable = context.getResources().getDrawable(a3)) != null) {
            bVar = new com.facebook.drawee.e.b(drawable, 1000);
        }
        this.mLoadingImageDrawable = bVar;
        this.mIsDirty = true;
    }

    public void setSource(String str) {
        this.mSources.clear();
        if (str != null) {
            com.lynx.tasm.ui.image.b.c cVar = new com.lynx.tasm.ui.image.b.c(getContext(), str);
            this.mSources.add(cVar);
            if (Uri.EMPTY.equals(cVar.a())) {
                warnImageSource(str);
            }
        }
        onSourceSetted();
        this.mIsDirty = true;
    }

    private float[] adjustBorderRadiusArrayWithPadding(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return null;
        }
        int i2 = 0;
        float[] fArr2 = {(float) getPaddingLeft(), (float) getPaddingTop(), (float) getPaddingRight(), (float) getPaddingTop(), (float) getPaddingRight(), (float) getPaddingBottom(), (float) getPaddingLeft(), (float) getPaddingBottom()};
        do {
            fArr2[i2] = Math.max(0.0f, fArr[i2] - fArr2[i2]);
            i2++;
        } while (i2 < 8);
        return fArr2;
    }

    public void setSource(ReadableArray readableArray) {
        this.mSources.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                com.lynx.tasm.ui.image.b.c cVar = new com.lynx.tasm.ui.image.b.c(getContext(), string);
                this.mSources.add(cVar);
                if (Uri.EMPTY.equals(cVar.a())) {
                    warnImageSource(string);
                }
            } else {
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    ReadableMap map = readableArray.getMap(i2);
                    String string2 = map.getString("uri");
                    com.lynx.tasm.ui.image.b.c cVar2 = new com.lynx.tasm.ui.image.b.c(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.mSources.add(cVar2);
                    if (Uri.EMPTY.equals(cVar2.a())) {
                        warnImageSource(string2);
                    }
                }
            }
        }
        onSourceSetted();
        this.mIsDirty = true;
    }

    @Override // com.facebook.drawee.view.c
    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        d dVar = this.mLoaderCallback;
        if (dVar != null) {
            dVar.b(getWidth(), getHeight());
        }
        com.facebook.common.h.a<?> aVar = this.mRef;
        if (aVar != null && aVar.d() && this.mUseLocalCache) {
            Object a2 = this.mRef.a();
            if (a2 instanceof com.facebook.imagepipeline.j.b) {
                bitmap = ((com.facebook.imagepipeline.j.b) a2).d();
            } else if (a2 instanceof Bitmap) {
                bitmap = (Bitmap) a2;
            }
            if (bitmap != null) {
                LLog.a(4, "Lynx Android Image", "draw image from local cache");
                if (com.lynx.tasm.ui.image.a.b.a(canvas.getWidth(), canvas.getHeight(), bitmap.getWidth(), bitmap.getHeight(), this.mScaleType, this.mCapInsets, this.mCapInsetsScale, canvas, bitmap)) {
                    return;
                }
            }
        }
        if (!this.mFrescoNinePatch && this.mCapInsets != null) {
            LLog.a(4, "Lynx Android Image", "load origin bitmap to draw image with cap-insets");
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new com.lynx.tasm.ui.image.b.a(new a(), this.mShowCnt);
            }
            if (this.mBigImageHelper.a(getContext(), canvas, this.mCurImageRequest, new a.C1271a(this.mShowCnt, (float) getWidth(), (float) getHeight(), this.mRepeat, this.mScaleType, getSrc(), com.lynx.tasm.ui.image.b.a.a(canvas), this.mCapInsets, this.mCapInsetsScale))) {
                return;
            }
        }
        TraceEvent.a(0, "FrescoImageView.onDraw");
        if (this.mIsNoSubSampleMode || (getController() != null && getController().i() == null && this.mCapInsets == null)) {
            if (this.mBigImageHelper == null) {
                this.mBigImageHelper = new com.lynx.tasm.ui.image.b.a(new a(), this.mShowCnt);
            }
            a.C1271a aVar2 = new a.C1271a(this.mShowCnt, (float) getWidth(), (float) getHeight(), this.mRepeat, this.mScaleType, getSrc(), com.lynx.tasm.ui.image.b.a.a(canvas), this.mCapInsets, this.mCapInsetsScale);
            if (this.mIsNoSubSampleMode) {
                com.lynx.tasm.ui.image.b.a aVar3 = this.mBigImageHelper;
                Context context = getContext();
                com.facebook.imagepipeline.o.b bVar = this.mCurImageRequest;
                aVar3.f56931c = true;
                if (aVar3.f56930b == null || aVar3.f56930b.f56955d == null || aVar3.f56930b.f56957f.f56943a != aVar2.f56943a) {
                    aVar3.a();
                    aVar3.a(context, bVar, aVar2);
                }
                aVar3.a(canvas, aVar3.f56930b);
                TraceEvent.b(0, "FrescoImageView.onDraw");
                return;
            }
            com.lynx.tasm.ui.image.b.a aVar4 = this.mBigImageHelper;
            Context context2 = getContext();
            com.facebook.imagepipeline.o.b bVar2 = this.mCurImageRequest;
            if (DisplayMetricsHolder.a() != null && (aVar2.f56944b > ((float) (DisplayMetricsHolder.a().widthPixels * 3)) || aVar2.f56945c > ((float) DisplayMetricsHolder.a().heightPixels) || aVar2.f56946d)) {
                aVar4.f56931c = false;
                LLog.a("LynxImageHelper", "drawBigImage: w:" + aVar2.f56944b + ", h:" + aVar2.f56945c);
                if (aVar4.f56930b == null || aVar4.f56930b.f56955d == null || aVar4.f56930b.f56957f.f56943a != aVar2.f56943a) {
                    aVar4.a();
                    aVar4.a(context2, bVar2, aVar2);
                }
                aVar4.a(canvas, aVar4.f56930b);
                TraceEvent.b(0, "FrescoImageView.onDraw");
                return;
            }
        }
        try {
            super.onDraw(canvas);
        } catch (OutOfMemoryError e2) {
            LLog.d("FrescoImageView", e2.getMessage());
        }
        TraceEvent.b(0, "FrescoImageView.onDraw");
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f56876a;

        /* renamed from: b  reason: collision with root package name */
        public int f56877b;

        static {
            Covode.recordClassIndex(35407);
        }

        public b(int i2, int i3) {
            this.f56876a = i2;
            this.f56877b = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends com.lynx.tasm.ui.image.a.b {

        /* renamed from: a  reason: collision with root package name */
        private String f56878a;

        static {
            Covode.recordClassIndex(35408);
        }

        @Override // com.lynx.tasm.ui.image.a.b, com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
        public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, f fVar) {
            if (!FrescoImageView.sUrlImageSizeMap.containsKey(this.f56878a)) {
                FrescoImageView.sUrlImageSizeMap.put(this.f56878a, new b(bitmap.getWidth(), bitmap.getHeight()));
            }
            return super.process(bitmap, fVar);
        }

        c(String str, int i2, int i3, int i4, int i5, int i6, int i7, float[] fArr, q.b bVar, String str2, String str3, Bitmap.Config config) {
            super(str, i2, i3, i4, i5, i6, i7, fArr, bVar, str2, str3, config);
            this.f56878a = str;
        }
    }

    private void setPlaceholder(String str, boolean z) {
        if (z) {
            str = com.lynx.tasm.behavior.ui.image.a.a(getContext(), str);
        }
        if (str != null && !str.isEmpty()) {
            com.lynx.tasm.ui.image.b.c cVar = new com.lynx.tasm.ui.image.b.c(getContext(), str);
            this.mImagePlaceholder = cVar;
            if (Uri.EMPTY.equals(cVar.a())) {
                warnImageSource(str);
            }
        }
        this.mIsDirty = true;
    }

    public void tryFetchImageFromLocalCache(int i2, int i3) {
        com.lynx.tasm.ui.image.b.c cVar = this.mImageSource;
        if (cVar != null && cVar.f56961a != null && this.mUseLocalCache && getContext() != null) {
            final String str = this.mImageSource.f56961a;
            com.lynx.tasm.behavior.ui.image.a.a(getContext(), str, (float) i2, (float) i3, new f.a() {
                /* class com.lynx.tasm.ui.image.FrescoImageView.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35404);
                }

                @Override // com.lynx.tasm.behavior.f.a
                public final void a(final Object obj, Throwable th) {
                    if (obj instanceof com.facebook.common.h.a) {
                        AnonymousClass1 r2 = new Runnable() {
                            /* class com.lynx.tasm.ui.image.FrescoImageView.AnonymousClass2.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(35405);
                            }

                            public final void run() {
                                if (FrescoImageView.this.mImageSource != null && str.equals(FrescoImageView.this.mImageSource.f56961a)) {
                                    FrescoImageView.this.mRef = ((com.facebook.common.h.a) obj).clone();
                                    FrescoImageView.this.postInvalidate();
                                }
                            }
                        };
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            r2.run();
                        } else {
                            FrescoImageView.this.post(r2);
                        }
                    }
                }
            });
        }
    }

    private void setSrc(String str, boolean z) {
        if (z) {
            str = com.lynx.tasm.behavior.ui.image.a.a(getContext(), str);
        }
        this.mSources.clear();
        if (str == null || str.isEmpty()) {
            setController(null);
        } else {
            com.lynx.tasm.ui.image.b.c cVar = new com.lynx.tasm.ui.image.b.c(getContext(), str);
            this.mSources.add(cVar);
            if (Uri.EMPTY.equals(cVar.a())) {
                warnImageSource(str);
            }
        }
        onSourceSetted();
        com.facebook.common.h.a<?> aVar = this.mRef;
        if (aVar != null) {
            aVar.close();
            this.mRef = null;
        }
        if (this.mTempPlaceHolder != null) {
            com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) getHierarchy();
            if (aVar2 != null) {
                aVar2.a(1, (Drawable) null);
            }
            this.mTempPlaceHolder.close();
            this.mTempPlaceHolder = null;
        }
        this.mIsDirty = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        boolean z;
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 > 0 && i3 > 0) {
            if (this.mIsDirty || hasMultipleSources()) {
                z = true;
            } else {
                z = false;
            }
            this.mIsDirty = z;
            maybeUpdateView();
        }
    }

    public FrescoImageView(Context context, com.facebook.drawee.c.b bVar, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, buildHierarchy(context));
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
        this.mSources = new LinkedList();
        this.mShowCnt = 0;
        this.mRepeat = false;
        this.mCoverStart = false;
    }

    public void tryFetchImage(int i2, int i3, int i4, int i5, int i6, int i7) {
        maybeUpdateViewInternal(i2, i3, i4, i5, i6, i7);
    }

    private void maybeUpdateViewInternal(int i2, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        com.lynx.tasm.ui.image.b.c cVar;
        e b2;
        boolean z2;
        setSourceImage();
        com.lynx.tasm.ui.image.b.c cVar2 = this.mImageSource;
        if (cVar2 != null || this.mImagePlaceholder != null) {
            if (!shouldResize(cVar2) || (i2 > 0 && i3 > 0)) {
                tryFetchImageFromLocalCache(i2, i3);
                com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) getHierarchy();
                if (!this.mFixFrescoBug) {
                    aVar.a(this.mScaleType);
                }
                if (this.mScaleType == q.b.f47442h && this.mCoverStart) {
                    h hVar = new h();
                    this.mScaleType = hVar;
                    aVar.a(hVar);
                }
                Drawable drawable = this.mLoadingImageDrawable;
                if (drawable != null) {
                    aVar.a(drawable, q.b.f47440f);
                }
                if (this.mScaleType == q.b.f47442h || this.mScaleType == q.b.f47443i) {
                    z = false;
                } else {
                    z = true;
                }
                float[] fArr = null;
                com.lynx.tasm.behavior.ui.utils.b bVar = this.mBorderRadii;
                if (bVar != null) {
                    if (bVar.a((float) (i2 + i4 + i6), (float) (i3 + i5 + i7))) {
                        this.mIsBorderRadiusDirty = true;
                    }
                    fArr = adjustBorderRadiusArrayWithPadding(this.mBorderRadii.a());
                }
                if (this.mIsBorderRadiusDirty) {
                    if (z || fArr == null) {
                        b2 = e.b(0.0f);
                    } else {
                        b2 = new e();
                        i.a(fArr);
                        if (fArr.length == 8) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        i.a(z2, "radii should have exactly 8 values");
                        System.arraycopy(fArr, 0, b2.a(), 0, 8);
                    }
                    int i8 = this.mOverlayColor;
                    if (i8 != 0) {
                        b2.a(i8);
                    } else {
                        b2.f47475a = e.a.BITMAP_ONLY;
                    }
                    aVar.a(b2);
                    this.mIsBorderRadiusDirty = true;
                }
                int i9 = this.mFadeDurationMs;
                if (i9 < 0) {
                    i9 = 0;
                }
                aVar.b(i9);
                REQUEST request = (REQUEST) createImageRequest(this.mImageSource, i2, i3, 0, 0, 0, 0, fArr, this.mScaleType);
                this.mCurImageRequest = request;
                REQUEST request2 = (REQUEST) createImageRequest(this.mCachedImageSource, i2, i3, 0, 0, 0, 0, fArr, this.mScaleType);
                com.facebook.imagepipeline.o.b createImageRequest = createImageRequest(this.mImagePlaceholder, i2, i3, 0, 0, 0, 0, fArr, this.mScaleType);
                if (request2 == null) {
                    request2 = (REQUEST) createImageRequest;
                }
                GlobalImageLoadListener globalImageLoadListener = this.mGlobalImageLoadListener;
                if (!(globalImageLoadListener == null || (cVar = this.mImageSource) == null)) {
                    globalImageLoadListener.onLoadAttempt(cVar.a());
                }
                this.mDraweeControllerBuilder.b();
                final WeakReference weakReference = new WeakReference(this);
                com.facebook.drawee.c.b bVar2 = this.mDraweeControllerBuilder;
                bVar2.f47322j = true;
                bVar2.f47314b = this.mCallerContext;
                bVar2.f47325m = getController();
                bVar2.f47315c = request;
                bVar2.f47316d = request2;
                final String str = this.mRawSrc;
                AnonymousClass1 r3 = new com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f>() {
                    /* class com.lynx.tasm.ui.image.FrescoImageView.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(35403);
                    }

                    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                    public final void onSubmit(String str, Object obj) {
                        LLog.a(6, "FrescoImageView", "onFinalImageSet");
                    }

                    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                    public final void onFailure(String str, Throwable th) {
                        if (!FrescoImageView.this.retryWithRawSrc(str)) {
                            FrescoImageView.this.mIsDirty = true;
                            if (FrescoImageView.this.mLoaderCallback != null) {
                                FrescoImageView.this.mLoaderCallback.a("Android FrescoImageView loading image failed, and the url is " + FrescoImageView.this.getSrc() + ". The Fresco throw error msg is " + th.getMessage());
                            }
                            LLog.d("FrescoImageView", "onFailed src:" + str + "with reason" + th.getMessage());
                        }
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                    @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
                    public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                        com.facebook.imagepipeline.j.f fVar2 = fVar;
                        if (weakReference.get() != null) {
                            ((FrescoImageView) weakReference.get()).onImageRequestLoaded();
                        }
                        if (FrescoImageView.this.mDisableDefaultPlaceholder && (fVar2 instanceof com.facebook.imagepipeline.j.d)) {
                            FrescoImageView.this.mTempPlaceHolder = ((com.facebook.imagepipeline.j.d) fVar2).f();
                            com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) FrescoImageView.this.getHierarchy();
                            if (!(aVar == null || FrescoImageView.this.mTempPlaceHolder == null || FrescoImageView.this.mTempPlaceHolder.a() == null)) {
                                aVar.a(1, new BitmapDrawable(FrescoImageView.this.getResources(), FrescoImageView.this.mTempPlaceHolder.a()));
                            }
                        }
                        if (FrescoImageView.sUrlImageSizeMap.containsKey(FrescoImageView.this.mImageSource.a().toString())) {
                            b bVar = FrescoImageView.sUrlImageSizeMap.get(FrescoImageView.this.mImageSource.a().toString());
                            FrescoImageView.this.mSourceImageHeight = bVar.f56877b;
                            FrescoImageView.this.mSourceImageWidth = bVar.f56876a;
                        } else {
                            FrescoImageView.this.mSourceImageWidth = fVar2.getWidth();
                            FrescoImageView.this.mSourceImageHeight = fVar2.getHeight();
                        }
                        if (FrescoImageView.this.mLoaderCallback != null) {
                            FrescoImageView.this.mLoaderCallback.a(FrescoImageView.this.mSourceImageWidth, FrescoImageView.this.mSourceImageHeight);
                        }
                        if (animatable instanceof com.facebook.fresco.animation.c.a) {
                            com.facebook.fresco.animation.c.a aVar2 = (com.facebook.fresco.animation.c.a) animatable;
                            aVar2.a(new com.lynx.tasm.ui.image.a.c(aVar2.f47564d, FrescoImageView.this.getLoopCount()));
                            com.lynx.tasm.ui.image.b.b.a(aVar2);
                        }
                        LLog.d("FrescoImageView", "onFinalImageSet");
                    }
                };
                this.mControllerListener = r3;
                if (this.mControllerForTesting == null) {
                    this.mDraweeControllerBuilder.f47319g = r3;
                } else {
                    com.facebook.drawee.c.f fVar = new com.facebook.drawee.c.f();
                    fVar.a(this.mControllerListener);
                    fVar.a(this.mControllerForTesting);
                    this.mDraweeControllerBuilder.f47319g = fVar;
                }
                setController(this.mDraweeControllerBuilder.e());
                this.mIsDirty = false;
                this.mDraweeControllerBuilder.b();
            }
        }
    }

    /* access modifiers changed from: protected */
    public com.facebook.imagepipeline.o.b createImageRequest(com.lynx.tasm.ui.image.b.c cVar, int i2, int i3, int i4, int i5, int i6, int i7, float[] fArr, q.b bVar) {
        boolean z;
        com.facebook.imagepipeline.common.d dVar;
        if (cVar == null) {
            return null;
        }
        boolean shouldResize = shouldResize(cVar);
        if (bVar == q.b.f47442h || bVar == q.b.f47443i) {
            z = false;
        } else {
            z = true;
        }
        LinkedList linkedList = new LinkedList();
        if (z) {
            linkedList.add(new c(cVar.a().toString(), i2, i3, i4, i5, i6, i7, fArr, bVar, this.mCapInsets, this.mCapInsetsScale, this.mBitmapConfig));
        }
        com.facebook.imagepipeline.m.b bVar2 = this.mIterativeBoxBlurPostProcessor;
        if (bVar2 != null) {
            linkedList.add(bVar2);
        }
        onPostprocessorPreparing(linkedList);
        com.facebook.imagepipeline.o.d a2 = k.a(linkedList);
        if (shouldResize) {
            dVar = new com.facebook.imagepipeline.common.d(i2, i3);
        } else {
            dVar = null;
        }
        com.facebook.imagepipeline.o.c createImageRequestBuilder = createImageRequestBuilder(cVar.a());
        createImageRequestBuilder.f48447d = dVar;
        com.facebook.imagepipeline.o.c a3 = createImageRequestBuilder.a(true);
        a3.f48451h = this.mProgressiveRenderingEnabled;
        if (isSupportPostProcess()) {
            a3.f48454k = a2;
        }
        return com.lynx.tasm.ui.image.a.d.a(a3, this.mHeaders);
    }
}
