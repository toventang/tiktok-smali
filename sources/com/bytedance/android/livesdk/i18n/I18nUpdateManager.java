package com.bytedance.android.livesdk.i18n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.b.b;
import f.a.d.f;
import f.a.t;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class I18nUpdateManager {

    /* renamed from: i  reason: collision with root package name */
    private static long[] f18202i = {3000, 6000, 9000, 60000, 60000, 60000, 600000};

    /* renamed from: j  reason: collision with root package name */
    private static I18nApi f18203j = ((I18nApi) e.a().a(I18nApi.class));

    /* renamed from: a  reason: collision with root package name */
    public String f18204a;

    /* renamed from: b  reason: collision with root package name */
    Handler f18205b;

    /* renamed from: c  reason: collision with root package name */
    public a f18206c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18207d;

    /* renamed from: e  reason: collision with root package name */
    public int f18208e;

    /* renamed from: f  reason: collision with root package name */
    public long f18209f;

    /* renamed from: g  reason: collision with root package name */
    public long f18210g;

    /* renamed from: h  reason: collision with root package name */
    b f18211h = null;

    /* renamed from: k  reason: collision with root package name */
    private Handler.Callback f18212k = new Handler.Callback() {
        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.AnonymousClass1 */

        static {
            Covode.recordClassIndex(10111);
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            I18nUpdateManager i18nUpdateManager = I18nUpdateManager.this;
            i18nUpdateManager.a(i18nUpdateManager.f18210g);
            return true;
        }
    };

    public interface I18nApi {
        static {
            Covode.recordClassIndex(10115);
        }

        @h(a = "/webcast/setting/i18n/package/")
        t<d<a>> update(@z(a = "locale") String str, @z(a = "cur_version") long j2);
    }

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(10116);
        }

        void a(String str, long j2, Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(10110);
    }

    public final void a(Throwable th) {
        long j2;
        com.bytedance.android.live.core.c.a.a(6, "i18n_translation", "update on error: " + th.toString());
        int i2 = this.f18208e + 1;
        this.f18208e = i2;
        Handler handler = this.f18205b;
        long[] jArr = f18202i;
        int length = jArr.length;
        if (i2 >= length || i2 < 0) {
            j2 = jArr[length - 1];
        } else {
            j2 = jArr[i2];
        }
        handler.sendEmptyMessageDelayed(0, j2);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "update is called, current version is ".concat(String.valueOf(j2)));
        if (!this.f18207d && !this.f18205b.hasMessages(0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = this.f18209f;
            if (elapsedRealtime <= j3 || elapsedRealtime - j3 >= 60000) {
                this.f18210g = j2;
                this.f18207d = true;
                try {
                    this.f18211h = f18203j.update(this.f18204a, j2).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new f<d<a>>() {
                        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(10112);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(d<a> dVar) {
                            d<a> dVar2 = dVar;
                            I18nUpdateManager.this.f18207d = false;
                            if (dVar2 == null || dVar2.statusCode != 0 || dVar2.data == null) {
                                I18nUpdateManager.this.a(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
                                return;
                            }
                            com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "update on success");
                            I18nUpdateManager.this.f18208e = 0;
                            I18nUpdateManager.this.f18209f = SystemClock.elapsedRealtime();
                            a aVar = (a) dVar2.data;
                            if (I18nUpdateManager.this.f18206c != null) {
                                I18nUpdateManager.this.f18206c.a(I18nUpdateManager.this.f18204a, aVar.f18217a, aVar.f18218b);
                            }
                        }
                    }, new f<Throwable>() {
                        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(10113);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // f.a.d.f
                        public final /* synthetic */ void accept(Throwable th) {
                            I18nUpdateManager.this.f18207d = false;
                            I18nUpdateManager.this.a(th);
                        }
                    }, new f.a.d.a() {
                        /* class com.bytedance.android.livesdk.i18n.I18nUpdateManager.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(10114);
                        }

                        @Override // f.a.d.a
                        public final void a() {
                            I18nUpdateManager.this.f18207d = false;
                        }
                    });
                } catch (Throwable th) {
                    com.bytedance.android.live.core.c.a.a("I18nUpdateManager", th);
                }
            } else {
                com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "in freeze time, quit update");
            }
        } else if (this.f18207d) {
            com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "now is downloading, quit update");
        } else {
            com.bytedance.android.live.core.c.a.a(3, "i18n_translation", "now is waiting for retry, quit update");
        }
    }

    I18nUpdateManager(String str, a aVar) {
        this.f18204a = str;
        this.f18206c = aVar;
        this.f18205b = new Handler(Looper.getMainLooper(), this.f18212k);
    }
}
