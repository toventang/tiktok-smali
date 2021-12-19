package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.asve.recorder.view.g;
import com.ss.android.ugc.aweme.shortvideo.record.k;
import com.ss.android.ugc.tools.utils.a.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    d f130007a;

    /* renamed from: b  reason: collision with root package name */
    public final k f130008b;

    /* renamed from: c  reason: collision with root package name */
    public ASCameraView f130009c;

    /* renamed from: d  reason: collision with root package name */
    f f130010d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f130011e;

    /* renamed from: f  reason: collision with root package name */
    boolean f130012f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.creativex.recorder.gesture.api.d f130013g = new com.bytedance.creativex.recorder.gesture.api.d() {
        /* class com.ss.android.ugc.aweme.shortvideo.record.a.a.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        boolean f130015a;

        /* renamed from: b  reason: collision with root package name */
        boolean f130016b;

        static {
            Covode.recordClassIndex(85316);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(MotionEvent motionEvent) {
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(b bVar) {
            if (!this.f130015a) {
                return false;
            }
            a.this.a().b(bVar.f149983i.x, bVar.f149983i.y);
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final void b(b bVar) {
            if (this.f130015a) {
                this.f130015a = false;
                this.f130016b = true;
                a.this.a().b();
                a.this.f130008b.a(new ac(true));
            }
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent) {
            a.this.f130008b.a(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(b bVar, float f2, float f3) {
            a aVar = a.this;
            if (aVar.f130008b.K && !aVar.f130008b.L) {
                boolean a2 = a.this.a().a(f2, f3);
                this.f130015a = a2;
                if (a2) {
                    a aVar2 = a.this;
                    if (aVar2.f130010d != null) {
                        aVar2.f130010d.a(false);
                    }
                    a.this.f130008b.a(new ac(false));
                }
            }
            return this.f130015a;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!this.f130016b) {
                return false;
            }
            this.f130016b = false;
            return true;
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private g f130014h;

    static {
        Covode.recordClassIndex(85315);
    }

    public final g a() {
        if (this.f130014h == null) {
            this.f130014h = this.f130009c.getGestureDispatcher();
        }
        return this.f130014h;
    }

    public a(d dVar, ASCameraView aSCameraView, k kVar) {
        this.f130007a = dVar;
        this.f130008b = kVar;
        this.f130009c = aSCameraView;
        kVar.j().a(this.f130007a, new b(this));
        kVar.f130166k.b(this.f130013g);
    }
}
