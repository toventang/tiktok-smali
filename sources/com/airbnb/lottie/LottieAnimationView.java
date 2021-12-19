package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.h.v;
import com.airbnb.lottie.e.e;
import com.airbnb.lottie.e.g;
import com.airbnb.lottie.f.c;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.b;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.h.q;
import com.airbnb.lottie.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.InterruptedIOException;
import java.io.StringReader;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import org.json.JSONObject;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5107a = a.Weak;

    /* renamed from: e  reason: collision with root package name */
    private static final String f5108e = LottieAnimationView.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final g f5109b = new g();

    /* renamed from: c  reason: collision with root package name */
    public boolean f5110c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5111d = false;

    /* renamed from: f  reason: collision with root package name */
    private final i<e> f5112f = new i<e>() {
        /* class com.airbnb.lottie.LottieAnimationView.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2174);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.i
        public final /* synthetic */ void a(e eVar) {
            LottieAnimationView.this.setComposition(eVar);
        }
    };

    /* renamed from: g  reason: collision with root package name */
    private final i<Throwable> f5113g = new i<Throwable>() {
        /* class com.airbnb.lottie.LottieAnimationView.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2175);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.airbnb.lottie.i
        public final /* synthetic */ void a(Throwable th) {
            Throwable th2 = th;
            if (!d.a.f5625a || (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException))) {
                j a2 = j.a.a();
                IllegalStateException illegalStateException = new IllegalStateException("Unable to parse composition", th2);
                g.f5527a.f5528b.c().keySet();
                if (f.f5531a != null) {
                    f.f5531a.keySet();
                }
                a2.a(illegalStateException);
            }
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private boolean f5114h;

    /* renamed from: i  reason: collision with root package name */
    private a f5115i;

    /* renamed from: j  reason: collision with root package name */
    private String f5116j;

    /* renamed from: k  reason: collision with root package name */
    private int f5117k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f5118l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5119m = false;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r = false;
    private p s = p.AUTOMATIC;
    private int t = 0;
    private final Set<Object> u = new HashSet();
    private m v;
    private e w;

    public String getAnimationName() {
        return this.f5116j;
    }

    public e getComposition() {
        return this.w;
    }

    public boolean getUseHardwareAcceleration() {
        return this.f5110c;
    }

    private void g() {
        g gVar = this.f5109b;
        if (gVar != null) {
            gVar.a();
        }
    }

    public int getFrame() {
        return (int) this.f5109b.f5555b.f5683b;
    }

    public String getImageAssetsFolder() {
        return this.f5109b.f5560g;
    }

    public float getScale() {
        return this.f5109b.f5556c;
    }

    public float getSpeed() {
        return this.f5109b.f5555b.f5682a;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.airbnb.lottie.LottieAnimationView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2181);
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
        String f5128a;

        /* renamed from: b  reason: collision with root package name */
        int f5129b;

        /* renamed from: c  reason: collision with root package name */
        float f5130c;

        /* renamed from: d  reason: collision with root package name */
        boolean f5131d;

        /* renamed from: e  reason: collision with root package name */
        String f5132e;

        /* renamed from: f  reason: collision with root package name */
        int f5133f;

        /* renamed from: g  reason: collision with root package name */
        int f5134g;

        static {
            Covode.recordClassIndex(2180);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5128a = parcel.readString();
            this.f5130c = parcel.readFloat();
            this.f5131d = parcel.readInt() != 1 ? false : true;
            this.f5132e = parcel.readString();
            this.f5133f = parcel.readInt();
            this.f5134g = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f5128a);
            parcel.writeFloat(this.f5130c);
            parcel.writeInt(this.f5131d ? 1 : 0);
            parcel.writeString(this.f5132e);
            parcel.writeInt(this.f5133f);
            parcel.writeInt(this.f5134g);
        }
    }

    private boolean i() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private void j() {
        this.w = null;
        this.f5109b.d();
    }

    public long getDuration() {
        e eVar = this.w;
        if (eVar != null) {
            return (long) eVar.a();
        }
        return 0;
    }

    public float getMaxFrame() {
        return this.f5109b.f5555b.k();
    }

    public float getMinFrame() {
        return this.f5109b.f5555b.j();
    }

    public o getPerformanceTracker() {
        g gVar = this.f5109b;
        if (gVar.f5554a != null) {
            return gVar.f5554a.f5330a;
        }
        return null;
    }

    public float getProgress() {
        return this.f5109b.f5555b.d();
    }

    public int getRepeatCount() {
        return this.f5109b.f5555b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.f5109b.f5555b.getRepeatMode();
    }

    static {
        Covode.recordClassIndex(2173);
    }

    private void h() {
        m mVar = this.v;
        if (mVar != null) {
            mVar.b((i) this.f5112f);
            this.v.d(this.f5113g);
        }
    }

    public final void c() {
        g gVar = this.f5109b;
        gVar.f5555b.removeAllListeners();
        if (gVar.u != null) {
            gVar.f5555b.addListener(gVar.u);
        }
    }

    public final void d() {
        this.p = false;
        this.o = false;
        this.f5118l = false;
        this.n = false;
        this.f5119m = false;
        this.f5109b.i();
        f();
    }

    public final void e() {
        this.q = false;
        this.p = false;
        this.o = false;
        this.f5118l = false;
        this.n = false;
        this.f5119m = false;
        this.f5109b.j();
        f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$6  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5127a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 2179(0x883, float:3.053E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.airbnb.lottie.p[] r0 = com.airbnb.lottie.p.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.airbnb.lottie.LottieAnimationView.AnonymousClass6.f5127a = r2
                com.airbnb.lottie.p r0 = com.airbnb.lottie.p.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.airbnb.lottie.LottieAnimationView.AnonymousClass6.f5127a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.airbnb.lottie.p r0 = com.airbnb.lottie.p.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.airbnb.lottie.LottieAnimationView.AnonymousClass6.f5127a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.airbnb.lottie.p r0 = com.airbnb.lottie.p.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.AnonymousClass6.<clinit>():void");
        }
    }

    public enum a {
        None,
        Weak,
        Strong;

        static {
            Covode.recordClassIndex(2182);
        }
    }

    public final void b() {
        if (d.a.f5625a) {
            if (i()) {
                Drawable drawable = getDrawable();
                g gVar = this.f5109b;
                if (drawable != gVar) {
                    this.n = true;
                    return;
                } else {
                    gVar.f();
                    f();
                }
            } else {
                this.f5118l = false;
                this.o = true;
            }
            this.f5119m = false;
            this.n = false;
            return;
        }
        this.f5109b.f();
        f();
    }

    public void onDetachedFromWindow() {
        g gVar = this.f5109b;
        if (d.f5620a) {
            isShown();
            getVisibility();
            hashCode();
            if (gVar != null) {
                Integer.valueOf(gVar.hashCode());
            }
            isShown();
            d.a();
        }
        if (this.f5109b.g()) {
            d();
            this.p = true;
        }
        if (!this.r) {
            try {
                g();
            } catch (Exception unused) {
            }
        }
        super.onDetachedFromWindow();
    }

    public final void a() {
        if (d.a.f5625a) {
            if (i()) {
                Drawable drawable = getDrawable();
                g gVar = this.f5109b;
                if (drawable != gVar) {
                    this.f5119m = true;
                    return;
                } else {
                    gVar.e();
                    f();
                }
            } else {
                this.f5118l = true;
            }
            this.f5119m = false;
            this.n = false;
            return;
        }
        this.f5109b.e();
        f();
    }

    public final void f() {
        boolean z;
        try {
            int i2 = 2;
            int i3 = 1;
            if (!d.a.f5625a || this.f5111d || !d.a.f5629e) {
                if (!this.f5110c || !this.f5109b.g()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!d.a.f5625a || !d.a.f5628d || !this.f5109b.t) {
                    if (z) {
                        setLayerType(i2, null);
                        return;
                    }
                }
                i2 = 1;
                setLayerType(i2, null);
                return;
            }
            int i4 = AnonymousClass6.f5127a[this.s.ordinal()];
            if (i4 != 1) {
                if (i4 != 2 && i4 == 3) {
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                }
                i2 = 1;
            }
            if (!d.a.f5628d || !this.f5109b.t) {
                i3 = i2;
            }
            if (i3 != getLayerType()) {
                setLayerType(i3, null);
            }
        } catch (Throwable unused) {
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g gVar = this.f5109b;
        if (d.f5620a) {
            isShown();
            getVisibility();
            hashCode();
            if (gVar != null) {
                Integer.valueOf(gVar.hashCode());
            }
            isShown();
            d.a();
        }
        if (d.a.f5625a) {
            if (!isInEditMode() && (this.q || this.p)) {
                a();
                this.q = false;
                this.p = false;
            }
            if (Build.VERSION.SDK_INT < 23) {
                onVisibilityChanged(this, getVisibility());
            }
        } else if (this.q || this.p) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5128a = this.f5116j;
        savedState.f5129b = this.f5117k;
        savedState.f5130c = this.f5109b.f5555b.d();
        if (d.a.f5625a) {
            if (this.f5109b.g() || (!v.y(this) && this.p)) {
                z = true;
            } else {
                z = false;
            }
            savedState.f5131d = z;
        } else {
            savedState.f5131d = this.f5109b.g();
        }
        savedState.f5132e = this.f5109b.f5560g;
        savedState.f5133f = this.f5109b.f5555b.getRepeatMode();
        savedState.f5134g = this.f5109b.f5555b.getRepeatCount();
        return savedState;
    }

    public final void b(Animator.AnimatorListener animatorListener) {
        this.f5109b.f5555b.removeListener(animatorListener);
    }

    public void setAnimation(JsonReader jsonReader) {
        a(jsonReader, (String) null);
    }

    public void setFrame(int i2) {
        this.f5109b.c(i2);
    }

    public void setImageAssetsFolder(String str) {
        this.f5109b.f5560g = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageDrawable(Drawable drawable) {
        a(drawable, true);
    }

    public void setMaxFrame(int i2) {
        this.f5109b.b(i2);
    }

    public void setMaxProgress(float f2) {
        this.f5109b.b(f2);
    }

    public void setMinFrame(int i2) {
        this.f5109b.a(i2);
    }

    public void setMinProgress(float f2) {
        this.f5109b.a(f2);
    }

    public void setProgress(float f2) {
        this.f5109b.c(f2);
    }

    public void setRenderMode(p pVar) {
        this.s = pVar;
        f();
    }

    public void setRepeatCount(int i2) {
        this.f5109b.d(i2);
    }

    public void setRepeatMode(int i2) {
        this.f5109b.f5555b.setRepeatMode(i2);
    }

    public void setSafeMode(boolean z) {
        this.f5109b.f5558e = z;
    }

    public void setSpeed(float f2) {
        this.f5109b.f5555b.f5682a = f2;
    }

    public void setTextDelegate(r rVar) {
        this.f5109b.f5564k = rVar;
    }

    public final void b(boolean z) {
        int i2;
        g gVar = this.f5109b;
        if (z) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        gVar.d(i2);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        g gVar = this.f5109b;
        if (drawable2 == gVar) {
            super.invalidateDrawable(gVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setFailureListener(i<Throwable> iVar) {
        m mVar = this.v;
        if (mVar != null) {
            mVar.d(this.f5113g);
            this.v.c(iVar);
        }
    }

    public void setFontAssetDelegate(b bVar) {
        g gVar = this.f5109b;
        gVar.f5563j = bVar;
        if (gVar.f5562i != null) {
            gVar.f5562i.f5323e = bVar;
        }
    }

    public void setImageAssetDelegate(c cVar) {
        g gVar = this.f5109b;
        gVar.f5561h = cVar;
        if (gVar.f5559f != null) {
            gVar.f5559f.f5327b = cVar;
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageBitmap(Bitmap bitmap) {
        try {
            g();
        } catch (Exception unused) {
        }
        h();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView
    public void setImageResource(int i2) {
        try {
            g();
        } catch (Exception unused) {
        }
        h();
        super.setImageResource(i2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        g gVar = this.f5109b;
        gVar.n = z;
        if (gVar.f5554a != null) {
            gVar.f5554a.a(z);
        }
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.f5109b.f5555b.addListener(animatorListener);
    }

    public void setAnimation(JSONObject jSONObject) {
        d.a(this, this.f5109b, "json object");
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    public void setAnimationFromJson(String str) {
        d.a(this, this.f5109b, "jsonString");
        a(new JsonReader(new StringReader(str)), (String) null);
    }

    public void setDrawFpsTracerOutputListener(a.b bVar) {
        g gVar = this.f5109b;
        if (b.f5616c) {
            b.a(gVar);
            if (gVar != null) {
                if (gVar.o != null) {
                    gVar.o.a(bVar);
                }
            } else if (b.f5614a != null) {
                b.f5614a.a(bVar);
            }
        }
    }

    public void setScale(float f2) {
        this.f5109b.d(f2);
        if (getDrawable() == this.f5109b) {
            a((Drawable) null, false);
            a((Drawable) this.f5109b, false);
        }
    }

    public void unscheduleDrawable(Drawable drawable) {
        if (d.a.f5625a && drawable != this.f5109b && (drawable instanceof g)) {
            g gVar = (g) drawable;
            if (gVar.g()) {
                gVar.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public void setAnimationFromUrl(String str) {
        d.a(this, this.f5109b, str);
        j();
        h();
        this.v = c.a(getContext(), str).a(this.f5112f).c(this.f5113g);
    }

    public void buildDrawingCache(boolean z) {
        if (!d.a.f5625a) {
            super.buildDrawingCache(z);
        } else if (!this.f5109b.m()) {
            d.b("buildDrawingCache");
            this.t++;
            super.buildDrawingCache(z);
            if (this.t == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
                setRenderMode(p.HARDWARE);
            }
            this.t--;
            d.c("buildDrawingCache");
        }
    }

    public Bitmap getDrawingCache(boolean z) {
        if (d.a.f5625a && this.f5109b.m()) {
            g gVar = this.f5109b;
            if (gVar.p != null) {
                com.airbnb.lottie.b.a aVar = gVar.p;
                Bitmap bitmap = gVar.v;
                Bitmap a2 = com.airbnb.lottie.c.b.a(aVar.f5299a);
                if (a2 != null) {
                    if (!(bitmap == null || aVar.f5301c == null)) {
                        aVar.f5301c.post(new Runnable(bitmap) {
                            /* class com.airbnb.lottie.b.a.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ Bitmap f5305a;

                            static {
                                Covode.recordClassIndex(2230);
                            }

                            public final void run() {
                                MethodCollector.i(7001);
                                com.airbnb.lottie.g gVar = a.this.f5299a;
                                Bitmap bitmap = this.f5305a;
                                l.c(gVar, "");
                                l.c(bitmap, "");
                                ArrayList<Bitmap> arrayList = com.airbnb.lottie.c.a.f5309a.get(Integer.valueOf(gVar.hashCode()));
                                if (arrayList != null) {
                                    synchronized (arrayList) {
                                        try {
                                            if (!arrayList.contains(bitmap)) {
                                                arrayList.add(bitmap);
                                            }
                                        } finally {
                                            MethodCollector.o(7001);
                                        }
                                    }
                                    return;
                                }
                                MethodCollector.o(7001);
                            }

                            {
                                this.f5305a = r2;
                            }
                        });
                    }
                    b.a(aVar.f5299a, true);
                    bitmap = a2;
                } else {
                    b.a(aVar.f5299a, false);
                }
                gVar.v = bitmap;
                gVar.f5557d = false;
                if (bitmap != null) {
                    return bitmap;
                }
            }
        }
        return super.getDrawingCache(z);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        try {
            if (!(parcelable instanceof SavedState)) {
                super.onRestoreInstanceState(parcelable);
                return;
            }
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            String str = savedState.f5128a;
            this.f5116j = str;
            if (!TextUtils.isEmpty(str)) {
                setAnimation(this.f5116j);
            }
            int i2 = savedState.f5129b;
            this.f5117k = i2;
            if (i2 != 0) {
                setAnimation(i2);
            }
            setProgress(savedState.f5130c);
            if (savedState.f5131d) {
                a();
            }
            this.f5109b.f5560g = savedState.f5132e;
            setRepeatMode(savedState.f5133f);
            setRepeatCount(savedState.f5134g);
        } catch (Throwable unused) {
        }
    }

    public void setAnimation(final int i2) {
        d.a(this, this.f5109b, Integer.valueOf(i2));
        this.f5117k = i2;
        this.f5116j = null;
        e a2 = g.f5527a.a(Integer.toString(i2));
        if (a2 != null) {
            setComposition(a2);
            return;
        }
        j();
        h();
        this.v = f.a(f.a(i2), new Callable<l<e>>(f.b(getContext()), i2) {
            /* class com.airbnb.lottie.f.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f5538a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f5539b;

            static {
                Covode.recordClassIndex(2308);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ l<e> call() {
                return f.a(this.f5538a, this.f5539b);
            }

            {
                this.f5538a = r1;
                this.f5539b = r2;
            }
        }).a((i<e>) new i<e>() {
            /* class com.airbnb.lottie.LottieAnimationView.AnonymousClass3 */

            static {
                Covode.recordClassIndex(2176);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.airbnb.lottie.i
            public final /* synthetic */ void a(e eVar) {
                g.f5527a.a(Integer.toString(i2), eVar);
            }
        }).a(this.f5112f).c(this.f5113g);
    }

    public void setCompositionAfter(boolean z) {
        f();
        if (getDrawable() != this.f5109b || z) {
            if (d.a.f5625a) {
                a((Drawable) null, false);
                a((Drawable) this.f5109b, false);
                onVisibilityChanged(this, getVisibility());
            } else {
                setImageDrawable(null);
                setImageDrawable(this.f5109b);
            }
            requestLayout();
            if (!d.a.f5635k) {
                Iterator<Object> it = this.u.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } else if (this.u.size() > 0) {
                this.u.toArray();
            }
        } else if (d.a.f5625a) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void setAnimation(final String str) {
        d.a(this, this.f5109b, str);
        this.f5116j = str;
        this.f5117k = 0;
        e a2 = g.f5527a.a(str);
        if (a2 != null) {
            setComposition(a2);
            return;
        }
        j();
        h();
        this.v = f.a(str, new Callable<l<e>>(f.b(getContext()), str) {
            /* class com.airbnb.lottie.f.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f5536a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f5537b;

            static {
                Covode.recordClassIndex(2307);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ l<e> call() {
                return f.b(this.f5536a, this.f5537b);
            }

            {
                this.f5536a = r1;
                this.f5537b = r2;
            }
        }).a((i<e>) new i<e>() {
            /* class com.airbnb.lottie.LottieAnimationView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(2177);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.airbnb.lottie.i
            public final /* bridge */ /* synthetic */ void a(e eVar) {
                g.f5527a.a(str, eVar);
            }
        }).a(this.f5112f).c(this.f5113g);
    }

    public void setComposition(e eVar) {
        this.f5109b.setCallback(this);
        this.w = eVar;
        boolean z = false;
        if (!d.a.f5625a || !d.a.f5626b || !(getDrawable() == null || getDrawable() == this.f5109b)) {
            g gVar = this.f5109b;
            if (d.f5620a) {
                gVar.hashCode();
                gVar.isVisible();
                d.a();
            }
            if (gVar.f5554a != eVar) {
                if (d.a.f5625a) {
                    gVar.f5557d = false;
                }
                gVar.d();
                gVar.f5554a = eVar;
                gVar.k();
                gVar.c();
                gVar.b();
                z = true;
            }
            setCompositionAfter(z);
            return;
        }
        g gVar2 = this.f5109b;
        AnonymousClass5 r1 = new d.c() {
            /* class com.airbnb.lottie.LottieAnimationView.AnonymousClass5 */

            static {
                Covode.recordClassIndex(2178);
            }

            @Override // com.airbnb.lottie.g.d.c
            public final void a(boolean z) {
                LottieAnimationView.this.setCompositionAfter(z);
            }
        };
        if (d.f5620a) {
            gVar2.hashCode();
            gVar2.isVisible();
            d.a();
        }
        if (gVar2.f5554a == eVar) {
            r1.a(false);
            return;
        }
        if (d.a.f5625a) {
            gVar2.f5557d = false;
        }
        gVar2.l();
        gVar2.f5554a = eVar;
        gVar2.k();
        m.f5750a.execute(new Runnable(eVar, new d.AbstractC0076d(eVar, r1) {
            /* class com.airbnb.lottie.g.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f5587a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d.c f5588b;

            static {
                Covode.recordClassIndex(2327);
            }

            @Override // com.airbnb.lottie.g.d.AbstractC0076d
            public final void a(com.airbnb.lottie.e.c.b bVar) {
                if (!g.this.a(this.f5587a)) {
                    g.this.invalidateSelf();
                    if (bVar != null) {
                        g.this.f5566m = bVar;
                        if (d.a.f5625a) {
                            g.this.o();
                        }
                    } else {
                        g.this.c();
                    }
                    g.this.b();
                    d.c cVar = this.f5588b;
                    if (cVar != null) {
                        cVar.a(true);
                    }
                }
            }

            {
                this.f5587a = r2;
                this.f5588b = r3;
            }
        }) {
            /* class com.airbnb.lottie.g.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f5590a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d.AbstractC0076d f5591b;

            static {
                Covode.recordClassIndex(2328);
            }

            public final void run() {
                final com.airbnb.lottie.e.c.b bVar;
                if (!g.this.a(this.f5590a)) {
                    try {
                        bVar = new com.airbnb.lottie.e.c.b(g.this, q.a(this.f5590a), this.f5590a.f5336g, this.f5590a);
                    } catch (Throwable unused) {
                        bVar = null;
                    }
                    if (!g.this.a(this.f5590a)) {
                        if (d.f5623d == null) {
                            d.f5623d = new Handler(Looper.getMainLooper());
                        }
                        d.f5623d.post(new Runnable() {
                            /* class com.airbnb.lottie.g.AnonymousClass6.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(2329);
                            }

                            public final void run() {
                                AnonymousClass6.this.f5591b.a(bVar);
                            }
                        });
                    }
                }
            }

            {
                this.f5590a = r2;
                this.f5591b = r3;
            }
        });
    }

    private void a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.a3v, R.attr.a3w, R.attr.a3x, R.attr.a4b, R.attr.a4c, R.attr.a4d, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4i, R.attr.a4j, R.attr.a4k});
        this.f5115i = a.values()[obtainStyledAttributes.getInt(1, f5107a.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(8);
            boolean hasValue2 = obtainStyledAttributes.hasValue(4);
            boolean hasValue3 = obtainStyledAttributes.hasValue(12);
            if (hasValue) {
                if (!hasValue2) {
                    int resourceId = obtainStyledAttributes.getResourceId(8, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(4);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(12)) != null) {
                setAnimationFromUrl(string);
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.p = true;
            this.q = true;
        }
        if (obtainStyledAttributes.getBoolean(6, false)) {
            this.f5109b.d(-1);
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setRepeatMode(obtainStyledAttributes.getInt(10, 1));
        }
        if (obtainStyledAttributes.hasValue(9)) {
            setRepeatCount(obtainStyledAttributes.getInt(9, -1));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(5));
        setProgress(obtainStyledAttributes.getFloat(7, 0.0f));
        a(obtainStyledAttributes.getBoolean(3, false));
        if (obtainStyledAttributes.hasValue(2)) {
            a(new e("**"), k.C, new com.airbnb.lottie.j.c(new q(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f5109b.d(obtainStyledAttributes.getFloat(11, 1.0f));
        }
        if (d.a.f5625a && d.a.f5628d) {
            this.f5109b.a(this);
        }
        obtainStyledAttributes.recycle();
        f();
        if (d.a.f5625a) {
            this.f5114h = true;
            f.a(getContext());
        }
    }

    public final void a(boolean z) {
        this.f5109b.a(z);
    }

    public final void a(int i2, int i3) {
        this.f5109b.a(i2, i3);
    }

    private void a(Drawable drawable, boolean z) {
        g gVar;
        if (z && drawable != this.f5109b) {
            try {
                g();
            } catch (Exception unused) {
            }
        }
        h();
        super.setImageDrawable(drawable);
        if (d.a.f5625a && this.f5114h && drawable == (gVar = this.f5109b)) {
            if (!gVar.g()) {
                if (this.f5119m) {
                    a();
                } else if (this.n) {
                    b();
                }
            }
            this.f5119m = false;
            this.n = false;
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (d.a.f5625a && this.f5114h) {
            if (i()) {
                if (this.o) {
                    b();
                } else if (this.f5118l) {
                    a();
                }
                this.o = false;
                this.f5118l = false;
            } else if (this.f5109b.g()) {
                e();
                this.o = true;
            }
            g gVar = this.f5109b;
            if (d.f5620a) {
                isShown();
                getVisibility();
                hashCode();
                if (gVar != null) {
                    Integer.valueOf(gVar.hashCode());
                }
                isShown();
                d.a();
            }
        }
    }

    public final void a(JsonReader jsonReader, String str) {
        d.a(this, this.f5109b, "jsonReader");
        j();
        h();
        this.v = f.a(jsonReader, str).a(this.f5112f).c(this.f5113g);
    }

    private <T> void a(e eVar, T t2, com.airbnb.lottie.j.c<T> cVar) {
        this.f5109b.a(eVar, t2, cVar);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        g gVar;
        super.onSizeChanged(i2, i3, i4, i5);
        if (d.a.f5625a && d.a.f5628d && (gVar = this.f5109b) != null) {
            if (d.f5620a) {
                gVar.hashCode();
                gVar.isVisible();
                d.a();
            }
            gVar.w = i2;
            gVar.x = i3;
        }
    }
}
