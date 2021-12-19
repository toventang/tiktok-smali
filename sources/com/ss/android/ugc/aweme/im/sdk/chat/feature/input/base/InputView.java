package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.im.core.d.ai;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.EmojiContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.a;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.ui.ReplyMessageLayout;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.view.SearchableEditText;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;

public final class InputView extends BaseInputView implements TextWatcher, View.OnClickListener, a {

    /* renamed from: m  reason: collision with root package name */
    public static final String f100690m = InputView.class.getSimpleName();
    public static final a n = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public ViewGroup f100691j;

    /* renamed from: k  reason: collision with root package name */
    public final ChatViewModel f100692k;

    /* renamed from: l  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.data.a f100693l;
    private final h.h o = h.i.a((h.f.a.a) new c(this));
    private final h.h p = h.i.a((h.f.a.a) new j(this));
    private final h.h q = h.i.a((h.f.a.a) new d(this));
    private com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b r;
    private TuxIconView s;
    private ReplyMessageLayout t;
    private boolean u;
    private boolean v = true;
    private final b w;
    private final boolean x;
    private final WeakReference<Fragment> y;

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64412);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f100694a;

        static {
            Covode.recordClassIndex(64413);
        }

        public final void run() {
            this.f100694a = SystemClock.elapsedRealtime();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void o() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b.a("chat");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void p() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.a.b.b("chat");
    }

    static final class c extends m implements h.f.a.a<Integer> {
        final /* synthetic */ InputView this$0;

        static {
            Covode.recordClassIndex(64414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(InputView inputView) {
            super(0);
            this.this$0 = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.f.b(this.this$0.i().getResources(), R.color.c5, null));
        }
    }

    static final class d extends m implements h.f.a.a<Integer> {
        final /* synthetic */ InputView this$0;

        static {
            Covode.recordClassIndex(64415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(InputView inputView) {
            super(0);
            this.this$0 = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.f.b(this.this$0.i().getResources(), R.color.c5, null));
        }
    }

    static final class j extends m implements h.f.a.a<Integer> {
        final /* synthetic */ InputView this$0;

        static {
            Covode.recordClassIndex(64421);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(InputView inputView) {
            super(0);
            this.this$0 = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.f.b(this.this$0.i().getResources(), R.color.bx, null));
        }
    }

    static {
        Covode.recordClassIndex(64411);
    }

