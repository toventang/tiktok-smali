package com.ss.ttvideoengine.s;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.player.m;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f153260a;

    /* renamed from: b  reason: collision with root package name */
    public int f153261b;

    /* renamed from: c  reason: collision with root package name */
    public String f153262c;

    /* renamed from: d  reason: collision with root package name */
    public String f153263d;

    /* renamed from: e  reason: collision with root package name */
    public Map f153264e;

    static {
        Covode.recordClassIndex(101777);
    }

    private boolean e() {
        if (this.f153260a == -499897) {
            return true;
        }
        return false;
    }

    private boolean g() {
        int i2 = this.f153260a;
        if (i2 == -499999 || i2 == -499997 || i2 == -499996 || i2 == -499992 || i2 == -499991 || i2 == -499990 || i2 == -499989 || i2 == -2139062143) {
            return true;
        }
        return false;
    }

    public final int b() {
        if (this.f153262c.equals("kTTVideoErrorDomainFetchingInfo")) {
            return 1000;
        }
        if (this.f153262c.equals("kTTVideoErrorDomainLocalDNS") || this.f153262c.equals("kTTVideoErrorDomainHTTPDNS")) {
            return 1001;
        }
        if (!this.f153262c.equals("kTTVideoErrorDomainVideoOwnPlayer") || !g()) {
            return 1003;
        }
        return 1002;
    }

    public final boolean d() {
        if (TextUtils.isEmpty(this.f153262c)) {
            return false;
        }
        if (this.f153262c.equals("kTTVideoErrorDomainVideoOwnPlayer") || this.f153262c.equals("kTTVideoErrorDomainVideoOSPlayer") || this.f153262c.equals("kTTVideoErrorDomainVideoExoPlayer")) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.f153262c;
        objArr[1] = Integer.valueOf(this.f153260a);
        objArr[2] = Integer.valueOf(this.f153261b);
        String str = this.f153263d;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return a.a("domain:%s, code:%d, internalCode:%d, description:%s", objArr);
    }

    private boolean f() {
        int i2 = this.f153260a;
        if (i2 == -499988 || i2 == -499987 || i2 == -499986 || i2 == -499985 || i2 == -499899 || i2 == -499898 || i2 == -499896 || i2 == -499894 || i2 == -499893 || i2 == -499891 || i2 == 251658241 || i2 == -499799 || i2 == -499795 || i2 == -499794 || i2 == -499793 || i2 == -499792) {
            return true;
        }
        return false;
    }

    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("domain", this.f153262c);
        hashMap.put("code", Integer.valueOf(this.f153260a));
        int i2 = this.f153261b;
        if (i2 != 0) {
            hashMap.put("internalCode", Integer.valueOf(i2));
        }
        String str = this.f153263d;
        if (str != null) {
            hashMap.put("description", str);
        }
        return hashMap;
    }

    public final int c() {
        if (!this.f153262c.equals("kTTVideoErrorDomainHTTPDNS") && !this.f153262c.equals("kTTVideoErrorDomainLocalDNS")) {
            if (this.f153262c.equals("kTTVideoErrorDomainFetchingInfo")) {
                return 1;
            }
            if (!this.f153262c.equals("kTTVideoErrorDomainVideoOwnPlayer") || f()) {
                return 2;
            }
            if (g()) {
                return 3;
            }
            if (e()) {
                return 1;
            }
        }
        return 2;
    }

    public static String a(m mVar) {
        if (mVar == null) {
            return "";
        }
        int b2 = mVar.b();
        if (b2 == 0) {
            return "kTTVideoErrorDomainVideoOSPlayer";
        }
        if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
            return "kTTVideoErrorDomainVideoOwnPlayer";
        }
        if (b2 != 5) {
            return "";
        }
        return "kTTVideoErrorDomainVideoExoPlayer";
    }

    public c(String str, int i2) {
        this(str, i2, 0);
    }

    public c(String str, int i2, int i3) {
        this(str, i2, i3, null);
    }

    public static c a(m mVar, int i2, String str) {
        return new c(a(mVar), i2, str);
    }

    public c(String str, int i2, String str2) {
        this(str, i2, 0, str2);
    }

    public c(String str, int i2, int i3, String str2) {
        this.f153262c = str;
        this.f153260a = i2;
        this.f153261b = i3;
        this.f153263d = str2;
        this.f153264e = new HashMap();
    }
}
