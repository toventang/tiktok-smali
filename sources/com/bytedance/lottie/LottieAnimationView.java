package com.bytedance.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.g.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.f.b;
import com.bytedance.lottie.f.d;
import com.bytedance.lottie.g;
import com.bytedance.lottie.g.c;
import com.bytedance.lottie.h;
import com.bytedance.lottie.i;
import com.bytedance.lottie.n;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public class LottieAnimationView extends AppCompatImageView implements au {

    /* renamed from: c  reason: collision with root package name */
    private static final String f40276c = LottieAnimationView.class.getSimpleName();
    private static boolean r;

    /* renamed from: a  reason: collision with root package name */
    public boolean f40277a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f40278b;

    /* renamed from: d  reason: collision with root package name */
    private final k<g> f40279d = new k<g>() {
        /* class com.bytedance.lottie.LottieAnimationView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(24824);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.lottie.k
        public final /* synthetic */ void a(g gVar) {
            LottieAnimationView.this.setComposition(gVar);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private final k<Throwable> f40280e = new k<Throwable>() {
        /* class com.bytedance.lottie.LottieAnimationView.AnonymousClass2 */

        static {
            Covode.recordClassIndex(24825);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.lottie.k
        public final /* bridge */ /* synthetic */ void a(Throwable th) {
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private final i f40281f;

    /* renamed from: g  reason: collision with root package name */
    private String f40282g;

    /* renamed from: h  reason: collision with root package name */
    private int f40283h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f40284i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f40285j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f40286k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f40287l;

    /* renamed from: m  reason: collision with root package name */
    private Set<l> f40288m;
    private r n;
    private int o;
    private o<g> p;
    private g q;
    private boolean s;
    private boolean t;
    private m u;
    private boolean v;

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    public g getComposition() {
        return this.q;
    }

    public boolean getUseHardwareAcceleration() {
        return this.f40286k;
    }

    public final void e() {
        this.f40281f.f40764b.removeAllUpdateListeners();
    }

    public final void f() {
        this.f40281f.f40764b.removeAllListeners();
    }

    public int getFrame() {
        return (int) this.f40281f.f40764b.f40688c;
    }

    public String getImageAssetsFolder() {
        return this.f40281f.f40768f;
    }

    public float getScale() {
        return this.f40281f.f40765c;
    }

    public float getSpeed() {
        return this.f40281f.f40764b.f40686a;
    }

    public final void j() {
        this.f40288m.clear();
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.bytedance.lottie.LottieAnimationView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24828);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (byte) 0);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        String f40292a;

        /* renamed from: b  reason: collision with root package name */
        int f40293b;

        /* renamed from: c  reason: collision with root package name */
        float f40294c;

        /* renamed from: d  reason: collision with root package name */
        boolean f40295d;

        /* renamed from: e  reason: collision with root package name */
        String f40296e;

        /* renamed from: f  reason: collision with root package name */
        int f40297f;

        /* renamed from: g  reason: collision with root package name */
        int f40298g;

        static {
            Covode.recordClassIndex(24827);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f40292a = parcel.readString();
            this.f40294c = parcel.readFloat();
            this.f40295d = parcel.readInt() != 1 ? false : true;
            this.f40296e = parcel.readString();
            this.f40297f = parcel.readInt();
            this.f40298g = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f40292a);
            parcel.writeFloat(this.f40294c);
            parcel.writeInt(this.f40295d ? 1 : 0);
            parcel.writeString(this.f40296e);
            parcel.writeInt(this.f40297f);
            parcel.writeInt(this.f40298g);
        }
    }

    static {
        Covode.recordClassIndex(24823);
    }

    private void k() {
        if (this.f40277a) {
            this.f40281f.a();
        }
    }

    public final void b() {
        if (!this.f40286k) {
            this.f40286k = true;
            m();
        }
    }

    public final void c() {
        this.f40278b = true;
        this.f40281f.d();
        this.s = true;
        m();
    }

    public final void d() {
        this.f40281f.e();
        m();
    }

    public final boolean g() {
        return this.f40281f.f40764b.isRunning();
    }

    public long getDuration() {
        g gVar = this.q;
        if (gVar != null) {
            return (long) gVar.a();
        }
        return 0;
    }

    public float getMaxFrame() {
        return this.f40281f.f40764b.k();
    }

    public float getMinFrame() {
        return this.f40281f.f40764b.j();
    }

    public q getPerformanceTracker() {
        i iVar = this.f40281f;
        if (iVar.f40763a != null) {
            return iVar.f40763a.f40705a;
        }
        return null;
    }

    public float getProgress() {
        return this.f40281f.f40764b.d();
    }

    public int getRepeatCount() {
        return this.f40281f.f40764b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f40281f.f40764b.getRepeatMode();
    }

    public final void h() {
        this.f40278b = false;
        this.f40281f.h();
        m();
    }

    public final void i() {
        this.f40281f.i();
        m();
    }

    private void l() {
        o<g> oVar = this.p;
        if (oVar != null) {
            oVar.b(this.f40279d);
            this.p.d(this.f40280e);
        }
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        if (!this.t) {
            this.t = true;
            boolean isRunning = this.f40281f.f40764b.isRunning();
            if (this.v) {
                this.s = isRunning;
            }
            if (isRunning) {
                i();
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        if (this.t) {
            this.t = false;
            if (this.s && this.v) {
                d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.LottieAnimationView$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40291a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 24826(0x60fa, float:3.4789E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.r[] r0 = com.bytedance.lottie.r.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.LottieAnimationView.AnonymousClass3.f40291a = r2
                com.bytedance.lottie.r r0 = com.bytedance.lottie.r.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.LottieAnimationView.AnonymousClass3.f40291a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.r r0 = com.bytedance.lottie.r.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.lottie.LottieAnimationView.AnonymousClass3.f40291a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.lottie.r r0 = com.bytedance.lottie.r.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.LottieAnimationView.AnonymousClass3.<clinit>():void");
        }
    }

    public final void a() {
        this.f40287l = true;
        setAutoRecycleBitmap(false);
        this.f40281f.o = true;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f40285j && this.f40284i) {
            c();
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
        m mVar = this.u;
        if (mVar != null) {
            mVar.getLifecycle().a(this);
            return;
        }
        Activity a2 = b.a(getContext());
        if (a2 instanceof m) {
            ((m) a2).getLifecycle().a(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f40292a = this.f40282g;
        savedState.f40293b = this.f40283h;
        savedState.f40294c = this.f40281f.f40764b.d();
        savedState.f40295d = this.f40281f.f40764b.isRunning();
        savedState.f40296e = this.f40281f.f40768f;
        savedState.f40297f = this.f40281f.f40764b.getRepeatMode();
        savedState.f40298g = this.f40281f.f40764b.getRepeatCount();
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (android.os.Build.VERSION.SDK_INT < 23) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r2 == false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r4 = this;
            int[] r1 = com.bytedance.lottie.LottieAnimationView.AnonymousClass3.f40291a
            com.bytedance.lottie.r r0 = r4.n
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r3 = 2
            r1 = 1
            if (r2 == r1) goto L_0x0039
            if (r2 == r3) goto L_0x0038
            r0 = 3
            if (r2 == r0) goto L_0x001e
        L_0x0013:
            int r0 = r4.getLayerType()
            if (r1 == r0) goto L_0x001d
            r0 = 0
            r4.setLayerType(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            com.bytedance.lottie.g r1 = r4.q
            r0 = 0
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1.o
            if (r0 == 0) goto L_0x003e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x003e
        L_0x002d:
            r2 = 0
        L_0x002e:
            boolean r0 = com.bytedance.lottie.LottieAnimationView.r
            if (r0 == 0) goto L_0x003b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x003b
        L_0x0038:
            r3 = 1
        L_0x0039:
            r1 = r3
            goto L_0x0013
        L_0x003b:
            if (r2 == 0) goto L_0x0038
            goto L_0x0039
        L_0x003e:
            com.bytedance.lottie.g r0 = r4.q
            if (r0 == 0) goto L_0x0048
            int r1 = r0.p
            r0 = 4
            if (r1 <= r0) goto L_0x0048
            goto L_0x002d
        L_0x0048:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 >= r0) goto L_0x004f
            goto L_0x002d
        L_0x004f:
            r2 = 1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.LottieAnimationView.m():void");
    }

    public void onDetachedFromWindow() {
        if (this.f40281f.f40764b.isRunning()) {
            h();
            this.f40284i = true;
        }
        Activity a2 = b.a(getContext());
        if (!this.f40287l && (this.f40277a || (a2 != null && a2.isFinishing()))) {
            this.f40281f.a();
        }
        super.onDetachedFromWindow();
        m mVar = this.u;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
            return;
        }
        Activity a3 = b.a(getContext());
        if (a3 instanceof m) {
            ((m) a3).getLifecycle().b(this);
        }
    }

    public static void setOnlyAboveMUseHardware(boolean z) {
        r = z;
    }

    public void setAnimationFromJson(String str) {
        a(str);
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.f40281f.f40764b.addListener(animatorListener);
    }

    public void setAutoRecycleBitmap(boolean z) {
        this.f40277a = z;
        this.f40281f.n = z;
    }

    public void setFrame(int i2) {
        this.f40281f.c(i2);
    }

    public void setImageAssetsFolder(String str) {
        this.f40281f.f40768f = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        a(drawable, true);
    }

    public void setMaxFrame(int i2) {
        this.f40281f.b(i2);
    }

    public void setMaxProgress(float f2) {
        this.f40281f.b(f2);
    }

    public void setMinFrame(int i2) {
        this.f40281f.a(i2);
    }

    public void setMinProgress(float f2) {
        this.f40281f.a(f2);
    }

    public void setProgress(float f2) {
        this.f40281f.c(f2);
    }

    public void setRenderMode(r rVar) {
        this.n = rVar;
        m();
    }

    public void setRepeatCount(int i2) {
        this.f40281f.d(i2);
    }

    public void setRepeatMode(int i2) {
        this.f40281f.f40764b.setRepeatMode(i2);
    }

    public void setSpeed(float f2) {
        this.f40281f.f40764b.f40686a = f2;
    }

    public void setTextDelegate(t tVar) {
        this.f40281f.f40772j = tVar;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        i iVar = this.f40281f;
        if (drawable2 == iVar) {
            super.invalidateDrawable(iVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setFontAssetDelegate(b bVar) {
        i iVar = this.f40281f;
        iVar.f40771i = bVar;
        if (iVar.f40770h != null) {
            iVar.f40770h.f40457c = bVar;
        }
    }

    public void setImageAssetDelegate(c cVar) {
        i iVar = this.f40281f;
        iVar.f40769g = cVar;
        if (iVar.f40767e != null) {
            iVar.f40767e.f40463b = cVar;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        k();
        l();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i2) {
        k();
        l();
        super.setImageResource(i2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        i iVar = this.f40281f;
        iVar.f40775m = z;
        if (iVar.f40763a != null) {
            iVar.f40763a.a(z);
        }
    }

    private void a(JsonReader jsonReader) {
        setCompositionTask(h.a(jsonReader, (String) null));
    }

    private void setCompositionTask(o<g> oVar) {
        this.q = null;
        this.f40281f.c();
        l();
        this.p = oVar.a(this.f40279d).c(this.f40280e);
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && getHeight() != 0) {
            super.onDraw(canvas);
        }
    }

    public void setAnimation(int i2) {
        this.f40283h = i2;
        this.f40282g = null;
        setCompositionTask(h.a(h.a(i2), new Callable<n<g>>(h.a(getContext()), i2) {
            /* class com.bytedance.lottie.h.AnonymousClass9 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f40761a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f40762b;

            static {
                Covode.recordClassIndex(25002);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ n<g> call() {
                return h.a(this.f40761a, this.f40762b);
            }

            {
                this.f40761a = r1;
                this.f40762b = r2;
            }
        }));
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(new o<>(new Callable<n<g>>() {
            /* class com.bytedance.lottie.d.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(24938);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ n<g> call() {
                n<g> a2;
                V v;
                MethodCollector.i(1279);
                c cVar = c.this;
                e<a, InputStream> a3 = cVar.f40660b.a();
                if (a3 != null) {
                    F f2 = a3.f2397a;
                    S s = a3.f2398b;
                    if (f2 == a.Zip) {
                        a2 = h.a(new ZipInputStream(s), cVar.f40659a);
                    } else {
                        a2 = h.a((InputStream) s, cVar.f40659a, true);
                    }
                    if (!(a2.f40815a == null || (v = a2.f40815a) == null)) {
                        n nVar = new n((Object) v);
                        MethodCollector.o(1279);
                        return nVar;
                    }
                }
                n<g> a4 = cVar.a();
                MethodCollector.o(1279);
                return a4;
            }
        }));
    }

    public void setScale(float f2) {
        this.f40281f.d(f2);
        if (getDrawable() == this.f40281f) {
            a(null, false);
            a(this.f40281f, false);
        }
    }

    public void buildDrawingCache(boolean z) {
        this.o++;
        super.buildDrawingCache(z);
        if (this.o == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(r.HARDWARE);
        }
        this.o--;
    }

    public void setAnimation(String str) {
        this.f40282g = str;
        this.f40283h = 0;
        setCompositionTask(h.a(str, new Callable<n<g>>(h.a(getContext()), str) {
            /* class com.bytedance.lottie.h.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f40742a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f40743b;

            static {
                Covode.recordClassIndex(24992);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ n<g> call() {
                return h.a(this.f40742a, this.f40743b);
            }

            {
                this.f40742a = r1;
                this.f40743b = r2;
            }
        }));
    }

    public final void a(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f40281f.f40764b.addUpdateListener(animatorUpdateListener);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f40292a;
        this.f40282g = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f40282g);
        }
        int i2 = savedState.f40293b;
        this.f40283h = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(savedState.f40294c);
        if (savedState.f40295d) {
            c();
        }
        this.f40281f.f40768f = savedState.f40296e;
        setRepeatMode(savedState.f40297f);
        setRepeatCount(savedState.f40298g);
    }

    public final void a(String str) {
        a(new JsonReader(new StringReader(str)));
    }

    public void setComposition(g gVar) {
        this.f40281f.setCallback(this);
        this.q = gVar;
        i iVar = this.f40281f;
        boolean z = true;
        boolean z2 = false;
        if (iVar.f40763a == gVar) {
            z = false;
        } else {
            iVar.c();
            iVar.f40763a = gVar;
            iVar.b();
            d dVar = iVar.f40764b;
            if (dVar.f40691f == null) {
                z2 = true;
            }
            dVar.f40691f = gVar;
            if (z2) {
                dVar.a((int) Math.max(dVar.f40689d, gVar.f40713i), (int) Math.min(dVar.f40690e, gVar.f40714j));
            } else {
                dVar.a((int) gVar.f40713i, (int) gVar.f40714j);
            }
            dVar.a((int) dVar.f40688c);
            dVar.f40687b = System.nanoTime();
            iVar.c(iVar.f40764b.getAnimatedFraction());
            iVar.d(iVar.f40765c);
            iVar.g();
            Iterator it = new ArrayList(iVar.f40766d).iterator();
            while (it.hasNext()) {
                ((i.a) it.next()).a();
                it.remove();
            }
            iVar.f40766d.clear();
            gVar.a(iVar.f40775m);
        }
        m();
        if (getDrawable() != this.f40281f || z) {
            setImageDrawable(null);
            setImageDrawable(this.f40281f);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (l lVar : this.f40288m) {
                lVar.a(gVar);
            }
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        String string;
        i iVar = new i();
        this.f40281f = iVar;
        this.f40284i = false;
        this.f40285j = false;
        this.f40286k = false;
        this.f40277a = true;
        this.f40287l = false;
        this.f40288m = new HashSet();
        this.n = r.AUTOMATIC;
        this.o = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ju, R.attr.a3y, R.attr.a3z, R.attr.a40, R.attr.a41, R.attr.a42, R.attr.a43, R.attr.a44, R.attr.a45, R.attr.a46, R.attr.a47, R.attr.a48, R.attr.a49, R.attr.a4_, R.attr.a4a});
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(10);
            boolean hasValue2 = obtainStyledAttributes.hasValue(6);
            boolean hasValue3 = obtainStyledAttributes.hasValue(14);
            if (hasValue) {
                if (!hasValue2) {
                    int resourceId = obtainStyledAttributes.getResourceId(10, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(6);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(14)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.f40284i = true;
            this.f40285j = true;
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        this.f40277a = z;
        iVar.n = z;
        if (obtainStyledAttributes.getBoolean(8, false)) {
            iVar.d(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(7));
        setProgress(obtainStyledAttributes.getFloat(9, 0.0f));
        a(obtainStyledAttributes.getBoolean(5, false));
        if (obtainStyledAttributes.hasValue(4)) {
            iVar.a(new com.bytedance.lottie.c.e("**"), m.x, new c(new s(obtainStyledAttributes.getColor(4, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            iVar.d(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        obtainStyledAttributes.recycle();
        m();
    }

    public final void a(boolean z) {
        this.f40281f.a(z);
    }

    public final boolean a(l lVar) {
        return this.f40288m.add(lVar);
    }

    private void a(Drawable drawable, boolean z) {
        if (z && drawable != this.f40281f) {
            k();
        }
        l();
        super.setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (this.f40281f == null) {
            return;
        }
        if (i2 != 0 || !isShown()) {
            if (this.v) {
                this.v = false;
                boolean isRunning = this.f40281f.f40764b.isRunning();
                if (!this.t) {
                    this.s = isRunning;
                }
                if (isRunning) {
                    i();
                }
            }
        } else if (!this.v) {
            this.v = true;
            if (!this.t && this.s) {
                d();
            }
        }
    }
}
