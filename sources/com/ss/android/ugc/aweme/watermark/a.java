package com.ss.android.ugc.aweme.watermark;

import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ay;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.shortvideo.af.a.e;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.vesdk.bk;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class a implements com.ss.android.ugc.aweme.shortvideo.af.a.a {

    /* renamed from: a  reason: collision with root package name */
    private String f144719a;

    /* renamed from: b  reason: collision with root package name */
    private int f144720b;

    /* renamed from: c  reason: collision with root package name */
    private int f144721c;

    /* renamed from: d  reason: collision with root package name */
    private int f144722d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String[]> f144723e = new HashMap();

    static {
        Covode.recordClassIndex(94669);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.a
    public final void b() {
        this.f144723e.clear();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.a
    public final e a() {
        int i2 = (int) ((((float) this.f144720b) / 1080.0f) * 24.0f);
        e eVar = new e();
        eVar.xOffset = i2;
        eVar.yOffset = i2;
        eVar.position = bk.TL_BR;
        bj.a("WaterMarkPositionConfig xOffset:" + i2 + " yOffset:" + i2 + " videoWidth:" + this.f144720b);
        return eVar;
    }

    public static boolean a(com.ss.android.ugc.aweme.account.model.a aVar) {
        if (aVar == null || !TextUtils.equals(c.u.c(), aVar.c())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.a
    public final void a(boolean z, com.ss.android.ugc.aweme.account.model.a aVar) {
        b(z, aVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.af.a.a
    public final String[] b(boolean z, com.ss.android.ugc.aweme.account.model.a aVar) {
        String a2;
        boolean z2;
        int i2;
        if (TextUtils.isEmpty(aVar.a())) {
            a2 = aVar.b();
        } else {
            a2 = aVar.a();
        }
        if (a2 == null) {
            a2 = "";
        }
        String str = a2 + z;
        String[] strArr = this.f144723e.get(str);
        if (strArr != null && strArr.length > 0) {
            return strArr;
        }
        String b2 = d.b(this.f144719a);
        if (TextUtils.isEmpty(a2)) {
            com.ss.android.ugc.aweme.df.e.a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        File file = new File(dj.f126468k);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = this.f144720b;
        if (i3 == 0 || (i2 = this.f144721c) == 0) {
            return null;
        }
        if (!z2) {
            com.ss.android.ugc.aweme.df.e.a((Throwable) new IllegalStateException("provide error " + z2 + " " + this.f144720b + " " + this.f144721c));
            return null;
        }
        String[] a3 = ay.a(aVar, i3, i2, this.f144722d, z, b2);
        this.f144723e.put(str, a3);
        return a3;
    }

    public a(String str, int i2, int i3, int i4) {
        this.f144719a = str;
        this.f144720b = i2;
        this.f144721c = i3;
        this.f144722d = i4;
    }
}
