package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.GroupShareCardView;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupSharePackage;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f101563c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f101564a = i.a((h.f.a.a) new C2525b(this));

    /* renamed from: b  reason: collision with root package name */
    public String f101565b;

    /* renamed from: d  reason: collision with root package name */
    private final h f101566d = i.a((h.f.a.a) new e(this));

    /* renamed from: e  reason: collision with root package name */
    private HashMap f101567e;

    static {
        Covode.recordClassIndex(64937);
    }

    public final View a(int i2) {
        if (this.f101567e == null) {
            this.f101567e = new HashMap();
        }
        View view = (View) this.f101567e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f101567e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final GroupShareViewModel a() {
        return (GroupShareViewModel) this.f101566d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64938);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v4, types: [androidx.fragment.app.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(java.lang.String r4, androidx.appcompat.app.d r5) {
            /*
                java.lang.String r0 = ""
                h.f.b.l.d(r4, r0)
                if (r5 != 0) goto L_0x0014
                android.app.Activity r5 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a()
                boolean r0 = r5 instanceof androidx.appcompat.app.d
                if (r0 != 0) goto L_0x0010
                r5 = 0
            L_0x0010:
                androidx.fragment.app.e r5 = (androidx.fragment.app.e) r5
                if (r5 == 0) goto L_0x001a
            L_0x0014:
                androidx.fragment.app.i r3 = r5.getSupportFragmentManager()
                if (r3 != 0) goto L_0x001b
            L_0x001a:
                return
            L_0x001b:
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b r2 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b
                r2.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                java.lang.String r0 = "conversation_id"
                r1.putString(r0, r4)
                r2.setArguments(r1)
                com.bytedance.tux.sheet.sheet.a$a r0 = new com.bytedance.tux.sheet.sheet.a$a
                r0.<init>()
                com.bytedance.tux.sheet.sheet.a$a r1 = r0.a(r2)
                r0 = 1
                com.bytedance.tux.sheet.sheet.a$a r0 = r1.a(r0)
                com.bytedance.tux.sheet.sheet.a r1 = r0.f45299a
                java.lang.String r0 = "shareGroupInvite"
                r1.show(r3, r0)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b.a.a(java.lang.String, androidx.appcompat.app.d):void");
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f101567e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$b  reason: collision with other inner class name */
    static final class C2525b extends m implements h.f.a.a<GroupShareChannelDelegate> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2525b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GroupShareChannelDelegate invoke() {
            PowerList powerList = (PowerList) this.this$0.a(R.id.e0o);
            l.b(powerList, "");
            return new GroupShareChannelDelegate(powerList);
        }
    }

    public final void b() {
        TuxDualBallView tuxDualBallView = (TuxDualBallView) a(R.id.chl);
        tuxDualBallView.setVisibility(0);
        tuxDualBallView.b();
        TuxStatusView tuxStatusView = (TuxStatusView) a(R.id.e_o);
        l.b(tuxStatusView, "");
        tuxStatusView.setVisibility(8);
    }

    static final class e extends m implements h.f.a.a<GroupShareViewModel> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(64943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GroupShareViewModel invoke() {
            b bVar = this.this$0;
            String str = bVar.f101565b;
            if (str == null) {
                l.a("conversationId");
            }
            l.d(bVar, "");
            l.d(str, "");
            ac a2 = ae.a(bVar, new com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.a(str)).a(GroupShareViewModel.class);
            l.b(a2, "");
            GroupShareViewModel groupShareViewModel = (GroupShareViewModel) a2;
            groupShareViewModel.f102689b.observe(this.this$0, new a(this));
            groupShareViewModel.f102690c.observe(this.this$0, new C2526b(this));
            groupShareViewModel.f102691d.observe(this.this$0, new c(this));
            return groupShareViewModel;
        }

        static final class c<T> implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f101572a;

            static {
                Covode.recordClassIndex(64946);
            }

            c(e eVar) {
                this.f101572a = eVar;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(java.lang.Object r2) {
                /*
                    r1 = this;
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    java.lang.String r0 = ""
                    h.f.b.l.b(r2, r0)
                    boolean r0 = r2.booleanValue()
                    if (r0 == 0) goto L_0x0014
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e r0 = r1.f101572a
                    com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b r0 = r0.this$0
                    com.bytedance.tux.sheet.sheet.a.b.a(r0)
                L_0x0014:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b.e.c.onChanged(java.lang.Object):void");
            }
        }

        static final class a<T> implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f101570a;

            static {
                Covode.recordClassIndex(64944);
            }

            a(e eVar) {
                this.f101570a = eVar;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                String str;
                String str2;
                String str3;
                com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b bVar = (com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b) obj;
                b bVar2 = this.f101570a.this$0;
                com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar = null;
                r7 = null;
                String str4 = null;
                if (bVar != null) {
                    if (bVar.f102667e == null) {
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.a aVar = (com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.a) bVar2.a(R.id.bd8);
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar2 = bVar.f102666d;
                        if (aVar2 != null) {
                            str2 = aVar2.getAvatarUrl();
                        } else {
                            str2 = null;
                        }
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar3 = bVar.f102666d;
                        if (aVar3 != null) {
                            str3 = aVar3.getName();
                        } else {
                            str3 = null;
                        }
                        Long l2 = bVar.f102665c;
                        if (l2 != null) {
                            String format = new SimpleDateFormat("MM/dd/yyyy", Locale.US).format(new Date(l2.longValue() * 1000));
                            Context context = bVar2.getContext();
                            if (context != null) {
                                str4 = context.getString(R.string.c96, format);
                            }
                        }
                        aVar.a(str2, str3, str4);
                        return;
                    }
                    cVar = bVar.f102667e;
                }
                Context context2 = bVar2.getContext();
                if (context2 != null) {
                    l.b(context2, "");
                    TuxDualBallView tuxDualBallView = (TuxDualBallView) bVar2.a(R.id.chl);
                    tuxDualBallView.c();
                    tuxDualBallView.setVisibility(8);
                    TuxStatusView.c cVar2 = new TuxStatusView.c();
                    if (cVar == null || (str = cVar.f102670c) == null) {
                        String string = context2.getString(R.string.c9t);
                        l.b(string, "");
                        cVar2.a((CharSequence) string);
                        cVar2.f45362j = new c(bVar2, cVar2, context2);
                    } else {
                        cVar2.a((CharSequence) str);
                    }
                    ((TuxStatusView) bVar2.a(R.id.e_o)).setStatus(cVar2);
                    TuxStatusView tuxStatusView = (TuxStatusView) bVar2.a(R.id.e_o);
                    l.b(tuxStatusView, "");
                    tuxStatusView.setVisibility(0);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b$e$b  reason: collision with other inner class name */
        static final class C2526b<T> implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f101571a;

            static {
                Covode.recordClassIndex(64945);
            }

            C2526b(e eVar) {
                this.f101571a = eVar;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                com.ss.android.ugc.aweme.sharer.ui.e eVar = (com.ss.android.ugc.aweme.sharer.ui.e) obj;
                GroupShareChannelDelegate groupShareChannelDelegate = (GroupShareChannelDelegate) this.f101571a.this$0.f101564a.getValue();
                l.b(eVar, "");
                l.d(eVar, "");
                SharePackage sharePackage = eVar.f124657i;
                Objects.requireNonNull(sharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupSharePackage");
                GroupSharePackage groupSharePackage = (GroupSharePackage) sharePackage;
                Iterator<T> it = eVar.f124649a.iterator();
                while (it.hasNext()) {
                    groupShareChannelDelegate.f102671a.getState().a(new GroupShareChannelDelegate.a(it.next(), groupSharePackage));
                }
                b bVar = this.f101571a.this$0;
                TuxDualBallView tuxDualBallView = (TuxDualBallView) bVar.a(R.id.chl);
                tuxDualBallView.c();
                tuxDualBallView.setVisibility(8);
                Context context = bVar.getContext();
                if (context != null) {
                    l.b(context, "");
                    ((ConstraintLayout) bVar.a(R.id.bdd)).setBackgroundColor(androidx.core.content.b.c(context, R.color.v));
                    TuxTextView tuxTextView = (TuxTextView) bVar.a(R.id.eej);
                    l.b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    GroupShareCardView groupShareCardView = (GroupShareCardView) bVar.a(R.id.bd8);
                    l.b(groupShareCardView, "");
                    groupShareCardView.setVisibility(0);
                    PowerList powerList = (PowerList) bVar.a(R.id.e0o);
                    l.b(powerList, "");
                    powerList.setVisibility(0);
                    View a2 = bVar.a(R.id.dyy);
                    l.b(a2, "");
                    a2.setVisibility(0);
                    TuxTextView tuxTextView2 = (TuxTextView) bVar.a(R.id.a21);
                    tuxTextView2.setVisibility(0);
                    tuxTextView2.setOnClickListener(new d(bVar));
                }
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f101569a;

        static {
            Covode.recordClassIndex(64942);
        }

        d(b bVar) {
            this.f101569a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101569a.a().b();
        }
    }

    static final class c extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ Context $ctx$inlined;
        final /* synthetic */ TuxStatusView.c $status$inlined;
        final /* synthetic */ b $this_run;

        static {
            Covode.recordClassIndex(64940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, TuxStatusView.c cVar, Context context) {
            super(1);
            this.$this_run = bVar;
            this.$status$inlined = cVar;
            this.$ctx$inlined = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setText(this.$ctx$inlined.getString(R.string.cjx));
            tuxButton2.setButtonVariant(1);
            tuxButton2.setButtonStartIcon(2131232797);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f101568a;

                static {
                    Covode.recordClassIndex(64941);
                }

                {
                    this.f101568a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u.a(view, 500)) {
                        this.f101568a.$this_run.b();
                        this.f101568a.$this_run.a().a();
                    }
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        String string = arguments.getString("conversation_id");
        if (string == null) {
            l.b();
        }
        this.f101565b = string;
        a().a();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.c(a().f102688a)) {
            TuxTextView tuxTextView = (TuxTextView) a(R.id.eej);
            l.b(tuxTextView, "");
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.c7m);
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        b();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a50, viewGroup, false);
    }
}
