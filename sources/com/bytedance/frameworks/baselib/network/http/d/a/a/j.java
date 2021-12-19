package com.bytedance.frameworks.baselib.network.http.d.a.a;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class j implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final String f29154a = j.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final String f29155b;

    /* renamed from: c  reason: collision with root package name */
    private final d f29156c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHandler f29157d;

    static {
        Covode.recordClassIndex(17056);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void call() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f29155b);
            for (InetAddress inetAddress : allByName) {
                if (inetAddress instanceof Inet4Address) {
                    arrayList.add(inetAddress.getHostAddress());
                } else if (inetAddress instanceof Inet6Address) {
                    arrayList2.add(inetAddress.getHostAddress());
                }
            }
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                a aVar = new a(this.f29155b, System.currentTimeMillis(), arrayList, arrayList2, e.a().f29138f.get());
                d dVar = this.f29156c;
                String str = this.f29155b;
                a c2 = dVar.c(str);
                if (c2 != null) {
                    c2.c();
                }
                Message obtain = Message.obtain();
                obtain.obj = aVar;
                obtain.what = 11;
                aVar.a(obtain);
                aVar.f29102f.sendMessageDelayed(obtain, ((long) e.a().f29138f.get()) * 1000);
                dVar.f29120b.put(str, aVar);
            }
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        }
        if (!e.a().f29134b.get()) {
            Message obtain2 = Message.obtain();
            obtain2.obj = this;
            obtain2.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("localdns_completed_host", this.f29155b);
            obtain2.setData(bundle);
            this.f29157d.sendMessage(obtain2);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", this.f29155b);
                if (arrayList.size() == 0 && arrayList2.size() == 0) {
                    jSONObject.put("status", "failed");
                    jSONObject.put("result", "");
                } else {
                    jSONObject.put("status", "succeed");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(arrayList);
                    jSONObject.put("result", arrayList3);
                }
                jSONObject.put("rtt", currentTimeMillis2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        this.f29156c.f29122d.remove(this.f29155b);
        return null;
    }

    public j(String str, d dVar, WeakHandler weakHandler) {
        this.f29155b = str;
        this.f29156c = dVar;
        this.f29157d = weakHandler;
    }
}
