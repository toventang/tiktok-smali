package dmt.av.video.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class b implements ISuperEntranceService {

    /* renamed from: a  reason: collision with root package name */
    public static final h f156884a = i.a((h.f.a.a) C4146b.f156886a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f156885b = new a((byte) 0);

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isNeedShowSuperEntranceTabDirect() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean isSuperEntranceResReady() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void preDownloadSuperEntranceRes(Context context) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setShowedSuperEntranceTab() {
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final void setSuperEntranceRecordClicked(Context context, boolean z) {
        l.d(context, "");
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldShowSuperEntranceRecord(Context context) {
        l.d(context, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final boolean shouldStartSuperEntrance(Context context) {
        l.d(context, "");
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104208);
        }

        public static b a() {
            return (b) b.f156884a.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.superentrance.ISuperEntranceService
    public final List<String> getSuperEntranceEffectList() {
        return z.INSTANCE;
    }

    /* renamed from: dmt.av.video.e.b$b  reason: collision with other inner class name */
    static final class C4146b extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final C4146b f156886a = new C4146b();

        static {
            Covode.recordClassIndex(104209);
        }

        C4146b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b();
        }
    }

    static {
        Covode.recordClassIndex(104207);
    }
}
