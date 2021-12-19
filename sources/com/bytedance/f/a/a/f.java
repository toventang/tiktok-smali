package com.bytedance.f.a.a;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.a.c;
import java.lang.reflect.Proxy;
import java.util.Objects;

public final class f implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f28727a;

    /* renamed from: b  reason: collision with root package name */
    public final i f28728b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28729c;

    /* renamed from: d  reason: collision with root package name */
    private final h.a f28730d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ h.a f28731e;

    static {
        Covode.recordClassIndex(16902);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a() {
        return this.f28731e.a();
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(float f2) {
        return this.f28731e.a(f2);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent) {
        return this.f28731e.a(motionEvent);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return this.f28731e.a(motionEvent, motionEvent2, f2, f3);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return this.f28731e.a(scaleGestureDetector);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(b bVar) {
        return this.f28731e.a(bVar);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(b bVar, float f2, float f3) {
        return this.f28731e.a(bVar, f2, f3);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(c cVar) {
        return this.f28731e.a(cVar);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void b(b bVar) {
        this.f28731e.b(bVar);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b() {
        return this.f28731e.b();
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(float f2) {
        return this.f28731e.b(f2);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent) {
        return this.f28731e.b(motionEvent);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        return this.f28731e.b(motionEvent, motionEvent2, f2, f3);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        return this.f28731e.b(scaleGestureDetector);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(float f2) {
        return this.f28731e.c(f2);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(MotionEvent motionEvent) {
        return this.f28731e.c(motionEvent);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean d(MotionEvent motionEvent) {
        return this.f28731e.d(motionEvent);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void e(MotionEvent motionEvent) {
        this.f28731e.e(motionEvent);
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean f(MotionEvent motionEvent) {
        return this.f28731e.f(motionEvent);
    }

    public final String toString() {
        String str;
        Class<?> cls;
        View c2;
        Class<?> cls2;
        if (!this.f28729c) {
            return super.toString();
        }
        StringBuilder append = new StringBuilder().append(super.toString()).append(",level=").append(this.f28727a).append(",gestureInteractView=");
        i iVar = this.f28728b;
        String str2 = null;
        if (iVar == null || (c2 = iVar.c()) == null || (cls2 = c2.getClass()) == null) {
            str = null;
        } else {
            str = cls2.getSimpleName();
        }
        StringBuilder append2 = append.append(str).append(',').append("gestureListener=");
        h.a aVar = this.f28730d;
        if (!(aVar == null || (cls = aVar.getClass()) == null)) {
            str2 = cls.getSimpleName();
        }
        return append2.append(str2).toString();
    }

    public f(int i2, h.a aVar) {
        Object newProxyInstance = Proxy.newProxyInstance(i.class.getClassLoader(), new Class[]{h.a.class}, new g(aVar));
        Objects.requireNonNull(newProxyInstance, "null cannot be cast to non-null type com.bytedance.createx.editor.gesture.GestureLayout.OnGestureListener");
        this.f28731e = (h.a) newProxyInstance;
        this.f28727a = i2;
        this.f28730d = aVar;
    }
}
