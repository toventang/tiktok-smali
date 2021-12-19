package com.lynx.tasm.ui.image;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.f;
import com.lynx.tasm.utils.ColorUtils;
import com.lynx.tasm.utils.n;

public class UIFilterImage extends UIImage<FrescoFilterImageView> {
    static {
        Covode.recordClassIndex(35413);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.image.AbsUIImage
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -992552514 && nextKey.equals("drop-shadow")) {
                setDropShadow(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.ui.image.UIImage
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        ((FrescoFilterImageView) this.mView).markShadowDirty();
    }

    public UIFilterImage(j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public FrescoFilterImageView createView(Context context) {
        this.f56884a = c.b();
        FrescoFilterImageView frescoFilterImageView = new FrescoFilterImageView(context, this.f56884a, null, null);
        frescoFilterImageView.setImageLoaderCallback(new d() {
            /* class com.lynx.tasm.ui.image.UIFilterImage.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35416);
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(String str) {
                com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(UIFilterImage.this.getSign(), "error");
                cVar.a("errMsg", str);
                UIFilterImage.this.mContext.f55897e.a(cVar);
                UIFilterImage.this.mContext.f55897e.a(new f(UIFilterImage.this.getSign()));
            }

            @Override // com.lynx.tasm.ui.image.d
            public final void a(int i2, int i3) {
                if (UIFilterImage.this.mEvents != null && UIFilterImage.this.mEvents.containsKey("load")) {
                    com.lynx.tasm.c.c cVar = new com.lynx.tasm.c.c(UIFilterImage.this.getSign(), "load");
                    cVar.a("height", Integer.valueOf(i3));
                    cVar.a("width", Integer.valueOf(i2));
                    UIFilterImage.this.mContext.f55897e.a(cVar);
                }
            }
        });
        return frescoFilterImageView;
    }

    @m(a = "drop-shadow")
    public void setDropShadow(String str) {
        if (str == null) {
            ((FrescoFilterImageView) this.mView).setShadowOffsetX(0);
            ((FrescoFilterImageView) this.mView).setShadowOffsetY(0);
            ((FrescoFilterImageView) this.mView).setShadowColor(0);
            ((FrescoFilterImageView) this.mView).setShadowRadius(0);
            return;
        }
        String[] split = str.split(" +");
        try {
            if (split.length == 4) {
                UIBody uIBody = this.mContext.f55901i;
                ((FrescoFilterImageView) this.mView).setShadowOffsetX(Math.round(n.a(split[0], uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, this.mContext.p)));
                ((FrescoFilterImageView) this.mView).setShadowOffsetY(Math.round(n.a(split[1], uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, this.mContext.p)));
                ((FrescoFilterImageView) this.mView).setShadowRadius(Math.round(n.a(split[2], uIBody.mFontSize, this.mFontSize, (float) uIBody.getWidth(), (float) uIBody.getHeight(), 0.0f, this.mContext.p)));
                ((FrescoFilterImageView) this.mView).setShadowColor(ColorUtils.a(split[3]));
                return;
            }
        } catch (Exception unused) {
            if (1 == 0) {
                return;
            }
        }
        LLog.a(5, "UIShadowImage", "Parse error for drop-shadow!");
    }
}
