package com.ss.android.ugc.aweme.story.service;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ag;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.bi;
import com.ss.android.ugc.aweme.cd;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.a.a;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.avatar.c;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedUploadingViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.StoryPlayerListViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import com.ss.android.ugc.aweme.story.i.d;
import com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.ss.android.ugc.aweme.story.interaction.vm.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.publish.f;
import com.ss.android.ugc.aweme.story.publish.g;
import com.ss.android.ugc.aweme.story.publish.h;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public final class StoryServiceImpl implements IStoryService {

    /* renamed from: a  reason: collision with root package name */
    private int[] f138502a;

    /* renamed from: b  reason: collision with root package name */
    private int f138503b;

    static {
        Covode.recordClassIndex(90594);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int b() {
        return R.layout.b2_;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int c() {
        return R.layout.b2b;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final c d() {
        return com.ss.android.ugc.aweme.story.avatar.a.f136768d;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.api.b e() {
        return d.f137808a;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.publish.a f() {
        return f.f138118h;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int[] h() {
        return this.f138502a;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final int k() {
        return this.f138503b;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a() {
        return com.ss.android.ugc.aweme.story.c.b.c();
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a(String str) {
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode == 1619864869 ? str.equals("chat_list") : !(hashCode != 1837742968 || !str.equals("story_archive"))) {
            return true;
        }
        if (!com.ss.android.ugc.aweme.story.c.b.b()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        if (!com.ss.android.ugc.aweme.story.d.a.c(aweme) || m.a(aweme)) {
            return false;
        }
        long j2 = com.ss.android.ugc.aweme.story.g.d.f137774a.getLong("STORY_GUIDE_START_SHOW_TIME", -1);
        if (j2 < 0) {
            com.ss.android.ugc.aweme.story.g.d.f137774a.storeLong("STORY_GUIDE_START_SHOW_TIME", System.currentTimeMillis());
            com.ss.android.ugc.aweme.story.g.d.f137774a.storeInt("STORY_GUIDE_SHOW_COUNT", 0);
        } else if (System.currentTimeMillis() - j2 > 86400000) {
            com.ss.android.ugc.aweme.story.g.d.f137774a.storeLong("STORY_GUIDE_START_SHOW_TIME", System.currentTimeMillis());
            com.ss.android.ugc.aweme.story.g.d.f137774a.storeInt("STORY_GUIDE_SHOW_COUNT", 0);
        }
        int i2 = com.ss.android.ugc.aweme.story.g.d.f137774a.getInt("STORY_GUIDE_SHOW_COUNT", 0);
        if (i2 >= com.ss.android.ugc.aweme.story.g.c.a().f137769f) {
            return false;
        }
        com.ss.android.ugc.aweme.story.g.d.f137774a.storeInt("STORY_GUIDE_SHOW_COUNT", i2 + 1);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void g() {
        com.ss.android.ugc.aweme.story.a.a.f136696a.storeInt("key_setting", com.ss.android.ugc.aweme.story.c.b.a());
    }

    public static IStoryService l() {
        MethodCollector.i(3443);
        Object a2 = com.ss.android.ugc.b.a(IStoryService.class, false);
        if (a2 != null) {
            IStoryService iStoryService = (IStoryService) a2;
            MethodCollector.o(3443);
            return iStoryService;
        }
        if (com.ss.android.ugc.b.eq == null) {
            synchronized (IStoryService.class) {
                try {
                    if (com.ss.android.ugc.b.eq == null) {
                        com.ss.android.ugc.b.eq = new StoryServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3443);
                    throw th;
                }
            }
        }
        StoryServiceImpl storyServiceImpl = (StoryServiceImpl) com.ss.android.ugc.b.eq;
        MethodCollector.o(3443);
        return storyServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final boolean i() {
        boolean z;
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        boolean isChildrenMode = e2.isChildrenMode();
        if (!com.ss.android.ugc.aweme.story.c.b.c() || com.ss.android.ugc.aweme.story.c.b.f()) {
            z = false;
        } else {
            z = true;
        }
        if (isChildrenMode || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void j() {
        f.f138112b.clear();
        List<g> list = f.f138116f;
        if (list != null) {
            for (T t : list) {
                k kVar = t.f138141b.f138110e;
                if (kVar != null) {
                    h.f138142a.removeCallback(t.f138140a.getScheduleId(), kVar);
                }
            }
        }
        List<g> list2 = f.f138116f;
        if (list2 != null) {
            list2.clear();
        }
        f.f138115e = false;
        com.ss.android.ugc.aweme.story.i.b b2 = d.b();
        com.ss.android.ugc.aweme.story.j.a.b(com.ss.android.ugc.aweme.story.i.b.f137799b, "clear");
        b2.a().a();
        com.ss.android.ugc.aweme.story.avatar.a.f136765a.clear();
        com.ss.android.ugc.aweme.story.avatar.a.f136766b.clear();
        com.ss.android.ugc.aweme.story.avatar.a.f136767c.clear();
    }

    public StoryServiceImpl() {
        int[] iArr;
        int i2;
        int i3 = 0;
        if (com.ss.android.ugc.aweme.story.c.g.a()) {
            iArr = new int[2];
            Resources resources = com.bytedance.ies.ugc.appcontext.d.a().getResources();
            l.a((Object) resources, "");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                i2 = displayMetrics.widthPixels;
            } else {
                i2 = 0;
            }
            iArr[0] = i2 / 2;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 52.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            int a3 = a2 + h.g.a.a(TypedValue.applyDimension(1, 64.0f, system2.getDisplayMetrics()));
            Context a4 = com.bytedance.ies.ugc.appcontext.d.a();
            int identifier = a4.getResources().getIdentifier("status_bar_height", "dimen", "android");
            iArr[1] = a3 + (identifier > 0 ? a4.getResources().getDimensionPixelSize(identifier) : i3);
        } else if (i.a(com.bytedance.ies.ugc.appcontext.d.a())) {
            int a5 = com.bytedance.tux.h.f.a(com.bytedance.ies.ugc.appcontext.d.a());
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            iArr = new int[]{a5 - h.g.a.a(TypedValue.applyDimension(1, 46.0f, system3.getDisplayMetrics())), h.g.a.a(TypedValue.applyDimension(1, 190.0f, system4.getDisplayMetrics()))};
        } else {
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            iArr = new int[]{h.g.a.a(TypedValue.applyDimension(1, 46.0f, system5.getDisplayMetrics())), h.g.a.a(TypedValue.applyDimension(1, 190.0f, system6.getDisplayMetrics()))};
        }
        this.f138502a = iArr;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(int i2) {
        this.f138503b = i2;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(int[] iArr) {
        l.d(iArr, "");
        this.f138502a = iArr;
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f138504a;

        static {
            Covode.recordClassIndex(90595);
        }

        a(String str) {
            this.f138504a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.story.j.a.a("reportViewed", "succeeded for " + this.f138504a);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f138505a;

        static {
            Covode.recordClassIndex(90596);
        }

        b(String str) {
            this.f138505a = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            com.ss.android.ugc.aweme.story.j.a.a("reportViewed", "failed for " + this.f138505a, th);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.b b(String str) {
        l.d(str, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.story.interaction.a.a aVar = new com.ss.android.ugc.aweme.story.interaction.a.a();
        Bundle bundle = new Bundle();
        bundle.putString("story_id", str);
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object c(cd cdVar) {
        l.d(cdVar, "");
        if (cdVar instanceof cf) {
            return new StoryFeedUploadingViewHolder((cf) cdVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void c(String str) {
        l.d(str, "");
        StoryApi.f136727a.reportStoryViewed(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new a(str), new b(str));
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object a(cd cdVar) {
        l.d(cdVar, "");
        if (cdVar instanceof cf) {
            return new StoryVideoViewHolder((cf) cdVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final Object b(cd cdVar) {
        l.d(cdVar, "");
        if (cdVar instanceof cf) {
            return new StoryPlayerListViewHolder((cf) cdVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar) {
        if (eVar != null) {
            l.d(eVar, "");
            if (com.ss.android.ugc.aweme.story.a.a.f136696a.getInt("key_setting", 0) != 5 || (!com.ss.android.ugc.aweme.story.a.a.f136696a.getBoolean("key_tutorial_1_has_shown", false) && com.ss.android.ugc.aweme.story.a.a.f136696a.getBoolean("key_new_version", false))) {
                com.ss.android.ugc.aweme.story.a.b bVar = new com.ss.android.ugc.aweme.story.a.b(eVar, (byte) 0);
                a.f fVar = new a.f(bVar);
                a.e eVar2 = new a.e(bVar);
                bVar.getCloseBtn().setOnClickListener(fVar);
                bVar.getCreateBtn().setOnClickListener(eVar2);
                bVar.getCreateBtn().setText(bVar.getCreateBtn().getContext().getString(R.string.c7));
                bVar.getTutorialView().setVisibility(0);
                com.ss.android.ugc.aweme.story.b.h.a("shoot_page", "popup", "show", "camera", 24);
                com.ss.android.ugc.aweme.story.a.a.a(eVar, (View) bVar, false);
                if (com.ss.android.ugc.aweme.story.a.a.f136696a.getInt("key_setting", 0) == 5) {
                    com.ss.android.ugc.aweme.story.a.a.f136696a.storeBoolean("key_tutorial_1_has_shown", true);
                    com.ss.android.ugc.aweme.story.a.a.f136696a.storeInt("key_tutorial_show_times", 1);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final IStoryViewerListViewModel a(e eVar, ag agVar) {
        l.d(eVar, "");
        l.d(agVar, "");
        return StoryViewerListViewModel.a.a(eVar, agVar);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final t<BaseResponse> a(String str, int i2) {
        l.d(str, "");
        return StoryInteractionApi.f137840a.sendEmojiReaction(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final com.ss.android.ugc.aweme.story.b b(String str, String str2) {
        l.d(str, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.story.interaction.a.b bVar = new com.ss.android.ugc.aweme.story.interaction.a.b();
        Bundle bundle = new Bundle();
        bundle.putString("story_id", str);
        bundle.putString("viewer_id", str2);
        bVar.setArguments(bundle);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2.equals("others_homepage") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r2.equals("follow_request") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2.equals("personal_homepage") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (com.ss.android.ugc.aweme.story.c.b.f() == false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        return com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r2.equals("homepage_follow") != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
        return com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r2.equals("notification_page") != false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if ("STORY_ENTRANCE_AVATAR".equals(r3) != false) goto L_0x000c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        return com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_USER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        return com.ss.android.ugc.aweme.story.f.a.QUIT_AFTER_FINISH;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2.equals("homepage_hot") != false) goto L_0x0059;
     */
    @Override // com.ss.android.ugc.aweme.story.IStoryService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.story.f.a a(java.lang.String r2, java.lang.String r3) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.service.StoryServiceImpl.a(java.lang.String, java.lang.String):com.ss.android.ugc.aweme.story.f.a");
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar, String str) {
        UrlModel avatarThumb;
        l.d(str, "");
        if (eVar != null) {
            l.d(eVar, "");
            l.d(str, "");
            boolean z = com.ss.android.ugc.aweme.story.a.a.f136696a.getBoolean("key_tutorial_1_has_shown", false);
            int i2 = com.ss.android.ugc.aweme.story.a.a.f136696a.getInt("key_tutorial_show_times", 0);
            long j2 = com.ss.android.ugc.aweme.story.a.a.f136696a.getLong("key_tutorial_last_time", 0);
            if (com.ss.android.ugc.aweme.story.a.a.f136696a.getInt("key_setting", 0) == 5 && com.ss.android.ugc.aweme.story.a.a.f136696a.getBoolean("key_new_version", false)) {
                if (z) {
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    l.b(g2, "");
                    if (!g2.isLogin() || i2 >= 7) {
                        return;
                    }
                }
                if (j2 == 0 || ib.a(Long.valueOf(j2)) > 0) {
                    com.ss.android.ugc.aweme.story.a.b bVar = new com.ss.android.ugc.aweme.story.a.b(eVar, (byte) 0);
                    bVar.getCloseBtn().setOnClickListener(new a.d(bVar));
                    bVar.getCreateBtn().setOnClickListener(new a.c(bVar, str, eVar, z));
                    if (z) {
                        bVar.getTutorialV5View().setVisibility(0);
                        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                        l.b(g3, "");
                        User curUser = g3.getCurUser();
                        if (!(curUser == null || (avatarThumb = curUser.getAvatarThumb()) == null)) {
                            v b2 = r.a(com.ss.android.ugc.aweme.base.v.a(avatarThumb)).b(em.a(100));
                            b2.K = true;
                            v a2 = b2.a("StoryEducationPanel");
                            a2.v = w.CENTER_CROP;
                            a2.E = bVar.getAvatarView();
                            a2.c();
                        }
                    } else {
                        bVar.getTutorialView().setVisibility(0);
                        com.ss.android.ugc.aweme.story.a.a.f136696a.storeBoolean("key_tutorial_1_has_shown", true);
                    }
                    com.ss.android.ugc.aweme.story.a.a.f136696a.storeLong("key_tutorial_last_time", System.currentTimeMillis());
                    com.ss.android.ugc.aweme.story.a.a.f136696a.storeInt("key_tutorial_show_times", i2 + 1);
                    com.ss.android.ugc.aweme.story.a.a.a(eVar, (View) bVar, false);
                    com.ss.android.ugc.aweme.story.a.a.a(str, "show");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(String str, Aweme aweme) {
        l.d(str, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(aweme, "");
        ((Map) com.ss.android.ugc.aweme.story.feed.detail.a.f137683e.getValue()).put(str, aweme);
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final void a(e eVar, String str, Aweme aweme) {
        l.d(str, "");
        if (eVar != null) {
            l.d(eVar, "");
            l.d(str, "");
            com.ss.android.ugc.aweme.story.a.b bVar = new com.ss.android.ugc.aweme.story.a.b(eVar, (byte) 0);
            bVar.getCloseBtn().setOnClickListener(new a.b(bVar));
            bVar.getCreateBtn().setOnClickListener(new a.View$OnClickListenerC3570a(bVar, str, aweme, eVar));
            bVar.getTutorialView().setVisibility(0);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.comment.c.e(1, eVar.hashCode()));
            com.ss.android.ugc.aweme.story.a.a.a(eVar, (View) bVar, true);
            com.ss.android.ugc.aweme.story.a.a.a(str, aweme, "show");
        }
    }

    @Override // com.ss.android.ugc.aweme.story.IStoryService
    public final bi a(ViewGroup viewGroup, com.ss.android.ugc.playerkit.videoview.k kVar, cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, h.f.a.b<? super String, ? extends View> bVar) {
        l.d(viewGroup, "");
        l.d(kVar, "");
        l.d(cdVar, "");
        l.d(viewGroup2, "");
        l.d(viewGroup3, "");
        l.d(viewGroup4, "");
        return new com.ss.android.ugc.aweme.story.feed.common.d(viewGroup, kVar, (cf) cdVar, viewGroup2, viewGroup3, viewGroup4, bVar);
    }
}
