package com.bytedance.ies.powerlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.a.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.b.a;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import com.bytedance.ies.powerlist.page.b;
import com.bytedance.ies.powerlist.page.config.c;
import h.a.i;
import h.a.n;
import h.f.b.l;
import h.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PowerList extends RecyclerView implements View.OnAttachStateChangeListener {
    public PowerAdapter O;

    static {
        Covode.recordClassIndex(20462);
    }

    public PowerStub getPrimaryStub() {
        return this.O.g();
    }

    public int getFooterCount() {
        return getPrimaryStub().b();
    }

    public int getHeaderCount() {
        return getPrimaryStub().a();
    }

    public f<a> getState() {
        PowerAdapter powerAdapter = this.O;
        if (!powerAdapter.f34211c) {
            return null;
        }
        PowerStub powerStub = powerAdapter.f34209a;
        if (powerStub == null) {
            l.a("mainStub");
        }
        return powerStub.f34241a;
    }

    public List<e> getAllChunks() {
        List<PowerStub> list = this.O.f34210b;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f34251k);
        }
        return arrayList;
    }

    public PowerList(Context context) {
        this(context, null);
    }

    public final void i(View view) {
        a(0, view);
    }

    public void setListConfig(c cVar) {
        this.O.a(cVar, b.Direct);
    }

    public final void a(e eVar) {
        this.O.a(eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        if (aVar instanceof PowerAdapter) {
            super.setAdapter(aVar);
            return;
        }
        throw new RuntimeException("Not Allow setAdapter in PowerList");
    }

    public void setOrientation(int i2) {
        getContext();
        setLayoutManager(new LinearLayoutManager(i2, false));
    }

    public final void a(com.bytedance.ies.powerlist.page.c cVar) {
        this.O.a(cVar);
    }

    public final void a(com.bytedance.ies.powerlist.page.config.b<?> bVar) {
        this.O.a(bVar, false, getState());
    }

    public final void j(View view) {
        PowerStub primaryStub = getPrimaryStub();
        if (view != null) {
            int i2 = primaryStub.f34243c;
            primaryStub.f34243c = i2 + 1;
            primaryStub.f34248h.add(primaryStub.f34248h.size(), new com.bytedance.ies.powerlist.header.a(view, i2));
            primaryStub.f34244d.put(Integer.valueOf(i2), FixedViewCell.class);
            primaryStub.c();
        }
    }

    public void setViewTypeMap(Map<Class<? extends PowerCell<?>>, Object> map) {
        PowerAdapter powerAdapter = this.O;
        if (map != null) {
            for (Map.Entry<Class<? extends PowerCell<?>>, Object> entry : map.entrySet()) {
                Class<? extends PowerCell<?>> key = entry.getKey();
                if (key != null) {
                    powerAdapter.e().put(key, entry.getValue());
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }

    public final void a(Class<? extends PowerCell<?>>... clsArr) {
        PowerAdapter powerAdapter = this.O;
        l.c(clsArr, "");
        PowerStub g2 = powerAdapter.g();
        if (g2 != null) {
            g2.a(i.j(clsArr));
        }
        com.bytedance.ies.powerlist.optimize.a.b bVar = powerAdapter.k().f34316b;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void onViewAttachedToWindow(View view) {
        androidx.lifecycle.i lifecycle;
        PowerAdapter powerAdapter = this.O;
        powerAdapter.f34220l = true;
        m j2 = powerAdapter.j();
        if (!(j2 == null || (lifecycle = j2.getLifecycle()) == null)) {
            lifecycle.b(powerAdapter);
        }
        Iterator<T> it = powerAdapter.a().iterator();
        while (it.hasNext()) {
            it.next().a(powerAdapter.j());
        }
        if (powerAdapter.getLifecycle().a().compareTo((Enum) i.b.CREATED) < 0) {
            powerAdapter.f34221m.a(i.a.ON_CREATE);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        androidx.lifecycle.i lifecycle;
        androidx.lifecycle.i lifecycle2;
        PowerAdapter powerAdapter = this.O;
        powerAdapter.f34220l = false;
        m j2 = powerAdapter.j();
        if (!(j2 == null || (lifecycle2 = j2.getLifecycle()) == null)) {
            lifecycle2.a(powerAdapter);
        }
        for (T t : powerAdapter.a()) {
            t.f34241a.f34255a.removeObserver(t);
            m mVar = t.f34249i;
            if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                lifecycle.b(t);
            }
            t.f34249i = null;
        }
    }

    public void setLifecycleOwner(m mVar) {
        androidx.lifecycle.i lifecycle;
        androidx.lifecycle.i lifecycle2;
        androidx.lifecycle.i lifecycle3;
        PowerAdapter powerAdapter = this.O;
        l.c(mVar, "");
        m j2 = powerAdapter.j();
        powerAdapter.f34219k = mVar;
        if (powerAdapter.f34220l && (!l.a(powerAdapter.j(), j2))) {
            if (!(j2 == null || (lifecycle3 = j2.getLifecycle()) == null)) {
                lifecycle3.b(powerAdapter);
            }
            m j3 = powerAdapter.j();
            if (!(j3 == null || (lifecycle2 = j3.getLifecycle()) == null)) {
                lifecycle2.a(powerAdapter);
            }
            for (T t : powerAdapter.a()) {
                m j4 = powerAdapter.j();
                l.c(j4, "");
                m mVar2 = t.f34249i;
                if (!(mVar2 == null || (lifecycle = mVar2.getLifecycle()) == null)) {
                    lifecycle.b(t);
                }
                j4.getLifecycle().a(t);
            }
        }
    }

    public final void a(int i2, View view) {
        getPrimaryStub().a(i2, view);
    }

    public PowerList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PowerList(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        PowerAdapter powerAdapter = new PowerAdapter(this);
        this.O = powerAdapter;
        setAdapter(powerAdapter);
        getContext();
        setLayoutManager(new LinearLayoutManager());
        addOnAttachStateChangeListener(this);
        addOnAttachStateChangeListener(new f());
    }
}
