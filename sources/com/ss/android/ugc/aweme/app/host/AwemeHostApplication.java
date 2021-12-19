package com.ss.android.ugc.aweme.app.host;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.apm.agent.v2.instrumentation.AppAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.application.AwemeApplicationImpl;
import com.ss.android.ugc.aweme.application.i;
import com.ss.android.ugc.aweme.application.j;
import com.ss.android.ugc.aweme.s.c;
import com.ss.android.ugc.playerkit.simapicommon.a;

public class AwemeHostApplication extends k {

    /* renamed from: b  reason: collision with root package name */
    private i f66758b;

    static {
        Covode.recordClassIndex(41088);
    }

    public Resources getResources() {
        return this.f66758b.a(super.getResources());
    }

    @Override // com.ss.android.ugc.aweme.app.host.k
    public void onCreate() {
        a.a(this);
        AppAgent.onTrace("onCreate", true);
        this.f66758b.a();
        super.onCreate();
        this.f66758b.b();
        AppAgent.onTrace("onCreate", false);
    }

    public AwemeHostApplication() {
        AppAgent.onTrace("<init>", true);
        if (com.ss.android.ugc.aweme.compliance.api.d.a.c()) {
            this.f66758b = new j(this, new AwemeAppBuildConfig(), new a());
        } else {
            this.f66758b = new AwemeApplicationImpl(this, new AwemeAppBuildConfig(), new a());
        }
        AppAgent.onTrace("<init>", false);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f66758b.d()) {
            super.onConfigurationChanged(configuration);
            this.f66758b.a(configuration);
        }
    }

    public void onTrimMemory(int i2) {
        if (!this.f66758b.c()) {
            super.onTrimMemory(i2);
            this.f66758b.a(i2);
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        AppAgent.onTrace("attachBaseContext", true);
        g.f34644a = new b(this);
        this.f66758b.a(context);
        super.attachBaseContext(context);
        c.a(this);
        this.f66758b.b(context);
        AppAgent.onTrace("attachBaseContext", false);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i2, SQLiteDatabase.CursorFactory cursorFactory) {
        return super.openOrCreateDatabase(this.f66758b.a(str), i2, cursorFactory);
    }
}
