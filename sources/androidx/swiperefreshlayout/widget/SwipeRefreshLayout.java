package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.h.j;
import androidx.core.h.m;
import androidx.core.h.n;
import androidx.core.h.q;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;

public class SwipeRefreshLayout extends ViewGroup implements j, n {
    private static final int[] LAYOUT_ATTRS = {16842766};
    private static final String LOG_TAG = SwipeRefreshLayout.class.getSimpleName();
    private int mActivePointerId;
    private Animation mAlphaMaxAnimation;
    private Animation mAlphaStartAnimation;
    private final Animation mAnimateToCorrectPosition;
    private final Animation mAnimateToStartPosition;
    private a mChildScrollUpCallback;
    private int mCircleDiameter;
    a mCircleView;
    private int mCircleViewIndex;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    private final DecelerateInterpolator mDecelerateInterpolator;
    protected int mFrom;
    private float mInitialDownY;
    private float mInitialMotionY;
    private boolean mIsBeingDragged;
    b mListener;
    private int mMediumAnimationDuration;
    private boolean mNestedScrollInProgress;
    private final m mNestedScrollingChildHelper;
    private final q mNestedScrollingParentHelper;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    private final int[] mParentOffsetInWindow;
    private final int[] mParentScrollConsumed;
    b mProgress;
    private Animation.AnimationListener mRefreshListener;
    public boolean mRefreshing;
    private boolean mReturningToStart;
    boolean mScale;
    private Animation mScaleAnimation;
    private Animation mScaleDownAnimation;
    private Animation mScaleDownToStartAnimation;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    private View mTarget;
    private float mTotalDragDistance;
    private float mTotalUnconsumed;
    private int mTouchSlop;
    boolean mUsingCustomStart;

    public interface a {
        static {
            Covode.recordClassIndex(1700);
        }

        boolean a();
    }

    public interface b {
        static {
            Covode.recordClassIndex(1701);
        }

        void onRefresh();
    }

    public static int androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public int getProgressCircleDiameter() {
        return this.mCircleDiameter;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.a();
    }

    public boolean hasNestedScrollingParent() {
        return this.mNestedScrollingChildHelper.a(0);
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return this.mNestedScrollingChildHelper.f2548a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        this.mNestedScrollingChildHelper.b(0);
    }

