package com.ss.android.ugc.aweme.im.sdk.chat.ui.base;

import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.ab;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.q;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.r;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.s;
import com.ss.android.ugc.aweme.im.sdk.chat.data.d.v;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.ChatLinearLayoutManager;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.ChatRoomLiveStateManager;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ac;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ae;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.da;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;

public abstract class BaseChatPanel extends LifecyclePanel implements au {

    /* renamed from: a  reason: collision with root package name */
    private boolean f101158a = true;

    /* renamed from: b  reason: collision with root package name */
    public final View f101159b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f101160c;

    /* renamed from: d  reason: collision with root package name */
    public final Fragment f101161d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.fragment.app.e f101162e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f101163f;

    /* renamed from: g  reason: collision with root package name */
    public final ChatLinearLayoutManager f101164g;

    /* renamed from: h  reason: collision with root package name */
    public final View f101165h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.d f101166i;

    /* renamed from: j  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a f101167j;

    /* renamed from: k  reason: collision with root package name */
    public final t<List<ai>> f101168k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.data.e.a f101169l;

    /* renamed from: m  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c f101170m;
    public final ChatRoomViewModel n;
    public boolean o;
    final h.h p;
    public final View q;
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a r;
    private final ImTextTitleBar u;
    private final h.h v;
    private final h.h w;
    private com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b x;
    private final f.a.b.a y;

    static {
        Covode.recordClassIndex(64714);
    }

    private final com.bytedance.tux.c.b i() {
        return (com.bytedance.tux.c.b) this.w.getValue();
    }

    public abstract com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c a();

    public void a(int i2, int i3, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel, androidx.lifecycle.k
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class j extends androidx.recyclerview.widget.i {
        static {
            Covode.recordClassIndex(64728);
        }

        j() {
        }

        @Override // androidx.recyclerview.widget.i, androidx.recyclerview.widget.ab
        public final boolean a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4, int i5) {
            h.f.b.l.d(viewHolder, "");
            h.f.b.l.d(viewHolder2, "");
            if (viewHolder == viewHolder2) {
                return super.a(viewHolder, viewHolder2, i2, i3, i4, i5);
            }
            viewHolder.itemView.animate().cancel();
            viewHolder2.itemView.animate().cancel();
            viewHolder.itemView.animate().alpha(0.0f).setDuration(125).start();
            return true;
        }
    }

    public static final class k implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101185a;

        static {
            Covode.recordClassIndex(64729);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            this.f101185a.f101162e.onBackPressed();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(BaseChatPanel baseChatPanel) {
            this.f101185a = baseChatPanel;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int i2) {
            boolean z;
            List<ai> value = this.f101185a.f101168k.getValue();
            if (value == null || value.isEmpty()) {
                new com.bytedance.tux.g.b(this.f101185a.f101162e).e(R.string.ccm).b();
                return;
            }
            if (value.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            if (!z) {
                StringBuilder sb = new StringBuilder();
                for (T t : value) {
                    if (t != null) {
                        sb.append(t.getMsgId()).append(",");
                    }
                }
                if (sb.length() > 0) {
                    String substring = sb.substring(0, sb.length() - 1);
                    h.f.b.l.b(substring, str);
                    str = substring;
                }
            }
            if (!(str == null || str.length() == 0)) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.c.a(this.f101185a.r.getConversationId(), value);
                com.ss.android.ugc.aweme.im.service.b.d dVar = new com.ss.android.ugc.aweme.im.service.b.d();
                dVar.f103831b = this.f101185a.r.getConversationId();
                dVar.f103830a = str;
                com.ss.android.ugc.d.a.c.a(dVar);
                this.f101185a.f101162e.finish();
            }
        }
    }

    public final void e() {
        a(this.u);
    }

    static final class m extends h.f.b.m implements h.f.a.a<ChatRoomLiveStateManager> {
        final /* synthetic */ androidx.lifecycle.m $parent;
        final /* synthetic */ BaseChatPanel this$0;

