package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.h.a.d;
import androidx.core.h.v;
import androidx.customview.a.a;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup {
    static final boolean CAN_HIDE_DESCENDANTS = true;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    private static final int[] THEME_ATTRS = {16843828};
    private final b mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final e mLeftCallback;
    private final androidx.customview.a.a mLeftDragger;
    private c mListener;
    public List<c> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final e mRightCallback;
    private final androidx.customview.a.a mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    public interface c {
        static {
            Covode.recordClassIndex(929);
        }

        void onDrawerClosed(View view);

        void onDrawerOpened(View view);

        void onDrawerSlide(View view, float f2);

        void onDrawerStateChanged(int i2);
    }

    static final class b extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(928);
        }

        b() {
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            super.a(view, dVar);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                dVar.a((View) null);
            }
        }
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2691a;

        /* renamed from: b  reason: collision with root package name */
        float f2692b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2693c;

        /* renamed from: d  reason: collision with root package name */
        int f2694d;

        static {
            Covode.recordClassIndex(930);
        }

        public d() {
            super(-1, -1);
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f2691a = dVar.f2691a;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.f2691a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public class e extends a.AbstractC0038a {

        /* renamed from: a  reason: collision with root package name */
        final int f2695a;

        /* renamed from: b  reason: collision with root package name */
        public androidx.customview.a.a f2696b;

        /* renamed from: d  reason: collision with root package name */
        private final Runnable f2698d = new Runnable() {
            /* class androidx.drawerlayout.widget.DrawerLayout.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(932);
            }

            public final void run() {
                boolean z;
                View findDrawerWithGravity;
                int width;
                e eVar = e.this;
                int i2 = eVar.f2696b.f2660i;
                if (eVar.f2695a == 3) {
                    z = true;
                    findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
                    if (findDrawerWithGravity != null) {
                        width = (-findDrawerWithGravity.getWidth()) + i2;
                    } else {
                        return;
                    }
                } else {
                    z = false;
                    findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
                    width = DrawerLayout.this.getWidth() - i2;
                }
                if (findDrawerWithGravity != null) {
                    if (z) {
                        if (findDrawerWithGravity.getLeft() >= width) {
                            return;
                        }
                    } else if (findDrawerWithGravity.getLeft() <= width) {
                        return;
                    }
                    if (DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                        eVar.f2696b.a(findDrawerWithGravity, width, findDrawerWithGravity.getTop());
                        ((d) findDrawerWithGravity.getLayoutParams()).f2693c = true;
                        DrawerLayout.this.invalidate();
                        eVar.d();
                        DrawerLayout.this.cancelChildViewTouch();
                    }
                }
            }
        };

        static {
            Covode.recordClassIndex(931);
        }

        public final void c() {
            DrawerLayout.this.removeCallbacks(this.f2698d);
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a() {
            DrawerLayout.this.postDelayed(this.f2698d, 160);
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            int i2 = 3;
            if (this.f2695a == 3) {
                i2 = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i2);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2) {
            DrawerLayout.this.updateDrawerState(this.f2695a, i2, this.f2696b.f2662k);
        }

        e(int i2) {
            this.f2695a = i2;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final boolean b(View view, int i2) {
            if (!DrawerLayout.this.isDrawerView(view) || !DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f2695a) || DrawerLayout.this.getDrawerLockMode(view) != 0) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int c(View view, int i2) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i2, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i2, width));
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(int i2, int i3) {
            View findDrawerWithGravity;
            if ((i2 & 1) == 1) {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(3);
            } else {
                findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(5);
            }
            if (findDrawerWithGravity != null && DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                this.f2696b.a(findDrawerWithGravity, i3);
            }
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2) {
            ((d) view.getLayoutParams()).f2693c = false;
            d();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final int a(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, float f2, float f3) {
            int width;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width2 = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                width = (f2 > 0.0f || (f2 == 0.0f && drawerViewOffset > 0.5f)) ? 0 : -width2;
            } else {
                width = DrawerLayout.this.getWidth();
                if (f2 < 0.0f || (f2 == 0.0f && drawerViewOffset > 0.5f)) {
                    width -= width2;
                }
            }
            this.f2696b.a(width, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.a.a.AbstractC0038a
        public final void a(View view, int i2, int i3, int i4, int i5) {
            float width;
            int i6;
            int width2 = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                width = (float) (i2 + width2);
            } else {
                width = (float) (DrawerLayout.this.getWidth() - i2);
            }
            float f2 = width / ((float) width2);
            DrawerLayout.this.setDrawerViewOffset(view, f2);
            if (f2 == 0.0f) {
                i6 = 4;
            } else {
                i6 = 0;
            }
            view.setVisibility(i6);
            DrawerLayout.this.invalidate();
        }
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.drawerlayout.widget.DrawerLayout.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(926);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        int f2684a;

        /* renamed from: b  reason: collision with root package name */
        int f2685b;

        /* renamed from: e  reason: collision with root package name */
        int f2686e;

        /* renamed from: f  reason: collision with root package name */
        int f2687f;

        /* renamed from: g  reason: collision with root package name */
        int f2688g;

        static {
            Covode.recordClassIndex(925);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f2684a);
            parcel.writeInt(this.f2685b);
            parcel.writeInt(this.f2686e);
            parcel.writeInt(this.f2687f);
            parcel.writeInt(this.f2688g);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2684a = parcel.readInt();
            this.f2685b = parcel.readInt();
            this.f2686e = parcel.readInt();
            this.f2687f = parcel.readInt();
            this.f2688g = parcel.readInt();
        }
    }

    private boolean hasVisibleDrawer() {
        if (findVisibleDrawer() != null) {
            return true;
        }
        return false;
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((d) getChildAt(i2).getLayoutParams()).f2693c) {
                return true;
            }
        }
        return false;
    }

    private Drawable resolveLeftShadow() {
        int e2 = v.e(this);
        if (e2 == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, e2);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, e2);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        int e2 = v.e(this);
        if (e2 == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, e2);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, e2);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void resolveShadowDrawables() {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            this.mShadowLeftResolved = resolveLeftShadow();
            this.mShadowRightResolved = resolveRightShadow();
        }
    }

    /* access modifiers changed from: package-private */
    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((d) childAt.getLayoutParams()).f2694d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    static {
        Covode.recordClassIndex(923);
        boolean z = true;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = z;
    }

    /* access modifiers changed from: package-private */
    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            f2 = Math.max(f2, ((d) getChildAt(i2).getLayoutParams()).f2692b);
        }
        this.mScrimOpacity = f2;
        boolean c2 = this.mLeftDragger.c();
        boolean c3 = this.mRightDragger.c();
        if (c2 || c3) {
            v.c(this);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            d dVar = (d) getChildAt(i2).getLayoutParams();
            boolean z2 = true;
            if (dVar.f2694d == 1) {
                z = true;
            } else {
                z = false;
            }
            if (dVar.f2694d != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.f2684a = dVar.f2691a;
            } else {
                i2++;
            }
        }
        savedState.f2685b = this.mLockModeLeft;
        savedState.f2686e = this.mLockModeRight;
        savedState.f2687f = this.mLockModeStart;
        savedState.f2688g = this.mLockModeEnd;
        return savedState;
    }

    public void onRtlPropertiesChanged(int i2) {
        resolveShadowDrawables();
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public void closeDrawer(int i2) {
        closeDrawer(i2, true);
    }

    public void openDrawer(int i2) {
        openDrawer(i2, true);
    }

    public void setScrimColor(int i2) {
        this.mScrimColor = i2;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    class a extends androidx.core.h.a {

        /* renamed from: c  reason: collision with root package name */
        private final Rect f2690c = new Rect();

        static {
            Covode.recordClassIndex(927);
        }

        a() {
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.class.getName());
        }

        @Override // androidx.core.h.a
        public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence drawerTitle;
            if (accessibilityEvent.getEventType() != 32) {
                return super.b(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer == null || (drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer))) == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.a(view, dVar);
            } else {
                androidx.core.h.a.d a2 = androidx.core.h.a.d.a(AccessibilityNodeInfo.obtain(dVar.f2484a));
                super.a(view, a2);
                dVar.f2486c = -1;
                dVar.f2484a.setSource(view);
                int i2 = Build.VERSION.SDK_INT;
                ViewParent parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    dVar.a((View) parentForAccessibility);
                }
                Rect rect = this.f2690c;
                a2.a(rect);
                dVar.f2484a.setBoundsInParent(rect);
                a2.b(rect);
                dVar.f2484a.setBoundsInScreen(rect);
                int i3 = Build.VERSION.SDK_INT;
                boolean isVisibleToUser = a2.f2484a.isVisibleToUser();
                int i4 = Build.VERSION.SDK_INT;
                dVar.f2484a.setVisibleToUser(isVisibleToUser);
                dVar.f2484a.setPackageName(a2.f2484a.getPackageName());
                dVar.a(a2.f2484a.getClassName());
                dVar.f2484a.setContentDescription(a2.f2484a.getContentDescription());
                dVar.f2484a.setEnabled(a2.f2484a.isEnabled());
                dVar.f2484a.setClickable(a2.f2484a.isClickable());
                dVar.b(a2.f2484a.isFocusable());
                dVar.c(a2.f2484a.isFocused());
                boolean a3 = a2.a();
                int i5 = Build.VERSION.SDK_INT;
                dVar.f2484a.setAccessibilityFocused(a3);
                dVar.f2484a.setSelected(a2.f2484a.isSelected());
                dVar.f2484a.setLongClickable(a2.f2484a.isLongClickable());
                dVar.a(a2.f2484a.getActions());
                a2.f2484a.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    if (DrawerLayout.includeChildForAccessibility(childAt)) {
                        dVar.f2484a.addChild(childAt);
                    }
                }
            }
            dVar.a((CharSequence) DrawerLayout.class.getName());
            dVar.b(false);
            dVar.c(false);
            dVar.b(d.a.f2487a);
            dVar.b(d.a.f2488b);
        }

        @Override // androidx.core.h.a
        public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof d) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* access modifiers changed from: package-private */
    public float getDrawerViewOffset(View view) {
        return ((d) view.getLayoutParams()).f2692b;
    }

    /* access modifiers changed from: package-private */
    public boolean isContentView(View view) {
        if (((d) view.getLayoutParams()).f2691a == 0) {
            return true;
        }
        return false;
    }

    public boolean isDrawerOpen(int i2) {
        View findDrawerWithGravity = findDrawerWithGravity(i2);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public boolean isDrawerVisible(int i2) {
        View findDrawerWithGravity = findDrawerWithGravity(i2);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(c cVar) {
        List<c> list;
        if (cVar != null && (list = this.mListeners) != null) {
            list.remove(cVar);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.mDisallowInterceptRequested = z;
        if (z) {
            closeDrawers(true);
        }
    }

    public void setDrawerListener(c cVar) {
        c cVar2 = this.mListener;
        if (cVar2 != null) {
            removeDrawerListener(cVar2);
        }
        if (cVar != null) {
            addDrawerListener(cVar);
        }
        this.mListener = cVar;
    }

    public void setDrawerLockMode(int i2) {
        setDrawerLockMode(i2, 3);
        setDrawerLockMode(i2, 5);
    }

    public void setStatusBarBackgroundColor(int i2) {
        this.mStatusBarBackground = new ColorDrawable(i2);
        invalidate();
    }

    static String gravityToString(int i2) {
        if ((i2 & 3) == 3) {
            return "LEFT";
        }
        if ((i2 & 5) == 5) {
            return "RIGHT";
        }
        return Integer.toHexString(i2);
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    static boolean includeChildForAccessibility(View view) {
        if (v.d(view) == 4 || v.d(view) == 2) {
            return false;
        }
        return true;
    }

    public void addDrawerListener(c cVar) {
        if (cVar != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(cVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public CharSequence getDrawerTitle(int i2) {
        int a2 = androidx.core.h.e.a(i2, v.e(this));
        if (a2 == 3) {
            return this.mTitleLeft;
        }
        if (a2 == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getDrawerViewAbsoluteGravity(View view) {
        return androidx.core.h.e.a(((d) view.getLayoutParams()).f2691a, v.e(this));
    }

    /* access modifiers changed from: package-private */
    public boolean isDrawerView(View view) {
        int a2 = androidx.core.h.e.a(((d) view.getLayoutParams()).f2691a, v.e(view));
        if ((a2 & 3) == 0 && (a2 & 5) == 0) {
            return false;
        }
        return true;
    }

    public void setDrawerElevation(float f2) {
        this.mDrawerElevation = f2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (isDrawerView(childAt)) {
                v.a(childAt, this.mDrawerElevation);
            }
        }
    }

    public void setStatusBarBackground(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = androidx.core.content.b.a(getContext(), i2);
        } else {
            drawable = null;
        }
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f2694d & 1) == 1) {
            dVar.f2694d = 0;
            List<c> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerClosed(view);
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerOpened(View view) {
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f2694d & 1) == 0) {
            dVar.f2694d = 1;
            List<c> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerOpened(view);
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public View findDrawerWithGravity(int i2) {
        int a2 = androidx.core.h.e.a(i2, v.e(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((d) view.getLayoutParams()).f2691a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerOpen(View view) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((d) view.getLayoutParams()).f2694d & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawerVisible(View view) {
        if (!isDrawerView(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((d) view.getLayoutParams()).f2692b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public void onDraw(Canvas canvas) {
        Object obj;
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null && Build.VERSION.SDK_INT >= 21 && (obj = this.mLastInsets) != null && (systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop()) > 0) {
            this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.mStatusBarBackground.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    public void closeDrawers(boolean z) {
        boolean a2;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            d dVar = (d) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || dVar.f2693c)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    a2 = this.mLeftDragger.a(childAt, -width, childAt.getTop());
                } else {
                    a2 = this.mRightDragger.a(childAt, getWidth(), childAt.getTop());
                }
                z2 |= a2;
                dVar.f2693c = false;
            }
        }
        this.mLeftCallback.c();
        this.mRightCallback.c();
        if (z2) {
            invalidate();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            View childAt = getChildAt(i2);
            if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public int getDrawerLockMode(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int e2 = v.e(this);
        if (i2 == 3) {
            int i7 = this.mLockModeLeft;
            if (i7 != 3) {
                return i7;
            }
            if (e2 == 0) {
                i3 = this.mLockModeStart;
            } else {
                i3 = this.mLockModeEnd;
            }
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i2 == 5) {
            int i8 = this.mLockModeRight;
            if (i8 != 3) {
                return i8;
            }
            if (e2 == 0) {
                i4 = this.mLockModeEnd;
            } else {
                i4 = this.mLockModeStart;
            }
            if (i4 != 3) {
                return i4;
            }
            return 0;
        } else if (i2 == 8388611) {
            int i9 = this.mLockModeStart;
            if (i9 != 3) {
                return i9;
            }
            if (e2 == 0) {
                i5 = this.mLockModeLeft;
            } else {
                i5 = this.mLockModeRight;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i2 != 8388613) {
            return 0;
        } else {
            int i10 = this.mLockModeEnd;
            if (i10 != 3) {
                return i10;
            }
            if (e2 == 0) {
                i6 = this.mLockModeRight;
            } else {
                i6 = this.mLockModeLeft;
            }
            if (i6 != 3) {
                return i6;
            }
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        if (!(savedState.f2684a == 0 || (findDrawerWithGravity = findDrawerWithGravity(savedState.f2684a)) == null)) {
            openDrawer(findDrawerWithGravity);
        }
        if (savedState.f2685b != 3) {
            setDrawerLockMode(savedState.f2685b, 3);
        }
        if (savedState.f2686e != 3) {
            setDrawerLockMode(savedState.f2686e, 5);
        }
        if (savedState.f2687f != 3) {
            setDrawerLockMode(savedState.f2687f, 8388611);
        }
        if (savedState.f2688g != 3) {
            setDrawerLockMode(savedState.f2688g, 8388613);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View findOpenDrawer;
        this.mLeftDragger.b(motionEvent);
        this.mRightDragger.b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.mInitialMotionX = x;
            this.mInitialMotionY = y;
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            View b2 = this.mLeftDragger.b((int) x2, (int) y2);
            if (b2 != null && isContentView(b2)) {
                float f2 = x2 - this.mInitialMotionX;
                float f3 = y2 - this.mInitialMotionY;
                int i2 = this.mLeftDragger.f2653b;
                if (!((f2 * f2) + (f3 * f3) >= ((float) (i2 * i2)) || (findOpenDrawer = findOpenDrawer()) == null || getDrawerLockMode(findOpenDrawer) == 2)) {
                    z = false;
                    closeDrawers(z);
                    this.mDisallowInterceptRequested = false;
                }
            }
            z = true;
            closeDrawers(z);
            this.mDisallowInterceptRequested = false;
        } else if (action == 3) {
            closeDrawers(true);
            this.mDisallowInterceptRequested = false;
            this.mChildrenCanceledTouch = false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1 != 3) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean mirror(Drawable drawable, int i2) {
        if (drawable == null || !androidx.core.graphics.drawable.a.a(drawable)) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean checkDrawerViewAbsoluteGravity(View view, int i2) {
        if ((getDrawerViewAbsoluteGravity(view) & i2) == i2) {
            return true;
        }
        return false;
    }

    public void setDrawerShadow(int i2, int i3) {
        setDrawerShadow(androidx.core.content.b.a(getContext(), i2), i3);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnDrawerSlide(View view, float f2) {
        List<c> list = this.mListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mListeners.get(size).onDrawerSlide(view, f2);
            }
        }
    }

    public void moveDrawerToOffset(View view, float f2) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = (float) view.getWidth();
        int i2 = ((int) (width * f2)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        setDrawerViewOffset(view, f2);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !hasVisibleDrawer()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer == null) {
            return false;
        }
        if (getDrawerLockMode(findVisibleDrawer) != 0) {
            return true;
        }
        closeDrawers();
        return true;
    }

    public void setChildInsets(Object obj, boolean z) {
        boolean z2;
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        if (z || getBackground() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        setWillNotDraw(z2);
        requestLayout();
    }

    public void setDrawerTitle(int i2, CharSequence charSequence) {
        int a2 = androidx.core.h.e.a(i2, v.e(this));
        if (a2 == 3) {
            this.mTitleLeft = charSequence;
        } else if (a2 == 5) {
            this.mTitleRight = charSequence;
        }
    }

    /* access modifiers changed from: package-private */
    public void setDrawerViewOffset(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 != dVar.f2692b) {
            dVar.f2692b = f2;
            dispatchOnDrawerSlide(view, f2);
        }
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (z ? childAt != view : isDrawerView(childAt)) {
                v.a(childAt, 4);
            } else {
                v.a(childAt, 1);
            }
        }
    }

    public void closeDrawer(int i2, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i2);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i2));
    }

    public void openDrawer(int i2, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i2);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + gravityToString(i2));
    }

    public void setDrawerLockMode(int i2, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i2, ((d) view.getLayoutParams()).f2691a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void setDrawerShadow(Drawable drawable, int i2) {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            if ((i2 & 8388611) == 8388611) {
                this.mShadowStart = drawable;
            } else if ((i2 & 8388613) == 8388613) {
                this.mShadowEnd = drawable;
            } else if ((i2 & 3) == 3) {
                this.mShadowLeft = drawable;
            } else if ((i2 & 5) == 5) {
                this.mShadowRight = drawable;
            } else {
                return;
            }
            resolveShadowDrawables();
            invalidate();
        }
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            d dVar = (d) view.getLayoutParams();
            if (this.mFirstLayout) {
                dVar.f2692b = 0.0f;
                dVar.f2694d = 0;
            } else if (z) {
                dVar.f2694d |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.a(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.a(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(dVar.f2691a, 0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            d dVar = (d) view.getLayoutParams();
            if (this.mFirstLayout) {
                dVar.f2692b = 1.0f;
                dVar.f2694d = 1;
                updateChildrenImportantForAccessibility(view, true);
            } else if (z) {
                dVar.f2694d |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.a(view, 0, view.getTop());
                } else {
                    this.mRightDragger.a(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(dVar.f2691a, 0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void setDrawerLockMode(int i2, int i3) {
        androidx.customview.a.a aVar;
        View findDrawerWithGravity;
        int a2 = androidx.core.h.e.a(i3, v.e(this));
        if (i3 == 3) {
            this.mLockModeLeft = i2;
        } else if (i3 == 5) {
            this.mLockModeRight = i2;
        } else if (i3 == 8388611) {
            this.mLockModeStart = i2;
        } else if (i3 == 8388613) {
            this.mLockModeEnd = i2;
        }
        if (i2 != 0) {
            if (a2 == 3) {
                aVar = this.mLeftDragger;
            } else {
                aVar = this.mRightDragger;
            }
            aVar.a();
            if (i2 == 1) {
                View findDrawerWithGravity2 = findDrawerWithGravity(a2);
                if (findDrawerWithGravity2 != null) {
                    closeDrawer(findDrawerWithGravity2);
                }
            } else if (i2 == 2 && (findDrawerWithGravity = findDrawerWithGravity(a2)) != null) {
                openDrawer(findDrawerWithGravity);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode != Integer.MIN_VALUE && mode == 0) {
                    size = 300;
                }
                if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i4 = 0;
        if (this.mLastInsets == null || !v.o(this)) {
            z = false;
        } else {
            z = true;
        }
        int e2 = v.e(this);
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (z) {
                    int a2 = androidx.core.h.e.a(dVar.f2691a, e2);
                    if (v.o(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.mLastInsets;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i4, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i4, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.mLastInsets;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i4, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i4, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (isContentView(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (isDrawerView(childAt)) {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
                        float k2 = v.k(childAt);
                        float f2 = this.mDrawerElevation;
                        if (k2 != f2) {
                            v.a(childAt, f2);
                        }
                    }
                    int drawerViewAbsoluteGravity = getDrawerViewAbsoluteGravity(childAt) & 7;
                    if (drawerViewAbsoluteGravity == 3) {
                        if (!z2) {
                            z2 = true;
                        } else {
                            throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                        }
                    } else if (!z3) {
                        z3 = true;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + gravityToString(drawerViewAbsoluteGravity) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    childAt.measure(getChildMeasureSpec(i2, this.mMinDrawerMargin + dVar.leftMargin + dVar.rightMargin, dVar.width), getChildMeasureSpec(i3, dVar.topMargin + dVar.bottomMargin, dVar.height));
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i5++;
            i4 = 0;
        }
    }

    private boolean isInBoundsOfChild(float f2, float f3, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f2, (int) f3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            v.a(view, 4);
        } else {
            v.a(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            v.a(view, this.mChildAccessibilityDelegate);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!isDrawerView(childAt)) {
                    this.mNonDrawerViews.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z = true;
                }
            }
            if (!z) {
                int size = this.mNonDrawerViews.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view = this.mNonDrawerViews.get(i5);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i2, i3);
                    }
                }
            }
            this.mNonDrawerViews.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateDrawerState(int i2, int i3, View view) {
        int i4 = this.mLeftDragger.f2652a;
        int i5 = this.mRightDragger.f2652a;
        int i6 = 2;
        if (i4 == 1 || i5 == 1) {
            i6 = 1;
        } else if (!(i4 == 2 || i5 == 2)) {
            i6 = 0;
        }
        if (view != null && i3 == 0) {
            d dVar = (d) view.getLayoutParams();
            if (dVar.f2692b == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (dVar.f2692b == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i6 != this.mDrawerState) {
            this.mDrawerState = i6;
            List<c> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).onDrawerStateChanged(i6);
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mChildAccessibilityDelegate = new b();
        this.mScrimColor = -1728053248;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        e eVar = new e(3);
        this.mLeftCallback = eVar;
        e eVar2 = new e(5);
        this.mRightCallback = eVar2;
        androidx.customview.a.a a2 = androidx.customview.a.a.a(this, 1.0f, eVar);
        this.mLeftDragger = a2;
        a2.f2661j = 1;
        a2.f2659h = f3;
        eVar.f2696b = a2;
        androidx.customview.a.a a3 = androidx.customview.a.a.a(this, 1.0f, eVar2);
        this.mRightDragger = a3;
        a3.f2661j = 2;
        a3.f2659h = f3;
        eVar2.f2696b = a3;
        setFocusableInTouchMode(true);
        v.a((View) this, 1);
        v.a(this, new a());
        setMotionEventSplittingEnabled(false);
        if (v.o(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                    /* class androidx.drawerlayout.widget.DrawerLayout.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(924);
                    }

                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        boolean z;
                        DrawerLayout drawerLayout = (DrawerLayout) view;
                        if (windowInsets.getSystemWindowInsetTop() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        drawerLayout.setChildInsets(windowInsets, z);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
                try {
                    this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.mStatusBarBackground = null;
            }
        }
        this.mDrawerElevation = f2 * 10.0f;
        this.mNonDrawerViews = new ArrayList<>();
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j2) {
        int height = getHeight();
        boolean isContentView = isContentView(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(save);
        float f2 = this.mScrimOpacity;
        if (f2 > 0.0f && isContentView) {
            int i5 = this.mScrimColor;
            Paint paint = this.mScrimPaint;
            paint.setColor((i5 & 16777215) | (((int) (((float) ((-16777216 & i5) >>> 24)) * f2)) << 24));
            canvas.drawRect((float) i2, 0.0f, (float) width, (float) getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.mLeftDragger.f2660i), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.mRightDragger.f2660i), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        float f2;
        boolean z2;
        int i7;
        this.mInLayout = true;
        int i8 = i4 - i2;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    childAt.layout(dVar.leftMargin, dVar.topMargin, dVar.leftMargin + childAt.getMeasuredWidth(), dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f3 = (float) measuredWidth;
                        i6 = (-measuredWidth) + ((int) (dVar.f2692b * f3));
                        f2 = ((float) (measuredWidth + i6)) / f3;
                    } else {
                        float f4 = (float) measuredWidth;
                        i6 = i8 - ((int) (dVar.f2692b * f4));
                        f2 = ((float) (i8 - i6)) / f4;
                    }
                    if (f2 != dVar.f2692b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = dVar.f2691a & 112;
                    if (i10 == 16) {
                        int i11 = i5 - i3;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < dVar.topMargin) {
                            i12 = dVar.topMargin;
                        } else if (i12 + measuredHeight > i11 - dVar.bottomMargin) {
                            i12 = (i11 - dVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i6, i12, measuredWidth + i6, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i6, dVar.topMargin, measuredWidth + i6, dVar.topMargin + measuredHeight);
                    } else {
                        int i13 = i5 - i3;
                        childAt.layout(i6, (i13 - dVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i13 - dVar.bottomMargin);
                    }
                    if (z2) {
                        setDrawerViewOffset(childAt, f2);
                    }
                    if (dVar.f2692b > 0.0f) {
                        i7 = 0;
                    } else {
                        i7 = 4;
                    }
                    if (childAt.getVisibility() != i7) {
                        childAt.setVisibility(i7);
                    }
                }
            }
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }
}
