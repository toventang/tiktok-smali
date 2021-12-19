package com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.friends.services.FollowService;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.k;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMFromMessageTips;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import h.a.ab;
import h.c.f;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class ChatTopTip extends LinearLayout implements au, i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final b f101084c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.aweme.im.sdk.chat.data.a f101085a;

    /* renamed from: b  reason: collision with root package name */
    public TuxTextView f101086b;

    /* renamed from: d  reason: collision with root package name */
    private m f101087d;

    /* renamed from: e  reason: collision with root package name */
    private ImChatTopTipModel f101088e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f101089f;

    /* renamed from: g  reason: collision with root package name */
    private AvatarImageView f101090g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f101091h;

    /* renamed from: i  reason: collision with root package name */
    private TuxIconView f101092i;

    /* renamed from: j  reason: collision with root package name */
    private final am f101093j;

    static {
        Covode.recordClassIndex(64670);
    }

    public ChatTopTip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(140, new org.greenrobot.eventbus.g(ChatTopTip.class, "onReceiveChatTopTipEvent", com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(141, new org.greenrobot.eventbus.g(ChatTopTip.class, "onReceiveChatControlChange", com.ss.android.ugc.aweme.setting.d.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(64672);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final m getLifecycleOwner() {
        return this.f101087d;
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        EventBus.a(EventBus.a(), this);
    }

    public static final class c implements IFollowService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatTopTip f101094a;

        static {
            Covode.recordClassIndex(64673);
        }

        private static boolean b() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFollowService.a
        public final void a() {
            k.a(new a(this));
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f101095a;

            static {
                Covode.recordClassIndex(64674);
            }

            a(c cVar) {
                this.f101095a = cVar;
            }

            public final void run() {
                TuxTextView tuxTextView = this.f101095a.f101094a.f101086b;
                if (tuxTextView != null) {
                    tuxTextView.setText(R.string.cev);
                }
                TuxTextView tuxTextView2 = this.f101095a.f101094a.f101086b;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(52);
                }
                this.f101095a.f101094a.setVisibility(8);
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.sdk.common.data.model.a(this.f101095a.f101094a.getUid()));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(ChatTopTip chatTopTip) {
            this.f101094a = chatTopTip;
        }

        @Override // com.ss.android.ugc.aweme.friends.service.IFollowService.a
        public final void a(Exception exc) {
            Exception exc2;
            l.d(exc, "");
            String string = this.f101094a.getContext().getString(R.string.ceo);
            this.f101094a.getContext();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = b();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                string = this.f101094a.getContext().getString(R.string.de8);
            } else {
                if (!(exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    exc2 = null;
                } else {
                    exc2 = exc;
                }
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
                if (aVar != null) {
                    String errorMsg = aVar.getErrorMsg();
                    l.b(errorMsg, "");
                    if (errorMsg.length() > 0) {
                        string = aVar.getErrorMsg();
                    }
                }
                Throwable cause = exc.getCause();
                if (!(cause instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    cause = null;
                }
                com.ss.android.ugc.aweme.base.api.a.b.a aVar2 = (com.ss.android.ugc.aweme.base.api.a.b.a) cause;
                if (aVar2 != null) {
                    String errorMsg2 = aVar2.getErrorMsg();
                    l.b(errorMsg2, "");
                    if (errorMsg2.length() > 0) {
                        string = aVar2.getErrorMsg();
                    }
                }
            }
            new com.bytedance.tux.g.b(this.f101094a).a(string).b();
        }
    }

    public final String getSecUid() {
        String secUid;
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101085a;
        if (!(aVar instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a)) {
            return "";
        }
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        IMUser fromUser = ((com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a) aVar).getFromUser();
        if (fromUser == null || (secUid = fromUser.getSecUid()) == null) {
            return "";
        }
        return secUid;
    }

    public final String getUid() {
        String uid;
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101085a;
        if (!(aVar instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a)) {
            return "";
        }
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        IMUser fromUser = ((com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a) aVar).getFromUser();
        if (fromUser == null || (uid = fromUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        androidx.lifecycle.i lifecycle;
        EventBus.a().b(this);
        m mVar = this.f101087d;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.b(this);
        }
        an.b(this.f101093j);
    }

    private final void c() {
        MethodCollector.i(4006);
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.a4d, this);
        this.f101091h = (TextView) findViewById(R.id.bk8);
        this.f101092i = (TuxIconView) findViewById(R.id.bk9);
        MethodCollector.o(4006);
    }

    private final void b() {
        MethodCollector.i(4003);
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.a4e, this);
        this.f101089f = (TextView) findViewById(R.id.epa);
        this.f101086b = (TuxTextView) findViewById(R.id.eod);
        this.f101090g = (AvatarImageView) findViewById(R.id.eo3);
        setVisibility(0);
        TuxTextView tuxTextView = this.f101086b;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new g(this));
            tuxTextView.setText(R.string.byt);
            tuxTextView.setTuxFont(62);
            MethodCollector.o(4003);
            return;
        }
        MethodCollector.o(4003);
    }

    public final void a() {
        String str;
        IMNoticeMsgStruct noticeMsgStruct;
        Integer msgType;
        IMNoticeMsgStruct noticeMsgStruct2;
        if (getVisibility() == 0) {
            ImChatTopTipModel imChatTopTipModel = this.f101088e;
            String str2 = null;
            if (imChatTopTipModel == null || (noticeMsgStruct2 = imChatTopTipModel.getNoticeMsgStruct()) == null || (str = noticeMsgStruct2.getNoticeCode()) == null) {
                str = "";
            }
            ImChatTopTipModel imChatTopTipModel2 = this.f101088e;
            if (imChatTopTipModel2 != null && (noticeMsgStruct = imChatTopTipModel2.getNoticeMsgStruct()) != null && (msgType = noticeMsgStruct.getMsgType()) != null && msgType.intValue() == 1026) {
                com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101085a;
                if (aVar != null) {
                    str2 = aVar.getConversationId();
                }
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.c.a.a(str, str2, 1);
                removeAllViews();
                setVisibility(8);
            }
        }
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(64671);
        }

        public a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(h.c.f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.e("ChatTopTip", "fetchChatTopTip error: " + th.getMessage());
        }
    }

    public final void setLifecycleOwner(m mVar) {
        this.f101087d = mVar;
    }

    @r(a = ThreadMode.MAIN)
    public final void onReceiveChatControlChange(com.ss.android.ugc.aweme.setting.d.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar2 = this.f101085a;
        if (aVar2 != null) {
            b(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatTopTip f101098a;

        static {
            Covode.recordClassIndex(64676);
        }

        e(ChatTopTip chatTopTip) {
            this.f101098a = chatTopTip;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a.a(1, a.e.f101074a);
            this.f101098a.a();
        }
    }

    private final void a(SystemContent systemContent) {
        SystemContent.Key key;
        SystemContent.Key[] template = systemContent.getTemplate();
        if (template != null && (key = (SystemContent.Key) h.a.i.d(template)) != null && key.getAction() == 8) {
            com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(this.f101085a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatTopTip f101096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImChatTopTipModel f101097b;

        static {
            Covode.recordClassIndex(64675);
        }

        d(ChatTopTip chatTopTip, ImChatTopTipModel imChatTopTipModel) {
            this.f101096a = chatTopTip;
            this.f101097b = imChatTopTipModel;
        }

        public final void onClick(View view) {
            String noticeCode;
            ClickAgent.onClick(view);
            IMNoticeMsgStruct noticeMsgStruct = this.f101097b.getNoticeMsgStruct();
            if (!(noticeMsgStruct == null || (noticeCode = noticeMsgStruct.getNoticeCode()) == null || noticeCode.length() == 0)) {
                Set<String> stringSet = com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.a.a().getStringSet("key_notice_had_ack", ab.INSTANCE);
                Keva a2 = com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.a.a();
                stringSet.add(noticeCode);
                a2.storeStringSet("key_notice_had_ack", stringSet);
            }
            this.f101096a.removeAllViews();
            this.f101096a.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatTopTip f101099a;

        static {
            Covode.recordClassIndex(64679);
        }

        g(ChatTopTip chatTopTip) {
            this.f101099a = chatTopTip;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ChatTopTip chatTopTip = this.f101099a;
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(chatTopTip.f101085a));
            hashMap.put("enter_method", "follow_button");
            com.ss.android.ugc.aweme.common.r.a("follow", hashMap);
            FollowService.createIFollowServicebyMonsterPlugin(false).sendRequest(chatTopTip.getUid(), chatTopTip.getSecUid(), 1, new c(chatTopTip));
        }
    }

    private final void b(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        TopChatNoticePushStatus topChatNoticePushStatus;
        if (fg.a(getContext())) {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_ON;
        } else {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_OFF;
        }
        bz unused = kotlinx.coroutines.i.a(this.f101093j, bf.f159041b, null, new f(this, aVar, topChatNoticePushStatus.getStatus(), null), 2);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ int $pushStatus;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.data.a $sessionInfo;
        int label;
        final /* synthetic */ ChatTopTip this$0;

        static {
            Covode.recordClassIndex(64677);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChatTopTip chatTopTip, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = chatTopTip;
            this.$sessionInfo = aVar;
            this.$pushStatus = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.this$0, this.$sessionInfo, this.$pushStatus, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005b A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r3 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r12.label
                r4 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r1) goto L_0x0046
                if (r0 != r4) goto L_0x005c
                h.r.a(r13)
            L_0x000f:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0012:
                h.r.a(r13)
                com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r5 = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.a()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip r0 = r12.this$0
                java.lang.String r6 = r0.getUid()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip r0 = r12.this$0
                java.lang.String r7 = r0.getSecUid()
                com.ss.android.ugc.aweme.im.sdk.chat.data.a r0 = r12.$sessionInfo
                java.lang.String r8 = r0.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType r0 = com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType.DM_CHAT
                java.lang.String r9 = r0.getType()
                com.ss.android.ugc.aweme.im.sdk.chat.data.a r0 = r12.$sessionInfo
                int r10 = r0.getUnreadCount()
                int r11 = r12.$pushStatus
                kotlinx.coroutines.av r0 = r5.getTopChatNotice(r6, r7, r8, r9, r10, r11)
                r12.label = r1
                java.lang.Object r13 = r0.a(r12)
                if (r13 != r3) goto L_0x0049
                return r3
            L_0x0046:
                h.r.a(r13)
            L_0x0049:
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel r13 = (com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel) r13
                kotlinx.coroutines.android.b r2 = com.ss.android.ugc.aweme.af.a.f66269a
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$f$1 r1 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$f$1
                r0 = 0
                r1.<init>(r12, r13, r0)
                r12.label = r4
                java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r12)
                if (r0 != r3) goto L_0x000f
                return r3
            L_0x005c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onReceiveChatTopTipEvent(com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.b bVar) {
        String str;
        String tips;
        l.d(bVar, "");
        String str2 = bVar.f101080b;
        com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar = this.f101085a;
        if (aVar != null) {
            str = aVar.getConversationId();
        } else {
            str = null;
        }
        if (!(!l.a((Object) str2, (Object) str)) && (tips = bVar.f101079a.getTips()) != null && tips.length() != 0) {
            b();
            AvatarImageView avatarImageView = this.f101090g;
            if (avatarImageView != null) {
                avatarImageView.setVisibility(8);
            }
            TuxTextView tuxTextView = this.f101086b;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            a(bVar.f101079a, this.f101089f, -1, "", R.color.bx);
            com.ss.android.ugc.aweme.im.service.m.a.c("ChatTopTip", "onReceiveChatTopTipEvent, tips:" + bVar.f101079a.getTips());
        }
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar) {
        l.d(aVar, "");
        if (aVar.getSelectMsgType() == 1) {
            setVisibility(8);
            return;
        }
        this.f101085a = aVar;
        b(aVar);
    }

    public final void setTips(ImChatTopTipModel imChatTopTipModel) {
        Integer num;
        String str;
        String str2;
        Integer msgType;
        IMFromMessageTips msgContent;
        String tips;
        IMUser fromUser;
        IMFromMessageTips msgContent2;
        MethodCollector.i(4041);
        this.f101088e = imChatTopTipModel;
        if (imChatTopTipModel == null || imChatTopTipModel.getNoticeMsgStruct() == null) {
            setVisibility(8);
            MethodCollector.o(4041);
            return;
        }
        StringBuilder sb = new StringBuilder("setTips, type:");
        IMNoticeMsgStruct noticeMsgStruct = imChatTopTipModel.getNoticeMsgStruct();
        com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = null;
        if (noticeMsgStruct != null) {
            num = noticeMsgStruct.getMsgType();
        } else {
            num = null;
        }
        StringBuilder append = sb.append(num).append(", msg:");
        IMNoticeMsgStruct noticeMsgStruct2 = imChatTopTipModel.getNoticeMsgStruct();
        if (noticeMsgStruct2 == null || (msgContent2 = noticeMsgStruct2.getMsgContent()) == null) {
            str = null;
        } else {
            str = msgContent2.getTips();
        }
        com.ss.android.ugc.aweme.im.service.m.a.c("ChatTopTip", append.append(str).toString());
        IMNoticeMsgStruct noticeMsgStruct3 = imChatTopTipModel.getNoticeMsgStruct();
        if (noticeMsgStruct3 != null) {
            str2 = noticeMsgStruct3.getNoticeCode();
        } else {
            str2 = null;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        if (str2.length() != 0 && com.ss.android.ugc.aweme.im.sdk.chat.feature.top.b.a.a().getStringSet("key_notice_had_ack", ab.INSTANCE).contains(str2)) {
            setVisibility(8);
            MethodCollector.o(4041);
            return;
        }
        setVisibility(0);
        IMNoticeMsgStruct noticeMsgStruct4 = imChatTopTipModel.getNoticeMsgStruct();
        if (!(noticeMsgStruct4 == null || (msgType = noticeMsgStruct4.getMsgType()) == null)) {
            if (msgType.intValue() == 1023) {
                b();
                com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar2 = this.f101085a;
                if (aVar2 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a) {
                    aVar = aVar2;
                }
                com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar3 = aVar;
                if (aVar3 == null || (fromUser = aVar3.getFromUser()) == null) {
                    MethodCollector.o(4041);
                    return;
                }
                AvatarImageView avatarImageView = this.f101090g;
                if (avatarImageView != null) {
                    avatarImageView.setVisibility(0);
                }
                TuxTextView tuxTextView = this.f101086b;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                com.ss.android.ugc.aweme.base.e.a(this.f101090g, fromUser.getDisplayAvatar());
                a(ImChatTopTipModelKt.toSystemContent(imChatTopTipModel), this.f101089f, msgType.intValue(), "", R.color.bx);
                u a2 = new u().a(com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a(this.f101085a));
                a2.f109597b = u.a.SHOW;
                User user = new User();
                user.setUid(fromUser.getUid());
                user.setFollowStatus(fromUser.getFollowStatus());
                a2.a(user).f();
                MethodCollector.o(4041);
                return;
            } else if (msgType.intValue() == 1022) {
                b();
                AvatarImageView avatarImageView2 = this.f101090g;
                if (avatarImageView2 != null) {
                    avatarImageView2.setVisibility(8);
                }
                TuxTextView tuxTextView2 = this.f101086b;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                }
                SystemContent systemContent = ImChatTopTipModelKt.toSystemContent(imChatTopTipModel);
                a(systemContent, this.f101089f, msgType.intValue(), "", R.color.bx);
                a(systemContent);
                MethodCollector.o(4041);
                return;
            } else if (msgType.intValue() == 1024) {
                c();
                TextView textView = this.f101091h;
                if (textView != null) {
                    IMNoticeMsgStruct noticeMsgStruct5 = imChatTopTipModel.getNoticeMsgStruct();
                    if (!(noticeMsgStruct5 == null || (msgContent = noticeMsgStruct5.getMsgContent()) == null || (tips = msgContent.getTips()) == null)) {
                        str3 = tips;
                    }
                    textView.setText(str3);
                }
                TuxIconView tuxIconView = this.f101092i;
                if (tuxIconView != null) {
                    tuxIconView.setOnClickListener(new d(this, imChatTopTipModel));
                    MethodCollector.o(4041);
                    return;
                }
                MethodCollector.o(4041);
                return;
            } else if (msgType.intValue() == 1026) {
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.d()) {
                    View rootView = getRootView();
                    l.b(rootView, str3);
                    SafeConversationConfirmation safeConversationConfirmation = (SafeConversationConfirmation) rootView.findViewById(R.id.dcf);
                    com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar4 = this.f101085a;
                    l.d(str2, str3);
                    BottomNoticeViewModel viewModel = safeConversationConfirmation.getViewModel();
                    l.d(str2, str3);
                    viewModel.f101058a = aVar4;
                    viewModel.f101059b = str2;
                    if (safeConversationConfirmation.f101061a) {
                        safeConversationConfirmation.setVisibility(0);
                    } else {
                        safeConversationConfirmation.f101061a = true;
                        View.inflate(safeConversationConfirmation.getContext(), R.layout.a8v, safeConversationConfirmation);
                        safeConversationConfirmation.getFirstButton().setTuxFont(51);
                        safeConversationConfirmation.getSecondButton().setTuxFont(52);
                        safeConversationConfirmation.setVisibility(0);
                        safeConversationConfirmation.getCloseButton().setOnClickListener(new SafeConversationConfirmation.c(safeConversationConfirmation));
                        safeConversationConfirmation.getFirstButton().setOnClickListener(new SafeConversationConfirmation.d(safeConversationConfirmation));
                        safeConversationConfirmation.getSecondButton().setOnClickListener(new SafeConversationConfirmation.e(safeConversationConfirmation));
                    }
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a.a();
                } else if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.c()) {
                    c();
                    AvatarImageView avatarImageView3 = this.f101090g;
                    if (avatarImageView3 != null) {
                        avatarImageView3.setVisibility(8);
                    }
                    TuxTextView tuxTextView3 = this.f101086b;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    }
                    SystemContent systemContent2 = ImChatTopTipModelKt.toSystemContent(imChatTopTipModel);
                    a(systemContent2, this.f101091h, msgType.intValue(), str2, R.color.bd);
                    a(systemContent2);
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.top.a.a.a();
                    TuxIconView tuxIconView2 = this.f101092i;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setOnClickListener(new e(this));
                        MethodCollector.o(4041);
                        return;
                    }
                    MethodCollector.o(4041);
                    return;
                } else {
                    setVisibility(8);
                    MethodCollector.o(4041);
                    return;
                }
            }
        }
        setVisibility(8);
        MethodCollector.o(4041);
    }

    private /* synthetic */ ChatTopTip(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChatTopTip(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        androidx.lifecycle.i lifecycle;
        l.d(context, "");
        MethodCollector.i(4100);
        this.f101093j = an.a(new a(CoroutineExceptionHandler.f158926c));
        setVisibility(8);
        Activity a2 = bg.a(context);
        m mVar = (m) (!(a2 instanceof m) ? null : a2);
        this.f101087d = mVar;
        if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
            MethodCollector.o(4100);
            return;
        }
        lifecycle.a(this);
        MethodCollector.o(4100);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(SystemContent systemContent, TextView textView, int i2, String str, int i3) {
        com.ss.android.ugc.aweme.im.sdk.chat.b.d.a(this, null, systemContent, textView, getUid(), getSecUid(), androidx.core.content.b.c(getContext(), i3), androidx.core.content.b.c(getContext(), R.color.c9), true, i2, str, this.f101085a);
    }
}
