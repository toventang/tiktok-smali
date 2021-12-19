package com.ss.android.ugc.aweme.notificationlive.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.y;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.j;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.notificationlive.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import com.ss.android.ugc.aweme.notificationlive.t;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserState;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class PushSettingFollowListAdapter extends com.ss.android.ugc.aweme.base.arch.c<Object> {

    /* renamed from: h  reason: collision with root package name */
    public static final a f114420h = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public String f114421d = "";

    /* renamed from: e  reason: collision with root package name */
    public boolean f114422e = true;

    /* renamed from: f  reason: collision with root package name */
    public final m f114423f;

    /* renamed from: g  reason: collision with root package name */
    public final String f114424g;

    static {
        Covode.recordClassIndex(73615);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73631);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final class FollowItemViewSwitchHolder extends JediBaseViewHolder<FollowItemViewSwitchHolder, com.ss.android.ugc.aweme.following.a.f> implements com.ss.android.ugc.aweme.setting.serverpush.b.b, com.ss.android.ugc.aweme.setting.serverpush.b.c, com.ss.android.ugc.aweme.setting.serverpush.b.c {

        /* renamed from: g  reason: collision with root package name */
        public CommonItemView f114436g;

        /* renamed from: j  reason: collision with root package name */
        f.a.l.c<CommonItemView> f114437j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ PushSettingFollowListAdapter f114438k;

        /* renamed from: l  reason: collision with root package name */
        private final h.h f114439l;

        static {
            Covode.recordClassIndex(73625);
        }

        private final PushSettingNotificationChoiceViewModel m() {
            return (PushSettingNotificationChoiceViewModel) this.f114439l.getValue();
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
        public final void a(Exception exc) {
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
        public final void av_() {
            t.a(this.f114436g.d());
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
        public final void cf_() {
            View view = this.itemView;
            l.b(view, "");
            new com.bytedance.tux.g.b(view).e(R.string.de2).b();
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            this.f114436g.setOnClickListener(new c(this));
            com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.a_(this);
            providePushSettingFetchPresenter.a(new Object[0]);
            f.a.b.b unused = selectSubscribe(m(), d.f114449a, new ah(), new d(this));
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PushSettingNotificationChoiceViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(73626);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewSwitchHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_notificationlive_ui_adapter_PushSettingFollowListAdapter$FollowItemViewSwitchHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        public final void a(boolean z) {
            try {
                m().b(z);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
        public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
            boolean z;
            boolean z2 = true;
            a(true);
            if (fVar != null) {
                if (fVar.f122571j != 1 || !t.c()) {
                    z = false;
                } else {
                    z = true;
                }
                a(z);
                if (fVar.f122571j != 1) {
                    z2 = false;
                }
                t.a(z2);
            }
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewSwitchHolder f114440a;

            static {
                Covode.recordClassIndex(73627);
            }

            b(FollowItemViewSwitchHolder followItemViewSwitchHolder) {
                this.f114440a = followItemViewSwitchHolder;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                CommonItemView commonItemView = (CommonItemView) obj;
                com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<BaseResponse>, com.ss.android.ugc.aweme.setting.serverpush.b.b> providePushSettingChangePresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingChangePresenter();
                providePushSettingChangePresenter.a_(this.f114440a);
                l.b(commonItemView, "");
                providePushSettingChangePresenter.a("live_push", Integer.valueOf(commonItemView.d() ? 1 : 0));
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("label", "live_push");
                if (commonItemView.d()) {
                    str = "on";
                } else {
                    str = "off";
                }
                r.a("notification_switch", a2.a("to_status", str).f66730a);
            }
        }

        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewSwitchHolder f114441a;

            static {
                Covode.recordClassIndex(73628);
            }

            c(FollowItemViewSwitchHolder followItemViewSwitchHolder) {
                this.f114441a = followItemViewSwitchHolder;
            }

            public final void onClick(View view) {
                f.a.t<CommonItemView> d2;
                f.a.t<CommonItemView> a2;
                ClickAgent.onClick(view);
                if (t.c()) {
                    this.f114441a.f114436g.setChecked(!this.f114441a.f114436g.d());
                    FollowItemViewSwitchHolder followItemViewSwitchHolder = this.f114441a;
                    followItemViewSwitchHolder.a(followItemViewSwitchHolder.f114436g.d());
                    FollowItemViewSwitchHolder followItemViewSwitchHolder2 = this.f114441a;
                    if (followItemViewSwitchHolder2.f114437j == null) {
                        followItemViewSwitchHolder2.f114437j = new f.a.l.c<>();
                        f.a.l.c<CommonItemView> cVar = followItemViewSwitchHolder2.f114437j;
                        if (!(cVar == null || (d2 = cVar.d(400, TimeUnit.MILLISECONDS)) == null || (a2 = d2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) == null)) {
                            a2.d(new b(followItemViewSwitchHolder2));
                        }
                    }
                    f.a.l.c<CommonItemView> cVar2 = followItemViewSwitchHolder2.f114437j;
                    if (cVar2 != null) {
                        cVar2.onNext(this.f114441a.f114436g);
                    }
                    com.ss.android.ugc.aweme.setting.services.h.f122675a.a("live_push", this.f114441a.f114436g.d() ? 1 : 0);
                    return;
                }
                Context context = this.f114441a.f114436g.getContext();
                l.b(context, "");
                l.d(context, "");
                if (Build.VERSION.SDK_INT >= 26) {
                    Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                    intent.setFlags(268435456);
                    intent.putExtra("android.provider.extra.APP_PACKAGE", com.bytedance.ies.ugc.appcontext.d.a().getPackageName());
                    intent.putExtra("android.provider.extra.CHANNEL_ID", com.ss.android.di.push.a.a().getRealChannelId("live_push"));
                    if (t.f114374a == null) {
                        t.f114374a = com.bytedance.ies.ugc.appcontext.d.a().getPackageManager();
                    }
                    PackageManager packageManager = t.f114374a;
                    if (packageManager != null && packageManager.resolveActivity(intent, 65536) != null) {
                        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                        context.startActivity(intent);
                    }
                }
            }
        }

        static final class d extends h.f.b.m implements h.f.a.m<FollowItemViewSwitchHolder, Boolean, z> {
            final /* synthetic */ FollowItemViewSwitchHolder this$0;

            static {
                Covode.recordClassIndex(73629);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(FollowItemViewSwitchHolder followItemViewSwitchHolder) {
                super(2);
                this.this$0 = followItemViewSwitchHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(FollowItemViewSwitchHolder followItemViewSwitchHolder, Boolean bool) {
                FollowItemViewSwitchHolder followItemViewSwitchHolder2 = followItemViewSwitchHolder;
                boolean booleanValue = bool.booleanValue();
                l.d(followItemViewSwitchHolder2, "");
                followItemViewSwitchHolder2.f114436g.setChecked(booleanValue);
                this.this$0.f114438k.f114422e = booleanValue;
                return z.f158842a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewSwitchHolder(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f114438k = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131560319(0x7f0d077f, float:1.8746007E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                android.view.View r1 = r4.itemView
                r0 = 2131365247(0x7f0a0d7f, float:1.8350354E38)
                android.view.View r0 = r1.findViewById(r0)
                h.f.b.l.b(r0, r3)
                com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.ui.common.views.CommonItemView) r0
                r4.f114436g = r0
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel> r0 = com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel.class
                h.k.c r1 = h.f.b.ab.a(r0)
                com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$a r0 = new com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewSwitchHolder$a
                r0.<init>(r4, r1, r1)
                h.h r0 = h.i.a(r0)
                r4.f114439l = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewSwitchHolder.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, android.view.ViewGroup):void");
        }
    }

    public final class FollowItemViewHolder extends JediBaseViewHolder<FollowItemViewHolder, com.ss.android.ugc.aweme.following.a.g> implements au {

        /* renamed from: g  reason: collision with root package name */
        public boolean f114425g;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ PushSettingFollowListAdapter f114426j;

        /* renamed from: k  reason: collision with root package name */
        private final AvatarImageWithVerify f114427k;

        /* renamed from: l  reason: collision with root package name */
        private final TextView f114428l;

        /* renamed from: m  reason: collision with root package name */
        private final ImageView f114429m;
        private final ImageView n;
        private final h.h o;

        static {
            Covode.recordClassIndex(73616);
        }

        public final PushSettingNotificationChoiceViewModel m() {
            return (PushSettingNotificationChoiceViewModel) this.o.getValue();
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        public static final class a extends h.f.b.m implements h.f.a.a<PushSettingNotificationChoiceViewModel> {
            final /* synthetic */ JediViewHolder $this_hostViewModel;
            final /* synthetic */ h.k.c $viewModelClass;
            final /* synthetic */ h.k.c $viewModelClass$inlined;

            static {
                Covode.recordClassIndex(73617);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
                super(0);
                this.$this_hostViewModel = jediViewHolder;
                this.$viewModelClass = cVar;
                this.$viewModelClass$inlined = cVar2;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
            /* JADX WARNING: Unknown variable types count: 3 */
            @Override // h.f.a.a
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel invoke() {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
            }

            public static ac com_ss_android_ugc_aweme_notificationlive_ui_adapter_PushSettingFollowListAdapter$FollowItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
                if (cls.equals(ScopeViewModel.class)) {
                    return adVar.a(str, cls);
                }
                ac a2 = adVar.a(str, cls);
                ab.a(a2, adVar);
                return a2;
            }
        }

        private final NotificationLiveViewModel n() {
            d dVar = d.f114431a;
            JediViewHolderProxy jediViewHolderProxy = this.f39565d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) j.a.a(d(), jediViewHolderProxy.b()).a(getClass().getName() + '_' + NotificationLiveViewModel.class.getName(), NotificationLiveViewModel.class);
                y a2 = jediViewModel.f39365j.a(NotificationLiveViewModel.class);
                if (a2 != null) {
                    a2.binding(jediViewModel);
                }
                jediViewModel.a_(dVar);
                return (NotificationLiveViewModel) jediViewModel;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
        public final void e() {
            super.e();
            h hVar = new h(this);
            JediViewHolderProxy jediViewHolderProxy = this.f39565d;
            if (jediViewHolderProxy != null) {
                JediViewModel jediViewModel = (JediViewModel) j.a.a(d(), jediViewHolderProxy.b()).a(getClass().getName() + '_' + UserViewModel.class.getName(), UserViewModel.class);
                y a2 = jediViewModel.f39365j.a(UserViewModel.class);
                if (a2 != null) {
                    a2.binding(jediViewModel);
                }
                jediViewModel.a_(hVar);
                f.a.b.b unused = subscribe((UserViewModel) jediViewModel, new ah(), b.f114430a);
                f.a.b.b unused2 = selectSubscribe(m(), a.f114446a, new ah(), new c(this));
                return;
            }
            throw new IllegalStateException("proxy not bound to viewHolder yet");
        }

        /* access modifiers changed from: package-private */
        public static final class d extends h.f.b.m implements h.f.a.b<ResponseState, ResponseState> {

            /* renamed from: a  reason: collision with root package name */
            public static final d f114431a = new d();

            static {
                Covode.recordClassIndex(73620);
            }

            d() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ResponseState invoke(ResponseState responseState) {
                ResponseState responseState2 = responseState;
                l.d(responseState2, "");
                return ResponseState.copy$default(responseState2, -1, -1, null, null, 12, null);
            }
        }

        static final class h extends h.f.b.m implements h.f.a.b<UserState, UserState> {
            final /* synthetic */ FollowItemViewHolder this$0;

            static {
                Covode.recordClassIndex(73624);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(FollowItemViewHolder followItemViewHolder) {
                super(1);
                this.this$0 = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ UserState invoke(UserState userState) {
                UserState userState2 = userState;
                l.d(userState2, "");
                return UserState.copy$default(userState2, ((com.ss.android.ugc.aweme.following.a.g) this.this$0.aI_()).f96343b, false, null, null, null, 30, null);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class e implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f114432a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f114433b;

            static {
                Covode.recordClassIndex(73621);
            }

            e(FollowItemViewHolder followItemViewHolder, User user) {
                this.f114432a = followItemViewHolder;
                this.f114433b = user;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f114432a.f114425g = false;
                f.a.l.c<com.ss.android.ugc.aweme.notificationlive.a> a2 = t.a();
                if (a2 != null) {
                    User user = this.f114433b;
                    l.b(view, "");
                    a2.onNext(new com.ss.android.ugc.aweme.notificationlive.a(user, o.a(view.getContext()), "push_setting", this.f114432a.f114426j.f114424g));
                }
            }
        }

        public final void a(int i2) {
            if (i2 == 1) {
                this.f114429m.setImageResource(2131233385);
            } else if (i2 == 2) {
                this.f114429m.setImageResource(2131233384);
            } else if (i2 == 3) {
                this.f114429m.setImageResource(2131233386);
            }
        }

        public final void a(boolean z) {
            float f2;
            float f3;
            float f4;
            AvatarImageWithVerify avatarImageWithVerify = this.f114427k;
            float f5 = 1.0f;
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.34f;
            }
            avatarImageWithVerify.setAlpha(f2);
            TextView textView = this.f114428l;
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.34f;
            }
            textView.setAlpha(f3);
            ImageView imageView = this.f114429m;
            if (z) {
                f4 = 1.0f;
            } else {
                f4 = 0.34f;
            }
            imageView.setAlpha(f4);
            ImageView imageView2 = this.n;
            if (!z) {
                f5 = 0.34f;
            }
            imageView2.setAlpha(f5);
        }

        /* access modifiers changed from: package-private */
        public static final class g implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FollowItemViewHolder f114434a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ User f114435b;

            static {
                Covode.recordClassIndex(73623);
            }

            g(FollowItemViewHolder followItemViewHolder, User user) {
                this.f114434a = followItemViewHolder;
                this.f114435b = user;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f114434a.f114426j.f114422e) {
                    this.f114434a.f114425g = true;
                    l.b(view, "");
                    if (view.getContext() != null) {
                        SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/").withParam("uid", this.f114435b.getUid()).withParam("sec_user_id", this.f114435b.getSecUid()).withParam("enter_from", "push_setting").withParam("profile_enterprise_type", ae.f115954a.a(this.f114435b)).open();
                    }
                    r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "click_head").a("enter_method", "live_push_setting").a("to_user_id", this.f114435b.getUid()).f66730a);
                    return;
                }
                l.b(view, "");
                t.a(view.getContext(), this.f114435b);
            }
        }

        public final void a(User user) {
            this.f114427k.setUserData(new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
            this.f114427k.a();
            g gVar = new g(this, user);
            this.f114427k.setOnClickListener(gVar);
            this.f114428l.setOnClickListener(gVar);
            this.itemView.setOnClickListener(new e(this, user));
            this.f114428l.setText(in.b(user));
            View view = this.itemView;
            l.b(view, "");
            io.a(view.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f114428l);
            a(user.getLivePushNotificationStatus());
            a(this.f114426j.f114422e);
            NotificationLiveViewModel n2 = n();
            String secUid = user.getSecUid();
            l.b(secUid, "");
            n2.a(secUid);
            f.a.b.b unused = selectSubscribe(n(), b.f114447a, c.f114448a, new ah(), new f(user));
        }

        static final class c extends h.f.b.m implements h.f.a.m<FollowItemViewHolder, Boolean, z> {
            final /* synthetic */ FollowItemViewHolder this$0;

            static {
                Covode.recordClassIndex(73619);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(FollowItemViewHolder followItemViewHolder) {
                super(2);
                this.this$0 = followItemViewHolder;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(FollowItemViewHolder followItemViewHolder, Boolean bool) {
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                boolean booleanValue = bool.booleanValue();
                l.d(followItemViewHolder2, "");
                followItemViewHolder2.a(booleanValue);
                this.this$0.f114426j.f114422e = booleanValue;
                return z.f158842a;
            }
        }

        static final class b extends h.f.b.m implements h.f.a.m<FollowItemViewHolder, UserState, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f114430a = new b();

            static {
                Covode.recordClassIndex(73618);
            }

            b() {
                super(2);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(FollowItemViewHolder followItemViewHolder, UserState userState) {
                ListMiddleware<NotificationChoiceState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware;
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                UserState userState2 = userState;
                l.d(followItemViewHolder2, "");
                l.d(userState2, "");
                com.bytedance.jedi.arch.a<FollowStatus> followStatus = userState2.getFollowStatus();
                if (followStatus instanceof aj) {
                    followItemViewHolder2.a(userState2.getUser());
                } else if (followStatus instanceof com.bytedance.jedi.arch.f) {
                    View view = followItemViewHolder2.itemView;
                    l.b(view, "");
                    Context context = view.getContext();
                    com.bytedance.jedi.arch.a<FollowStatus> followStatus2 = userState2.getFollowStatus();
                    Objects.requireNonNull(followStatus2, "null cannot be cast to non-null type com.bytedance.jedi.arch.Fail<com.ss.android.ugc.aweme.profile.model.FollowStatus>");
                    com.ss.android.ugc.aweme.app.api.b.a.a(context, ((com.bytedance.jedi.arch.f) followStatus2).f39461a, (int) R.string.bz9);
                } else if (followStatus instanceof aq) {
                    followItemViewHolder2.a(userState2.getUser());
                }
                if (userState2.getUser().getFollowStatus() == 0) {
                    PushSettingNotificationChoiceViewModel m2 = followItemViewHolder2.m();
                    ListMiddleware<NotificationChoiceState, Object, com.ss.android.ugc.aweme.following.repository.f> listMiddleware2 = null;
                    if (m2 != null) {
                        listMiddleware = m2.f114390f;
                    } else {
                        listMiddleware = null;
                    }
                    listMiddleware.a(h.a.z.INSTANCE);
                    PushSettingNotificationChoiceViewModel m3 = followItemViewHolder2.m();
                    if (m3 != null) {
                        listMiddleware2 = m3.f114390f;
                    }
                    listMiddleware2.refresh();
                }
                return z.f158842a;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewHolder(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter r5, android.view.ViewGroup r6) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewHolder.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, android.view.ViewGroup):void");
        }

        /* access modifiers changed from: package-private */
        public static final class f extends h.f.b.m implements q<FollowItemViewHolder, com.ss.android.ugc.aweme.notificationlive.r, Integer, z> {
            final /* synthetic */ User $item;

            static {
                Covode.recordClassIndex(73622);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(User user) {
                super(3);
                this.$item = user;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(FollowItemViewHolder followItemViewHolder, com.ss.android.ugc.aweme.notificationlive.r rVar, Integer num) {
                FollowItemViewHolder followItemViewHolder2 = followItemViewHolder;
                int intValue = num.intValue();
                l.d(followItemViewHolder2, "");
                if (rVar != null) {
                    if (followItemViewHolder2.f114425g) {
                        followItemViewHolder2.m().f114389e = true;
                        followItemViewHolder2.f114425g = false;
                    } else {
                        this.$item.setLivePushNotificationStatus(intValue);
                        followItemViewHolder2.a(intValue);
                    }
                }
                return z.f158842a;
            }
        }
    }

    private final h.f.a.b<Integer, Boolean> d(int i2) {
        return new h(this, i2);
    }

    static final class b extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PushSettingFollowListAdapter this$0;

        static {
            Covode.recordClassIndex(73632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PushSettingFollowListAdapter pushSettingFollowListAdapter) {
            super(1);
            this.this$0 = pushSettingFollowListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new FollowItemViewHolder(this.this$0, viewGroup2);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f114443a = new c();

        static {
            Covode.recordClassIndex(73633);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f114444a = new d();

        static {
            Covode.recordClassIndex(73634);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f114445a = new e();

        static {
            Covode.recordClassIndex(73635);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new RelationStatusViewHolder(viewGroup2);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PushSettingFollowListAdapter this$0;

        static {
            Covode.recordClassIndex(73636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PushSettingFollowListAdapter pushSettingFollowListAdapter) {
            super(1);
            this.this$0 = pushSettingFollowListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new FollowItemViewTitleHolder(this.this$0, viewGroup2);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<ViewGroup, JediViewHolder<? extends com.bytedance.jedi.arch.g, ?>> {
        final /* synthetic */ PushSettingFollowListAdapter this$0;

        static {
            Covode.recordClassIndex(73637);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(PushSettingFollowListAdapter pushSettingFollowListAdapter) {
            super(1);
            this.this$0 = pushSettingFollowListAdapter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ JediViewHolder<? extends com.bytedance.jedi.arch.g, ?> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return new FollowItemViewSwitchHolder(this.this$0, viewGroup2);
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

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<Integer, Boolean> {
        final /* synthetic */ int $type;
        final /* synthetic */ PushSettingFollowListAdapter this$0;

        static {
            Covode.recordClassIndex(73638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(PushSettingFollowListAdapter pushSettingFollowListAdapter, int i2) {
            super(1);
            this.this$0 = pushSettingFollowListAdapter;
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
        l.d(gVar, "");
        com.bytedance.jedi.ext.adapter.b.g unused = gVar.a(d(0), null, new b(this));
        com.bytedance.jedi.ext.adapter.b.g unused2 = gVar.a(d(7), null, c.f114443a);
        com.bytedance.jedi.ext.adapter.b.g unused3 = gVar.a(d(9), null, d.f114444a);
        com.bytedance.jedi.ext.adapter.b.g unused4 = gVar.a(d(12), null, e.f114445a);
        com.bytedance.jedi.ext.adapter.b.g unused5 = gVar.a(d(17), null, new f(this));
        com.bytedance.jedi.ext.adapter.b.g unused6 = gVar.a(d(18), null, new g(this));
    }

    public final class FollowItemViewTitleHolder extends JediBaseViewHolder<FollowItemViewTitleHolder, com.ss.android.ugc.aweme.following.a.f> implements au {

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PushSettingFollowListAdapter f114442g;

        static {
            Covode.recordClassIndex(73630);
        }

        @Override // com.ss.android.ugc.aweme.base.arch.JediBaseViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
        public final void onStateChanged(m mVar, i.a aVar) {
            super.onStateChanged(mVar, aVar);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public FollowItemViewTitleHolder(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter r5, android.view.ViewGroup r6) {
            /*
                r4 = this;
                java.lang.String r3 = ""
                h.f.b.l.d(r6, r3)
                r4.f114442g = r5
                android.content.Context r0 = r6.getContext()
                android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
                r1 = 2131560320(0x7f0d0780, float:1.8746009E38)
                r0 = 0
                android.view.View r0 = com.a.a(r2, r1, r6, r0)
                h.f.b.l.b(r0, r3)
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewTitleHolder.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, android.view.ViewGroup):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PushSettingFollowListAdapter(m mVar, String str) {
        super(mVar, new com.ss.android.ugc.aweme.following.a.d(), 4);
        l.d(mVar, "");
        l.d(str, "");
        this.f114423f = mVar;
        this.f114424g = str;
    }
}
