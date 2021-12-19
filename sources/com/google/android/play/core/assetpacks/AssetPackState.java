package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bq;

public abstract class AssetPackState {
    static {
        Covode.recordClassIndex(32662);
    }

    static AssetPackState a(Bundle bundle, String str, ay ayVar, z zVar) {
        int a2 = zVar.a(bundle.getInt(bq.a("status", str)));
        int i2 = bundle.getInt(bq.a("error_code", str));
        long j2 = bundle.getLong(bq.a("bytes_downloaded", str));
        long j3 = bundle.getLong(bq.a("total_bytes_to_download", str));
        double b2 = ayVar.b(str);
        long j4 = bundle.getLong(bq.a("pack_version", str));
        long j5 = bundle.getLong(bq.a("pack_base_version", str));
        return a(str, a2, i2, j2, j3, b2, (a2 != 4 || j5 == 0 || j5 == j4) ? 1 : 2);
    }

    public static AssetPackState a(String str, int i2, int i3, long j2, long j3, double d2, int i4) {
        return new ah(str, i2, i3, j2, j3, (int) Math.rint(100.0d * d2), i4);
    }

    public abstract String a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract long e();

    public abstract int f();

    public abstract int g();
}
