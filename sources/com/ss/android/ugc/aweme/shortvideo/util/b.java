package com.ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.utils.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b implements Handler.Callback, IAVPerformance {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, ah> f132246a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Boolean> f132247b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f132248c;

    static {
        Covode.recordClassIndex(86607);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f132249a = new b((byte) 0);

        static {
            Covode.recordClassIndex(86608);
        }
    }

    private b() {
        this.f132246a = new HashMap<>();
        this.f132247b = new HashMap<>();
        this.f132248c = new Handler(v.a(), this);
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    private void b(Message message) {
        av avVar = (av) message.obj;
        ah ahVar = this.f132246a.get(avVar.f132239b);
        if (ahVar != null && !a(ahVar.f132201a, avVar)) {
            ahVar.f132201a.add(avVar);
        }
    }

    private void a(Message message) {
        av avVar = (av) message.obj;
        ah ahVar = this.f132246a.get(avVar.f132239b);
        if (ahVar == null) {
            ah ahVar2 = new ah();
            ahVar2.f132201a.add(avVar);
            this.f132246a.put(avVar.f132239b, ahVar2);
        } else if (!a(ahVar.f132201a, avVar)) {
            ahVar.f132201a.add(avVar);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                a(message);
                return false;
            case 2:
                b(message);
                return false;
            case 3:
                c(message);
                return false;
            case 4:
                a(message);
                return false;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                av avVar = (av) message.obj;
                PerformanceMonitor performanceMonitor = avVar.f132241d;
                String str = avVar.f132240c;
                if (performanceMonitor == null) {
                    c(message);
                    return false;
                }
                ArrayList arrayList = new ArrayList(performanceMonitor.b());
                arrayList.remove(str);
                ah ahVar = this.f132246a.get(avVar.f132239b);
                if (ahVar == null) {
                    return false;
                }
                ArrayList arrayList2 = new ArrayList();
                for (av avVar2 : ahVar.f132201a) {
                    arrayList2.add(avVar2.f132240c);
                }
                if (arrayList2.containsAll(arrayList)) {
                    c(message);
                    return false;
                }
                break;
            default:
                return false;
        }
        b(message);
        return false;
    }

    private void c(Message message) {
        av avVar = (av) message.obj;
        ah remove = this.f132246a.remove(avVar.f132239b);
        if (remove != null) {
            remove.f132201a.add(avVar);
            int size = remove.f132201a.size();
            if (size > 1) {
                ar arVar = new ar();
                int i2 = 0;
                while (i2 < size - 1) {
                    int i3 = i2 + 1;
                    arVar.a("step" + i3, Long.valueOf(remove.f132201a.get(i3).f132238a - remove.f132201a.get(i2).f132238a));
                    i2 = i3;
                }
                arVar.a("totaltime", Long.valueOf(remove.f132201a.get(remove.f132201a.size() - 1).f132238a - remove.f132201a.get(0).f132238a));
                arVar.a("totalstep", Integer.valueOf(size));
                arVar.a(StringSet.type, avVar.f132239b);
                Boolean bool = this.f132247b.get(avVar.f132239b);
                if (bool == null || bool.booleanValue()) {
                    arVar.a("cold_start", (Boolean) true);
                    this.f132247b.put(avVar.f132239b, false);
                } else {
                    arVar.a("cold_start", (Boolean) false);
                }
                JSONObject a2 = arVar.a();
                q.a(avVar.f132239b, a2);
                d.a("tool_performance_operation_cost_time", a2);
                g.a();
                remove.f132201a.clear();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void recordPerformanceLog(String str, h.f.a.a<? extends Map<String, String>> aVar) {
        g.a();
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(String str, String str2) {
        a(str, str2, 3);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(String str, String str2) {
        a(str, str2, 1);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(String str, String str2) {
        a(str, str2, 2);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void end(PerformanceMonitor performanceMonitor, String str) {
        a(performanceMonitor.a(), str, performanceMonitor, 6);
        performanceMonitor.a();
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void enter(Context context, String str) {
        this.f132248c.post(new c(context, str));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void leave(Context context, String str) {
        this.f132248c.post(new e(context, str));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void start(PerformanceMonitor performanceMonitor, String str) {
        a(performanceMonitor.a(), str, performanceMonitor, 4);
        performanceMonitor.a();
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void step(PerformanceMonitor performanceMonitor, String str) {
        a(performanceMonitor.a(), str, performanceMonitor, 5);
        performanceMonitor.a();
    }

    private static boolean a(List<av> list, av avVar) {
        for (av avVar2 : list) {
            if (avVar2.f132240c.equals(avVar.f132240c)) {
                return true;
            }
        }
        return false;
    }

    private void a(String str, String str2, int i2) {
        a(str, str2, null, i2);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.IAVPerformance
    public final void pause(Context context, String str, String str2, String str3) {
        this.f132248c.post(new d(context, str, str2, str3));
    }

    private void a(String str, String str2, PerformanceMonitor performanceMonitor, int i2) {
        if (!TextUtils.isEmpty(str)) {
            Message obtain = Message.obtain();
            obtain.what = i2;
            av avVar = new av();
            avVar.f132238a = System.currentTimeMillis();
            avVar.f132239b = str;
            avVar.f132240c = str2;
            avVar.f132241d = performanceMonitor;
            obtain.obj = avVar;
            this.f132248c.sendMessage(obtain);
        }
    }
}
