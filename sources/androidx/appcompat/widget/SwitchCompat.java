package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.h.v;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class SwitchCompat extends CompoundButton {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final Property<SwitchCompat, Float> THUMB_POS = new Property<SwitchCompat, Float>(Float.class, "thumbPos") {
        /* class androidx.appcompat.widget.SwitchCompat.AnonymousClass1 */

        static {
            Covode.recordClassIndex(432);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.mThumbPosition);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    };
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private CharSequence mTextOff;
    private CharSequence mTextOn;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;

    private static float constrain(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    private void cancelPositionAnimator() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        if (this.mThumbPosition > 0.5f) {
            return true;
        }
        return false;
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    static {
        Covode.recordClassIndex(431);
    }

    private int getThumbOffset() {
        float f2;
        if (ar.a(this)) {
            f2 = 1.0f - this.mThumbPosition;
        } else {
            f2 = this.mThumbPosition;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    public int getCompoundPaddingLeft() {
        if (!ar.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.mSwitchPadding;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (ar.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.mSwitchPadding;
        }
        return compoundPaddingRight;
    }

    private void applyThumbTint() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable == null) {
            return;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            Drawable mutate = drawable.mutate();
            this.mThumbDrawable = mutate;
            if (this.mHasThumbTint) {
                a.a(mutate, this.mThumbTintList);
            }
            if (this.mHasThumbTintMode) {
                a.a(this.mThumbDrawable, this.mThumbTintMode);
            }
            if (this.mThumbDrawable.isStateful()) {
                this.mThumbDrawable.setState(getDrawableState());
            }
        }
    }

    private void applyTrackTint() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            Drawable mutate = drawable.mutate();
            this.mTrackDrawable = mutate;
            if (this.mHasTrackTint) {
                a.a(mutate, this.mTrackTintList);
            }
            if (this.mHasTrackTintMode) {
                a.a(this.mTrackDrawable, this.mTrackTintMode);
            }
            if (this.mTrackDrawable.isStateful()) {
                this.mTrackDrawable.setState(getDrawableState());
            }
        }
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.mTempRect;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            rect = w.a(drawable2);
        } else {
            rect = w.f1712a;
        }
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.mPositionAnimator.end();
            this.mPositionAnimator = null;
        }
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.a(this, callback));
    }

    public void setSplitTrack(boolean z) {
        this.mSplitTrack = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.mSwitchMinWidth = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.mSwitchPadding = i2;
        requestLayout();
    }

    public void setTextOff(CharSequence charSequence) {
        this.mTextOff = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.mTextOn = charSequence;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f2) {
        this.mThumbPosition = f2;
        invalidate();
    }

    public void setThumbTextPadding(int i2) {
        this.mThumbTextPadding = i2;
        requestLayout();
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void setShowText(boolean z) {
        if (this.mShowText != z) {
            this.mShowText = z;
            requestLayout();
        }
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(androidx.appcompat.a.a.a.b(getContext(), i2));
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(androidx.appcompat.a.a.a.b(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.mTextOn;
        } else {
            charSequence = this.mTextOff;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable) {
            return true;
        }
        return false;
    }

    private void animateThumbToCheckedState(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, THUMB_POS, f2);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        int i2 = Build.VERSION.SDK_INT;
        this.mPositionAnimator.setAutoCancel(true);
        this.mPositionAnimator.start();
    }

    private Layout makeLayout(CharSequence charSequence) {
        int i2;
        CharSequence charSequence2 = charSequence;
        TransformationMethod transformationMethod = this.mSwitchTransformationMethod;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence2, this);
        }
        TextPaint textPaint = this.mTextPaint;
        if (charSequence2 != null) {
            i2 = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            i2 = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.mTextOn;
        } else {
            charSequence = this.mTextOff;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text).append(' ').append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void setChecked(boolean z) {
        float f2;
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !v.v(this)) {
            cancelPositionAnimator();
            if (isChecked) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            setThumbPosition(f2);
            return;
        }
        animateThumbToCheckedState(isChecked);
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() != null && !this.mTextPaint.getTypeface().equals(typeface)) || (this.mTextPaint.getTypeface() == null && typeface != null)) {
            this.mTextPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    private void stopDrag(MotionEvent motionEvent) {
        boolean z;
        this.mTouchMode = 0;
        boolean z2 = true;
        if (motionEvent.getAction() != 1 || !isEnabled()) {
            z = false;
        } else {
            z = true;
        }
        boolean isChecked = isChecked();
        if (z) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.mMinFlingVelocity)) {
                z2 = getTargetCheckedState();
            } else if (!ar.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        cancelSuperTouch(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        Rect rect2 = this.mTempRect;
        int i4 = this.mSwitchLeft;
        int i5 = this.mSwitchTop;
        int i6 = this.mSwitchRight;
        int i7 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            rect = w.a(drawable);
        } else {
            rect = w.f1712a;
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            thumbOffset += rect2.left;
            if (rect != null) {
                if (rect.left > rect2.left) {
                    i4 += rect.left - rect2.left;
                }
                if (rect.top > rect2.top) {
                    i2 = (rect.top - rect2.top) + i5;
                } else {
                    i2 = i5;
                }
                if (rect.right > rect2.right) {
                    i6 -= rect.right - rect2.right;
                }
                if (rect.bottom > rect2.bottom) {
                    i3 = i7 - (rect.bottom - rect2.bottom);
                }
                i3 = i7;
            } else {
                i2 = i5;
                i3 = i7;
            }
            this.mTrackDrawable.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i8 = thumbOffset - rect2.left;
            int i9 = thumbOffset + this.mThumbWidth + rect2.right;
            this.mThumbDrawable.setBounds(i8, i5, i9, i7);
            Drawable background = getBackground();
            if (background != null) {
                a.a(background, i8, i5, i9, i7);
            }
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.mSwitchTop;
        int i3 = this.mSwitchBottom;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a2 = w.a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a2.left;
                rect.right -= a2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.mOnLayout;
        } else {
            layout = this.mOffLayout;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 188
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ag7);
    }

    private void setSwitchTypefaceByIndex(int i2, int i3) {
        Typeface typeface;
        if (i2 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i2 == 2) {
            typeface = Typeface.SERIF;
        } else if (i2 != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        setSwitchTypeface(typeface, i3);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            a.a(drawable, f2, f3);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            a.a(drawable2, f2, f3);
        }
    }

    private boolean hitThumb(float f2, float f3) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i2 = this.mSwitchTop;
        int i3 = this.mTouchSlop;
        int i4 = i2 - i3;
        int i5 = (this.mSwitchLeft + thumbOffset) - i3;
        int i6 = this.mThumbWidth + i5 + this.mTempRect.left + this.mTempRect.right;
        int i7 = this.mTouchSlop;
        int i8 = i6 + i7;
        int i9 = this.mSwitchBottom + i7;
        if (f2 <= ((float) i5) || f2 >= ((float) i8) || f3 <= ((float) i4) || f3 >= ((float) i9)) {
            return false;
        }
        return true;
    }

    public void setSwitchTextAppearance(Context context, int i2) {
        al a2 = al.a(context, i2, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ui, R.attr.ahm});
        ColorStateList e2 = a2.e(3);
        if (e2 != null) {
            this.mTextColors = e2;
        } else {
            this.mTextColors = getTextColors();
        }
        int e3 = a2.e(0, 0);
        if (e3 != 0) {
            float f2 = (float) e3;
            if (f2 != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f2);
                requestLayout();
            }
        }
        setSwitchTypefaceByIndex(a2.a(1, -1), a2.a(2, -1));
        if (a2.a(12, false)) {
            this.mSwitchTransformationMethod = new androidx.appcompat.c.a(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        a2.f1549a.recycle();
    }

    public void setSwitchTypeface(Typeface typeface, int i2) {
        Typeface create;
        int i3;
        float f2 = 0.0f;
        boolean z = false;
        if (i2 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i2);
            } else {
                create = Typeface.create(typeface, i2);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i3 = create.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (i3 ^ -1) & i2;
            TextPaint textPaint = this.mTextPaint;
            if ((i4 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.mTextPaint;
            if ((i4 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = makeLayout(this.mTextOn);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = makeLayout(this.mTextOff);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.mShowText) {
            i6 = Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2);
        } else {
            i6 = 0;
        }
        this.mThumbWidth = Math.max(i6, i4);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect a2 = w.a(drawable3);
            i8 = Math.max(i8, a2.left);
            i9 = Math.max(i9, a2.right);
        }
        int max = Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.mSwitchWidth = max;
        this.mSwitchHeight = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mTempRect = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        al a2 = al.a(context, attributeSet, new int[]{16843044, 16843045, 16843074, R.attr.ac7, R.attr.ad4, R.attr.ag5, R.attr.ag6, R.attr.ag8, R.attr.aip, R.attr.aiq, R.attr.air, R.attr.ak0, R.attr.ak1, R.attr.ak2}, i2, 0);
        Drawable a3 = a2.a(2);
        this.mThumbDrawable = a3;
        if (a3 != null) {
            a3.setCallback(this);
        }
        Drawable a4 = a2.a(11);
        this.mTrackDrawable = a4;
        if (a4 != null) {
            a4.setCallback(this);
        }
        this.mTextOn = a2.c(0);
        this.mTextOff = a2.c(1);
        this.mShowText = a2.a(3, true);
        this.mThumbTextPadding = a2.e(8, 0);
        this.mSwitchMinWidth = a2.e(5, 0);
        this.mSwitchPadding = a2.e(6, 0);
        this.mSplitTrack = a2.a(4, false);
        ColorStateList e2 = a2.e(9);
        if (e2 != null) {
            this.mThumbTintList = e2;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode a5 = w.a(a2.a(10, -1), null);
        if (this.mThumbTintMode != a5) {
            this.mThumbTintMode = a5;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        ColorStateList e3 = a2.e(12);
        if (e3 != null) {
            this.mTrackTintList = e3;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode a6 = w.a(a2.a(13, -1), null);
        if (this.mTrackTintMode != a6) {
            this.mTrackTintMode = a6;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        int g2 = a2.g(7, 0);
        if (g2 != 0) {
            setSwitchTextAppearance(context, g2);
        }
        a2.f1549a.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        super.onLayout(z, i2, i3, i4, i5);
        int i10 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a2 = w.a(this.mThumbDrawable);
            i6 = Math.max(0, a2.left - rect.left);
            i10 = Math.max(0, a2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (ar.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.mSwitchWidth + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.mSwitchWidth) + i6 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i8 = this.mSwitchHeight;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i8 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i8 = this.mSwitchHeight;
        } else {
            i9 = getHeight() - getPaddingBottom();
            paddingTop = i9 - this.mSwitchHeight;
            this.mSwitchLeft = i7;
            this.mSwitchTop = paddingTop;
            this.mSwitchBottom = i9;
            this.mSwitchRight = width;
        }
        i9 = i8 + paddingTop;
        this.mSwitchLeft = i7;
        this.mSwitchTop = paddingTop;
        this.mSwitchBottom = i9;
        this.mSwitchRight = width;
    }
}
