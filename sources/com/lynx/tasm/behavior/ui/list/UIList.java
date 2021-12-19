package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.ac;
import androidx.recyclerview.widget.y;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.list.f;
import com.lynx.tasm.behavior.ui.list.i;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.v;
import java.lang.ref.WeakReference;
import java.util.Map;

public class UIList extends AbsLynxList<RecyclerView> {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f56161h;

    /* renamed from: c  reason: collision with root package name */
    public i f56162c;

    /* renamed from: d  reason: collision with root package name */
    public int f56163d = 1;

    /* renamed from: e  reason: collision with root package name */
    e f56164e;

    /* renamed from: f  reason: collision with root package name */
    boolean f56165f = true;

    /* renamed from: g  reason: collision with root package name */
    public ViewGroup f56166g;

    /* renamed from: i  reason: collision with root package name */
    private String f56167i = "single";

    /* renamed from: j  reason: collision with root package name */
    private boolean f56168j = true;

    /* renamed from: k  reason: collision with root package name */
    private f f56169k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f56170l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f56171m;
    private ac n;
    private g o;
    private a p;
    private int q = -1;

    static {
        Covode.recordClassIndex(35107);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void dispatchProperties(v vVar) {
        ReadableMap readableMap = vVar.f56468a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            int hashCode = nextKey.hashCode();
            if (hashCode != -1035189822) {
                if (hashCode != 1683042429) {
                    if (hashCode == 1816872768 && nextKey.equals("auto-measure")) {
                        setAutoMeasure(readableMap.getDynamic(nextKey));
                    }
                } else if (nextKey.equals("android-diffable")) {
                    setDiffable(readableMap.getDynamic(nextKey));
                }
            } else if (nextKey.equals("enable-new-exposure-strategy")) {
                boolean z = false;
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, false);
                }
                setNewAppear(z);
            }
            super.dispatchProperties(vVar);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setCacheQueueRatio(com.lynx.react.bridge.a aVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollStateChangeEventThrottle(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollX(com.lynx.react.bridge.a aVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollY(com.lynx.react.bridge.a aVar) {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i2 = this.mPaddingTop + this.mBorderTopWidth;
        int i3 = this.mPaddingBottom + this.mBorderBottomWidth;
        ((RecyclerView) this.mView).setPadding(this.mPaddingLeft + this.mBorderLeftWidth, i2, this.mPaddingRight + this.mBorderRightWidth, i3);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.d
    public void requestLayout() {
        ((RecyclerView) this.mView).requestLayout();
        if (!((RecyclerView) this.mView).isLayoutRequested()) {
            final View view = this.mView;
            ((RecyclerView) this.mView).post(new Runnable() {
                /* class com.lynx.tasm.behavior.ui.list.UIList.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35110);
                }

                public final void run() {
                    view.requestLayout();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        LLog.b("UIList", "onLayoutCompleted " + this.f56162c.f56253f.size());
        if (this.f56171m && ((RecyclerView) this.mView).getChildCount() > 0) {
            this.f56164e.a(this.f56162c.f56253f);
            this.f56171m = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void layout() {
        boolean isLayoutRequested;
        TraceEvent.a(0, "UIList.layout");
        ViewGroup viewGroup = this.f56166g;
        if (viewGroup != null) {
            isLayoutRequested = viewGroup.isLayoutRequested();
        } else {
            isLayoutRequested = ((RecyclerView) this.mView).isLayoutRequested();
        }
        if (!isLayoutRequested) {
            TraceEvent.b(0, "UIList.layout");
            return;
        }
        layoutChildren();
        ViewGroup viewGroup2 = this.f56166g;
        if (viewGroup2 != null) {
            viewGroup2.layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        } else {
            ((RecyclerView) this.mView).layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        }
        androidx.core.h.v.a(this.mView, getBoundRectForOverflow());
        this.p.a();
        TraceEvent.b(0, "UIList.layout");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, com.lynx.tasm.behavior.ui.UIGroup
    public void measure() {
        boolean isLayoutRequested;
        int makeMeasureSpec;
        TraceEvent.a(0, "UIList.measure");
        ViewGroup viewGroup = this.f56166g;
        if (viewGroup != null) {
            isLayoutRequested = viewGroup.isLayoutRequested();
        } else {
            isLayoutRequested = ((RecyclerView) this.mView).isLayoutRequested();
        }
        if (!isLayoutRequested) {
            TraceEvent.b(0, "UIList.measure");
            return;
        }
        measureChildren();
        setLayoutParamsInternal();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        if (this.f56170l) {
            if (f56161h) {
                LLog.b("UIList", "UIList autoMeasure maxHeight " + this.mMaxHeight);
            }
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) this.mMaxHeight, Integer.MIN_VALUE);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824);
        }
        ViewGroup viewGroup2 = this.f56166g;
        if (viewGroup2 != null) {
            viewGroup2.measure(makeMeasureSpec2, makeMeasureSpec);
        } else {
            ((RecyclerView) this.mView).measure(makeMeasureSpec2, makeMeasureSpec);
        }
        this.f56162c.f56252e = true;
        TraceEvent.b(0, "UIList.measure");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        boolean z;
        int size;
        RecyclerView.i iVar;
        super.onPropsUpdated();
        if (((RecyclerView) this.mView).getAdapter() == null) {
            ((RecyclerView) this.mView).setAdapter(this.f56162c);
        }
        i iVar2 = this.f56162c;
        if (iVar2.f56253f == null || iVar2.f56254g == null || iVar2.f56253f.size() != iVar2.f56254g.size()) {
            z = false;
        } else {
            z = true;
        }
        JavaOnlyMap a2 = iVar2.f56250c.a();
        if (a2 != null) {
            iVar2.f56254g = a2.getArray("fullspan");
            iVar2.f56253f = a2.getArray("viewTypes");
            iVar2.f56255h = a2.getArray("stickyTop");
            iVar2.f56256i = a2.getArray("stickyBottom");
            iVar2.f56257j = a2.getArray("estimatedHeight");
            boolean z2 = a2.getBoolean("diffable");
            iVar2.f56251d = a2.getBoolean("newarch");
            for (int i2 = 0; i2 < iVar2.f56253f.size(); i2++) {
                String string = iVar2.f56253f.getString(i2);
                if (!iVar2.f56248a.containsKey(string)) {
                    iVar2.f56248a.put(string, Integer.valueOf(iVar2.f56248a.size()));
                }
            }
            if (z || !z2 || !iVar2.f56252e) {
                iVar2.notifyDataSetChanged();
            } else {
                i.a aVar = iVar2.f56258k;
                ReadableMap map = a2.getMap("diffResult");
                aVar.f56261a = map.getArray("insertions");
                aVar.f56262b = map.getArray("removals");
                aVar.f56263c = map.getArray("updateFrom");
                aVar.f56264d = map.getArray("updateTo");
                aVar.f56265e = map.getArray("moveFrom");
                aVar.f56266f = map.getArray("moveTo");
                if (aVar.f56261a.size() > 0 || aVar.f56262b.size() > 0 || aVar.f56263c.size() > 0 || aVar.f56264d.size() > 0 || aVar.f56265e.size() > 0 || aVar.f56266f.size() > 0) {
                    i.this.f56252e = false;
                }
                i.a aVar2 = iVar2.f56258k;
                for (int i3 = 0; i3 < aVar2.f56263c.size(); i3++) {
                    i.this.notifyItemChanged(aVar2.f56263c.getInt(i3), Integer.valueOf(aVar2.f56264d.getInt(i3)));
                }
                for (int i4 = 0; i4 < aVar2.f56265e.size(); i4++) {
                    i.this.notifyItemMoved(aVar2.f56265e.getInt(i4), aVar2.f56266f.getInt(i4));
                }
                for (int size2 = aVar2.f56262b.size() - 1; size2 >= 0; size2--) {
                    i.this.notifyItemRemoved(aVar2.f56262b.getInt(size2));
                }
                for (int i5 = 0; i5 < aVar2.f56261a.size(); i5++) {
                    i.this.notifyItemInserted(aVar2.f56261a.getInt(i5));
                }
            }
        }
        if (this.f56168j) {
            new WeakReference(this);
            if (TextUtils.equals(this.f56167i, "single")) {
                iVar = new ListLayoutManager.ListLinearLayoutManager(this);
            } else if (TextUtils.equals(this.f56167i, "flow")) {
                iVar = new ListLayoutManager.ListGridLayoutManager(this.mContext, this.f56163d, this);
            } else if (TextUtils.equals(this.f56167i, "waterfall")) {
                iVar = new ListLayoutManager.a(this.f56163d, this);
                this.f56162c.f56259l = true;
            } else {
                iVar = null;
            }
            g gVar = this.o;
            if (gVar != null) {
                if (gVar.f56233b.f56242b != -1) {
                    gVar.a(gVar.f56233b);
                }
                if (gVar.f56234c.f56242b != -1) {
                    gVar.a(gVar.f56234c);
                }
            }
            ((RecyclerView) this.mView).setLayoutManager(iVar);
        }
        this.f56168j = false;
        if (((RecyclerView) this.mView).getLayoutManager() instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.mView).getLayoutManager();
            gridLayoutManager.a(new GridLayoutManager.c() {
                /* class com.lynx.tasm.behavior.ui.list.UIList.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35111);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.c
                public final int a(int i2) {
                    if (!UIList.this.f56162c.a(i2) || UIList.this.f56163d <= 1) {
                        return 1;
                    }
                    return gridLayoutManager.f3760b;
                }
            });
        }
        if (this.f56162c.f56253f == null) {
            size = 0;
        } else {
            size = this.f56162c.f56253f.size();
        }
        int i6 = this.q;
        if (size > i6 && i6 >= 0) {
            this.f56169k.a(i6, 0, null);
            this.q = -1;
        }
        LLog.b("UIList", "onPropsUpdated viewNames ".concat(String.valueOf(size)));
        if (this.f56164e.a()) {
            this.f56171m = true;
        }
    }

    /* access modifiers changed from: protected */
    public RecyclerView a(Context context) {
        return new a(context, this);
    }

    @m(a = "auto-measure", b = "false")
    public void setAutoMeasure(com.lynx.react.bridge.a aVar) {
        this.f56170l = e.a(aVar, false);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setInitialScrollIndex(com.lynx.react.bridge.a aVar) {
        this.q = e.a(aVar, -1);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setNeedVisibleCells(boolean z) {
        this.f56164e.f56213g = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollEnable(com.lynx.react.bridge.a aVar) {
        this.f56165f = e.a(aVar, true);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setLowerThreshold(com.lynx.react.bridge.a aVar) {
        this.f56164e.f56210d = e.a(aVar, 50);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setLowerThresholdItemCount(com.lynx.react.bridge.a aVar) {
        this.f56164e.f56212f = e.a(aVar, 0);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setScrollEventThrottle(com.lynx.react.bridge.a aVar) {
        this.f56164e.f56208b = e.a(aVar, 200);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setUpperThreshold(com.lynx.react.bridge.a aVar) {
        this.f56164e.f56209c = e.a(aVar, 50);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setUpperThresholdItemCount(com.lynx.react.bridge.a aVar) {
        this.f56164e.f56211e = e.a(aVar, 0);
    }

    public UIList(j jVar) {
        super(jVar);
        if (f56161h) {
            LLog.a(4, "UIList", "UIList init");
        }
    }

    @m(a = "android-diffable", b = "true")
    public void setDiffable(com.lynx.react.bridge.a aVar) {
        if (((RecyclerView) this.mView).getAdapter() == null) {
            this.f56162c.setHasStableIds(!e.a(aVar, true));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setEnableSticky(com.lynx.react.bridge.a aVar) {
        if (e.a(aVar, false) && this.f56166g == null) {
            g gVar = new g(this);
            this.o = gVar;
            this.f56166g = gVar.f56232a;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setListType(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "single";
        }
        if (!TextUtils.equals(str, this.f56167i)) {
            this.f56168j = true;
            this.f56167i = str;
        }
    }

    @m(a = "enable-new-exposure-strategy", f = false)
    public void setNewAppear(boolean z) {
        a aVar = this.p;
        if (z != aVar.f56179d) {
            aVar.f56179d = z;
            if (z) {
                aVar.f56178c = new c(aVar.f56176a, aVar.f56177b);
            } else {
                aVar.f56178c = new b(aVar.f56176a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a extends RecyclerView {
        private WeakReference<j> O;
        private WeakReference<LynxBaseUI> P;

        static {
            Covode.recordClassIndex(35112);
        }

        private void d(boolean z) {
            WeakReference<j> weakReference = this.O;
            if (weakReference != null && this.P != null) {
                j jVar = weakReference.get();
                LynxBaseUI lynxBaseUI = this.P.get();
                if (z && jVar != null && lynxBaseUI != null) {
                    jVar.a(lynxBaseUI);
                }
            }
        }

        public a(Context context, LynxBaseUI lynxBaseUI) {
            super(context);
            if (context != null && (context instanceof j)) {
                this.O = new WeakReference<>(context);
                this.P = new WeakReference<>(lynxBaseUI);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
            boolean dispatchNestedPreScroll = super.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
            d(dispatchNestedPreScroll);
            return dispatchNestedPreScroll;
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public final boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
            boolean a2 = super.a(i2, i3, iArr, iArr2, i4);
            d(a2);
            return a2;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ View createView(Context context) {
        RecyclerView a2 = a(context);
        a2.setClipToPadding(false);
        this.f56164e = new e(this.mContext.f55897e, a2, this);
        this.p = new a(this.mContext.f55897e, a2);
        a2.setItemAnimator(null);
        this.f56162c = new i(this, this.p);
        this.f56169k = new f(context, a2);
        return a2;
    }

    @p
    public void getVisibleCells(Callback callback) {
        if (callback == null) {
            LLog.a(4, "UIList", "getVisibleCells with null callback");
            return;
        }
        callback.invoke(0, this.f56164e.b());
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setColumnCount(int i2) {
        this.f56163d = i2;
        RecyclerView.i layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).a(this.f56163d);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            ((StaggeredGridLayoutManager) layoutManager).a(this.f56163d);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setEnablePagerSnap(com.lynx.react.bridge.a aVar) {
        if (e.a(aVar, false)) {
            if (this.n == null) {
                this.n = new y();
            }
            this.n.a((RecyclerView) this.mView);
            return;
        }
        ac acVar = this.n;
        if (acVar != null) {
            acVar.a((RecyclerView) null);
            this.n = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public void setUpdateAnimation(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "none")) {
            ((RecyclerView) this.mView).setItemAnimator(null);
        }
        if (TextUtils.equals(str, "default")) {
            ((RecyclerView) this.mView).setItemAnimator(new androidx.recyclerview.widget.i());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setEvents(Map<String, com.lynx.tasm.c.a> map) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        e eVar = this.f56164e;
        eVar.f56207a = 0;
        if (map != null) {
            if (map.containsKey("scroll")) {
                i2 = eVar.f56207a | 1;
            } else {
                i2 = eVar.f56207a;
            }
            eVar.f56207a = i2;
            if (map.containsKey("scrolltoupper")) {
                i3 = eVar.f56207a | 2;
            } else {
                i3 = eVar.f56207a;
            }
            eVar.f56207a = i3;
            if (map.containsKey("scrolltolower")) {
                i4 = eVar.f56207a | 4;
            } else {
                i4 = eVar.f56207a;
            }
            eVar.f56207a = i4;
            if (map.containsKey("scrollstatechange")) {
                i5 = eVar.f56207a | 8;
            } else {
                i5 = eVar.f56207a;
            }
            eVar.f56207a = i5;
            if (map.containsKey("layoutcomplete")) {
                i6 = eVar.f56207a | 16;
            } else {
                i6 = eVar.f56207a;
            }
            eVar.f56207a = i6;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutFinish(long j2) {
        boolean z;
        boolean z2;
        i iVar = this.f56162c;
        if (f56161h) {
            LLog.b("UIList", "Adapter onLayoutFinish " + (65535 & j2));
        }
        h remove = iVar.f56249b.remove(Long.valueOf(j2));
        if (remove != null) {
            UIComponent uIComponent = remove.f56243a.f56245b;
            if (uIComponent != null) {
                uIComponent.setTop(0);
                uIComponent.setLeft(0);
                uIComponent.requestLayout();
                if (uIComponent.getWidth() != remove.itemView.getWidth()) {
                    z = true;
                } else {
                    z = false;
                }
                if (uIComponent.getHeight() != remove.itemView.getHeight()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    remove.itemView.requestLayout();
                }
                if (f56161h) {
                    LLog.b("UIList", com.a.a("UIComponent layout finish, position %d (w %d, h %d)", new Object[]{Integer.valueOf(remove.getAdapterPosition()), Integer.valueOf(uIComponent.getWidth()), Integer.valueOf(uIComponent.getHeight())}));
                }
            }
            remove.f56243a.f56244a = 2;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList, com.lynx.tasm.behavior.ui.UIGroup
    public void onInsertChild(LynxBaseUI lynxBaseUI, int i2) {
        if (f56161h) {
            LLog.b("UIList", "insertChild index: " + i2 + " child: " + lynxBaseUI);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034 A[RETURN] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.lynx.tasm.behavior.a.a hitTest(float r6, float r7) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.UIList.hitTest(float, float):com.lynx.tasm.behavior.a.a");
    }

    @p
    public void scrollToPosition(ReadableMap readableMap, Callback callback) {
        int height;
        if (this.f56162c == null) {
            callback.invoke(1, "scrollToPosition before init");
            return;
        }
        int i2 = readableMap.getInt("position", 0);
        int a2 = (int) com.lynx.tasm.utils.j.a((float) readableMap.getDouble("offset", 0.0d));
        boolean z = readableMap.getBoolean("smooth", false);
        int a3 = (int) com.lynx.tasm.utils.j.a((float) readableMap.getDouble("itemHeight", 0.0d));
        String string = readableMap.getString("alignTo", "none");
        if (i2 < 0 || i2 > this.f56162c.getItemCount()) {
            callback.invoke(4, "position < 0 or position >= data count");
        } else if (z) {
            f.a aVar = this.f56169k.f56221b;
            RecyclerView recyclerView = aVar.f56223a.get();
            if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
                aVar.f56229g = false;
                callback.invoke("can not scroll before init");
                return;
            }
            aVar.f56224b = callback;
            aVar.f56225c = i2;
            aVar.f56226d = string;
            aVar.f56227e = a2;
            aVar.f56228f = null;
            if (!aVar.f56229g) {
                aVar.f56229g = true;
                recyclerView.post(aVar);
            }
        } else {
            if (TextUtils.equals(string, "middle")) {
                height = (((RecyclerView) this.mView).getHeight() - a3) / 2;
            } else {
                if (TextUtils.equals(string, "bottom")) {
                    height = ((RecyclerView) this.mView).getHeight() - a3;
                }
                this.f56169k.a(i2, a2, callback);
            }
            a2 += height;
            this.f56169k.a(i2, a2, callback);
        }
    }
}
