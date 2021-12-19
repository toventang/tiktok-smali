package com.ss.android.ugc.aweme.mvtemplate;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.tools.f.b;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qrcode.view.a f112118a;

    /* renamed from: b  reason: collision with root package name */
    public Context f112119b;

    /* renamed from: c  reason: collision with root package name */
    public String f112120c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f112121d = "";

    /* renamed from: e  reason: collision with root package name */
    public boolean f112122e = true;

    /* renamed from: f  reason: collision with root package name */
    public int f112123f = 2;

    /* renamed from: g  reason: collision with root package name */
    public b f112124g;

    static {
        Covode.recordClassIndex(72047);
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a() {
        if (!e.e()) {
            n.a(this.f112119b, (int) R.string.fhb);
        } else if (e.f() < 20971520) {
            n.a(this.f112119b, (int) R.string.fhc);
        } else {
            d.a();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = b();
            }
            if (!j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.ddd).a();
                return false;
            } else if (!this.f112122e) {
                return true;
            } else {
                if (this.f112118a == null) {
                    Context context = this.f112119b;
                    com.ss.android.ugc.aweme.qrcode.view.a a2 = com.ss.android.ugc.aweme.qrcode.view.a.a(context, context.getResources().getString(R.string.bdz));
                    this.f112118a = a2;
                    a2.setIndeterminate(false);
                } else {
                    Context context2 = this.f112119b;
                    if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                        this.f112118a.show();
                        this.f112118a.a();
                    }
                }
                return true;
            }
        }
        return false;
    }

    public a(Context context) {
        this.f112119b = context;
    }

    public a(Context context, Integer num) {
        this.f112119b = context;
        if (num != null) {
            this.f112123f = num.intValue();
        }
    }

    public final void a(final String str, final int i2) {
        final String str2;
        if (a()) {
            if (TextUtils.isEmpty(this.f112120c)) {
                str2 = "mv_reuse";
            } else {
                str2 = this.f112120c;
            }
            AnonymousClass1 r1 = new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.mvtemplate.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(72048);
                }

                @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    if (a.this.f112118a != null) {
                        bt.b(a.this.f112118a);
                    }
                }

                /* access modifiers changed from: package-private */
                public final /* synthetic */ z a(Integer num) {
                    if (num.intValue() == 2004 || num.intValue() == 2002) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f112119b).a(a.this.f112119b.getResources().getString(R.string.ddf)).a();
                    } else if (num.intValue() == 2003) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f112119b).a(a.this.f112119b.getResources().getString(R.string.dde)).a();
                    } else if (num.intValue() == 2006) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f112119b).a(a.this.f112119b.getResources().getString(R.string.br4)).a();
                    } else {
                        new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f112119b).a(a.this.f112119b.getResources().getString(R.string.ddd)).a();
                    }
                    if (a.this.f112118a != null) {
                        bt.b(a.this.f112118a);
                    }
                    if (a.this.f112124g == null) {
                        return null;
                    }
                    a.this.f112124g.onFinish(num.intValue());
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    RecordConfig.Builder shootWay = new RecordConfig.Builder().enterFrom(a.this.f112121d).creationId(UUID.randomUUID().toString()).shootWay(str2);
                    StickerDownloadConfig stickerDownloadConfig = new StickerDownloadConfig(str, com.ss.android.ugc.aweme.language.d.g());
                    stickerDownloadConfig.setType(Integer.valueOf(i2));
                    if (a.this.f112123f == 2) {
                        stickerDownloadConfig.setEnterFromType(10002);
                    } else if (a.this.f112123f == 3) {
                        stickerDownloadConfig.setEnterFromType(10003);
                    } else if (a.this.f112123f == 1) {
                        stickerDownloadConfig.setEnterFromType(10001);
                    }
                    stickerDownloadConfig.setOnFail(new b(this));
                    stickerDownloadConfig.setOnSuccess(new c(this));
                    asyncAVService.uiService().recordService().startRecordMV(a.this.f112119b, shootWay.build(), stickerDownloadConfig);
                }
            };
            if ("mv_page".equals(str2)) {
                AVExternalServiceImpl.a().asyncService(str2, r1);
            } else {
                AVExternalServiceImpl.a().asyncServiceWithOutPanel(str2, r1);
            }
        }
    }

    public final void a(String str, Integer num, String str2, String str3) {
        this.f112120c = str2;
        this.f112121d = str3;
        int i2 = 1;
        if (num == null) {
            num = 1;
        }
        int intValue = num.intValue();
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().getMvPlan() > 0) {
            if (intValue == MovieDetailAPi.f112155a) {
                i2 = 4;
            } else {
                i2 = 3;
            }
        }
        a(str, i2);
    }
}
