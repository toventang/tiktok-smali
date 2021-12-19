package com.ss.android.ugc.aweme.livewallpaper.f;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.hm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.e.c;
import com.ss.android.ugc.aweme.livewallpaper.e.d;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Collection;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(69745);
    }

    public static float a(int i2) {
        return (((float) i2) * 1.0f) / 100.0f;
    }

    public static boolean a(Context context, String str) {
        try {
            WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
            if (wallpaperInfo == null) {
                return false;
            }
            String packageName = wallpaperInfo.getPackageName();
            if (d()) {
                return c.f108896a.equals(packageName);
            }
            return packageName.equals(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(Activity activity, String str, Aweme aweme) {
        if (!d() || activity == null || activity.isFinishing()) {
            return false;
        }
        boolean b2 = com.ss.android.common.util.f.b(activity, c.f108896a);
        if (b2 && !a(activity)) {
            return false;
        }
        a(activity, b2, str, aweme);
        return true;
    }

    public static boolean a(Activity activity) {
        return d.a() > a.a(activity, c.f108896a);
    }

    public static void a(String str, String str2, boolean z, String str3) {
        int i2;
        String str4;
        String str5;
        LiveWallPaperBean liveWallPaperBean = d.f108899e.f108902c;
        if (liveWallPaperBean == null || liveWallPaperBean.getVolume() <= 0.0f) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (z) {
            str4 = "wall_paper_success";
        } else {
            str4 = "wall_paper_fail";
        }
        r.a(str4, new com.ss.android.ugc.aweme.app.f.d().a("group_id", str).a("enter_from", str2).a("is_volume_enable", i2).a("error_msg", str3).f66730a);
        if (z) {
            UgCommonServiceImpl.j().d();
        }
        IRuntimeBehaviorService c2 = RuntimeBehaviorServiceImpl.c();
        if (z) {
            str5 = "wallpaper_set_success";
        } else {
            str5 = "wallpaper_set_error";
        }
        c2.a(str5, String.valueOf(h.g()));
    }

    public static boolean a(Aweme aweme) {
        if (!b(aweme)) {
            return aweme != null && aweme.getAuthor() != null && !b.g().isMe(aweme.getAuthor().getUid()) && aweme.getAuthor().isSecret();
        }
        return true;
    }

    public static void a(String str, String str2, boolean z) {
        r.a("wallpaper_download_result", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("group_id", str2).a("is_success", z ? 1 : 0).f66730a);
    }

    public static boolean c() {
        return SettingsManager.a().a("live_wallpaper_block", false);
    }

    public static boolean d() {
        if (!c.a()) {
            return true;
        }
        return false;
    }

    public static String b() {
        return a() + "fallback.mp4";
    }

    public static String a() {
        File a2 = a(com.bytedance.ies.ugc.appcontext.d.a());
        if (a2 != null) {
            return a2 + "/LiveWallpaper/";
        }
        return "";
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    private static void b(String str) {
        r.a("wallpaper_plugin_alert", new com.ss.android.ugc.aweme.app.f.d().a("group_id", str).a("is_gp_install", Boolean.valueOf(com.ss.android.common.util.f.b(com.bytedance.ies.ugc.appcontext.d.a(), "com.android.vending"))).f66730a);
    }

    public static boolean b(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return true;
        }
        int width = video.getWidth();
        int height = video.getHeight();
        if (width == 0 || height == 0 || aweme.getAwemeType() == 2) {
            return true;
        }
        return false;
    }

    public static void a(String str) {
        r.a("wallpaper_start_download", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
    }

    public static void a(String str, String str2) {
        a(str, str2, true, "");
    }

    public static a a(Context context, a.AbstractC2787a aVar) {
        if (hm.a()) {
            return new com.ss.android.ugc.aweme.livewallpaper.c(context, aVar);
        }
        return new com.ss.android.ugc.aweme.livewallpaper.b(aVar);
    }

    public static void b(int i2, String str) {
        com.bytedance.apm.b.a("livewall_paper_download", i2, new com.ss.android.ugc.aweme.app.f.c().a("message", str).a());
        if (!TextUtils.isEmpty(str)) {
            n.a("type_livewall_paper_download", "", new com.ss.android.ugc.aweme.app.f.c().a("message", str).a());
        }
    }

    static final /* synthetic */ Object a(Context context, boolean z) {
        MethodCollector.i(9305);
        try {
            if (d() && com.ss.android.common.util.f.b(context, c.f108896a)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("need_tighten", z);
                context.getContentResolver().call(c.f108898c, "change_mode", "", bundle);
            }
        } catch (RuntimeException unused) {
        }
        MethodCollector.o(9305);
        return null;
    }

    public static void a(int i2, String str) {
        com.bytedance.apm.b.a("livewall_paper_setting", i2, new com.ss.android.ugc.aweme.app.f.c().a("message", str).a());
        if (!TextUtils.isEmpty(str)) {
            n.a("type_livewallpaper_setting", "", new com.ss.android.ugc.aweme.app.f.c().a("message", str).a());
        }
    }

    public static void a(Activity activity, boolean z, boolean z2) {
        r.a("wallpaper_plugin_download_dialog_click", new com.ss.android.ugc.aweme.app.f.d().a("action", z ? 1 : 0).a("is_gp_install", com.ss.android.common.util.f.b(activity, "com.android.vending") ? 1 : 0).a(StringSet.type, z2 ? 1 : 0).f66730a);
    }

    private static void a(final Activity activity, final boolean z, String str, final Aweme aweme) {
        int i2;
        int i3;
        int i4;
        MethodCollector.i(9302);
        if (activity == null || activity.isFinishing()) {
            MethodCollector.o(9302);
            return;
        }
        if (z) {
            i2 = R.string.h69;
            i3 = R.string.h6_;
            i4 = R.string.h68;
        } else {
            i2 = R.string.hdw;
            i3 = R.string.hdx;
            i4 = R.string.cnr;
        }
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new com.bytedance.tux.c.b(activity, R.raw.icon_2pt_live_wallpaper));
        new a.C0731a(activity).a(i3).b(i2).b(R.string.dj3, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.livewallpaper.f.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69747);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                f.a(activity, false, z);
            }
        }, false).a(imageView, 48, 48).a(i4, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.ugc.aweme.livewallpaper.f.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69746);
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                Video video;
                UrlModel cover;
                String str;
                if (aweme != null) {
                    d dVar = d.f108899e;
                    Aweme aweme = aweme;
                    if (!(dVar.b(aweme.getAid()) || (video = aweme.getVideo()) == null || (cover = video.getCover()) == null || video.getPlayAddrH264() == null || com.bytedance.common.utility.collection.b.a((Collection) video.getPlayAddrH264().getUrlList()))) {
                        List<String> urlList = video.getPlayAddrH264().getUrlList();
                        if (urlList.size() > 2) {
                            str = urlList.get(2);
                        } else {
                            str = urlList.get(0);
                        }
                        String a2 = com.ss.android.ugc.aweme.app.e.a.a(aweme, str);
                        if (!TextUtils.isEmpty(a2)) {
                            LiveWallPaperBean.a newBuilder = LiveWallPaperBean.newBuilder();
                            newBuilder.f108934a = aweme.getAid();
                            newBuilder.f108941h = cover;
                            newBuilder.f108942i = a2;
                            newBuilder.f108943j = video.getPlayAddrH264().getUri();
                            newBuilder.f108937d = video.getWidth();
                            newBuilder.f108938e = video.getHeight();
                            newBuilder.f108939f = "video_share";
                            newBuilder.f108940g = 0.0f;
                            newBuilder.f108944k = ah.f123352a.a(aweme);
                            dVar.f108900a.add(0, newBuilder.a());
                            dVar.b();
                        }
                    }
                }
                Activity activity = activity;
                if (activity != null) {
                    try {
                        if (!com.ss.android.common.util.f.b(activity, "com.android.vending")) {
                            SmartRouter.buildRoute(activity, "aweme://webview/").withParam(Uri.parse("https://play.google.com/store/apps/details?id=com.zhiliao.musically.livewallpaper")).withParam("hide_nav_bar", true).withParam("hide_status_bar", true).open();
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.zhiliao.musically.livewallpaper"));
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                            activity.startActivity(intent);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                f.a(activity, true, z);
            }
        }, false).a().c();
        b(str);
        MethodCollector.o(9302);
    }
}
