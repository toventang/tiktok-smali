package com.lynx.tasm.behavior.ui.text;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.react.bridge.a;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.shadow.text.q;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.v;

public class UIText extends LynxUI<AndroidText> {
    static {
        Covode.recordClassIndex(35176);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != 94842723) {
                if (hashCode == 315007413 && nextKey.equals("accessibility-label")) {
                    setAccessibilityLabel(readableMap.getDynamic(nextKey));
                }
            } else if (nextKey.equals(b.f37372a)) {
                setColor(readableMap.getDynamic(nextKey));
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        if (!TextUtils.isEmpty(accessibilityLabel)) {
            return accessibilityLabel;
        }
        return ((AndroidText) this.mView).getText();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i3 = this.mPaddingRight + this.mBorderRightWidth;
        ((AndroidText) this.mView).setPadding(i2, this.mPaddingTop + this.mBorderTopWidth, i3, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    public UIText(j jVar) {
        super(jVar);
        this.mAccessibilityElementStatus = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AndroidText createView(Context context) {
        return new AndroidText(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateExtraData(Object obj) {
        if (obj instanceof q) {
            ((AndroidText) this.mView).setTextBundle((q) obj);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    @m(a = "accessibility-label")
    public void setAccessibilityLabel(a aVar) {
        super.setAccessibilityLabel(aVar);
        if (this.mView != null) {
            ((AndroidText) this.mView).setFocusable(true);
            ((AndroidText) this.mView).setContentDescription(getAccessibilityLabel());
        }
    }

    @m(a = b.f37372a)
    public void setColor(a aVar) {
        if (aVar.h() == ReadableType.Array) {
            ((AndroidText) this.mView).setTextGradient(aVar.f());
        } else {
            ((AndroidText) this.mView).setTextGradient((ReadableArray) null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public com.lynx.tasm.behavior.a.a hitTest(float f2, float f3) {
        Spanned spanned;
        if (this.mView == null) {
            return this;
        }
        Layout layout = ((AndroidText) this.mView).mTextLayout;
        AndroidText androidText = (AndroidText) this.mView;
        if (androidText == null || !(androidText.getText() instanceof Spanned)) {
            spanned = null;
        } else {
            spanned = (Spanned) androidText.getText();
        }
        return b.a(f2, f3, this, layout, spanned);
    }
}
