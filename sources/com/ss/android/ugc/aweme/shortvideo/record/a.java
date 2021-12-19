package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import h.f.a.b;
import h.f.b.l;
import h.z;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C3387a f130005a = C3387a.f130006b;

    static {
        Covode.recordClassIndex(85313);
    }

    void a(ASCameraView aSCameraView, b<? super Integer, z> bVar);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a$a  reason: collision with other inner class name */
    public static final class C3387a implements a {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ C3387a f130006b = new C3387a();

        private C3387a() {
        }

        static {
            Covode.recordClassIndex(85314);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.record.a
        public final void a(ASCameraView aSCameraView, b<? super Integer, z> bVar) {
            l.d(aSCameraView, "");
            aSCameraView.a(bVar);
        }
    }
}