    private void startProgressAlphaMaxAnimation() {
        this.mAlphaMaxAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 255);
    }

    private void startProgressAlphaStartAnimation() {
        this.mAlphaStartAnimation = startAlphaAnimation(this.mProgress.getAlpha(), 76);
    }

    static {
        Covode.recordClassIndex(1691);
    }

    private void ensureTarget() {
        if (this.mTarget == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.mCircleView)) {
                    this.mTarget = childAt;
                    return;
                }
            }
        }
    }

    public boolean canChildScrollUp() {
        a aVar = this.mChildScrollUpCallback;
        if (aVar != null) {
            return aVar.a();
        }
        View view = this.mTarget;
        if (!(view instanceof ListView)) {
            return view.canScrollVertically(-1);
        }
        int i2 = Build.VERSION.SDK_INT;
        return ((ListView) view).canScrollList(-1);
    }

    private void createProgressView() {
        this.mCircleView = new a(getContext());
        b bVar = new b(getContext());
        this.mProgress = bVar;
        bVar.a(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        setColorViewAlpha(255);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setDistanceToTriggerSync(int i2) {
        this.mTotalDragDistance = (float) i2;
    }

    public void setOnChildScrollUpCallback(a aVar) {
        this.mChildScrollUpCallback = aVar;
    }

    public void setOnRefreshListener(b bVar) {
        this.mListener = bVar;
    }

    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setSlingshotDistance(int i2) {
        this.mCustomSlingshotDistance = i2;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.mNestedScrollingChildHelper.a(z);
    }

    public void setProgressBackgroundColorSchemeColor(int i2) {
        this.mCircleView.setBackgroundColor(i2);
    }

    public boolean startNestedScroll(int i2) {
        return this.mNestedScrollingChildHelper.a(i2, 0);
    }

    private void setColorViewAlpha(int i2) {
        this.mCircleView.getBackground().setAlpha(i2);
        this.mProgress.setAlpha(i2);
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f2) {
        this.mCircleView.setScaleX(f2);
        this.mCircleView.setScaleY(f2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            reset();
        }
    }

    public void setProgressBackgroundColorSchemeResource(int i2) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.c(getContext(), i2));
    }

    private boolean isAnimationRunning(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
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
            this.mActivePointerId = motionEvent.getPointerId(i2);
        }
    }

    private void startDragging(float f2) {
        float f3 = this.mInitialDownY;
        int i2 = this.mTouchSlop;
        if (f2 - f3 > ((float) i2) && !this.mIsBeingDragged) {
            this.mInitialMotionY = f3 + ((float) i2);
            this.mIsBeingDragged = true;
            this.mProgress.setAlpha(76);
        }
    }

    /* access modifiers changed from: package-private */
    public void moveToStart(float f2) {
        int i2 = this.mFrom;
        setTargetOffsetTopAndBottom((i2 + ((int) (((float) (this.mOriginalOffsetTop - i2)) * f2))) - this.mCircleView.getTop());
    }

    @Override // androidx.core.h.n
    public void onStopNestedScroll(View view) {
        this.mNestedScrollingParentHelper.a(0);
        this.mNestedScrollInProgress = false;
        float f2 = this.mTotalUnconsumed;
        if (f2 > 0.0f) {
            finishSpinner(f2);
            this.mTotalUnconsumed = 0.0f;
        }
        stopNestedScroll();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.mTarget instanceof AbsListView)) {
            View view = this.mTarget;
            if (view == null || v.t(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public void setColorSchemeColors(int... iArr) {
        ensureTarget();
        b bVar = this.mProgress;
        bVar.f4394a.a(iArr);
        bVar.f4394a.a(0);
        bVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = androidx.core.content.b.c(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i2) {
        this.mCircleView.bringToFront();
        v.d(this.mCircleView, i2);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    /* access modifiers changed from: package-private */
    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        AnonymousClass3 r2 = new Animation() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1694);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f2);
            }
        };
        this.mScaleDownAnimation = r2;
        r2.setDuration(150);
        this.mCircleView.f4386a = animationListener;
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownAnimation);
    }

    private void finishSpinner(float f2) {
        if (f2 > this.mTotalDragDistance) {
            setRefreshing(true, true);
            return;
        }
        this.mRefreshing = false;
        this.mProgress.b(0.0f);
        AnonymousClass5 r1 = null;
        if (!this.mScale) {
            r1 = new Animation.AnimationListener() {
                /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(1696);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.mScale) {
                        SwipeRefreshLayout.this.startScaleDownAnimation(null);
                    }
                }
            };
        }
        animateOffsetToStartPosition(this.mCurrentTargetOffsetTop, r1);
        this.mProgress.a(false);
    }

    private void startScaleUpAnimation(Animation.AnimationListener animationListener) {
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(255);
        AnonymousClass2 r2 = new Animation() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1693);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f2);
            }
        };
        this.mScaleAnimation = r2;
        r2.setDuration((long) this.mMediumAnimationDuration);
        if (animationListener != null) {
            this.mCircleView.f4386a = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleAnimation);
    }

    public void setRefreshing(boolean z) {
        int i2;
        if (!z || this.mRefreshing == z) {
            setRefreshing(z, false);
            return;
        }
        this.mRefreshing = z;
        if (!this.mUsingCustomStart) {
            i2 = this.mSpinnerOffsetEnd + this.mOriginalOffsetTop;
        } else {
            i2 = this.mSpinnerOffsetEnd;
        }
        setTargetOffsetTopAndBottom(i2 - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        startScaleUpAnimation(this.mRefreshListener);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.mCircleDiameter = (int) (displayMetrics.density * 56.0f);
            } else {
                this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable(null);
            this.mProgress.a(i2);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    private void moveSpinner(float f2) {
        this.mProgress.a(true);
        float min = Math.min(1.0f, Math.abs(f2 / this.mTotalDragDistance));
        double d2 = (double) min;
        Double.isNaN(d2);
        float max = (Math.max((float) (d2 - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f2) - this.mTotalDragDistance;
        int i2 = this.mCustomSlingshotDistance;
        if (i2 <= 0) {
            if (this.mUsingCustomStart) {
                i2 = this.mSpinnerOffsetEnd - this.mOriginalOffsetTop;
            } else {
                i2 = this.mSpinnerOffsetEnd;
            }
        }
        float f3 = (float) i2;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f4 = ((float) (max2 - pow)) * 2.0f;
        int i3 = this.mOriginalOffsetTop + ((int) ((f3 * min) + (f3 * f4 * 2.0f)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f2 / this.mTotalDragDistance));
        }
        if (f2 < this.mTotalDragDistance) {
            if (this.mProgress.getAlpha() > 76 && !isAnimationRunning(this.mAlphaStartAnimation)) {
                startProgressAlphaStartAnimation();
            }
        } else if (this.mProgress.getAlpha() < 255 && !isAnimationRunning(this.mAlphaMaxAnimation)) {
            startProgressAlphaMaxAnimation();
        }
        this.mProgress.b(Math.min(0.8f, max * 0.8f));
        this.mProgress.a(Math.min(1.0f, max));
        b bVar = this.mProgress;
        bVar.f4394a.f4410g = (((max * 0.4f) - 16.0f) + (f4 * 2.0f)) * 0.5f;
        bVar.invalidateSelf();
        setTargetOffsetTopAndBottom(i3 - this.mCurrentTargetOffsetTop);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ensureTarget();
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.mActivePointerId;
                    if (i2 == -1) {
                        androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_ss_android_ugc_aweme_lancet_LogLancet_e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i2);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    startDragging(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                }
            }
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.mActivePointerId = pointerId;
            this.mIsBeingDragged = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.mInitialDownY = motionEvent.getY(findPointerIndex2);
        }
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.mReturningToStart && actionMasked == 0) {
            this.mReturningToStart = false;
        }
        if (!isEnabled() || this.mReturningToStart || canChildScrollUp() || this.mRefreshing || this.mNestedScrollInProgress) {
            return false;
        }
        if (actionMasked == 0) {
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsBeingDragged = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex < 0) {
                androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_ss_android_ugc_aweme_lancet_LogLancet_e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.mIsBeingDragged) {
                this.mIsBeingDragged = false;
                finishSpinner((motionEvent.getY(findPointerIndex) - this.mInitialMotionY) * 0.5f);
            }
            this.mActivePointerId = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.mActivePointerId);
            if (findPointerIndex2 < 0) {
                androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_ss_android_ugc_aweme_lancet_LogLancet_e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            startDragging(y);
            if (this.mIsBeingDragged) {
                float f2 = (y - this.mInitialMotionY) * 0.5f;
                if (f2 <= 0.0f) {
                    return false;
                }
                moveSpinner(f2);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_ss_android_ugc_aweme_lancet_LogLancet_e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                onSecondaryPointerUp(motionEvent);
            }
        }
        return true;
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.mNestedScrollingChildHelper.a(f2, f3);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        int i4 = this.mCircleViewIndex;
        if (i4 < 0) {
            return i3;
        }
        if (i3 == i2 - 1) {
            return i4;
        }
        if (i3 >= i4) {
            return i3 + 1;
        }
        return i3;
    }

    public void setProgressViewEndTarget(boolean z, int i2) {
        this.mSpinnerOffsetEnd = i2;
        this.mScale = z;
        this.mCircleView.invalidate();
    }

    private void setRefreshing(boolean z, boolean z2) {
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            ensureTarget();
            this.mRefreshing = z;
            if (z) {
                animateOffsetToCorrectPosition(this.mCurrentTargetOffsetTop, this.mRefreshListener);
            } else {
                startScaleDownAnimation(this.mRefreshListener);
            }
        }
    }

    private Animation startAlphaAnimation(final int i2, final int i3) {
        AnonymousClass4 r2 = new Animation() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass4 */

            static {
                Covode.recordClassIndex(1695);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                b bVar = SwipeRefreshLayout.this.mProgress;
                int i2 = i2;
                bVar.setAlpha((int) (((float) i2) + (((float) (i3 - i2)) * f2)));
            }
        };
        r2.setDuration(300);
        this.mCircleView.f4386a = null;
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(r2);
        return r2;
    }

    private void animateOffsetToCorrectPosition(int i2, Animation.AnimationListener animationListener) {
        this.mFrom = i2;
        this.mAnimateToCorrectPosition.reset();
        this.mAnimateToCorrectPosition.setDuration(200);
        this.mAnimateToCorrectPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.f4386a = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToCorrectPosition);
    }

    private void animateOffsetToStartPosition(int i2, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            startScaleDownReturnToStartAnimation(i2, animationListener);
            return;
        }
        this.mFrom = i2;
        this.mAnimateToStartPosition.reset();
        this.mAnimateToStartPosition.setDuration(200);
        this.mAnimateToStartPosition.setInterpolator(this.mDecelerateInterpolator);
        if (animationListener != null) {
            this.mCircleView.f4386a = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mAnimateToStartPosition);
    }

    private void startScaleDownReturnToStartAnimation(int i2, Animation.AnimationListener animationListener) {
        this.mFrom = i2;
        this.mStartingScale = this.mCircleView.getScaleX();
        AnonymousClass8 r2 = new Animation() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass8 */

            static {
                Covode.recordClassIndex(1699);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.mStartingScale + ((-SwipeRefreshLayout.this.mStartingScale) * f2));
                SwipeRefreshLayout.this.moveToStart(f2);
            }
        };
        this.mScaleDownToStartAnimation = r2;
        r2.setDuration(150);
        if (animationListener != null) {
            this.mCircleView.f4386a = animationListener;
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.mScaleDownToStartAnimation);
    }

    public static int androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.mTarget == null) {
            ensureTarget();
        }
        View view = this.mTarget;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mCircleDiameter, 1073741824));
            this.mCircleViewIndex = -1;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                if (getChildAt(i4) == this.mCircleView) {
                    this.mCircleViewIndex = i4;
                    return;
                }
            }
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTotalDragDistance = -1.0f;
        this.mParentScrollConsumed = new int[2];
        this.mParentOffsetInWindow = new int[2];
        this.mActivePointerId = -1;
        this.mCircleViewIndex = -1;
        this.mRefreshListener = new Animation.AnimationListener() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1692);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.mRefreshing) {
                    SwipeRefreshLayout.this.mProgress.setAlpha(255);
                    SwipeRefreshLayout.this.mProgress.start();
                    if (SwipeRefreshLayout.this.mNotify && SwipeRefreshLayout.this.mListener != null) {
                        SwipeRefreshLayout.this.mListener.onRefresh();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    swipeRefreshLayout.mCurrentTargetOffsetTop = swipeRefreshLayout.mCircleView.getTop();
                    return;
                }
                SwipeRefreshLayout.this.reset();
            }
        };
        this.mAnimateToCorrectPosition = new Animation() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass6 */

            static {
                Covode.recordClassIndex(1697);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                int i2;
                if (!SwipeRefreshLayout.this.mUsingCustomStart) {
                    i2 = SwipeRefreshLayout.this.mSpinnerOffsetEnd - Math.abs(SwipeRefreshLayout.this.mOriginalOffsetTop);
                } else {
                    i2 = SwipeRefreshLayout.this.mSpinnerOffsetEnd;
                }
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((SwipeRefreshLayout.this.mFrom + ((int) (((float) (i2 - SwipeRefreshLayout.this.mFrom)) * f2))) - SwipeRefreshLayout.this.mCircleView.getTop());
                SwipeRefreshLayout.this.mProgress.a(1.0f - f2);
            }
        };
        this.mAnimateToStartPosition = new Animation() {
            /* class androidx.swiperefreshlayout.widget.SwipeRefreshLayout.AnonymousClass7 */

            static {
                Covode.recordClassIndex(1698);
            }

            public final void applyTransformation(float f2, Transformation transformation) {
                SwipeRefreshLayout.this.moveToStart(f2);
            }
        };
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.mMediumAnimationDuration = androidx_swiperefreshlayout_widget_SwipeRefreshLayout_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(getResources(), 17694721);
        setWillNotDraw(false);
        this.mDecelerateInterpolator = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.mCircleDiameter = (int) (displayMetrics.density * 40.0f);
        createProgressView();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i2;
        this.mTotalDragDistance = (float) i2;
        this.mNestedScrollingParentHelper = new q();
        this.mNestedScrollingChildHelper = new m(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.mCircleDiameter;
        this.mCurrentTargetOffsetTop = i3;
        this.mOriginalOffsetTop = i3;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z) {
        return this.mNestedScrollingChildHelper.a(f2, f3, z);
    }

    @Override // androidx.core.h.n
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void setProgressViewOffset(boolean z, int i2, int i3) {
        this.mScale = z;
        this.mOriginalOffsetTop = i2;
        this.mSpinnerOffsetEnd = i3;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    @Override // androidx.core.h.n
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.mNestedScrollingParentHelper.a(i2, 0);
        startNestedScroll(i2 & 2);
        this.mTotalUnconsumed = 0.0f;
        this.mNestedScrollInProgress = true;
    }

    @Override // androidx.core.h.n
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (!isEnabled() || this.mReturningToStart || this.mRefreshing || (i2 & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.mNestedScrollingChildHelper.a(i2, i3, iArr, iArr2);
    }

    @Override // androidx.core.h.n
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return dispatchNestedFling(f2, f3, z);
    }

    @Override // androidx.core.h.n
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f2 = this.mTotalUnconsumed;
            if (f2 > 0.0f) {
                float f3 = (float) i3;
                if (f3 > f2) {
                    iArr[1] = i3 - ((int) f2);
                    this.mTotalUnconsumed = 0.0f;
                } else {
                    this.mTotalUnconsumed = f2 - f3;
                    iArr[1] = i3;
                }
                moveSpinner(this.mTotalUnconsumed);
            }
        }
        if (this.mUsingCustomStart && i3 > 0 && this.mTotalUnconsumed == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.mParentScrollConsumed;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.mNestedScrollingChildHelper.a(i2, i3, i4, i5, iArr);
    }

    @Override // androidx.core.h.n
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        dispatchNestedScroll(i2, i3, i4, i5, this.mParentOffsetInWindow);
        int i6 = i5 + this.mParentOffsetInWindow[1];
        if (i6 < 0 && !canChildScrollUp()) {
            float abs = this.mTotalUnconsumed + ((float) Math.abs(i6));
            this.mTotalUnconsumed = abs;
            moveSpinner(abs);
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.mTarget == null) {
                ensureTarget();
            }
            View view = this.mTarget;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.mCircleView.getMeasuredWidth();
                int measuredHeight2 = this.mCircleView.getMeasuredHeight();
                int i6 = measuredWidth / 2;
                int i7 = measuredWidth2 / 2;
                int i8 = this.mCurrentTargetOffsetTop;
                this.mCircleView.layout(i6 - i7, i8, i6 + i7, measuredHeight2 + i8);
            }
        }
    }
}
