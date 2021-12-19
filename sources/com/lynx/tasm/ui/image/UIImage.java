package com.lynx.tasm.ui.image;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.c.b;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.image.AbsUIImage;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.f;
import com.lynx.tasm.ui.image.FrescoImageView;
import com.lynx.tasm.utils.n;

public class UIImage<T extends FrescoImageView> extends AbsUIImage<T> {

    /* renamed from: a  reason: collision with root package name */
    protected b f56884a;

    /* renamed from: b  reason: collision with root package name */
    public int f56885b;

    /* renamed from: c  reason: collision with root package name */
    public int f56886c;

    /* renamed from: d  reason: collision with root package name */
    public String f56887d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f56888e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f56889f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f56890g;

    static {
        Covode.recordClassIndex(35417);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = false;
            int i2 = 0;
            boolean z2 = false;
            boolean z3 = false;
            switch (nextKey.hashCode()) {
                case -1937917490:
                    if (nextKey.equals("cap-insets-scale")) {
                        setCapInsetsScale(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -1338903714:
                    if (nextKey.equals("skip-redirection")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, false);
                        }
                        setSkipRedirection(z);
                        continue;
                    }
                    break;
                case -1138223116:
                    if (nextKey.equals("image-config")) {
                        setImageConfig(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -602643660:
                    if (nextKey.equals("fresco-nine-patch")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setFrescoNinePatch(z3);
                        continue;
                    }
                    break;
                case 313009824:
                    if (nextKey.equals("local-cache")) {
                        setLocalCache(readableMap.isNull(nextKey) ? null : Boolean.valueOf(readableMap.getBoolean(nextKey, false)));
                        continue;
                    }
                    break;
                case 512852970:
                    if (nextKey.equals("subsample")) {
                        setSubSample(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 516005201:
                    if (nextKey.equals("cap-insets")) {
                        setCapInsetsBackUp(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1090746891:
                    if (nextKey.equals("fresco-visible")) {
                        setFrescoVisible(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1245269388:
                    if (nextKey.equals("fresco-attach")) {
                        setFrescoAttach(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1672916293:
                    if (nextKey.equals("fix-fresco-bug")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        fixFrescoWebPBug(z2);
                        continue;
                    }
                    break;
                case 1941332754:
                    if (nextKey.equals("visibility")) {
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 0);
                        }
                        setVisibility(i2);
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void renderIfNeeded() {
        ((FrescoImageView) this.mView).maybeUpdateView();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        super.destroy();
        ((FrescoImageView) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        ((FrescoImageView) this.mView).destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i3 = this.mPaddingRight + this.mBorderRightWidth;
        int i4 = this.mPaddingTop + this.mBorderTopWidth;
        int i5 = this.mPaddingBottom + this.mBorderBottomWidth;
        if ((this.f56886c < getWidth() || this.f56885b < getHeight()) && !hasAnimationRunning()) {
            ((FrescoImageView) this.mView).markDirty();
        }
        ((FrescoImageView) this.mView).setPadding(i2, i4, i3, i5);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        if (this.f56889f) {
            if (this.f56890g) {
                ((FrescoImageView) this.mView).setSrcSkippingRedirection(this.f56887d);
            } else {
                ((FrescoImageView) this.mView).setSrc(this.f56887d);
            }
            this.f56889f = false;
        }
        ((FrescoImageView) this.mView).maybeUpdateView();
    }

    public UIImage(j jVar) {
        super(jVar);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    @m(a = "cap-insets")
    public void setCapInsetsBackUp(String str) {
        setCapInsets(str);
    }

    @m(a = "skip-redirection", f = false)
    public void setSkipRedirection(boolean z) {
        this.f56890g = z;
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setCoverStart(boolean z) {
        ((FrescoImageView) this.mView).setCoverStart(z);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPlaceholder(String str) {
        ((FrescoImageView) this.mView).setPlaceholder(str);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setRepeat(boolean z) {
        ((FrescoImageView) this.mView).setRepeat(z);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setSource(String str) {
        this.f56887d = str;
        this.f56889f = true;
    }

    @m(a = "fix-fresco-bug")
    public void fixFrescoWebPBug(boolean z) {
        if (this.mView != null) {
            ((FrescoImageView) this.mView).fixFrescoWebPBug(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBorderRadiusUpdated(int i2) {
        ((FrescoImageView) this.mView).setBorderRadius(this.mLynxBackground.d());
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setDisableDefaultPlaceholder(boolean z) {
        if (this.mView != null) {
            ((FrescoImageView) this.mView).setDisableDefaultPlaceHolder(z);
        }
    }

    @m(a = "fresco-nine-patch", f = false)
    public void setFrescoNinePatch(boolean z) {
        if (this.mView != null) {
            ((FrescoImageView) this.mView).setFrescoNinePatch(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "image-config")
    public void setImageConfig(String str) {
        super.setImageConfig(str);
        ((FrescoImageView) this.mView).setBitmapConfig(this.mBitmapConfig);
        invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setLoopCount(int i2) {
        if (i2 <= 0) {
            i2 = 0;
        }
        ((FrescoImageView) this.mView).setLoopCount(i2);
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setObjectFit(String str) {
        ((FrescoImageView) this.mView).setScaleType(g.a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T createView(Context context) {
        this.f56884a = c.b();
        T t = (T) new FrescoImageView(context, this.f56884a, null, null);
        t.setNoSubSampleMode(this.f56888e);
        t.setImageLoaderCallback(new d() {
            /* class com.lynx.tasm.ui.image.UIImage.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35420);
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(String str) {
                com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(UIImage.this.getSign(), "error");
                cVar.a("errMsg", str);
                UIImage.this.mContext.f55897e.a(cVar);
                UIImage.this.mContext.f55897e.a(new f(UIImage.this.getSign()));
                UIImage.this.mContext.a(UIImage.this.f56887d, "image", str);
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void b(int i2, int i3) {
                UIImage.this.f56886c = i2;
                UIImage.this.f56885b = i3;
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(int i2, int i3) {
                if (UIImage.this.mEvents != null && UIImage.this.mEvents.containsKey("load")) {
                    com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(UIImage.this.getSign(), "load");
                    cVar.a("height", Integer.valueOf(i3));
                    cVar.a("width", Integer.valueOf(i2));
                    UIImage.this.mContext.f55897e.a(cVar);
                }
            }
        });
        return t;
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setCapInsets(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            ((FrescoImageView) this.mView).setCapInsets(null);
        } else {
            ((FrescoImageView) this.mView).setCapInsets(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    @m(a = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
        if (str == null || str.equalsIgnoreCase("")) {
            ((FrescoImageView) this.mView).setCapInsetsScale(null);
        } else {
            ((FrescoImageView) this.mView).setCapInsetsScale(str);
        }
    }

    @m(a = "local-cache")
    public void setLocalCache(Boolean bool) {
        if (this.mView != null) {
            if (bool == null) {
                ((FrescoImageView) this.mView).setLocalCache(false);
            }
            ((FrescoImageView) this.mView).setLocalCache(bool.booleanValue());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPreFetchHeight(String str) {
        ((FrescoImageView) this.mView).setPreFetchHeight(n.a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.p));
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setPreFetchWidth(String str) {
        ((FrescoImageView) this.mView).setPreFetchWidth(n.a(str, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.p));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    @m(a = "visibility")
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (((FrescoImageView) this.mView).mIsFrescoVisible) {
            ((FrescoImageView) this.mView).setFrescoVisible();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void setBlurRadius(String str) {
        UIBody uIBody = this.mContext.f55901i;
        ((FrescoImageView) this.mView).setBlurRadius(Math.round(n.a(str, uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), this.mContext.p)));
    }

    @m(a = "fresco-attach")
    public void setFrescoAttach(String str) {
        if (str == null) {
            return;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
            ((FrescoImageView) this.mView).mIsFrescoAttach = true;
            ((FrescoImageView) this.mView).setFrescoAttach();
        }
    }

    @m(a = "fresco-visible")
    public void setFrescoVisible(String str) {
        if (str == null) {
            return;
        }
        if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes")) {
            ((FrescoImageView) this.mView).mIsFrescoVisible = true;
            ((FrescoImageView) this.mView).setFrescoVisible();
        }
    }

    @m(a = "subsample")
    public void setSubSample(String str) {
        if (str == null || (!str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no"))) {
            this.f56888e = false;
        } else {
            this.f56888e = true;
        }
        if (this.mView != null) {
            ((FrescoImageView) this.mView).setNoSubSampleMode(this.f56888e);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onBeforeAnimation(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (i4 > this.f56886c || i5 > this.f56885b) {
            ((FrescoImageView) this.mView).tryFetchImage(i4, i5, i6, i7, i8, i9);
        }
    }
}
