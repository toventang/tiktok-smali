package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.h.ad;
import androidx.core.h.r;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    private static final Comparator<b> COMPARATOR = new Comparator<b>() {
        /* class androidx.viewpager.widget.ViewPager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1716);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(b bVar, b bVar2) {
            return bVar.f4441b - bVar2.f4441b;
        }
    };
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Interpolator sInterpolator = new Interpolator() {
        /* class androidx.viewpager.widget.ViewPager.AnonymousClass2 */

        static {
            Covode.recordClassIndex(1717);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private static final i sPositionComparator = new i();
    private int mActivePointerId = -1;
    PagerAdapter mAdapter;
    private List<d> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        /* class androidx.viewpager.widget.ViewPager.AnonymousClass3 */

        static {
            Covode.recordClassIndex(1718);
        }

        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private e mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<b> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private g mObserver;
    private int mOffscreenPageLimit = 1;
    private e mOnPageChangeListener;
    private List<e> mOnPageChangeListeners;
    private int mPageMargin;
    private f mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    public Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final b mTempItem = new b();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public @interface a {
        static {
            Covode.recordClassIndex(1723);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(1726);
        }

        void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface e {
        static {
            Covode.recordClassIndex(1727);
        }

        void onPageScrollStateChanged(int i2);

        void onPageScrolled(int i2, float f2, int i3);

        void onPageSelected(int i2);
    }

    public interface f {
        static {
            Covode.recordClassIndex(1728);
        }

        void a(View view, float f2);
    }

    public static class h implements e {
        static {
            Covode.recordClassIndex(1730);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public void onPageSelected(int i2) {
        }
    }

    public static int androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        Object f4440a;

        /* renamed from: b  reason: collision with root package name */
        int f4441b;

        /* renamed from: c  reason: collision with root package name */
        boolean f4442c;

        /* renamed from: d  reason: collision with root package name */
        float f4443d;

        /* renamed from: e  reason: collision with root package name */
        float f4444e;

        static {
            Covode.recordClassIndex(1724);
        }

        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class i implements Comparator<View> {
        static {
            Covode.recordClassIndex(1731);
        }

        i() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public /* synthetic */ int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f4432a == layoutParams2.f4432a) {
                return layoutParams.position - layoutParams2.position;
            }
            if (layoutParams.f4432a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4432a;

        /* renamed from: b  reason: collision with root package name */
        public int f4433b;

        /* renamed from: c  reason: collision with root package name */
        float f4434c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4435d;

        /* renamed from: e  reason: collision with root package name */
        int f4436e;
        public int position;

        static {
            Covode.recordClassIndex(1720);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f4433b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    class g extends DataSetObserver {
        static {
            Covode.recordClassIndex(1729);
        }

        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }

        g() {
        }
    }

    public void clearOnPageChangeListeners() {
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: package-private */
    public void populate() {
        populate(this.mCurItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.viewpager.widget.ViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1722);
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
        int f4437a;

        /* renamed from: b  reason: collision with root package name */
        Parcelable f4438b;

        /* renamed from: e  reason: collision with root package name */
        ClassLoader f4439e;

        static {
            Covode.recordClassIndex(1721);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4437a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4437a);
            parcel.writeParcelable(this.f4438b, i2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4437a = parcel.readInt();
            this.f4438b = parcel.readParcelable(classLoader);
            this.f4439e = classLoader;
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* access modifiers changed from: package-private */
    public boolean pageLeft() {
        int i2 = this.mCurItem;
        if (i2 <= 0) {
            return false;
        }
        setCurrentItem(i2 - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    public class c extends androidx.core.h.a {
        static {
            Covode.recordClassIndex(1725);
        }

        private boolean a() {
            if (ViewPager.this.mAdapter == null || ViewPager.this.mAdapter.getCount() <= 1) {
                return false;
            }
            return true;
        }

        c() {
        }

        @Override // androidx.core.h.a
        public final void a(View view, androidx.core.h.a.d dVar) {
            super.a(view, dVar);
            dVar.a((CharSequence) ViewPager.class.getName());
            dVar.d(a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.a(8192);
            }
        }

        @Override // androidx.core.h.a
        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.h.a
        public final boolean a(View view, int i2, Bundle bundle) {
            if (super.a(view, i2, bundle)) {
                return true;
            }
            if (i2 != 4096) {
                if (i2 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    private void removeNonDecorViews() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i2).getLayoutParams()).f4432a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4437a = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.f4438b = pagerAdapter.saveState();
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    static {
        Covode.recordClassIndex(1715);
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished()) {
            return true;
        }
        return false;
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.mDrawingOrderedChildren.add(getChildAt(i2));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    private b infoForCurrentScrollPosition() {
        float f2;
        float f3;
        int i2;
        int clientWidth = getClientWidth();
        float f4 = 0.0f;
        if (clientWidth > 0) {
            f2 = ((float) getScrollX()) / ((float) clientWidth);
            f3 = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        b bVar = null;
        float f5 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z = true;
        while (i4 < this.mItems.size()) {
            b bVar2 = this.mItems.get(i4);
            if (!z && bVar2.f4441b != (i2 = i3 + 1)) {
                bVar2 = this.mTempItem;
                bVar2.f4444e = f4 + f5 + f3;
                bVar2.f4441b = i2;
                bVar2.f4443d = this.mAdapter.getPageWidth(bVar2.f4441b);
                i4--;
            }
            f4 = bVar2.f4444e;
            float f6 = bVar2.f4443d + f4 + f3;
            if (!z && f2 < f4) {
                return bVar;
            }
            if (f2 < f6 || i4 == this.mItems.size() - 1) {
                return bVar2;
            }
            i3 = bVar2.f4441b;
            f5 = bVar2.f4443d;
            i4++;
            bVar = bVar2;
            z = false;
        }
        return bVar;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        v.c(this);
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f4441b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f4444e) / infoForCurrentScrollPosition.f4443d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f2);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f2);
        this.mCloseEnough = (int) (2.0f * f2);
        this.mDefaultGutterSize = (int) (f2 * 16.0f);
        v.a(this, new c());
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        v.a(this, new r() {
            /* class androidx.viewpager.widget.ViewPager.AnonymousClass4 */

            /* renamed from: b  reason: collision with root package name */
            private final Rect f4431b = new Rect();

            static {
                Covode.recordClassIndex(1719);
            }

            @Override // androidx.core.h.r
            public final ad a(View view, ad adVar) {
                ad a2 = v.a(view, adVar);
                if (a2.f2507b.b()) {
                    return a2;
                }
                Rect rect = this.f4431b;
                rect.left = a2.a();
                rect.top = a2.b();
                rect.right = a2.c();
                rect.bottom = a2.d();
                int childCount = ViewPager.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    ad b2 = v.b(ViewPager.this.getChildAt(i2), a2);
                    rect.left = Math.min(b2.a(), rect.left);
                    rect.top = Math.min(b2.b(), rect.top);
                    rect.right = Math.min(b2.c(), rect.right);
                    rect.bottom = Math.min(b2.d(), rect.bottom);
                }
                return a2.a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i2 = this.mCurItem;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < this.mItems.size()) {
            b bVar = this.mItems.get(i3);
            int itemPosition = this.mAdapter.getItemPosition(bVar.f4440a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i3);
                    i3--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, bVar.f4441b, bVar.f4440a);
                    if (this.mCurItem == bVar.f4441b) {
                        i2 = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (bVar.f4441b != itemPosition) {
                    if (bVar.f4441b == this.mCurItem) {
                        i2 = itemPosition;
                    }
                    bVar.f4441b = itemPosition;
                }
                z = true;
            }
            i3++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.f4432a) {
                    layoutParams.f4434c = 0.0f;
                }
            }
            setCurrentItemInternal(i2, false, true);
            requestLayout();
        }
    }

    public void setOnPageChangeListener(e eVar) {
        this.mOnPageChangeListener = eVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void removeOnAdapterChangeListener(d dVar) {
        List<d> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(dVar);
        }
    }

    public void removeOnPageChangeListener(e eVar) {
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public e setInternalPageChangeListener(e eVar) {
        e eVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = eVar;
        return eVar2;
    }

    private static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(a.class) != null) {
            return true;
        }
        return false;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public float distanceInfluenceForSnapDuration(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i2) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i2, !this.mFirstLayout, false);
    }

    public void setPageMargin(int i2) {
        int i3 = this.mPageMargin;
        this.mPageMargin = i2;
        int width = getWidth();
        recomputeScrollPosition(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.b.a(getContext(), i2));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return false;
    }

    private void enableLayers(boolean z) {
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (z) {
                i2 = this.mPageTransformerLayerType;
            } else {
                i2 = 0;
            }
            getChildAt(i3).setLayerType(i2, null);
        }
    }

    public void addOnAdapterChangeListener(d dVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(dVar);
    }

    public void addOnPageChangeListener(e eVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(eVar);
    }

    /* access modifiers changed from: package-private */
    public b infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public b infoForPosition(int i2) {
        for (int i3 = 0; i3 < this.mItems.size(); i3++) {
            b bVar = this.mItems.get(i3);
            if (bVar.f4441b == i2) {
                return bVar;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        boolean z;
        if (this.mScrollState != i2) {
            this.mScrollState = i2;
            if (this.mPageTransformer != null) {
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                enableLayers(z);
            }
            dispatchOnScrollStateChanged(i2);
        }
    }

    private void dispatchOnPageSelected(int i2) {
        e eVar = this.mOnPageChangeListener;
        if (eVar != null) {
            eVar.onPageSelected(i2);
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.mOnPageChangeListeners.get(i3);
                if (eVar2 != null) {
                    eVar2.onPageSelected(i2);
                }
            }
        }
        e eVar3 = this.mInternalPageChangeListener;
        if (eVar3 != null) {
            eVar3.onPageSelected(i2);
        }
    }

    private void dispatchOnScrollStateChanged(int i2) {
        e eVar = this.mOnPageChangeListener;
        if (eVar != null) {
            eVar.onPageScrollStateChanged(i2);
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.mOnPageChangeListeners.get(i3);
                if (eVar2 != null) {
                    eVar2.onPageScrollStateChanged(i2);
                }
            }
        }
        e eVar3 = this.mInternalPageChangeListener;
        if (eVar3 != null) {
            eVar3.onPageScrollStateChanged(i2);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i2);
            this.mActivePointerId = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        b infoForChild;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4441b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4441b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public b infoForChild(View view) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            b bVar = this.mItems.get(i2);
            if (this.mAdapter.isViewFromObject(view, bVar.f4440a)) {
                return bVar;
            }
        }
        return null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f4438b, savedState.f4439e);
            setCurrentItemInternal(savedState.f4437a, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.f4437a;
        this.mRestoredAdapterState = savedState.f4438b;
        this.mRestoredClassLoader = savedState.f4439e;
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_lancet_LogLancet_w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i2;
            populate();
        }
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.mPopulatePending = false;
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            b bVar = this.mItems.get(i2);
            if (bVar.f4442c) {
                bVar.f4442c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            v.a(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean pageScrolled(int i2) {
        if (this.mItems.size() != 0) {
            b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i3 = this.mPageMargin;
            int i4 = clientWidth + i3;
            float f2 = (float) i3;
            float f3 = (float) clientWidth;
            int i5 = infoForCurrentScrollPosition.f4441b;
            float f4 = ((((float) i2) / f3) - infoForCurrentScrollPosition.f4444e) / (infoForCurrentScrollPosition.f4443d + (f2 / f3));
            this.mCalledSuper = false;
            onPageScrolled(i5, f4, (int) (((float) i4) * f4));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    private boolean performDrag(float f2) {
        boolean z;
        boolean z2;
        this.mLastMotionX = f2;
        float scrollX = ((float) getScrollX()) + (this.mLastMotionX - f2);
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        b bVar = this.mItems.get(0);
        ArrayList<b> arrayList = this.mItems;
        b bVar2 = arrayList.get(arrayList.size() - 1);
        if (bVar.f4441b != 0) {
            f3 = bVar.f4444e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f4441b != this.mAdapter.getCount() - 1) {
            f4 = bVar2.f4444e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        pageScrolled(i2);
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r8 != 2) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r8) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                v.c(this);
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    public void fakeDragBy(float f2) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f2;
            float scrollX = ((float) getScrollX()) - f2;
            float clientWidth = (float) getClientWidth();
            float f3 = this.mFirstOffset * clientWidth;
            float f4 = this.mLastOffset * clientWidth;
            b bVar = this.mItems.get(0);
            ArrayList<b> arrayList = this.mItems;
            b bVar2 = arrayList.get(arrayList.size() - 1);
            if (bVar.f4441b != 0) {
                f3 = bVar.f4444e * clientWidth;
            }
            if (bVar2.f4441b != this.mAdapter.getCount() - 1) {
                f4 = bVar2.f4444e * clientWidth;
            }
            if (scrollX < f3) {
                scrollX = f3;
            } else if (scrollX > f4) {
                scrollX = f4;
            }
            int i2 = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i2);
            scrollTo(i2, getScrollY());
            pageScrolled(i2);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.mPageMargin) / f3;
            int i2 = 0;
            b bVar = this.mItems.get(0);
            float f5 = bVar.f4444e;
            int size = this.mItems.size();
            int i3 = this.mItems.get(size - 1).f4441b;
            for (int i4 = bVar.f4441b; i4 < i3; i4++) {
                while (i4 > bVar.f4441b && i2 < size) {
                    i2++;
                    bVar = this.mItems.get(i2);
                }
                if (i4 == bVar.f4441b) {
                    f2 = (bVar.f4444e + bVar.f4443d) * f3;
                    f5 = bVar.f4444e + bVar.f4443d + f4;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i4);
                    f2 = (f5 + pageWidth) * f3;
                    f5 += pageWidth + f4;
                }
                if (((float) this.mPageMargin) + f2 > ((float) scrollX)) {
                    this.mMarginDrawable.setBounds(Math.round(f2), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f2), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f2 > ((float) (scrollX + width))) {
                    return;
                }
            }
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i2 = 0; i2 < this.mItems.size(); i2++) {
                b bVar = this.mItems.get(i2);
                this.mAdapter.destroyItem((ViewGroup) this, bVar.f4441b, bVar.f4440a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new g();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<d> list = this.mAdapterChangeListeners;
        if (!(list == null || list.isEmpty())) {
            int size = this.mAdapterChangeListeners.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.mAdapterChangeListeners.get(i3).a(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f2;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.mActivePointerId;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(findPointerIndex);
                float f3 = x2 - this.mLastMotionX;
                float abs = Math.abs(f3);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                if (f3 == 0.0f || isGutterDrag(this.mLastMotionX, f3) || !canScroll(this, false, (int) f3, (int) x2, (int) y2)) {
                    int i3 = this.mTouchSlop;
                    if (abs > ((float) i3) && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        if (f3 > 0.0f) {
                            f2 = this.mInitialMotionX + ((float) this.mTouchSlop);
                        } else {
                            f2 = this.mInitialMotionX - ((float) this.mTouchSlop);
                        }
                        this.mLastMotionX = f2;
                        this.mLastMotionY = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i3)) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        v.c(this);
                    }
                } else {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean z;
        float f2;
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z = resetTouch();
                        } else {
                            float x = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x - this.mLastMotionX);
                            float y = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y - this.mLastMotionY);
                            if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                float f3 = this.mInitialMotionX;
                                if (x - f3 > 0.0f) {
                                    f2 = f3 + ((float) this.mTouchSlop);
                                } else {
                                    f2 = f3 - ((float) this.mTouchSlop);
                                }
                                this.mLastMotionX = f2;
                                this.mLastMotionY = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.mLastMotionX = motionEvent.getX(actionIndex);
                        this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                        this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                    }
                } else if (this.mIsBeingDragged) {
                    scrollToItem(this.mCurItem, true, 0, false);
                    z = resetTouch();
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f4 = (float) clientWidth;
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f4441b, ((((float) scrollX) / f4) - infoForCurrentScrollPosition.f4444e) / (infoForCurrentScrollPosition.f4443d + (((float) this.mPageMargin) / f4)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z = resetTouch();
            }
            if (z) {
                v.c(this);
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x2 = motionEvent.getX();
            this.mInitialMotionX = x2;
            this.mLastMotionX = x2;
            float y2 = motionEvent.getY();
            this.mInitialMotionY = y2;
            this.mLastMotionY = y2;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r6.f4441b == r17.mCurItem) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItem(int i2, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i2, z, false);
    }

    public void setPageTransformer(boolean z, f fVar) {
        setPageTransformer(z, fVar, 2);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i2, int i3) {
        smoothScrollTo(i2, i3, 0);
    }

    private boolean isGutterDrag(float f2, float f3) {
        if (f2 < ((float) this.mGutterSize) && f3 > 0.0f) {
            return true;
        }
        if (f2 <= ((float) (getWidth() - this.mGutterSize)) || f3 >= 0.0f) {
            return false;
        }
        return true;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.mDrawingOrder == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i3).getLayoutParams()).f4436e;
    }

    /* access modifiers changed from: package-private */
    public b addNewItem(int i2, int i3) {
        b bVar = new b();
        bVar.f4441b = i2;
        bVar.f4440a = this.mAdapter.instantiateItem((ViewGroup) this, i2);
        bVar.f4443d = this.mAdapter.getPageWidth(i2);
        if (i3 < 0 || i3 >= this.mItems.size()) {
            this.mItems.add(bVar);
        } else {
            this.mItems.add(i3, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        b infoForChild;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4441b == this.mCurItem && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public void setCurrentItemInternal(int i2, boolean z, boolean z2) {
        setCurrentItemInternal(i2, z, z2, 0);
    }

    private void dispatchOnPageScrolled(int i2, float f2, int i3) {
        e eVar = this.mOnPageChangeListener;
        if (eVar != null) {
            eVar.onPageScrolled(i2, f2, i3);
        }
        List<e> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = this.mOnPageChangeListeners.get(i4);
                if (eVar2 != null) {
                    eVar2.onPageScrolled(i2, f2, i3);
                }
            }
        }
        e eVar3 = this.mInternalPageChangeListener;
        if (eVar3 != null) {
            eVar3.onPageScrolled(i2, f2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f4432a |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i2, layoutParams);
        } else if (!layoutParams2.f4432a) {
            layoutParams2.f4435d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void setPageTransformer(boolean z, f fVar, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = 1;
        if (fVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = fVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i3 = 2;
            }
            this.mDrawingOrder = i3;
            this.mPageTransformerLayerType = i2;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f4441b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    public void onPageScrolled(int i2, float f2, int i3) {
        int i4;
        int i5;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4432a) {
                    int i7 = layoutParams.f4433b & 7;
                    if (i7 == 1) {
                        i4 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i5 = paddingLeft;
                        paddingLeft = i4;
                    } else if (i7 == 3) {
                        i5 = childAt.getWidth() + paddingLeft;
                    } else if (i7 != 5) {
                        i5 = paddingLeft;
                    } else {
                        i4 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i5 = paddingLeft;
                        paddingLeft = i4;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i5;
                }
            }
        }
        dispatchOnPageScrolled(i2, f2, i3);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((LayoutParams) childAt2.getLayoutParams()).f4432a) {
                    this.mPageTransformer.a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.mCalledSuper = true;
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i2, int i3, int i4) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int scrollY = getScrollY();
        int i5 = i2 - scrollX;
        int i6 = i3 - scrollY;
        if (i5 == 0 && i6 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i7;
        float distanceInfluenceForSnapDuration = f3 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f2)) * f3);
        int abs2 = Math.abs(i4);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs2)) * 1000.0f) * 4;
        } else {
            abs = (int) (((((float) Math.abs(i5)) / ((f2 * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(scrollX, scrollY, i5, i6, min);
        v.c(this);
    }

    private void calculatePageOffsets(b bVar, int i2, b bVar2) {
        float f2;
        float f3;
        float f4;
        b bVar3;
        b bVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f2 = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        if (bVar2 != null) {
            int i3 = bVar2.f4441b;
            if (i3 < bVar.f4441b) {
                float f5 = bVar2.f4444e + bVar2.f4443d + f2;
                int i4 = i3 + 1;
                int i5 = 0;
                while (i4 <= bVar.f4441b && i5 < this.mItems.size()) {
                    b bVar5 = this.mItems.get(i5);
                    while (true) {
                        bVar4 = bVar5;
                        if (i4 > bVar4.f4441b && i5 < this.mItems.size() - 1) {
                            i5++;
                            bVar5 = this.mItems.get(i5);
                        }
                    }
                    while (i4 < bVar4.f4441b) {
                        f5 += this.mAdapter.getPageWidth(i4) + f2;
                        i4++;
                    }
                    bVar4.f4444e = f5;
                    f5 += bVar4.f4443d + f2;
                    i4++;
                }
            } else if (i3 > bVar.f4441b) {
                int size = this.mItems.size() - 1;
                float f6 = bVar2.f4444e;
                int i6 = i3 - 1;
                while (i6 >= bVar.f4441b && size >= 0) {
                    b bVar6 = this.mItems.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i6 < bVar3.f4441b && size > 0) {
                            size--;
                            bVar6 = this.mItems.get(size);
                        }
                    }
                    while (i6 > bVar3.f4441b) {
                        f6 -= this.mAdapter.getPageWidth(i6) + f2;
                        i6--;
                    }
                    f6 -= bVar3.f4443d + f2;
                    bVar3.f4444e = f6;
                    i6--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f7 = bVar.f4444e;
        int i7 = bVar.f4441b - 1;
        if (bVar.f4441b == 0) {
            f3 = bVar.f4444e;
        } else {
            f3 = -3.4028235E38f;
        }
        this.mFirstOffset = f3;
        int i8 = count - 1;
        if (bVar.f4441b == i8) {
            f4 = (bVar.f4444e + bVar.f4443d) - 1.0f;
        } else {
            f4 = Float.MAX_VALUE;
        }
        this.mLastOffset = f4;
        int i9 = i2 - 1;
        while (i9 >= 0) {
            b bVar7 = this.mItems.get(i9);
            while (i7 > bVar7.f4441b) {
                f7 -= this.mAdapter.getPageWidth(i7) + f2;
                i7--;
            }
            f7 -= bVar7.f4443d + f2;
            bVar7.f4444e = f7;
            if (bVar7.f4441b == 0) {
                this.mFirstOffset = f7;
            }
            i9--;
            i7--;
        }
        float f8 = bVar.f4444e + bVar.f4443d + f2;
        int i10 = bVar.f4441b + 1;
        int i11 = i2 + 1;
        while (i11 < size2) {
            b bVar8 = this.mItems.get(i11);
            while (i10 < bVar8.f4441b) {
                f8 += this.mAdapter.getPageWidth(i10) + f2;
                i10++;
            }
            if (bVar8.f4441b == i8) {
                this.mLastOffset = (bVar8.f4443d + f8) - 1.0f;
            }
            bVar8.f4444e = f8;
            f8 += bVar8.f4443d + f2;
            i11++;
            i10++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.mPageMargin;
            recomputeScrollPosition(i2, i4, i6, i6);
        }
    }

    private void scrollToItem(int i2, boolean z, int i3, boolean z2) {
        int i4;
        b infoForPosition = infoForPosition(i2);
        if (infoForPosition != null) {
            i4 = (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f4444e, this.mLastOffset)));
        } else {
            i4 = 0;
        }
        if (z) {
            smoothScrollTo(i4, 0, i3);
            if (z2) {
                dispatchOnPageSelected(i2);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i2);
        }
        completeScroll(false);
        scrollTo(i4, 0);
        pageScrolled(i4);
    }

    private int determineTargetPage(int i2, float f2, int i3, int i4) {
        float f3;
        if (Math.abs(i4) <= this.mFlingDistance || Math.abs(i3) <= this.mMinimumVelocity) {
            if (i2 >= this.mCurItem) {
                f3 = 0.4f;
            } else {
                f3 = 0.6f;
            }
            i2 += (int) (f2 + f3);
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.mItems.size() <= 0) {
            return i2;
        }
        ArrayList<b> arrayList = this.mItems;
        return Math.max(this.mItems.get(0).f4441b, Math.min(i2, arrayList.get(arrayList.size() - 1).f4441b));
    }

    private void recomputeScrollPosition(int i2, int i3, int i4, int i5) {
        float f2;
        if (i3 <= 0 || this.mItems.isEmpty()) {
            b infoForPosition = infoForPosition(this.mCurItem);
            if (infoForPosition != null) {
                f2 = Math.min(infoForPosition.f4444e, this.mLastOffset);
            } else {
                f2 = 0.0f;
            }
            int paddingLeft = (int) (f2 * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                completeScroll(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    public void setCurrentItemInternal(int i2, boolean z, boolean z2, int i3) {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i2 || this.mItems.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.mAdapter.getCount()) {
                i2 = this.mAdapter.getCount() - 1;
            }
            int i4 = this.mOffscreenPageLimit;
            int i5 = this.mCurItem;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.mItems.size(); i6++) {
                    this.mItems.get(i6).f4442c = true;
                }
            }
            if (this.mCurItem != i2) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i2;
                if (z3) {
                    dispatchOnPageSelected(i2);
                }
                requestLayout();
                return;
            }
            populate(i2);
            scrollToItem(i2, z, i3, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public boolean canScroll(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && canScroll(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        b infoForChild;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i4 - i2;
        int i11 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4432a) {
                    int i14 = layoutParams.f4433b & 7;
                    int i15 = layoutParams.f4433b & 112;
                    if (i14 == 1) {
                        i6 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    } else if (i14 == 3) {
                        i7 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i7 = paddingLeft;
                    } else {
                        i6 = (i10 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i7 = paddingLeft;
                        paddingLeft = i6;
                    }
                    if (i15 == 16) {
                        i8 = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i9 = paddingTop;
                        paddingTop = i8;
                    } else if (i15 == 48) {
                        i9 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i15 != 80) {
                        i9 = paddingTop;
                    } else {
                        i8 = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i9 = paddingTop;
                        paddingTop = i8;
                    }
                    int i16 = paddingLeft + scrollX;
                    childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                    i12++;
                    paddingTop = i9;
                    paddingLeft = i7;
                }
            }
        }
        int i17 = (i10 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f4432a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f2 = (float) i17;
                    int i19 = ((int) (infoForChild.f4444e * f2)) + paddingLeft;
                    if (layoutParams2.f4435d) {
                        layoutParams2.f4435d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * layoutParams2.f4434c), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i11 - paddingBottom;
        this.mDecorChildCount = i12;
        if (this.mFirstLayout) {
            z2 = false;
            scrollToItem(this.mCurItem, false, 0, false);
        } else {
            z2 = false;
        }
        this.mFirstLayout = z2;
    }
}
