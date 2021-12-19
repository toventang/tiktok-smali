package com.ss.android.ugc.aweme.comment;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import f.a.d.f;

final /* synthetic */ class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f71796a;

    /* renamed from: b  reason: collision with root package name */
    private final MentionEditText f71797b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71798c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71799d;

    static {
        Covode.recordClassIndex(44163);
    }

    g(b bVar, MentionEditText mentionEditText, String str, String str2) {
        this.f71796a = bVar;
        this.f71797b = mentionEditText;
        this.f71798c = str;
        this.f71799d = str2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f71796a;
        MentionEditText mentionEditText = this.f71797b;
        String str = this.f71798c;
        String str2 = this.f71799d;
        if (!bVar.n()) {
            return;
        }
        if (!b.g().isLogin()) {
            c.a(bVar.f71468b.getActivity(), str2, "click_comment_emotion", new ap().a("group_id", str).a("log_pb", ac.c(str)).f142646a);
        } else if (!bVar.e()) {
            bVar.b();
            bVar.a(mentionEditText.getHint(), true);
        }
    }
}
