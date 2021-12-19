package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;

public final class i extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.follow.widet.a f113630a;

    /* renamed from: b  reason: collision with root package name */
    public User f113631b;

    /* renamed from: c  reason: collision with root package name */
    public final String f113632c = "notification_page";

    /* renamed from: d  reason: collision with root package name */
    private final h f113633d;

    /* renamed from: e  reason: collision with root package name */
    private final h f113634e;

    /* renamed from: f  reason: collision with root package name */
    private final h f113635f;

    /* renamed from: g  reason: collision with root package name */
    private final h f113636g;

    /* renamed from: h  reason: collision with root package name */
    private final h f113637h;

    /* renamed from: i  reason: collision with root package name */
    private final h f113638i;

    static {
        Covode.recordClassIndex(73055);
    }

    private final ConstraintLayout f() {
        return (ConstraintLayout) this.f113633d.getValue();
    }

    public final AvatarImageWithVerify a() {
        return (AvatarImageWithVerify) this.f113634e.getValue();
    }

    public final TuxTextView b() {
        return (TuxTextView) this.f113635f.getValue();
    }

    public final TuxTextView c() {
        return (TuxTextView) this.f113636g.getValue();
    }

    public final MutualRelationView d() {
        return (MutualRelationView) this.f113637h.getValue();
    }

    public final NotificationFollowUserBtn e() {
        return (NotificationFollowUserBtn) this.f113638i.getValue();
    }

    static final class a extends m implements h.f.a.a<AvatarImageWithVerify> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.$itemView.findViewById(R.id.cx6);
        }
    }

    static final class b extends m implements h.f.a.a<NotificationFollowUserBtn> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationFollowUserBtn invoke() {
            return this.$itemView.findViewById(R.id.cx4);
        }
    }

    static final class c extends m implements h.f.a.a<MutualRelationView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.$itemView.findViewById(R.id.crv);
        }
    }

    static final class d extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.$itemView.findViewById(R.id.cxx);
        }
    }

    static final class e extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cwx);
        }
    }

    static final class f extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cxm);
        }
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(final View view) {
        super(view);
        l.d(view, "");
        this.f113633d = h.i.a((h.f.a.a) new d(view));
        this.f113634e = h.i.a((h.f.a.a) new a(view));
        this.f113635f = h.i.a((h.f.a.a) new f(view));
        this.f113636g = h.i.a((h.f.a.a) new e(view));
        this.f113637h = h.i.a((h.f.a.a) new c(view));
        this.f113638i = h.i.a((h.f.a.a) new b(view));
        ConstraintLayout f2 = f();
        l.b(f2, "");
        j.b(f2);
        g.a(e());
        f().setOnClickListener(this);
        e().setOnClickListener(this);
        com.ss.android.ugc.aweme.follow.widet.a aVar = new com.ss.android.ugc.aweme.follow.widet.a(e(), new a.g(this) {
            /* class com.ss.android.ugc.aweme.notification.h.i.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f113639a;

            static {
                Covode.recordClassIndex(73056);
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final String getEnterFrom() {
                return this.f113639a.f113632c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f113639a = r1;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
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
            @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
            public final void a(int r13, com.ss.android.ugc.aweme.profile.model.User r14) {
                /*
                // Method dump skipped, instructions count: 184
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.i.AnonymousClass1.a(int, com.ss.android.ugc.aweme.profile.model.User):void");
            }
        });
        this.f113630a = aVar;
        aVar.f96288e = new a.c(this) {
            /* class com.ss.android.ugc.aweme.notification.h.i.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f113640a;

            static {
                Covode.recordClassIndex(73057);
            }

            {
                this.f113640a = r1;
            }

            @Override // com.ss.android.ugc.aweme.follow.widet.a.c
            public final boolean a(int i2) {
                boolean z;
                Context context = view.getContext();
                User user = this.f113640a.f113631b;
                l.b(this.f113640a.e(), "");
                if (!NotificationFollowUserBtn.b() || !com.ss.android.ugc.aweme.im.service.c.d.b()) {
                    z = false;
                } else {
                    z = true;
                }
                return com.ss.android.ugc.aweme.notification.utils.h.a(context, user, null, null, "like_list", z, 12);
            }
        };
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
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
    public final void onClick(android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.i.onClick(android.view.View):void");
    }
}
