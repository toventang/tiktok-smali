package com.ss.android.ugc.aweme.tasks;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.co.b;
import com.ss.android.ugc.aweme.framework.d.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.List;

public class LogLaunchModeTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private Uri f138551a;

    /* renamed from: b  reason: collision with root package name */
    private String f138552b;

    /* renamed from: c  reason: collision with root package name */
    private String f138553c;

    static {
        Covode.recordClassIndex(90641);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
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
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        String str;
        Uri uri = this.f138551a;
        String str2 = "";
        if (uri != null) {
            str = uri.getQueryParameter("enter_to");
        } else {
            str = str2;
        }
        b b2 = b.b();
        Context applicationContext = a.f96678a.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        long e2 = b2.e(applicationContext, "red_point_count");
        com.ss.android.ugc.aweme.metrics.x xVar = new com.ss.android.ugc.aweme.metrics.x();
        xVar.f109614a = this.f138553c;
        xVar.f109617d = Integer.toString(1);
        if (str != null) {
            str2 = str;
        }
        xVar.f109615b = str2;
        xVar.f109616c = Long.toString(e2);
        xVar.f109618e = this.f138552b;
        xVar.f();
    }

    public LogLaunchModeTask(Uri uri, String str) {
        this.f138551a = uri;
        this.f138552b = str;
        this.f138553c = "enter_launch";
    }

    public LogLaunchModeTask(Uri uri, String str, String str2) {
        this.f138551a = uri;
        this.f138552b = str;
        this.f138553c = str2;
    }
}
