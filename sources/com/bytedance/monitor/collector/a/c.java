package com.bytedance.monitor.collector.a;

import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    private static Field f41435f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f41436g;

    /* renamed from: h  reason: collision with root package name */
    private static Field f41437h;

    /* renamed from: i  reason: collision with root package name */
    private static Field f41438i;

    /* renamed from: j  reason: collision with root package name */
    private static Field f41439j;

    /* renamed from: k  reason: collision with root package name */
    private static Field f41440k;

    /* renamed from: a  reason: collision with root package name */
    public String f41441a;

    /* renamed from: b  reason: collision with root package name */
    public int f41442b;

    /* renamed from: c  reason: collision with root package name */
    public long f41443c;

    /* renamed from: d  reason: collision with root package name */
    public String f41444d;

    /* renamed from: e  reason: collision with root package name */
    public String f41445e;

    static {
        Covode.recordClassIndex(25393);
    }

    public c() {
    }

    public final String toString() {
        return "ServiceFollowBean{mServiceName='" + this.f41441a + '\'' + ", mWhat=" + this.f41442b + ", mTimeStamp=" + this.f41443c + ", mToken='" + this.f41444d + '\'' + ", mThreadName='" + this.f41445e + '\'' + '}';
    }

    public static c a(Message message) {
        try {
            switch (message.what) {
                case 114:
                    if (f41435f == null) {
                        f41435f = a.a(message.obj.getClass(), "info");
                    }
                    if (f41436g == null) {
                        f41436g = a.a(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f41435f.get(message.obj);
                    String str = null;
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new c(str, message.what, System.currentTimeMillis(), f41436g.get(message.obj).toString());
                case 115:
                    if (f41437h == null) {
                        f41437h = a.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) f41437h.get(message.obj);
                    if (iBinder != null) {
                        return new c(d.f41446a.a(iBinder), message.what, System.currentTimeMillis(), iBinder.toString());
                    }
                    break;
                case 116:
                    return new c(d.f41446a.a((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString());
                case 117:
                case 118:
                case 119:
                case 120:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case 121:
                    if (f41438i == null) {
                        f41438i = a.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) f41438i.get(message.obj);
                    if (iBinder2 != null) {
                        return new c(d.f41446a.a(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString());
                    }
                    break;
                case 122:
                    if (f41439j == null) {
                        f41439j = a.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) f41439j.get(message.obj);
                    if (iBinder3 != null) {
                        return new c(d.f41446a.a(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString());
                    }
                    break;
                case 123:
                    if (f41440k == null) {
                        f41440k = a.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) f41440k.get(message.obj);
                    if (iBinder4 != null) {
                        return new c(d.f41446a.a(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString());
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new c("unknow", message.what, System.currentTimeMillis(), "unknow");
    }

    private c(String str, int i2, long j2, String str2) {
        this.f41441a = str;
        this.f41442b = i2;
        this.f41443c = j2;
        this.f41444d = str2;
        this.f41445e = Thread.currentThread().getName();
    }
}
