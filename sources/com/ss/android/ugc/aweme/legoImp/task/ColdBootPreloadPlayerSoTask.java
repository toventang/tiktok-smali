package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class ColdBootPreloadPlayerSoTask implements a, w {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f107759a = {"c++_shared", "ttcrypto", "ttboringssl", "vcnverify", "vcn", "avmdlbase", "avmdl"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f107760b = {"c++_shared", "videodec", "ttffmpeg", "ttmverify", "ByteVC1_dec", "ttmplayer"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f107761c = {"c++_shared", "videodec", "ttffmpeg", "ttmverify", "ByteVC1_dec", "ttmplayer", "ttcrypto", "ttboringssl", "vcnverify", "vcn", "avmdlbase", "avmdl"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f107762d = {"c++_shared", "ttmplayer", "videodec", "avmdlbase", "ttmverify"};

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final String[] c() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final int d() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.a
    public final ac e() {
        return ac.IO;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(68956);
    }

    private static void a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        try {
            int intValue = ((Number) com.ss.android.ugc.aweme.s.a.f120737k.getValue()).intValue();
            int i2 = 0;
            if (intValue == 1) {
                String[] strArr = f107759a;
                int length = strArr.length;
                while (i2 < length) {
                    a(strArr[i2]);
                    i2++;
                }
            } else if (intValue == 2) {
                String[] strArr2 = f107760b;
                int length2 = strArr2.length;
                while (i2 < length2) {
                    a(strArr2[i2]);
                    i2++;
                }
            } else if (intValue == 3) {
                String[] strArr3 = f107761c;
                int length3 = strArr3.length;
                while (i2 < length3) {
                    a(strArr3[i2]);
                    i2++;
                }
            } else if (intValue == 4) {
                String[] strArr4 = f107762d;
                int length4 = strArr4.length;
                while (i2 < length4) {
                    a(strArr4[i2]);
                    i2++;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
