package com.lynx.tasm.behavior.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.a.a.c;
import com.lynx.tasm.a.b.c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.b.b;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.text.AndroidText;
import com.lynx.tasm.behavior.ui.utils.a;
import com.lynx.tasm.behavior.ui.utils.g;
import com.lynx.tasm.behavior.ui.utils.h;
import com.lynx.tasm.behavior.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LynxUI<T extends View> extends LynxBaseUI {
    protected static final boolean ENABLE_ZINDEX;
    public a mBackgroundManager;
    public LynxBaseUI mDrawHead;
    public com.lynx.tasm.behavior.b.a mHeroAnimOwner;
    private com.lynx.tasm.a.a.a mKeyframeManager;
    private c mLayoutAnimator;
    public boolean mOverlappingRendering;
    private boolean mSetVisibleByCSS;
    private com.lynx.tasm.a.c.a mTransitionAnimator;
    public T mView;
    protected List<LynxUI> mViewChildren;
    private int mZIndex;

    /* access modifiers changed from: protected */
    public T createView(Context context) {
        return null;
    }

    /* access modifiers changed from: protected */
    public T createView(Context context, Object obj) {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int i2 = 0;
            double d2 = 0.0d;
            switch (nextKey.hashCode()) {
                case -2005042753:
                    if (nextKey.equals("z-index")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setZIndex(i2);
                        continue;
                    }
                    break;
                case -1970593579:
                    if (nextKey.equals("lynx-test-tag")) {
                        setTestID(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1796753876:
                    if (nextKey.equals("pause-transition-name")) {
                        setPauseTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -1613231517:
                    if (nextKey.equals("resume-transition-name")) {
                        setResumeTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -1297725862:
                    if (nextKey.equals("layout-animation-create-property")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setLayoutAnimationCreateProperty(i2);
                        continue;
                    }
                    break;
                case -1274492040:
                    if (nextKey.equals("filter")) {
                        setFilter(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        continue;
                    }
                    break;
                case -1267206133:
                    if (nextKey.equals("opacity")) {
                        setAlpha(readableMap.isNull(nextKey) ? 1.0f : (float) readableMap.getDouble(nextKey, 1.0d));
                        continue;
                    }
                    break;
                case -1091287993:
                    if (nextKey.equals("overlap")) {
                        setOverlap(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1087342188:
                    if (nextKey.equals("shared-element")) {
                        setShareElement(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1013209314:
                    if (nextKey.equals("layout-animation-create-delay")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationCreateDelay(d2);
                        continue;
                    }
                    break;
                case -412530555:
                    if (nextKey.equals("layout-animation-delete-timing-function")) {
                        setLayoutAnimationDeleteTimingFunc(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -316342365:
                    if (nextKey.equals("layout-animation-update-timing-function")) {
                        setLayoutAnimationUpdateTimingFunc(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case -49240502:
                    if (nextKey.equals("layout-animation-delete-duration")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationDeleteDuration(d2);
                        continue;
                    }
                    break;
                case 315007413:
                    if (nextKey.equals("accessibility-label")) {
                        setAccessibilityLabel(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 374052076:
                    if (nextKey.equals("layout-animation-update-duration")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationUpdateDuration(d2);
                        continue;
                    }
                    break;
                case 633600340:
                    if (nextKey.equals("exit-transition-name")) {
                        setExitTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case 805728555:
                    if (nextKey.equals("layout-animation-update-delay")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationUpdateDelay(d2);
                        continue;
                    }
                    break;
                case 949630603:
                    if (nextKey.equals("layout-animation-delete-property")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setLayoutAnimationDeleteProperty(i2);
                        continue;
                    }
                    break;
                case 985926797:
                    if (nextKey.equals("layout-animation-delete-delay")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationDeleteDelay(d2);
                        continue;
                    }
                    break;
                case 1052666732:
                    if (nextKey.equals("transform")) {
                        setTransform(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case 1372923181:
                    if (nextKey.equals("layout-animation-update-property")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setLayoutAnimationUpdateProperty(i2);
                        continue;
                    }
                    break;
                case 1485345550:
                    if (nextKey.equals("enter-transition-name")) {
                        setEnterTransitionName(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
                case 1941332754:
                    if (nextKey.equals("visibility")) {
                        int i3 = 1;
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, 1);
                        }
                        setVisibility(i3);
                        continue;
                    }
                    break;
                case 1998370329:
                    if (nextKey.equals("layout-animation-create-duration")) {
                        if (!readableMap.isNull(nextKey)) {
                            d2 = readableMap.getDouble(nextKey, 0.0d);
                        }
                        setLayoutAnimationCreateDuration(d2);
                        continue;
                    }
                    break;
                case 2022810070:
                    if (nextKey.equals("layout-animation-create-timing-function")) {
                        setLayoutAnimationCreateTimingFunc(readableMap.getArray(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    public LynxUI getTransitionUI() {
        return null;
    }

    public void setLayoutAnimationCreateTimingFunc(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public com.lynx.tasm.a.a.a getKeyframeManager() {
        return this.mKeyframeManager;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public c getLayoutAnimator() {
        return this.mLayoutAnimator;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public com.lynx.tasm.a.c.a getTransitionAnimator() {
        return this.mTransitionAnimator;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean getVisibility() {
        return this.mSetVisibleByCSS;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getZIndex() {
        return this.mZIndex;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        handleLayout();
    }

    public int getBackgroundColor() {
        return this.mBackgroundManager.f56415h;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationX() {
        return this.mView.getTranslationX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationY() {
        return this.mView.getTranslationY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void invalidate() {
        this.mView.invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void requestLayout() {
        this.mView.requestLayout();
    }

    private void prepareKeyframeManager() {
        if (this.mKeyframeManager == null) {
            this.mKeyframeManager = new com.lynx.tasm.a.a.a(this);
        }
    }

    private void prepareLayoutAnimator() {
        if (this.mLayoutAnimator == null) {
            this.mLayoutAnimator = new c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getScaleX() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleX();
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getScaleY() {
        T t = this.mView;
        if (t == null) {
            return 1.0f;
        }
        return t.getScaleY();
    }

    public boolean isRtl() {
        if (this.mLynxDirection == 2) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDrawingPositionChanged() {
        if (!this.mView.isLayoutRequested()) {
            handleLayout();
            invalidate();
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(35029);
        if (Build.VERSION.SDK_INT < 21) {
            z = true;
        } else {
            z = false;
        }
        ENABLE_ZINDEX = z;
    }

    private boolean shouldDoTransformTransition() {
        com.lynx.tasm.a.c.a aVar;
        if (this.mIsFirstAnimatedReady || !this.hasTransformChanged || (aVar = this.mTransitionAnimator) == null || !aVar.a(4096)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public float getTranslationZ() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.mView.getTranslationZ();
        }
        return this.mBackgroundManager.f56394c;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isUserInteractionEnabled() {
        T t;
        if (!this.userInteractionEnabled || (t = this.mView) == null || t.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean enableLayoutAnimation() {
        c cVar = this.mLayoutAnimator;
        if (cVar == null || ((cVar.s == null || !cVar.s.a()) && ((cVar.u == null || !cVar.u.a()) && (cVar.t == null || !cVar.t.a())))) {
            return false;
        }
        return true;
    }

    public void execPauseAnim() {
        com.lynx.tasm.behavior.b.a aVar = this.mHeroAnimOwner;
        if (b.a.f55815a.f55807f && !aVar.a() && aVar.f55790g != null) {
            aVar.f55784a.setAnimation(aVar.f55790g);
            if (aVar.f55784a.getKeyframeManager() != null) {
                aVar.f55784a.getKeyframeManager().a();
            }
        }
    }

    public void execResumeAnim() {
        com.lynx.tasm.behavior.b.a aVar = this.mHeroAnimOwner;
        if (b.a.f55815a.f55807f && !aVar.a() && aVar.f55791h != null) {
            aVar.f55784a.setAnimation(aVar.f55791h);
            if (aVar.f55784a.getKeyframeManager() != null) {
                aVar.f55784a.getKeyframeManager().a();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        T createView = createView(this.mContext, this.mParam);
        this.mView = createView;
        if (createView == null) {
            this.mView = createView(this.mContext);
        }
        if (this.mView != null) {
            this.mHeroAnimOwner = new com.lynx.tasm.behavior.b.a(this);
            a aVar = new a(this, this.mContext);
            this.mBackgroundManager = aVar;
            this.mLynxBackground = aVar;
            this.mBackgroundManager.f56413f = this.mDrawableCallback;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        String str = "LynxUI." + this.mTagName + "measure";
        TraceEvent.a(0, str);
        setLayoutParamsInternal();
        this.mView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        TraceEvent.b(0, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        com.lynx.tasm.a.a.a aVar = this.mKeyframeManager;
        if (!(aVar == null || aVar.f55599b == null)) {
            for (com.lynx.tasm.a.a.c cVar : aVar.f55599b.values()) {
                cVar.e();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        if (getBound() != null && (getBound().width() <= 0 || getBound().height() <= 0)) {
            this.mView.setVisibility(8);
        } else if (this.mSetVisibleByCSS) {
            this.mView.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void setLayoutParamsInternal() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams generateLayoutParams;
        if (this.mParent != null && (this.mParent instanceof UIGroup) && ((LynxBaseUI) this.mParent).needCustomLayout() && (generateLayoutParams = ((LynxBaseUI) this.mParent).generateLayoutParams((layoutParams = this.mView.getLayoutParams()))) != null && layoutParams != generateLayoutParams) {
            updateLayoutParams(generateLayoutParams);
        }
    }

    public boolean hasAnimationRunning() {
        T t;
        com.lynx.tasm.a.a.a aVar = this.mKeyframeManager;
        if (aVar != null && aVar.f55599b != null) {
            Iterator<com.lynx.tasm.a.a.c> it = aVar.f55599b.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().b()) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        com.lynx.tasm.a.c.a aVar2 = this.mTransitionAnimator;
        if ((aVar2 == null || aVar2.u == null || !aVar2.u.isRunning()) && ((t = this.mView) == null || t.getAnimation() == null)) {
            return false;
        }
        return true;
    }

    private void handleLayout() {
        String str = "LynxUI." + this.mTagName + ".layout";
        TraceEvent.a(0, str);
        String str2 = str + ".mView";
        TraceEvent.a(0, str2);
        this.mView.layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        TraceEvent.b(0, str2);
        if (this.mParent instanceof UIShadowProxy) {
            ((UIShadowProxy) this.mParent).b();
        }
        if (this.mView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) this.mView.getParent();
            if (getOverflow() != 0) {
                viewGroup.setClipChildren(false);
            }
            androidx.core.h.v.a(this.mView, getBoundRectForOverflow());
            int i2 = Build.VERSION.SDK_INT;
        }
        if (getOverflow() != 0 && (getWidth() == 0 || getHeight() == 0)) {
            T t = this.mView;
            if (t instanceof AndroidText) {
                ((AndroidText) t).setOverflow(getOverflow());
            }
        }
        TraceEvent.b(0, str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAnimatedNodeReady() {
        com.lynx.tasm.a.c.a aVar;
        LynxBaseUI lynxBaseUI;
        updatePerspectiveToView();
        if (shouldDoTransform()) {
            a aVar2 = this.mBackgroundManager;
            g gVar = this.mTransformOrigin;
            LynxUI lynxUI = aVar2.f56392a.get();
            if (!(lynxUI == null || gVar == null)) {
                h a2 = h.a(gVar, (float) lynxUI.getLatestWidth(), (float) lynxUI.getLatestHeight());
                lynxUI.mView.setPivotX(a2.f56428b);
                lynxUI.mView.setPivotY(a2.f56429c);
                lynxUI.mView.invalidate();
            }
            if (shouldDoTransformTransition()) {
                com.lynx.tasm.a.c.a aVar3 = this.mTransitionAnimator;
                if (aVar3.s != null) {
                    lynxBaseUI = aVar3.s;
                } else {
                    lynxBaseUI = this;
                }
                aVar3.a(lynxBaseUI, 4096, lynxBaseUI.mTransformRaw);
            } else {
                this.mBackgroundManager.a(this.mTransformRaw);
            }
        }
        if (!this.mIsFirstAnimatedReady && (aVar = this.mTransitionAnimator) != null && !aVar.t.isEmpty() && (aVar.u == null || !aVar.t.equals(aVar.u.getChildAnimations()))) {
            aVar.u = new AnimatorSet();
            aVar.u.playTogether(aVar.t);
            aVar.u.start();
        }
        com.lynx.tasm.a.a.a aVar4 = this.mKeyframeManager;
        if (aVar4 != null) {
            aVar4.a();
        }
        super.onAnimatedNodeReady();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        com.lynx.tasm.a.a.a aVar = this.mKeyframeManager;
        if (!(aVar == null || aVar.f55599b == null)) {
            for (com.lynx.tasm.a.a.c cVar : aVar.f55599b.values()) {
                if (cVar.f55606c != null) {
                    ObjectAnimator[] objectAnimatorArr = cVar.f55606c;
                    for (ObjectAnimator objectAnimator : objectAnimatorArr) {
                        objectAnimator.removeAllListeners();
                    }
                }
            }
        }
        c cVar2 = this.mLayoutAnimator;
        if (!(cVar2 == null || cVar2.f55647a == null || cVar2.f55647a.get() == null)) {
            cVar2.f55647a.get().updateLayout(cVar2.f55648b, cVar2.f55649c, cVar2.f55650d, cVar2.f55651e, cVar2.f55652f, cVar2.f55653g, cVar2.f55654h, cVar2.f55655i, cVar2.n, cVar2.o, cVar2.p, cVar2.q, cVar2.f55656j, cVar2.f55657k, cVar2.f55658l, cVar2.f55659m, cVar2.r);
        }
    }

    public void updatePerspectiveToView() {
        float f2;
        float f3;
        float f4;
        int height;
        double d2;
        double d3;
        double height2;
        float f5 = this.mContext.p.density;
        if (this.mPerspective == null || this.mPerspective.size() <= 1 || this.mPerspective.getInt(1) == 3) {
            if (getWidth() > getHeight()) {
                height = getWidth();
            } else {
                height = getHeight();
            }
            f2 = ((float) height) * f5 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            f3 = 100.0f;
            f4 = f3 * f2;
        } else if (this.mPerspective.getInt(1) == 0) {
            double d4 = this.mPerspective.getDouble(0);
            double d5 = (double) f5;
            Double.isNaN(d5);
            Double.isNaN(d5);
            double d6 = d4 * d5 * d5;
            double d7 = (double) CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            Double.isNaN(d7);
            f4 = (float) (d6 * d7);
        } else {
            if (this.mPerspective.getInt(1) == 1) {
                d3 = this.mPerspective.getDouble(0) / 100.0d;
                height2 = (double) this.mContext.b().getWidth();
                Double.isNaN(height2);
            } else if (this.mPerspective.getInt(1) == 2) {
                d3 = this.mPerspective.getDouble(0) / 100.0d;
                height2 = (double) this.mContext.b().getHeight();
                Double.isNaN(height2);
            } else {
                d2 = this.mPerspective.getDouble(0);
                f2 = ((float) d2) * f5;
                f3 = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                f4 = f3 * f2;
            }
            d2 = d3 * height2;
            f2 = ((float) d2) * f5;
            f3 = CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            f4 = f3 * f2;
        }
        this.mView.setCameraDistance(f4);
    }

    public LynxUI(Context context) {
        this((j) context);
    }

    public void setEnterAnim(com.lynx.tasm.a.b bVar) {
        this.mHeroAnimOwner.f55788e = bVar;
    }

    public void setExitAnim(com.lynx.tasm.a.b bVar) {
        this.mHeroAnimOwner.f55789f = bVar;
    }

    public void setPauseAnim(com.lynx.tasm.a.b bVar) {
        this.mHeroAnimOwner.f55790g = bVar;
    }

    public void setResumeAnim(com.lynx.tasm.a.b bVar) {
        this.mHeroAnimOwner.f55791h = bVar;
    }

    @m(a = "shared-element")
    public void setShareElement(String str) {
        this.mHeroAnimOwner.a(str);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "lynx-test-tag")
    public void setTestID(String str) {
        this.mView.setTag(str);
    }

    public LynxUI(j jVar) {
        this(jVar, null);
    }

    public void setAnimation(com.lynx.tasm.a.b bVar) {
        prepareKeyframeManager();
        com.lynx.tasm.a.b[] bVarArr = {bVar};
        this.mKeyframeManager.f55598a = bVarArr;
    }

    @m(a = "enter-transition-name")
    public void setEnterTransitionName(ReadableArray readableArray) {
        com.lynx.tasm.a.b a2 = com.lynx.tasm.a.b.a(readableArray);
        if (a2 != null) {
            b.a.f55815a.a(this, a2);
        }
    }

    @m(a = "exit-transition-name")
    public void setExitTransitionName(ReadableArray readableArray) {
        com.lynx.tasm.a.b a2 = com.lynx.tasm.a.b.a(readableArray);
        if (a2 != null) {
            b.a.f55815a.b(this, a2);
        }
    }

    @m(a = "layout-animation-create-delay")
    public void setLayoutAnimationCreateDelay(double d2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.b().a((long) d2);
    }

    @m(a = "layout-animation-create-duration")
    public void setLayoutAnimationCreateDuration(double d2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.b().b((long) d2);
    }

    @m(a = "layout-animation-create-property")
    public void setLayoutAnimationCreateProperty(int i2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.b().a(i2);
    }

    @m(a = "layout-animation-create-timing-function")
    public void setLayoutAnimationCreateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.b().a(readableArray);
    }

    @m(a = "layout-animation-delete-delay")
    public void setLayoutAnimationDeleteDelay(double d2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.d().a((long) d2);
    }

    @m(a = "layout-animation-delete-duration")
    public void setLayoutAnimationDeleteDuration(double d2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.d().b((long) d2);
    }

    @m(a = "layout-animation-delete-property")
    public void setLayoutAnimationDeleteProperty(int i2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.d().a(i2);
    }

    @m(a = "layout-animation-delete-timing-function")
    public void setLayoutAnimationDeleteTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.d().a(readableArray);
    }

    @m(a = "layout-animation-update-delay")
    public void setLayoutAnimationUpdateDelay(double d2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.c().a((long) d2);
    }

    @m(a = "layout-animation-update-duration")
    public void setLayoutAnimationUpdateDuration(double d2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.c().b((long) d2);
    }

    @m(a = "layout-animation-update-property")
    public void setLayoutAnimationUpdateProperty(int i2) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.c().a(i2);
    }

    @m(a = "layout-animation-update-timing-function")
    public void setLayoutAnimationUpdateTimingFunc(ReadableArray readableArray) {
        prepareLayoutAnimator();
        this.mLayoutAnimator.c().a(readableArray);
    }

    @m(a = "overlap")
    public void setOverlap(String str) {
        this.mOverlappingRendering = !TextUtils.equals(str, "false");
    }

    @m(a = "pause-transition-name")
    public void setPauseTransitionName(ReadableArray readableArray) {
        com.lynx.tasm.a.b a2 = com.lynx.tasm.a.b.a(readableArray);
        if (a2 != null) {
            b.a.f55815a.d(this, a2);
        }
    }

    @m(a = "resume-transition-name")
    public void setResumeTransitionName(ReadableArray readableArray) {
        com.lynx.tasm.a.b a2 = com.lynx.tasm.a.b.a(readableArray);
        if (a2 != null) {
            b.a.f55815a.c(this, a2);
        }
    }

    public ReadableMap getKeyframes(String str) {
        if (this.mContext != null) {
            j jVar = this.mContext;
            if (jVar.f55895c != null && jVar.f55895c.hasKey(str)) {
                return jVar.f55895c.getMap(str);
            }
        }
        return null;
    }

    public void onAnimationEnd(String str) {
        com.lynx.tasm.behavior.b.a aVar = this.mHeroAnimOwner;
        c.AbstractC1256c cVar = aVar.f55795l.get(str);
        if (cVar != null) {
            cVar.a(str);
            aVar.f55795l.remove(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "accessibility-label")
    public void setAccessibilityLabel(com.lynx.react.bridge.a aVar) {
        super.setAccessibilityLabel(aVar);
        T t = this.mView;
        if (t != null) {
            t.setFocusable(true);
            this.mView.setContentDescription(getAccessibilityLabel());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "transform")
    public void setTransform(ReadableArray readableArray) {
        super.setTransform(readableArray);
        if (getKeyframeManager() != null) {
            getKeyframeManager().a("Transform", this.mTransformRaw);
        }
    }

    public void setVisibilityForView(int i2) {
        if (i2 == 0) {
            this.mSetVisibleByCSS = true;
            this.mView.setVisibility(0);
        } else if (i2 == 4) {
            this.mSetVisibleByCSS = false;
            this.mView.setVisibility(4);
        }
    }

    @m(a = "opacity", d = 1.0f)
    public void setAlpha(float f2) {
        if (getKeyframeManager() != null) {
            getKeyframeManager().a("Alpha", Float.valueOf(f2));
        }
        com.lynx.tasm.a.c.a aVar = this.mTransitionAnimator;
        if (aVar == null || !aVar.a(1)) {
            if (f2 != this.mView.getAlpha()) {
                this.mView.setAlpha(f2);
            }
            com.lynx.tasm.a.b.c cVar = this.mLayoutAnimator;
            if (cVar != null) {
                cVar.w = f2;
                return;
            }
            return;
        }
        this.mTransitionAnimator.a(this, 1, Float.valueOf(f2));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setAnimation(ReadableArray readableArray) {
        prepareKeyframeManager();
        if (readableArray == null) {
            this.mKeyframeManager.b();
            return;
        }
        int size = readableArray.size();
        com.lynx.tasm.a.b[] bVarArr = new com.lynx.tasm.a.b[size];
        for (int i2 = 0; i2 < size; i2++) {
            bVarArr[i2] = com.lynx.tasm.a.b.a(readableArray.getArray(i2));
        }
        this.mKeyframeManager.f55598a = bVarArr;
    }

    @m(a = "filter")
    public void setFilter(float f2) {
        if (this.mView != null) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(1.0f - f2);
            Paint paint = new Paint(1);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.mView.setLayerType(2, paint);
        }
    }

    @m(a = "z-index")
    public void setZIndex(int i2) {
        if (ENABLE_ZINDEX && this.mZIndex != i2) {
            this.mZIndex = i2;
            if (!this.mContext.q) {
                UIGroup.setViewZIndex(this.mView, i2);
                LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mParent;
                if (lynxBaseUI instanceof UIGroup) {
                    ((UIGroup) lynxBaseUI).updateDrawingOrder();
                }
            }
        }
    }

    public void updateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = getWidth();
            layoutParams.height = getHeight();
            if (layoutParams != this.mView.getLayoutParams()) {
                this.mView.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        throw new RuntimeException("LayoutPrams should not be null");
    }

    public void execExitAnim(b.c cVar) {
        com.lynx.tasm.behavior.b.a aVar = this.mHeroAnimOwner;
        if (b.a.f55815a.f55807f && !aVar.a() && aVar.f55789f != null) {
            aVar.f55795l.put(aVar.f55789f.f55633a, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  
                  (wrap: java.util.HashMap<java.lang.String, com.lynx.tasm.a.a.c$c> : 0x0017: IGET  (r1v0 java.util.HashMap<java.lang.String, com.lynx.tasm.a.a.c$c>) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) com.lynx.tasm.behavior.b.a.l java.util.HashMap)
                  (wrap: java.lang.String : 0x0015: IGET  (r2v0 java.lang.String) = 
                  (wrap: com.lynx.tasm.a.b : 0x0013: IGET  (r0v4 com.lynx.tasm.a.b) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) com.lynx.tasm.behavior.b.a.f com.lynx.tasm.a.b)
                 com.lynx.tasm.a.b.a java.lang.String)
                  (wrap: com.lynx.tasm.behavior.b.a$3 : 0x001b: CONSTRUCTOR  (r0v5 com.lynx.tasm.behavior.b.a$3) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a), (r6v0 'cVar' com.lynx.tasm.behavior.b.b$c) call: com.lynx.tasm.behavior.b.a.3.<init>(com.lynx.tasm.behavior.b.a, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR)
                 type: VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object in method: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001b: CONSTRUCTOR  (r0v5 com.lynx.tasm.behavior.b.a$3) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a), (r6v0 'cVar' com.lynx.tasm.behavior.b.b$c) call: com.lynx.tasm.behavior.b.a.3.<init>(com.lynx.tasm.behavior.b.a, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR in method: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void");
        }

        @m(a = "visibility", e = 1)
        public void setVisibility(int i2) {
            com.lynx.tasm.a.c.a aVar = this.mTransitionAnimator;
            if (aVar == null || !aVar.a(128)) {
                int visibility = this.mView.getVisibility();
                if (i2 == 1) {
                    this.mSetVisibleByCSS = true;
                    this.mView.setVisibility(0);
                    visibility = 0;
                } else if (i2 == 0) {
                    this.mSetVisibleByCSS = false;
                    this.mView.setVisibility(4);
                    visibility = 4;
                }
                if (this.mParent instanceof UIShadowProxy) {
                    ((LynxUI) this.mParent).setVisibilityForView(visibility);
                    return;
                }
                return;
            }
            this.mTransitionAnimator.a(this, 128, Integer.valueOf(i2));
        }

        @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
        public void initTransitionAnimator(ReadableMap readableMap) {
            com.lynx.tasm.a.c.a aVar = this.mTransitionAnimator;
            if (aVar != null) {
                aVar.a(readableMap);
            }
            com.lynx.tasm.a.c.a aVar2 = new com.lynx.tasm.a.c.a(getTransitionUI());
            this.mTransitionAnimator = aVar2;
            if (readableMap != null) {
                ReadableArray array = readableMap.getArray("transition");
                if (array == null) {
                    aVar2.a();
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= array.size()) {
                            break;
                        }
                        ReadableArray array2 = array.getArray(i2);
                        int i3 = array2.getInt(0);
                        com.lynx.tasm.a.b bVar = new com.lynx.tasm.a.b();
                        bVar.f55636d = i3;
                        bVar.f55634b = (long) array2.getDouble(1);
                        bVar.f55635c = (long) array2.getDouble(bVar.a(array2, 2));
                        if (bVar.f55636d == 8177) {
                            aVar2.v.clear();
                            int[] iArr = com.lynx.tasm.a.a.f55597a;
                            for (int i4 : iArr) {
                                com.lynx.tasm.a.b bVar2 = new com.lynx.tasm.a.b(bVar);
                                bVar2.f55636d = i4;
                                aVar2.v.put(bVar2.f55636d, bVar2);
                            }
                        } else {
                            aVar2.v.put(bVar.f55636d, bVar);
                            i2++;
                        }
                    }
                    if (aVar2.v.size() != 0) {
                        return;
                    }
                }
            }
            this.mTransitionAnimator = null;
        }

        @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
        public void setTransitionData(float[] fArr) {
            com.lynx.tasm.a.c.a aVar = this.mTransitionAnimator;
            if (aVar != null) {
                aVar.a((ReadableMap) null);
            }
            com.lynx.tasm.a.c.a aVar2 = new com.lynx.tasm.a.c.a(getTransitionUI());
            this.mTransitionAnimator = aVar2;
            if (fArr == null || fArr.length == 0) {
                aVar2.a();
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= fArr.length / 9) {
                        break;
                    }
                    com.lynx.tasm.a.b bVar = new com.lynx.tasm.a.b();
                    int i3 = i2 * 9;
                    bVar.f55634b = (long) fArr[i3];
                    bVar.f55635c = (long) fArr[i3 + 1];
                    bVar.f55636d = (int) fArr[i3 + 2];
                    bVar.a((int) fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5], fArr[i3 + 6], fArr[i3 + 7], (int) fArr[i3 + 8]);
                    if (bVar.f55636d == 8177) {
                        aVar2.v.clear();
                        int[] iArr = com.lynx.tasm.a.a.f55597a;
                        for (int i4 : iArr) {
                            com.lynx.tasm.a.b bVar2 = new com.lynx.tasm.a.b(bVar);
                            bVar2.f55636d = i4;
                            aVar2.v.put(bVar2.f55636d, bVar2);
                        }
                    } else {
                        aVar2.v.put(bVar.f55636d, bVar);
                        i2++;
                    }
                }
                if (aVar2.v.size() != 0) {
                    return;
                }
            }
            this.mTransitionAnimator = null;
        }

        @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
        public void updateAttributes(v vVar) {
            ReadableMap readableMap = vVar.f56468a;
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                try {
                    switch (nextKey.hashCode()) {
                        case -1970593579:
                            if (!nextKey.equals("lynx-test-tag")) {
                                break;
                            } else {
                                setTestID(readableMap.getString(nextKey));
                                break;
                            }
                        case -1091287993:
                            if (!nextKey.equals("overlap")) {
                                break;
                            } else {
                                setOverlap(readableMap.getString(nextKey));
                                break;
                            }
                        case -1087342188:
                            if (!nextKey.equals("shared-element")) {
                                break;
                            } else {
                                setShareElement(readableMap.getString(nextKey));
                                break;
                            }
                        case 315007413:
                            if (!nextKey.equals("accessibility-label")) {
                                break;
                            } else {
                                setAccessibilityLabel(readableMap.getDynamic(nextKey));
                                break;
                            }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    throw new RuntimeException("setProperty error: " + nextKey + "\n" + e2.toString());
                }
            }
            super.updateAttributes(vVar);
        }

        public void execEnterAnim(b.AbstractC1259b bVar) {
            com.lynx.tasm.behavior.b.a aVar = this.mHeroAnimOwner;
            if (b.a.f55815a.f55807f && !aVar.a() && aVar.f55788e != null) {
                if (aVar.f55792i != null) {
                    aVar.f55793j = true;
                    View a2 = b.a.f55815a.a(aVar.f55792i, aVar.f55784a);
                    UIBody.a aVar2 = aVar.f55784a.mContext.f55901i.f56067a;
                    if (aVar2 != null) {
                        T t = aVar.f55784a.mView;
                        if (a2 != null) {
                            t.setVisibility(a2.getVisibility());
                            t.setAlpha(a2.getAlpha());
                            t.setTranslationX(a2.getTranslationX());
                            t.setTranslationY(a2.getTranslationY());
                            t.setRotation(a2.getRotation());
                            t.setRotationX(a2.getRotationX());
                            t.setRotationY(a2.getRotationY());
                            t.setScaleX(a2.getScaleX());
                            t.setScaleY(a2.getScaleY());
                            int width = a2.getWidth();
                            int height = a2.getHeight();
                            if (aVar2.getRootView() instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) aVar2.getRootView();
                                if (t.getParent() != null) {
                                    aVar.f55786c = (ViewGroup) t.getParent();
                                    int childCount = aVar.f55786c.getChildCount();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= childCount) {
                                            break;
                                        } else if (t == aVar.f55786c.getChildAt(i2)) {
                                            aVar.f55785b = i2;
                                            break;
                                        } else {
                                            i2++;
                                        }
                                    }
                                    aVar.f55786c.removeView(t);
                                    aVar.f55787d = (UIGroup) aVar.f55784a.mParent;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(width, height);
                                int[] iArr = new int[2];
                                a2.getLocationInWindow(iArr);
                                marginLayoutParams.setMargins(iArr[0], iArr[1], 0, 0);
                                viewGroup.addView(t, marginLayoutParams);
                                com.lynx.tasm.utils.m.a(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00d2: INVOKE  
                                      (wrap: com.lynx.tasm.behavior.b.a$1 : 0x00cf: CONSTRUCTOR  (r0v33 com.lynx.tasm.behavior.b.a$1) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) call: com.lynx.tasm.behavior.b.a.1.<init>(com.lynx.tasm.behavior.b.a):void type: CONSTRUCTOR)
                                     type: STATIC call: com.lynx.tasm.utils.m.a(java.lang.Runnable):void in method: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00cf: CONSTRUCTOR  (r0v33 com.lynx.tasm.behavior.b.a$1) = (r3v0 'aVar' com.lynx.tasm.behavior.b.a) call: com.lynx.tasm.behavior.b.a.1.<init>(com.lynx.tasm.behavior.b.a):void type: CONSTRUCTOR in method: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void, file: classes.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 43 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.a, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 49 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 266
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxUI.execEnterAnim(com.lynx.tasm.behavior.b.b$b):void");
                            }

                            @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
                            public void setSign(int i2, String str) {
                                super.setSign(i2, str);
                            }

                            public LynxUI(j jVar, Object obj) {
                                super(jVar, obj);
                                this.mSetVisibleByCSS = true;
                                this.mOverlappingRendering = true;
                                this.mViewChildren = new ArrayList();
                            }

                            @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
                            public boolean checkStickyOnParentScroll(int i2, int i3) {
                                PointF pointF;
                                boolean checkStickyOnParentScroll = super.checkStickyOnParentScroll(i2, i3);
                                if (this.mSticky != null) {
                                    pointF = new PointF(this.mSticky.f56060a, this.mSticky.f56061b);
                                } else {
                                    pointF = null;
                                }
                                a aVar = this.mBackgroundManager;
                                aVar.f56393b = pointF;
                                aVar.b();
                                return checkStickyOnParentScroll;
                            }

                            public void insertDrawList(LynxBaseUI lynxBaseUI, LynxBaseUI lynxBaseUI2) {
                                lynxBaseUI2.mDrawParent = this;
                                if (lynxBaseUI == null) {
                                    LynxBaseUI lynxBaseUI3 = this.mDrawHead;
                                    if (lynxBaseUI3 != null) {
                                        lynxBaseUI3.mPreviousDrawUI = lynxBaseUI2;
                                        lynxBaseUI2.mNextDrawUI = this.mDrawHead;
                                    }
                                    this.mDrawHead = lynxBaseUI2;
                                    return;
                                }
                                LynxBaseUI lynxBaseUI4 = lynxBaseUI.mNextDrawUI;
                                if (lynxBaseUI4 != null) {
                                    lynxBaseUI4.mPreviousDrawUI = lynxBaseUI2;
                                    lynxBaseUI2.mNextDrawUI = lynxBaseUI4;
                                }
                                lynxBaseUI2.mPreviousDrawUI = lynxBaseUI;
                                lynxBaseUI.mNextDrawUI = lynxBaseUI2;
                            }

                            @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.a.a
                            public void onFocusChanged(boolean z, boolean z2) {
                                if (!z2) {
                                    LynxEnv b2 = LynxEnv.b();
                                    if (b2.r == null) {
                                        b2.r = (InputMethodManager) LynxEnv.a(b2.f55531a, "input_method");
                                    }
                                    InputMethodManager inputMethodManager = b2.r;
                                    if (inputMethodManager == null) {
                                        LLog.a(5, "LynxUI", "Failed to get InputMethodManager");
                                    } else if (z) {
                                        inputMethodManager.showSoftInput(this.mView, 1);
                                    } else {
                                        inputMethodManager.hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                                    }
                                }
                            }

                            @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
                            public void setAnimationData(String[] strArr, float[] fArr) {
                                prepareKeyframeManager();
                                if (!(strArr.length == 0 || fArr.length == 0)) {
                                    if (strArr[0] != null && !com.lynx.tasm.utils.c.a(fArr[0], 0.0f)) {
                                        com.lynx.tasm.a.b[] bVarArr = new com.lynx.tasm.a.b[strArr.length];
                                        for (int i2 = 0; i2 < strArr.length; i2++) {
                                            com.lynx.tasm.a.b bVar = new com.lynx.tasm.a.b();
                                            bVar.f55633a = strArr[i2];
                                            int i3 = i2 * 12;
                                            bVar.f55634b = (long) fArr[i3];
                                            bVar.f55635c = (long) fArr[i3 + 1];
                                            bVar.a((int) fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5], fArr[i3 + 6], (int) fArr[i3 + 7]);
                                            bVar.f55643k = ((int) fArr[i3 + 8]) - 1;
                                            bVar.f55644l = (int) fArr[i3 + 9];
                                            bVar.f55645m = (int) fArr[i3 + 10];
                                            bVar.n = (int) fArr[i3 + 11];
                                            bVarArr[i2] = bVar;
                                        }
                                        this.mKeyframeManager.f55598a = bVarArr;
                                        return;
                                    }
                                }
                                this.mKeyframeManager.b();
                            }

                            @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
                            public void setTransformData(float f2, float f3, int[] iArr, float[] fArr) {
                                super.setTransformData(f2, f3, iArr, fArr);
                                if (getKeyframeManager() != null) {
                                    getKeyframeManager().a("Transform", this.mTransformRaw);
                                }
                            }

                            public void setLayoutAnimationTimingFunc(int i2, int i3, float f2, float f3, float f4, float f5, int i4) {
                                prepareLayoutAnimator();
                                if (i2 == 0) {
                                    this.mLayoutAnimator.b().a(i3, f2, f3, f4, f5, i4);
                                } else if (i2 == 1) {
                                    this.mLayoutAnimator.c().a(i3, f2, f3, f4, f5, i4);
                                } else if (i2 == 2) {
                                    this.mLayoutAnimator.d().a(i3, f2, f3, f4, f5, i4);
                                }
                            }

                            @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
                            public void setLayoutAnimationData(int i2, long j2, long j3, int i3, int i4, float f2, float f3, float f4, float f5, int i5) {
                                prepareLayoutAnimator();
                                if (i2 == 0) {
                                    setLayoutAnimationCreateDuration((double) j2);
                                    setLayoutAnimationCreateDelay((double) j3);
                                    setLayoutAnimationCreateProperty(i3);
                                } else if (i2 == 1) {
                                    setLayoutAnimationUpdateDuration((double) j2);
                                    setLayoutAnimationUpdateDelay((double) j3);
                                    setLayoutAnimationUpdateProperty(i3);
                                } else if (i2 == 2) {
                                    setLayoutAnimationDeleteDuration((double) j2);
                                    setLayoutAnimationDeleteDelay((double) j3);
                                    setLayoutAnimationDeleteProperty(i3);
                                }
                                setLayoutAnimationTimingFunc(i2, i4, f2, f3, f4, f5, i5);
                            }
                        }
