package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.alog.c;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.xsearch.b;
import com.ss.android.ugc.aweme.xsearch.horizontallist.b;
import com.ss.android.ugc.aweme.xsearch.horizontallist.g;
import f.a.h;
import h.f.b.l;
import java.util.List;
import java.util.Set;

public final class LynxSearchHorizontal extends UISimpleView<g> implements b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f145160b = new a((byte) 0);

    static {
        Covode.recordClassIndex(94920);
    }

    @m(a = "anchormargin")
    public final void anchorMarginFromLynx(String str) {
    }

    @m(a = "anchortype")
    public final void anchorTypeFromLynx(String str) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94921);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @p
    public final void becomeactive() {
        g gVar = (g) this.mView;
        gVar.f145182e.a(true);
        i iVar = gVar.f145182e;
        c.a(1, "HorizontalContainer", "SearchHorizontalInnerContainer:  attachAutoPlay");
        iVar.f145205e.f145229b.notifyDataSetChanged();
        gVar.f145182e.b();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void initialize() {
        super.initialize();
        ((g) this.mView).setEventChangeListener(new b(this, (Set) b.C3858b.f145165a.getValue()));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void layout() {
        l.d("LynxSearchHorizontal layout", "");
        super.layout();
        getLeft();
        getTop();
        getWidth();
        getHeight();
        getBound();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public final void measure() {
        l.d("LynxSearchHorizontal measure", "");
        super.measure();
        getWidth();
        getHeight();
    }

    @p
    public final void resignactive() {
        g gVar = (g) this.mView;
        gVar.f145182e.a(false);
        i iVar = gVar.f145182e;
        c.a(1, "HorizontalContainer", "SearchHorizontalInnerContainer:  detachAutoPlay");
        iVar.f145205e.f145229b.notifyDataSetChanged();
    }

    public LynxSearchHorizontal(j jVar) {
        super(jVar);
    }

    @m(a = "sessionid")
    public final void setSessionIdFromLynx(int i2) {
        ((g) this.mView).setSessionIdFromLynx(i2);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        if (context == null) {
            l.b();
        }
        return new g(context, (byte) 0);
    }

    @m(a = "logextra")
    public final void logExtraFromLynx(ReadableMap readableMap) {
        g gVar = (g) this.mView;
        if (readableMap != null) {
            gVar.f145182e.f145202b = readableMap;
            gVar.f145179b = true;
        }
    }

    @m(a = "activearea")
    public final void activeAreaFromLynx(ReadableMap readableMap) {
        l holderWrapper;
        g gVar = (g) this.mView;
        if ((readableMap instanceof JavaOnlyMap) && (holderWrapper = gVar.getHolderWrapper()) != null) {
            gVar.a((JavaOnlyMap) readableMap, b.a.class, new g.b(holderWrapper));
        }
    }

    @m(a = "horizontalstyle")
    public final void horizontalStyleFromLynx(ReadableMap readableMap) {
        g gVar = (g) this.mView;
        if (!(readableMap instanceof JavaOnlyMap)) {
            gVar.f145181d = true;
            return;
        }
        l holderWrapper = gVar.getHolderWrapper();
        if (holderWrapper != null) {
            gVar.a((JavaOnlyMap) readableMap, b.c.class, new g.i(holderWrapper, gVar, readableMap));
        }
    }

    @p
    public final void scrolltoindex(ReadableMap readableMap) {
        new StringBuilder("scrolltoindex: anchorInfo: { ").append(readableMap).append(" }");
    }

    @m(a = "datalist")
    public final void bind(ReadableMap readableMap) {
        g gVar = (g) this.mView;
        if (readableMap != null) {
            f.a.b.b a2 = h.a(readableMap).b(new g.c(gVar)).b(f.a.h.a.a(f.a.k.a.f158005b)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new g.d(gVar), g.e.f145187a, new g.f(gVar, gVar.getDisposableList().size()));
            List<f.a.b.b> disposableList = gVar.getDisposableList();
            l.b(a2, "");
            disposableList.add(a2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        l.d("LynxSearchHorizontal updateLayout", "");
        super.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayoutInfo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Rect rect) {
        l.d("LynxSearchHorizontal updateLayoutInfo", "");
        super.updateLayoutInfo(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, rect);
    }
}
