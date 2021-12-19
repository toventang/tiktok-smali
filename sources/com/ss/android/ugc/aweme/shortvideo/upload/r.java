package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.upload.u;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f132136a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static u f132137b;

    private static float a(long j2) {
        return (((float) j2) / 1024.0f) / 1024.0f;
    }

    private r() {
    }

    static {
        Covode.recordClassIndex(86550);
    }

    public static final u.a a() {
        u uVar = f132137b;
        if (uVar != null) {
            return uVar.a();
        }
        return null;
    }

    public static final void a(String str) {
        if (str != null) {
            u uVar = new u(str, t.DirectRecord);
            f132137b = uVar;
            uVar.f132142c = a(dj.b());
        }
    }

    public static final void b(String str) {
        if (str != null) {
            u uVar = new u(str, t.Draft);
            f132137b = uVar;
            uVar.f132142c = a(dj.b());
        }
    }

    public static final void a(String str, long j2) {
        if (str != null && f132137b != null) {
            b(str, "onSyntheticFinish");
            u uVar = f132137b;
            if (uVar != null) {
                uVar.f132144e = a(dj.b());
            }
            u uVar2 = f132137b;
            if (uVar2 != null) {
                uVar2.f132145f = a(j2);
            }
        }
    }

    public static final void a(String str, String str2) {
        l.d(str2, "");
        if (str != null && f132137b != null) {
            b(str, "onSyntheticStart");
            u uVar = f132137b;
            if (uVar != null) {
                uVar.f132143d = a(dj.b());
            }
            u uVar2 = f132137b;
            if (uVar2 != null) {
                uVar2.a(str2);
            }
        }
    }

    private static void b(String str, String str2) {
        u uVar = f132137b;
        if (uVar != null) {
            String str3 = null;
            if (!l.a((Object) str, (Object) uVar.f132140a)) {
                u uVar2 = f132137b;
                if (uVar2 == null) {
                    l.b();
                }
                StringBuilder append = new StringBuilder().append(uVar2.f132147h).append(str2).append(" creationId Error, start:");
                u uVar3 = f132137b;
                if (uVar3 != null) {
                    str3 = uVar3.f132140a;
                }
                uVar2.b(append.append(str3).append(", now:").append(str).toString());
                u uVar4 = f132137b;
                if (uVar4 != null) {
                    uVar4.f132148i = false;
                }
            }
        }
    }
}
