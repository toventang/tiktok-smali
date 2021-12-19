package com.facebook.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.m;
import java.util.HashMap;
import java.util.Map;

public final class e implements com.facebook.e {

    /* renamed from: b  reason: collision with root package name */
    private static final String f48599b = e.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static Map<Integer, a> f48600c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, a> f48601a = new HashMap();

    public interface a {
        static {
            Covode.recordClassIndex(29313);
        }

        boolean a(int i2, Intent intent);
    }

    public enum b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11);
        
        private final int offset;

        public final int toRequestCode() {
            ae.a();
            return m.f48922h + this.offset;
        }

        static {
            Covode.recordClassIndex(29314);
        }

        private b(int i2) {
            this.offset = i2;
        }
    }

    static {
        Covode.recordClassIndex(29312);
    }

    private static synchronized a a(Integer num) {
        a aVar;
        synchronized (e.class) {
            MethodCollector.i(84);
            aVar = f48600c.get(num);
            MethodCollector.o(84);
        }
        return aVar;
    }

    public final void b(int i2, a aVar) {
        ae.a(aVar, "callback");
        this.f48601a.put(Integer.valueOf(i2), aVar);
    }

    public static synchronized void a(int i2, a aVar) {
        synchronized (e.class) {
            MethodCollector.i(81);
            ae.a(aVar, "callback");
            if (f48600c.containsKey(Integer.valueOf(i2))) {
                MethodCollector.o(81);
                return;
            }
            f48600c.put(Integer.valueOf(i2), aVar);
            MethodCollector.o(81);
        }
    }

    @Override // com.facebook.e
    public final boolean a(int i2, int i3, Intent intent) {
        a aVar = this.f48601a.get(Integer.valueOf(i2));
        if (aVar != null) {
            return aVar.a(i3, intent);
        }
        a a2 = a(Integer.valueOf(i2));
        if (a2 != null) {
            return a2.a(i3, intent);
        }
        return false;
    }
}
