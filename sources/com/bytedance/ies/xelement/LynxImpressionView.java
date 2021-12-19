package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import java.util.Map;

public class LynxImpressionView extends UISimpleView<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f36523c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f36524d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    boolean f36525a;

    /* renamed from: b  reason: collision with root package name */
    boolean f36526b;

    /* renamed from: e  reason: collision with root package name */
    private int f36527e;

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 788775041 && nextKey.equals("impression-percent")) {
                int i2 = 0;
                if (!readableMap.isNull(nextKey)) {
                    i2 = readableMap.getInt(nextKey, 0);
                }
                impressionPercent(i2);
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21916);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(21913);
        String simpleName = LynxImpressionView.class.getSimpleName();
        l.a((Object) simpleName, "");
        f36523c = simpleName;
    }

    @m(a = "impression-percent", e = 0)
    public void impressionPercent(int i2) {
        this.f36527e = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxImpressionView(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        l.c(context, "");
        return new com.lynx.tasm.behavior.ui.view.a(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, ? extends com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f36525a = map.containsKey("impression");
            this.f36526b = map.containsKey("exit");
        }
    }
}