    private final void v() {
        if (!this.v) {
            a().setVisibility(8);
        }
        if (!this.u) {
            b().setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void j() {
        super.j();
        SearchableEditText a2 = a();
        a2.removeTextChangedListener(this);
        a2.addTextChangedListener(this);
        TuxIconView tuxIconView = this.s;
        if (tuxIconView == null) {
            l.a("shareBtn");
        }
        tuxIconView.setOnClickListener(this);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void q() {
        Editable text = a().getText();
        if (text != null) {
            l.b(text, "");
            ChatViewModel chatViewModel = this.f100692k;
            if (chatViewModel != null) {
                chatViewModel.a(text, this.f100693l.getConversationId());
            }
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b("enter_from", "chat");
            m();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final boolean r() {
        if (e().a()) {
            n();
            return false;
        }
        if (i() instanceof ChatRoomActivity) {
            Context i2 = i();
            Objects.requireNonNull(i2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) i2).finish();
        }
        return false;
    }

    public final void s() {
        a().setHint(i().getString(R.string.cf7));
        ReplyMessageLayout replyMessageLayout = this.t;
        if (replyMessageLayout == null) {
            l.a("replyLayout");
        }
        replyMessageLayout.setVisibility(8);
    }

    public final void t() {
        for (Context i2 = i(); i2 != null; i2 = ((ContextWrapper) i2).getBaseContext()) {
            if (i2 instanceof Activity) {
                Activity activity = (Activity) i2;
                if (activity != null && com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(activity)) {
                    new com.bytedance.tux.g.b(activity).e(R.string.b9n).b();
                    return;
                }
                return;
            } else if (!(i2 instanceof ContextWrapper)) {
                return;
            }
        }
    }

    private final boolean u() {
        if ((this.f100693l.isAuthorSupporterChat() && com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.b()) || this.f100693l.isGroupChat()) {
            return false;
        }
        IMUser a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.g.a(String.valueOf(b.a.c(this.f100693l.getConversationId())), com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.a(this.f100693l.getConversationId()));
        if (a2 == null) {
            return true;
        }
        if (a2.getFollowStatus() == 2 || com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a(a2)) {
            return false;
        }
        return true;
    }

    public static final class h implements b.AbstractC2495b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputView f100702a;

        static {
            Covode.recordClassIndex(64419);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(InputView inputView) {
            this.f100702a = inputView;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.b.AbstractC2495b
        public final void a(Aweme aweme, b.c cVar) {
            l.d(aweme, "");
            l.d(cVar, "");
            ChatViewModel chatViewModel = this.f100702a.f100692k;
            if (chatViewModel != null) {
                String str = cVar.f100826a;
                String conversationId = this.f100702a.f100693l.getConversationId();
                l.d(aweme, "");
                l.d(str, "");
                l.d(conversationId, "");
                chatViewModel.f101492a = 101;
                chatViewModel.f101495d.setValue(new a.c(Integer.valueOf(chatViewModel.f101492a)));
                g.a.a().b(conversationId).a(ShareAwemeContent.fromAweme(aweme, str)).a(new ChatViewModel.e(chatViewModel));
            }
        }
    }

    private static /* synthetic */ ViewGroup a(InputView inputView) {
        ViewGroup viewGroup = inputView.f100691j;
        if (viewGroup == null) {
            l.a("inputRootLayout");
        }
        return viewGroup;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a
    public final void b(int i2) {
        ViewGroup viewGroup = this.f100691j;
        if (viewGroup == null) {
            l.a("inputRootLayout");
        }
        viewGroup.setVisibility(i2);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InputView f100696a;

        static {
            Covode.recordClassIndex(64416);
        }

        e(InputView inputView) {
            this.f100696a = inputView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = InputView.f100690m;
            l.b(str, "");
            com.ss.android.ugc.aweme.im.service.m.a.c(str, "Reply closed");
            ChatViewModel chatViewModel = this.f100696a.f100692k;
            if (chatViewModel != null) {
                chatViewModel.a(null);
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f100700a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InputView f100701b;

        static {
            Covode.recordClassIndex(64418);
        }

        g(Fragment fragment, InputView inputView) {
            this.f100700a = fragment;
            this.f100701b = inputView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a) obj;
            if (!(aVar instanceof a.d)) {
                aVar = null;
            }
            a.d dVar = (a.d) aVar;
            if (dVar == null || (t = dVar.f102463a) == null) {
                this.f100701b.s();
            } else {
                this.f100701b.b((ai) t);
            }
        }
    }

    private final void a(List<? extends com.ss.android.ugc.aweme.emoji.g.a> list) {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b bVar = this.r;
        if (bVar == null) {
            l.a("emojiSearchView");
        }
        bVar.a(list);
    }

    private final void c(boolean z) {
        int i2;
        if (this.x) {
            TuxIconView tuxIconView = this.s;
            if (tuxIconView == null) {
                l.a("shareBtn");
            }
            boolean isActivated = tuxIconView.isActivated();
            TuxIconView tuxIconView2 = this.s;
            if (tuxIconView2 == null) {
                l.a("shareBtn");
            }
            tuxIconView2.setActivated(z);
            TuxIconView tuxIconView3 = this.s;
            if (tuxIconView3 == null) {
                l.a("shareBtn");
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView3.setVisibility(i2);
            if (z && !isActivated) {
                TuxIconView tuxIconView4 = this.s;
                if (tuxIconView4 == null) {
                    l.a("shareBtn");
                }
                com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.b.a(tuxIconView4);
            }
        }
    }

    private final void d(boolean z) {
        int i2;
        int i3;
        boolean isActivated = c().isActivated();
        c().setActivated(z);
        if (this.x) {
            TuxIconView c2 = c();
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            c2.setVisibility(i3);
        }
        TuxIconView c3 = c();
        if (z) {
            i2 = R.attr.ay;
        } else {
            i2 = R.attr.bd;
        }
        c3.setTintColorRes(i2);
        if (z && !isActivated) {
            com.ss.android.ugc.aweme.im.sdk.common.ui.widget.a.b.a(c());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final a.b a(a.b bVar) {
        l.d(bVar, "");
        return bVar.f().c().d();
    }

    public final void b(ai aiVar) {
        a().setHint(i().getString(R.string.cf4));
        ReplyMessageLayout replyMessageLayout = this.t;
        if (replyMessageLayout == null) {
            l.a("replyLayout");
        }
        replyMessageLayout.setReplyMessage(aiVar);
        ReplyMessageLayout replyMessageLayout2 = this.t;
        if (replyMessageLayout2 == null) {
            l.a("replyLayout");
        }
        replyMessageLayout2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void a(int i2) {
        super.a(i2);
        com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b bVar = this.r;
        if (bVar == null) {
            l.a("emojiSearchView");
        }
        bVar.a(null);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void b(boolean z) {
        int intValue;
        if (this.f100677g != z) {
            super.b(z);
            SearchableEditText a2 = a();
            if (z) {
                intValue = ((Number) this.o.getValue()).intValue();
            } else {
                intValue = ((Number) this.q.getValue()).intValue();
            }
            a2.setHintTextColor(intValue);
            a().setTextColor(((Number) this.p.getValue()).intValue());
            d().setBackgroundResource(R.drawable.aqn);
            v();
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChatViewModel f100697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f100698b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InputView f100699c;

        static {
            Covode.recordClassIndex(64417);
        }

        f(ChatViewModel chatViewModel, Fragment fragment, InputView inputView) {
            this.f100697a = chatViewModel;
            this.f100698b = fragment;
            this.f100699c = inputView;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Activity activity;
            androidx.fragment.app.i supportFragmentManager;
            com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a) obj;
            if (aVar instanceof a.c) {
                com.ss.android.ugc.aweme.im.sdk.chat.feature.story.b.a(this.f100699c.f100693l.getConversationId(), "");
                return;
            }
            Activity activity2 = null;
            r2 = null;
            Fragment fragment = null;
            r2 = null;
            Activity activity3 = null;
            activity2 = null;
            if (aVar instanceof a.d) {
                if (this.f100697a.f101492a == 101) {
                    Context i2 = this.f100699c.i();
                    while (true) {
                        if (i2 != null) {
                            if (!(i2 instanceof Activity)) {
                                if (!(i2 instanceof ContextWrapper)) {
                                    break;
                                }
                                i2 = ((ContextWrapper) i2).getBaseContext();
                            } else {
                                activity = (Activity) i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    activity = null;
                    if (!(activity instanceof androidx.fragment.app.e)) {
                        activity = null;
                    }
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) activity;
                    if (!(eVar == null || (supportFragmentManager = eVar.getSupportFragmentManager()) == null)) {
                        fragment = supportFragmentManager.a(InputView.f100690m);
                    }
                    androidx.fragment.app.d dVar = (androidx.fragment.app.d) fragment;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                }
            } else if (aVar instanceof a.C2572a) {
                int i3 = this.f100697a.f101493b;
                if (i3 == 1) {
                    Context i4 = this.f100699c.i();
                    while (true) {
                        if (i4 != null) {
                            if (!(i4 instanceof Activity)) {
                                if (!(i4 instanceof ContextWrapper)) {
                                    break;
                                }
                                i4 = ((ContextWrapper) i4).getBaseContext();
                            } else {
                                activity2 = (Activity) i4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.e.a(activity2);
                } else if (i3 == 2) {
                    Context i5 = this.f100699c.i();
                    while (true) {
                        if (i5 != null) {
                            if (!(i5 instanceof Activity)) {
                                if (!(i5 instanceof ContextWrapper)) {
                                    break;
                                }
                                i5 = ((ContextWrapper) i5).getBaseContext();
                            } else {
                                activity3 = (Activity) i5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.e.b(activity3);
                } else if (i3 == 3) {
                    T t = ((a.C2572a) aVar).f102459a;
                    String str = InputView.f100690m;
                    l.b(str, "");
                    com.ss.android.ugc.aweme.im.service.m.a.b(str, "onSendFailure: ".concat(String.valueOf(t)));
                } else if (i3 == 102) {
                    this.f100699c.t();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.bq8);
        l.b(findViewById, "");
        this.f100691j = (ViewGroup) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.coq);
        l.b(findViewById2, "");
        a((SearchableEditText) findViewById2);
        View findViewById3 = viewGroup.findViewById(R.id.aso);
        l.b(findViewById3, "");
        a(findViewById3);
        View findViewById4 = viewGroup.findViewById(R.id.av5);
        l.b(findViewById4, "");
        a((TuxIconView) findViewById4);
        View findViewById5 = viewGroup.findViewById(R.id.dyg);
        l.b(findViewById5, "");
        b((TuxIconView) findViewById5);
        View findViewById6 = viewGroup.findViewById(R.id.e2c);
        l.b(findViewById6, "");
        this.s = (TuxIconView) findViewById6;
        View findViewById7 = viewGroup.findViewById(R.id.d1k);
        l.b(findViewById7, "");
        a((SoftInputResizeFuncLayoutView) findViewById7);
        View findViewById8 = viewGroup.findViewById(R.id.dl8);
        l.b(findViewById8, "");
        this.t = (ReplyMessageLayout) findViewById8;
        if (this.x) {
            c().setVisibility(8);
            TuxIconView tuxIconView = this.s;
            if (tuxIconView == null) {
                l.a("shareBtn");
            }
            tuxIconView.setVisibility(0);
        } else {
            c().setVisibility(0);
            TuxIconView tuxIconView2 = this.s;
            if (tuxIconView2 == null) {
                l.a("shareBtn");
            }
            tuxIconView2.setVisibility(8);
        }
        ((TextView) viewGroup.findViewById(R.id.f00)).setVisibility(8);
        ((RecyclerView) viewGroup.findViewById(R.id.dre)).setVisibility(8);
        ViewGroup viewGroup2 = this.f100691j;
        if (viewGroup2 == null) {
            l.a("inputRootLayout");
        }
        this.r = new com.ss.android.ugc.aweme.im.sdk.chat.feature.input.b.b.b.b(this, viewGroup2, this.f100693l.getConversationId());
        v();
        k();
        ReplyMessageLayout replyMessageLayout = this.t;
        if (replyMessageLayout == null) {
            l.a("replyLayout");
        }
        replyMessageLayout.setCloseButtonOnClick(new e(this));
        super.a(viewGroup);
    }

    public final void afterTextChanged(Editable editable) {
        int i2;
        boolean z;
        l.d(editable, "");
        String obj = editable.toString();
        boolean z2 = true;
        int length = obj.length() - 1;
        int i3 = 0;
        boolean z3 = false;
        while (i3 <= length) {
            if (!z3) {
                i2 = i3;
            } else {
                i2 = length;
            }
            if (l.a(obj.charAt(i2), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                if (!z) {
                    break;
                }
                length--;
            } else if (!z) {
                z3 = true;
            } else {
                i3++;
            }
        }
        if (TextUtils.isEmpty(obj.subSequence(i3, length + 1).toString())) {
            f().a(false);
            c(true);
            d(false);
        } else {
            f().a(true);
            c(false);
            d(true);
        }
        v();
        b bVar = this.w;
        if (editable.length() <= 0) {
            z2 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = bVar.f100694a + InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        if (j2 <= elapsedRealtime || !z2) {
            bVar.f100694a = elapsedRealtime;
            return;
        }
        a(InputView.this).removeCallbacks(bVar);
        a(InputView.this).postDelayed(bVar, j2 - elapsedRealtime);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.a
    public final void a(ai aiVar) {
        l.d(aiVar, "");
        a(-2);
        ChatViewModel chatViewModel = this.f100692k;
        if (chatViewModel != null) {
            chatViewModel.a(aiVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0112 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView.onClick(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b
    public final void a(com.ss.android.ugc.aweme.emoji.b.a aVar) {
        l.d(aVar, "");
        ChatViewModel chatViewModel = this.f100692k;
        if (chatViewModel != null) {
            boolean u2 = u();
            String conversationId = this.f100693l.getConversationId();
            l.d(aVar, "");
            l.d(conversationId, "");
            chatViewModel.f101492a = 102;
            chatViewModel.f101495d.setValue(new a.c(Integer.valueOf(chatViewModel.f101492a)));
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
            l.b(aVar2, "");
            int stickerType = aVar2.getStickerType();
            if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && u2) {
                chatViewModel.f101493b = 4;
                chatViewModel.f101495d.setValue(new a.C2572a(Integer.valueOf(chatViewModel.f101493b)));
                return;
            }
            g.a.a().b(conversationId).a(EmojiContent.obtain(aVar.f89106d)).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.b, com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView
    public final void a(String str) {
        l.d(str, "");
        super.a(str);
    }

    static final class i extends m implements q<View, com.ss.android.ugc.aweme.emoji.b.a, Integer, z> {
        final /* synthetic */ InputView this$0;

        static {
            Covode.recordClassIndex(64420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(InputView inputView) {
            super(3);
            this.this$0 = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(View view, com.ss.android.ugc.aweme.emoji.b.a aVar, Integer num) {
            com.ss.android.ugc.aweme.emoji.b.a aVar2 = aVar;
            num.intValue();
            l.d(view, "");
            l.d(aVar2, "");
            com.ss.android.ugc.aweme.emoji.g.a aVar3 = aVar2.f89106d;
            l.b(aVar3, "");
            com.ss.android.ugc.aweme.emoji.d.a.b.a(aVar3);
            this.this$0.g().a(aVar2);
            return z.f158842a;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        l.d(charSequence, "");
        Object tag = a().getTag(R.id.v);
        if (!(tag instanceof CharSequence)) {
            tag = null;
        }
        CharSequence charSequence2 = (CharSequence) tag;
        if (charSequence2 != null && TextUtils.equals(charSequence2, charSequence)) {
            a().setTag(R.id.v, null);
        } else if (com.ss.android.ugc.aweme.emoji.systembigemoji.a.b()) {
        } else {
            if (TextUtils.isEmpty(charSequence)) {
                a((List<? extends com.ss.android.ugc.aweme.emoji.g.a>) null);
            } else {
                a(com.ss.android.ugc.aweme.emoji.systembigemoji.a.a(charSequence.toString()));
            }
        }
    }

    public InputView(ViewGroup viewGroup, com.ss.android.ugc.aweme.im.sdk.chat.data.a aVar, boolean z, WeakReference<Fragment> weakReference) {
        ChatViewModel chatViewModel;
        l.d(viewGroup, "");
        l.d(aVar, "");
        l.d(weakReference, "");
        this.f100693l = aVar;
        this.x = z;
        this.y = weakReference;
        Fragment fragment = weakReference.get();
        if (fragment != null) {
            l.b(fragment, "");
            chatViewModel = ChatViewModel.a.a(fragment);
        } else {
            chatViewModel = null;
        }
        this.f100692k = chatViewModel;
        this.u = true;
        if (aVar.isAuthorSupporterChat()) {
            this.v = com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.a();
            this.u = com.ss.android.ugc.aweme.im.sdk.chat.b.c.a.c();
        }
        this.w = new b();
        a(viewGroup);
        j();
        if (h()) {
            Fragment fragment2 = weakReference.get();
            if (fragment2 != null && chatViewModel != null) {
                chatViewModel.f101495d.observe(fragment2, new f(chatViewModel, fragment2, this));
                chatViewModel.f101496e.observe(fragment2, new g(fragment2, this));
                return;
            }
            return;
        }
        throw new Exception("Call initEmojiPanel() method os base class");
    }
}
