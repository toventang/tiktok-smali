package com.ss.android.ugc.aweme.following.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.arch.y;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.j;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.experiment.cj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.following.ui.view.I18nFollowUserBtn;
import com.ss.android.ugc.aweme.following.ui.viewholder.RecommendContactViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.friends.ui.at;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.v;
import com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.notificationlive.w;
import com.ss.android.ugc.aweme.notificationlive.x;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.n;
import com.ss.android.ugc.aweme.profile.ui.ae;
import com.ss.android.ugc.aweme.recommend.MutualFriendItemViewHolder;
import com.ss.android.ugc.aweme.recommend.MutualListTitleViewHolder;
import com.ss.android.ugc.aweme.recommend.RecommendSuggestTitleViewHolder;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserService;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.relation.viewholder.NewRecommendUserViewHolder;
import com.ss.android.ugc.aweme.story.avatar.e;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.unread.UnReadCircleView;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class FollowListAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f96395k = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Boolean> f96396d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f96397e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f96398f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public String f96399g = "";

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.m f96400h;

    /* renamed from: i  reason: collision with root package name */
    public final String f96401i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f96402j;

    static {
        Covode.recordClassIndex(61042);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final boolean g() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61060);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, com.ss.android.ugc.aweme.following.a.g> implements au {

        /* renamed from: g  reason: collision with root package name */
        public final I18nFollowUserBtn f96403g;

        /* renamed from: j  reason: collision with root package name */
        public final ImageView f96404j;

        /* renamed from: k  reason: collision with root package name */
        public final StoryBrandView f96405k;

        /* renamed from: l  reason: collision with root package name */
        final h.h f96406l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ FollowListAdapter f96407m;
        private final AvatarImageWithVerify n;
        private final TextView o;
        private final TextView p;
        private final ImageView q;
        private final TuxIconView r;
        private final UnReadCircleView s;
        private final h.h t;
        private final h.h u = h.i.a((h.f.a.a) new j(this));

        static {
            Covode.recordClassIndex(61043);
        }

        public final FollowRelationTabViewModel m() {
            return (FollowRelationTabViewModel) this.t.getValue();
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        private static int p() {
            return com.bytedance.ies.abmock.b.a().a(true, "show_remark_icon_style", 0);
        }

        static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.avatar.d> {
            final /* synthetic */ FollowItemViewHolder this$0;

            static {
                Covode.recordClassIndex(61057);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            j(FollowItemViewHolder followItemViewHolder) {
                super(0);
                this.this$0 = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.aweme.story.avatar.d invoke() {
                com.ss.android.ugc.aweme.story.avatar.c d2 = com.ss.android.ugc.aweme.story.g.f137757a.d();
                if (d2 != null) {
                    return d2.a(new com.ss.android.ugc.aweme.story.avatar.e(this) {
                        /* class com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.j.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ j f96420a;

                        static {
                            Covode.recordClassIndex(61058);
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.h
                        public final boolean d() {
                            return true;
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.e
                        public final com.ss.android.ugc.aweme.story.avatar.o c() {
                            return com.ss.android.ugc.aweme.story.avatar.o.FOLLOW_LIST;
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.e
                        public final StoryBrandView a() {
                            return this.f96420a.this$0.f96405k;
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.e
                        public final /* bridge */ /* synthetic */ androidx.lifecycle.m b() {
                            return this.f96420a.this$0;
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f96420a = r1;
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.h
                        public final void a(boolean z, com.ss.android.ugc.aweme.tux.business.story.a aVar) {
                            h.f.b.l.d(aVar, "");
                            e.a.a(aVar);
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.e
                        public final void a(SmartRoute smartRoute, Aweme aweme) {
                            h.f.b.l.d(smartRoute, "");
                            h.f.b.l.d(aweme, "");
                            smartRoute.withParam("enter_from", this.f96420a.this$0.f96407m.e());
                        }

                        @Override // com.ss.android.ugc.aweme.story.avatar.g
                        public final boolean a(String str, HashMap<String, String> hashMap) {
                            h.f.b.l.d(str, "");
                            h.f.b.l.d(hashMap, "");
                            if (h.f.b.l.a((Object) str, (Object) "story_click")) {
                                String uid = ((com.ss.android.ugc.aweme.following.a.g) this.f96420a.this$0.aI_()).f96343b.getUid();
                                if (this.f96420a.this$0.f96407m.f96398f.contains(uid)) {
                                    return false;
                                }
                                this.f96420a.this$0.f96407m.f96398f.add(uid);
                            }
                            hashMap.put("enter_from", this.f96420a.this$0.f96407m.e());
                            return true;
                        }
                    });
                }
                return null;
            }
        }

        public static final class a extends h.f.b.m implements h.f.a.a<FollowRelationTabViewModel> {
            final /* synthetic */ JediViewHolder $this_activityViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(61044);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_activityViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel invoke() {
                /*
                    r3 = this;
                    com.bytedance.jedi.ext.adapter.JediViewHolder r0 = r3.$this_activityViewModel
                    androidx.lifecycle.m r0 = r0.k()
                    androidx.fragment.app.e r1 = com.bytedance.jedi.ext.adapter.b.b(r0)
                    androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                    androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                    h.k.c r0 = r3.$viewModelClass$inlined
                    java.lang.Class r0 = h.f.a.a(r0)
                    java.lang.String r1 = r0.getName()
                    java.lang.String r0 = ""
                    h.f.b.l.a(r1, r0)
                    h.k.c r0 = r3.$viewModelClass
                    java.lang.Class r0 = h.f.a.a(r0)
                    androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_following_ui_adapter_FollowListAdapter$FollowItemViewHolder$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                    com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_following_ui_adapter_FollowListAdapter$FollowItemViewHolder$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            f.a.b.b unused = subscribe(n(), new ah(), new h(this));
            NotificationLiveViewModel o2 = o();
            String secUid = ((com.ss.android.ugc.aweme.following.a.g) aI_()).f96343b.getSecUid();
            h.f.b.l.b(secUid, "");
            o2.a(secUid);
            f.a.b.b unused2 = selectSubscribe(o(), a.f96436a, b.f96437a, new ah(), i.f96419a);
        }

        public static final class b extends h.f.b.m implements h.f.a.a<FollowerRelationViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(61045);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.b.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_following_ui_adapter_FollowListAdapter$FollowItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        private final NotificationLiveViewModel o() {
            c cVar = c.f96408a;
            JediViewHolderProxy jediViewHolderProxy = this.f39565d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) j.a.a(d(), jediViewHolderProxy.b()).a(getClass().getName() + '_' + NotificationLiveViewModel.class.getName(), NotificationLiveViewModel.class);
                y a2 = jediViewModel.f39365j.a(NotificationLiveViewModel.class);
                if (a2 != null) {
                    a2.binding(jediViewModel);
                }
                jediViewModel.a_(cVar);
                return (NotificationLiveViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        public final UserViewModel n() {
            k kVar = new k(this);
            JediViewHolderProxy jediViewHolderProxy = this.f39565d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) j.a.a(d(), jediViewHolderProxy.b()).a(getClass().getName() + '_' + UserViewModel.class.getName(), UserViewModel.class);
                y a2 = jediViewModel.f39365j.a(UserViewModel.class);
                if (a2 != null) {
                    a2.binding(jediViewModel);
                }
                jediViewModel.a_(kVar);
                return (UserViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* access modifiers changed from: package-private */
        public static final class c extends h.f.b.m implements h.f.a.b<ResponseState, ResponseState> {

            /* renamed from: a  reason: collision with root package name */
            public static final c f96408a = new c();

            static {
                Covode.recordClassIndex(61046);
            }

            c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                ResponseState responseState2 = responseState;
                h.f.b.l.d(responseState2, "");
                return ResponseState.copy$default(responseState2, -1, -1, null, null, 12, null);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class k extends h.f.b.m implements h.f.a.b<UserState, UserState> {
            final /* synthetic */ FollowItemViewHolder this$0;

            static {
                Covode.recordClassIndex(61059);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            k(FollowItemViewHolder followItemViewHolder) {
                super(1);
                this.this$0 = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ UserState invoke(UserState userState) {
                UserState userState2 = userState;
                h.f.b.l.d(userState2, "");
                return UserState.copy$default(userState2, ((com.ss.android.ugc.aweme.following.a.g) this.this$0.aI_()).f96343b, false, null, null, null, 30, null);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class g implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f96417a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f96418b;

            static {
                Covode.recordClassIndex(61053);
            }

            g(FollowItemViewHolder followItemViewHolder, User user) {
                this.f96417a = followItemViewHolder;
                this.f96418b = user;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                f.a.l.c<com.ss.android.ugc.aweme.notificationlive.a> a2 = t.a();
                if (a2 != null) {
                    User user = this.f96418b;
                    h.f.b.l.b(view, "");
                    a2.onNext(new com.ss.android.ugc.aweme.notificationlive.a(user, com.ss.android.ugc.aweme.base.utils.o.a(view.getContext()), this.f96417a.f96407m.e(), "others_homepage"));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static final class f implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f96413a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f96414b;

            static {
                Covode.recordClassIndex(61049);
            }

            f(FollowItemViewHolder followItemViewHolder, User user) {
                this.f96413a = followItemViewHolder;
                this.f96414b = user;
            }

            public final void onClick(final View view) {
                ClickAgent.onClick(view);
                Resources resources = this.f96413a.f96404j.getResources();
                String string = resources.getString(R.string.fc6);
                h.f.b.l.b(string, "");
                String string2 = resources.getString(R.string.a9e);
                h.f.b.l.b(string2, "");
                CharSequence[] charSequenceArr = {string, string2};
                h.f.b.l.b(view, "");
                com.ss.android.ugc.aweme.common.f.a aVar = new com.ss.android.ugc.aweme.common.f.a(view.getContext());
                aVar.a(charSequenceArr, new DialogInterface.OnClickListener(this) {
                    /* class com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f96415a;

                    static {
                        Covode.recordClassIndex(61050);
                    }

                    {
                        this.f96415a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        if (i2 == 0) {
                            com.ss.android.ugc.aweme.common.r.a("click_remove_fans", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "fans").f66730a);
                            View view = view;
                            h.f.b.l.b(view, "");
                            Context context = view.getContext();
                            h.f.b.l.b(context, "");
                            View view2 = view;
                            h.f.b.l.b(view2, "");
                            String string = view2.getResources().getString(R.string.fc5);
                            h.f.b.l.b(string, "");
                            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{in.b(this.f96415a.f96414b)}, 1));
                            h.f.b.l.b(a2, "");
                            com.bytedance.tux.dialog.b.c.a(((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(context).a(R.string.fc6)).d(a2), new h.f.a.b<com.bytedance.tux.dialog.b.b, z>(this) {
                                /* class com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.f.AnonymousClass1.AnonymousClass1 */
                                final /* synthetic */ AnonymousClass1 this$0;

                                static {
                                    Covode.recordClassIndex(61051);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                                    com.bytedance.tux.dialog.b.b bVar2 = bVar;
                                    h.f.b.l.d(bVar2, "");
                                    bVar2.a(R.string.fc4, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                                        /* class com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.f.AnonymousClass1.AnonymousClass1.AnonymousClass1 */
                                        final /* synthetic */ AnonymousClass1 this$0;

                                        static {
                                            Covode.recordClassIndex(61052);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // h.f.a.b
                                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                            h.f.b.l.d(aVar, "");
                                            com.ss.android.ugc.aweme.common.r.a("remove_fans", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "fans").f66730a);
                                            UserViewModel n = this.this$0.this$0.f96415a.f96413a.n();
                                            String uid = this.this$0.this$0.f96415a.f96414b.getUid();
                                            h.f.b.l.b(uid, "");
                                            String secUid = this.this$0.this$0.f96415a.f96414b.getSecUid();
                                            h.f.b.l.b(secUid, "");
                                            h.f.b.l.d(uid, "");
                                            h.f.b.l.d(secUid, "");
                                            f.a.t<BaseResponse> a2 = UserService.d().a(uid, secUid).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
                                            h.f.b.l.b(a2, "");
                                            n.a(a2, UserViewModel.d.f142423a);
                                            return z.f158842a;
                                        }
                                    });
                                    bVar2.b(R.string.a9e, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                                    return z.f158842a;
                                }
                            }).a().b().show();
                        }
                    }
                });
                aVar.f76416a.b();
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f96409a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f96410b;

            static {
                Covode.recordClassIndex(61047);
            }

            d(FollowItemViewHolder followItemViewHolder, User user) {
                this.f96409a = followItemViewHolder;
                this.f96410b = user;
            }

            public final void onClick(View view) {
                String str;
                ClickAgent.onClick(view);
                if (this.f96409a.f96407m.f96397e) {
                    h.f.b.l.b(view, "");
                    Context context = view.getContext();
                    if (context != null) {
                        SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", this.f96410b.getUid()).withParam("sec_user_id", this.f96410b.getSecUid()).withParam("enter_from", this.f96409a.f96407m.e()).withParam("need_track_compare_recommend_reason", 1).withParam("previous_recommend_reason", this.f96410b.getRecommendReason()).withParam("recommend_from_type", "list").open();
                    }
                } else {
                    h.f.b.l.b(view, "");
                    if (view.getContext() != null) {
                        int i2 = 0;
                        User user = this.f96410b;
                        if (user != null) {
                            i2 = user.getCommerceUserLevel();
                        }
                        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", this.f96410b.getUid()).withParam("sec_user_id", this.f96410b.getSecUid()).withParam("enter_from", this.f96409a.f96407m.e()).withParam("profile_enterprise_type", i2).open();
                    }
                }
                FollowListAdapter followListAdapter = this.f96409a.f96407m;
                User user2 = this.f96410b;
                com.ss.android.ugc.aweme.metrics.q qVar = new com.ss.android.ugc.aweme.metrics.q();
                qVar.q = user2.getUid();
                com.ss.android.ugc.aweme.metrics.q o = qVar.o(followListAdapter.e());
                if (followListAdapter.f96402j) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                o.Y = str;
                o.X = "1044";
                o.s = user2.getRequestId();
                o.a(user2).f();
            }
        }

        /* access modifiers changed from: package-private */
        public static final class e implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f96411a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f96412b;

            static {
                Covode.recordClassIndex(61048);
            }

            e(FollowItemViewHolder followItemViewHolder, User user) {
                this.f96411a = followItemViewHolder;
                this.f96412b = user;
            }

            public final void onClick(View view) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                int i2;
                int i3;
                int i4;
                ClickAgent.onClick(view);
                FollowListAdapter followListAdapter = this.f96411a.f96407m;
                User user = this.f96412b;
                boolean z = true;
                if (user.getFollowerStatus() == 1) {
                    str = "mutual";
                } else {
                    str = "single";
                }
                if (user.getFollowStatus() == 0) {
                    str2 = "follow";
                } else {
                    str2 = "follow_cancel";
                }
                v vVar = new v(str2);
                if (followListAdapter.f96402j) {
                    str3 = "personal_homepage";
                } else {
                    str3 = "others_homepage";
                }
                vVar.f109605b = str3;
                v a2 = vVar.a(followListAdapter.e());
                a2.s = "follow_button";
                if (user.getFollowStatus() == 0) {
                    str4 = "1007";
                } else {
                    str4 = "1036";
                }
                a2.f109604a = str4;
                a2.f109608e = user.getUid();
                a2.v = str;
                a2.r = user.getRequestId();
                v a3 = a2.a(user);
                if (user.getFollowStatus() == 0) {
                    str5 = followListAdapter.f96399g;
                } else {
                    str5 = "";
                }
                a3.Z = str5;
                a3.aa = user.isSecret() ? 1 : 0;
                int followStatus = user.getFollowStatus();
                int i5 = 4;
                int i6 = 0;
                if (followStatus == 0) {
                    i2 = -1;
                } else if (followStatus != 4) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                a3.ab = i2;
                a3.f();
                if (this.f96412b.getFollowStatus() == 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (cj.a()) {
                    if (i3 != 1) {
                        i5 = 0;
                    } else if (!this.f96412b.isPrivateAccount() && !this.f96412b.isSecret()) {
                        i5 = this.f96412b.getFollowerStatus() == 1 ? 2 : 1;
                    }
                    I18nFollowUserBtn i18nFollowUserBtn = this.f96411a.f96403g;
                    if (this.f96412b.getFollowerStatus() == 1) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    i18nFollowUserBtn.a(i5, i4);
                }
                UserViewModel n = this.f96411a.n();
                n.a b2 = new n.a().a(this.f96412b.getUid()).b(this.f96412b.getSecUid());
                if (!this.f96412b.isPrivateAccount() && !this.f96412b.isSecret()) {
                    z = false;
                }
                n.a c2 = b2.a(z).a(i3).c(this.f96411a.f96407m.e());
                FollowListAdapter followListAdapter2 = this.f96411a.f96407m;
                if (!followListAdapter2.f96402j && TextUtils.equals(followListAdapter2.f96401i, "follower_relation")) {
                    i6 = 11;
                } else if (!followListAdapter2.f96402j && TextUtils.equals(followListAdapter2.f96401i, "following_relation")) {
                    i6 = 10;
                } else if (followListAdapter2.f96402j && TextUtils.equals(followListAdapter2.f96401i, "follower_relation")) {
                    i6 = 9;
                }
                n.a(c2.b(i6).d(this.f96412b.getFollowerStatus()).a());
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewHolder(com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter r7, android.view.ViewGroup r8) {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.<init>(com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter, android.view.ViewGroup):void");
        }

        static final class h extends h.f.b.m implements h.f.a.m<FollowItemViewHolder, UserState, z> {
            final /* synthetic */ FollowItemViewHolder this$0;

            static {
                Covode.recordClassIndex(61054);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(FollowItemViewHolder followItemViewHolder) {
                super(2);
                this.this$0 = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(FollowItemViewHolder followItemViewHolder, UserState userState) {
                int i2;
                boolean z;
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                UserState userState2 = userState;
                h.f.b.l.d(followItemViewHolder2, "");
                h.f.b.l.d(userState2, "");
                if (userState2.getUser().getFollowStatus() == 0 && userState2.getUser().getLivePushNotificationStatus() != 2) {
                    userState2.getUser().setLivePushNotificationStatus(2);
                    w wVar = new w(new w.a(), (byte) 0);
                    com.ss.android.ugc.aweme.notificationlive.q qVar = x.f114480a;
                    String secUid = userState2.getUser().getSecUid();
                    h.f.b.l.b(secUid, "");
                    qVar.a(secUid, wVar);
                }
                com.bytedance.jedi.arch.a<FollowStatus> followStatus = userState2.getFollowStatus();
                if (followStatus instanceof aj) {
                    Map<String, Boolean> map = this.this$0.f96407m.f96396d;
                    String uid = userState2.getUser().getUid();
                    h.f.b.l.b(uid, "");
                    FollowStatus a2 = userState2.getFollowStatus().a();
                    if (a2 != null) {
                        i2 = a2.followStatus;
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 1 || i2 == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    map.put(uid, Boolean.valueOf(z));
                    followItemViewHolder2.a(userState2.getUser(), true);
                    IMService.createIIMServicebyMonsterPlugin(false).updateIMUser(IMUser.fromUser(userState2.getUser()));
                    followItemViewHolder2.n();
                    String e2 = this.this$0.f96407m.e();
                    String uid2 = userState2.getUser().getUid();
                    h.f.b.l.b(uid2, "");
                    UserViewModel.a(e2, uid2, userState2.getUser().getFollowStatus());
                } else if (followStatus instanceof com.bytedance.jedi.arch.f) {
                    com.bytedance.jedi.arch.a<FollowStatus> followStatus2 = userState2.getFollowStatus();
                    Objects.requireNonNull(followStatus2, "null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                    Throwable th = ((com.bytedance.jedi.arch.f) followStatus2).f39461a;
                    Activity d2 = com.ss.android.ugc.aweme.base.utils.o.d(followItemViewHolder2.itemView);
                    h.f.b.l.b(d2, "");
                    com.ss.android.ugc.aweme.common.l.a(d2, th);
                    followItemViewHolder2.a(userState2.getUser(), false);
                    followItemViewHolder2.n().a();
                } else if (followStatus instanceof aq) {
                    followItemViewHolder2.a(userState2.getUser(), false);
                }
                if (userState2.getFollowerIsRemoved()) {
                    FollowerRelationViewModel followerRelationViewModel = (FollowerRelationViewModel) followItemViewHolder2.f96406l.getValue();
                    String uid3 = userState2.getUser().getUid();
                    h.f.b.l.b(uid3, "");
                    h.f.b.l.d(uid3, "");
                    followerRelationViewModel.b_(new FollowerRelationViewModel.m(followerRelationViewModel, uid3));
                    IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g2, "");
                    if (ae.a(g2.getCurUser())) {
                        FollowRelationTabViewModel m2 = followItemViewHolder2.m();
                        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                        h.f.b.l.b(g3, "");
                        User curUser = g3.getCurUser();
                        h.f.b.l.b(curUser, "");
                        m2.a(curUser.getFansCount());
                    } else {
                        FollowRelationTabViewModel m3 = followItemViewHolder2.m();
                        IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
                        h.f.b.l.b(g4, "");
                        User curUser2 = g4.getCurUser();
                        h.f.b.l.b(curUser2, "");
                        m3.a(curUser2.getFollowerCount());
                    }
                }
                return z.f158842a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x015d  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.profile.model.User r11, boolean r12) {
            /*
            // Method dump skipped, instructions count: 511
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.a(com.ss.android.ugc.aweme.profile.model.User, boolean):void");
        }

        static final class i extends h.f.b.m implements h.f.a.q<FollowItemViewHolder, com.ss.android.ugc.aweme.notificationlive.r, Integer, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final i f96419a = new i();

            static {
                Covode.recordClassIndex(61055);
            }

            i() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(FollowItemViewHolder followItemViewHolder, com.ss.android.ugc.aweme.notificationlive.r rVar, Integer num) {
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                final com.ss.android.ugc.aweme.notificationlive.r rVar2 = rVar;
                final int intValue = num.intValue();
                h.f.b.l.d(followItemViewHolder2, "");
                followItemViewHolder2.withState(followItemViewHolder2.n(), new h.f.a.b<UserState, z>() {
                    /* class com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter.FollowItemViewHolder.i.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(61056);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(UserState userState) {
                        UserState userState2 = userState;
                        h.f.b.l.d(userState2, "");
                        if (rVar2 != null) {
                            User clone = userState2.getUser().clone();
                            h.f.b.l.b(clone, "");
                            clone.setLivePushNotificationStatus(intValue);
                            if (clone.getFollowStatus() == 0) {
                                clone.setLivePushNotificationStatus(2);
                            }
                            h.f.b.l.b(clone, "");
                            com.bytedance.jedi.a.a.c<String, User> a2 = UserService.d().a();
                            String uid = clone.getUid();
                            h.f.b.l.b(uid, "");
                            a2.a(uid, clone);
                        }
                        return z.f158842a;
                    }
                });
                return z.f158842a;
            }
        }
    }

    public static final class b extends h.c {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FollowListAdapter f96421c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f96422d;

        static {
            Covode.recordClassIndex(61061);
        }

        @Override // com.ss.android.ugc.aweme.common.a.h.c
        public final void a() {
            super.a();
            h.b bVar = this.f96421c.u;
            h.f.b.l.b(bVar, "");
            if (bVar.f76366b == 1) {
                View view = this.itemView;
                h.f.b.l.b(view, "");
                view.getLayoutParams().height = 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FollowListAdapter followListAdapter, ViewGroup viewGroup, ViewGroup viewGroup2) {
            super(viewGroup2);
            this.f96421c = followListAdapter;
            this.f96422d = viewGroup;
        }
    }

    public final String e() {
        if (TextUtils.equals(this.f96401i, "following_relation")) {
            if (this.f96402j) {
                return "following";
            }
            return "other_following";
        } else if (!TextUtils.equals(this.f96401i, "follower_relation")) {
            return "";
        } else {
            if (this.f96402j) {
                return "fans";
            }
            return "other_fans";
        }
    }

    private final h.f.a.b<Integer, Boolean> d(int i2) {
        return new r(this, i2);
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        this.f96399g = str;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        return new b(this, viewGroup, viewGroup);
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ FollowListAdapter this$0;

        static {
            Covode.recordClassIndex(61062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FollowListAdapter followListAdapter) {
            super(1);
            this.this$0 = followListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new FollowItemViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ FollowListAdapter this$0;

        static {
            Covode.recordClassIndex(61069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(FollowListAdapter followListAdapter) {
            super(1);
            this.this$0 = followListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new FollowItemViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f96429a = new k();

        static {
            Covode.recordClassIndex(61070);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f96430a = new l();

        static {
            Covode.recordClassIndex(61071);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f96431a = new m();

        static {
            Covode.recordClassIndex(61072);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f96432a = new n();

        static {
            Covode.recordClassIndex(61073);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f96433a = new o();

        static {
            Covode.recordClassIndex(61074);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f96434a = new p();

        static {
            Covode.recordClassIndex(61075);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f96423a = new d();

        static {
            Covode.recordClassIndex(61063);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            return new RecommendContactViewHolder(aVar.a(context));
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f96424a = new e();

        static {
            Covode.recordClassIndex(61064);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            return new NewRecommendUserViewHolder(b2.a(context, 3));
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f96425a = new f();

        static {
            Covode.recordClassIndex(61065);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            RecommendUserService b2 = RecommendUserServiceImpl.b();
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            return new NewRecommendUserViewHolder(b2.a(context, 3));
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f96427a = new h();

        static {
            Covode.recordClassIndex(61067);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            return new MutualFriendItemViewHolder(new at(context, (byte) 0));
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f96428a = new i();

        static {
            Covode.recordClassIndex(61068);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.apg, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new MutualListTitleViewHolder(a2);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f96435a = new q();

        static {
            Covode.recordClassIndex(61076);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.aoo, viewGroup2, false);
            h.f.b.l.b(a2, "");
            return new RecommendRelationTitleViewHolder(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h, com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        int c2 = super.c(i2);
        if (c2 != 0) {
            return c2;
        }
        return ((com.ss.android.ugc.aweme.base.arch.d) this).f67986a.b(i2 - d());
    }

    static final class g extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f96426a = new g();

        static {
            Covode.recordClassIndex(61066);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            h.f.b.l.d(viewGroup2, "");
            View a2 = com.a.a(LayoutInflater.from(viewGroup2.getContext()), R.layout.mi, viewGroup2, false);
            h.f.b.l.b(a2, "");
            Context context = viewGroup2.getContext();
            h.f.b.l.b(context, "");
            return new RecommendSuggestTitleViewHolder(a2, context);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ int $type;
        final /* synthetic */ FollowListAdapter this$0;

        static {
            Covode.recordClassIndex(61077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(FollowListAdapter followListAdapter, int i2) {
            super(1);
            this.this$0 = followListAdapter;
            this.$type = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int i2;
            int intValue = num.intValue();
            int i3 = this.$type;
            Object a2 = this.this$0.a(intValue);
            boolean z = false;
            if (a2 instanceof com.ss.android.ugc.aweme.following.a.f) {
                i2 = ((com.ss.android.ugc.aweme.following.a.f) a2).f96340a;
            } else if (a2 instanceof com.ss.android.ugc.aweme.following.a.g) {
                i2 = ((com.ss.android.ugc.aweme.following.a.g) a2).f96342a;
            } else if (a2 instanceof com.ss.android.ugc.aweme.following.a.e) {
                i2 = ((com.ss.android.ugc.aweme.following.a.e) a2).f96337a;
            } else if (a2 instanceof RecommendContact) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            if (i3 == i2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.arch.h
    public final void a(com.bytedance.jedi.ext.adapter.b.g<JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> gVar) {
        h.f.b.l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(d(0), null, new c(this));
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(d(1), null, new j(this));
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(d(7), null, k.f96429a);
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(d(8), null, l.f96430a);
        com.bytedance.jedi.ext.adapter.b.g unused5 = gVar.a(d(9), null, m.f96431a);
        com.bytedance.jedi.ext.adapter.b.g unused6 = gVar.a(d(10), null, n.f96432a);
        com.bytedance.jedi.ext.adapter.b.g unused7 = gVar.a(d(11), null, o.f96433a);
        com.bytedance.jedi.ext.adapter.b.g unused8 = gVar.a(d(12), null, p.f96434a);
        com.bytedance.jedi.ext.adapter.b.g unused9 = gVar.a(d(4), null, q.f96435a);
        com.bytedance.jedi.ext.adapter.b.g unused10 = gVar.a(d(3), null, d.f96423a);
        com.bytedance.jedi.ext.adapter.b.g unused11 = gVar.a(d(2), null, e.f96424a);
        com.bytedance.jedi.ext.adapter.b.g unused12 = gVar.a(d(13), null, f.f96425a);
        com.bytedance.jedi.ext.adapter.b.g unused13 = gVar.a(d(14), null, g.f96426a);
        com.bytedance.jedi.ext.adapter.b.g unused14 = gVar.a(d(15), null, h.f96427a);
        com.bytedance.jedi.ext.adapter.b.g unused15 = gVar.a(d(16), null, i.f96428a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowListAdapter(androidx.lifecycle.m mVar, String str, boolean z) {
        super(mVar, new com.ss.android.ugc.aweme.following.a.d(), 4);
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(str, "");
        this.f96400h = mVar;
        this.f96401i = str;
        this.f96402j = z;
    }
}
