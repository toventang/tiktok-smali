package com.bytedance.router.autowire;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class AutowiredService {
    private LruCache<String, ISyringe> classCache;
    private List<String> denyList;

    /* renamed from: com.bytedance.router.autowire.AutowiredService$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(26174);
        }
    }

    static {
        Covode.recordClassIndex(26173);
    }

    /* access modifiers changed from: package-private */
    public static final class Single {
        public static final AutowiredService single = new AutowiredService(null);

        private Single() {
        }

        static {
            Covode.recordClassIndex(26175);
        }
    }

    public static AutowiredService inst() {
        return Single.single;
    }

    private AutowiredService() {
        this.classCache = new LruCache<>(66);
        this.denyList = new ArrayList();
    }

    /* synthetic */ AutowiredService(AnonymousClass1 r1) {
        this();
    }

    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        try {
            if (!this.denyList.contains(name)) {
                ISyringe iSyringe = this.classCache.get(name);
                if (iSyringe == null) {
                    iSyringe = (ISyringe) Class.forName(obj.getClass().getName() + "$$SmartRouter$$Autowired").getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                iSyringe.inject(obj);
                this.classCache.put(name, iSyringe);
            }
        } catch (Exception unused) {
            this.denyList.add(name);
        }
    }
}
