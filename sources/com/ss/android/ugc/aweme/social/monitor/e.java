package com.ss.android.ugc.aweme.social.monitor;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.UUID;

public final class e implements IRelationMonitorService {

    /* renamed from: b  reason: collision with root package name */
    public static final e f133706b = new e();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ IRelationMonitorService f133707c;

    @Override // com.ss.android.ugc.aweme.social.monitor.IRelationMonitorService
    public final d a(int i2, UUID uuid) {
        l.d(uuid, "");
        return this.f133707c.a(i2, uuid);
    }

    static {
        Covode.recordClassIndex(87467);
    }

    private e() {
        IRelationMonitorService a2 = RelationMonitorServiceImp.a();
        l.b(a2, "");
        this.f133707c = a2;
    }
}
