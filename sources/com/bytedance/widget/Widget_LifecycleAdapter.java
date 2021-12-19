package com.bytedance.widget;

import androidx.lifecycle.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.bytedance.covode.number.Covode;

public class Widget_LifecycleAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    final Widget f46131a;

    static {
        Covode.recordClassIndex(28186);
    }

    Widget_LifecycleAdapter(Widget widget) {
        this.f46131a = widget;
    }

    @Override // androidx.lifecycle.e
    public final void a(m mVar, i.a aVar, boolean z, s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (aVar == i.a.ON_CREATE) {
                if (!z2 || sVar.a("create$widget_release", 1)) {
                    this.f46131a.create$widget_release();
                }
            } else if (aVar == i.a.ON_START) {
                if (!z2 || sVar.a("start$widget_release", 1)) {
                    this.f46131a.start$widget_release();
                }
            } else if (aVar == i.a.ON_RESUME) {
                if (!z2 || sVar.a("resume$widget_release", 1)) {
                    this.f46131a.resume$widget_release();
                }
            } else if (aVar == i.a.ON_PAUSE) {
                if (!z2 || sVar.a("pause$widget_release", 1)) {
                    this.f46131a.pause$widget_release();
                }
            } else if (aVar == i.a.ON_STOP) {
                if (!z2 || sVar.a("stop$widget_release", 1)) {
                    this.f46131a.stop$widget_release();
                }
            } else if (aVar != i.a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.a("destroy$widget_release", 1)) {
                    this.f46131a.destroy$widget_release();
                }
            }
        }
    }
}
