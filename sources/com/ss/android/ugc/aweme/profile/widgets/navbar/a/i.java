package com.ss.android.ugc.aweme.profile.widgets.navbar.a;

import android.text.SpannableStringBuilder;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class i extends c<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a, g> {

    /* renamed from: h  reason: collision with root package name */
    private g f117973h;

    static {
        Covode.recordClassIndex(76483);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.profile.widgets.navbar.b.c' to match base method */
    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.profile.widgets.navbar.b.a u() {
        return com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.Nickname;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.c, com.bytedance.assem.arch.core.a
    public void f() {
        super.f();
        this.f117973h = (g) d.b(this, ab.a(g.class));
        a(new a(this));
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements b<g, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(76484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(g gVar) {
            g gVar2 = gVar;
            l.d(gVar2, "");
            this.this$0.a(gVar2);
            return z.f158842a;
        }
    }

    public static CharSequence a(User user) {
        String nickname;
        if (user == null || (nickname = user.getNickname()) == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nickname);
        spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(33), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static CharSequence b(User user) {
        UserPronounsInfo pronounsInfo;
        String pronouns;
        if (user == null || (pronounsInfo = user.getPronounsInfo()) == null || (pronouns = pronounsInfo.getPronouns()) == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pronouns);
        spannableStringBuilder.setSpan(new com.bytedance.tux.f.a.b(62), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void a(b<? super g, z> bVar) {
        l.d(bVar, "");
        g gVar = this.f117973h;
        if (gVar == null) {
            l.a("service");
        }
        gVar.b(com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.Nickname, bVar);
    }
}
