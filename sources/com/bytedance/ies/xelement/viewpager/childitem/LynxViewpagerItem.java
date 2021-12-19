package com.bytedance.ies.xelement.viewpager.childitem;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.v;
import com.lynx.tasm.c;
import h.f.b.l;
import java.util.Map;

public final class LynxViewpagerItem extends UIGroup<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37530c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f37531a;

    /* renamed from: b  reason: collision with root package name */
    public b f37532b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37533d;

    public interface b {
        static {
            Covode.recordClassIndex(22588);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(22584);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 114586 && nextKey.equals("tag")) {
                setTag(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22587);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        return new com.lynx.tasm.behavior.ui.view.a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxViewpagerItem(j jVar) {
        super(jVar);
        l.c(jVar, "");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f37533d = map.containsKey("attach");
        }
    }

    @m(a = "tag")
    public final void setTag(String str) {
        l.c(str, "");
        this.f37531a = str;
        b bVar = this.f37532b;
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public final void a(boolean z, int i2) {
        if (this.f37533d) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            c cVar = jVar.f55897e;
            com.lynx.tasm.c.c cVar2 = new com.lynx.tasm.c.c(getSign(), "attach");
            cVar2.a("attach", Boolean.valueOf(z));
            cVar2.a("tag", String.valueOf(this.f37531a));
            cVar2.a("index", Integer.valueOf(i2));
            cVar.a(cVar2);
        }
    }
}
