package com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.im.sdk.chat.a.d;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.DmViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.Objects;

public final class SingleChatPanel extends BaseChatPanel implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f101020a = new a((byte) 0);
    private com.bytedance.ies.dmt.ui.b.b u;
    private final com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a v;

    static {
        Covode.recordClassIndex(64615);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64616);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SingleChatPanel this$0;

        static {
            Covode.recordClassIndex(64618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SingleChatPanel singleChatPanel) {
            super(0);
            this.this$0 = singleChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f101162e.finish();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.c.a(this.v.getFromUser());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c a() {
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.r;
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        return new com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.a.a((com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a) aVar, this.q);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void onResume() {
        super.onResume();
        IMUser fromUser = this.v.getFromUser();
        this.v.getChatExt();
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.c.a(fromUser);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void onStop() {
        super.onStop();
        com.bytedance.ies.dmt.ui.b.b bVar = this.u;
        if (bVar != null && bVar.isShowing()) {
            bVar.e();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void b() {
        super.b();
        if (a.f101027a[this.f101169l.ordinal()] == 1) {
            StrangerChatRiskHint strangerChatRiskHint = (StrangerChatRiskHint) this.q.findViewById(R.id.a4x);
            if (strangerChatRiskHint != null) {
                strangerChatRiskHint.setVisibility(0);
            }
            c().b(8);
            com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.r;
            d.f fVar = d.f.f100107a;
            l.d(fVar, "");
            androidx.c.a aVar2 = new androidx.c.a();
            aVar2.put("enter_from", com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(aVar));
            aVar2.put("chat_type", com.ss.android.ugc.aweme.im.sdk.chat.a.d.b(aVar));
            fVar.invoke("receive_message_request_show", aVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel
    public final void onCreate() {
        IMUser fromUser;
        String displayName;
        LiveData liveData;
        super.onCreate();
        DmViewModel a2 = DmViewModel.a.a(this.f101160c);
        if (!(a2 == null || (liveData = (LiveData) a2.f100877a.getValue()) == null)) {
            liveData.observe(this.f101161d, new b(this));
        }
        ((ChatTopTip) this.q.findViewById(R.id.a50)).a(this.v);
        StrangerChatRiskHint strangerChatRiskHint = (StrangerChatRiskHint) this.q.findViewById(R.id.a4x);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = this.v;
        com.ss.android.ugc.aweme.im.sdk.chat.ui.view.a aVar2 = new com.ss.android.ugc.aweme.im.sdk.chat.ui.view.a(new c(this), new d(this));
        String str = "";
        l.d(aVar, str);
        l.d(aVar2, str);
        strangerChatRiskHint.f101253a = aVar2;
        strangerChatRiskHint.f101254b = aVar;
        if (aVar.getSelectMsgType() != 1 && aVar.isStrangerChat() && !strangerChatRiskHint.getKeva().getBoolean(strangerChatRiskHint.getKey(), false)) {
            aVar2.f101265b.invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a.RiskHint);
            TuxTextView tuxTextView = (TuxTextView) strangerChatRiskHint.a(R.id.title_tv);
            l.b(tuxTextView, str);
            a.C0730a aVar3 = new a.C0730a();
            Context context = strangerChatRiskHint.getContext();
            l.b(context, str);
            Resources resources = context.getResources();
            l.b(resources, str);
            String[] strArr = new String[1];
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar4 = strangerChatRiskHint.f101254b;
            if (!(aVar4 == null || (fromUser = aVar4.getFromUser()) == null || (displayName = fromUser.getDisplayName()) == null)) {
                str = displayName;
            }
            strArr[0] = str;
            tuxTextView.setText(aVar3.a(resources, R.string.b9z, strArr).f33382a);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, z> {
        final /* synthetic */ SingleChatPanel this$0;

        static {
            Covode.recordClassIndex(64619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SingleChatPanel singleChatPanel) {
            super(1);
            this.this$0 = singleChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a aVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.e.a aVar2 = aVar;
            l.d(aVar2, "");
            this.this$0.a(aVar2);
            return z.f158842a;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleChatPanel f101021a;

        static {
            Covode.recordClassIndex(64617);
        }

        b(SingleChatPanel singleChatPanel) {
            this.f101021a = singleChatPanel;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.im.core.d.ai[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj != null) {
                this.f101021a.d().a(n.c(obj), 3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleChatPanel(m mVar, View view, com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar) {
        super(mVar, view, aVar);
        l.d(mVar, "");
        l.d(view, "");
        l.d(aVar, "");
        this.v = aVar;
        new com.ss.android.ugc.aweme.im.sdk.chat.feature.like.a(this.f101161d, ((BaseChatPanel) this).f101159b, this.f101163f, d(), aVar);
    }
}
