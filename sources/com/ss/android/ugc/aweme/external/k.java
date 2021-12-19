package com.ss.android.ugc.aweme.external;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.external.IInitTaskService;
import java.util.Objects;

public final class k implements IInitTaskService {
    static {
        Covode.recordClassIndex(56752);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90399a = new a();

        static {
            Covode.recordClassIndex(56753);
        }

        a() {
        }

        public final void run() {
            c.p.invalidate();
            c.o.invalidate();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInitTaskService
    public final w initTask(int i2) {
        if (i2 == 1) {
            return new AVCleanStorageTask();
        }
        if (i2 == 4) {
            return new AVCameraInitTask();
        }
        if (i2 != 5) {
            return null;
        }
        return new DownloadSuperEntranceResTask();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IInitTaskService
    public final Runnable initTask(int i2, Object obj) {
        if (i2 == 2) {
            aa aaVar = c.f115629h;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            aaVar.d((String) obj);
            return null;
        } else if (i2 != 3) {
            return null;
        } else {
            return a.f90399a;
        }
    }
}
