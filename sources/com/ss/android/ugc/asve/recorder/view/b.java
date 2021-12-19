package com.ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.a;
import h.f.b.l;
import java.util.Objects;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final g f62380a;

    /* renamed from: b  reason: collision with root package name */
    private d f62381b;

    static {
        Covode.recordClassIndex(38325);
    }

    @Override // com.ss.android.ugc.asve.recorder.view.d
    public final void a(boolean z) {
        this.f62381b.a(z);
    }

    @Override // com.ss.android.ugc.asve.recorder.view.d
    public final void a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        this.f62381b.a(motionEvent);
    }

    public b(Context context, ASCameraView aSCameraView, a aVar) {
        d aVar2;
        l.d(context, "");
        l.d(aSCameraView, "");
        l.d(aVar, "");
        if (c.f62382a[aVar.f62126a.ordinal()] != 1) {
            aVar2 = new com.ss.android.ugc.asve.recorder.camera.b.a(context, aSCameraView, aVar);
        } else {
            aVar2 = new com.ss.android.ugc.asve.recorder.reaction.a.a(context, aSCameraView, aVar.g(), aVar.c(), aSCameraView.getReactionViewHelper$lib_asve_release());
        }
        this.f62381b = aVar2;
        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.view.GestureDispatcher");
        this.f62380a = (g) aVar2;
    }
}
