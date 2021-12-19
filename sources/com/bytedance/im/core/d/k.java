package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.internal.utils.q;
import java.util.List;

public final class k extends ae implements r {

    /* renamed from: a  reason: collision with root package name */
    public String f37997a;

    /* renamed from: b  reason: collision with root package name */
    public r f37998b;

    static {
        Covode.recordClassIndex(22781);
    }

    @Override // com.bytedance.im.core.d.r
    public final int d() {
        r rVar = this.f37998b;
        if (rVar != null) {
            return rVar.d();
        }
        return 0;
    }

    @Override // com.bytedance.im.core.d.ae
    public final void a() {
        this.f37998b = null;
        q a2 = q.a();
        String str = this.f37997a;
        List<r> list = a2.f38790d.get(str);
        if (list != null) {
            list.remove(this);
            a2.f38790d.put(str, list);
        }
        super.a();
    }

    public k(String str) {
        this.f37997a = str;
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(h hVar) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.a(hVar);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void b(h hVar) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.b(hVar);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void c(h hVar) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.c(hVar);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void d(h hVar) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.d(hVar);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void b(List<ah> list) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.b(list);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void c(List<ah> list) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.c(list);
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length != 4) {
            return -1;
        }
        long longValue = Long.valueOf(split[2]).longValue();
        long longValue2 = Long.valueOf(split[3]).longValue();
        long a2 = d.a().f37562b.a();
        if (a2 == longValue) {
            return longValue2;
        }
        if (a2 == longValue2) {
            return longValue;
        }
        return -1;
    }

    public static String a(long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(0, 0)).append(":").append(e.a.f37581a).append(":");
        long a2 = d.a().f37562b.a();
        if (a2 < j2) {
            sb.append(a2).append(":").append(j2);
        } else {
            sb.append(j2).append(":").append(a2);
        }
        return sb.toString();
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(List<ah> list) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.a(list);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(h hVar, int i2) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.a(hVar, i2);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, int i2) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.a(str, i2);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, List<ah> list) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.a(str, list);
        }
    }

    @Override // com.bytedance.im.core.d.r
    public final void a(String str, int i2, List<Long> list) {
        r rVar = this.f37998b;
        if (rVar != null) {
            rVar.a(str, i2, list);
        }
    }
}
