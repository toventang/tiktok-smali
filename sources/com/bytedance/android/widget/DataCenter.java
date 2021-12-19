package com.bytedance.android.widget;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class DataCenter extends ac {

    /* renamed from: a  reason: collision with root package name */
    public m f24297a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f24298b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, d<b>> f24299c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Thread f24300d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f24301e = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(14270);
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        this.f24298b.clear();
        this.f24299c.clear();
        this.f24297a = null;
        this.f24301e.removeCallbacksAndMessages(null);
    }

    public final DataCenter a(String str, u<b> uVar) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        d<b> dVar = this.f24299c.get(str);
        if (dVar == null) {
            dVar = new d<>();
            if (this.f24298b.containsKey(str)) {
                dVar.setValue(new b(str, this.f24298b.get(str)));
            }
            this.f24299c.put(str, dVar);
        }
        m mVar = this.f24297a;
        if (mVar != null) {
            dVar.a(mVar, uVar);
        }
        return this;
    }

    public final DataCenter a(String str, Object obj) {
        if (this.f24300d == null) {
            this.f24300d = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != this.f24300d) {
            this.f24301e.post(new a(this, str, obj));
            return this;
        }
        this.f24298b.put(str, obj);
        d<b> dVar = this.f24299c.get(str);
        if (dVar != null) {
            dVar.setValue(new b(str, obj));
        }
        return this;
    }
}
