package com.ss.android.ugc.aweme.specialplus;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.bn;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.specialplus.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import java.io.File;
import java.util.List;

public final class e implements ISpecialPlusService {

    /* renamed from: d  reason: collision with root package name */
    public static final h f134652d = i.a((h.f.a.a) b.f134662a);

    /* renamed from: e  reason: collision with root package name */
    public static final a f134653e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f134654a;

    /* renamed from: b  reason: collision with root package name */
    public long f134655b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f134656c;

    /* renamed from: f  reason: collision with root package name */
    private final c f134657f = new c();

    /* renamed from: g  reason: collision with root package name */
    private SpecialPlusConfig f134658g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f134659h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f134660i;

    /* renamed from: j  reason: collision with root package name */
    private c.b f134661j;

    public static final class a {
        static {
            Covode.recordClassIndex(87980);
        }

        public static e a() {
            return (e) e.f134652d.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isQuickPromoPlusEnabled() {
        return this.f134660i;
    }

    static final class b extends m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134662a = new b();

        static {
            Covode.recordClassIndex(87981);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final long getQuickPromoPlusDebutTime() {
        return this.f134657f.c();
    }

    public static final class c extends c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f134663a;

        static {
            Covode.recordClassIndex(87982);
        }

        @Override // com.ss.android.ugc.aweme.df.c.b, com.ss.android.ugc.aweme.df.c.a
        public final void b() {
            this.f134663a.f134655b = System.currentTimeMillis() / 1000;
        }

        @Override // com.ss.android.ugc.aweme.df.c.b, com.ss.android.ugc.aweme.df.c.a
        public final void a() {
            if (this.f134663a.f134656c) {
                new SuperEntranceEvent(3, false).post();
                this.f134663a.f134654a = System.currentTimeMillis() / 1000;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(e eVar) {
            this.f134663a = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void initCallBack() {
        this.f134661j = new c(this);
        c.C1870c.f80046a.a(this.f134661j);
    }

    static {
        Covode.recordClassIndex(87979);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getEffectId() {
        SpecialPlusLabels labels;
        String[] effectIds;
        String str;
        a();
        SpecialPlusConfig specialPlusConfig = this.f134658g;
        if (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (effectIds = labels.getEffectIds()) == null || effectIds.length == 0 || (str = effectIds[0]) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final List<String> getSpecialPlusEffectList() {
        SpecialPlusLabels labels;
        String[] eligibleEffectIds;
        List<String> a2;
        a();
        SpecialPlusConfig specialPlusConfig = this.f134658g;
        if (specialPlusConfig == null || (labels = specialPlusConfig.getLabels()) == null || (eligibleEffectIds = labels.getEligibleEffectIds()) == null || (a2 = h.a.i.a(eligibleEffectIds)) == null) {
            return z.INSTANCE;
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final String getSpecialPlusTips() {
        SpecialPlusTips tips;
        String tryTip;
        a();
        SpecialPlusConfig specialPlusConfig = this.f134658g;
        if (specialPlusConfig == null || (tips = specialPlusConfig.getTips()) == null || (tryTip = tips.getTryTip()) == null) {
            return "";
        }
        return tryTip;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusClicked() {
        int i2;
        a();
        c cVar = this.f134657f;
        SpecialPlusConfig specialPlusConfig = this.f134658g;
        if (specialPlusConfig != null) {
            i2 = specialPlusConfig.getVersion();
        } else {
            i2 = 0;
        }
        cVar.f134645a.storeInt("special_plus_config_version", i2);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusShowed() {
        int i2;
        a();
        c cVar = this.f134657f;
        SpecialPlusConfig specialPlusConfig = this.f134658g;
        if (specialPlusConfig != null) {
            i2 = specialPlusConfig.getVersion();
        } else {
            i2 = 0;
        }
        cVar.f134645a.storeInt("special_plus_showed_config_version", i2);
    }

    private final void a() {
        boolean z;
        if (this.f134658g == null) {
            this.f134658g = f.a();
            initCallBack();
        }
        boolean a2 = a.a();
        this.f134660i = a2;
        if (a2 || !b.a()) {
            z = false;
        } else {
            z = true;
        }
        this.f134659h = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean isNeedShowSpecialPlusDirect() {
        SpecialPlusConfig specialPlusConfig;
        if (com.ss.android.ugc.aweme.port.in.c.u.a()) {
            return false;
        }
        a();
        if ((!this.f134659h && !this.f134660i) || (specialPlusConfig = this.f134658g) == null) {
            return false;
        }
        if (this.f134657f.f134645a.getInt("special_plus_showed_config_version", 0) == specialPlusConfig.getVersion()) {
            return shouldShowSpecialPlus();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final boolean shouldShowSpecialPlus() {
        SpecialPlusConfig specialPlusConfig;
        SpecialPlusTimePeriod[] validTime;
        long j2;
        String str;
        float f2;
        if (com.ss.android.ugc.aweme.port.in.c.u.a()) {
            return false;
        }
        a();
        if (!(this.f134659h || this.f134660i) || (specialPlusConfig = this.f134658g) == null) {
            return false;
        }
        if (specialPlusConfig.getVersion() == this.f134657f.f134645a.getInt("special_plus_config_version", -1)) {
            if (this.f134661j != null) {
                c.C1870c.f80046a.b(this.f134661j);
            }
            return false;
        }
        SpecialPlusConfig specialPlusConfig2 = this.f134658g;
        if (!(specialPlusConfig2 == null || (validTime = specialPlusConfig2.getValidTime()) == null || validTime.length == 0)) {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            for (SpecialPlusTimePeriod specialPlusTimePeriod : validTime) {
                long j3 = -1;
                try {
                    j2 = Long.parseLong(specialPlusTimePeriod.getStart());
                    try {
                        j3 = Long.parseLong(specialPlusTimePeriod.getEnd());
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    j2 = -1;
                }
                if (j2 <= currentTimeMillis && j3 >= currentTimeMillis) {
                    this.f134657f.c();
                    SpecialPlusConfig specialPlusConfig3 = this.f134658g;
                    if (specialPlusConfig3 != null) {
                        specialPlusConfig3.getAppearance_period_in_hours();
                    }
                    this.f134657f.c();
                    float f3 = 0.0f;
                    if (this.f134660i && this.f134657f.c() != 0) {
                        float c2 = (float) (currentTimeMillis - this.f134657f.c());
                        SpecialPlusConfig specialPlusConfig4 = this.f134658g;
                        if (specialPlusConfig4 != null) {
                            f2 = specialPlusConfig4.getAppearance_period_in_hours();
                        } else {
                            f2 = 0.0f;
                        }
                        if (c2 >= f2 * 3600.0f) {
                            if (this.f134661j != null) {
                                c.C1870c.f80046a.b(this.f134661j);
                            }
                            return false;
                        }
                    }
                    SpecialPlusConfig specialPlusConfig5 = this.f134658g;
                    if (specialPlusConfig5 != null) {
                        specialPlusConfig5.getCool_down_period_in_hours();
                    }
                    if (this.f134660i) {
                        long j4 = this.f134654a;
                        if (j4 != 0) {
                            float f4 = (float) (this.f134655b - j4);
                            SpecialPlusConfig specialPlusConfig6 = this.f134658g;
                            if (specialPlusConfig6 != null) {
                                f3 = specialPlusConfig6.getCool_down_period_in_hours();
                            }
                            if (f4 <= f3 * 3600.0f) {
                                return false;
                            }
                        }
                    }
                    SpecialPlusConfig a2 = f.a();
                    if (a2 != null && com.ss.android.ugc.tools.utils.i.a(d.f134647b)) {
                        String a3 = bn.a(new File(d.f134647b));
                        String md5 = a2.getPlusIcon().getMd5();
                        if (!TextUtils.isEmpty(md5) && TextUtils.equals(a3, md5)) {
                            Effect a4 = d.f134648c.a();
                            if (a4 == null || (str = a4.getUnzipPath()) == null) {
                                str = "";
                            }
                            if (!com.ss.android.ugc.tools.utils.i.a(str) || d.f134648c.b() != a2.getVersion()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        this.f134657f.a(0);
        if (this.f134661j != null) {
            c.C1870c.f80046a.b(this.f134661j);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setSpecialPlusState(boolean z) {
        this.f134656c = z;
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void setQuickPromoPlusDebutTime(long j2) {
        this.f134657f.a(j2);
    }

    @Override // com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService
    public final void preDownloadSuperEntranceRes(Context context) {
        String str;
        String[] effectIds;
        String str2;
        l.d(context, "");
        l.d(context, "");
        bj.a("SpecialPlus, downloadSpecialPlusRes start");
        SpecialPlusConfig a2 = f.a();
        if (a2 != null) {
            if (!d.a(a2)) {
                bj.a("SpecialPlus, downloadSpecialPlusRes configuration is expired");
                return;
            }
            bj.a("SpecialPlus, downloadSpecialPlusIconUrl start");
            String url = a2.getPlusIcon().getUrl();
            String md5 = a2.getPlusIcon().getMd5();
            if (TextUtils.isEmpty(url) || TextUtils.isEmpty(md5)) {
                bj.a("SpecialPlus, downloadSpecialPlusIconUrl iconUrl or iconMd5 isEmpty");
            } else {
                String str3 = d.f134647b;
                if (com.ss.android.ugc.tools.utils.i.a(str3)) {
                    String a3 = bn.a(new File(str3));
                    if (TextUtils.isEmpty(md5) || TextUtils.equals(a3, md5)) {
                        bj.a("SpecialPlus, downloadSpecialPlusIconUrl icon do not need to be downloaded");
                    }
                }
                bj.a("SpecialPlus, downloadSpecialPlusIconUrl icon need download and start download");
                Downloader.with(context).url(url).name("special_plus_icon.png").savePath(d.f134646a).force(true).mainThreadListener(new d.a()).download();
            }
            bj.a("SpecialPlus, downloadSticker start");
            Effect a4 = d.f134648c.a();
            if (a4 == null || (str = a4.getUnzipPath()) == null) {
                str = "";
            }
            if (!com.ss.android.ugc.tools.utils.i.a(str) || d.f134648c.b() != a2.getVersion()) {
                int version = a2.getVersion();
                z.d dVar = new z.d();
                dVar.element = System.currentTimeMillis();
                SpecialPlusLabels labels = a2.getLabels();
                if (labels != null && (effectIds = labels.getEffectIds()) != null && effectIds.length != 0 && (!false) && (str2 = effectIds[0]) != null && (!TextUtils.isEmpty(str2))) {
                    bj.a("SpecialPlus, downloadSticker sticker need download and start download");
                    d.b bVar = new d.b(version, dVar);
                    l.d(str2, "");
                    l.d(bVar, "");
                    if (!TextUtils.isEmpty(str2)) {
                        Application application = com.ss.android.ugc.aweme.port.in.c.f115622a;
                        l.b(application, "");
                        f a5 = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
                        com.ss.android.ugc.aweme.port.in.c.d();
                        defpackage.c.f4871a = a5;
                        IEffectService a6 = defpackage.c.f4872b.b();
                        if (a6 != null) {
                            a6.fetchEffectWithMusicBind(defpackage.c.f4871a, str2, "", bVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            bj.a("SpecialPlus, downloadSticker sticker do not need to be downloaded");
        }
    }
}
