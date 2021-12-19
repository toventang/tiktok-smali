package com.ss.android.ugc.aweme.sticker;

import android.graphics.Rect;
import android.view.ScaleGestureDetector;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.f;
import com.bytedance.f.a.a.j;
import com.ss.android.ugc.aweme.shortvideo.edit.i;
import h.f.b.l;

public final class r extends i {

    /* renamed from: a  reason: collision with root package name */
    public s f135447a;

    /* renamed from: b  reason: collision with root package name */
    public a f135448b;

    /* renamed from: c  reason: collision with root package name */
    private j f135449c;

    public interface a {
        static {
            Covode.recordClassIndex(88491);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(88490);
    }

    @Override // com.bytedance.creativex.recorder.gesture.b
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.b
    public final boolean b(float f2) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.b
    public final boolean c() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.i
    public final void e() {
        a aVar = this.f135448b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public r(j jVar, h.f.a.a<Rect> aVar) {
        l.d(jVar, "");
        this.f135449c = jVar;
        this.f135447a = new s(this, this.f135449c.a(), aVar);
        this.f135449c.a(new f(0, this.f135447a));
    }
}
