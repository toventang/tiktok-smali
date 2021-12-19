package com.ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.google.c.h.a.q;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class CommandDispatcher implements NetworkUtils.d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f66483a = com.ss.android.newmedia.a.a("/command/feedback/");

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f66484b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public LinkedHashSet<Long> f66485c;

    /* renamed from: d  reason: collision with root package name */
    volatile List<Object> f66486d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Object> f66487e;

    /* renamed from: f  reason: collision with root package name */
    private HandlerThread f66488f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f66489g;

    /* access modifiers changed from: package-private */
    public interface CommandDispatcherApi {
        static {
            Covode.recordClassIndex(40863);
        }

        @t
        @g
        q<String> doPost(@ag String str, @f Map<String, String> map);
    }

    @Override // com.ss.android.common.util.NetworkUtils.d
    public final String a() {
        return "X-SS-Command";
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final CommandDispatcher f66490a = new CommandDispatcher((byte) 0);

        static {
            Covode.recordClassIndex(40864);
        }
    }

    static {
        Covode.recordClassIndex(40862);
    }

    private CommandDispatcher() {
        this.f66485c = new LinkedHashSet<>();
        this.f66487e = new ArrayList<>();
    }

    public class b extends Thread {
        static {
            Covode.recordClassIndex(40865);
        }

        public final void run() {
            MethodCollector.i(4756);
            long lastActiveTime = AppLog.getLastActiveTime();
            while (System.currentTimeMillis() - lastActiveTime < 60000 && a()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            CommandDispatcher.f66484b.set(false);
            MethodCollector.o(4756);
        }

        private boolean a() {
            MethodCollector.i(4857);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CommandDispatcher.this.f66485c) {
                try {
                    linkedHashSet.addAll(CommandDispatcher.this.f66485c);
                } finally {
                    MethodCollector.o(4857);
                }
            }
            if (linkedHashSet.isEmpty()) {
                MethodCollector.o(4857);
                return false;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (longValue > 0) {
                    sb.append(longValue).append(",");
                }
            }
            if (sb.length() == 0) {
                MethodCollector.o(4857);
                return false;
            }
            try {
                if (!a(sb.substring(0, sb.length() - 1)).booleanValue()) {
                    return false;
                }
                synchronized (CommandDispatcher.this.f66485c) {
                    try {
                        CommandDispatcher.this.f66485c.removeAll(linkedHashSet);
                    } finally {
                        MethodCollector.o(4857);
                    }
                }
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public b() {
        }

        private static Boolean a(String str) {
            if (m.a(str)) {
                return false;
            }
            CommandDispatcherApi commandDispatcherApi = (CommandDispatcherApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(CommandDispatcherApi.class);
            HashMap hashMap = new HashMap();
            hashMap.put("command_ids", str);
            try {
                String str2 = commandDispatcherApi.doPost(CommandDispatcher.f66483a, hashMap).get();
                if (str2 == null || str2.length() == 0) {
                    return false;
                }
                return Boolean.valueOf("success".equals(new JSONObject(str2).getString("message")));
            } catch (ExecutionException e2) {
                throw e2.getCause();
            }
        }
    }

    private synchronized Handler b() {
        Handler handler;
        MethodCollector.i(7245);
        if (this.f66488f == null) {
            HandlerThread handlerThread = new HandlerThread("AppData-AsyncOp");
            this.f66488f = handlerThread;
            handlerThread.start();
            this.f66489g = new WeakHandler(this.f66488f.getLooper(), new q(this));
            com.ss.android.ugc.aweme.framework.a.a.a();
        }
        handler = this.f66489g;
        MethodCollector.o(7245);
        return handler;
    }

    /* synthetic */ CommandDispatcher(byte b2) {
        this();
    }

    private void a(LinkedHashSet<Long> linkedHashSet) {
        MethodCollector.i(7269);
        if (linkedHashSet.isEmpty()) {
            MethodCollector.o(7269);
            return;
        }
        synchronized (this.f66485c) {
            try {
                linkedHashSet.addAll(this.f66485c);
            } finally {
                MethodCollector.o(7269);
            }
        }
        int i2 = 0;
        int size = linkedHashSet.size() - 100;
        Iterator<Long> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (i2 > size) {
                break;
            }
            linkedHashSet.remove(next);
            i2++;
        }
        synchronized (this.f66485c) {
            try {
                this.f66485c.addAll(linkedHashSet);
            } finally {
                MethodCollector.o(7269);
            }
        }
    }

    @Override // com.ss.android.common.util.NetworkUtils.d
    public final void a(List<String> list) {
        for (String str : list) {
            if (str != null && !m.a(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        long optLong = jSONObject.optLong("i");
                        if (optLong > 0) {
                            linkedHashSet.add(Long.valueOf(optLong));
                            b().sendMessage(b().obtainMessage(104, jSONObject));
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        a(linkedHashSet);
                        if (f66484b.compareAndSet(false, true)) {
                            new b().start();
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
