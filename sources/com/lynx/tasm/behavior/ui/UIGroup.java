package com.lynx.tasm.behavior.ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.a;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public abstract class UIGroup<T extends ViewGroup> extends LynxUI<T> implements a, d {
    private static final float[] mEventCoords = new float[2];
    private static final Matrix mInverseMatrix = new Matrix();
    private static final float[] mMatrixTransformCoords = new float[2];
    private static final PointF mTempPoint = new PointF();
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();
    private int mCurrentDrawIndex;
    private LynxBaseUI mCurrentDrawUI;
    private e mDrawingOrderHelper;
    public boolean mIsInsertViewCalled;
    private Rect mOverflowClipRect;

    @Override // com.lynx.tasm.behavior.ui.a
    public void afterDrawChild(Canvas canvas, View view, long j2) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean needCustomLayout() {
        return false;
    }

    /* access modifiers changed from: protected */
    public View getRealParentView() {
        return this.mView;
    }

    @Override // com.lynx.tasm.behavior.ui.a
    public boolean hasOverlappingRendering() {
        return this.mOverlappingRendering;
    }

    public int getChildCount() {
        return this.mChildren.size();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
        dispatchOnAttach();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        dispatchOnDetach();
    }

    public void updateLynxUIChildrenOrder() {
        Collections.sort(this.mViewChildren, new Comparator<LynxUI>() {
            /* class com.lynx.tasm.behavior.ui.UIGroup.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35040);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(LynxUI lynxUI, LynxUI lynxUI2) {
                LynxUI lynxUI3 = lynxUI;
                LynxUI lynxUI4 = lynxUI2;
                if (lynxUI3.getZIndex() < lynxUI4.getZIndex()) {
                    return -1;
                }
                if (lynxUI3.getZIndex() == lynxUI4.getZIndex()) {
                    return 0;
                }
                return 1;
            }
        });
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void buildLynxUITree() {
        if (!this.mViewChildren.isEmpty()) {
            this.mViewChildren.removeAll(this.mViewChildren.subList(0, this.mViewChildren.size()));
        }
        super.buildLynxUITree();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.destroy();
        }
    }

    public void dispatchOnAttach() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.onAttach();
        }
    }

    public void dispatchOnDetach() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.onDetach();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void initialize() {
        super.initialize();
        this.mDrawingOrderHelper = new e((ViewGroup) this.mView);
        if (this.mView instanceof a.AbstractC1260a) {
            ((a.AbstractC1260a) this.mView).bindDrawChildHook(this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void layout() {
        if (((ViewGroup) this.mView).isLayoutRequested()) {
            super.layout();
            layoutChildren();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void measure() {
        if (((ViewGroup) this.mView).isLayoutRequested()) {
            measureChildren();
            super.measure();
        }
    }

    static {
        Covode.recordClassIndex(35037);
    }

    public void measureChildren() {
        if (this.mContext.q) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                lynxBaseUI.measure();
            }
            return;
        }
        for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
            lynxBaseUI2.measure();
        }
    }

    public void removeAll() {
        if (this.mContext.r) {
            for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
                lynxBaseUI.mDrawParent = null;
            }
            this.mDrawHead = null;
        }
        for (LynxBaseUI lynxBaseUI2 : this.mChildren) {
            lynxBaseUI2.setParent(null);
        }
        this.mChildren.clear();
        if (this.mView != null) {
            ((ViewGroup) this.mView).removeAllViews();
        }
    }

    public void updateDrawingOrder() {
        e eVar = this.mDrawingOrderHelper;
        eVar.f56152b = 0;
        for (int i2 = 0; i2 < eVar.f56151a.getChildCount(); i2++) {
            if (getViewZIndex(eVar.f56151a.getChildAt(i2)) != null) {
                eVar.f56152b++;
            }
        }
        eVar.f56153c = null;
        setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.a());
        invalidate();
    }

    public void buildOrUpdateViewTree() {
        if (this.mView != null) {
            updateLynxUIChildrenOrder();
            if (this.mShouldAttachChildrenView) {
                ((ViewGroup) this.mView).removeAllViews();
            }
            for (LynxUI lynxUI : this.mViewChildren) {
                if (this.mShouldAttachChildrenView) {
                    if (lynxUI.mCSSPosition == 2) {
                        ((UIBody.a) this.mContext.f55901i.mView).addView(lynxUI.mView);
                    } else {
                        ((ViewGroup) this.mView).addView(lynxUI.mView);
                    }
                }
                if (lynxUI instanceof UIGroup) {
                    ((UIGroup) lynxUI).buildOrUpdateViewTree();
                }
            }
            ((ViewGroup) this.mView).invalidate();
        }
    }

    public void layoutChildren() {
        if (this.mContext.q) {
            for (LynxBaseUI lynxBaseUI : this.mChildren) {
                if (!needCustomLayout()) {
                    lynxBaseUI.layout();
                } else if (!lynxBaseUI.isFlatten()) {
                    ((UIGroup) lynxBaseUI).layoutChildren();
                }
            }
            return;
        }
        for (int i2 = 0; i2 < this.mChildren.size(); i2++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.mChildren.get(i2);
            if (!needCustomLayout()) {
                if (!lynxBaseUI2.isFlatten()) {
                    lynxBaseUI2.layout();
                } else if (lynxBaseUI2.isFlatten() && this.mContext.r) {
                    ((LynxFlattenUI) lynxBaseUI2).a(lynxBaseUI2.getOriginLeft(), lynxBaseUI2.getOriginTop(), null);
                }
            } else if (lynxBaseUI2 instanceof UIGroup) {
                ((UIGroup) lynxBaseUI2).layoutChildren();
            }
        }
    }

    public UIGroup(j jVar) {
        this(jVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public LynxBaseUI getChildAt(int i2) {
        return (LynxBaseUI) this.mChildren.get(i2);
    }

    public boolean onRemoveChild(LynxBaseUI lynxBaseUI) {
        if (!this.mChildren.remove(lynxBaseUI)) {
            return false;
        }
        lynxBaseUI.setParent(null);
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void removeChild(LynxBaseUI lynxBaseUI) {
        if (onRemoveChild(lynxBaseUI)) {
            removeView(lynxBaseUI);
        }
    }

    private void setChildrenDrawingOrderEnabledHelper(boolean z) {
        if (this.mView instanceof com.lynx.tasm.behavior.ui.view.a) {
            ((com.lynx.tasm.behavior.ui.view.a) this.mView).setChildrenDrawingOrderEnabled(z);
        } else if (this.mView instanceof UIBody.a) {
            ((UIBody.a) this.mView).setChildrenDrawingOrderEnabled(z);
        }
    }

    private void onRemoveChildUI(LynxUI lynxUI) {
        if (ENABLE_ZINDEX) {
            e eVar = this.mDrawingOrderHelper;
            if (getViewZIndex(lynxUI.mView) != null) {
                eVar.f56152b--;
            }
            eVar.f56153c = null;
            setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.a());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.a
    public void afterDispatchDraw(Canvas canvas) {
        if (this.mContext.r) {
            for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
                if (lynxBaseUI.isFlatten() && !(lynxBaseUI instanceof UIShadowProxy)) {
                    drawChild((LynxFlattenUI) lynxBaseUI, canvas);
                }
            }
            return;
        }
        for (int i2 = this.mCurrentDrawIndex; i2 < this.mChildren.size(); i2++) {
            LynxBaseUI lynxBaseUI2 = (LynxBaseUI) this.mChildren.get(i2);
            if (lynxBaseUI2 instanceof LynxFlattenUI) {
                drawChild((LynxFlattenUI) lynxBaseUI2, canvas);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.a
    public void beforeDispatchDraw(Canvas canvas) {
        BackgroundDrawable backgroundDrawable;
        Path path;
        this.mCurrentDrawUI = this.mDrawHead;
        this.mCurrentDrawIndex = 0;
        if (!(!this.mClipToRadius || this.mLynxBackground == null || (backgroundDrawable = this.mLynxBackground.f56412e) == null || !(backgroundDrawable instanceof BackgroundDrawable) || backgroundDrawable.f56372g == null || !backgroundDrawable.a() || backgroundDrawable.f56368c == null || (path = backgroundDrawable.f56368c.f56384c) == null)) {
            canvas.clipPath(path);
        }
        int i2 = Build.VERSION.SDK_INT;
    }

    public void removeView(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            LynxUI lynxUI = (LynxUI) lynxBaseUI;
            ((ViewGroup) this.mView).removeView(lynxUI.mView);
            if (lynxBaseUI instanceof UIList) {
                ((ViewGroup) this.mView).removeView(((UIList) lynxBaseUI).f56166g);
            }
            onRemoveChildUI(lynxUI);
            return;
        }
        invalidate();
    }

    public void insertView(LynxUI lynxUI) {
        int i2 = -1;
        if (!this.mContext.r) {
            for (Object obj : this.mChildren) {
                if (obj instanceof LynxUI) {
                    i2++;
                    continue;
                }
                if (obj == lynxUI) {
                    break;
                }
            }
        } else {
            for (LynxBaseUI lynxBaseUI = this.mDrawHead; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
                if (lynxBaseUI instanceof LynxUI) {
                    i2++;
                }
                if (lynxBaseUI == lynxUI) {
                    break;
                }
            }
        }
        if (lynxUI.mView.getParent() != null && (lynxUI.mView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) lynxUI.mView.getParent()).removeView(lynxUI.mView);
            onRemoveChildUI(lynxUI);
        }
        ((ViewGroup) this.mView).addView(lynxUI.mView, i2);
        onAddChildUI(lynxUI, i2);
    }

    public static void setViewZIndex(View view, int i2) {
        mZIndexHash.put(view, Integer.valueOf(i2));
    }

    public void onInsertChild(LynxBaseUI lynxBaseUI, int i2) {
        this.mChildren.add(i2, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    public UIGroup(j jVar, Object obj) {
        super(jVar, obj);
        this.mCurrentDrawUI = this.mDrawHead;
        this.mOverflowClipRect = new Rect();
        this.mIsInsertViewCalled = false;
    }

    public void drawChild(LynxFlattenUI lynxFlattenUI, Canvas canvas) {
        Rect bound = lynxFlattenUI.getBound();
        if (bound == null) {
            lynxFlattenUI.a(canvas);
            return;
        }
        canvas.save();
        canvas.clipRect(bound);
        lynxFlattenUI.a(canvas);
        canvas.restore();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        onInsertChild(lynxBaseUI, i2);
        if (!this.mContext.r && (lynxBaseUI instanceof LynxUI)) {
            insertView((LynxUI) lynxBaseUI);
        }
        this.mIsInsertViewCalled = true;
    }

    private void onAddChildUI(LynxUI lynxUI, int i2) {
        if (ENABLE_ZINDEX) {
            e eVar = this.mDrawingOrderHelper;
            if (getViewZIndex(lynxUI.mView) != null) {
                eVar.f56152b++;
            }
            eVar.f56153c = null;
            setChildrenDrawingOrderEnabledHelper(this.mDrawingOrderHelper.a());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.a
    public int getChildDrawingOrder(int i2, int i3) {
        e eVar = this.mDrawingOrderHelper;
        if (eVar == null) {
            return i3;
        }
        if (eVar.f56153c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(eVar.f56151a.getChildAt(i4));
            }
            Collections.sort(arrayList, new Comparator<View>() {
                /* class com.lynx.tasm.behavior.ui.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35095);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(View view, View view2) {
                    View view3 = view2;
                    Integer viewZIndex = UIGroup.getViewZIndex(view);
                    Integer num = 0;
                    if (viewZIndex == null) {
                        viewZIndex = num;
                    }
                    Integer viewZIndex2 = UIGroup.getViewZIndex(view3);
                    if (viewZIndex2 != null) {
                        num = viewZIndex2;
                    }
                    return viewZIndex.intValue() - num.intValue();
                }
            });
            eVar.f56153c = new int[i2];
            for (int i5 = 0; i5 < i2; i5++) {
                eVar.f56153c[i5] = eVar.f56151a.indexOfChild((View) arrayList.get(i5));
            }
        }
        return eVar.f56153c[i3];
    }

    private Rect drawFlattenUIBefore(Canvas canvas, View view, long j2) {
        for (LynxBaseUI lynxBaseUI = this.mCurrentDrawUI; lynxBaseUI != null; lynxBaseUI = lynxBaseUI.mNextDrawUI) {
            if (!lynxBaseUI.isFlatten()) {
                if (((LynxUI) lynxBaseUI).mView == view) {
                    Rect bound = lynxBaseUI.getBound();
                    this.mCurrentDrawUI = lynxBaseUI.mNextDrawUI;
                    return bound;
                }
            } else if (lynxBaseUI.isFlatten()) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
            }
        }
        return null;
    }

    private static LynxUI findTouchTargetOnViewChian(float[] fArr, ViewGroup viewGroup, Map<View, LynxUI> map) {
        LynxUI lynxUI = null;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            PointF pointF = mTempPoint;
            if (isTransformedTouchPointInView(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f2 = fArr[0];
                float f3 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                if (map.containsKey(childAt)) {
                    lynxUI = map.get(childAt);
                } else {
                    if (childAt instanceof ViewGroup) {
                        lynxUI = findTouchTargetOnViewChian(fArr, (ViewGroup) childAt, map);
                    }
                    fArr[0] = f2;
                    fArr[1] = f3;
                }
                if (lynxUI != null) {
                    return lynxUI;
                }
                fArr[0] = f2;
                fArr[1] = f3;
            }
        }
        return lynxUI;
    }

    @Override // com.lynx.tasm.behavior.ui.a
    public Rect beforeDrawChild(Canvas canvas, View view, long j2) {
        if (this.mContext.r) {
            return drawFlattenUIBefore(canvas, view, j2);
        }
        for (int i2 = this.mCurrentDrawIndex; i2 < this.mChildren.size(); i2++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) this.mChildren.get(i2);
            if (lynxBaseUI instanceof LynxUI) {
                if (((LynxUI) lynxBaseUI).mView == view) {
                    this.mCurrentDrawIndex = i2 + 1;
                    return lynxBaseUI.getBound();
                }
            } else if (lynxBaseUI instanceof LynxFlattenUI) {
                drawChild((LynxFlattenUI) lynxBaseUI, canvas);
                if (this.mContext.q) {
                    this.mCurrentDrawIndex++;
                }
            }
        }
        return null;
    }

    public com.lynx.tasm.behavior.a.a findUIWithCustomLayout(float f2, float f3, UIGroup uIGroup) {
        HashMap hashMap = new HashMap();
        for (int childCount = uIGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            LynxBaseUI childAt = uIGroup.getChildAt(childCount);
            if (childAt instanceof UIShadowProxy) {
                childAt = ((UIShadowProxy) childAt).f56071a;
            }
            if (childAt instanceof LynxUI) {
                LynxUI lynxUI = (LynxUI) childAt;
                hashMap.put(lynxUI.mView, lynxUI);
            } else {
                new RuntimeException("ui that need custom layout should not have flatten child!");
            }
        }
        float[] fArr = {f2, f3};
        LynxUI findTouchTargetOnViewChian = findTouchTargetOnViewChian(fArr, (ViewGroup) uIGroup.mView, hashMap);
        if (findTouchTargetOnViewChian == null) {
            return uIGroup;
        }
        if (!findTouchTargetOnViewChian.needCustomLayout() || !(findTouchTargetOnViewChian instanceof UIGroup)) {
            return findTouchTargetOnViewChian.hitTest(fArr[0] + ((float) findTouchTargetOnViewChian.getScrollX()), fArr[1] + ((float) findTouchTargetOnViewChian.getScrollY()));
        }
        UIGroup uIGroup2 = (UIGroup) findTouchTargetOnViewChian;
        return uIGroup2.findUIWithCustomLayout(fArr[0], fArr[1], uIGroup2);
    }

    private static boolean isTransformedTouchPointInView(float f2, float f3, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f2 + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f3 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = mMatrixTransformCoords;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = mInverseMatrix;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (scrollX < 0.0f || scrollX >= ((float) (view.getRight() - view.getLeft())) || scrollY < 0.0f || scrollY >= ((float) (view.getBottom() - view.getTop()))) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
