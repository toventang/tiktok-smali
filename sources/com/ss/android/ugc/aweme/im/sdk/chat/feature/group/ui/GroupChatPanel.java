package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.GroupChatBlockedView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.view.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.group.a.a;
import com.ss.android.ugc.aweme.utils.aa;
import com.zhiliaoapp.musically.R;
import f.a.j.d;
import h.f.b.l;
import h.z;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class GroupChatPanel extends BaseChatPanel implements au {

    /* renamed from: a  reason: collision with root package name */
    public final GroupChatViewModel f100565a;
    private final f.a.b.a u = new f.a.b.a();
    private final com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b v;

    static {
        Covode.recordClassIndex(64323);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void onDestroy() {
        super.onDestroy();
        this.u.a();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final c a() {
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.r;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.GroupSessionInfo");
        return new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.a.a((com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b) aVar, this.q);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void onCreate() {
        super.onCreate();
        ((ChatTopTip) this.q.findViewById(R.id.a50)).a(this.v);
        f.a.j.a.a(d.a(this.n.f101477b, null, null, new a(this), 3), this.u);
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h $conversation;
        final /* synthetic */ GroupChatPanel this$0;

        static {
            Covode.recordClassIndex(64327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupChatPanel groupChatPanel, h hVar) {
            super(0);
            this.this$0 = groupChatPanel;
            this.$conversation = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            Map<String, String> ext;
            com.bytedance.im.core.d.i coreInfo = this.$conversation.getCoreInfo();
            if (coreInfo == null || (ext = coreInfo.getExt()) == null) {
                str = null;
            } else {
                str = ext.get("ban_status");
            }
            if (l.a((Object) str, (Object) "1")) {
                SmartRoute buildRoute = SmartRouter.buildRoute(this.this$0.f101160c, "aweme://webview");
                String a2 = SettingsManager.a().a("community_guidelines_url", "https://www.tiktok.com/community-guidelines");
                l.b(a2, "");
                buildRoute.withParam(Uri.parse(a2)).open();
            } else {
                com.bytedance.ies.im.core.api.b.a a3 = a.C0745a.a();
                String conversationId = this.$conversation.getConversationId();
                l.b(conversationId, "");
                a3.c(conversationId, new com.bytedance.im.core.a.a.b<String>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f100568a;

                    static {
                        Covode.recordClassIndex(64328);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f100568a = r1;
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // com.bytedance.im.core.a.a.b
                    public final /* synthetic */ void a(String str) {
                        l.d(str, "");
                    }

                    @Override // com.bytedance.im.core.a.a.b
                    public final void a(u uVar) {
                        Integer num;
                        StringBuilder append = new StringBuilder("GroupChatNotMemberView deleteConversation ").append(this.f100568a.$conversation.getConversationId()).append(" fail ,");
                        String str = null;
                        if (uVar != null) {
                            num = Integer.valueOf(uVar.f38023a);
                        } else {
                            num = null;
                        }
                        StringBuilder append2 = append.append(num).append(", ");
                        if (uVar != null) {
                            str = uVar.f38025c;
                        }
                        com.ss.android.ugc.aweme.im.service.m.a.e("GroupChatPanel", append2.append(str).toString());
                    }
                });
            }
            this.this$0.f101162e.finish();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void b() {
        super.b();
        int i2 = a.f100585a[this.f101169l.ordinal()];
        if (i2 == 1) {
            c().b(8);
            GroupChatBlockedView groupChatBlockedView = (GroupChatBlockedView) this.q.findViewById(R.id.bd7);
            l.b(groupChatBlockedView, "");
            groupChatBlockedView.setVisibility(0);
        } else if (i2 == 2) {
            c().b(0);
            GroupChatBlockedView groupChatBlockedView2 = (GroupChatBlockedView) this.q.findViewById(R.id.bd7);
            l.b(groupChatBlockedView2, "");
            groupChatBlockedView2.setVisibility(8);
        }
    }

    static final class a extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a, z> {
        final /* synthetic */ GroupChatPanel this$0;

        static {
            Covode.recordClassIndex(64326);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(GroupChatPanel groupChatPanel) {
            super(1);
            this.this$0 = groupChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.z) {
                GroupChatViewModel groupChatViewModel = this.this$0.f100565a;
                com.ss.android.ugc.aweme.im.sdk.chat.data.d.z zVar = (com.ss.android.ugc.aweme.im.sdk.chat.data.d.z) aVar2;
                h hVar = zVar.f100319a;
                int i2 = zVar.f100320b;
                l.d(hVar, "");
                groupChatViewModel.f100602b.setValue(hVar);
                if (i2 == 4) {
                    groupChatViewModel.f100604d.setValue(true);
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void a(int i2, int i3, Intent intent) {
        super.a(i2, i3, intent);
        if (i2 == 16 && i3 == 2097) {
            this.f100565a.f100604d.setValue(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupChatPanel(m mVar, View view, com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar, GroupChatViewModel groupChatViewModel) {
        super(mVar, view, bVar);
        Long valueOf;
        l.d(mVar, "");
        l.d(view, "");
        l.d(bVar, "");
        l.d(groupChatViewModel, "");
        this.v = bVar;
        this.f100565a = groupChatViewModel;
        groupChatViewModel.f100604d.observe(mVar, new androidx.lifecycle.u(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GroupChatPanel f100566a;

            static {
                Covode.recordClassIndex(64324);
            }

            {
                this.f100566a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f100566a.f101162e.finish();
            }
        });
        groupChatViewModel.f100603c.observe(mVar, new androidx.lifecycle.u(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ GroupChatPanel f100567a;

            static {
                Covode.recordClassIndex(64325);
            }

            {
                this.f100567a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                String str;
                String valueOf;
                h value = this.f100567a.f100565a.f100602b.getValue();
                if (value != null) {
                    String str2 = "";
                    l.b(value, str2);
                    if (l.a(obj, (Object) false)) {
                        GroupChatPanel groupChatPanel = this.f100567a;
                        groupChatPanel.a(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a.GroupBlocked);
                        GroupChatBlockedView groupChatBlockedView = (GroupChatBlockedView) groupChatPanel.q.findViewById(R.id.bd7);
                        l.b(groupChatBlockedView, str2);
                        b bVar = new b(groupChatPanel, value);
                        l.d(groupChatBlockedView, str2);
                        l.d(bVar, str2);
                        TuxTextView tuxTextView = (TuxTextView) groupChatBlockedView.b(R.id.eyh);
                        tuxTextView.setVisibility(0);
                        tuxTextView.setText(str2);
                        TuxTextView tuxTextView2 = (TuxTextView) groupChatBlockedView.b(R.id.ev7);
                        tuxTextView2.setText(tuxTextView2.getContext().getString(R.string.c6q));
                        if (value.getCoreInfo() == null) {
                            TuxTextView tuxTextView3 = (TuxTextView) groupChatBlockedView.b(R.id.eyh);
                            l.b(tuxTextView3, str2);
                            tuxTextView3.setVisibility(8);
                        } else if (value.isDissolved()) {
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b bVar2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.b.AT_MOST_DB;
                            String conversationId = value.getConversationId();
                            com.bytedance.im.core.d.i coreInfo = value.getCoreInfo();
                            if (!(coreInfo == null || (valueOf = String.valueOf(coreInfo.getOwner())) == null)) {
                                str2 = valueOf;
                            }
                            com.bytedance.im.core.d.i coreInfo2 = value.getCoreInfo();
                            if (coreInfo2 != null) {
                                str = coreInfo2.getSecOwner();
                            } else {
                                str = null;
                            }
                            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.a(bVar2, new com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.c(conversationId, str2, str), new a.C2478a(groupChatBlockedView));
                        } else if (!value.isMember()) {
                            TuxTextView tuxTextView4 = (TuxTextView) groupChatBlockedView.b(R.id.eyh);
                            l.b(tuxTextView4, str2);
                            tuxTextView4.setText(groupChatBlockedView.getContext().getString(R.string.c73));
                        } else {
                            com.bytedance.im.core.d.i coreInfo3 = value.getCoreInfo();
                            l.b(coreInfo3, str2);
                            if (l.a((Object) coreInfo3.getExt().get("ban_status"), (Object) "1")) {
                                com.bytedance.im.core.d.i coreInfo4 = value.getCoreInfo();
                                l.b(coreInfo4, str2);
                                String str3 = coreInfo4.getExt().get("ban_expiry");
                                if (str3 != null) {
                                    long parseLong = Long.parseLong(str3);
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    l.d(timeUnit, str2);
                                    String string = groupChatBlockedView.getContext().getString(R.string.c93, BDDateFormat.a(aa.a.b(), timeUnit.toMillis(parseLong)));
                                    l.b(string, str2);
                                    TuxTextView tuxTextView5 = (TuxTextView) groupChatBlockedView.b(R.id.eyh);
                                    l.b(tuxTextView5, str2);
                                    tuxTextView5.setText(string);
                                    TuxTextView tuxTextView6 = (TuxTextView) groupChatBlockedView.b(R.id.ev7);
                                    l.b(tuxTextView6, str2);
                                    tuxTextView6.setText(groupChatBlockedView.getContext().getString(R.string.c94));
                                }
                            }
                        }
                        ((TuxTextView) groupChatBlockedView.b(R.id.ev7)).setOnClickListener(new a.b(bVar));
                    } else if (l.a(obj, (Object) true)) {
                        this.f100567a.a(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a.Input);
                    }
                }
            }
        });
        com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.a.f100498d.a(bVar.getConversationId(), (com.ss.android.ugc.aweme.im.sdk.chat.feature.group.a.d) null);
        h value = groupChatViewModel.f100602b.getValue();
        if (value != null && (valueOf = Long.valueOf(value.getConversationShortId())) != null) {
            valueOf.longValue();
            com.bytedance.im.a.a.a.a();
            com.bytedance.im.a.a.a.a(valueOf.longValue(), e.a.f37582b, new a.C2580a(valueOf));
        }
    }
}
