package com.bytedance.ies.xelement.viewpager.childitem;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.r;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.v;
import h.f.b.l;
import h.w;
import java.util.ArrayList;

public final class LynxTabbarItem extends UIGroup<com.lynx.tasm.behavior.ui.view.a> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f37524e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f37525a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f37526b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f37527c;

    /* renamed from: d  reason: collision with root package name */
    public TabLayout f37528d;

    static {
        Covode.recordClassIndex(22579);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == -906021636 && nextKey.equals("select")) {
                boolean z = false;
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, false);
                }
                setSelect(z);
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(22582);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxTabbarItem f37529a;

        static {
            Covode.recordClassIndex(22583);
        }

        b(LynxTabbarItem lynxTabbarItem) {
            this.f37529a = lynxTabbarItem;
        }

        @Override // com.lynx.tasm.behavior.r
        public final void a() {
            if (this.f37529a.f37525a) {
                this.f37529a.f37525a = false;
                this.f37529a.a();
            }
        }
    }

    public final void a() {
        TabLayout tabLayout;
        Integer num;
        TabLayout.f tabAt;
        if (this.f37526b && (tabLayout = this.f37528d) != null && (num = this.f37527c) != null && (tabAt = tabLayout.getTabAt(num.intValue())) != null) {
            tabAt.a();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        View view = this.mView;
        l.a((Object) view, "");
        ViewParent parent = ((com.lynx.tasm.behavior.ui.view.a) view).getParent();
        if (!(parent instanceof com.bytedance.ies.xelement.viewpager.a)) {
            parent = null;
        }
        com.bytedance.ies.xelement.viewpager.a aVar = (com.bytedance.ies.xelement.viewpager.a) parent;
        if (aVar != null) {
            aVar.setOverflow(getOverflow());
        }
    }

    public LynxTabbarItem(j jVar) {
        super(jVar);
    }

    @m(a = "select")
    public final void setSelect(boolean z) {
        if (this.f37526b != z) {
            this.f37525a = true;
            this.f37526b = z;
            a();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        j jVar = this.mContext;
        if (jVar != null) {
            b bVar = new b(this);
            if (jVar.u == null) {
                jVar.u = new ArrayList();
            }
            jVar.u.add(bVar);
            return new com.lynx.tasm.behavior.ui.view.a(context);
        }
        throw new w("null cannot be cast to non-null type");
    }
}
