package com.ss.android.ugc.aweme.filter;

import android.view.View;
import androidx.appcompat.app.d;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import java.util.List;

public class FilterViewImpl implements au {

    /* renamed from: a  reason: collision with root package name */
    d f95464a;

    /* renamed from: b  reason: collision with root package name */
    public List<Object> f95465b;

    /* renamed from: c  reason: collision with root package name */
    private View f95466c;

    static {
        Covode.recordClassIndex(60482);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f95466c = null;
        this.f95465b.clear();
        this.f95464a = null;
    }
}
