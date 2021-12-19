package com.ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonViewStatus extends ac {
    public final t<Float> _alpha = new t<>();
    public final t<Boolean> _enable = new t<>();
    public final t<Integer> _visibility = new t<>();
    private final List<b<View, z>> mClickListenerList = new ArrayList();

    static {
        Covode.recordClassIndex(84428);
    }

    public final void addOnClickListener(b<? super View, z> bVar) {
        l.d(bVar, "");
        this.mClickListenerList.add(bVar);
    }

    public final void setOnClickListener(b<? super View, z> bVar) {
        l.d(bVar, "");
        this.mClickListenerList.clear();
        this.mClickListenerList.add(bVar);
    }

    public final void click(View view) {
        l.d(view, "");
        Iterator<T> it = this.mClickListenerList.iterator();
        while (it.hasNext()) {
            it.next().invoke(view);
        }
    }

    public void bindView(View view, m mVar) {
        l.d(view, "");
        l.d(mVar, "");
        this._visibility.observe(mVar, new CommonViewStatus$bindView$1(view));
        this._alpha.observe(mVar, new CommonViewStatus$bindView$2(view));
        this._enable.observe(mVar, new CommonViewStatus$bindView$3(view));
        view.setOnClickListener(new CommonViewStatus$bindView$4(this));
    }
}
