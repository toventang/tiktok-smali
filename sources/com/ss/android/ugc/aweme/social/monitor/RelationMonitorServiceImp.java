package com.ss.android.ugc.aweme.social.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.b;
import h.f.b.l;
import java.util.UUID;

public final class RelationMonitorServiceImp implements IRelationMonitorService {
    static {
        Covode.recordClassIndex(87459);
    }

    public static IRelationMonitorService a() {
        MethodCollector.i(13765);
        Object a2 = b.a(IRelationMonitorService.class, false);
        if (a2 != null) {
            IRelationMonitorService iRelationMonitorService = (IRelationMonitorService) a2;
            MethodCollector.o(13765);
            return iRelationMonitorService;
        }
        if (b.ej == null) {
            synchronized (IRelationMonitorService.class) {
                try {
                    if (b.ej == null) {
                        b.ej = new RelationMonitorServiceImp();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13765);
                    throw th;
                }
            }
        }
        RelationMonitorServiceImp relationMonitorServiceImp = (RelationMonitorServiceImp) b.ej;
        MethodCollector.o(13765);
        return relationMonitorServiceImp;
    }

    @Override // com.ss.android.ugc.aweme.social.monitor.IRelationMonitorService
    public final d a(int i2, UUID uuid) {
        l.d(uuid, "");
        l.d(uuid, "");
        String uuid2 = uuid.toString();
        l.b(uuid2, "");
        b bVar = b.f133700d.get(uuid2);
        if (bVar == null) {
            bVar = new b(i2, uuid2);
            b.f133700d.put(uuid2, bVar);
        }
        bVar.f133702a = new a(bVar.f133703b, (byte) 0);
        return bVar;
    }
}
