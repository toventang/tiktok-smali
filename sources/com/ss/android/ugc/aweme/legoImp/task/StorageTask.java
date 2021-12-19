package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.aweme.storage.e;
import com.aweme.storage.f;
import com.aweme.storage.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.u.d;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.shortvideo.util.am;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.s;
import h.f.b.l;
import java.io.File;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class StorageTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f107890a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f107891b = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(69142);
        }

        /* renamed from: com.ss.android.ugc.aweme.legoImp.task.StorageTask$a$a  reason: collision with other inner class name */
        public static final class C2773a implements f {
            static {
                Covode.recordClassIndex(69143);
            }

            C2773a() {
            }

            @Override // com.aweme.storage.f
            public final void a(String str, JSONObject jSONObject) {
                com.bytedance.apm.b.a(str, jSONObject);
            }

            @Override // com.aweme.storage.f
            public final void b(String str, JSONObject jSONObject) {
                com.bytedance.apm.b.a(str, (JSONObject) null, jSONObject, (JSONObject) null);
            }
        }

        private a() {
        }

        public static final class b implements g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f107892a;

            static {
                Covode.recordClassIndex(69144);
            }

            @Override // com.aweme.storage.g
            public final Set<String> a() {
                Set<String> b2 = am.b();
                l.b(b2, "");
                return b2;
            }

            @Override // com.aweme.storage.g
            public final boolean b() {
                if (com.bytedance.ies.ugc.appcontext.f.j() == null) {
                    return true;
                }
                return false;
            }

            b(Context context) {
                this.f107892a = context;
            }

            @Override // com.aweme.storage.g
            public final void a(boolean z) {
                Context context = this.f107892a;
                if (context != null) {
                    Context applicationContext = context.getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    am.f132208a = false;
                    if (applicationContext != null && !am.f132208a) {
                        int i2 = 1;
                        am.f132208a = true;
                        if (z) {
                            am.d(applicationContext, 20);
                            am.e(applicationContext, 2);
                        }
                        am.a(applicationContext, 2);
                        am.a(2);
                        am.b(applicationContext, 2);
                        am.c(applicationContext, 2);
                        try {
                            File h2 = am.h(applicationContext);
                            try {
                                File a2 = am.a(applicationContext, "logs");
                                if (a2 != null && a2.exists() && !TextUtils.equals(a2.getAbsolutePath(), h2.getAbsolutePath())) {
                                    e.b(a2);
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            File file = new File(am.a(applicationContext), "logs");
                            if (file.exists() && !TextUtils.equals(file.getAbsolutePath(), h2.getAbsolutePath())) {
                                e.b(file);
                            }
                            File a3 = d.a(applicationContext);
                            if (a3 != null) {
                                File file2 = new File(a3, "logs");
                                if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), h2.getAbsolutePath())) {
                                    e.b(file2);
                                }
                            }
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                        File file3 = new File(am.c(), "fresco_cache");
                        File file4 = new File(am.c(applicationContext), "picture/fresco_cache");
                        if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file3.getAbsolutePath())) {
                            e.b(file4);
                        }
                        File file5 = new File(am.b(applicationContext), "picture/fresco_cache");
                        if (file5.exists() && !TextUtils.equals(file5.getAbsolutePath(), file3.getAbsolutePath())) {
                            e.b(file5);
                        }
                        File b2 = d.b(applicationContext);
                        if (b2 != null) {
                            File file6 = new File(b2, "picture/fresco_cache");
                            if (file6.exists() && !TextUtils.equals(file6.getAbsolutePath(), file3.getAbsolutePath())) {
                                e.b(file6);
                            }
                        }
                        File e4 = s.b().a(i.a.VideoCache).e();
                        if (e4 != null) {
                            File file7 = new File(am.b(applicationContext), "cache");
                            if (file7.exists() && !TextUtils.equals(file7.getAbsolutePath(), e4.getAbsolutePath())) {
                                am.a(am.a(file7, 0));
                            }
                            File file8 = new File(am.c(applicationContext), "cache");
                            if (file8.exists() && !TextUtils.equals(file8.getAbsolutePath(), e4.getAbsolutePath())) {
                                am.a(am.a(file8, 0));
                            }
                            File b3 = d.b(applicationContext);
                            if (b3 != null) {
                                File file9 = new File(b3, "cache");
                                if (file9.exists() && !TextUtils.equals(file9.getAbsolutePath(), e4.getAbsolutePath())) {
                                    am.a(am.a(file9, 0));
                                }
                            }
                        }
                        if (z) {
                            long a4 = e.a(am.b(applicationContext).getParent()) + e.a(am.c(applicationContext).getParent());
                            if (e.c(applicationContext)) {
                                am.d(applicationContext, 10);
                            }
                            while (e.c(applicationContext)) {
                                if (e.c(applicationContext)) {
                                    am.a(applicationContext, i2);
                                }
                                if (e.c(applicationContext)) {
                                    am.e(applicationContext, i2);
                                }
                                if (e.c(applicationContext)) {
                                    am.a(i2);
                                }
                                if (e.c(applicationContext)) {
                                    am.b(applicationContext, i2);
                                    am.c(applicationContext, i2);
                                }
                                i2--;
                                if (i2 < 0) {
                                    break;
                                }
                            }
                            long a5 = e.a(am.b(applicationContext).getParent()) + e.a(am.c(applicationContext).getParent());
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("size", a4 - a5);
                            } catch (JSONException e5) {
                                e5.printStackTrace();
                            }
                            com.bytedance.apm.b.a("deep_clean", jSONObject);
                        }
                        am.f132208a = false;
                    }
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static File a(Context context) {
            if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                return com.ss.android.ugc.aweme.lancet.d.f107194b;
            }
            File cacheDir = context.getCacheDir();
            com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
            return cacheDir;
        }

        public static File b(Context context) {
            if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                return com.ss.android.ugc.aweme.lancet.d.f107195c;
            }
            File filesDir = context.getFilesDir();
            com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
            return filesDir;
        }

        public static File c(Context context) {
            if (com.ss.android.ugc.aweme.lancet.d.f107193a != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                return com.ss.android.ugc.aweme.lancet.d.f107193a;
            }
            File externalCacheDir = context.getExternalCacheDir();
            com.ss.android.ugc.aweme.lancet.d.f107193a = externalCacheDir;
            return externalCacheDir;
        }

        public static File d(Context context) {
            if (!TextUtils.isEmpty(null)) {
                return context.getExternalFilesDir(null);
            }
            if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
                return com.ss.android.ugc.aweme.lancet.d.f107196d;
            }
            File externalFilesDir = context.getExternalFilesDir(null);
            com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
            return externalFilesDir;
        }
    }

    static {
        Covode.recordClassIndex(69141);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
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

    /* JADX WARNING: Can't wrap try/catch for region: R(26:6|(2:8|(1:10))|11|(2:13|(1:15))|16|(2:18|(1:20))|21|22|(3:28|(1:30)(1:37)|31)|32|(3:39|(1:41)(1:48)|42)|43|(3:50|(1:52)(1:54)|53)|55|56|(1:60)|61|(1:65)|66|67|(1:69)|70|72|73|76|(5:78|(1:90)(1:82)|83|(1:89)(1:87)|88)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0279 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x02d8 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02e8 A[Catch:{ Exception -> 0x02fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0323  */
    @Override // com.ss.android.ugc.aweme.lego.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r17) {
        /*
        // Method dump skipped, instructions count: 923
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.StorageTask.a(android.content.Context):void");
    }
}
