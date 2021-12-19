package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite;

import android.content.Context;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.u;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.aj;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.service.model.a;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class GroupInviteViewModel extends JediViewModel<GroupInviteState> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f100531b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a f100532a;

    /* renamed from: c  reason: collision with root package name */
    private String f100533c;

    static {
        Covode.recordClassIndex(64281);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64282);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static GroupInviteViewModel a(androidx.fragment.app.e eVar, String str) {
            ac a2;
            l.d(eVar, "");
            l.d(str, "");
            ad a3 = ae.a(eVar, new h(str, null));
            String str2 = "GroupInviteViewModel_" + str + '_' + System.currentTimeMillis();
            if (GroupInviteViewModel.class.equals(ScopeViewModel.class)) {
                a2 = a3.a(str2, GroupInviteViewModel.class);
            } else {
                a2 = a3.a(str2, GroupInviteViewModel.class);
                ab.a(a2, a3);
            }
            l.b(a2, "");
            return (GroupInviteViewModel) a2;
        }
    }

    public final void b() {
        c(c.f100534a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        g();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ GroupInviteState d() {
        return new GroupInviteState(null, null, null, false, 15, null);
    }

    public final void a() {
        t<AcceptInviteCardResponse> a2;
        t<AcceptInviteCardResponse> b2 = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.b(this.f100533c);
        if (b2 != null && (a2 = b2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null) {
            a(a2, f.f100538a);
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        t<InviteCardDetailInnerResponse> a2;
        t<InviteCardDetailInnerResponse> a3 = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.a(this.f100533c);
        if (a3 != null && (a2 = a3.a(f.a.a.a.a.a(f.a.a.b.a.f157156a))) != null) {
            a(a2, new e(this));
        }
    }

    public final void a(Context context) {
        l.d(context, "");
        b_(new d(this, context));
    }

    static final class d extends m implements h.f.a.b<GroupInviteState, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ GroupInviteViewModel this$0;

        static {
            Covode.recordClassIndex(64285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GroupInviteViewModel groupInviteViewModel, Context context) {
            super(1);
            this.this$0 = groupInviteViewModel;
            this.$context = context;
        }

        public static final class a implements com.bytedance.im.core.a.a.b<h> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f100535a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f100536b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ GroupInviteState f100537c;

            static {
                Covode.recordClassIndex(64286);
            }

            @Override // com.bytedance.im.core.a.a.b
            public final void a(u uVar) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.im.core.a.a.b
            public final /* synthetic */ void a(h hVar) {
                ChatRoomActivity.a.a(a.b.a(this.f100536b.$context, 3, this.f100535a).b("invite_card").f103883a);
            }

            a(String str, d dVar, GroupInviteState groupInviteState) {
                this.f100535a = str;
                this.f100536b = dVar;
                this.f100537c = groupInviteState;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(GroupInviteState groupInviteState) {
            String conversationId;
            long j2;
            GroupInviteState groupInviteState2 = groupInviteState;
            l.d(groupInviteState2, "");
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group = groupInviteState2.getGroup();
            if (!(group == null || (conversationId = group.getConversationId()) == null)) {
                com.bytedance.ies.im.core.api.b.a a2 = a.C0745a.a();
                String conversationShortId = groupInviteState2.getGroup().getConversationShortId();
                if (conversationShortId != null) {
                    j2 = Long.parseLong(conversationShortId);
                } else {
                    j2 = 0;
                }
                a2.a(conversationId, j2, e.a.f37582b, new a(conversationId, this, groupInviteState2));
            }
            this.this$0.b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<GroupInviteState, GroupInviteState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100534a = new c();

        static {
            Covode.recordClassIndex(64284);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState) {
            GroupInviteState groupInviteState2 = groupInviteState;
            l.d(groupInviteState2, "");
            return GroupInviteState.copy$default(groupInviteState2, null, null, null, true, 7, null);
        }
    }

    static final class b extends m implements h.f.a.b<GroupInviteState, z> {
        final /* synthetic */ String $from;
        final /* synthetic */ String $result;

        static {
            Covode.recordClassIndex(64283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, String str2) {
            super(1);
            this.$from = str;
            this.$result = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(GroupInviteState groupInviteState) {
            String conversationId;
            GroupInviteState groupInviteState2 = groupInviteState;
            String str = "";
            l.d(groupInviteState2, str);
            HashMap hashMap = new HashMap();
            hashMap.put("from_type", this.$from);
            hashMap.put("result", this.$result);
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group = groupInviteState2.getGroup();
            if (!(group == null || (conversationId = group.getConversationId()) == null)) {
                str = conversationId;
            }
            hashMap.put("conversation_id", str);
            r.a("click_share_pop", hashMap);
            return z.f158842a;
        }
    }

    public GroupInviteViewModel(String str, com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar) {
        this.f100533c = str;
        this.f100532a = aVar;
    }

    static final class f extends m implements h.f.a.m<GroupInviteState, com.bytedance.jedi.arch.a<? extends AcceptInviteCardResponse>, GroupInviteState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f100538a = new f();

        static {
            Covode.recordClassIndex(64288);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState, com.bytedance.jedi.arch.a<? extends AcceptInviteCardResponse> aVar) {
            GroupInviteState groupInviteState2 = groupInviteState;
            com.bytedance.jedi.arch.a<? extends AcceptInviteCardResponse> aVar2 = aVar;
            l.d(groupInviteState2, "");
            l.d(aVar2, "");
            return GroupInviteState.copy$default(groupInviteState2, null, null, aVar2, false, 11, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.m<GroupInviteState, com.bytedance.jedi.arch.a<? extends InviteCardDetailInnerResponse>, GroupInviteState> {
        final /* synthetic */ GroupInviteViewModel this$0;

        static {
            Covode.recordClassIndex(64287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(GroupInviteViewModel groupInviteViewModel) {
            super(2);
            this.this$0 = groupInviteViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState, com.bytedance.jedi.arch.a<? extends InviteCardDetailInnerResponse> aVar) {
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar2;
            T t;
            GroupInviteState groupInviteState2 = groupInviteState;
            com.bytedance.jedi.arch.a<? extends InviteCardDetailInnerResponse> aVar3 = aVar;
            l.d(groupInviteState2, "");
            l.d(aVar3, "");
            aj ajVar = null;
            if (aVar3 instanceof aj) {
                ajVar = aVar3;
            }
            aj ajVar2 = ajVar;
            if (ajVar2 == null || (t = ajVar2.f39383a) == null || (aVar2 = t.getGroup()) == null) {
                aVar2 = this.this$0.f100532a;
            }
            return GroupInviteState.copy$default(groupInviteState2, aVar2, aVar3, null, false, 12, null);
        }
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        b_(new b(str2, str));
    }
}
