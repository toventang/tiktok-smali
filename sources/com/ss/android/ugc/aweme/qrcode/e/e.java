package com.ss.android.ugc.aweme.qrcode.e;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.b.a;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.o.b;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f119740a;

    /* renamed from: b  reason: collision with root package name */
    private final int f119741b = 0;

    static {
        Covode.recordClassIndex(77797);
    }

    public e(String str) {
        this.f119740a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a a2;
        File file;
        String str = this.f119740a;
        int i2 = this.f119741b;
        Context a3 = d.a();
        String str2 = "";
        if (!m.a(str)) {
            Uri parse = Uri.parse(str);
            if (!(!com.ss.android.ugc.aweme.base.e.a(parse) || (a2 = k.a().d().a(j.a().a(b.fromUri(parse)))) == null || (file = ((com.facebook.b.b) a2).f46951a) == null)) {
                new com.ss.android.e.a(a3);
                String a4 = com.ss.android.e.a.a();
                String b2 = com.bytedance.common.utility.d.b(file.getName());
                File file2 = new File(a4, b2);
                if (!file2.exists()) {
                    com.bytedance.common.utility.d.a.a(file.getAbsolutePath(), a4, b2);
                }
                str2 = file2.getAbsolutePath();
            }
        }
        String a5 = d.a();
        if (TextUtils.isEmpty(a5) || TextUtils.isEmpty(str2)) {
            return null;
        }
        com.bytedance.common.utility.d.a.a(str2, a5, d.b(i2));
        return null;
    }
}
