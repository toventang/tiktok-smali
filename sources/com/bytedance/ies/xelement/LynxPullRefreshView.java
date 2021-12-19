package com.bytedance.ies.xelement;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.lynx.b.a.a.e;
import com.lynx.b.a.a.f;
import com.lynx.b.a.a.i;
import com.lynx.b.a.g.g;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.v;
import h.f.b.l;

public class LynxPullRefreshView extends UIGroup<com.lynx.b.a.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36534a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private boolean f36535b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36536c = true;

    static {
        Covode.recordClassIndex(21921);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            boolean z = true;
            if (hashCode != -2113012155) {
                if (hashCode == -1813223279 && nextKey.equals("enable-refresh")) {
                    if (!readableMap.isNull(nextKey)) {
                        z = readableMap.getBoolean(nextKey, true);
                    }
                    setEnableRefresh(z);
                }
            } else if (nextKey.equals("enable-loadmore")) {
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, true);
                }
                setEnableLoadMore(z);
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public boolean needCustomLayout() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21924);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class d extends g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPullRefreshView f36539a;

        static {
            Covode.recordClassIndex(21927);
        }

        @Override // com.lynx.b.a.g.g, com.lynx.b.a.g.c
        public final void a() {
            com.lynx.tasm.c cVar;
            j jVar = this.f36539a.mContext;
            if (jVar != null && (cVar = jVar.f55897e) != null) {
                cVar.a(new com.lynx.tasm.c.b(this.f36539a.getSign(), "headerreleased"));
            }
        }

        d(LynxPullRefreshView lynxPullRefreshView) {
            this.f36539a = lynxPullRefreshView;
        }
    }

    public LynxPullRefreshView(j jVar) {
        super(jVar);
    }

    @p
    public void autoStartRefresh(ReadableMap readableMap) {
        l.c(readableMap, "");
        ((com.lynx.b.a.a) this.mView).g();
    }

    @p
    public void finishRefresh(ReadableMap readableMap) {
        l.c(readableMap, "");
        ((com.lynx.b.a.a) this.mView).b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        return new RelativeLayout.LayoutParams(-1, -2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void removeChild(LynxBaseUI lynxBaseUI) {
        l.c(lynxBaseUI, "");
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
        }
    }

    @m(a = "enable-loadmore", f = true)
    public final void setEnableLoadMore(boolean z) {
        this.f36536c = z;
        com.lynx.b.a.a aVar = (com.lynx.b.a.a) this.mView;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    @m(a = "enable-refresh", f = true)
    public final void setEnableRefresh(boolean z) {
        this.f36535b = z;
        com.lynx.b.a.a aVar = (com.lynx.b.a.a) this.mView;
        if (aVar != null) {
            aVar.c(z);
        }
    }

    static final class b implements com.lynx.b.a.g.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPullRefreshView f36537a;

        static {
            Covode.recordClassIndex(21925);
        }

        b(LynxPullRefreshView lynxPullRefreshView) {
            this.f36537a = lynxPullRefreshView;
        }

        @Override // com.lynx.b.a.g.d
        public final void a(i iVar) {
            com.lynx.tasm.c cVar;
            l.c(iVar, "");
            j jVar = this.f36537a.mContext;
            if (jVar != null && (cVar = jVar.f55897e) != null) {
                cVar.a(new com.lynx.tasm.c.b(this.f36537a.getSign(), "startrefresh"));
            }
        }
    }

    static final class c implements com.lynx.b.a.g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxPullRefreshView f36538a;

        static {
            Covode.recordClassIndex(21926);
        }

        c(LynxPullRefreshView lynxPullRefreshView) {
            this.f36538a = lynxPullRefreshView;
        }

        @Override // com.lynx.b.a.g.b
        public final void a_(i iVar) {
            com.lynx.tasm.c cVar;
            l.c(iVar, "");
            j jVar = this.f36538a.mContext;
            if (jVar != null && (cVar = jVar.f55897e) != null) {
                cVar.a(new com.lynx.tasm.c.b(this.f36538a.getSign(), "startloadmore"));
            }
        }
    }

    @p
    public void finishLoadMore(ReadableMap readableMap) {
        l.c(readableMap, "");
        if (readableMap.getBoolean("has_more", true)) {
            ((com.lynx.b.a.a) this.mView).c();
        } else {
            ((com.lynx.b.a.a) this.mView).f();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        if (context == null) {
            return null;
        }
        this.f36535b = true;
        this.f36536c = true;
        com.lynx.b.a.a aVar = new com.lynx.b.a.a(context);
        aVar.c(this.f36535b);
        aVar.b(this.f36536c);
        aVar.a(new b(this));
        aVar.a(new c(this));
        aVar.a((com.lynx.b.a.g.c) new d(this));
        return aVar;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void insertChild(LynxBaseUI lynxBaseUI, int i2) {
        l.c(lynxBaseUI, "");
        onInsertChild(lynxBaseUI, i2);
        if (lynxBaseUI instanceof LynxRefreshHeader) {
            j jVar = this.mContext;
            l.a((Object) jVar, "");
            k kVar = new k(jVar, (byte) 0);
            kVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            com.lynx.tasm.behavior.ui.view.a aVar = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
            l.a((Object) aVar, "");
            l.c(aVar, "");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            kVar.addView(aVar, layoutParams);
            ((com.lynx.b.a.a) this.mView).a((f) kVar);
        } else if (lynxBaseUI instanceof LynxRefreshFooter) {
            j jVar2 = this.mContext;
            l.a((Object) jVar2, "");
            j jVar3 = new j(jVar2, (byte) 0);
            jVar3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            com.lynx.tasm.behavior.ui.view.a aVar2 = (com.lynx.tasm.behavior.ui.view.a) ((LynxUI) lynxBaseUI).mView;
            l.a((Object) aVar2, "");
            l.c(aVar2, "");
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(13);
            jVar3.addView(aVar2, layoutParams2);
            ((com.lynx.b.a.a) this.mView).a((e) jVar3);
        } else if (lynxBaseUI instanceof LynxUI) {
            ((com.lynx.b.a.a) this.mView).a(((LynxUI) lynxBaseUI).mView);
        }
    }
}
