package com.ss.android.ugc.aweme.im.sdk.group.a;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.q;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.AcceptInviteCardResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteState;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.p;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public GroupInviteViewModel f102634a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a f102635b;

    /* renamed from: c  reason: collision with root package name */
    public Set<com.bytedance.tux.dialog.a> f102636c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public final androidx.fragment.app.e f102637d;

    /* renamed from: e  reason: collision with root package name */
    private final f.a.b.a f102638e = new f.a.b.a();

    static {
        Covode.recordClassIndex(65708);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        androidx.lifecycle.i lifecycle = this.f102637d.getLifecycle();
        l.b(lifecycle, "");
        return lifecycle;
    }

    private final void a() {
        Iterator<T> it = this.f102636c.iterator();
        while (it.hasNext()) {
            it.next().dismiss();
        }
        this.f102636c.clear();
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<GroupInviteState, GroupInviteState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102639a = new a();

        static {
            Covode.recordClassIndex(65709);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ GroupInviteState invoke(GroupInviteState groupInviteState) {
            l.d(groupInviteState, "");
            return groupInviteState;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            l.d(aVar, "");
            this.this$0.f102636c.remove(aVar);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ GroupInviteViewModel a(b bVar) {
        GroupInviteViewModel groupInviteViewModel = bVar.f102634a;
        if (groupInviteViewModel == null) {
            l.a("invitationCheckViewModel");
        }
        return groupInviteViewModel;
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f102642a = new e();

        static {
            Covode.recordClassIndex(65720);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.cgn, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
            return z.f158842a;
        }
    }

    public b(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f102637d = eVar;
    }

    public final void a(String str) {
        if (str != null && str.length() != 0) {
            a();
            this.f102638e.a();
            androidx.fragment.app.e eVar = this.f102637d;
            if (str == null) {
                str = "";
            }
            GroupInviteViewModel a2 = GroupInviteViewModel.a.a(eVar, str);
            a2.a_(a.f102639a);
            this.f102634a = a2;
            f.a.j.a.a(h.a.a(this, a2, c.f102643a, (ah) null, (h.f.a.m) null, (h.f.a.b) null, new C2581b(this), 14), this.f102638e);
            GroupInviteViewModel groupInviteViewModel = this.f102634a;
            if (groupInviteViewModel == null) {
                l.a("invitationCheckViewModel");
            }
            f.a.j.a.a(h.a.a(this, groupInviteViewModel, d.f102644a, (ah) null, new d(this), (h.f.a.b) null, new c(this), 10), this.f102638e);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) q.a.a(vm1, bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.m<i, Throwable, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, Throwable th) {
            l.d(iVar, "");
            l.d(th, "");
            new com.bytedance.tux.g.b(this.this$0.f102637d).e(R.string.de2).b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.m<i, AcceptInviteCardResponse, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, AcceptInviteCardResponse acceptInviteCardResponse) {
            AcceptInviteCardResponse acceptInviteCardResponse2 = acceptInviteCardResponse;
            l.d(iVar, "");
            l.d(acceptInviteCardResponse2, "");
            if (acceptInviteCardResponse2.getInviteError() == null) {
                Integer inviteeGroupStatus = acceptInviteCardResponse2.getInviteeGroupStatus();
                if (inviteeGroupStatus != null) {
                    if (inviteeGroupStatus.intValue() == 3) {
                        b.a(this.this$0).a(this.this$0.f102637d);
                    } else if (inviteeGroupStatus.intValue() == 2) {
                        ((TuxIconView) com.a.a(LayoutInflater.from(this.this$0.f102637d), R.layout.a4o, null, false).findViewById(R.id.bkf)).setTintColor(androidx.core.content.b.c(this.this$0.f102637d, R.color.bz));
                        com.bytedance.tux.dialog.a a2 = ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(this.this$0.f102637d).a(false).b(R.string.c7s), AnonymousClass1.f102641a).a(new h.f.a.b<com.bytedance.tux.dialog.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.im.sdk.group.a.b.c.AnonymousClass2 */
                            final /* synthetic */ c this$0;

                            static {
                                Covode.recordClassIndex(65718);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
                                l.d(aVar, "");
                                this.this$0.this$0.f102636c.remove(aVar);
                                return z.f158842a;
                            }
                        })).a();
                        this.this$0.f102636c.add(a2);
                        a2.b().show();
                    }
                }
            } else {
                this.this$0.a(acceptInviteCardResponse2.getInviteError(), false);
            }
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.c cVar, boolean z) {
        String str;
        String str2 = null;
        View a2 = com.a.a(LayoutInflater.from(this.f102637d), R.layout.a4o, null, false);
        ((TuxIconView) a2.findViewById(R.id.bkf)).setTintColor(androidx.core.content.b.c(this.f102637d, R.color.bz));
        com.bytedance.tux.dialog.b bVar = (com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.c.a(this.f102637d).a(false);
        if (!(!z || (str = cVar.f102669b) == null || str.length() == 0)) {
            l.b(a2, "");
            bVar = com.bytedance.tux.dialog.e.f.a(bVar, a2, null).b(cVar.f102669b);
        }
        com.bytedance.tux.dialog.a a3 = ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(bVar.d(cVar.f102670c), e.f102642a).a(new f(this))).a();
        this.f102636c.add(a3);
        a3.b().show();
        p[] pVarArr = new p[2];
        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar = this.f102635b;
        if (aVar != null) {
            str2 = aVar.getConversationId();
        }
        pVarArr[0] = h.v.a(str2, "conversation_id");
        pVarArr[1] = h.v.a(cVar.f102668a, "error_code");
        r.a("show_invalid_share", pVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.b$b  reason: collision with other inner class name */
    public static final class C2581b extends h.f.b.m implements h.f.a.m<i, InviteCardDetailInnerResponse, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(65710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2581b(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, InviteCardDetailInnerResponse inviteCardDetailInnerResponse) {
            String str;
            String str2;
            int i2;
            int i3;
            Integer groupSize;
            Integer groupSize2;
            final InviteCardDetailInnerResponse inviteCardDetailInnerResponse2 = inviteCardDetailInnerResponse;
            l.d(iVar, "");
            l.d(inviteCardDetailInnerResponse2, "");
            this.this$0.f102635b = inviteCardDetailInnerResponse2.getGroup();
            if (inviteCardDetailInnerResponse2.getInviteError() != null) {
                this.this$0.a(inviteCardDetailInnerResponse2.getInviteError(), true);
            } else {
                Integer inviteeGroupStatus = inviteCardDetailInnerResponse2.getInviteeGroupStatus();
                if (inviteeGroupStatus != null) {
                    if (inviteeGroupStatus.intValue() == 3) {
                        b.a(this.this$0).a(this.this$0.f102637d);
                    } else if (inviteeGroupStatus.intValue() == 0 || inviteeGroupStatus.intValue() == 2 || inviteeGroupStatus.intValue() == 1) {
                        LayoutInflater from = LayoutInflater.from(this.this$0.f102637d);
                        View a2 = com.a.a(from, R.layout.a4n, null, false);
                        RemoteImageView remoteImageView = (RemoteImageView) a2.findViewById(R.id.bkh);
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group = inviteCardDetailInnerResponse2.getGroup();
                        if (group != null) {
                            str = group.getAvatarUrl();
                        } else {
                            str = null;
                        }
                        com.ss.android.ugc.aweme.base.e.b(remoteImageView, str, -1, -1);
                        View a3 = com.a.a(from, R.layout.a4m, null, false);
                        View findViewById = a3.findViewById(R.id.bks);
                        l.b(findViewById, "");
                        TuxTextView tuxTextView = (TuxTextView) findViewById;
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group2 = inviteCardDetailInnerResponse2.getGroup();
                        if (group2 != null) {
                            str2 = group2.getName();
                        } else {
                            str2 = null;
                        }
                        tuxTextView.setText(str2);
                        View findViewById2 = a3.findViewById(R.id.bkr);
                        l.b(findViewById2, "");
                        TuxTextView tuxTextView2 = (TuxTextView) findViewById2;
                        Resources resources = this.this$0.f102637d.getResources();
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group3 = inviteCardDetailInnerResponse2.getGroup();
                        if (group3 == null || (groupSize2 = group3.getGroupSize()) == null) {
                            i2 = 0;
                        } else {
                            i2 = groupSize2.intValue();
                        }
                        Object[] objArr = new Object[1];
                        com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a group4 = inviteCardDetailInnerResponse2.getGroup();
                        if (group4 == null || (groupSize = group4.getGroupSize()) == null) {
                            i3 = 0;
                        } else {
                            i3 = groupSize.intValue();
                        }
                        objArr[0] = Integer.valueOf(i3);
                        tuxTextView2.setText(resources.getQuantityString(R.plurals.cy, i2, objArr));
                        View findViewById3 = a3.findViewById(R.id.bkq);
                        l.b(findViewById3, "");
                        TuxTextView tuxTextView3 = (TuxTextView) findViewById3;
                        a.C0730a aVar = new a.C0730a();
                        Resources resources2 = this.this$0.f102637d.getResources();
                        l.b(resources2, "");
                        String[] strArr = new String[1];
                        String inviterName = inviteCardDetailInnerResponse2.getInviterName();
                        if (inviterName == null) {
                            inviterName = "";
                        }
                        strArr[0] = inviterName;
                        tuxTextView3.setText(aVar.a(resources2, R.string.c7n, strArr).f33382a);
                        l.b(a2, "");
                        com.bytedance.tux.dialog.b a4 = com.bytedance.tux.dialog.e.f.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.this$0.f102637d).a(false), a2, null);
                        l.b(a3, "");
                        l.c(a4, "");
                        l.c(a3, "");
                        a4.a(new com.bytedance.tux.dialog.d.a(a3));
                        com.bytedance.tux.dialog.a a5 = ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.e.a(a4, new h.f.a.b<com.bytedance.tux.dialog.b.d, z>(this) {
                            /* class com.ss.android.ugc.aweme.im.sdk.group.a.b.C2581b.AnonymousClass1 */
                            final /* synthetic */ C2581b this$0;

                            static {
                                Covode.recordClassIndex(65711);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.d dVar) {
                                com.bytedance.tux.dialog.b.d dVar2 = dVar;
                                l.d(dVar2, "");
                                Integer inviteeGroupStatus = inviteCardDetailInnerResponse2.getInviteeGroupStatus();
                                if (inviteeGroupStatus != null && inviteeGroupStatus.intValue() == 2) {
                                    dVar2.a(R.string.c6f, AnonymousClass2.f102640a);
                                    dVar2.f44828a.get(0).a(false);
                                } else {
                                    dVar2.a(R.string.c6d, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                                        /* class com.ss.android.ugc.aweme.im.sdk.group.a.b.C2581b.AnonymousClass1.AnonymousClass1 */
                                        final /* synthetic */ AnonymousClass1 this$0;

                                        static {
                                            Covode.recordClassIndex(65712);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // h.f.a.b
                                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                            l.d(aVar, "");
                                            b.a(this.this$0.this$0.this$0).a();
                                            b.a(this.this$0.this$0.this$0).a("join", "out_app");
                                            return z.f158842a;
                                        }
                                    });
                                }
                                dVar2.b(R.string.c6e, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                                    /* class com.ss.android.ugc.aweme.im.sdk.group.a.b.C2581b.AnonymousClass1.AnonymousClass3 */
                                    final /* synthetic */ AnonymousClass1 this$0;

                                    static {
                                        Covode.recordClassIndex(65714);
                                    }

                                    {
                                        this.this$0 = r2;
                                    }

                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                    @Override // h.f.a.b
                                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                        l.d(aVar, "");
                                        b.a(this.this$0.this$0.this$0).a("ignore", "out_app");
                                        return z.f158842a;
                                    }
                                });
                                return z.f158842a;
                            }
                        }).a(new h.f.a.b<com.bytedance.tux.dialog.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.im.sdk.group.a.b.C2581b.AnonymousClass2 */
                            final /* synthetic */ C2581b this$0;

                            static {
                                Covode.recordClassIndex(65715);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
                                l.d(aVar, "");
                                this.this$0.this$0.f102636c.remove(aVar);
                                return z.f158842a;
                            }
                        })).a();
                        this.this$0.f102636c.add(a5);
                        a5.b().show();
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar, h.f.a.m<? super i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return q.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return q.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
