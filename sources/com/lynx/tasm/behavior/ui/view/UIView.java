package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c.e;
import java.util.HashMap;

public class UIView extends UISimpleView<a> {
    static {
        Covode.recordClassIndex(35207);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -1389119727 && nextKey.equals("impression_id")) {
                setImpressionId(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public a a(Context context) {
        return new a(context);
    }

    @m(a = "impression_id")
    public void setImpressionId(String str) {
        ((a) this.mView).setImpressionId(str);
    }

    public UIView(j jVar) {
        super(jVar);
        if (jVar.s) {
            this.mOverflow = 3;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        a a2 = a(context);
        a2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.behavior.ui.view.UIView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35210);
            }

            public final void onViewAttachedToWindow(View view) {
                if (view == UIView.this.mView && UIView.this.mEvents != null && UIView.this.mEvents.containsKey("attach")) {
                    e eVar = new e(UIView.this.getSign(), "attach");
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("impression_id", ((a) UIView.this.mView).getImpressionId());
                    eVar.a("params", hashMap);
                    UIView.this.mContext.f55897e.a(eVar);
                }
            }

            public final void onViewDetachedFromWindow(View view) {
                if (view == UIView.this.mView && UIView.this.mEvents != null && UIView.this.mEvents.containsKey("detach")) {
                    e eVar = new e(UIView.this.getSign(), "detach");
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("impression_id", ((a) UIView.this.mView).getImpressionId());
                    eVar.a("params", hashMap);
                    UIView.this.mContext.f55897e.a(eVar);
                }
            }
        });
        return a2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateAttributes(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.equals("impression_id")) {
                ((a) this.mView).setImpressionId(readableMap.getString(nextKey));
                return;
            }
        }
        super.updateAttributes(vVar);
    }
}
