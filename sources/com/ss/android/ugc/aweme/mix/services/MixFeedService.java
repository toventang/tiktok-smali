package com.ss.android.ugc.aweme.mix.services;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.g;
import com.ss.android.ugc.aweme.mix.d.a;
import com.ss.android.ugc.aweme.mix.mixdetail.o;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.Arrays;

public final class MixFeedService implements IMixFeedService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f110265a = new a((byte) 0);

    static {
        Covode.recordClassIndex(70766);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final int d() {
        return 100;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70767);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Context context, Bundle bundle, int i2, String str, String str2) {
        l.d(context, "");
        l.d(bundle, "");
        l.d(str, "");
        l.d(str2, "");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/create_page").buildIntent();
        bundle.putInt("open_fragment_type", i2);
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
        buildIntent.putExtras(bundle);
        a(context, buildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Context context, Bundle bundle, String str, String str2, Long l2, String str3) {
        l.d(context, "");
        l.d(bundle, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/chang_play_list_name").buildIntent();
        bundle.putString("user_last_name", str);
        bundle.putString("mix_id", str2);
        bundle.putString("enter_from", str3);
        if (l2 != null) {
            l2.longValue();
            bundle.putLong("moderated_rename_timestamp", l2.longValue());
        }
        buildIntent.putExtras(bundle);
        a(context, buildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean a(Aweme aweme) {
        PlayListInfo playListInfo;
        return (aweme == null || (playListInfo = aweme.playlist_info) == null || TextUtils.isEmpty(playListInfo.getMixId())) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, boolean z, com.ss.android.ugc.aweme.mix.e.b bVar, String str6) {
        l.d(str2, "");
        l.d(str3, "");
        com.ss.android.ugc.aweme.mix.e.a a2 = a(str, aweme, str2, str3, str4, str5, z, bVar, (Float) null, str6);
        if (context != null) {
            com.bytedance.ies.watcher.c.a("playlist_first_render_cost_time");
            com.bytedance.ies.watcher.c.a("playlist_first_open_dialog_cost_time");
            SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://mix/detail").withParam("video_from", a2.getMVideoFrom()).withParam("enter_from", a2.getMEventType()).withParam("mix_video_list_params", a2);
            com.ss.android.ugc.aweme.mix.e.b searchParam = a2.getSearchParam();
            String str7 = null;
            SmartRoute withParam2 = withParam.withParam("playlist_search_id", searchParam != null ? searchParam.getSearchId() : null);
            com.ss.android.ugc.aweme.mix.e.b searchParam2 = a2.getSearchParam();
            SmartRoute withParam3 = withParam2.withParam("is_from_video", searchParam2 != null ? searchParam2.isFromVideo() : null);
            com.ss.android.ugc.aweme.mix.e.b searchParam3 = a2.getSearchParam();
            if (searchParam3 != null) {
                str7 = searchParam3.getSearchType();
            }
            withParam3.withParam("key_search_type", str7).withParam("key_playlist_previous_page", a2.getPreviousPage()).withParam("key_playlist_from_group_id", a2.getEnterGroupId()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.mix.e.b bVar, Float f2, String str6) {
        l.d(str2, "");
        l.d(str3, "");
        com.ss.android.ugc.aweme.mix.e.a a2 = a(str, aweme, str2, str3, str4, str5, true, bVar, f2, str6);
        if (context != null) {
            SmartRouter.buildRoute(context, "aweme://mix/detail").buildIntent();
            com.bytedance.ies.watcher.c.a("playlist_first_render_cost_time");
            com.bytedance.ies.watcher.c.a("playlist_first_open_dialog_cost_time");
            SmartRoute withParam = SmartRouter.buildRoute(context, "aweme://mix/detail").withParam("video_from", a2.getMVideoFrom()).withParam("enter_from", a2.getMEventType()).withParam("mix_video_list_params", a2);
            com.ss.android.ugc.aweme.mix.e.b searchParam = a2.getSearchParam();
            String str7 = null;
            SmartRoute withParam2 = withParam.withParam("playlist_search_id", searchParam != null ? searchParam.getSearchId() : null);
            com.ss.android.ugc.aweme.mix.e.b searchParam2 = a2.getSearchParam();
            SmartRoute withParam3 = withParam2.withParam("is_from_video", searchParam2 != null ? searchParam2.isFromVideo() : null);
            com.ss.android.ugc.aweme.mix.e.b searchParam3 = a2.getSearchParam();
            if (searchParam3 != null) {
                str7 = searchParam3.getSearchType();
            }
            withParam3.withParam("key_search_type", str7).withParam("key_playlist_previous_page", a2.getPreviousPage()).withParam("key_playlist_from_group_id", a2.getEnterGroupId()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(com.ss.android.ugc.aweme.mix.api.d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        l.b(e2, "");
        String curUserId = e2.getCurUserId();
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e3 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        l.b(e3, "");
        String curSecUserId = e3.getCurSecUserId();
        MixFeedApi a2 = MixFeedApi.a.a();
        l.b(curUserId, "");
        l.b(curSecUserId, "");
        l.b(a2.getUserMixList(curUserId, 0, curSecUserId).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a.c(curUserId, dVar), new a.d(dVar)), "");
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(boolean z) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        Keva repo = Keva.getRepo("play_list_" + curUser.getUid(), 0);
        l.b(repo, "");
        repo.storeBoolean("show_personal_account_tis_flag", z);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(String str, String str2, String str3, String str4, com.ss.android.ugc.aweme.mix.e.b bVar) {
        String str5 = str3;
        String str6 = str2;
        String str7 = str;
        String str8 = "";
        if (str7 == null) {
            str7 = str8;
        }
        if (str6 == null) {
            str6 = str8;
        }
        if (str5 == null) {
            str5 = str8;
        }
        if (str4 != null) {
            str8 = str4;
        }
        com.ss.android.ugc.aweme.mix.a.a.a(str7, str6, str5, str8, null, null, null, bVar, 112);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(String str, String str2, String str3, String str4, String str5, com.ss.android.ugc.aweme.mix.e.b bVar) {
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        String str9 = "";
        if (str6 == null) {
            str6 = str9;
        }
        if (str7 == null) {
            str7 = str9;
        }
        if (str8 == null) {
            str8 = str9;
        }
        if (str3 != null) {
            str9 = str3;
        }
        com.ss.android.ugc.aweme.mix.a.a.a(str6, str7, str8, str9, 0, str5, null, null, null, bVar, 448);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(String str, String str2, String str3, String str4, float f2, com.ss.android.ugc.aweme.mix.e.b bVar) {
        String searchId;
        String str5 = "";
        if (str == null) {
            str = str5;
        }
        if (str2 == null) {
            str2 = str5;
        }
        if (str3 == null) {
            str3 = str5;
        }
        if (str4 == null) {
            str4 = str5;
        }
        l.d(str, str5);
        l.d(str2, str5);
        l.d(str3, str5);
        l.d(str4, str5);
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("playlist_id", str2).a("group_id", str3).a("author_id", str4).a("video_current_time", f2);
        if (!(bVar == null || (searchId = bVar.getSearchId()) == null)) {
            str5 = searchId;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("search_id", str5);
        String str6 = null;
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("is_from_video", bVar != null ? bVar.isFromVideo() : null);
        if (bVar != null) {
            str6 = bVar.getSearchType();
        }
        r.a("click_playlist_entrance", a4.a("search_type", str6).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        k().a(context, new Bundle(), (com.ss.android.ugc.aweme.mix.c.b.a() == 1 || com.ss.android.ugc.aweme.mix.c.b.a() == 2) ? 2 : 1, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(String str, String str2, com.ss.android.ugc.aweme.mix.api.c cVar) {
        l.d(cVar, "");
        if (str != null && str2 != null) {
            l.d(str, "");
            l.d(str2, "");
            l.d(cVar, "");
            l.b(MixFeedApi.a.a().getUserMixList(str, 0, str2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a.e(str, cVar), new a.f(cVar)), "");
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean c() {
        return com.ss.android.ugc.aweme.mix.f.b.a();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final int h() {
        return com.ss.android.ugc.aweme.mix.c.b.a();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean a() {
        return com.ss.android.ugc.aweme.mix.f.b.a();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void g() {
        com.ss.android.ugc.aweme.mix.a.a.a("", 1, "video_post_page", "split_longvideo");
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean i() {
        if (com.ss.android.ugc.aweme.mix.c.a.a() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean j() {
        if (com.ss.android.ugc.aweme.mix.c.a.a() == 2) {
            return true;
        }
        return false;
    }

    public static IMixFeedService k() {
        Object a2 = com.ss.android.ugc.b.a(IMixFeedService.class, false);
        if (a2 != null) {
            return (IMixFeedService) a2;
        }
        return new MixFeedService();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean b() {
        if (Keva.getRepo("keva_mixlist_repo_name").getInt(com.ss.android.ugc.aweme.mix.d.a.a("keva_mixlist_num_key"), 0) <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void e() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        Keva repo = Keva.getRepo("play_list_" + curUser.getUid(), 0);
        l.b(repo, "");
        repo.storeBoolean("show_profile_empty_flag", false);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean f() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        Keva repo = Keva.getRepo("play_list_" + curUser.getUid(), 0);
        l.b(repo, "");
        return repo.getBoolean("show_profile_empty_flag", true);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean b(Aweme aweme) {
        PlayListInfo playListInfo;
        if (aweme == null || (playListInfo = aweme.playlist_info) == null || playListInfo.getMixId() == null) {
            return false;
        }
        return true;
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(70770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(1);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            String string = this.$context.getString(R.string.c7);
            l.b(string, "");
            bVar2.a(string, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Context context) {
        l.d(context, "");
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).b(R.string.gii), new d(context)).a(false)).a().b().show();
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.a f110272a;

        static {
            Covode.recordClassIndex(70769);
        }

        c(com.ss.android.ugc.aweme.mix.api.a aVar) {
            this.f110272a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f110272a.b(false);
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f110266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f110267b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f110268c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.api.a f110269d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f110270e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f110271f;

        static {
            Covode.recordClassIndex(70768);
        }

        b(Activity activity, Aweme aweme, z.e eVar, com.ss.android.ugc.aweme.mix.api.a aVar, String str, String str2) {
            this.f110266a = activity;
            this.f110267b = aweme;
            this.f110268c = eVar;
            this.f110269d = aVar;
            this.f110270e = str;
            this.f110271f = str2;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.mix.d.a.a(this.f110266a, this.f110267b, this.f110268c.element, MixFeedApi.b.VIDEOREMOVE.getOperation(), this.f110269d, this.f110270e, this.f110271f);
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Context context, Bundle bundle) {
        l.d(context, "");
        l.d(bundle, "");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/feed_manage").buildIntent();
        buildIntent.putExtras(bundle);
        a(context, buildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, boolean z, boolean z2, String str, g gVar) {
        l.d(viewGroup, "");
        l.d(str, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.al3, viewGroup, false);
        l.b(a2, "");
        return new com.ss.android.ugc.aweme.mix.profile.entry.c(a2, z, z2, str, gVar);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Activity activity, Aweme aweme, com.ss.android.ugc.aweme.mix.api.a aVar, String str, String str2) {
        String str3;
        PlayListInfo playListInfo;
        l.d(activity, "");
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        z.e eVar = new z.e();
        eVar.element = "";
        if (aweme == null || (playListInfo = aweme.playlist_info) == null) {
            str3 = "";
        } else {
            str3 = playListInfo.getMixName();
            if (str3 == null) {
                str3 = "";
            }
            T t = (T) playListInfo.getMixId();
            if (t != null) {
                eVar.element = t;
            }
        }
        a.C0731a aVar2 = new a.C0731a(activity);
        String string = activity.getResources().getString(R.string.fc8);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{str3}, 1));
        l.b(a2, "");
        aVar2.f33401a = a2;
        aVar2.b(R.string.fc9).a(R.string.fca, (DialogInterface.OnClickListener) new b(activity, aweme, eVar, aVar, str, str2), false).b(R.string.a9e, (DialogInterface.OnClickListener) new c(aVar), false).a().c();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        l.d(activity, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(aweme, "");
        l.d(str3, "");
        l.d(str4, "");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_add_mix_aweme", aweme);
        bundle.putString("key_choosed_mix_id", str);
        bundle.putString("key_choosed_mix_name", str2);
        bundle.putString("enter_from", str3);
        bundle.putString("enter_method", str4);
        AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
        addFeedToMixFragment.setArguments(bundle);
        a.C1112a a2 = new a.C1112a().a(addFeedToMixFragment).b(false).a(1);
        double b2 = (double) n.b(activity);
        Double.isNaN(b2);
        com.bytedance.tux.sheet.sheet.a aVar = a2.b((int) (b2 * 0.7d)).c(false).a().f45299a;
        if (activity instanceof e) {
            aVar.show(((e) activity).getSupportFragmentManager(), "Add_video_to_mix");
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void a(Activity activity, com.ss.android.ugc.aweme.mix.api.b bVar, String str, String str2, String str3, String str4) {
        l.d(activity, "");
        l.d(bVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(bVar, "");
        l.d(str, "");
        l.d(str2, "");
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_full_scrren", true);
        bundle.putString("key_choosed_mix_id", str3);
        bundle.putString("key_choosed_mix_name", str4);
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
        AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
        addFeedToMixFragment.setArguments(bundle);
        addFeedToMixFragment.f109713d = bVar;
        if (activity instanceof e) {
            i supportFragmentManager = ((e) activity).getSupportFragmentManager();
            l.b(supportFragmentManager, "");
            l.d(supportFragmentManager, "");
            try {
                androidx.fragment.app.n a2 = supportFragmentManager.a();
                l.b(a2, "");
                a2.a(R.anim.dq, R.anim.dx);
                a2.a(R.id.dqk, addFeedToMixFragment, "Add_video_to_mix");
                a2.d();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final com.bytedance.tux.sheet.sheet.a a(Context context, String str, String str2, Aweme aweme, String str3, String str4, String str5) {
        String str6;
        i supportFragmentManager;
        PlayListInfo playListInfo;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        if (context == null) {
            return null;
        }
        if (aweme == null || (playListInfo = aweme.playlist_info) == null || (str6 = playListInfo.getMixName()) == null) {
            str6 = "";
        }
        l.d(str2, "");
        l.d(str6, "");
        l.d(str, "");
        l.d(str3, "");
        l.d(str4, "");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_positioned_aweme", aweme);
        bundle.putString("key_mix_id", str2);
        bundle.putString("key_mix_name", str6);
        bundle.putString("key_mix_uid", str3);
        bundle.putString("key_mix_secuid", str4);
        bundle.putString("enter_from", str6);
        bundle.putString("key_mix_dialog_enter_from", str);
        bundle.putString("key_video_from", str5);
        o oVar = new o();
        oVar.setArguments(bundle);
        a.C1112a a2 = new a.C1112a().a(oVar).a(new o.n(oVar)).a(1);
        double b2 = (double) n.b(context);
        Double.isNaN(b2);
        com.bytedance.tux.sheet.sheet.a aVar = a2.b((int) (b2 * 0.73d)).b(false).f45299a;
        if ((context instanceof e) && (supportFragmentManager = ((e) context).getSupportFragmentManager()) != null) {
            aVar.show(supportFragmentManager, "MixVideosDialog");
        }
        return aVar;
    }

    private static com.ss.android.ugc.aweme.mix.e.a a(String str, Aweme aweme, String str2, String str3, String str4, String str5, boolean z, com.ss.android.ugc.aweme.mix.e.b bVar, Float f2, String str6) {
        com.ss.android.ugc.aweme.mix.e.a aVar = new com.ss.android.ugc.aweme.mix.e.a();
        aVar.setMVideoFrom(str2);
        aVar.setMNeedShowDialog(z);
        aVar.setEnterGroupId(str);
        aVar.setVideoPlayedPercentage(f2);
        if (aweme != null) {
            aVar.setMSecUid(aweme.getSecAuthorUid());
            aVar.setMUsrId(aweme.getAuthorUid());
            aVar.setMAweme(aweme);
            aVar.setMAid(aweme.getAid());
        }
        if (!TextUtils.isEmpty(str4)) {
            aVar.setMUsrId(str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            aVar.setMSecUid(str5);
        }
        aVar.setSearchParam(bVar);
        aVar.setMEventType("playlist");
        aVar.setMixId(str3);
        aVar.setPreviousPage(str6);
        aVar.setPageStartTime(SystemClock.elapsedRealtime());
        return aVar;
    }
}
