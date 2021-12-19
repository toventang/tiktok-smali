package com.ss.android.ugc.aweme.services;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.asve.c;
import com.ss.android.ugc.aweme.experiment.ch;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.port.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.ax;
import com.ss.android.ugc.aweme.property.ay;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.property.bt;
import com.ss.android.ugc.aweme.property.bv;
import com.ss.android.ugc.aweme.property.by;
import com.ss.android.ugc.aweme.property.cj;
import com.ss.android.ugc.aweme.property.cr;
import com.ss.android.ugc.aweme.property.cz;
import com.ss.android.ugc.aweme.property.db;
import com.ss.android.ugc.aweme.property.dh;
import com.ss.android.ugc.aweme.property.du;
import com.ss.android.ugc.aweme.property.dv;
import com.ss.android.ugc.aweme.property.ee;
import com.ss.android.ugc.aweme.property.eg;
import com.ss.android.ugc.aweme.property.eh;
import com.ss.android.ugc.aweme.property.ez;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.property.fa;
import com.ss.android.ugc.aweme.property.y;
import com.ss.android.ugc.aweme.property.z;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.setting.i.n;
import com.ss.android.ugc.aweme.shortvideo.i.k;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.vesdk.u;
import h.f.b.l;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class AVSettingsServiceImpl implements IAVSettingsService {
    private static AVSettingsServiceImpl sInstance = new AVSettingsServiceImpl();

    private int clamp(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static int com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableFeedbackLog() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public int getMvPlan() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getPublishProgressOptimize() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getVESDKVersion() {
        return "10.6.0.132-mt";
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableUseVEGetThumbs() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isPhotoEditEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean needLoginBeforeRecord() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean shareVideo2GifEditable() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showDuetWithReact() {
        return false;
    }

    public static AVSettingsServiceImpl getInstance() {
        return sInstance;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getEffectVersion() {
        return c.f61937a;
    }

    private void asynMonitorAwemeSetting() {
        i.b(AVSettingsServiceImpl$$Lambda$0.$instance, i.f4824a);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public a<Boolean> bubbleGuideShown() {
        return new a<Boolean>() {
            /* class com.ss.android.ugc.aweme.services.AVSettingsServiceImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(79404);
            }

            @Override // com.ss.android.ugc.aweme.port.a
            public Boolean get() {
                return Boolean.valueOf(g.a().e().getBubbleGuideShown(false));
            }

            public void set(Boolean bool) {
                g.a().e().setBubbleGuideShown(bool.booleanValue());
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableNewMusicMarquee() {
        return ch.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableQaSticker() {
        return ay.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableSaveUploadVideo() {
        return b.i();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableStitch() {
        return ee.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableStudioScreenRightCorner() {
        return eg.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableTaskDegradationOpti() {
        return n.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableTitan() {
        return bn.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getDuetStickerAB() {
        return z.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public int getEnablePublishPrivacySetting() {
        return ax.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getLongVideoPermittedValue() {
        return cj.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getMvThemeRecordMode() {
        return cr.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean getPostDownloadSetting() {
        return cz.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableGetThumbsWithEffect() {
        return bt.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isEnableVideoEditActivityUploadSpeedProbe() {
        return bv.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isLongVideoPermitted() {
        return k.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public int recommentMusicByAIPolicy() {
        return dh.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean showMvThemeRecordMode() {
        return cr.a();
    }

    static {
        Covode.recordClassIndex(79402);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean downloadEffectOrMusicAfterEnterCamera() {
        if (y.a() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableModelFileOnlyEnv() {
        return com.bytedance.ies.abmock.b.a().a(true, "model_file_test_env", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncIns() {
        return SettingsManager.a().a("enable_upload_sync_ins", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncInsStory() {
        return SettingsManager.a().a("enable_upload_sync_ins_story", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enableUploadSyncTwitter() {
        return SettingsManager.a().a("enable_upload_sync_twitter", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String[] getSharePostEffectIds() {
        dv a2 = du.a();
        if (a2.f118472d != null) {
            return a2.f118472d;
        }
        return new String[0];
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public String getStickerArtistIconUrl() {
        String a2 = SettingsManager.a().a("sticker_artist_icon_url", "");
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isDuetAutoApplyEffectEnabled() {
        if (com.bytedance.ies.abmock.b.a().a(true, "auto_apply_effect_in_duet", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean isPrivateAvailable() {
        return SettingsManager.a().a("private_available", true);
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public long progressBarThreshold() {
        return SettingsManager.a().a(" progressbar_threshold", 30000L);
    }

    private boolean isInTikTokRegion() {
        com.ss.android.ugc.aweme.port.in.ay A = com.ss.android.ugc.aweme.port.in.l.f115658a.A();
        if (A == null || !A.b().booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public boolean enablePreUploadByUser() {
        boolean enablePreUploadByUser = g.a().e().getEnablePreUploadByUser(false);
        bj.a("Get EnablePreUploadByUser:".concat(String.valueOf(enablePreUploadByUser)));
        return enablePreUploadByUser;
    }

    static final /* synthetic */ Void lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl() {
        try {
            com.ss.android.ugc.aweme.shortvideo.p.a.a("filter", f.a());
            com.ss.android.ugc.aweme.shortvideo.p.a.a("hard_code_shot", by.b());
            com.ss.android.ugc.aweme.shortvideo.p.a.a("hard_code_release", eh.b());
            int i2 = 0;
            if (g.a().e().getWatermarkHardcode(false)) {
                i2 = 1;
            }
            com.ss.android.ugc.aweme.shortvideo.p.a.a("hard_code_water_marker", i2);
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void setEnablePreUploadByUser(boolean z) {
        bj.a("Set EnablePreUploadByUser:".concat(String.valueOf(z)));
        g.a().e().setEnablePreUploadByUser(z);
    }

    public void updateServerSettings(IESSettingsProxy iESSettingsProxy) {
        if (cj.a()) {
            k.f128562a = !cj.a();
        }
        com.ss.android.ugc.aweme.shortvideo.p.a aVar = com.ss.android.ugc.aweme.shortvideo.p.a.f129532c;
        com.ss.android.ugc.aweme.shortvideo.p.a.f129530a = true;
        aVar.a();
        asynMonitorAwemeSetting();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void updateABTestModel(o oVar) {
        Object valueOf;
        o f2 = oVar.f("data");
        if (f2 == null) {
            com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("AVSettingsServiceImpl", "data is null");
            return;
        }
        ez ezVar = com.ss.android.ugc.aweme.port.in.c.I;
        l.d(f2, "");
        ezVar.f118525a.a();
        u a2 = u.a();
        l.b(a2, "");
        Map<String, u.d> map = a2.f151490a;
        l.b(map, "");
        for (Map.Entry<String, u.d> entry : map.entrySet()) {
            if (entry.getValue() != null && !TextUtils.isEmpty(entry.getKey()) && f2.b(entry.getKey())) {
                String key = entry.getKey();
                l.b(key, "");
                u.d value = entry.getValue();
                l.b(value, "");
                db.a a3 = ez.a(key, value);
                db.b b2 = a3.b();
                if (b2 != null) {
                    int i2 = fa.f118534e[b2.ordinal()];
                    if (i2 == 1) {
                        String a4 = a3.a();
                        l.b(a4, "");
                        Object c2 = a3.c();
                        Objects.requireNonNull(c2, "null cannot be cast to non-null type kotlin.Boolean");
                        valueOf = Boolean.valueOf(ez.a(f2, a4, ((Boolean) c2).booleanValue()));
                    } else if (i2 == 2) {
                        String a5 = a3.a();
                        l.b(a5, "");
                        Object c3 = a3.c();
                        Objects.requireNonNull(c3, "null cannot be cast to non-null type kotlin.Int");
                        valueOf = Integer.valueOf(ez.a(f2, a5, ((Integer) c3).intValue()));
                    } else if (i2 == 3) {
                        String a6 = a3.a();
                        l.b(a6, "");
                        Object c4 = a3.c();
                        Objects.requireNonNull(c4, "null cannot be cast to non-null type kotlin.Long");
                        valueOf = Long.valueOf(ez.a(f2, a6, ((Long) c4).longValue()));
                    } else if (i2 == 4) {
                        String a7 = a3.a();
                        l.b(a7, "");
                        Object c5 = a3.c();
                        Objects.requireNonNull(c5, "null cannot be cast to non-null type kotlin.Float");
                        valueOf = Float.valueOf(ez.a(f2, a7, ((Float) c5).floatValue()));
                    } else if (i2 == 5) {
                        String a8 = a3.a();
                        l.b(a8, "");
                        valueOf = ez.a(f2, a8);
                    }
                    db dbVar = ezVar.f118525a;
                    db.b b3 = a3.b();
                    if (b3 != null) {
                        int i3 = fa.f118533d[b3.ordinal()];
                        if (i3 == 1) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
                            dbVar.a(a3, ((Boolean) valueOf).booleanValue());
                        } else if (i3 == 2) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Int");
                            dbVar.a(a3, ((Integer) valueOf).intValue());
                        } else if (i3 == 3) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Long");
                            dbVar.a(a3, ((Long) valueOf).longValue());
                        } else if (i3 == 4) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.Float");
                            dbVar.a(a3, ((Float) valueOf).floatValue());
                        } else if (i3 == 5) {
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.String");
                            dbVar.a(a3, (String) valueOf);
                        }
                    }
                }
                throw new h.n();
            }
        }
        com.ss.android.ugc.aweme.shortvideo.p.a aVar = com.ss.android.ugc.aweme.shortvideo.p.a.f129532c;
        com.ss.android.ugc.aweme.shortvideo.p.a.f129531b = true;
        aVar.a();
    }

    @Override // com.ss.android.ugc.aweme.services.settings.IAVSettingsService
    public void setDefaultFilterForCamera(int i2, int i3) {
        if (i2 == 0) {
            g.a().e().setBackCameraFilter(i3);
        } else {
            g.a().e().setFrontCameraFilter(i3);
        }
    }

    private int getAsInt(o oVar, String str, int i2) {
        try {
            r d2 = oVar.d(str);
            if (d2 != null) {
                if (!(d2.f54900a instanceof Boolean)) {
                    i2 = d2.g();
                } else if (d2.h()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i("AVSettingsServiceImpl", com.a.a(Locale.getDefault(), "%s: %d", new Object[]{str, Integer.valueOf(i2)}));
            }
        } catch (Exception e2) {
            com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("AVSettingsServiceImpl", str, e2);
            e2.printStackTrace();
        }
        return i2;
    }

    private boolean getAsBoolean(o oVar, String str, boolean z) {
        try {
            r d2 = oVar.d(str);
            if (d2 != null) {
                if (!(d2.f54900a instanceof Number)) {
                    z = d2.h();
                } else if (d2.b().intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_i("AVSettingsServiceImpl", com.a.a(Locale.getDefault(), "%s: %b", new Object[]{str, Boolean.valueOf(z)}));
            }
        } catch (Exception e2) {
            com_ss_android_ugc_aweme_services_AVSettingsServiceImpl_com_ss_android_ugc_aweme_lancet_LogLancet_e("AVSettingsServiceImpl", str, e2);
            e2.printStackTrace();
        }
        return z;
    }
}
