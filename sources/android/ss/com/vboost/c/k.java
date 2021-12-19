package android.ss.com.vboost.c;

import android.ss.com.vboost.CapabilityType;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f500a = k.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Map<CapabilityType, Object> f501b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<CapabilityType, Object> f502c = new HashMap();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f503a = new k();

        static {
            Covode.recordClassIndex(44);
        }
    }

    static {
        Covode.recordClassIndex(43);
    }

    /* access modifiers changed from: package-private */
    public final <T extends Map> T a(g gVar, CapabilityType capabilityType) {
        return g.VENDOR == gVar ? (T) ((Map) this.f501b.get(capabilityType)) : (T) ((Map) this.f502c.get(capabilityType));
    }

    /* access modifiers changed from: package-private */
    public final <T extends Map> void a(g gVar, CapabilityType capabilityType, T t) {
        if (g.VENDOR == gVar) {
            this.f501b.put(capabilityType, t);
        } else {
            this.f502c.put(capabilityType, t);
        }
    }
}