        static {
            Covode.recordClassIndex(64732);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(BaseChatPanel baseChatPanel, androidx.lifecycle.m mVar) {
            super(0);
            this.this$0 = baseChatPanel;
            this.$parent = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChatRoomLiveStateManager invoke() {
            return new ChatRoomLiveStateManager(this.this$0.f101163f, this.$parent);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<GestureDetector> {
        final /* synthetic */ BaseChatPanel this$0;

        static {
            Covode.recordClassIndex(64733);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(BaseChatPanel baseChatPanel) {
            super(0);
            this.this$0 = baseChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GestureDetector invoke() {
            return new GestureDetector(this.this$0.f101160c, new GestureDetector.SimpleOnGestureListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.n.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n f101187a;

                static {
                    Covode.recordClassIndex(64734);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f101187a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    h.f.b.l.d(motionEvent, "");
                    this.f101187a.this$0.c();
                    return super.onSingleTapConfirmed(motionEvent);
                }

                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                    int l2;
                    if (motionEvent == null || motionEvent2 == null) {
                        return super.onFling(motionEvent, motionEvent2, f2, f3);
                    }
                    float x = motionEvent.getX() - motionEvent2.getX();
                    if (motionEvent.getY() < motionEvent2.getY()) {
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (x == 0.0f) {
                            x = 1.0f;
                        }
                        if (y / Math.abs(x) > 0.65f) {
                            ChatLinearLayoutManager chatLinearLayoutManager = this.f101187a.this$0.f101164g;
                            if (chatLinearLayoutManager.f3780l) {
                                l2 = chatLinearLayoutManager.n();
                            } else {
                                l2 = chatLinearLayoutManager.l();
                            }
                            if (l2 == this.f101187a.this$0.d().getItemCount() - 1) {
                                this.f101187a.this$0.f();
                            }
                        }
                    }
                    return super.onFling(motionEvent, motionEvent2, f2, f3);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a c() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar = this.f101167j;
        if (aVar == null) {
            h.f.b.l.a("mInputView");
        }
        return aVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c d() {
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.f101170m;
        if (cVar == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        return cVar;
    }

    public final void f() {
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.f101170m;
        if (cVar == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        cVar.e();
    }

    public final void g() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar = this.f101167j;
        if (aVar == null) {
            h.f.b.l.a("mInputView");
        }
        aVar.r();
    }

    public final void h() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar = this.f101167j;
        if (aVar == null) {
            h.f.b.l.a("mInputView");
        }
        aVar.n();
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c f101178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101179b;

        static {
            Covode.recordClassIndex(64721);
        }

        c(com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar, BaseChatPanel baseChatPanel) {
            this.f101178a = cVar;
            this.f101179b = baseChatPanel;
        }

        public final void run() {
            if (this.f101179b.f101165h.getVisibility() == 0) {
                this.f101179b.f101165h.setVisibility(8);
            }
            this.f101178a.f101122l = null;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<com.bytedance.tux.c.b> {
        final /* synthetic */ BaseChatPanel this$0;

        static {
            Covode.recordClassIndex(64730);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(BaseChatPanel baseChatPanel) {
            super(0);
            this.this$0 = baseChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.c.b invoke() {
            com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(AnonymousClass1.f101186a);
            Context context = this.this$0.f101160c;
            h.f.b.l.b(context, "");
            return a2.a(context);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.f101170m;
        if (cVar == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        cVar.f101120j = false;
        com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.e(a.C0745a.a().a(this.r.getConversationId()));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public void onStop() {
        super.onStop();
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.x.o;
        if (cVar.f101119i != null) {
            cVar.f101119i.getLocalExt().remove("show_unread_message_tips");
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d f2 = com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f();
        if (f2.f101417a != null && f2.f101417a.get(f2.f101419c) != null && com.bytedance.ies.ugc.appcontext.f.f34637l) {
            f2.f101417a.get(f2.f101419c);
        }
    }

    public void b() {
        int i2 = a.f101189a[this.f101169l.ordinal()];
        if (i2 == 1) {
            StrangerChatRiskHint strangerChatRiskHint = (StrangerChatRiskHint) this.q.findViewById(R.id.a4x);
            if (strangerChatRiskHint != null) {
                strangerChatRiskHint.setVisibility(8);
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar = this.f101167j;
            if (aVar == null) {
                h.f.b.l.a("mInputView");
            }
            aVar.b(8);
        } else if (i2 == 2) {
            StrangerChatRiskHint strangerChatRiskHint2 = (StrangerChatRiskHint) this.q.findViewById(R.id.a4x);
            if (strangerChatRiskHint2 != null) {
                strangerChatRiskHint2.setVisibility(8);
            }
            com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar2 = this.f101167j;
            if (aVar2 == null) {
                h.f.b.l.a("mInputView");
            }
            aVar2.b(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public void onDestroy() {
        super.onDestroy();
        an.b(com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100171d);
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.a().clear();
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100168a = null;
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100172e.evictAll();
        this.f101163f.setAdapter(null);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.f101170m;
        if (cVar == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        cVar.f();
        androidx.lifecycle.i lifecycle = getLifecycle();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar = this.f101167j;
        if (aVar == null) {
            h.f.b.l.a("mInputView");
        }
        lifecycle.b(aVar);
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102187a = null;
        com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f().c();
        this.y.a();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public void onResume() {
        super.onResume();
        e();
        if (!this.f101158a) {
            com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d f2 = com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f();
            if (!f2.f101420d || f2.f101417a == null || f2.f101417a.size() <= 0) {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d f3 = com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f();
                if (!(f3.f101417a == null || f3.f101417a.get(f3.f101419c) == null)) {
                    f3.f101417a.get(f3.f101419c);
                }
            } else {
                Runnable a2 = com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f().a(this.f101163f);
                h.f.b.l.b(a2, "");
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.k.a(a2);
            }
        }
        this.f101158a = false;
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.f101170m;
        if (cVar == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        cVar.f101120j = true;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.LifecyclePanel
    public void onCreate() {
        super.onCreate();
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102187a = this.r;
        if (this.r.getSelectMsgType() == 1) {
            a(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a.Report);
        }
        e();
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar = this.f101170m;
        if (cVar == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        h.f.b.l.d(cVar, "");
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100171d = an.a(bf.f159040a);
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100168a = cVar;
        String str = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b;
        if (str == null) {
            str = UUID.randomUUID().toString();
            h.f.b.l.b(str, "");
        }
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100169b = str;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        h.f.b.l.b(createIUserServicebyMonsterPlugin, "");
        String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
        h.f.b.l.b(currentUserID, "");
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.b.f100170c = currentUserID;
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar2 = this.f101170m;
        if (cVar2 == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        ac.a("djjQueryMsg");
        if (cVar2.f101101b != null) {
            cVar2.f101101b.clear();
        }
        if (cVar2.f101115e.h().isEmpty()) {
            cVar2.f101115e.f();
            com.ss.android.ugc.aweme.im.service.m.a.b("MessageAdapter", "refreshData preload list is empty");
        } else {
            com.ss.android.ugc.aweme.im.service.m.a.b("MessageAdapter", "refreshData preload list notempty hasQueryMessage=" + cVar2.f101121k);
            if (cVar2.f101116f != null && !cVar2.f101121k) {
                ChatRoomViewModel chatRoomViewModel = cVar2.f101116f;
                List<ai> i2 = cVar2.f101115e.i();
                h.f.b.l.d(i2, "");
                h.f.b.l.d("messageAdapter", "");
                chatRoomViewModel.f101476a.onNext(new r(i2, 1, "messageAdapter"));
            }
        }
        com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f().a();
    }

    static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101175a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f101176b;

        static {
            Covode.recordClassIndex(64719);
        }

        a(BaseChatPanel baseChatPanel, androidx.lifecycle.m mVar) {
            this.f101175a = baseChatPanel;
            this.f101176b = mVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f101175a.a((List) obj);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f101183a = new h();

        static {
            Covode.recordClassIndex(64726);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("BaseChatPanel", th2);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<Throwable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f101184a = new i();

        static {
            Covode.recordClassIndex(64727);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            Throwable th2 = th;
            h.f.b.l.d(th2, "");
            com.ss.android.ugc.aweme.im.service.m.a.a("BaseChatPanel", th2);
            return z.f158842a;
        }
    }

    static final class o<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101188a;

        static {
            Covode.recordClassIndex(64735);
        }

        o(BaseChatPanel baseChatPanel) {
            this.f101188a = baseChatPanel;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ai aiVar = (ai) obj;
            if (aiVar != null) {
                this.f101188a.c().a(aiVar);
            }
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c $baMessageDelegate$inlined;
        final /* synthetic */ BaseChatPanel this$0;

        static {
            Covode.recordClassIndex(64724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BaseChatPanel baseChatPanel, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c cVar) {
            super(1);
            this.this$0 = baseChatPanel;
            this.$baMessageDelegate$inlined = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.d.a aVar2 = aVar;
            if ((aVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.z) && ((com.ss.android.ugc.aweme.im.sdk.chat.data.d.z) aVar2).f100320b == 5) {
                this.this$0.e();
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f101169l = aVar;
        com.ss.android.ugc.aweme.im.service.m.a.b("BaseChatPanel", "bottomType: ".concat(String.valueOf(aVar)));
        b();
    }

    static final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101177a;

        static {
            Covode.recordClassIndex(64720);
        }

        b(BaseChatPanel baseChatPanel) {
            this.f101177a = baseChatPanel;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c.a
        public final void a(ai aiVar) {
            BaseChatPanel baseChatPanel = this.f101177a;
            h.f.b.l.b(aiVar, "");
            BaseContent b2 = b.f.b(aiVar);
            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent");
            SayHelloContent sayHelloContent = (SayHelloContent) b2;
            baseChatPanel.f101166i = new com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.d(baseChatPanel.f101165h, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b.SAY_HELLO, true);
            com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.d dVar = baseChatPanel.f101166i;
            if (dVar == null) {
                h.f.b.l.a("oneStickerSayHiViewHolder");
            }
            dVar.a(aiVar, (ai) null, sayHelloContent, 0);
            baseChatPanel.f101165h.setVisibility(0);
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar = this.f101167j;
        if (aVar == null) {
            h.f.b.l.a("mInputView");
        }
        aVar.a(str);
    }

    private final void a(ImTextTitleBar imTextTitleBar) {
        if (this.r.getSelectMsgType() == 1) {
            imTextTitleBar.setOnTitlebarClickListener(new k(this));
            imTextTitleBar.setRightTextColor(androidx.core.content.b.c(this.f101160c, R.color.bh));
            imTextTitleBar.setLeftIcon(i());
            imTextTitleBar.setRightText(R.string.ce1);
            if (this.r.getChatType() == 3) {
                imTextTitleBar.setLeftTitleVisible(true);
                imTextTitleBar.setRightTuxFont(42);
            }
            a(this.f101168k.getValue());
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c, z> {
        final /* synthetic */ BaseChatPanel this$0;

        static {
            Covode.recordClassIndex(64736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(BaseChatPanel baseChatPanel) {
            super(1);
            this.this$0 = baseChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar2 = cVar;
            if (cVar2 instanceof v) {
                this.this$0.d().a(h.a.n.a(((v) cVar2).f100310b), 0);
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.f) {
                this.this$0.d().a(h.a.n.a(((com.ss.android.ugc.aweme.im.sdk.chat.data.d.f) cVar2).f100282b), 1);
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.l) {
                this.this$0.d().a(((com.ss.android.ugc.aweme.im.sdk.chat.data.d.l) cVar2).f100289a, 2);
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.i) {
                this.this$0.d().a(h.a.n.a(((com.ss.android.ugc.aweme.im.sdk.chat.data.d.i) cVar2).f100286a), 3);
            } else if (cVar2 instanceof r) {
                this.this$0.d().a(((r) cVar2).f100302a, 4);
            } else if (cVar2 instanceof q) {
                this.this$0.d().a(((q) cVar2).f100300a, 5);
            } else if (cVar2 instanceof ab) {
                this.this$0.d().a(((ab) cVar2).f100261a, 6);
            } else if (cVar2 instanceof s) {
                this.this$0.d().a(h.a.n.a(((s) cVar2).f100305a), 7);
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.g) {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c d2 = this.this$0.d();
                if (d2.f101114d == 1) {
                    d2.f101114d = 0;
                }
            } else if (cVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.m) {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c d3 = this.this$0.d();
                ai aiVar = ((com.ss.android.ugc.aweme.im.sdk.chat.data.d.m) cVar2).f100292a;
                if (!(d3 == null || aiVar == null)) {
                    d3.a((Object) h.a.n.c(aiVar), 0);
                }
            }
            return z.f158842a;
        }
    }

    public final void a(List<ai> list) {
        if (list == null || list.isEmpty()) {
            this.u.setRightTextColor(androidx.core.content.b.c(this.f101160c, R.color.bz));
            this.u.getRightView().setOnTouchListener(null);
            return;
        }
        this.u.setRightTextColor(androidx.core.content.b.c(this.f101160c, R.color.bh));
        ae.a(this.u.getRightView());
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c $baMessageDelegate$inlined;
        final /* synthetic */ BaseChatPanel this$0;

        static {
            Covode.recordClassIndex(64725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(BaseChatPanel baseChatPanel, com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c cVar) {
            super(1);
            this.this$0 = baseChatPanel;
            this.$baMessageDelegate$inlined = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar) {
            com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c cVar2;
            Integer num;
            com.ss.android.ugc.aweme.im.sdk.chat.data.d.c cVar3 = cVar;
            if ((cVar3 instanceof com.ss.android.ugc.aweme.im.sdk.chat.data.d.l) && (cVar2 = this.$baMessageDelegate$inlined) != null) {
                List<ai> list = ((com.ss.android.ugc.aweme.im.sdk.chat.data.d.l) cVar3).f100289a;
                h.f.b.l.d(list, "");
                for (ai aiVar : list) {
                    BaseContent b2 = b.f.b(aiVar);
                    if (b2 != null) {
                        num = Integer.valueOf(b2.getType());
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (num.intValue() == 704) {
                            String str = cVar2.f100379a;
                            String valueOf = String.valueOf(aiVar.getMsgId());
                            String conversationId = aiVar.getConversationId();
                            h.f.b.l.b(conversationId, "");
                            String str2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b;
                            h.f.b.l.b(str2, "");
                            String obj = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString();
                            b.C2470b bVar = b.C2470b.f100378a;
                            h.f.b.l.d(str, "");
                            h.f.b.l.d(conversationId, "");
                            h.f.b.l.d(valueOf, "");
                            h.f.b.l.d(str2, "");
                            h.f.b.l.d(obj, "");
                            h.f.b.l.d(bVar, "");
                            bVar.invoke("ttelite_BA_send_welcome_message", ag.c(h.v.a("enter_from", str), h.v.a("process_id", str2), h.v.a("message_id", valueOf), h.v.a("conversation_id", conversationId), h.v.a("to_user_id", obj)));
                        } else if (num.intValue() == 705) {
                            String str3 = cVar2.f100379a;
                            String valueOf2 = String.valueOf(aiVar.getMsgId());
                            String conversationId2 = aiVar.getConversationId();
                            h.f.b.l.b(conversationId2, "");
                            String str4 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.f102188b;
                            h.f.b.l.b(str4, "");
                            String obj2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString();
                            b.a aVar = b.a.f100377a;
                            h.f.b.l.d(str3, "");
                            h.f.b.l.d(conversationId2, "");
                            h.f.b.l.d(valueOf2, "");
                            h.f.b.l.d(str4, "");
                            h.f.b.l.d(obj2, "");
                            h.f.b.l.d(aVar, "");
                            aVar.invoke("ttelite_BA_send_auto_reply", ag.c(h.v.a("enter_from", str3), h.v.a("process_id", str4), h.v.a("message_id", valueOf2), h.v.a("conversation_id", conversationId2), h.v.a("to_user_id", obj2)));
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101182a;

        static {
            Covode.recordClassIndex(64723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, BaseChatPanel baseChatPanel) {
            super(context);
            this.f101182a = baseChatPanel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            LinearLayoutManager linearLayoutManager;
            int m2;
            ai b2;
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            if (i2 == 1) {
                this.f101182a.c().n();
            }
            com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f().a(recyclerView, i2);
            if (this.f101182a.f101170m != null) {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c d2 = this.f101182a.d();
                h.f.b.l.d(recyclerView, "");
                h.f.b.l.d(d2, "");
                if (com.ss.android.ugc.aweme.im.sdk.chat.b.b.b.a() && i2 == 0 && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null && (m2 = linearLayoutManager.m()) >= 0) {
                    int i3 = m2 + 1;
                    h.p a2 = h.v.a(Integer.valueOf(i3), Integer.valueOf(i3 + ((Number) com.ss.android.ugc.aweme.im.sdk.chat.b.b.d.f100125a.getValue()).intValue()));
                    if (d2.getItemCount() > 0) {
                        new ArrayList();
                        int intValue = ((Number) a2.getFirst()).intValue();
                        int intValue2 = ((Number) a2.getSecond()).intValue();
                        com.ss.android.ugc.aweme.im.service.m.a.b("MediaPreloader", "onRecyclerViewScrollStateChanged from: " + intValue + ", to: " + intValue2);
                        while (intValue < intValue2) {
                            if (intValue >= 0 && intValue < d2.getItemCount() && (b2 = d2.b(intValue)) != null) {
                                com.ss.android.ugc.aweme.im.sdk.chat.b.b.d.b(h.a.n.a(b2));
                            }
                            intValue++;
                        }
                    }
                }
            }
        }
    }

    static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView f101180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseChatPanel f101181b;

        static {
            Covode.recordClassIndex(64722);
        }

        d(RecyclerView recyclerView, BaseChatPanel baseChatPanel) {
            this.f101180a = recyclerView;
            this.f101181b = baseChatPanel;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!h.f.b.l.a(view, this.f101180a) || !((GestureDetector) this.f101181b.p.getValue()).onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseChatPanel(androidx.lifecycle.m mVar, View view, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        super(mVar);
        boolean z;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a aVar2;
        com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c cVar;
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(aVar, "");
        this.q = view;
        this.r = aVar;
        this.f101159b = view;
        Context context = view.getContext();
        this.f101160c = context;
        Fragment fragment = (Fragment) mVar;
        this.f101161d = fragment;
        androidx.fragment.app.e requireActivity = fragment.requireActivity();
        h.f.b.l.b(requireActivity, "");
        this.f101162e = requireActivity;
        View findViewById = view.findViewById(R.id.a4z);
        h.f.b.l.b(findViewById, "");
        this.u = (ImTextTitleBar) findViewById;
        View findViewById2 = view.findViewById(R.id.djh);
        h.f.b.l.b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f101163f = recyclerView;
        h.f.b.l.b(context, "");
        ChatLinearLayoutManager chatLinearLayoutManager = new ChatLinearLayoutManager(context);
        this.f101164g = chatLinearLayoutManager;
        h.h a2 = h.i.a((h.f.a.a) new m(this, mVar));
        this.v = a2;
        this.w = h.i.a((h.f.a.a) new l(this));
        View findViewById3 = view.findViewById(R.id.ds8);
        h.f.b.l.b(findViewById3, "");
        this.f101165h = findViewById3;
        t<List<ai>> tVar = new t<>();
        tVar.observe(mVar, new a(this, mVar));
        this.f101168k = tVar;
        this.f101169l = com.ss.android.ugc.aweme.im.sdk.chat.data.e.a.Input;
        h.f.b.l.d(fragment, "");
        h.f.b.l.d(aVar, "");
        androidx.lifecycle.ac a3 = androidx.lifecycle.ae.a(fragment, new ChatRoomViewModel.a.C2521a(aVar)).a(ChatRoomViewModel.class);
        h.f.b.l.b(a3, "");
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) a3;
        this.n = chatRoomViewModel;
        this.o = true;
        f.a.b.a aVar3 = new f.a.b.a();
        this.y = aVar3;
        this.p = h.i.a((h.f.a.a) new n(this));
        WeakReference weakReference = new WeakReference(fragment);
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        h.f.b.l.d(viewGroup, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(weakReference, "");
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.f.a() != 1) {
            z = true;
        } else {
            z = false;
        }
        this.f101167j = new InputView(viewGroup, aVar, z, weakReference);
        androidx.lifecycle.i lifecycle = getLifecycle();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar4 = this.f101167j;
        if (aVar4 == null) {
            h.f.b.l.a("mInputView");
        }
        lifecycle.a(aVar4);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c a4 = a();
        a4.setHasStableIds(true);
        a4.o = tVar;
        if (!(a4.n == null || a4.n.getSelectMsgList() == null || a4.n.getSelectMsgList().isEmpty() || a4.o == null)) {
            List<ai> value = a4.o.getValue();
            value = value == null ? new ArrayList<>() : value;
            value.addAll(a4.n.getSelectMsgList());
            a4.o.setValue(value);
        }
        a4.q = (ChatRoomLiveStateManager) a2.getValue();
        if (com.ss.android.ugc.aweme.im.service.c.d.c()) {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a();
            b bVar = new b(this);
            h.f.b.l.d(bVar, "");
            aVar2.f100332a = bVar;
        } else if (com.ss.android.ugc.aweme.im.service.c.d.b()) {
            aVar2 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.a.b.a();
        } else {
            aVar2 = null;
        }
        a4.f101123m = aVar2;
        if (com.ss.android.ugc.aweme.im.service.c.d.c()) {
            a4.f101122l = new c(a4, this);
        }
        this.f101170m = a4;
        if (com.ss.android.ugc.aweme.im.service.c.f.b()) {
            com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar2 = this.f101170m;
            if (cVar2 == null) {
                h.f.b.l.a("mMessageAdapter");
            }
            cVar2.p.observe(this.t, new o(this));
        }
        IMUser singleChatFromUser = aVar.getSingleChatFromUser();
        String enterFromForMob = aVar.getEnterFromForMob();
        if (enterFromForMob != null) {
            cVar = new com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.a.c(enterFromForMob);
        } else {
            cVar = null;
        }
        if (!(singleChatFromUser == null || singleChatFromUser.getUid() == null || singleChatFromUser.getAccountType() != 3)) {
            IBaAutoMessageService d2 = BaAutoMessageServiceImpl.d();
            String uid = singleChatFromUser.getUid();
            h.f.b.l.b(uid, "");
            d2.a(uid);
        }
        f.a.t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.a> a5 = chatRoomViewModel.f101477b.a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a5, "");
        f.a.j.a.a(f.a.j.d.a(a5, h.f101183a, null, new f(this, cVar), 2), aVar3);
        f.a.t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c> a6 = chatRoomViewModel.f101476a.a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a6, "");
        f.a.j.a.a(f.a.j.d.a(a6, i.f101184a, null, new g(this, cVar), 2), aVar3);
        f.a.t<com.ss.android.ugc.aweme.im.sdk.chat.data.d.c> a7 = chatRoomViewModel.f101476a.a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a7, "");
        f.a.j.a.a(f.a.j.d.a(a7, null, null, new p(this), 3), aVar3);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar3 = this.f101170m;
        if (cVar3 == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        cVar3.f101115e = chatRoomViewModel.a();
        cVar3.f101116f = chatRoomViewModel;
        recyclerView.setClickable(true);
        j jVar = new j();
        jVar.f3953m = false;
        recyclerView.setItemAnimator(jVar);
        chatLinearLayoutManager.b(true);
        chatLinearLayoutManager.a(false);
        recyclerView.setLayoutManager(chatLinearLayoutManager);
        recyclerView.setVerticalScrollBarEnabled(true);
        recyclerView.setScrollBarStyle(33554432);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar4 = this.f101170m;
        if (cVar4 == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        recyclerView.setAdapter(cVar4);
        recyclerView.requestDisallowInterceptTouchEvent(true);
        recyclerView.setOnTouchListener(new d(recyclerView, this));
        recyclerView.a(new e(context, this));
        com.ss.android.ugc.aweme.im.sdk.chat.b.c.k.a(new com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.g(com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f(), recyclerView), 800);
        da.a.a("message_list").a(recyclerView);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar5 = this.f101167j;
        if (aVar5 == null) {
            h.f.b.l.a("mInputView");
        }
        aVar5.a(new b.AbstractC2490b(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseChatPanel f101171a;

            static {
                Covode.recordClassIndex(64715);
            }

            {
                this.f101171a = r1;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b.AbstractC2490b
            public final void a(int i2) {
                boolean z;
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d f2 = com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f();
                RecyclerView recyclerView = this.f101171a.f101163f;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                f2.a(recyclerView, z);
            }
        });
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar6 = this.f101167j;
        if (aVar6 == null) {
            h.f.b.l.a("mInputView");
        }
        aVar6.a(new b.a(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseChatPanel f101172a;

            static {
                Covode.recordClassIndex(64716);
            }

            {
                this.f101172a = r1;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.b.a
            public final void a(int i2, View view) {
                if (i2 != -1) {
                    this.f101172a.f101163f.postDelayed(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.AnonymousClass2.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass2 f101173a;

                        static {
                            Covode.recordClassIndex(64717);
                        }

                        {
                            this.f101173a = r1;
                        }

                        public final void run() {
                            LinearLayoutManager linearLayoutManager;
                            if ((this.f101173a.f101172a.f101163f.getLayoutManager() instanceof ChatLinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) this.f101173a.f101172a.f101163f.getLayoutManager()) != null) {
                                RecyclerView recyclerView = this.f101173a.f101172a.f101163f;
                                h.f.b.l.d(recyclerView, "");
                                int i2 = 0;
                                if (linearLayoutManager.f3780l) {
                                    linearLayoutManager.a(recyclerView, (RecyclerView.s) null, 0);
                                    return;
                                }
                                if (linearLayoutManager.A() - 1 >= 0) {
                                    i2 = linearLayoutManager.A() - 1;
                                }
                                linearLayoutManager.a(recyclerView, (RecyclerView.s) null, i2);
                            }
                        }
                    }, 50);
                }
            }
        });
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar7 = this.f101167j;
        if (aVar7 == null) {
            h.f.b.l.a("mInputView");
        }
        aVar7.a(new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.d(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BaseChatPanel f101174a;

            static {
                Covode.recordClassIndex(64718);
            }

            public final boolean onLongClick(View view) {
                return false;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f101174a = r1;
            }

            public final void onClick(View view) {
                com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.d.f().a(this.f101174a.f101163f, true);
            }
        });
        com.bytedance.ies.im.core.api.b.e a8 = chatRoomViewModel.a();
        h.f.b.l.d(requireActivity, "");
        h.f.b.l.d(a8, "");
        h.f.b.l.d(aVar, "");
        androidx.lifecycle.ac a9 = androidx.lifecycle.ae.a(requireActivity, new com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.b(a8, aVar)).a(ReadStateViewModel.class);
        h.f.b.l.b(a9, "");
        ReadStateViewModel readStateViewModel = (ReadStateViewModel) a9;
        String a10 = chatRoomViewModel.a().a();
        h.f.b.l.d(a10, "");
        com.ss.android.ugc.aweme.im.service.m.a.b("ReadStateViewModel", "setup");
        readStateViewModel.f100941a.b().clear();
        readStateViewModel.f100941a.c().setValue(null);
        com.bytedance.ies.im.core.api.b.a().a(a10, readStateViewModel);
        h.f.b.l.d(fragment, "");
        fragment.getLifecycle().a(readStateViewModel);
        fragment.getLifecycle().a(readStateViewModel.b());
        fragment.getLifecycle().a(readStateViewModel.c());
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar5 = this.f101170m;
        if (cVar5 == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        cVar5.a(readStateViewModel);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a aVar8 = this.f101167j;
        if (aVar8 == null) {
            h.f.b.l.a("mInputView");
        }
        aVar8.a(readStateViewModel);
        com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c cVar6 = this.f101170m;
        if (cVar6 == null) {
            h.f.b.l.a("mMessageAdapter");
        }
        this.x = new com.ss.android.ugc.aweme.im.sdk.chat.ui.d.b(view, recyclerView, cVar6);
        fragment.getLifecycle().a(chatRoomViewModel);
    }
}
