package com.ss.android.ugc.aweme.qainvitation.b.a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.b.b;
import com.ss.android.ugc.aweme.search.model.e;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.List;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends IMUser> f118988a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends e> f118989b;

    /* renamed from: c  reason: collision with root package name */
    public LogPbBean f118990c;

    /* renamed from: d  reason: collision with root package name */
    public String f118991d;

    /* renamed from: e  reason: collision with root package name */
    public String f118992e = "";

    /* renamed from: f  reason: collision with root package name */
    public final b f118993f;

    static {
        Covode.recordClassIndex(77313);
    }

    public final class a extends com.bytedance.ies.dmt.ui.a.a<IMUser> {

        /* renamed from: a  reason: collision with root package name */
        public TextView f118994a;

        /* renamed from: b  reason: collision with root package name */
        public AvatarImageWithVerify f118995b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f118996c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f118997d;

        /* renamed from: e  reason: collision with root package name */
        public TuxIconView f118998e;

        /* renamed from: f  reason: collision with root package name */
        public String f118999f = "";

        /* renamed from: g  reason: collision with root package name */
        public final View f119000g;

        /* renamed from: h  reason: collision with root package name */
        public final c f119001h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f119002i;

        /* renamed from: j  reason: collision with root package name */
        private final h.h f119003j = i.a((h.f.a.a) new C3059c(this));

        static {
            Covode.recordClassIndex(77314);
        }

        @Override // com.bytedance.ies.dmt.ui.a.a
        public final void a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c$a$c  reason: collision with other inner class name */
        static final class C3059c extends m implements h.f.a.a<Integer> {
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(77317);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3059c(a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(androidx.core.content.b.c(this.this$0.f119000g.getContext(), R.color.al));
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119007a;

            static {
                Covode.recordClassIndex(77316);
            }

            b(a aVar) {
                this.f119007a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                l.b(view, "");
                String string = view.getContext().getString(R.string.f4k, this.f119007a.f118996c.getText());
                l.b(string, "");
                new com.bytedance.tux.g.b(this.f119007a.f119000g).a(string).a(3000L).b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.qainvitation.b.a.c$a$a  reason: collision with other inner class name */
        public static final class View$OnClickListenerC3058a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f119004a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f119005b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ IMUser f119006c;

            static {
                Covode.recordClassIndex(77315);
            }

            View$OnClickListenerC3058a(a aVar, int i2, IMUser iMUser) {
                this.f119004a = aVar;
                this.f119005b = i2;
                this.f119006c = iMUser;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                int i2 = 0;
                if (this.f119004a.f118998e.isSelected() || !this.f119004a.f119002i.f118993f.a()) {
                    this.f119004a.f118998e.setSelected(true ^ this.f119004a.f118998e.isSelected());
                    if (this.f119004a.f118998e.isSelected()) {
                        com.ss.android.ugc.aweme.qainvitation.a.a aVar = com.ss.android.ugc.aweme.qainvitation.a.a.Following;
                        int i3 = this.f119005b;
                        List<? extends IMUser> list = this.f119004a.f119001h.f118988a;
                        if (list != null) {
                            i2 = list.size();
                        }
                        if (i3 >= i2) {
                            aVar = com.ss.android.ugc.aweme.qainvitation.a.a.Search;
                        }
                        this.f119004a.f119002i.f118993f.a(this.f119006c, aVar);
                        return;
                    }
                    this.f119004a.f119002i.f118993f.a(this.f119006c);
                    return;
                }
                new com.bytedance.tux.g.b(this.f119004a.f119000g).a(this.f119004a.f119000g.getContext().getString(R.string.f4i, String.valueOf(this.f119004a.f119002i.f118993f.b()))).a(3000L).b();
            }
        }

        private static void a(TextView textView, String str) {
            textView.setText(str);
        }

        private static void b(TextView textView, String str) {
            textView.setVisibility(0);
            textView.setText(str);
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setVisibility(8);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(IMUser iMUser, int i2) {
            boolean z;
            String a2 = com.ss.android.ugc.aweme.qainvitation.g.a.a(iMUser);
            String b2 = com.ss.android.ugc.aweme.qainvitation.g.a.b(iMUser);
            a(this.f118996c, a2);
            b(this.f118997d, b2);
            View view = this.itemView;
            l.b(view, "");
            View view2 = this.itemView;
            l.b(view2, "");
            view.setBackground(com.bytedance.ies.dmt.ui.common.c.c(view2.getContext()));
            User c2 = com.ss.android.ugc.aweme.qainvitation.g.a.c(iMUser);
            this.f118995b.setUserData(new UserVerify(c2.getAvatarThumb(), c2.getCustomVerify(), c2.getEnterpriseVerifyReason(), Integer.valueOf(c2.getVerificationType())));
            AvatarImageWithVerify avatarImageWithVerify = this.f118995b;
            View view3 = this.itemView;
            l.b(view3, "");
            com.ss.android.ugc.aweme.qainvitation.g.a.a(avatarImageWithVerify, view3.getContext(), c2.getCustomVerify(), c2.getEnterpriseVerifyReason(), this.f118996c);
            this.f118998e.setImageResource(R.drawable.bar);
            TuxIconView tuxIconView = this.f118998e;
            if (this.f119002i.f118993f.b(iMUser) != null) {
                z = true;
            } else {
                z = false;
            }
            tuxIconView.setSelected(z);
            if (!l.a((Object) iMUser.isUserEnabledQAInvite(), (Object) false)) {
                FrameLayout frameLayout = (FrameLayout) this.f119000g.findViewById(R.id.fd7);
                l.b(frameLayout, "");
                frameLayout.setAlpha(1.0f);
                ((FrameLayout) this.f119000g.findViewById(R.id.fd7)).setOnClickListener(new View$OnClickListenerC3058a(this, i2, iMUser));
                return;
            }
            FrameLayout frameLayout2 = (FrameLayout) this.f119000g.findViewById(R.id.fd7);
            l.b(frameLayout2, "");
            frameLayout2.setAlpha(0.34f);
            ((FrameLayout) this.f119000g.findViewById(R.id.fd7)).setOnClickListener(new b(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view, c cVar2) {
            super(view);
            l.d(view, "");
            l.d(cVar2, "");
            this.f119002i = cVar;
            this.f119000g = view;
            this.f119001h = cVar2;
            View findViewById = view.findViewById(R.id.dwp);
            l.b(findViewById, "");
            this.f118994a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.or);
            l.b(findViewById2, "");
            this.f118995b = (AvatarImageWithVerify) findViewById2;
            View findViewById3 = view.findViewById(R.id.cs_);
            l.b(findViewById3, "");
            this.f118996c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ak7);
            l.b(findViewById4, "");
            this.f118997d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.a52);
            l.b(findViewById5, "");
            this.f118998e = (TuxIconView) findViewById5;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        int i2;
        List<? extends IMUser> list = this.f118988a;
        int i3 = 0;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        List<? extends e> list2 = this.f118989b;
        if (list2 != null) {
            i3 = list2.size();
        }
        return i2 + i3;
    }

    public c(b bVar) {
        l.d(bVar, "");
        this.f118993f = bVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.arw, viewGroup, false);
        l.b(a2, "");
        return new a(this, a2, this);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3;
        int i4;
        List<? extends IMUser> list = this.f118988a;
        if (list != null) {
            i3 = list.size();
        } else {
            i3 = 0;
        }
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            String str = this.f118992e;
            String str2 = "";
            l.d(str, str2);
            aVar.f118999f = str;
            if (i2 < i3) {
                List<? extends IMUser> list2 = this.f118988a;
                if (list2 != null) {
                    IMUser iMUser = (IMUser) list2.get(i2);
                    l.d(iMUser, str2);
                    if (i2 == 0) {
                        aVar.f118994a.setVisibility(0);
                        aVar.f118994a.setText(R.string.f4z);
                    } else {
                        aVar.f118994a.setVisibility(8);
                    }
                    aVar.a(iMUser, i2);
                    return;
                }
                return;
            }
            List<? extends e> list3 = this.f118989b;
            if (list3 != null) {
                e eVar = (e) list3.get(i2 - i3);
                l.d(eVar, str2);
                com.ss.android.ugc.aweme.search.model.i iVar = eVar.f121524g;
                l.b(iVar, str2);
                int mentionBlockType = (int) iVar.getMentionBlockType();
                IMUser iMUser2 = new IMUser();
                iMUser2.setUid(iVar.getUserId());
                iMUser2.setSecUid(iVar.getSecUserId());
                iMUser2.setNickName(iVar.getUserNickname());
                UrlModel urlModel = new UrlModel();
                urlModel.setUri(iVar.getUserAvatarUri());
                boolean z = true;
                urlModel.setUrlList(n.b(iVar.getUserAvatarUri(), iVar.getUserAvatarUri()));
                iMUser2.setAvatarThumb(urlModel);
                iMUser2.setUniqueId(iVar.getUsername());
                iMUser2.setSearchType(1);
                if (iVar.isVerifiedUser()) {
                    str2 = "verified";
                }
                iMUser2.setCustomVerify(str2);
                if (mentionBlockType != 0) {
                    z = false;
                }
                iMUser2.setUserEnabledQAInvite(Boolean.valueOf(z));
                List<? extends IMUser> list4 = aVar.f119001h.f118988a;
                if (list4 != null) {
                    i4 = list4.size();
                } else {
                    i4 = 0;
                }
                if (i2 == i4) {
                    aVar.f118994a.setVisibility(0);
                    aVar.f118994a.setText(R.string.f4s);
                } else {
                    aVar.f118994a.setVisibility(8);
                }
                aVar.a(iMUser2, i2);
            }
        }
    }
}
