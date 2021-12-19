package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class r implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final j f118260a;

    static {
        Covode.recordClassIndex(76801);
    }

    r(j jVar) {
        this.f118260a = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f118260a.b(i2);
    }
}
