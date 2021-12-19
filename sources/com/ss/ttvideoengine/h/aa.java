package com.ss.ttvideoengine.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.j;
import java.util.HashMap;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, a> f152564a;

    static {
        Covode.recordClassIndex(101591);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f152568a = new aa((byte) 0);

        static {
            Covode.recordClassIndex(101593);
        }
    }

    private aa() {
        this.f152564a = new HashMap<>();
    }

    /* synthetic */ aa(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f152565a;

        /* renamed from: b  reason: collision with root package name */
        public z f152566b;

        static {
            Covode.recordClassIndex(101592);
        }

        private a() {
        }

        /* synthetic */ a(aa aaVar, byte b2) {
            this();
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            j.a("VideoEventOneStorage", "storeVideoId return");
        } else {
            b(str);
        }
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?rk=");
        int indexOf2 = str.indexOf("&k=");
        if (indexOf == -1 || indexOf2 == -1) {
            return null;
        }
        return str.substring(indexOf + 4, indexOf2);
    }

    /* access modifiers changed from: package-private */
    public final a b(String str) {
        a aVar = this.f152564a.get(str);
        if (aVar == null) {
            j.a("VideoEventOneStorage", "getStorageContextFromMap, new context, vid:".concat(String.valueOf(str)));
            a aVar2 = new a(this, (byte) 0);
            this.f152564a.put(str, aVar2);
            return aVar2;
        }
        j.a("VideoEventOneStorage", "getStorageContextFromMap, old context, vid:".concat(String.valueOf(str)));
        return aVar;
    }

    public final z c(String str) {
        if (TextUtils.isEmpty(str)) {
            j.a("VideoEventOneStorage", "restoreOnePlay return");
            return null;
        }
        j.b("VideoEventOneStorage", "degrade mode, restore onePlay from context, vid:".concat(String.valueOf(str)));
        return b(str).f152566b;
    }

    public final void d(String str) {
        if (TextUtils.isEmpty(str)) {
            j.a("VideoEventOneStorage", "removeByVideoId return");
            return;
        }
        this.f152564a.remove(str);
        j.a("VideoEventOneStorage", "removeByVideoId remove vid:" + str + ", map size:" + this.f152564a.size());
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            j.a("VideoEventOneStorage", "storeSessionId return");
            return;
        }
        a b2 = b(str);
        b2.f152565a = str2;
        j.a("VideoEventOneStorage", "storeSessionId, session id:" + b2.f152565a);
    }

    public final void a(String str, z zVar) {
        if (TextUtils.isEmpty(str)) {
            j.a("VideoEventOneStorage", "storeOnePlay return");
            return;
        }
        j.b("VideoEventOneStorage", "storeOnePlay, vid:".concat(String.valueOf(str)));
        a b2 = b(str);
        if (b2.f152566b == null) {
            j.a("VideoEventOneStorage", "storeOnePlay new, vid:".concat(String.valueOf(str)));
            b2.f152566b = zVar;
            return;
        }
        j.a("VideoEventOneStorage", "storeOnePlay store, vid:".concat(String.valueOf(str)));
        a(b2.f152566b, zVar);
    }

    private static void a(z zVar, z zVar2) {
        zVar.x = zVar2.x;
        zVar.aX = zVar2.aX;
        zVar.aY = zVar2.aY;
        zVar.bD = zVar2.bD;
        zVar.bE = zVar2.bE;
        zVar.bF = zVar2.bF;
        zVar.bO = zVar2.bO;
        zVar.cp = zVar2.cp;
        if (zVar2.K != Integer.MIN_VALUE) {
            zVar.K = zVar2.K;
        }
        if (zVar2.L != Integer.MIN_VALUE) {
            zVar.L = zVar2.L;
        }
        if (zVar2.bH != -2147483648L) {
            zVar.bH = zVar2.bH;
        }
        if (zVar2.bI != -2147483648L) {
            zVar.bI = zVar2.bI;
        }
        if (zVar2.bJ != -2147483648L) {
            zVar.bJ = zVar2.bJ;
        }
        if (zVar2.bK != -2147483648L) {
            zVar.bK = zVar2.bK;
        }
        if (zVar2.bL != -2147483648L) {
            zVar.bL = zVar2.bL;
        }
        if (zVar2.bM != -2147483648L) {
            zVar.bM = zVar2.bM;
        }
        if (zVar2.bN != Integer.MIN_VALUE) {
            zVar.bN = zVar2.bN;
        }
        if (zVar2.bT != -1) {
            zVar.bT = zVar2.bT;
        }
        zVar.A += zVar2.A;
        zVar.B += zVar2.B;
        zVar.aN += zVar2.aN;
        zVar.D += zVar2.D;
        zVar.E += zVar2.E;
        zVar.aV += zVar2.aV;
        zVar.df.addAll(zVar2.df);
        zVar.dg.addAll(zVar2.dg);
        zVar.dh.addAll(zVar2.dh);
        zVar.di.addAll(zVar2.di);
        zVar.dj.addAll(zVar2.dj);
        zVar.dk.addAll(zVar2.dk);
        zVar.dl.addAll(zVar2.dl);
        zVar.dm.addAll(zVar2.dm);
        zVar.dn.addAll(zVar2.dn);
        zVar.f350do.addAll(zVar2.f350do);
        zVar.dw += zVar2.dw;
        zVar.av += zVar2.av;
        zVar.aL += zVar2.aL;
        zVar.aM += zVar2.aM;
        zVar.aV += zVar2.aV;
        zVar.aW += zVar2.aW;
        zVar.aZ += zVar2.aZ;
        zVar.bu += zVar2.bu;
        zVar.bv += zVar2.bv;
        zVar.bG += zVar2.bG;
    }
}
