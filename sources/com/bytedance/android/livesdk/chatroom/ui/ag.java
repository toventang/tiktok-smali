package com.bytedance.android.livesdk.chatroom.ui;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import h.f.a.r;

final /* synthetic */ class ag implements r {

    /* renamed from: a  reason: collision with root package name */
    private final a f15857a;

    static {
        Covode.recordClassIndex(8748);
    }

    ag(a aVar) {
        this.f15857a = aVar;
    }

    @Override // h.f.a.r
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Float) obj3).floatValue();
        ((Float) obj4).floatValue();
        return Boolean.valueOf(this.f15857a.a((MotionEvent) obj, (MotionEvent) obj2, floatValue));
    }
}
