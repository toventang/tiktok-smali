package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public final int f35689a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35690b;

    /* renamed from: c  reason: collision with root package name */
    public final String f35691c;

    /* renamed from: d  reason: collision with root package name */
    public final String f35692d;

    /* renamed from: e  reason: collision with root package name */
    public final String f35693e;

    /* renamed from: f  reason: collision with root package name */
    public final String f35694f;

    /* renamed from: g  reason: collision with root package name */
    public final String f35695g;

    /* renamed from: h  reason: collision with root package name */
    public final String f35696h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f35697i;

    /* renamed from: j  reason: collision with root package name */
    public final List<TimeLineEvent> f35698j;

    static {
        Covode.recordClassIndex(21317);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f35699a;

        /* renamed from: b  reason: collision with root package name */
        public String f35700b;

        /* renamed from: c  reason: collision with root package name */
        public String f35701c;

        /* renamed from: d  reason: collision with root package name */
        public String f35702d;

        /* renamed from: e  reason: collision with root package name */
        public String f35703e;

        /* renamed from: f  reason: collision with root package name */
        public String f35704f;

        /* renamed from: g  reason: collision with root package name */
        public String f35705g;

        /* renamed from: h  reason: collision with root package name */
        public Boolean f35706h;

        static {
            Covode.recordClassIndex(21318);
        }

        public final w a() {
            return new w(this, (byte) 0);
        }

        private a() {
            this.f35706h = false;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static a a() {
        return new a((byte) 0);
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("methodName: ").append(this.f35692d).append(", params: ").append(this.f35693e).append(", callbackId: ").append(this.f35694f).append(", type: ").append(this.f35691c).append(", iFrameUrl: ");
        if (TextUtils.isEmpty(this.f35696h)) {
            str = TimeLineEvent.b.f35554h;
        } else {
            str = this.f35696h;
        }
        return append.append(str).append(", version: ").append(this.f35690b).append(", ").toString();
    }

    public static boolean a(w wVar) {
        if (wVar == null || wVar.f35689a != 1 || TextUtils.isEmpty(wVar.f35692d) || TextUtils.isEmpty(wVar.f35693e)) {
            return true;
        }
        return false;
    }

    w(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f35698j = copyOnWriteArrayList;
        this.f35690b = null;
        this.f35691c = null;
        this.f35692d = null;
        this.f35693e = null;
        this.f35694f = str;
        this.f35695g = null;
        this.f35689a = -5;
        this.f35696h = null;
        this.f35697i = false;
        new TimeLineEvent.a().a("callbackId", str).a("code", (Object) -5).a(TimeLineEvent.b.ar, (List<TimeLineEvent>) copyOnWriteArrayList);
    }

    private w(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f35698j = copyOnWriteArrayList;
        String str = aVar.f35699a;
        this.f35690b = str;
        String str2 = aVar.f35700b;
        this.f35691c = str2;
        String str3 = aVar.f35701c;
        this.f35692d = str3;
        String str4 = aVar.f35702d;
        this.f35693e = str4;
        String str5 = aVar.f35703e;
        this.f35694f = str5;
        String str6 = aVar.f35704f;
        this.f35695g = str6;
        this.f35689a = 1;
        String str7 = aVar.f35705g;
        this.f35696h = str7;
        this.f35697i = aVar.f35706h;
        new TimeLineEvent.a().a("version", str).a(StringSet.type, str2).a("methodName", str3).a("params", str4).a("namespace", str6).a("callbackId", str5).a("namespace", str6).a("iFrameUrl", str7).a(TimeLineEvent.b.ar, (List<TimeLineEvent>) copyOnWriteArrayList);
    }

    /* synthetic */ w(a aVar, byte b2) {
        this(aVar);
    }
}
