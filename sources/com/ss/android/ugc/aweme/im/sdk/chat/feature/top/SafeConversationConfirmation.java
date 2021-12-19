package com.ss.android.ugc.aweme.im.sdk.chat.feature.top;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class SafeConversationConfirmation extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f101061a;

    /* renamed from: b  reason: collision with root package name */
    private final h f101062b;

    /* renamed from: c  reason: collision with root package name */
    private final h f101063c;

    /* renamed from: d  reason: collision with root package name */
    private final h f101064d;

    /* renamed from: e  reason: collision with root package name */
    private final h f101065e;

    static {
        Covode.recordClassIndex(64650);
    }

    public SafeConversationConfirmation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View getCloseButton() {
        return (View) this.f101063c.getValue();
    }

    public final TuxButton getFirstButton() {
        return (TuxButton) this.f101064d.getValue();
    }

    public final TuxButton getSecondButton() {
        return (TuxButton) this.f101065e.getValue();
    }

    public final BottomNoticeViewModel getViewModel() {
        return (BottomNoticeViewModel) this.f101062b.getValue();
    }

    static final class g extends m implements h.f.a.a<BottomNoticeViewModel> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(64657);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ BottomNoticeViewModel invoke() {
            return new BottomNoticeViewModel(this.$context);
        }
    }

    static final class a extends m implements h.f.a.a<View> {
        final /* synthetic */ SafeConversationConfirmation this$0;

        static {
            Covode.recordClassIndex(64651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SafeConversationConfirmation safeConversationConfirmation) {
            super(0);
            this.this$0 = safeConversationConfirmation;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.bhl);
        }
    }

    static final class b extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ SafeConversationConfirmation this$0;

        static {
            Covode.recordClassIndex(64652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SafeConversationConfirmation safeConversationConfirmation) {
            super(0);
            this.this$0 = safeConversationConfirmation;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return this.this$0.findViewById(R.id.blu);
        }
    }

    static final class f extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ SafeConversationConfirmation this$0;

        static {
            Covode.recordClassIndex(64656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SafeConversationConfirmation safeConversationConfirmation) {
            super(0);
            this.this$0 = safeConversationConfirmation;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return this.this$0.findViewById(R.id.blv);
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SafeConversationConfirmation f101066a;

        static {
            Covode.recordClassIndex(64653);
        }

        public c(SafeConversationConfirmation safeConversationConfirmation) {
            this.f101066a = safeConversationConfirmation;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101066a.getViewModel().b(1);
            this.f101066a.setVisibility(8);
        }
    }

    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SafeConversationConfirmation f101068a;

        static {
            Covode.recordClassIndex(64655);
        }

        public e(SafeConversationConfirmation safeConversationConfirmation) {
            this.f101068a = safeConversationConfirmation;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BottomNoticeViewModel viewModel = this.f101068a.getViewModel();
            Context context = viewModel.f101060c;
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        Activity activity = (Activity) context;
                        if (activity != null) {
                            new com.bytedance.tux.g.b(activity).e(R.string.dn2).b();
                            viewModel.b(2);
                        }
                    }
                } else {
                    break;
                }
            }
            this.f101068a.setVisibility(8);
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SafeConversationConfirmation f101067a;

        static {
            Covode.recordClassIndex(64654);
        }

        public d(SafeConversationConfirmation safeConversationConfirmation) {
            this.f101067a = safeConversationConfirmation;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
            if (r1 == null) goto L_0x0016;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation r0 = r4.f101067a
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel r3 = r0.getViewModel()
                android.content.Context r2 = r3.f101060c
            L_0x000b:
                r0 = 0
                if (r2 == 0) goto L_0x0016
                boolean r0 = r2 instanceof android.app.Activity
                if (r0 == 0) goto L_0x0045
                android.app.Activity r2 = (android.app.Activity) r2
                if (r2 != 0) goto L_0x001e
            L_0x0016:
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation r1 = r4.f101067a
                r0 = 8
                r1.setVisibility(r0)
                return
            L_0x001e:
                com.ss.android.ugc.aweme.im.sdk.chat.data.a r1 = r3.f101058a
                if (r1 == 0) goto L_0x0033
                boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b
                if (r0 == 0) goto L_0x0038
                java.lang.String r0 = r1.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a r1 = com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(r0)
            L_0x002e:
                java.lang.String r0 = "5"
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(r1, r2, r0)
            L_0x0033:
                r0 = 3
                r3.b(r0)
                goto L_0x0016
            L_0x0038:
                boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a r1 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a) r1
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a r1 = com.ss.android.ugc.aweme.im.sdk.chat.b.c.g.a(r1)
                if (r1 != 0) goto L_0x002e
                goto L_0x0016
            L_0x0045:
                boolean r0 = r2 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L_0x0016
                android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
                android.content.Context r2 = r2.getBaseContext()
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation.d.onClick(android.view.View):void");
        }
    }

    private /* synthetic */ SafeConversationConfirmation(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SafeConversationConfirmation(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6445);
        this.f101062b = i.a((h.f.a.a) new g(context));
        this.f101063c = i.a((h.f.a.a) new a(this));
        this.f101064d = i.a((h.f.a.a) new b(this));
        this.f101065e = i.a((h.f.a.a) new f(this));
        MethodCollector.o(6445);
    }
}
