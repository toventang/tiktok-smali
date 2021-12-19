package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import java.util.List;

public interface dt extends IInterface {
    static {
        Covode.recordClassIndex(32187);
    }

    List<zzkr> a(zzn zzn, boolean z);

    List<zzw> a(String str, String str2, zzn zzn);

    List<zzw> a(String str, String str2, String str3);

    List<zzkr> a(String str, String str2, String str3, boolean z);

    List<zzkr> a(String str, String str2, boolean z, zzn zzn);

    void a(long j2, String str, String str2, String str3);

    void a(Bundle bundle, zzn zzn);

    void a(zzao zzao, zzn zzn);

    void a(zzao zzao, String str, String str2);

    void a(zzkr zzkr, zzn zzn);

    void a(zzn zzn);

    void a(zzw zzw);

    void a(zzw zzw, zzn zzn);

    byte[] a(zzao zzao, String str);

    void b(zzn zzn);

    String c(zzn zzn);

    void d(zzn zzn);
}
