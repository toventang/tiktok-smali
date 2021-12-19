package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.services.IRessoAnchorServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class bg {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111931a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f111932b;

    /* renamed from: c  reason: collision with root package name */
    private final String f111933c;

    /* renamed from: d  reason: collision with root package name */
    private final String f111934d;

    /* renamed from: e  reason: collision with root package name */
    private final String f111935e;

    static {
        Covode.recordClassIndex(71944);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71945);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    private final void a(Context context, ExternalMusicInfo externalMusicInfo) {
        String str;
        if (!(!l.a((Object) "resso", (Object) externalMusicInfo.getPartnerName()))) {
            HashMap hashMap = new HashMap();
            if (com.ss.android.ugc.aweme.music.l.a.a(context)) {
                str = "other_app";
            } else {
                String externalSchema = externalMusicInfo.getExternalSchema();
                if (externalSchema == null || !p.b(externalSchema, "aweme://lynxview/", false)) {
                    str = "webview";
                } else {
                    str = "lynx";
                }
            }
            hashMap.put("anchor_type", "Resso");
            hashMap.put("enter_from", "single_song");
            hashMap.put("click_type", str);
            hashMap.put("music_id", this.f111934d);
            hashMap.put("anchor_id", externalMusicInfo.getPartnerSongId());
            hashMap.put("external_label_id", externalMusicInfo.getExternalLabel());
            r.a("enter_anchor_detail", hashMap);
        }
    }

    public final void c(Context context, List<ExternalMusicInfo> list) {
        String str;
        l.d(list, "");
        for (ExternalMusicInfo externalMusicInfo : list) {
            HashMap hashMap = new HashMap();
            hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
            if (!this.f111932b || !l.a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                hashMap.put("music_from", externalMusicInfo.getPartnerName());
            } else {
                hashMap.put("music_from", "resso_exclusive");
            }
            if (l.a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                if (com.ss.android.ugc.aweme.music.l.a.a(context)) {
                    str = "other_app";
                } else {
                    str = "lynx";
                }
                hashMap.put("show_type", str);
                String externalLabel = externalMusicInfo.getExternalLabel();
                if (externalLabel == null) {
                    externalLabel = "";
                }
                hashMap.put("external_label_id", externalLabel);
            }
            hashMap.put("process_id", this.f111933c);
            r.a("show_copyright_music", hashMap);
        }
    }

    private final void b(Context context, ExternalMusicInfo externalMusicInfo) {
        if (l.a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
            if (Keva.getRepo("anchor_data_keva").getInt("is_resso_installed_key", -1) == -1) {
                Keva.getRepo("anchor_data_keva").storeInt("is_resso_installed_key", com.ss.android.ugc.aweme.music.l.a.a(context) ? 1 : 0);
            }
            if (com.ss.android.ugc.aweme.music.l.a.a(context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(externalMusicInfo.getExternalAppLink()));
                    intent.addCategory("android.intent.category.BROWSABLE");
                    intent.addCategory("android.intent.category.DEFAULT");
                    a(context, intent);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(externalMusicInfo.getExternalDeepLink()));
                    intent2.addCategory("android.intent.category.BROWSABLE");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setPackage("com.moonvideo.android.resso");
                    a(context, intent2);
                }
            } else if (!TextUtils.isEmpty(externalMusicInfo.getExternalSchema())) {
                String externalSchema = externalMusicInfo.getExternalSchema();
                if (externalSchema == null) {
                    externalSchema = "";
                }
                a(context, externalSchema, externalMusicInfo.getExternalLabel());
            }
        } else if (!TextUtils.isEmpty(externalMusicInfo.getJumpUrl())) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", externalMusicInfo.getJumpUrl()).withParam("hide_nav_bar", false).withParam("use_webview_title", true).withParam("bundle_forbidden_jump", true).open();
        }
        r.a("click_listen_complete_entrance", new d().a("enter_from", "single_song").a("music_id", this.f111934d).f66730a);
    }

    public final void b(Context context, List<ExternalMusicInfo> list) {
        String str;
        String a2;
        String str2 = "";
        l.d(list, str2);
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPartnerSongId());
        }
        String a3 = n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62);
        if (list.size() == 1) {
            str = list.get(0).getPartnerName();
            if (this.f111932b && l.a((Object) "resso", (Object) str)) {
                str = "resso_exclusive";
            }
        } else {
            str = "multi_anchor";
        }
        if (list.size() == 1) {
            a2 = str2;
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getPartnerName());
            }
            a2 = n.a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62);
        }
        if (list.size() == 1) {
            if (com.ss.android.ugc.aweme.music.l.a.a(context)) {
                str2 = "other_app";
            } else {
                str2 = "lynx";
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("music_id", a3);
        hashMap.put("music_from", str);
        hashMap.put("multi_anchor", a2);
        hashMap.put("show_type", str2);
        hashMap.put("process_id", this.f111933c);
        r.a("click_copyright_music", hashMap);
        if (list.size() == 1) {
            a(context, list.get(0));
        }
    }

    public final void a(Context context, List<ExternalMusicInfo> list) {
        String str;
        String a2;
        String str2;
        String str3 = "";
        l.d(list, str3);
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPartnerSongId());
        }
        String a3 = n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62);
        if (list.size() == 1) {
            str = list.get(0).getPartnerName();
            if (this.f111932b && l.a((Object) "resso", (Object) str)) {
                str = "resso_exclusive";
            }
        } else {
            str = "multi_anchor";
        }
        if (list.size() == 1) {
            a2 = str3;
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getPartnerName());
            }
            a2 = n.a(arrayList2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62);
        }
        if (list.size() != 1) {
            str2 = str3;
        } else if (com.ss.android.ugc.aweme.music.l.a.a(context)) {
            str2 = "other_app";
        } else {
            str2 = "lynx";
        }
        HashMap hashMap = new HashMap();
        if (list.size() == 1 && l.a((Object) "resso", (Object) list.get(0).getPartnerName())) {
            String externalLabel = list.get(0).getExternalLabel();
            if (externalLabel != null) {
                str3 = externalLabel;
            }
            hashMap.put("external_label_id", str3);
        }
        hashMap.put("music_id", a3);
        hashMap.put("music_from", str);
        hashMap.put("multi_anchor", a2);
        hashMap.put("show_type", str2);
        hashMap.put("process_id", this.f111933c);
        r.a("show_copyright_music", hashMap);
    }

    public final void a(Context context, ExternalMusicInfo externalMusicInfo, boolean z) {
        String str;
        l.d(externalMusicInfo, "");
        if (context != null) {
            b(context, externalMusicInfo);
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("music_id", externalMusicInfo.getPartnerSongId());
                if (!this.f111932b || !l.a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                    hashMap.put("music_from", externalMusicInfo.getPartnerName());
                } else {
                    hashMap.put("music_from", "resso_exclusive");
                }
                hashMap.put("process_id", this.f111933c);
                if (l.a((Object) "resso", (Object) externalMusicInfo.getPartnerName())) {
                    if (com.ss.android.ugc.aweme.music.l.a.a(context)) {
                        str = "other_app";
                    } else {
                        str = "lynx";
                    }
                    hashMap.put("show_type", str);
                }
                r.a("click_copyright_music", hashMap);
                a(context, externalMusicInfo);
            }
        }
    }

    private final void a(Context context, String str, String str2) {
        String str3;
        h.p<Long, Integer> copyrightLimitMsUninstalledResso = IRessoAnchorServiceImpl.createIRessoAnchorServicebyMonsterPlugin(false).getCopyrightLimitMsUninstalledResso(str2);
        long longValue = copyrightLimitMsUninstalledResso.getFirst().longValue();
        int intValue = copyrightLimitMsUninstalledResso.getSecond().intValue();
        String g2 = com.ss.android.ugc.aweme.language.d.g();
        String str4 = "";
        if (g2 != null) {
            Locale locale = Locale.getDefault();
            l.b(locale, str4);
            Objects.requireNonNull(g2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = g2.toLowerCase(locale);
            l.b(lowerCase, str4);
            if (lowerCase != null) {
                str4 = lowerCase;
            }
        }
        if (p.b(str, "aweme://lynxview/", false)) {
            str3 = str + "&enter_from=" + "single_song" + "&lang=" + SettingServiceImpl.v().h() + "&copyright_limit_ms=" + longValue + "&region=" + str4 + "&copyright_limit_count=" + intValue + "&process_id=" + this.f111933c + "&group_id=" + this.f111935e;
        } else {
            str3 = str + "%26enter_from%3D" + "single_song" + "%26lang%3D" + SettingServiceImpl.v().h() + "%26copyright_limit_ms%3D" + longValue + "%26region%3D" + str4 + "%26copyright_limit_count%3D" + intValue + "%26process_id%3D" + this.f111933c + "%26group_id%3D" + this.f111935e;
        }
        if (!TextUtils.isEmpty(str)) {
            SmartRouter.buildRoute(context, str3).withParam("enter_from", "single_song").open();
        }
    }

    public bg(boolean z, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f111932b = z;
        this.f111933c = str;
        this.f111934d = str2;
        this.f111935e = str3;
    }
}
