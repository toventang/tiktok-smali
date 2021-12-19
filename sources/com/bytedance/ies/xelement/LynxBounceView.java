package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import h.f.b.l;

public final class LynxBounceView extends UISimpleView<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36521b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36522a = "right";

    static {
        Covode.recordClassIndex(21909);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -962590849 && nextKey.equals("direction")) {
                setDirection(readableMap.getDynamic(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21912);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBounceView(Context context) {
        super(context);
        l.c(context, "");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        l.c(context, "");
        return new com.lynx.tasm.behavior.ui.view.a(context);
    }

    @m(a = "direction", b = "right")
    public final void setDirection(com.lynx.react.bridge.a aVar) {
        l.c(aVar, "");
        if (aVar.h() == ReadableType.String) {
            String e2 = aVar.e();
            l.a((Object) e2, "");
            this.f36522a = e2;
        }
    }
}
