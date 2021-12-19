package com.ss.android.ugc.aweme.video;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ac;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.requestcombine.a;
import com.ss.android.ugc.aweme.setting.cd;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.api.BitRateSettingsApi;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public final class VideoBitRateABManager implements a, cd.a {

    /* renamed from: a  reason: collision with root package name */
    public static final VideoBitRateABManager f143220a = new VideoBitRateABManager();

    /* renamed from: g  reason: collision with root package name */
    private static HashSet<String> f143221g;

    /* renamed from: b  reason: collision with root package name */
    public RateSettingsResponse f143222b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f143223c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f143224d;

    /* renamed from: e  reason: collision with root package name */
    public volatile RateSettingsResponse f143225e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f143226f;

    /* access modifiers changed from: package-private */
    public class RequestConfigTask implements com.ss.android.ugc.aweme.lego.a, w {
        static {
            Covode.recordClassIndex(93746);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
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
            return ae.BOOT_FINISH;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.a
        public final ac e() {
            if (b.c()) {
                return ac.IO;
            }
            return ac.CPU;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        private RequestConfigTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            MethodCollector.i(9469);
            com.ss.android.ugc.aweme.framework.a.a.a("RequestConfigTask");
            synchronized (VideoBitRateABManager.this) {
                try {
                    if (!VideoBitRateABManager.this.f143224d) {
                        try {
                            VideoBitRateABManager.this.a(BitRateSettingsApi.a());
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        MethodCollector.o(9469);
                    }
                } finally {
                    MethodCollector.o(9469);
                }
            }
        }

        /* synthetic */ RequestConfigTask(VideoBitRateABManager videoBitRateABManager, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.a
    public final void a() {
        g();
    }

    public final void c() {
        if (!ColdLaunchRequestCombinerImpl.b().a()) {
            cz_();
        }
    }

    public final boolean d() {
        if (!q.c() || !this.f143223c) {
            return false;
        }
        return true;
    }

    private void h() {
        new f.c().b((w) new RequestConfigTask(this, (byte) 0)).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object e() {
        a(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.b().a("/aweme/v1/rate/settings/")).getRateSetting());
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object f() {
        try {
            if (this.f143225e == null) {
                b();
            }
            b(this.f143225e);
        } catch (Throwable th) {
            com.bytedance.c.a.a.a.b.a(th, (String) null);
        }
        return null;
    }

    private VideoBitRateABManager() {
        cd.f122158b.a(2, this);
        if (q.c()) {
            i.b(new y(this), i.f4824a);
            ColdLaunchRequestCombinerImpl.b().a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.cd.a
    public final void cz_() {
        boolean c2 = q.c();
        Boolean bool = this.f143226f;
        if (bool == null || c2 != bool.booleanValue()) {
            this.f143226f = Boolean.valueOf(c2);
            if (c2) {
                g();
            }
        } else if (c2 && !this.f143224d) {
            g();
        }
    }

    private void g() {
        if (ColdLaunchRequestCombinerImpl.b().a()) {
            RateSettingCombineModel rateSettingCombineModel = (RateSettingCombineModel) ColdLaunchRequestCombinerImpl.b().a("/aweme/v1/rate/settings/");
            if (rateSettingCombineModel != null) {
                if (rateSettingCombineModel.httpCode == 200 && rateSettingCombineModel.getRateSetting().status_code == 0) {
                    if (com.bytedance.ies.abmock.b.a().a(true, "is_async_setting", true)) {
                        i.b(new z(this), i.f4824a);
                        return;
                    } else {
                        a(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.b().a("/aweme/v1/rate/settings/")).getRateSetting());
                        return;
                    }
                } else if (rateSettingCombineModel.httpCode == 509) {
                    return;
                }
            }
            h();
            return;
        }
        h();
    }

    static {
        Covode.recordClassIndex(93744);
        HashSet<String> hashSet = new HashSet<>();
        f143221g = hashSet;
        hashSet.add("DE");
        f143221g.add("FR");
        f143221g.add("GB");
        f143221g.add("BR");
        f143221g.add("RU");
        f143221g.add("AE");
        f143221g.add("SA");
        f143221g.add("IT");
        f143221g.add("MX");
        f143221g.add("ES");
        f143221g.add("TR");
        f143221g.add("PL");
        f143221g.add("BD");
        f143221g.add("IN");
        f143221g.add("ID");
        f143221g.add("JP");
        f143221g.add("MY");
        f143221g.add("PH");
        f143221g.add("TH");
        f143221g.add("VN");
        f143221g.add("CN");
    }

    public final synchronized void b() {
        String lowerCase;
        MethodCollector.i(9796);
        if (this.f143225e != null) {
            MethodCollector.o(9796);
            return;
        }
        String string = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "bitrate_manager_sp_rate_setting", 0).getString("bitrate_manager_sp_rate_setting", null);
        if (string == null) {
            if (!f143221g.contains(com.ss.android.ugc.aweme.language.f.a())) {
                lowerCase = "us";
            } else {
                lowerCase = com.ss.android.ugc.aweme.language.f.a().toLowerCase(Locale.US);
            }
            string = a(com.bytedance.ies.ugc.appcontext.d.a(), "rate_settings/" + lowerCase + ".json");
        }
        this.f143225e = (RateSettingsResponse) new com.google.gson.f().a(string, new com.google.gson.b.a<RateSettingsResponse<com.ss.android.ugc.aweme.simkit.model.a.a>>() {
            /* class com.ss.android.ugc.aweme.video.VideoBitRateABManager.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93745);
            }
        }.type);
        MethodCollector.o(9796);
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.a
    public final void a(Throwable th) {
        h();
    }

    private void b(RateSettingsResponse rateSettingsResponse) {
        MethodCollector.i(9962);
        if (rateSettingsResponse == null || !rateSettingsResponse.isValid()) {
            MethodCollector.o(9962);
            return;
        }
        try {
            synchronized (this) {
                try {
                    this.f143222b = rateSettingsResponse;
                    d.a(com.bytedance.ies.ugc.appcontext.d.a(), "bitrate_manager_sp_rate_setting", 0).edit().putString("bitrate_manager_sp_rate_setting", new com.google.gson.f().b(rateSettingsResponse)).apply();
                } catch (Throwable th) {
                    MethodCollector.o(9962);
                    throw th;
                }
            }
            this.f143223c = true;
            MethodCollector.o(9962);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(9962);
        }
    }

    public final void a(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    b(rateSettingsResponse);
                    this.f143224d = true;
                    cd.f122158b.a(2, true);
                    return;
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                return;
            }
        }
        cd.f122158b.a(2, false);
    }

    private static String a(Context context, String str) {
        Throwable th;
        InputStream inputStream;
        IOException e2;
        MethodCollector.i(9621);
        InputStream inputStream2 = null;
        try {
            inputStream = context.getAssets().open(str);
            try {
                byte[] bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                String str2 = new String(bArr, "UTF-8");
                com.bytedance.common.utility.d.b.a(inputStream);
                MethodCollector.o(9621);
                return str2;
            } catch (IOException e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    com.bytedance.common.utility.d.b.a(inputStream);
                    MethodCollector.o(9621);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    com.bytedance.common.utility.d.b.a(inputStream2);
                    MethodCollector.o(9621);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e2 = e4;
            inputStream = null;
            e2.printStackTrace();
            com.bytedance.common.utility.d.b.a(inputStream);
            MethodCollector.o(9621);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.common.utility.d.b.a(inputStream2);
            MethodCollector.o(9621);
            throw th;
        }
    }
}
