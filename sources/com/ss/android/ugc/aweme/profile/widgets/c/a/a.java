package com.ss.android.ugc.aweme.profile.widgets.c.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.sheet.a.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.common.j;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: l  reason: collision with root package name */
    public static final b f117680l = new b((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public TuxButton f117681j;

    /* renamed from: k  reason: collision with root package name */
    final List<Integer> f117682k = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private final i f117683m = new i(bQ_(), new C2989a(this, null));

    static {
        Covode.recordClassIndex(76150);
    }

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "" : "twitter" : "youtube" : "instagram";
    }

    public static final class b {
        static {
            Covode.recordClassIndex(76152);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean u() {
        com.ss.android.ugc.aweme.profile.widgets.h.a.a aVar = (com.ss.android.ugc.aweme.profile.widgets.h.a.a) this.f117683m.getValue();
        if (aVar != null) {
            return aVar.f117878c;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.c.a.a$a  reason: collision with other inner class name */
    public static final class C2989a extends m implements h.f.a.a<com.ss.android.ugc.aweme.profile.widgets.h.a.a> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyDataOrNull;

        static {
            Covode.recordClassIndex(76151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2989a(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyDataOrNull = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.profile.widgets.h.a.a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyDataOrNull
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.ss.android.ugc.aweme.profile.widgets.h.a.a.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.widgets.c.a.a.C2989a.invoke():java.lang.Object");
        }
    }

    static final class f extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends z>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            TuxButton tuxButton = this.this$0.f117681j;
            if (tuxButton != null) {
                tuxButton.setVisibility(8);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        this.f117681j = (TuxButton) view.findViewById(R.id.tb);
        com.bytedance.assem.arch.service.d.a(this, ab.a(j.class), b.f117686a, new e(this));
        if (!u()) {
            com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.ui.v2.ab.class), c.f117687a, new f(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<View, z> {
        final /* synthetic */ int $type;
        final /* synthetic */ User $user;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, int i2, User user) {
            super(1);
            this.this$0 = aVar;
            this.$type = i2;
            this.$user = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            String str;
            l.d(view, "");
            this.this$0.a(this.$type, this.$user);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (com.ss.android.ugc.aweme.account.b.g().isMe(this.$user.getUid())) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            r.a("click_social_account", dVar.a("enter_from", str).a("platform", a.a(this.$type)).f66730a);
            return z.f158842a;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117684a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f117685b;

        static {
            Covode.recordClassIndex(76153);
        }

        c(a aVar, User user) {
            this.f117684a = aVar;
            this.f117685b = user;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            a aVar = this.f117684a;
            User user = this.f117685b;
            int size = aVar.f117682k.size();
            androidx.fragment.app.i iVar = null;
            String str2 = null;
            if (size == 1) {
                int intValue = aVar.f117682k.get(0).intValue();
                aVar.a(intValue, user);
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                if (user != null) {
                    str2 = user.getUid();
                }
                if (g2.isMe(str2)) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                r.a("click_social_account", dVar.a("enter_from", str).a("platform", a.a(intValue)).f66730a);
            } else if (size > 1 && aVar.ar_() != null && user != null) {
                ArrayList arrayList = new ArrayList();
                if (!TextUtils.isEmpty(user.getInsId())) {
                    Context ar_ = aVar.ar_();
                    if (ar_ == null) {
                        l.b();
                    }
                    String string = ar_.getString(R.string.d_i, user.getInsId());
                    l.b(string, "");
                    arrayList.add(aVar.a(user, 1, R.raw.icon_instagram, string));
                }
                if (!TextUtils.isEmpty(user.getYoutubeChannelId())) {
                    Context ar_2 = aVar.ar_();
                    if (ar_2 == null) {
                        l.b();
                    }
                    String string2 = ar_2.getString(R.string.d_j, user.getYoutubeChannelTitle());
                    l.b(string2, "");
                    arrayList.add(aVar.a(user, 2, R.raw.icon_youtube, string2));
                }
                com.bytedance.tux.sheet.a.a b2 = new a.b().a(arrayList).b();
                Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) aVar);
                if (a2 != null) {
                    iVar = a2.getFragmentManager();
                }
                b2.show(iVar, "third social");
            }
        }
    }

    static final class e extends m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            boolean z;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.isBlock)) {
                a aVar3 = this.this$0;
                if (aVar3.f25594h) {
                    boolean g2 = in.g(t);
                    if (t.isBlock() || (!g2 && t.isSecret() && (t.getFollowStatus() == 0 || t.getFollowStatus() == 4))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || com.ss.android.ugc.aweme.profile.experiment.e.a() || (!aVar3.u() && com.bytedance.ies.abmock.b.a().a(true, "is_hide_social_button", 0) == 1)) {
                        TuxButton tuxButton = aVar3.f117681j;
                        if (tuxButton != null) {
                            tuxButton.setVisibility(8);
                        }
                    } else {
                        aVar3.f117682k.clear();
                        if (!TextUtils.isEmpty(t.getYoutubeChannelId())) {
                            aVar3.f117682k.add(2);
                            TuxButton tuxButton2 = aVar3.f117681j;
                            if (tuxButton2 != null) {
                                tuxButton2.setVisibility(0);
                            }
                            TuxButton tuxButton3 = aVar3.f117681j;
                            if (tuxButton3 != null) {
                                tuxButton3.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_youtube));
                            }
                        }
                        if (!TextUtils.isEmpty(t.getInsId())) {
                            aVar3.f117682k.add(1);
                            TuxButton tuxButton4 = aVar3.f117681j;
                            if (tuxButton4 != null) {
                                tuxButton4.setVisibility(0);
                            }
                            TuxButton tuxButton5 = aVar3.f117681j;
                            if (tuxButton5 != null) {
                                tuxButton5.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_instagram));
                            }
                        }
                        if (aVar3.f117682k.size() == 0) {
                            TuxButton tuxButton6 = aVar3.f117681j;
                            if (tuxButton6 != null) {
                                tuxButton6.setVisibility(8);
                            }
                        } else {
                            TuxButton tuxButton7 = aVar3.f117681j;
                            if (tuxButton7 != null) {
                                tuxButton7.setVisibility(0);
                            }
                            TuxButton tuxButton8 = aVar3.f117681j;
                            if (tuxButton8 != null) {
                                tuxButton8.setOnClickListener(new c(aVar3, t));
                            }
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    public final void a(int i2, User user) {
        Context ar_;
        if (user != null && (ar_ = ar_()) != null) {
            com.ss.android.ugc.aweme.profile.service.b.f116618a.startThirdSocialActivity(ar_, user, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final a.d a(User user, int i2, int i3, String str) {
        return (a.d) new a.d().c(i3).a(str).a(new d(this, i2, user));
    }
}
