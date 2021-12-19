package androidx.l.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.a.h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public final class c extends h implements b {

    /* renamed from: a  reason: collision with root package name */
    final Drawable.Callback f3389a;

    /* renamed from: c  reason: collision with root package name */
    private a f3390c;

    /* renamed from: d  reason: collision with root package name */
    private Context f3391d;

    /* renamed from: e  reason: collision with root package name */
    private ArgbEvaluator f3392e;

    static {
        Covode.recordClassIndex(1251);
    }

    /* access modifiers changed from: package-private */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f3394a;

        /* renamed from: b  reason: collision with root package name */
        i f3395b;

        /* renamed from: c  reason: collision with root package name */
        AnimatorSet f3396c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<Animator> f3397d;

        /* renamed from: e  reason: collision with root package name */
        androidx.c.a<Animator, String> f3398e;

        static {
            Covode.recordClassIndex(1253);
        }

        public final int getChangingConfigurations() {
            return this.f3394a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f3399a;

        static {
            Covode.recordClassIndex(1254);
        }

        public final boolean canApplyTheme() {
            return this.f3399a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f3399a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            c cVar = new c();
            cVar.f3404b = this.f3399a.newDrawable();
            cVar.f3404b.setCallback(cVar.f3389a);
            return cVar;
        }

        public b(Drawable.ConstantState constantState) {
            this.f3399a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            c cVar = new c();
            cVar.f3404b = this.f3399a.newDrawable(resources);
            cVar.f3404b.setCallback(cVar.f3389a);
            return cVar;
        }

        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            cVar.f3404b = this.f3399a.newDrawable(resources, theme);
            cVar.f3404b.setCallback(cVar.f3389a);
            return cVar;
        }
    }

    c() {
        this(null, (byte) 0);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final boolean canApplyTheme() {
        if (this.f3404b != null) {
            return androidx.core.graphics.drawable.a.c(this.f3404b);
        }
        return false;
    }

    public final Drawable mutate() {
        if (this.f3404b != null) {
            this.f3404b.mutate();
        }
        return this;
    }

    public final int getAlpha() {
        if (this.f3404b != null) {
            return androidx.core.graphics.drawable.a.b(this.f3404b);
        }
        return this.f3390c.f3395b.getAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f3404b != null) {
            return this.f3404b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f3390c.f3394a;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f3404b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new b(this.f3404b.getConstantState());
    }

    public final int getIntrinsicHeight() {
        if (this.f3404b != null) {
            return this.f3404b.getIntrinsicHeight();
        }
        return this.f3390c.f3395b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f3404b != null) {
            return this.f3404b.getIntrinsicWidth();
        }
        return this.f3390c.f3395b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        if (this.f3404b != null) {
            return this.f3404b.getOpacity();
        }
        return this.f3390c.f3395b.getOpacity();
    }

    public final boolean isAutoMirrored() {
        if (this.f3404b != null) {
            return androidx.core.graphics.drawable.a.a(this.f3404b);
        }
        return this.f3390c.f3395b.isAutoMirrored();
    }

    public final boolean isRunning() {
        if (this.f3404b != null) {
            return ((AnimatedVectorDrawable) this.f3404b).isRunning();
        }
        return this.f3390c.f3396c.isRunning();
    }

    public final boolean isStateful() {
        if (this.f3404b != null) {
            return this.f3404b.isStateful();
        }
        return this.f3390c.f3395b.isStateful();
    }

    public final void stop() {
        if (this.f3404b != null) {
            ((AnimatedVectorDrawable) this.f3404b).stop();
        } else {
            this.f3390c.f3396c.end();
        }
    }

    public final void start() {
        if (this.f3404b != null) {
            ((AnimatedVectorDrawable) this.f3404b).start();
        } else if (!this.f3390c.f3396c.isStarted()) {
            this.f3390c.f3396c.start();
            invalidateSelf();
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    private c(Context context) {
        this(context, (byte) 0);
    }

    @Override // androidx.l.a.a.h
    public final void applyTheme(Resources.Theme theme) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, theme);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f3404b != null) {
            this.f3404b.draw(canvas);
            return;
        }
        this.f3390c.f3395b.draw(canvas);
        if (this.f3390c.f3396c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.l.a.a.h
    public final void onBoundsChange(Rect rect) {
        if (this.f3404b != null) {
            this.f3404b.setBounds(rect);
        } else {
            this.f3390c.f3395b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.l.a.a.h
    public final boolean onLevelChange(int i2) {
        if (this.f3404b != null) {
            return this.f3404b.setLevel(i2);
        }
        return this.f3390c.f3395b.setLevel(i2);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f3404b != null) {
            return this.f3404b.setState(iArr);
        }
        return this.f3390c.f3395b.setState(iArr);
    }

    public final void setAlpha(int i2) {
        if (this.f3404b != null) {
            this.f3404b.setAlpha(i2);
        } else {
            this.f3390c.f3395b.setAlpha(i2);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, z);
        } else {
            this.f3390c.f3395b.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f3404b != null) {
            this.f3404b.setColorFilter(colorFilter);
        } else {
            this.f3390c.f3395b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTint(int i2) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, i2);
        } else {
            this.f3390c.f3395b.setTint(i2);
        }
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, colorStateList);
        } else {
            this.f3390c.f3395b.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.e
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, mode);
        } else {
            this.f3390c.f3395b.setTintMode(mode);
        }
    }

    private void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                a(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3392e == null) {
                    this.f3392e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3392e);
            }
        }
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    private c(Context context, byte b2) {
        this.f3389a = new Drawable.Callback() {
            /* class androidx.l.a.a.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1252);
            }

            public final void invalidateDrawable(Drawable drawable) {
                c.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                c.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
                c.this.scheduleSelf(runnable, j2);
            }
        };
        this.f3391d = context;
        this.f3390c = new a();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f3404b != null) {
            return this.f3404b.setVisible(z, z2);
        }
        this.f3390c.f3395b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // androidx.l.a.a.h
    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Animator a2;
        if (this.f3404b != null) {
            androidx.core.graphics.drawable.a.a(this.f3404b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a3 = h.a(resources, theme, attributeSet, a.f3381e);
                    int resourceId = a3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        i a4 = i.a(resources, resourceId, theme);
                        a4.f3407d = false;
                        a4.setCallback(this.f3389a);
                        if (this.f3390c.f3395b != null) {
                            this.f3390c.f3395b.setCallback(null);
                        }
                        this.f3390c.f3395b = a4;
                    }
                    a3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f3382f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3391d;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                a2 = e.a(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            a2.setTarget(this.f3390c.f3395b.f3406c.f3455b.f3451k.get(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                a(a2);
                            }
                            if (this.f3390c.f3397d == null) {
                                this.f3390c.f3397d = new ArrayList<>();
                                this.f3390c.f3398e = new androidx.c.a<>();
                            }
                            this.f3390c.f3397d.add(a2);
                            this.f3390c.f3398e.put(a2, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        a aVar = this.f3390c;
        if (aVar.f3396c == null) {
            aVar.f3396c = new AnimatorSet();
        }
        aVar.f3396c.playTogether(aVar.f3397d);
    }

    public static c a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        c cVar = new c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }
}
