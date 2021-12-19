package com.bytedance.creativex.recorder.gesture;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.gesture.api.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.tools.utils.a.b;
import com.ss.android.ugc.tools.utils.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DefaultGesturePresenter implements VideoRecordGestureLayout.a, au {

    /* renamed from: a  reason: collision with root package name */
    public boolean f28338a = true;

    /* renamed from: b  reason: collision with root package name */
    public float f28339b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28340c;

    /* renamed from: d  reason: collision with root package name */
    boolean f28341d = true;

    /* renamed from: e  reason: collision with root package name */
    private List<d> f28342e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Integer> f28343f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private VideoRecordGestureLayout f28344g;

    /* renamed from: h  reason: collision with root package name */
    private b f28345h;

    /* renamed from: i  reason: collision with root package name */
    private int f28346i;

    static {
        Covode.recordClassIndex(16645);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            disAttachView();
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(c cVar) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(b bVar) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(bVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(b bVar, float f2, float f3) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(bVar, f2, f3)) {
                return true;
            }
        }
        return false;
    }

    private boolean d() {
        if (!this.f28338a) {
            return true;
        }
        return false;
    }

    @v(a = i.a.ON_DESTROY)
    public void disAttachView() {
        this.f28344g.setOnGestureListener(null);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void c() {
        if (!d()) {
            Iterator<d> it = this.f28342e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean b() {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a() {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final void a(d dVar) {
        a(1, dVar);
    }

    public final void a(View view) {
        if (view instanceof VideoRecordGestureLayout) {
            VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) view;
            this.f28344g = videoRecordGestureLayout;
            videoRecordGestureLayout.setOnGestureListener(this);
        }
    }

    public final d a(int i2) {
        Integer num = this.f28343f.get(Integer.valueOf(i2));
        if (num == null) {
            return null;
        }
        return this.f28342e.get(num.intValue());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void f(MotionEvent motionEvent) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.g(motionEvent);
                }
            }
        }
    }

    private boolean g(MotionEvent motionEvent) {
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.c(motionEvent)) {
                return true;
            }
        }
        b bVar = this.f28345h;
        if (bVar == null || !bVar.a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void b(b bVar) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.b(bVar);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean d(MotionEvent motionEvent) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean e(MotionEvent motionEvent) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean c(float f2) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.c(f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean b(float f2) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.b(f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean c(MotionEvent motionEvent) {
        if (d() || !this.f28341d) {
            return false;
        }
        this.f28341d = false;
        new Handler().postDelayed(new a(this), 300);
        return g(motionEvent);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(float f2) {
        if (d()) {
            return false;
        }
        b bVar = this.f28345h;
        if (bVar != null) {
            bVar.d();
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(f2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean b(MotionEvent motionEvent) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.b(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(MotionEvent motionEvent) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(motionEvent)) {
                return true;
            }
        }
        b bVar = this.f28345h;
        if (bVar == null || !bVar.a(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.b(scaleGestureDetector)) {
                return true;
            }
        }
        b bVar = this.f28345h;
        if (bVar != null) {
            scaleGestureDetector.getScaleFactor();
            if (bVar.b()) {
                return true;
            }
        }
        b bVar2 = this.f28345h;
        if (bVar2 != null) {
            return bVar2.a(scaleGestureDetector);
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(scaleGestureDetector)) {
                return true;
            }
        }
        b bVar = this.f28345h;
        if (bVar != null) {
            return bVar.c();
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void b(MotionEvent motionEvent, int[] iArr) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.b(motionEvent, iArr);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void d(MotionEvent motionEvent, int[] iArr) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.d(motionEvent, iArr);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void e(MotionEvent motionEvent, int[] iArr) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.e(motionEvent, iArr);
                }
            }
        }
    }

    public final void a(int i2, d dVar) {
        Integer num = this.f28343f.get(Integer.valueOf(i2));
        if (num != null) {
            this.f28342e.set(num.intValue(), dVar);
            return;
        }
        this.f28342e.add(dVar);
        this.f28343f.put(Integer.valueOf(i2), Integer.valueOf(this.f28342e.size() - 1));
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void c(MotionEvent motionEvent, int[] iArr) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.c(motionEvent, iArr);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final void a(MotionEvent motionEvent, int[] iArr) {
        if (!d()) {
            for (d dVar : this.f28342e) {
                if (dVar != null) {
                    dVar.a(motionEvent, iArr);
                }
            }
        }
    }

    public DefaultGesturePresenter(Context context, m mVar, b bVar, View view) {
        this.f28345h = bVar;
        a(view);
        mVar.getLifecycle().a(this);
        this.f28346i = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        boolean z = false;
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
        }
        if (!this.f28340c && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            b bVar = this.f28345h;
            if (bVar != null && bVar.a(f2, this.f28339b)) {
                z = true;
            }
            this.f28339b = 0.0f;
        }
        return z;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        b bVar;
        if (d()) {
            return false;
        }
        for (d dVar : this.f28342e) {
            if (dVar != null && dVar.a(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs > this.f28346i && abs > abs2 && !this.f28340c) {
            float width = this.f28339b + (f2 / ((float) this.f28344g.getWidth()));
            this.f28339b = width;
            float min = Math.min(width, 1.0f);
            this.f28339b = min;
            float max = Math.max(min, -1.0f);
            this.f28339b = max;
            b bVar2 = this.f28345h;
            if (bVar2 == null || !bVar2.a(max)) {
                return false;
            }
            return true;
        } else if (abs >= abs2 || (bVar = this.f28345h) == null || !bVar.b(f3)) {
            return false;
        } else {
            return true;
        }
    }
}
