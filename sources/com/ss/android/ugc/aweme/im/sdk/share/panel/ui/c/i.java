package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ab;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.utils.io;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.Objects;

public final class i extends RecyclerView.ViewHolder {

    /* renamed from: k  reason: collision with root package name */
    public static final a f103497k = new a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    private static final String f103498m = "SharePanelHeadViewHolder";
    private static final int n = com.bytedance.ies.ugc.appcontext.d.a().getResources().getDimensionPixelSize(R.dimen.ml);

    /* renamed from: a  reason: collision with root package name */
    public final TextView f103499a;

    /* renamed from: b  reason: collision with root package name */
    public final AvatarImageView f103500b;

    /* renamed from: c  reason: collision with root package name */
    public IMContact f103501c;

    /* renamed from: d  reason: collision with root package name */
    public int f103502d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f103503e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f103504f;

    /* renamed from: g  reason: collision with root package name */
    public p<Boolean, String> f103505g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f103506h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f103507i;

    /* renamed from: j  reason: collision with root package name */
    public final SharePanelViewModel f103508j;

    /* renamed from: l  reason: collision with root package name */
    private final View f103509l;

    final /* synthetic */ class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f103510a;

        static {
            Covode.recordClassIndex(66324);
        }

        c(h.f.a.b bVar) {
            this.f103510a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f103510a.invoke(view), "");
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66320);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(66319);
    }

    public static final class d implements h.f.a.b<Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f103511a;

        static {
            Covode.recordClassIndex(66325);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public d(i iVar) {
            this.f103511a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            a(num.intValue());
            return z.f158842a;
        }

        public final void a(int i2) {
            if (this.f103511a.f103499a.getMaxLines() != i2) {
                this.f103511a.f103499a.setMaxLines(i2);
                if (this.f103511a.f103501c instanceof IMUser) {
                    i iVar = this.f103511a;
                    IMContact iMContact = iVar.f103501c;
                    Objects.requireNonNull(iMContact, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    iVar.a((IMUser) iMContact);
                } else if (this.f103511a.f103501c instanceof IMConversation) {
                    i iVar2 = this.f103511a;
                    IMContact iMContact2 = iVar2.f103501c;
                    Objects.requireNonNull(iMContact2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMConversation");
                    iVar2.a((IMConversation) iMContact2);
                }
            }
        }
    }

    public final void a(IMConversation iMConversation) {
        String str;
        TextView textView = this.f103499a;
        String displayName = iMConversation.getDisplayName();
        if (displayName == null || displayName.length() == 0) {
            str = "";
        } else {
            str = iMConversation.getDisplayName();
        }
        textView.setText(str);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(66321);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            final AnonymousClass1 r4 = new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(66322);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    a();
                    return z.f158842a;
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
                public final void a() {
                    /*
                    // Method dump skipped, instructions count: 120
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i.b.AnonymousClass1.a():void");
                }
            };
            SharePackage sharePackage = this.this$0.f103508j.f103597d;
            if (sharePackage != null) {
                Context context = view2.getContext();
                l.b(context, "");
                sharePackage.a(context, (com.ss.android.ugc.aweme.sharer.b) null, new h.f.a.a<z>() {
                    /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.i.b.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(66323);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        r4.a();
                        return z.f158842a;
                    }
                });
            } else {
                r4.a();
            }
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        int i2;
        this.f103503e = z;
        this.f103509l.setSelected(z);
        View view = this.f103509l;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void a(IMUser iMUser) {
        boolean z;
        SpannableStringBuilder a2;
        TextView textView = this.f103499a;
        String displayName = iMUser.getDisplayName();
        boolean z2 = false;
        if (displayName == null || displayName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a2 = "";
        } else {
            String displayName2 = iMUser.getDisplayName();
            l.b(displayName2, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.d.a(displayName2));
            TextPaint paint = this.f103499a.getPaint();
            l.b(paint, "");
            a2 = ab.a(spannableStringBuilder, paint, n, this.f103499a.getMaxLines());
        }
        textView.setText(a2);
        String a3 = h.m.p.a(this.f103499a.getText().toString(), "\n", "");
        if ((!l.a((Object) iMUser.getDisplayName(), (Object) a3)) && h.m.p.c(a3, "...", false)) {
            z2 = true;
        }
        io.a(this.f103499a.getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.f103499a, z2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        l.d(view, "");
        l.d(sharePanelViewModel, "");
        this.f103508j = sharePanelViewModel;
        View findViewById = view.findViewById(R.id.csg);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f103499a = textView;
        View findViewById2 = view.findViewById(R.id.pf);
        l.b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f103500b = avatarImageView;
        View findViewById3 = view.findViewById(R.id.beh);
        l.b(findViewById3, "");
        this.f103509l = findViewById3;
        b bVar = new b(this);
        avatarImageView.setOnClickListener(new c(bVar));
        textView.setOnClickListener(new c(bVar));
    }
}
