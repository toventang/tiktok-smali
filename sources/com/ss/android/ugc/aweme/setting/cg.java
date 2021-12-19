package com.ss.android.ugc.aweme.setting;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import b.i;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.base.api.a;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.model.p;
import com.ss.android.ugc.aweme.share.ah;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class cg implements WeakHandler.IHandler {

    /* renamed from: d  reason: collision with root package name */
    private static cg f122163d;

    /* renamed from: a  reason: collision with root package name */
    protected ShareSettingApi f122164a = ((ShareSettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(ShareSettingApi.class));

    /* renamed from: b  reason: collision with root package name */
    protected WeakHandler f122165b = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    public p f122166c;

    static {
        Covode.recordClassIndex(80087);
    }

    public final void b() {
        n.a().a(this.f122165b, new Callable() {
            /* class com.ss.android.ugc.aweme.setting.cg.AnonymousClass1 */

            static {
                Covode.recordClassIndex(80088);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return cg.this.f122164a.queryRawSetting().get();
                } catch (ExecutionException e2) {
                    throw a.getCompatibleException(e2);
                }
            }
        }, 0);
    }

    public final i<Boolean> c() {
        return i.b(new Callable<Boolean>() {
            /* class com.ss.android.ugc.aweme.setting.cg.AnonymousClass2 */

            static {
                Covode.recordClassIndex(80089);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() {
                String string = ch.f122171a.getString("share_setting_key", "");
                if (TextUtils.isEmpty(string)) {
                    return false;
                }
                try {
                    p pVar = (p) new f().a(string, p.class);
                    bi a2 = ah.f123353b.a();
                    a2.a(pVar.f122346a);
                    a2.b(pVar.f122348c);
                    a2.c(pVar.f122349d);
                    a2.d(pVar.f122350e);
                    cg.this.f122166c = pVar;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return true;
            }
        }, i.f4824a);
    }

    protected cg() {
        c();
    }

    public static cg a() {
        MethodCollector.i(6270);
        if (f122163d == null) {
            synchronized (cg.class) {
                try {
                    if (f122163d == null) {
                        f122163d = new cg();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6270);
                    throw th;
                }
            }
        }
        cg cgVar = f122163d;
        MethodCollector.o(6270);
        return cgVar;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        a(message.obj);
    }

    private void a(final p pVar) {
        if (pVar != null) {
            com.bytedance.common.utility.collection.b.a((Collection) pVar.f122346a);
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.setting.cg.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(80090);
                }

                public final void run() {
                    String b2 = new f().b(pVar);
                    ch.f122171a.edit().putString("share_setting_key", b2).commit();
                    ch.f122171a.edit().putBoolean("key_has_setting", !TextUtils.isEmpty(b2)).commit();
                    cg.this.c();
                }
            });
        }
    }

    public final void a(Object obj) {
        if (obj instanceof Exception) {
            Exception exc = (Exception) obj;
            exc.printStackTrace();
            c();
            exc.getMessage();
        } else if (obj instanceof p) {
            a((p) obj);
        }
    }
}
