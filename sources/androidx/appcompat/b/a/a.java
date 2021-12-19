package androidx.appcompat.b.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.b.a.b;
import androidx.appcompat.b.a.e;
import androidx.c.h;
import androidx.l.a.a.i;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final String f1005c = a.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private b f1006d;

    /* renamed from: e  reason: collision with root package name */
    private f f1007e;

    /* renamed from: f  reason: collision with root package name */
    private int f1008f;

    /* renamed from: g  reason: collision with root package name */
    private int f1009g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1010h;

    @Override // androidx.appcompat.b.a.b, androidx.appcompat.b.a.e
    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class d extends f {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f1015a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1016b;

        static {
            Covode.recordClassIndex(295);
        }

        @Override // androidx.appcompat.b.a.a.f
        public final boolean c() {
            return this.f1016b;
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void a() {
            this.f1015a.start();
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void b() {
            this.f1015a.cancel();
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void d() {
            this.f1015a.reverse();
        }

        d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super((byte) 0);
            int i2;
            int i3;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i2 = numberOfFrames - 1;
            } else {
                i2 = 0;
            }
            if (z) {
                i3 = 0;
            } else {
                i3 = numberOfFrames - 1;
            }
            e eVar = new e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            int i4 = Build.VERSION.SDK_INT;
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) eVar.f1017a);
            ofInt.setInterpolator(eVar);
            this.f1016b = z2;
            this.f1015a = ofInt;
        }
    }

    /* access modifiers changed from: package-private */
    public static abstract class f {
        static {
            Covode.recordClassIndex(297);
        }

        public abstract void a();

        public abstract void b();

        public boolean c() {
            return false;
        }

        public void d() {
        }

        private f() {
        }

        /* synthetic */ f(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.b.a.a$a  reason: collision with other inner class name */
    public static class C0020a extends f {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f1011a;

        static {
            Covode.recordClassIndex(292);
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void a() {
            this.f1011a.start();
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void b() {
            this.f1011a.stop();
        }

        C0020a(Animatable animatable) {
            super((byte) 0);
            this.f1011a = animatable;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        androidx.c.d<Long> f1012a;

        /* renamed from: b  reason: collision with root package name */
        h<Integer> f1013b;

        static {
            Covode.recordClassIndex(293);
        }

        static long a(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        @Override // androidx.appcompat.b.a.e.a
        public final Drawable newDrawable() {
            return new a(this, null);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.appcompat.b.a.e.a, androidx.appcompat.b.a.b.AbstractC0021b
        public final void a() {
            this.f1012a = this.f1012a.clone();
            this.f1013b = this.f1013b.clone();
        }

        /* access modifiers changed from: package-private */
        public final int a(int[] iArr) {
            int b2 = super.b(iArr);
            if (b2 >= 0) {
                return b2;
            }
            return super.b(StateSet.WILD_CARD);
        }

        @Override // androidx.appcompat.b.a.e.a
        public final Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        /* access modifiers changed from: package-private */
        public final int a(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.f1013b.a(i2, 0).intValue();
        }

        b(b bVar, a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f1012a = bVar.f1012a;
                this.f1013b = bVar.f1013b;
                return;
            }
            this.f1012a = new androidx.c.d<>();
            this.f1013b = new h<>();
        }

        /* access modifiers changed from: package-private */
        public final int a(int i2, int i3, Drawable drawable, boolean z) {
            long j2;
            int a2 = super.a(drawable);
            long a3 = a(i2, i3);
            if (z) {
                j2 = 8589934592L;
            } else {
                j2 = 0;
            }
            long j3 = (long) a2;
            this.f1012a.c(a3, Long.valueOf(j3 | j2));
            if (z) {
                this.f1012a.c(a(i3, i2), Long.valueOf(4294967296L | j3 | j2));
            }
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends f {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.l.a.a.c f1014a;

        static {
            Covode.recordClassIndex(294);
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void a() {
            this.f1014a.start();
        }

        @Override // androidx.appcompat.b.a.a.f
        public final void b() {
            this.f1014a.stop();
        }

        c(androidx.l.a.a.c cVar) {
            super((byte) 0);
            this.f1014a = cVar;
        }
    }

    public a() {
        this(null, null);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    static {
        Covode.recordClassIndex(291);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public b b() {
        return new b(this.f1006d, this, null);
    }

    @Override // androidx.appcompat.b.a.b
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.f1007e;
        if (fVar != null) {
            fVar.b();
            this.f1007e = null;
            a(this.f1008f);
            this.f1008f = -1;
            this.f1009g = -1;
        }
    }

    @Override // androidx.appcompat.b.a.b, androidx.appcompat.b.a.e
    public Drawable mutate() {
        if (!this.f1010h && super.mutate() == this) {
            this.f1006d.a();
            this.f1010h = true;
        }
        return this;
    }

    @Override // androidx.appcompat.b.a.b, androidx.appcompat.b.a.e
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setAlpha(int i2) {
        super.setAlpha(i2);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i2) {
        return super.onLayoutDirectionChanged(i2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.b.a.b, androidx.appcompat.b.a.e
    public final void a(b.AbstractC0021b bVar) {
        super.a(bVar);
        if (bVar instanceof b) {
            this.f1006d = (b) bVar;
        }
    }

    static class e implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int f1017a;

        /* renamed from: b  reason: collision with root package name */
        private int[] f1018b;

        /* renamed from: c  reason: collision with root package name */
        private int f1019c;

        static {
            Covode.recordClassIndex(296);
        }

        public final float getInterpolation(float f2) {
            float f3;
            int i2 = (int) ((f2 * ((float) this.f1017a)) + 0.5f);
            int i3 = this.f1019c;
            int[] iArr = this.f1018b;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            if (i4 < i3) {
                f3 = ((float) i2) / ((float) this.f1017a);
            } else {
                f3 = 0.0f;
            }
            return (((float) i4) / ((float) i3)) + f3;
        }

        e(AnimationDrawable animationDrawable, boolean z) {
            a(animationDrawable, z);
        }

        private int a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1019c = numberOfFrames;
            int[] iArr = this.f1018b;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1018b = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1018b;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f1017a = i2;
            return i2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (a(r6) != false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    @Override // androidx.appcompat.b.a.b, androidx.appcompat.b.a.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r19) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.b.a.a.onStateChange(int[]):boolean");
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    a(b bVar, Resources resources) {
        super((byte) 0);
        this.f1008f = -1;
        this.f1009g = -1;
        a(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // androidx.appcompat.b.a.b
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        f fVar = this.f1007e;
        if (fVar != null && (visible || z2)) {
            if (z) {
                fVar.a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        super.scheduleDrawable(drawable, runnable, j2);
    }

    @Override // androidx.appcompat.b.a.b
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    public static a a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            TypedArray a2 = androidx.core.content.a.h.a(resources, theme, attributeSet, new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533});
            aVar.setVisible(a2.getBoolean(1, true), true);
            b bVar = aVar.f1006d;
            if (Build.VERSION.SDK_INT >= 21) {
                bVar.f1038f |= a2.getChangingConfigurations();
            }
            bVar.f1043k = a2.getBoolean(2, bVar.f1043k);
            bVar.n = a2.getBoolean(3, bVar.n);
            bVar.C = a2.getInt(4, bVar.C);
            bVar.D = a2.getInt(5, bVar.D);
            aVar.setDither(a2.getBoolean(0, bVar.z));
            aVar.a(resources);
            a2.recycle();
            aVar.b(context, resources, xmlPullParser, attributeSet, theme);
            aVar.onStateChange(aVar.getState());
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private int c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray a2 = androidx.core.content.a.h.a(resources, theme, attributeSet, new int[]{16843161, 16843849, 16843850, 16843851});
        int resourceId = a2.getResourceId(2, -1);
        int resourceId2 = a2.getResourceId(1, -1);
        int resourceId3 = a2.getResourceId(0, -1);
        if (resourceId3 > 0) {
            drawable = androidx.appcompat.a.a.a.b(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = a2.getBoolean(3, false);
        a2.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = androidx.l.a.a.c.a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
                if (drawable == null) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f1006d.a(resourceId, resourceId2, drawable, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private void b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1 && ((depth = xmlPullParser.getDepth()) >= depth2 || next2 != 3)) {
                if (next2 == 2 && depth <= depth2) {
                    if (xmlPullParser.getName().equals("item")) {
                        TypedArray a2 = androidx.core.content.a.h.a(resources, theme, attributeSet, new int[]{16842960, 16843161});
                        int resourceId = a2.getResourceId(0, 0);
                        Drawable drawable = null;
                        int resourceId2 = a2.getResourceId(1, -1);
                        if (resourceId2 > 0) {
                            drawable = androidx.appcompat.a.a.a.b(context, resourceId2);
                        }
                        a2.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr = new int[attributeCount];
                        int i2 = 0;
                        for (int i3 = 0; i3 < attributeCount; i3++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                                int i4 = i2 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr[i2] = attributeNameResource;
                                i2 = i4;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr, i2);
                        if (drawable == null) {
                            do {
                                next = xmlPullParser.next();
                            } while (next == 4);
                            if (next == 2) {
                                if (xmlPullParser.getName().equals("vector")) {
                                    drawable = i.a(resources, xmlPullParser, attributeSet, theme);
                                } else if (Build.VERSION.SDK_INT >= 21) {
                                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                                } else {
                                    drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                                }
                                if (drawable == null) {
                                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                                }
                            } else {
                                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                        }
                        b bVar = this.f1006d;
                        int a3 = bVar.a(drawable);
                        bVar.L[a3] = trimStateSet;
                        bVar.f1013b.b(a3, Integer.valueOf(resourceId));
                    } else if (xmlPullParser.getName().equals("transition")) {
                        c(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            }
        }
    }
}
