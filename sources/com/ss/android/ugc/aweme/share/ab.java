package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.ss.android.ugc.aweme.feed.q.w;
import com.ss.android.ugc.aweme.initializer.n;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.model.a.a;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.l.b;
import com.ss.android.ugc.aweme.shortvideo.l.p;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.aweme.utils.gy;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class ab implements ShareDependService {
    static {
        Covode.recordClassIndex(80996);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public void a(Context context, Aweme aweme, String str, String str2, String str3) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public boolean c() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(String str, d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        r.a(str, dVar.f66730a);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, String str) {
        Aweme d2 = AwemeService.b().d(str);
        AwemeRawAd awemeRawAd = null;
        j.a(context, "share", d2, j.a(context, d2, false, (Map<String, String>) null));
        if (d2 != null) {
            awemeRawAd = d2.getAwemeRawAd();
        }
        a.a("landing_ad", "share", awemeRawAd).a("anchor_id", gy.b(d2)).a("room_id", gy.a(d2)).c();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, boolean z) {
        l.d(context, "");
        ((com.ss.android.ugc.trill.share.a.a) com.ss.android.ugc.aweme.base.b.a.a.a(context, com.ss.android.ugc.trill.share.a.a.class)).a(z);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(String str, Aweme aweme, Activity activity, String str2, Map<String, String> map, boolean z, boolean z2) {
        l.d(str, "");
        l.d(aweme, "");
        l.d(activity, "");
        l.d(str2, "");
        l.d(map, "");
        b bVar = new b();
        bVar.f128647a = str;
        bVar.f128648b = map;
        bVar.f128659m = z;
        bVar.n = z2;
        bVar.a(aweme, activity, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, String str, int i2) {
        l.d(context, "");
        l.d(str, "");
        MovieReuseServiceImpl.a().a(context, Integer.valueOf(IMovieReuseService.a.f139292a), str, Integer.valueOf(i2), null, null);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Aweme aweme, Activity activity, String str) {
        Resources resources;
        l.d(aweme, "");
        l.d(activity, "");
        l.d(str, "");
        p pVar = new p();
        l.d(aweme, "");
        l.d(activity, "");
        l.d(str, "");
        pVar.f128694a = activity;
        pVar.f128696c = aweme;
        pVar.f128695b = str;
        IExternalService a2 = AVExternalServiceImpl.a();
        l.b(a2, "");
        if (in.d()) {
            new com.bytedance.tux.g.b(activity).e(R.string.de9).b();
        } else if (a2.configService().avsettingsConfig().needLoginBeforeRecord()) {
            c.a(activity, str, "click_stitch_button");
        } else if (!AVExternalServiceImpl.a().publishService().isPublishable()) {
            new com.bytedance.tux.g.b(activity).e(R.string.fal).b();
        } else if (aweme.getAuthor() == null) {
        } else {
            if (!e.e()) {
                new com.bytedance.tux.g.b(activity).e(R.string.fhb).b();
            } else if (e.f() < 20971520) {
                new com.bytedance.tux.g.b(activity).e(R.string.fhc).b();
            } else if (!fe.a(activity)) {
                new com.bytedance.tux.g.b(activity).e(R.string.de9).b();
            } else if (CommerceMediaServiceImpl.f().b(aweme.getMusic())) {
                new com.bytedance.tux.g.b(activity).e(R.string.ft7).b();
            } else {
                if (pVar.f128697d == null) {
                    Activity activity2 = pVar.f128694a;
                    Activity activity3 = pVar.f128694a;
                    pVar.f128697d = com.ss.android.ugc.aweme.shortvideo.view.d.a(activity2, (activity3 == null || (resources = activity3.getResources()) == null) ? null : resources.getString(R.string.bdz));
                }
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = pVar.f128697d;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
                com.ss.android.ugc.aweme.shortvideo.view.d dVar2 = pVar.f128697d;
                if (dVar2 != null) {
                    dVar2.setProgress(0);
                }
                i.b(new p.d(aweme), i.f4824a).a(new p.e(pVar), i.f4826c, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(String str, Context context) {
        l.d(str, "");
        l.d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        AddWikiActivity.a.a(context, str, hashMap, ag.a());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, Aweme aweme, boolean z, ArrayList<String> arrayList, String str, int i2, boolean z2) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(arrayList, "");
        l.d(str, "");
        a.C2826a aVar = new a.C2826a();
        aVar.f110691g = Integer.valueOf(i2);
        if (aweme.getMusic() != null) {
            Music music = aweme.getMusic();
            l.b(music, "");
            l.d(music, "");
            aVar.f110685a = music;
        }
        if (z) {
            a.C2826a a2 = aVar.a("green_screen");
            String aid = aweme.getAid();
            l.b(aid, "");
            l.d(aid, "");
            a2.f110686b = aid;
        } else {
            aVar.b("prop_auto");
        }
        l.d("prop_reuse", "");
        aVar.f110688d = "prop_reuse";
        PropReuseServiceImpl.c().a(context, arrayList, aVar.a(), z2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean b() {
        Activity j2 = f.j();
        if (j2 == null) {
            return false;
        }
        if (j2 instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) j2;
            if (mainActivity.isMainTabVisible()) {
                if (mainActivity.getCurFragment() == null || !(mainActivity.getCurFragment() instanceof com.ss.android.ugc.aweme.main.l)) {
                    return true;
                }
                Fragment curFragment = mainActivity.getCurFragment();
                Objects.requireNonNull(curFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.IMainFragment");
                if (!((com.ss.android.ugc.aweme.main.l) curFragment).n()) {
                    return true;
                }
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (!g2.isLogin()) {
                    return false;
                }
                return true;
            }
        }
        return j2 instanceof DetailActivity;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(boolean z) {
        w.f93818e = z;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final com.ss.android.ugc.aweme.account.model.a a(User user) {
        l.d(user, "");
        return new n(user);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final int b(Aweme aweme) {
        CommercePermissionStruct commercePermission;
        l.d(aweme, "");
        User author = aweme.getAuthor();
        if (author == null || !com.ss.android.ugc.aweme.account.b.g().isMe(author.getUid()) || (commercePermission = com.ss.android.ugc.aweme.account.b.g().getCurUser().getCommercePermission()) == null || commercePermission.topItem != 1) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean c(Aweme aweme) {
        l.d(aweme, "");
        if (aweme == null || aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthorUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
            return false;
        }
        if (com.ss.android.ugc.aweme.account.b.g().getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final q<PromoteEntryCheck> a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return ((PromoteEntryCheckApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(PromoteEntryCheckApi.class)).getPromoteEntryCheck(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final com.ss.android.ugc.aweme.sharer.b a(SharePackage sharePackage, String str) {
        l.d(sharePackage, "");
        l.d(str, "");
        return new com.ss.android.ugc.aweme.share.improve.b.d(sharePackage, str, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void c(Context context, Aweme aweme) {
        l.d(context, "");
        l.d(aweme, "");
        j.a(context, "open_url_h5", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "open_url_h5", aweme.getAwemeRawAd()).c();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void d(Context context, Aweme aweme) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(context, "");
        l.d(aweme, "");
        Intent intent = new Intent(context, AdSettingsActivity.class);
        intent.putExtra("id", aweme.getAid());
        AdSettingsActivity.f122681d = aweme;
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void b(Context context, Aweme aweme) {
        l.d(context, "");
        l.d(aweme, "");
        j.a(context, "copy", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "copy", aweme.getAwemeRawAd()).c();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final String a(Aweme aweme, int i2) {
        String str;
        String str2;
        String str3;
        l.d(aweme, "");
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String aid = aweme.getAid();
        if (aweme.isAd()) {
            str2 = String.valueOf(aweme.getAwemeRawAd().getAdId());
            str3 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
            str = aweme.getAwemeRawAd().getLogExtra();
        } else {
            str = "";
            str2 = str;
            str3 = str2;
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("ad_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("creative_id", str3);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("ad_category", "");
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("log_extra", str);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("dislike_source", "");
        }
        hashMap.put("channel_id", String.valueOf(i2));
        com.ss.android.common.applog.q.b(hashMap, true);
        AwemeApi.f115980e.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Activity activity, Aweme aweme) {
        l.d(activity, "");
        l.d(aweme, "");
        new com.ss.android.ugc.aweme.livewallpaper.b.b(activity).c(aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, Aweme aweme) {
        l.d(context, "");
        l.d(aweme, "");
        j.a(context, "report", aweme, j.a(context, aweme, false, (Map<String, String>) null));
        com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "report", aweme.getAwemeRawAd()).c();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final com.ss.android.ugc.aweme.sharer.ui.i a(Activity activity, com.ss.android.ugc.aweme.sharer.ui.e eVar, int i2) {
        l.d(activity, "");
        l.d(eVar, "");
        return new com.ss.android.ugc.aweme.share.improve.b(activity, eVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, Aweme aweme, String str) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            return;
        }
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.U(aweme) || (com.ss.android.ugc.aweme.commercialize.e.a.b.U(aweme) && !TextUtils.equals(null, "chat_merge"))) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "share", aweme.getAwemeRawAd()).a("anchor_id", gy.b(aweme)).a("room_id", gy.a(aweme)).c();
        }
    }
}
