package com.ss.videoarch.a;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.ss.videoarch.a.a.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<g> f154295a;

    static {
        Covode.recordClassIndex(102869);
    }

    public f(g gVar) {
        this.f154295a = new WeakReference<>(gVar);
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        g gVar = this.f154295a.get();
        if (gVar == null) {
            return null;
        }
        if (method.getName().equals("updateFrameTerminatedDTS") && objArr.length >= 3) {
            ((Integer) objArr[0]).intValue();
            long longValue = ((Long) objArr[1]).longValue();
            ((Long) objArr[2]).longValue();
            gVar.J = longValue;
        } else if (!method.getName().equals("frameDTSNotify") || objArr.length < 3) {
            method.getName().equals("receiveBinarySei");
        } else {
            int intValue = ((Integer) objArr[0]).intValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            ((Long) objArr[2]).longValue();
            if (gVar.M == 1 && intValue == 0) {
                if (gVar.P.equals("origin")) {
                    b bVar = gVar.f154311b;
                    if (bVar.ce == null) {
                        bVar.ce = new LinkedBlockingQueue<>(600);
                    }
                    if (bVar.ce.remainingCapacity() == 0 && bVar.ce.size() > 0) {
                        bVar.ce.poll();
                    }
                    bVar.ce.offer(Long.valueOf(longValue2));
                }
            } else if (intValue == 1 && gVar.I == 1) {
                if (gVar.f154311b.bT < 0) {
                    gVar.f154311b.bT = longValue2;
                } else if (longValue2 < gVar.K) {
                    b bVar2 = gVar.f154311b;
                    long j2 = gVar.K;
                    JSONObject b2 = bVar2.b();
                    if (b2 != null) {
                        try {
                            b2.put("event_key", "timestamp_rollback").put("packet_type", DataType.AUDIO).put("timestamp_type", "dts").put("latest_ts", longValue2).put("previous_ts", j2);
                            bVar2.f154192b.a(b2, "live_client_monitor_log");
                            if (bVar2.ac > 0) {
                                bVar2.ac++;
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                gVar.K = longValue2;
            }
        }
        return null;
    }
}
