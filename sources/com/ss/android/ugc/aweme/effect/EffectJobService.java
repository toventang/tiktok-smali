package com.ss.android.ugc.aweme.effect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;

public class EffectJobService extends Service {
    static {
        Covode.recordClassIndex(55829);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return 2;
    }

    static final /* synthetic */ Object a() {
        try {
            AVExternalServiceImpl.a().configService().cacheConfig().clearDraftEffectCache();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void onCreate() {
        String effectCacheDir = AVExternalServiceImpl.a().configService().cacheConfig().effectCacheDir();
        if (!TextUtils.isEmpty(effectCacheDir) && new File(effectCacheDir).list() != null && new File(effectCacheDir).list().length != 0) {
            i.b(p.f88956a, g.a()).c(new q(this), i.f4826c);
        }
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
