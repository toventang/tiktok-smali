package com.ss.android.ugc.tools.view.widget.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.b;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d extends FrameLayout implements b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, View> f150372a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<a, b<ViewGroup, View>> f150373b;

    /* renamed from: c  reason: collision with root package name */
    private a f150374c;

    static {
        Covode.recordClassIndex(98905);
    }

    @Override // com.ss.android.ugc.tools.view.widget.b.b
    public final a getState() {
        return this.f150374c;
    }

    public final void setState(a aVar) {
        l.d(aVar, "");
        View view = this.f150372a.get(this.f150374c);
        if (view != null) {
            view.setVisibility(8);
        }
        this.f150374c = aVar;
        b<ViewGroup, View> bVar = this.f150373b.get(aVar);
        if (bVar != null) {
            if (!this.f150372a.containsKey(this.f150374c)) {
                View invoke = bVar.invoke(this);
                invoke.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                addView(invoke);
                this.f150372a.put(this.f150374c, invoke);
            }
            View view2 = this.f150372a.get(this.f150374c);
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    public final void a(a aVar, b<? super ViewGroup, ? extends View> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        this.f150373b.put(aVar, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private d(Context context, Map<a, ? extends b<? super ViewGroup, ? extends View>> map, a aVar) {
        super(context, null);
        l.d(context, "");
        l.d(map, "");
        l.d(aVar, "");
        MethodCollector.i(5329);
        this.f150372a = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f150373b = linkedHashMap;
        linkedHashMap.putAll(map);
        this.f150374c = aVar;
        MethodCollector.o(5329);
    }

    public /* synthetic */ d(Context context, Map map, a aVar, byte b2) {
        this(context, map, aVar);
    }
}
