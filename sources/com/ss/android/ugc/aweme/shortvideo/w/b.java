package com.ss.android.ugc.aweme.shortvideo.w;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import h.f.b.l;

public interface b {
    static {
        Covode.recordClassIndex(86807);
    }

    long a(CameraComponentModel cameraComponentModel);

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final h.f.a.b<Boolean, Long> f132672a;

        static {
            Covode.recordClassIndex(86808);
        }

        public /* synthetic */ a() {
            this(AnonymousClass1.f132673a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super java.lang.Boolean, java.lang.Long> */
        /* JADX WARN: Multi-variable type inference failed */
        private a(h.f.a.b<? super Boolean, Long> bVar) {
            l.d(bVar, "");
            this.f132672a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.w.b
        public final long a(CameraComponentModel cameraComponentModel) {
            l.d(cameraComponentModel, "");
            return this.f132672a.invoke(Boolean.valueOf(cameraComponentModel.t)).longValue() - cameraComponentModel.f124712g;
        }
    }
}
