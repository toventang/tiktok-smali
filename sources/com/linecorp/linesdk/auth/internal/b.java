package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.StringTokenizer;

final class b {

    /* renamed from: a  reason: collision with root package name */
    final int f55017a;

    /* renamed from: b  reason: collision with root package name */
    final int f55018b;

    /* renamed from: c  reason: collision with root package name */
    final int f55019c;

    static {
        Covode.recordClassIndex(34542);
    }

    public final int hashCode() {
        return (((this.f55017a * 31) + this.f55018b) * 31) + this.f55019c;
    }

    public static b a(Context context) {
        String str = context.getPackageManager().getPackageInfo("jp.naver.line.android", 128).versionName;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        try {
            return new b(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f55017a == bVar.f55017a && this.f55018b == bVar.f55018b && this.f55019c == bVar.f55019c) {
            return true;
        }
        return false;
    }

    public b(int i2, int i3, int i4) {
        this.f55017a = i2;
        this.f55018b = i3;
        this.f55019c = i4;
    }
}
