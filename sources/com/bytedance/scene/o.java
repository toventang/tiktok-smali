package com.bytedance.scene;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
public final class o extends LayoutInflater {

    /* renamed from: a  reason: collision with root package name */
    private final j f43015a;

    /* renamed from: b  reason: collision with root package name */
    private LayoutInflater f43016b;

    static {
        Covode.recordClassIndex(26368);
    }

    private void a() {
        Context s;
        if (this.f43016b == null) {
            if (this.f43015a.s == 0) {
                s = this.f43015a.t();
            } else {
                s = this.f43015a.s();
            }
            this.f43016b = this.f43015a.t().getLayoutInflater().cloneInContext(s);
            LayoutInflater.Filter filter = getFilter();
            if (filter != null) {
                this.f43016b.setFilter(filter);
            }
            LayoutInflater.Factory2 factory2 = getFactory2();
            if (factory2 != null) {
                this.f43016b.setFactory2(factory2);
                return;
            }
            LayoutInflater.Factory factory = getFactory();
            if (factory != null) {
                this.f43016b.setFactory(factory);
            }
        }
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new o(context, this.f43015a);
    }

    public final void setFactory(LayoutInflater.Factory factory) {
        super.setFactory(factory);
        LayoutInflater layoutInflater = this.f43016b;
        if (layoutInflater != null) {
            layoutInflater.setFactory(factory);
        }
    }

    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        super.setFactory2(factory2);
        LayoutInflater layoutInflater = this.f43016b;
        if (layoutInflater != null) {
            layoutInflater.setFactory2(factory2);
        }
    }

    o(Context context, j jVar) {
        super(context);
        this.f43015a = jVar;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i2, ViewGroup viewGroup) {
        MethodCollector.i(5039);
        a();
        View inflate = this.f43016b.inflate(i2, viewGroup);
        MethodCollector.o(5039);
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        MethodCollector.i(5041);
        a();
        View inflate = this.f43016b.inflate(xmlPullParser, viewGroup);
        MethodCollector.o(5041);
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i2, ViewGroup viewGroup, boolean z) {
        a();
        return a.a(this.f43016b, i2, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        MethodCollector.i(5044);
        a();
        View inflate = this.f43016b.inflate(xmlPullParser, viewGroup, z);
        MethodCollector.o(5044);
        return inflate;
    }
}
