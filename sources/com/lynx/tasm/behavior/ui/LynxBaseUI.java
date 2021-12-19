package com.lynx.tasm.behavior.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.a.b.c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.k;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.a.d;
import com.lynx.tasm.behavior.ui.a.f;
import com.lynx.tasm.behavior.ui.a.h;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;
import com.lynx.tasm.behavior.ui.utils.b;
import com.lynx.tasm.behavior.ui.utils.e;
import com.lynx.tasm.behavior.ui.utils.g;
import com.lynx.tasm.behavior.ui.utils.i;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.utils.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public abstract class LynxBaseUI implements com.lynx.tasm.behavior.a.a, d {
    protected static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = ((float) Math.sqrt(5.0d));
    public static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};
    protected boolean hasTransformChanged;
    public int mAccessibilityElementStatus;
    private String mAccessibilityLabel;
    protected int mBackgroundColor;
    protected Bitmap.Config mBitmapConfig;
    private boolean mBlockNativeEvent;
    public int mBorderBottomWidth;
    public int mBorderLeftWidth;
    public int mBorderRightWidth;
    public int mBorderTopWidth;
    public Rect mBound;
    public int mCSSPosition;
    public final List<LynxBaseUI> mChildren;
    public boolean mClipToRadius;
    public j mContext;
    public ReadableMap mDataset;
    public d mDrawParent;
    protected a mDrawableCallback;
    public boolean mEnableScrollMonitor;
    public Map<String, com.lynx.tasm.c.a> mEvents;
    private float mExtraOffsetX;
    private float mExtraOffsetY;
    protected boolean mFocusable;
    public float mFontSize;
    public boolean mHasRadius;
    private int mHeight;
    public String mIdSelector;
    protected boolean mIgnoreFocus;
    public boolean mIsFirstAnimatedReady;
    protected boolean mIsTransformNode;
    public final Point mLastSize;
    public final Point mLatestSize;
    private int mLeft;
    public e mLynxBackground;
    protected int mLynxDirection;
    public int mMarginBottom;
    public int mMarginLeft;
    public int mMarginRight;
    public int mMarginTop;
    public float mMaxHeight;
    public String mName;
    public LynxBaseUI mNextDrawUI;
    private boolean mOnResponceChain;
    private int mOriginLeft;
    private int mOriginTop;
    protected int mOverflow;
    public int mPaddingBottom;
    public int mPaddingLeft;
    public int mPaddingRight;
    public int mPaddingTop;
    protected Object mParam;
    public d mParent;
    protected ReadableArray mPerspective;
    public LynxBaseUI mPreviousDrawUI;
    private final JavaOnlyMap mProps;
    public String mRefId;
    public String mScrollMonitorTag;
    public boolean mShouldAttachChildrenView;
    private int mSign;
    protected Sticky mSticky;
    public String mTagName;
    private String mTestTagName;
    private int mTop;
    private float mTouchSlop;
    public g mTransformOrigin;
    public List<i> mTransformRaw;
    private int mWidth;
    protected boolean userInteractionEnabled;

    public boolean canHaveFlattenChild() {
        return true;
    }

    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            Boolean bool = null;
            Boolean valueOf = null;
            Integer valueOf2 = null;
            Integer valueOf3 = null;
            Integer valueOf4 = null;
            Integer valueOf5 = null;
            boolean z = true;
            int i2 = 3;
            int i3 = -1;
            int i4 = 0;
            boolean z2 = false;
            boolean z3 = false;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            switch (nextKey.hashCode()) {
                case -2114666131:
                    if (nextKey.equals("overflow-x")) {
                        if (!readableMap.isNull(nextKey)) {
                            i4 = readableMap.getInt(nextKey, 0);
                        }
                        setOverflowX(i4);
                        break;
                    } else {
                        break;
                    }
                case -2114666130:
                    if (nextKey.equals("overflow-y")) {
                        if (!readableMap.isNull(nextKey)) {
                            i12 = readableMap.getInt(nextKey, 0);
                        }
                        setOverflowY(i12);
                        break;
                    } else {
                        break;
                    }
                case -1988632153:
                    if (!nextKey.equals("scroll-monitor-tag")) {
                        break;
                    } else {
                        setScrollMonitorTag(readableMap.getString(nextKey));
                        break;
                    }
                case -1970593579:
                    if (!nextKey.equals("lynx-test-tag")) {
                        break;
                    } else {
                        setTestID(readableMap.getString(nextKey));
                        break;
                    }
                case -1820411228:
                    if (!nextKey.equals("border-bottom-right-radius")) {
                        break;
                    } else {
                        setBorderRadius(3, readableMap.getArray(nextKey));
                        break;
                    }
                case -1779213470:
                    if (!nextKey.equals("box-shadow")) {
                        break;
                    } else {
                        setBoxShadow(readableMap.getArray(nextKey));
                        break;
                    }
                case -1586082113:
                    if (nextKey.equals(b.f37373b)) {
                        setFontSize(readableMap.isNull(nextKey) ? 1.0E21f : (float) readableMap.getDouble(nextKey, 1.0E21d));
                        break;
                    } else {
                        break;
                    }
                case -1138223116:
                    if (!nextKey.equals("image-config")) {
                        break;
                    } else {
                        setImageConfig(readableMap.getString(nextKey));
                        break;
                    }
                case -1124782267:
                    if (!nextKey.equals("react-ref")) {
                        break;
                    } else {
                        setRefIdSelector(readableMap.getString(nextKey));
                        break;
                    }
                case -1032412580:
                    if (!nextKey.equals("border-top-right-radius")) {
                        break;
                    } else {
                        setBorderRadius(2, readableMap.getArray(nextKey));
                        break;
                    }
                case -992853731:
                    if (nextKey.equals("ignore-focus")) {
                        if (!readableMap.isNull(nextKey)) {
                            bool = Boolean.valueOf(readableMap.getBoolean(nextKey, false));
                        }
                        setIgnoreFocus(bool);
                        break;
                    } else {
                        break;
                    }
                case -962590849:
                    if (nextKey.equals("direction")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 3);
                        }
                        setLynxDirection(i2);
                        break;
                    } else {
                        break;
                    }
                case -585734562:
                    if (nextKey.equals("border-left-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf5 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(0, valueOf5);
                        break;
                    } else {
                        break;
                    }
                case -570796884:
                    if (nextKey.equals("border-left-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(1, i3);
                        break;
                    } else {
                        break;
                    }
                case -567450431:
                    if (nextKey.equals("border-left-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i11 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(1, i11);
                        break;
                    } else {
                        break;
                    }
                case -91694673:
                    if (!nextKey.equals("clip-radius")) {
                        break;
                    } else {
                        setClipToRadius(readableMap.getDynamic(nextKey));
                        break;
                    }
                case -20727064:
                    if (!nextKey.equals("background-position")) {
                        break;
                    } else {
                        setBackgroundPosition(readableMap.getArray(nextKey));
                        break;
                    }
                case 3373707:
                    if (!nextKey.equals(StringSet.name)) {
                        break;
                    } else {
                        setName(readableMap.getString(nextKey));
                        break;
                    }
                case 143851658:
                    if (nextKey.equals("border-top-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf4 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(2, valueOf4);
                        break;
                    } else {
                        break;
                    }
                case 158789336:
                    if (nextKey.equals("border-top-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(3, i3);
                        break;
                    } else {
                        break;
                    }
                case 162135789:
                    if (nextKey.equals("border-top-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i10 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(3, i10);
                        break;
                    } else {
                        break;
                    }
                case 207960636:
                    if (!nextKey.equals("perspective")) {
                        break;
                    } else {
                        setPerspective(readableMap.getArray(nextKey));
                        break;
                    }
                case 307025104:
                    if (nextKey.equals("border-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(0, i3);
                        break;
                    } else {
                        break;
                    }
                case 310371557:
                    if (nextKey.equals(b.f37375d)) {
                        setBorderWidth(0, readableMap.isNull(nextKey) ? 0 : readableMap.getInt(nextKey, 0));
                        break;
                    } else {
                        break;
                    }
                case 315007413:
                    if (!nextKey.equals("accessibility-label")) {
                        break;
                    } else {
                        setAccessibilityLabel(readableMap.getDynamic(nextKey));
                        break;
                    }
                case 419144785:
                    if (nextKey.equals("border-right-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf3 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(1, valueOf3);
                        break;
                    } else {
                        break;
                    }
                case 431395352:
                    if (!nextKey.equals("outline-color")) {
                        break;
                    } else {
                        int i13 = -16777216;
                        if (!readableMap.isNull(nextKey)) {
                            i13 = readableMap.getInt(nextKey, -16777216);
                        }
                        setOutlineColor(i13);
                        break;
                    }
                case 434082463:
                    if (nextKey.equals("border-right-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(2, i3);
                        break;
                    } else {
                        break;
                    }
                case 437428916:
                    if (nextKey.equals("border-right-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i9 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(2, i9);
                        break;
                    } else {
                        break;
                    }
                case 446333030:
                    if (nextKey.equals("outline-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, -1);
                        }
                        setOutlineStyle(i3);
                        break;
                    } else {
                        break;
                    }
                case 449679483:
                    if (nextKey.equals("outline-width")) {
                        setOutlineWidth(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        break;
                    } else {
                        break;
                    }
                case 474781053:
                    if (!nextKey.equals("accessibility-element")) {
                        break;
                    } else {
                        setAccessibilityElement(readableMap.getDynamic(nextKey));
                        break;
                    }
                case 529642498:
                    if (nextKey.equals("overflow")) {
                        if (!readableMap.isNull(nextKey)) {
                            i8 = readableMap.getInt(nextKey, 0);
                        }
                        setOverflow(i8);
                        break;
                    } else {
                        break;
                    }
                case 605322756:
                    if (nextKey.equals("background-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            i7 = readableMap.getInt(nextKey, 0);
                        }
                        setBackgroundColor(i7);
                        break;
                    } else {
                        break;
                    }
                case 609634231:
                    if (!nextKey.equals("border-bottom-left-radius")) {
                        break;
                    } else {
                        setBorderRadius(4, readableMap.getArray(nextKey));
                        break;
                    }
                case 610793468:
                    if (!nextKey.equals("background-image")) {
                        break;
                    } else {
                        setBackgroundImage(readableMap.getArray(nextKey));
                        break;
                    }
                case 627129881:
                    if (!nextKey.equals("intersection-observers")) {
                        break;
                    } else {
                        setIntersectionObservers(readableMap.getArray(nextKey));
                        break;
                    }
                case 738316676:
                    if (nextKey.equals("user-interaction-enabled")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setUserInteractionEnabled(z);
                        break;
                    } else {
                        break;
                    }
                case 747804969:
                    if (nextKey.equals("position")) {
                        if (!readableMap.isNull(nextKey)) {
                            i6 = readableMap.getInt(nextKey, 0);
                        }
                        setCSSPosition(i6);
                        break;
                    } else {
                        break;
                    }
                case 881039699:
                    if (!nextKey.equals("border-radius")) {
                        break;
                    } else {
                        setBorderRadius(0, readableMap.getArray(nextKey));
                        break;
                    }
                case 956705090:
                    if (nextKey.equals("border-bottom-color")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf2 = Integer.valueOf(readableMap.getInt(nextKey, 0));
                        }
                        setBorderColor(3, valueOf2);
                        break;
                    } else {
                        break;
                    }
                case 971642768:
                    if (nextKey.equals("border-bottom-style")) {
                        if (!readableMap.isNull(nextKey)) {
                            i3 = readableMap.getInt(nextKey, -1);
                        }
                        setBorderStyle(4, i3);
                        break;
                    } else {
                        break;
                    }
                case 974989221:
                    if (nextKey.equals("border-bottom-width")) {
                        if (!readableMap.isNull(nextKey)) {
                            i5 = readableMap.getInt(nextKey, 0);
                        }
                        setBorderWidth(4, i5);
                        break;
                    } else {
                        break;
                    }
                case 1266449551:
                    if (!nextKey.equals("background-clip")) {
                        break;
                    } else {
                        setBackgroundClip(readableMap.getArray(nextKey));
                        break;
                    }
                case 1266923840:
                    if (!nextKey.equals("background-size")) {
                        break;
                    } else {
                        setBackgroundSize(readableMap.getArray(nextKey));
                        break;
                    }
                case 1352416423:
                    if (!nextKey.equals("transform-origin")) {
                        break;
                    } else {
                        setTransformOrigin(readableMap.getArray(nextKey));
                        break;
                    }
                case 1443214456:
                    if (!nextKey.equals("dataset")) {
                        break;
                    } else {
                        setDataset(readableMap.getMap(nextKey));
                        break;
                    }
                case 1455741924:
                    if (nextKey.equals("enable-scroll-monitor")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setEnableScrollMonitor(z3);
                        break;
                    } else {
                        break;
                    }
                case 1466337535:
                    if (!nextKey.equals("border-top-left-radius")) {
                        break;
                    } else {
                        setBorderRadius(1, readableMap.getArray(nextKey));
                        break;
                    }
                case 1629011506:
                    if (nextKey.equals("focusable")) {
                        if (!readableMap.isNull(nextKey)) {
                            valueOf = Boolean.valueOf(readableMap.getBoolean(nextKey, false));
                        }
                        setFocusable(valueOf);
                        break;
                    } else {
                        break;
                    }
                case 1740315162:
                    if (!nextKey.equals("idSelector")) {
                        break;
                    } else {
                        setIdSelector(readableMap.getString(nextKey));
                        break;
                    }
                case 1901673625:
                    if (!nextKey.equals("caret-color")) {
                        break;
                    } else {
                        setCaretColor(readableMap.getString(nextKey));
                        break;
                    }
                case 1931359397:
                    if (!nextKey.equals("background-origin")) {
                        break;
                    } else {
                        setBackgroundOrigin(readableMap.getArray(nextKey));
                        break;
                    }
                case 2005447450:
                    if (!nextKey.equals("background-repeat")) {
                        break;
                    } else {
                        setBackgroundRepeat(readableMap.getArray(nextKey));
                        break;
                    }
                case 2010977956:
                    if (nextKey.equals("block-native-event")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setBlockNativeEvent(z2);
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    public boolean enableLayoutAnimation() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    public com.lynx.tasm.a.a.a getKeyframeManager() {
        return null;
    }

    public c getLayoutAnimator() {
        return null;
    }

    /* access modifiers changed from: protected */
    public float getScaleX() {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public float getScaleY() {
        return 1.0f;
    }

    public int getScrollX() {
        return 0;
    }

    public int getScrollY() {
        return 0;
    }

    public com.lynx.tasm.a.c.a getTransitionAnimator() {
        return null;
    }

    public float getTranslationX() {
        return 0.0f;
    }

    public float getTranslationY() {
        return 0.0f;
    }

    public float getTranslationZ() {
        return 0.0f;
    }

    public boolean getVisibility() {
        return true;
    }

    public int getZIndex() {
        return 0;
    }

    public void initTransitionAnimator(ReadableMap readableMap) {
    }

    public void initialize() {
    }

    @Override // com.lynx.tasm.behavior.ui.d
    public void invalidate() {
    }

    public boolean isFlatten() {
        return false;
    }

    public long measureText(float f2, com.lynx.tasm.behavior.shadow.e eVar, float f3, com.lynx.tasm.behavior.shadow.e eVar2) {
        return 0;
    }

    public boolean needCustomLayout() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public void offResponseChain() {
        this.mOnResponceChain = false;
    }

    public void onAnimationUpdated() {
    }

    public void onBeforeAnimation(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }

    public void onBorderRadiusUpdated(int i2) {
    }

    /* access modifiers changed from: protected */
    public void onDrawingPositionChanged() {
    }

    @Override // com.lynx.tasm.behavior.a.a
    public void onFocusChanged(boolean z, boolean z2) {
    }

    public void onLayoutFinish(long j2) {
    }

    public void onReset() {
    }

    @Override // com.lynx.tasm.behavior.a.a
    public void onResponseChain() {
        this.mOnResponceChain = true;
    }

    public void renderIfNeeded() {
    }

    @Override // com.lynx.tasm.behavior.ui.d
    public void requestLayout() {
    }

    public void setAnimation(ReadableArray readableArray) {
    }

    public void setAnimationData(String[] strArr, float[] fArr) {
    }

    @m(a = "caret-color")
    public void setCaretColor(String str) {
    }

    public void setInlineImageStyleData(float[] fArr, int[] iArr) {
    }

    public void setLayoutAnimationData(int i2, long j2, long j3, int i3, int i4, float f2, float f3, float f4, float f5, int i5) {
    }

    public void setTextStyleData(int[] iArr, double[] dArr, String str) {
    }

    public void setTransitionData(float[] fArr) {
    }

    public void updateExtraData(Object obj) {
    }

    @Override // com.lynx.tasm.behavior.a.a
    public boolean blockNativeEvent() {
        return this.mBlockNativeEvent;
    }

    public CharSequence getAccessibilityLabel() {
        return this.mAccessibilityLabel;
    }

    public Rect getBound() {
        return this.mBound;
    }

    public List<LynxBaseUI> getChildren() {
        return this.mChildren;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public Map<String, com.lynx.tasm.c.a> getEvents() {
        return this.mEvents;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getOriginLeft() {
        return this.mOriginLeft;
    }

    public int getOriginTop() {
        return this.mOriginTop;
    }

    public int getOverflow() {
        return this.mOverflow;
    }

    public JavaOnlyMap getProps() {
        return this.mProps;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public int getSign() {
        return this.mSign;
    }

    public int getTop() {
        return this.mTop;
    }

    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public boolean ignoreFocus() {
        return this.mIgnoreFocus;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public boolean isFocusable() {
        return this.mFocusable;
    }

    public boolean isOnResponseChain() {
        return this.mOnResponceChain;
    }

    public boolean isUserInteractionEnabled() {
        return this.userInteractionEnabled;
    }

    public void onPropsUpdated() {
        invalidate();
    }

    public LynxBaseUI getDrawParent() {
        return (LynxBaseUI) this.mDrawParent;
    }

    public final int getLatestHeight() {
        return this.mLatestSize.y;
    }

    public final int getLatestWidth() {
        return this.mLatestSize.x;
    }

    public String getTestID() {
        String str = this.mTestTagName;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void recognizeGesturere() {
        j jVar = this.mContext;
        if (jVar != null) {
            jVar.a(this);
        }
    }

    private boolean isImageConfigBadCase() {
        if (Build.VERSION.SDK_INT != 25 || !isMeizu15()) {
            return false;
        }
        return true;
    }

    public void destroy() {
        this.mContext.c().a(this);
    }

    public LynxBaseUI getParentBaseUI() {
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            return (LynxBaseUI) ((LynxBaseUI) dVar).mParent;
        }
        return (LynxBaseUI) dVar;
    }

    public final boolean hasSizeChanged() {
        if (!this.mLastSize.equals(this.mLatestSize)) {
            return true;
        }
        return false;
    }

    public boolean isStackingContextNode() {
        if (getZIndex() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.a.a
    public com.lynx.tasm.behavior.a.a parent() {
        d dVar = this.mParent;
        if (dVar instanceof com.lynx.tasm.behavior.a.a) {
            return (com.lynx.tasm.behavior.a.a) dVar;
        }
        return null;
    }

    private float getTouchSlop() {
        if (this.mOnResponceChain) {
            return this.mTouchSlop * this.mContext.getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    private static boolean isMeizu() {
        String str = Build.BRAND;
        if (str != null && str.toLowerCase(Locale.ENGLISH).indexOf("meizu") >= 0) {
            return true;
        }
        return false;
    }

    private static boolean isMeizu15() {
        if (!isMeizu() || TextUtils.isEmpty(Build.DEVICE)) {
            return false;
        }
        return Build.DEVICE.contains("15");
    }

    public LynxUI enclosingLynxUI() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent) {
            if (lynxBaseUI instanceof LynxUI) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    public LynxUI enclosingStackingContextLynxUI() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent) {
            if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.isStackingContextNode()) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    public LynxUI enclosingTransformLynxUI() {
        for (LynxBaseUI lynxBaseUI = this; lynxBaseUI != null; lynxBaseUI = (LynxBaseUI) lynxBaseUI.mParent) {
            if ((lynxBaseUI instanceof LynxUI) && lynxBaseUI.mIsTransformNode) {
                return (LynxUI) lynxBaseUI;
            }
        }
        return null;
    }

    public void layout() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.layout();
        }
    }

    public void measure() {
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            lynxBaseUI.measure();
        }
    }

    public void onAnimatedNodeReady() {
        if (this.mIsFirstAnimatedReady) {
            this.mIsFirstAnimatedReady = false;
        }
        this.mLastSize.x = this.mLatestSize.x;
        this.mLastSize.y = this.mLatestSize.y;
        this.hasTransformChanged = false;
    }

    static {
        Covode.recordClassIndex(35021);
    }

    private void sendLayoutChangeEvent() {
        Map<String, com.lynx.tasm.c.a> map = this.mEvents;
        if (map != null && map.containsKey("layoutchange")) {
            this.mContext.f55897e.a(new com.lynx.tasm.c.b(getSign(), "layoutchange", getPositionInfo()));
        }
    }

    public Rect getRectToWindow() {
        UIBody.a aVar = this.mContext.f55901i.f56067a;
        if (aVar == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        aVar.getLocationInWindow(iArr);
        Rect boundingClientRect = getBoundingClientRect();
        boundingClientRect.offset(iArr[0], iArr[1]);
        return boundingClientRect;
    }

    public void onAttach() {
        e eVar = this.mLynxBackground;
        if (eVar.f56412e != null) {
            for (com.lynx.tasm.behavior.ui.a.c cVar : eVar.f56412e.f56371f.f56107a) {
                cVar.d();
            }
        }
    }

    public void onDetach() {
        e eVar = this.mLynxBackground;
        if (eVar.f56412e != null) {
            for (com.lynx.tasm.behavior.ui.a.c cVar : eVar.f56412e.f56371f.f56107a) {
                cVar.e();
            }
        }
    }

    public void onLayoutUpdated() {
        e eVar = this.mLynxBackground;
        float f2 = (float) this.mPaddingTop;
        float f3 = (float) this.mPaddingRight;
        float f4 = (float) this.mPaddingBottom;
        float f5 = (float) this.mPaddingLeft;
        BackgroundDrawable backgroundDrawable = eVar.f56412e;
        if (backgroundDrawable != null) {
            backgroundDrawable.a(1, f2);
            backgroundDrawable.a(2, f3);
            backgroundDrawable.a(3, f4);
            backgroundDrawable.a(0, f5);
        }
        invalidate();
        requestLayout();
    }

    public final boolean shouldDoTransform() {
        g gVar;
        if (this.hasTransformChanged || ((i.a(this.mTransformRaw) || ((gVar = this.mTransformOrigin) != null && ((gVar.a() || gVar.b()) && gVar.e()))) && hasSizeChanged())) {
            return true;
        }
        return false;
    }

    private JavaOnlyMap getPositionInfo() {
        Rect boundingClientRect = getBoundingClientRect();
        float f2 = this.mContext.p.density;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("id", this.mIdSelector);
        javaOnlyMap.putMap("dataset", new JavaOnlyMap());
        javaOnlyMap.putDouble("left", (double) (((float) boundingClientRect.left) / f2));
        javaOnlyMap.putDouble("top", (double) (((float) boundingClientRect.top) / f2));
        javaOnlyMap.putDouble("right", (double) (((float) boundingClientRect.right) / f2));
        javaOnlyMap.putDouble("bottom", (double) (((float) boundingClientRect.bottom) / f2));
        javaOnlyMap.putDouble("width", (double) (((float) boundingClientRect.width()) / f2));
        javaOnlyMap.putDouble("height", (double) (((float) boundingClientRect.height()) / f2));
        return javaOnlyMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: java.util.List<com.lynx.tasm.behavior.ui.LynxUI> */
    /* JADX WARN: Multi-variable type inference failed */
    public void buildLynxUITree() {
        LynxUI enclosingLynxUI;
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            if (lynxBaseUI instanceof LynxUI) {
                if (lynxBaseUI.mCSSPosition == 2 && enclosingTransformLynxUI() != null) {
                    lynxBaseUI.mCSSPosition = 1;
                }
                if ((lynxBaseUI.getZIndex() != 0 && (enclosingLynxUI = enclosingStackingContextLynxUI()) != null) || (enclosingLynxUI = enclosingLynxUI()) != null) {
                    enclosingLynxUI.mViewChildren.add(lynxBaseUI);
                }
            }
            lynxBaseUI.requestLayout();
            lynxBaseUI.buildLynxUITree();
        }
    }

    /* access modifiers changed from: protected */
    public Rect getBoundRectForOverflow() {
        int i2;
        if (getOverflow() == 3) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = this.mContext.p;
        int i3 = 0;
        if ((getOverflow() & 1) != 0) {
            i2 = 0 - displayMetrics.widthPixels;
            width += displayMetrics.widthPixels * 2;
        } else {
            i2 = 0;
        }
        if ((getOverflow() & 2) != 0) {
            i3 = 0 - displayMetrics.heightPixels;
            height += displayMetrics.heightPixels * 2;
        }
        return new Rect(i2, i3, width + i2, height + i3);
    }

    /* access modifiers changed from: protected */
    public Rect getRect() {
        float originLeft = ((float) getOriginLeft()) + (((float) getWidth()) / 2.0f);
        float originTop = ((float) getOriginTop()) + (((float) getHeight()) / 2.0f);
        float width = ((float) getWidth()) * getScaleX();
        float height = ((float) getHeight()) * getScaleY();
        float translationX = (originLeft - (width / 2.0f)) + getTranslationX();
        float translationY = (originTop - (height / 2.0f)) + getTranslationY();
        return new Rect((int) translationX, (int) translationY, (int) (translationX + width), (int) (translationY + height));
    }

    public Rect getBoundingClientRect() {
        int i2;
        ViewGroup viewGroup = this.mContext.f55901i.f56067a;
        int i3 = 0;
        if (viewGroup == null) {
            return new Rect(0, 0, getWidth() + 0, getHeight() + 0);
        }
        if (this instanceof LynxUI) {
            T t = ((LynxUI) this).mView;
            Rect rect = new Rect();
            View rootView = t.getRootView();
            if (viewGroup.getRootView() != rootView && (rootView instanceof ViewGroup)) {
                viewGroup = (ViewGroup) rootView;
            }
            try {
                viewGroup.offsetDescendantRectToMyCoords(t, rect);
                rect.offset(t.getScrollX(), t.getScrollY());
            } catch (IllegalArgumentException unused) {
            }
            i2 = rect.top;
            i3 = rect.left;
        } else if (this instanceof LynxFlattenUI) {
            d dVar = this.mParent;
            if (dVar == null || dVar == this.mContext.f55901i) {
                i3 = this.mLeft;
                i2 = this.mTop;
            } else {
                i2 = 0;
                LynxBaseUI lynxBaseUI = this;
                while ((lynxBaseUI instanceof LynxFlattenUI) && lynxBaseUI != this.mContext.f55901i) {
                    i3 += lynxBaseUI.getOriginLeft();
                    i2 += lynxBaseUI.getOriginTop();
                    lynxBaseUI = lynxBaseUI.getParentBaseUI();
                }
                if (lynxBaseUI != null) {
                    Rect boundingClientRect = lynxBaseUI.getBoundingClientRect();
                    i3 += boundingClientRect.left - lynxBaseUI.getScrollX();
                    i2 += boundingClientRect.top - lynxBaseUI.getScrollY();
                }
            }
        } else {
            i2 = 0;
        }
        return new Rect(i3, i2, getWidth() + i3, getHeight() + i2);
    }

    @m(a = "block-native-event", f = false)
    public void setBlockNativeEvent(boolean z) {
        this.mBlockNativeEvent = z;
    }

    public void setBorderColor(Integer num) {
        setBorderColorForAllSpacingIndex(num);
    }

    @m(a = "position", d = 1.0f)
    public final void setCSSPosition(int i2) {
        this.mCSSPosition = i2;
    }

    @m(a = "dataset")
    public void setDataset(ReadableMap readableMap) {
        this.mDataset = readableMap;
    }

    @m(a = "enable-scroll-monitor")
    public void setEnableScrollMonitor(boolean z) {
        this.mEnableScrollMonitor = z;
    }

    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        this.mEvents = map;
    }

    @m(a = "idSelector")
    public void setIdSelector(String str) {
        this.mIdSelector = str;
    }

    @m(a = "direction", e = 3)
    public void setLynxDirection(int i2) {
        this.mLynxDirection = i2;
    }

    @m(a = StringSet.name)
    public void setName(String str) {
        this.mName = str;
    }

    public void setParent(d dVar) {
        this.mParent = dVar;
    }

    @m(a = "perspective")
    public void setPerspective(ReadableArray readableArray) {
        this.mPerspective = readableArray;
    }

    @m(a = "react-ref")
    public void setRefIdSelector(String str) {
        this.mRefId = str;
    }

    @m(a = "scroll-monitor-tag")
    public void setScrollMonitorTag(String str) {
        this.mScrollMonitorTag = str;
    }

    @m(a = "lynx-test-tag")
    public void setTestID(String str) {
        this.mTestTagName = str;
    }

    @m(a = "user-interaction-enabled", f = true)
    public void setUserInteractionEnabled(boolean z) {
        this.userInteractionEnabled = z;
    }

    public void updateAttributes(v vVar) {
        updateProperties(vVar);
    }

    public class Sticky extends RectF {

        /* renamed from: a  reason: collision with root package name */
        float f56060a;

        /* renamed from: b  reason: collision with root package name */
        float f56061b;

        static {
            Covode.recordClassIndex(35024);
        }

        public Sticky() {
        }
    }

    class a implements Drawable.Callback {
        static {
            Covode.recordClassIndex(35025);
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            LynxBaseUI.this.invalidate();
        }

        /* synthetic */ a(LynxBaseUI lynxBaseUI, byte b2) {
            this();
        }
    }

    protected LynxBaseUI(Context context) {
        this((j) context);
    }

    public void afterPropsUpdated(v vVar) {
        onPropsUpdated();
        onAnimationUpdated();
    }

    public int getIndex(LynxBaseUI lynxBaseUI) {
        return this.mChildren.indexOf(lynxBaseUI);
    }

    public void setAttributes(v vVar) {
        updateAttributes(vVar);
        onPropsUpdated();
    }

    public void setBorderColor(String str) {
        new RuntimeException("setBorderColor(String) is deprecated.This has no effect.");
    }

    public void setHeight(int i2) {
        this.mHeight = i2;
        onLayoutUpdated();
    }

    public void setLeft(int i2) {
        this.mLeft = i2;
        this.mOriginLeft = i2;
        onLayoutUpdated();
    }

    @m(a = "overflow", e = 0)
    public void setOverflow(int i2) {
        setOverflowWithMask(3, i2);
    }

    @m(a = "overflow-x", e = 0)
    public void setOverflowX(int i2) {
        setOverflowWithMask(1, i2);
    }

    @m(a = "overflow-y", e = 0)
    public void setOverflowY(int i2) {
        setOverflowWithMask(2, i2);
    }

    public void setTop(int i2) {
        this.mTop = i2;
        this.mOriginTop = i2;
        onLayoutUpdated();
    }

    public void setWidth(int i2) {
        this.mWidth = i2;
        onLayoutUpdated();
    }

    public final void updateProperties(v vVar) {
        updatePropertiesInterval(vVar);
        afterPropsUpdated(vVar);
    }

    protected LynxBaseUI(j jVar) {
        this(jVar, null);
    }

    public LynxBaseUI getChildAt(int i2) {
        return this.mChildren.get(i2);
    }

    public void removeChild(LynxBaseUI lynxBaseUI) {
        this.mChildren.remove(lynxBaseUI);
        lynxBaseUI.setParent(null);
    }

    @m(a = "box-shadow")
    public void setBoxShadow(ReadableArray readableArray) {
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setBoxShadow(readableArray);
        }
    }

    @m(a = "focusable")
    public void setFocusable(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.mFocusable = z;
    }

    @m(a = b.f37373b, d = 1.0E21f)
    public void setFontSize(float f2) {
        if (f2 != 1.0E21f) {
            this.mFontSize = f2;
            this.mLynxBackground.f56414g = f2;
        }
    }

    @m(a = "ignore-focus")
    public void setIgnoreFocus(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.mIgnoreFocus = z;
    }

    @m(a = "outline-color", e = -16777216)
    public void setOutlineColor(int i2) {
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOutlineColor(i2);
        }
    }

    @m(a = "outline-width", e = 0)
    public void setOutlineWidth(float f2) {
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOutlineWidth(f2);
        }
    }

    public void setOverflowFiber(int i2) {
        this.mOverflow = i2;
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOverflowFiber(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setVisibilityData(int i2) {
        if (this instanceof LynxUI) {
            ((LynxUI) this).setVisibility(i2);
        }
        invalidate();
    }

    private float toPix(String str) {
        UIBody uIBody = this.mContext.f55901i;
        return n.a(str, uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 1.0E21f, this.mContext.p);
    }

    public void copyAnimationRelatedPropFromOldUI(LynxBaseUI lynxBaseUI) {
        this.mIsFirstAnimatedReady = lynxBaseUI.mIsFirstAnimatedReady;
        this.mLastSize.set(lynxBaseUI.mLastSize.x, lynxBaseUI.mLastSize.y);
        this.mLatestSize.set(lynxBaseUI.mLatestSize.x, lynxBaseUI.mLatestSize.y);
    }

    public void removeChildFiber(LynxBaseUI lynxBaseUI) {
        if (this instanceof LynxFlattenUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            return;
        }
        removeChild(lynxBaseUI);
    }

    public void removeChildV2(LynxBaseUI lynxBaseUI) {
        LynxUI enclosingLynxUI;
        if (this.mChildren.remove(lynxBaseUI)) {
            if ((lynxBaseUI instanceof LynxUI) && (enclosingLynxUI = enclosingLynxUI()) != null) {
                enclosingLynxUI.mViewChildren.remove(lynxBaseUI);
            }
            lynxBaseUI.setParent(null);
            this.mShouldAttachChildrenView = false;
        }
    }

    @m(a = "background-image")
    public void setBackgroundImage(ReadableArray readableArray) {
        BackgroundDrawable c2 = this.mLynxBackground.c();
        c2.f56371f.a(readableArray);
        c2.invalidateSelf();
        invalidate();
    }

    public void setOpacity(float f2) {
        if (this instanceof LynxUI) {
            ((LynxUI) this).setAlpha(f2);
        }
        invalidate();
        onAnimationUpdated();
    }

    @m(a = "outline-style", e = -1)
    public void setOutlineStyle(int i2) {
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).a().f56077a = com.lynx.tasm.behavior.ui.utils.c.parse(i2);
        }
    }

    public void setTransform(ReadableArray readableArray) {
        this.hasTransformChanged = true;
        this.mTransformRaw = i.a(readableArray);
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).b();
        }
    }

    private void setBorderColorForAllSpacingIndex(Integer num) {
        float intValue;
        float f2 = 1.0E21f;
        if (num == null) {
            intValue = 1.0E21f;
        } else {
            intValue = (float) (num.intValue() & 16777215);
            f2 = (float) (num.intValue() >>> 24);
        }
        int i2 = 1;
        do {
            this.mLynxBackground.a(SPACING_TYPES[i2], intValue, f2);
            i2++;
        } while (i2 <= 4);
    }

    @m(a = "accessibility-element")
    public void setAccessibilityElement(com.lynx.react.bridge.a aVar) {
        boolean z = true;
        z = true;
        z = true;
        if (aVar != null) {
            ReadableType h2 = aVar.h();
            if (h2 == ReadableType.String) {
                z = Boolean.parseBoolean(aVar.e());
            } else if (h2 == ReadableType.Int || h2 == ReadableType.Number || h2 == ReadableType.Long) {
                if (aVar.d() == 0) {
                    z = false;
                }
            } else if (h2 == ReadableType.Boolean) {
                z = aVar.b();
            }
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        this.mAccessibilityElementStatus = i2;
    }

    @m(a = "accessibility-label")
    public void setAccessibilityLabel(com.lynx.react.bridge.a aVar) {
        String str;
        if (aVar != null) {
            ReadableType h2 = aVar.h();
            if (h2 == ReadableType.String) {
                str = aVar.e();
            } else if (h2 == ReadableType.Int || h2 == ReadableType.Number || h2 == ReadableType.Long) {
                str = String.valueOf(aVar.d());
            } else if (h2 == ReadableType.Boolean) {
                str = String.valueOf(aVar.b());
            }
            this.mAccessibilityLabel = str;
        }
        str = "";
        this.mAccessibilityLabel = str;
    }

    @m(a = "background-clip")
    public void setBackgroundClip(ReadableArray readableArray) {
        BackgroundDrawable c2 = this.mLynxBackground.c();
        d dVar = c2.f56371f;
        dVar.f56110d.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = readableArray.getInt(i2);
                if (i3 < 0 || i3 > 2) {
                    dVar.f56110d.add(1);
                } else {
                    dVar.f56110d.add(Integer.valueOf(i3));
                }
            }
        }
        c2.invalidateSelf();
    }

    @m(a = "background-color", e = 0)
    public void setBackgroundColor(int i2) {
        this.mBackgroundColor = i2;
        if (getKeyframeManager() != null) {
            getKeyframeManager().a("BackgroundColor", Integer.valueOf(i2));
        }
        if (getTransitionAnimator() == null || !getTransitionAnimator().a(64)) {
            this.mLynxBackground.a(i2);
            invalidate();
            return;
        }
        getTransitionAnimator().a(this, 64, Integer.valueOf(i2));
    }

    @m(a = "background-origin")
    public void setBackgroundOrigin(ReadableArray readableArray) {
        BackgroundDrawable c2 = this.mLynxBackground.c();
        d dVar = c2.f56371f;
        dVar.f56109c.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = readableArray.getInt(i2);
                if (i3 < 0 || i3 > 2) {
                    i3 = 1;
                }
                dVar.f56109c.add(Integer.valueOf(i3));
            }
        }
        c2.invalidateSelf();
        invalidate();
    }

    @m(a = "background-position")
    public void setBackgroundPosition(ReadableArray readableArray) {
        BackgroundDrawable c2 = this.mLynxBackground.c();
        d dVar = c2.f56371f;
        dVar.f56108b.clear();
        if (readableArray != null) {
            readableArray.size();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                dVar.f56108b.add(new f(readableArray.getDouble(i2)));
            }
        }
        c2.invalidateSelf();
        invalidate();
    }

    @m(a = "background-repeat")
    public void setBackgroundRepeat(ReadableArray readableArray) {
        BackgroundDrawable c2 = this.mLynxBackground.c();
        d dVar = c2.f56371f;
        dVar.f56111e.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                dVar.f56111e.add(h.valueOf(readableArray.getInt(i2)));
            }
        }
        c2.invalidateSelf();
        invalidate();
    }

    @m(a = "background-size")
    public void setBackgroundSize(ReadableArray readableArray) {
        BackgroundDrawable c2 = this.mLynxBackground.c();
        d dVar = c2.f56371f;
        dVar.f56112f.clear();
        if (readableArray != null) {
            int size = readableArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                dVar.f56112f.add(new com.lynx.tasm.behavior.ui.a.i(readableArray.getDouble(i2)));
            }
        }
        c2.invalidateSelf();
        invalidate();
    }

    @m(a = "clip-radius")
    public void setClipToRadius(com.lynx.react.bridge.a aVar) {
        boolean z;
        if (aVar != null) {
            ReadableType h2 = aVar.h();
            if (h2 == ReadableType.Boolean) {
                z = aVar.b();
            } else if (h2 == ReadableType.String) {
                String e2 = aVar.e();
                if (e2.equalsIgnoreCase("true") || e2.equalsIgnoreCase("yes")) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                return;
            }
            this.mClipToRadius = z;
        }
    }

    @m(a = "intersection-observers")
    public void setIntersectionObservers(ReadableArray readableArray) {
        this.mContext.c().a(this);
        if (readableArray != null && this.mEvents.containsKey("intersection")) {
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                ReadableMap map = readableArray.getMap(i2);
                if (map != null) {
                    this.mContext.c().a(new k(this.mContext.c(), map, this));
                }
            }
        }
    }

    @m(a = "transform-origin")
    public void setTransformOrigin(ReadableArray readableArray) {
        g gVar;
        this.hasTransformChanged = true;
        this.mTransformOrigin = g.f56421c;
        if (readableArray != null) {
            if (readableArray.size() < 2) {
                gVar = null;
            } else {
                gVar = new g(readableArray);
            }
            this.mTransformOrigin = gVar;
            if (gVar == null) {
                LLog.a(6, "LynxBaseUI", "transform params error.");
                this.mTransformOrigin = g.f56421c;
            }
        }
    }

    public void updateSticky(float[] fArr) {
        if (fArr == null || fArr.length < 4) {
            this.mSticky = null;
            return;
        }
        Sticky sticky = new Sticky();
        this.mSticky = sticky;
        sticky.left = fArr[0];
        this.mSticky.top = fArr[1];
        this.mSticky.right = fArr[2];
        this.mSticky.bottom = fArr[3];
        Sticky sticky2 = this.mSticky;
        sticky2.f56061b = 0.0f;
        sticky2.f56060a = 0.0f;
        LynxBaseUI parentBaseUI = getParentBaseUI();
        if (parentBaseUI instanceof com.lynx.tasm.behavior.ui.scroll.b) {
            ((com.lynx.tasm.behavior.ui.scroll.b) parentBaseUI).a();
        }
    }

    @p
    public void scrollIntoView(ReadableMap readableMap) {
        HashMap hashMap;
        String str;
        String str2;
        String str3;
        if (readableMap != null && (hashMap = (HashMap) readableMap.toHashMap().get("scrollIntoViewOptions")) != null) {
            if (hashMap.containsKey("behavior")) {
                str = (String) hashMap.get("behavior");
            } else {
                str = "auto";
            }
            if (hashMap.containsKey("block")) {
                str2 = (String) hashMap.get("block");
            } else {
                str2 = "start";
            }
            if (hashMap.containsKey("inline")) {
                str3 = (String) hashMap.get("inline");
            } else {
                str3 = "nearest";
            }
            LynxBaseUI lynxBaseUI = this;
            while (true) {
                d dVar = lynxBaseUI.mParent;
                if (dVar != null && (dVar instanceof LynxBaseUI)) {
                    if (lynxBaseUI instanceof AbsLynxUIScroll) {
                        ((AbsLynxUIScroll) lynxBaseUI).a(this, str.equals("smooth"), str2, str3);
                        return;
                    }
                    lynxBaseUI = (LynxBaseUI) dVar;
                } else {
                    return;
                }
            }
        }
    }

    public void updateLayoutInfo(LynxBaseUI lynxBaseUI) {
        updateLayoutInfo(lynxBaseUI.getLeft(), lynxBaseUI.getTop(), lynxBaseUI.getWidth(), lynxBaseUI.getHeight(), lynxBaseUI.mPaddingLeft, lynxBaseUI.mPaddingTop, lynxBaseUI.mPaddingRight, lynxBaseUI.mPaddingBottom, lynxBaseUI.mMarginLeft, lynxBaseUI.mMarginTop, lynxBaseUI.mMarginRight, lynxBaseUI.mMarginBottom, lynxBaseUI.mBorderLeftWidth, lynxBaseUI.mBorderTopWidth, lynxBaseUI.mBorderRightWidth, lynxBaseUI.mBorderBottomWidth, lynxBaseUI.getBound());
        this.mOriginLeft = lynxBaseUI.getOriginLeft();
        this.mOriginTop = lynxBaseUI.getOriginTop();
    }

    @m(a = "image-config")
    public void setImageConfig(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            this.mBitmapConfig = null;
            return;
        }
        if (str.equalsIgnoreCase("ALPHA_8")) {
            this.mBitmapConfig = Bitmap.Config.ALPHA_8;
        } else {
            if (str.equalsIgnoreCase("RGB_565")) {
                if (!isImageConfigBadCase()) {
                    this.mBitmapConfig = Bitmap.Config.RGB_565;
                } else {
                    LLog.a(5, "LynxBaseUI setImageConfig warn: ", "RGB_565 can't be set on Meizu15");
                }
            } else if (str.equalsIgnoreCase("ARGB_8888")) {
                this.mBitmapConfig = Bitmap.Config.ARGB_8888;
            } else if (str.equalsIgnoreCase("RGBA_F16")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mBitmapConfig = Bitmap.Config.RGBA_F16;
                } else {
                    LLog.a(5, "LynxBaseUI setImageConfig warn: ", "RGBA_F16 requires build version >= VERSION_CODES.O");
                }
            } else if (str.equalsIgnoreCase("HARDWARE")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.mBitmapConfig = Bitmap.Config.HARDWARE;
                } else {
                    this.mBitmapConfig = null;
                    LLog.a(5, "LynxBaseUI setImageConfig warn: ", "HARDWARE requires build version >= VERSION_CODES.O");
                }
            }
            this.mBitmapConfig = null;
        }
        e eVar = this.mLynxBackground;
        if (eVar != null) {
            Bitmap.Config config = this.mBitmapConfig;
            BackgroundDrawable c2 = eVar.c();
            if (c2.f56371f != null) {
                d dVar = c2.f56371f;
                dVar.f56113g = config;
                if (dVar.f56107a != null) {
                    for (com.lynx.tasm.behavior.ui.a.c cVar : dVar.f56107a) {
                        if (cVar != null) {
                            cVar.a(dVar.f56113g);
                        }
                    }
                }
                c2.invalidateSelf();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.text.UIText") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d7, code lost:
        if (r2.equals("com.bytedance.ies.xelement.pickview.LynxPickView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e1, code lost:
        if (r2.equals("com.bytedance.lynx.tasm.ui.imageloader.UIFilterImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.swiper.XSwiperUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f5, code lost:
        if (r2.equals("com.lynx.tasm.ui.image.UIFilterImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxVideoManagerLite") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0109, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.text.FlattenUIText") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
        if (r2.equals("com.bytedance.ies.xelement.overlay.LynxOverlayView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.LynxBaseUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxImpressionView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        if (r2.equals("com.lynx.tasm.ui.image.UIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxLottieView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0145, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxScrollView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014f, code lost:
        if (r2.equals("com.bytedance.ies.xelement.picker.LynxPickerView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0159, code lost:
        if (r2.equals("com.bytedance.ies.xelement.pickview.LynxPickerViewColumn") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0163, code lost:
        if (r2.equals("com.bytedance.lynx.tasm.ui.imageloader.UIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
        if (r2.equals("com.lynx.tasm.ui.image.FlattenUIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0181, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.LynxFlattenUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018b, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.image.AbsUIImage") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0195, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.list.UIList") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019f, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.view.UIView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a9, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.LynxUI") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b3, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.list.AbsLynxList") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bd, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxBounceView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c7, code lost:
        if (r2.equals("com.bytedance.ies.xelement.banner.LynxSwiperView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d1, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxAudio") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01db, code lost:
        if (r2.equals("com.lynx.tasm.behavior.ui.view.UIComponent") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e5, code lost:
        if (r2.equals("com.bytedance.ies.xelement.input.LynxTextAreaView") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ef, code lost:
        if (r2.equals("com.bytedance.ies.xelement.LynxVideoManager") == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fa, code lost:
        dispatchProperties(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01fd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updatePropertiesInterval(com.lynx.tasm.behavior.v r9) {
        /*
        // Method dump skipped, instructions count: 632
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.LynxBaseUI.updatePropertiesInterval(com.lynx.tasm.behavior.v):void");
    }

    public void setBorderRadius(int i2, String str) {
        new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect.");
    }

    public void setBorderWidth(int i2, String str) {
        new RuntimeException("setBorderWidth(int, String) is deprecated.This has no effect.");
    }

    public void setSign(int i2, String str) {
        this.mSign = i2;
        this.mTagName = str;
    }

    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        this.mChildren.add(i2, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    public void insertChildV2(LynxBaseUI lynxBaseUI, int i2) {
        this.mChildren.add(i2, lynxBaseUI);
        lynxBaseUI.setParent(this);
    }

    @com.lynx.tasm.behavior.n(a = {"border-left-color", "border-right-color", "border-top-color", "border-bottom-color"}, b = "Color")
    public void setBorderColor(int i2, Integer num) {
        setBorderColorForSpacingIndex(SPACING_TYPES[i2 + 1], num);
    }

    public final void updateLayoutSize(int i2, int i3) {
        this.mLatestSize.x = i2;
        this.mLatestSize.y = i3;
    }

    private void setBorderColorForSpacingIndex(int i2, Integer num) {
        float intValue;
        float f2 = 1.0E21f;
        if (num == null) {
            intValue = 1.0E21f;
        } else {
            intValue = (float) (num.intValue() & 16777215);
            f2 = (float) (num.intValue() >>> 24);
        }
        this.mLynxBackground.a(i2, intValue, f2);
    }

    @p
    public void boundingClientRect(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, getPositionInfo());
    }

    /* access modifiers changed from: protected */
    public void setOverflowWithMask(short s, int i2) {
        int i3;
        int i4 = this.mOverflow;
        if (i2 == 0) {
            i3 = i4 | s;
        } else {
            i3 = i4 & (s ^ -1);
        }
        this.mOverflow = i3;
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((LynxBaseUI) dVar).setOverflowWithMask(s, i2);
        }
    }

    public void insertChildFiber(LynxBaseUI lynxBaseUI, int i2) {
        if (this instanceof UIShadowProxy) {
            ((UIShadowProxy) this).f56071a.insertChildFiber(lynxBaseUI, i2);
            return;
        }
        if (i2 == -1) {
            i2 = this.mChildren.size();
        }
        if (this instanceof UIGroup) {
            d dVar = lynxBaseUI.mParent;
            if (dVar != null) {
                ((LynxBaseUI) dVar).removeChildFiber(lynxBaseUI);
            }
            insertChild(lynxBaseUI, i2);
            return;
        }
        throw new RuntimeException("Trying to insert to the invalid view: ".concat(String.valueOf(i2)));
    }

    public void setBorderRadius(int i2, float f2) {
        if (!com.lynx.tasm.behavior.shadow.g.a(f2) && f2 < 0.0f) {
            f2 = 1.0E21f;
        }
        b.a aVar = new b.a();
        aVar.f56403a = f2;
        aVar.f56404b = f2;
        aVar.f56405c = b.c.NUMBER;
        aVar.f56406d = b.c.NUMBER;
        if (i2 == 0) {
            int i3 = 1;
            do {
                this.mLynxBackground.a(i3, aVar);
                i3++;
            } while (i3 < 5);
        } else {
            this.mLynxBackground.a(i2, aVar);
        }
        onBorderRadiusUpdated(i2);
    }

    @com.lynx.tasm.behavior.n(a = {"border-style", "border-left-style", "border-right-style", "border-top-style", "border-bottom-style"}, e = -1)
    public void setBorderStyle(int i2, int i3) {
        e eVar = this.mLynxBackground;
        int i4 = SPACING_TYPES[i2];
        BackgroundDrawable c2 = eVar.c();
        if (i4 <= 8 && i4 >= 0) {
            if (c2.f56367b == null) {
                c2.f56367b = new com.lynx.tasm.behavior.ui.utils.c[9];
            }
            try {
                com.lynx.tasm.behavior.ui.utils.c parse = com.lynx.tasm.behavior.ui.utils.c.parse(i3);
                if (c2.f56367b[i4] != parse) {
                    c2.f56367b[i4] = parse;
                    c2.invalidateSelf();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public boolean childrenContainPoint(float f2, float f3) {
        float scrollX = ((f2 + ((float) getScrollX())) - ((float) getOriginLeft())) - getTranslationX();
        float scrollY = ((f3 + ((float) getScrollY())) - ((float) getOriginTop())) - getTranslationY();
        for (LynxBaseUI lynxBaseUI : this.mChildren) {
            if (lynxBaseUI.isUserInteractionEnabled() && lynxBaseUI.containsPoint(scrollX, scrollY)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsPoint(float f2, float f3) {
        float touchSlop = getTouchSlop();
        Rect rect = getRect();
        if (((float) rect.left) - touchSlop < f2 && ((float) rect.right) + touchSlop > f2 && ((float) rect.top) - touchSlop < f3 && ((float) rect.bottom) + touchSlop > f3) {
            return true;
        }
        if (getOverflow() == 0) {
            return false;
        }
        if (getOverflow() == 1) {
            if (((float) rect.top) - touchSlop >= f3 || ((float) rect.bottom) + touchSlop <= f3) {
                return false;
            }
        } else if (getOverflow() == 2 && (((float) rect.left) - touchSlop >= f2 || ((float) rect.right) + touchSlop <= f2)) {
            return false;
        }
        return childrenContainPoint(f2, f3);
    }

    @com.lynx.tasm.behavior.n(a = {com.bytedance.ies.xelement.pickview.b.b.f37375d, "border-left-width", "border-right-width", "border-top-width", "border-bottom-width"})
    public void setBorderWidth(int i2, int i3) {
        e eVar = this.mLynxBackground;
        int i4 = SPACING_TYPES[i2];
        float f2 = (float) i3;
        BackgroundDrawable c2 = eVar.c();
        if (c2.f56366a == null) {
            c2.f56366a = new com.lynx.tasm.behavior.ui.utils.f();
        }
        if (!com.lynx.tasm.utils.c.a(c2.f56366a.f56417a[i4], f2)) {
            c2.f56366a.a(i4, f2);
            if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5 || i4 == 8) {
                c2.f56369d = true;
            }
            c2.invalidateSelf();
        }
    }

    protected LynxBaseUI(j jVar, Object obj) {
        this.mChildren = new ArrayList();
        this.mProps = new JavaOnlyMap();
        this.mDataset = new JavaOnlyMap();
        this.mHasRadius = false;
        this.mOverflow = 0;
        this.mClipToRadius = false;
        this.mFocusable = false;
        this.mIgnoreFocus = false;
        this.mPerspective = null;
        this.hasTransformChanged = false;
        this.userInteractionEnabled = true;
        this.mSticky = null;
        this.mMaxHeight = -1.0f;
        this.mBackgroundColor = 0;
        this.mShouldAttachChildrenView = false;
        this.mExtraOffsetX = 0.0f;
        this.mExtraOffsetY = 0.0f;
        this.mAccessibilityLabel = "";
        this.mAccessibilityElementStatus = -1;
        this.mDrawableCallback = new a(this, (byte) 0);
        this.mBitmapConfig = null;
        this.mCSSPosition = 1;
        this.mTouchSlop = 8.0f;
        this.mOnResponceChain = false;
        this.mBlockNativeEvent = false;
        this.mIsFirstAnimatedReady = true;
        this.mLynxDirection = 3;
        this.mContext = jVar;
        this.mParam = obj;
        e eVar = new e(jVar);
        this.mLynxBackground = eVar;
        eVar.f56413f = this.mDrawableCallback;
        float a2 = com.lynx.tasm.utils.j.a(14.0f);
        this.mFontSize = a2;
        this.mLynxBackground.f56414g = a2;
        this.mLatestSize = new Point();
        this.mLastSize = new Point();
        initialize();
    }

    public boolean checkStickyOnParentScroll(int i2, int i3) {
        if (this.mSticky == null) {
            return false;
        }
        float left = (float) (getLeft() - i2);
        float top = (float) (getTop() - i3);
        if (left < this.mSticky.left) {
            Sticky sticky = this.mSticky;
            sticky.f56060a = sticky.left - left;
        } else {
            int width = getParentBaseUI().getWidth();
            float width2 = ((float) getWidth()) + left;
            float f2 = (float) width;
            if (this.mSticky.right + width2 > f2) {
                Sticky sticky2 = this.mSticky;
                sticky2.f56060a = Math.max((f2 - width2) - sticky2.right, this.mSticky.left - left);
            } else {
                this.mSticky.f56060a = 0.0f;
            }
        }
        if (top < this.mSticky.top) {
            Sticky sticky3 = this.mSticky;
            sticky3.f56061b = sticky3.top - top;
            return true;
        }
        int height = getParentBaseUI().getHeight();
        float height2 = ((float) getHeight()) + top;
        float f3 = (float) height;
        if (this.mSticky.bottom + height2 > f3) {
            Sticky sticky4 = this.mSticky;
            sticky4.f56061b = Math.max((f3 - height2) - sticky4.bottom, this.mSticky.top - top);
            return true;
        }
        this.mSticky.f56061b = 0.0f;
        return true;
    }

    public com.lynx.tasm.behavior.a.a hitTest(float f2, float f3) {
        int size = this.mChildren.size() - 1;
        UIGroup uIGroup = null;
        while (true) {
            if (size >= 0) {
                LynxBaseUI lynxBaseUI = this.mChildren.get(size);
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).f56071a;
                }
                if (lynxBaseUI.isUserInteractionEnabled() && lynxBaseUI.getVisibility() && lynxBaseUI.containsPoint(f2, f3)) {
                    if (lynxBaseUI.isOnResponseChain()) {
                        uIGroup = lynxBaseUI;
                        break;
                    } else if (uIGroup == null || uIGroup.getZIndex() < lynxBaseUI.getZIndex() || (uIGroup.getZIndex() == lynxBaseUI.getZIndex() && uIGroup.getTranslationZ() < lynxBaseUI.getTranslationZ())) {
                        uIGroup = lynxBaseUI;
                    }
                }
                size--;
            } else if (uIGroup == null) {
                return this;
            }
        }
        if (!uIGroup.needCustomLayout() || !(uIGroup instanceof UIGroup)) {
            return uIGroup.hitTest(((f2 + ((float) uIGroup.getScrollX())) - ((float) uIGroup.getOriginLeft())) - uIGroup.getTranslationX(), ((f3 + ((float) uIGroup.getScrollY())) - ((float) uIGroup.getOriginTop())) - uIGroup.getTranslationY());
        }
        UIGroup uIGroup2 = uIGroup;
        return uIGroup2.findUIWithCustomLayout(f2 - ((float) uIGroup.getOriginLeft()), f3 - ((float) uIGroup.getOriginTop()), uIGroup2);
    }

    @p
    public void requestUIInfo(ReadableMap readableMap, Callback callback) {
        ArrayList arrayList = new ArrayList();
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (readableMap.getBoolean(nextKey, false)) {
                    arrayList.add(nextKey);
                }
            }
        }
        JavaOnlyMap positionInfo = getPositionInfo();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (arrayList.contains("id")) {
            javaOnlyMap.put("id", this.mIdSelector);
        }
        if (arrayList.contains("dataset")) {
            javaOnlyMap.put("dataset", this.mDataset);
        }
        if (arrayList.contains("rect")) {
            javaOnlyMap.put("left", positionInfo.get("left"));
            javaOnlyMap.put("top", positionInfo.get("top"));
            javaOnlyMap.put("right", positionInfo.get("right"));
            javaOnlyMap.put("bottom", positionInfo.get("bottom"));
        }
        if (arrayList.contains("size")) {
            javaOnlyMap.put("width", positionInfo.get("width"));
            javaOnlyMap.put("height", positionInfo.get("height"));
        }
        if (arrayList.contains("scrollOffset")) {
            float f2 = this.mContext.p.density;
            javaOnlyMap.put("scrollLeft", Float.valueOf(((float) getScrollX()) / f2));
            javaOnlyMap.put("scrollTop", Float.valueOf(((float) getScrollY()) / f2));
        }
        if (arrayList.contains("node")) {
            javaOnlyMap.put("node", new JavaOnlyMap());
        }
        callback.invoke(0, javaOnlyMap);
    }

    @com.lynx.tasm.behavior.n(a = {"border-radius", "border-top-left-radius", "border-top-right-radius", "border-bottom-right-radius", "border-bottom-left-radius"})
    public void setBorderRadius(int i2, ReadableArray readableArray) {
        int i3 = 0;
        this.mHasRadius = false;
        if (readableArray == null || readableArray.size() <= 0) {
            if (i2 == 0) {
                do {
                    i3++;
                    this.mLynxBackground.a(i3, new b.a());
                } while (i3 < 4);
            } else {
                this.mLynxBackground.a(i2, new b.a());
            }
            onBorderRadiusUpdated(i2);
            return;
        }
        this.mHasRadius = true;
        if (i2 == 0) {
            readableArray.size();
            do {
                int i4 = i3 + 1;
                this.mLynxBackground.a(i4, b.a.a(readableArray, i3 * 4));
                i3 = i4;
            } while (i3 < 4);
        } else {
            readableArray.size();
            this.mLynxBackground.a(i2, b.a.a(readableArray, 0));
        }
        onBorderRadiusUpdated(i2);
    }

    public void setOutlineData(float f2, int i2, int i3) {
        setOutlineWidth(f2);
        setOutlineStyle(i2);
        setOutlineColor(i3);
        invalidate();
    }

    public void updateDrawingLayoutInfo(int i2, int i3, Rect rect) {
        boolean z;
        boolean z2 = true;
        if (this.mLeft != i2) {
            this.mLeft = i2;
            z = true;
        } else {
            z = false;
        }
        if (this.mTop != i3) {
            this.mTop = i3;
        } else {
            z2 = z;
        }
        this.mBound = rect;
        if (z2) {
            onDrawingPositionChanged();
        }
    }

    public void setBorderRadius(int i2, float f2, float f3) {
        if (!com.lynx.tasm.behavior.shadow.g.a(f2) && f2 < 0.0f) {
            f2 = 1.0E21f;
        }
        if (!com.lynx.tasm.behavior.shadow.g.a(f3) && f3 < 0.0f) {
            f3 = 1.0E21f;
        }
        b.a aVar = new b.a();
        aVar.f56403a = f2;
        aVar.f56404b = f3;
        aVar.f56405c = b.c.NUMBER;
        aVar.f56406d = b.c.NUMBER;
        if (i2 == 0) {
            int i3 = 1;
            do {
                this.mLynxBackground.a(i3, aVar);
                i3++;
            } while (i3 < 5);
        } else {
            this.mLynxBackground.a(i2, aVar);
        }
        onBorderRadiusUpdated(i2);
    }

    public void setTransformData(float f2, float f3, int[] iArr, float[] fArr) {
        this.hasTransformChanged = true;
        ArrayList arrayList = null;
        if (!(iArr == null || iArr.length == 0 || iArr.length * 3 != fArr.length)) {
            arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            while (i2 < iArr.length) {
                arrayList.add(new i(iArr[i2], fArr[i3], 0, fArr[i3 + 1], 0, fArr[i3 + 2], 0));
                i2++;
                i3 += 3;
            }
        }
        this.mTransformRaw = arrayList;
        this.mTransformOrigin = new g(f2, f3);
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).b();
        }
    }

    public void setSingleValueStyleData(int[] iArr, float f2, int i2, int i3, int i4) {
        for (int i5 : iArr) {
            if (i5 == 0) {
                setOpacity(f2);
            } else if (i5 == 1) {
                setOverflowFiber(i2);
            } else if (i5 == 2) {
                setVisibilityData(i3);
            } else if (i5 == 3) {
                setCSSPosition(i4);
            }
        }
    }

    public void setShadowData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, int[] iArr, int[] iArr2) {
        int length = fArr.length;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < length; i2++) {
            c cVar = new c();
            cVar.f56145b = fArr[i2];
            cVar.f56146c = fArr2[i2];
            cVar.f56147d = fArr3[i2];
            cVar.f56149f = cVar.f56147d * 1.25f;
            cVar.f56148e = fArr4[i2];
            cVar.f56150g = iArr2[i2];
            cVar.f56144a = iArr[i2];
            arrayList.add(cVar);
        }
        if (this instanceof UIShadowProxy) {
            ((UIShadowProxy) this).a(arrayList);
            return;
        }
        d dVar = this.mParent;
        if (dVar instanceof UIShadowProxy) {
            ((UIShadowProxy) dVar).a(arrayList);
        }
    }

    public void setBackgroundData(int i2, ReadableArray readableArray, float[] fArr, float[] fArr2, int[] iArr, int[] iArr2, int[] iArr3) {
        setBackgroundColor(i2);
        e eVar = this.mLynxBackground;
        if (!((readableArray == null || readableArray.size() == 0) && eVar.f56412e == null)) {
            BackgroundDrawable c2 = eVar.c();
            d dVar = c2.f56371f;
            dVar.f56107a.clear();
            dVar.f56108b.clear();
            dVar.f56112f.clear();
            dVar.f56109c.clear();
            dVar.f56111e.clear();
            dVar.f56110d.clear();
            if (!(readableArray == null || readableArray.size() == 0)) {
                dVar.a(readableArray);
                for (float f2 : fArr) {
                    dVar.f56108b.add(new f((double) f2));
                }
                for (float f3 : fArr2) {
                    dVar.f56112f.add(new com.lynx.tasm.behavior.ui.a.i((double) f3));
                }
                int length = iArr.length;
                int i3 = 0;
                while (true) {
                    int i4 = 1;
                    if (i3 >= length) {
                        break;
                    }
                    int i5 = iArr[i3];
                    if (i5 >= 0 && i5 <= 2) {
                        i4 = i5;
                    }
                    dVar.f56109c.add(Integer.valueOf(i4));
                    i3++;
                }
                for (int i6 : iArr2) {
                    dVar.f56111e.add(h.valueOf(i6));
                }
                for (int i7 : iArr3) {
                    if (i7 < 0 || i7 > 2) {
                        dVar.f56110d.add(1);
                    } else {
                        dVar.f56110d.add(Integer.valueOf(i7));
                    }
                }
            }
            c2.invalidateSelf();
        }
        invalidate();
    }

    public void setLayoutData(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Rect rect) {
        this.mLeft = i2;
        this.mTop = i3;
        this.mWidth = i4;
        this.mHeight = i5;
        this.mPaddingLeft = i6;
        this.mPaddingRight = i8;
        this.mPaddingBottom = i9;
        this.mPaddingTop = i7;
        this.mMarginLeft = i10;
        this.mMarginTop = i11;
        this.mMarginRight = i12;
        this.mMarginBottom = i13;
        this.mBound = rect;
        onLayoutUpdated();
        sendLayoutChangeEvent();
    }

    public void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Rect rect) {
        updateLayoutInfo(i2, i3, i4, i5, i6, i7, i8, i9, 0, 0, 0, 0, i10, i11, i12, i13, rect);
        onLayoutUpdated();
    }

    public void updateLayoutInfo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        this.mLeft = i2;
        this.mTop = i3;
        this.mWidth = i4;
        this.mHeight = i5;
        this.mOriginTop = i3;
        this.mOriginLeft = i2;
        this.mPaddingLeft = i6;
        this.mPaddingRight = i8;
        this.mPaddingBottom = i9;
        this.mPaddingTop = i7;
        this.mMarginLeft = i10;
        this.mMarginTop = i11;
        this.mMarginRight = i12;
        this.mMarginBottom = i13;
        this.mBorderTopWidth = i15;
        this.mBorderBottomWidth = i17;
        this.mBorderLeftWidth = i14;
        this.mBorderRightWidth = i16;
        this.mBound = rect;
    }

    public void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        if (this.mContext.q) {
            setLayoutData(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect);
            return;
        }
        updateLayoutInfo(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
        onLayoutUpdated();
        sendLayoutChangeEvent();
    }

    public void setBorderData(float f2, float f3, float f4, float f5, int i2, int i3, int i4, int i5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i6, int i7, int i8, int i9) {
        int i10 = (int) f5;
        this.mBorderLeftWidth = i10;
        int i11 = (int) f3;
        this.mBorderRightWidth = i11;
        int i12 = (int) f2;
        this.mBorderTopWidth = i12;
        int i13 = (int) f4;
        this.mBorderBottomWidth = i13;
        setBorderWidth(1, i10);
        setBorderWidth(2, i11);
        setBorderWidth(3, i12);
        setBorderWidth(4, i13);
        setBorderStyle(1, i5);
        setBorderStyle(2, i3);
        setBorderStyle(3, i2);
        setBorderStyle(4, i4);
        setBorderRadius(1, f6, f7);
        setBorderRadius(2, f8, f9);
        setBorderRadius(3, f10, f11);
        setBorderRadius(4, f12, f13);
        setBorderColor(0, Integer.valueOf(i9));
        setBorderColor(1, Integer.valueOf(i7));
        setBorderColor(2, Integer.valueOf(i6));
        setBorderColor(3, Integer.valueOf(i8));
    }
}
