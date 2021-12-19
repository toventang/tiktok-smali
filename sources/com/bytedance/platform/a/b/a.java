package com.bytedance.platform.a.b;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.a.a.b;
import com.bytedance.platform.a.a.g;
import com.bytedance.platform.a.b.c.e;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static Field f41814g;

    /* renamed from: h  reason: collision with root package name */
    private static Field f41815h;

    /* renamed from: i  reason: collision with root package name */
    private static Field f41816i;

    /* renamed from: j  reason: collision with root package name */
    private static Field f41817j;

    /* renamed from: k  reason: collision with root package name */
    private static Field f41818k;

    /* renamed from: l  reason: collision with root package name */
    private static Field f41819l;

    /* renamed from: m  reason: collision with root package name */
    private static Field f41820m;

    /* renamed from: a  reason: collision with root package name */
    public String f41821a;

    /* renamed from: b  reason: collision with root package name */
    public String f41822b;

    /* renamed from: c  reason: collision with root package name */
    private int f41823c;

    /* renamed from: d  reason: collision with root package name */
    private long f41824d;

    /* renamed from: e  reason: collision with root package name */
    private String f41825e = Thread.currentThread().getName();

    /* renamed from: f  reason: collision with root package name */
    private int f41826f;

    static {
        Covode.recordClassIndex(25571);
    }

    public final String toString() {
        String str;
        int i2 = this.f41826f;
        if (i2 == 0) {
            str = "Not_Followed";
        } else if (i2 == 9527) {
            str = "System";
        } else if (i2 == 9528) {
            str = "Schedule";
        } else {
            str = "Error:" + this.f41826f;
        }
        return "ServiceFollowBean{mServiceName='" + this.f41821a + '\'' + ", mWhat=" + this.f41823c + ", mTimeStamp=" + this.f41824d + ", mToken='" + this.f41822b + '\'' + ", mThreadName='" + this.f41825e + '\'' + ", mHandleFlag=" + str + '}';
    }

    public static a a(Message message) {
        try {
            switch (message.what) {
                case 113:
                    Object obj = message.obj;
                    if (f41820m == null) {
                        f41820m = b.a(obj.getClass(), "intent");
                    }
                    Intent intent = (Intent) f41820m.get(obj);
                    if (intent != null) {
                        intent.getComponent().getClassName();
                        g.a(g.a.ERROR);
                        return new a(intent.getComponent().getClassName(), message.what, System.currentTimeMillis(), "null", 0);
                    }
                    break;
                case 114:
                    if (f41814g == null) {
                        f41814g = b.a(message.obj.getClass(), "info");
                    }
                    if (f41815h == null) {
                        f41815h = b.a(message.obj.getClass(), "token");
                    }
                    ServiceInfo serviceInfo = (ServiceInfo) f41814g.get(message.obj);
                    String str = null;
                    if (serviceInfo != null) {
                        str = serviceInfo.name;
                    }
                    return new a(str, message.what, System.currentTimeMillis(), f41815h.get(message.obj).toString(), message.arg2);
                case 115:
                    if (f41816i == null) {
                        f41816i = b.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder = (IBinder) f41816i.get(message.obj);
                    if (iBinder != null) {
                        return new a(e.f41896a.a(iBinder), message.what, System.currentTimeMillis(), iBinder.toString(), message.arg2);
                    }
                    break;
                case 116:
                    return new a(e.f41896a.a((IBinder) message.obj), message.what, System.currentTimeMillis(), message.obj.toString(), message.arg2);
                case 117:
                case 118:
                case 119:
                case 120:
                default:
                    throw new IllegalArgumentException("message.what = " + message.what + " is not excepted!");
                case 121:
                    if (f41817j == null) {
                        f41817j = b.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder2 = (IBinder) f41817j.get(message.obj);
                    if (iBinder2 != null) {
                        return new a(e.f41896a.a(iBinder2), message.what, System.currentTimeMillis(), iBinder2.toString(), message.arg2);
                    }
                    break;
                case 122:
                    if (f41818k == null) {
                        f41818k = b.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder3 = (IBinder) f41818k.get(message.obj);
                    if (iBinder3 != null) {
                        return new a(e.f41896a.a(iBinder3), message.what, System.currentTimeMillis(), iBinder3.toString(), message.arg2);
                    }
                    break;
                case 123:
                    if (f41819l == null) {
                        f41819l = b.a(message.obj.getClass(), "token");
                    }
                    IBinder iBinder4 = (IBinder) f41819l.get(message.obj);
                    if (iBinder4 != null) {
                        return new a(e.f41896a.a(iBinder4), message.what, System.currentTimeMillis(), iBinder4.toString(), message.arg2);
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
        return new a("unknow", message.what, System.currentTimeMillis(), "unknow", message.arg2);
    }

    private a(String str, int i2, long j2, String str2, int i3) {
        this.f41821a = str;
        this.f41823c = i2;
        this.f41824d = j2;
        this.f41822b = str2;
        this.f41826f = i3;
    }
}
