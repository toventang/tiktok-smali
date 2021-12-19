package com.ss.android.ugc.aweme.comment;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.comment.ui.bz;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.ap;
import com.ss.android.ugc.aweme.utils.z;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f71792a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71793b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71794c;

    /* renamed from: d  reason: collision with root package name */
    private final MentionEditText f71795d;

    static {
        Covode.recordClassIndex(44150);
    }

    f(b bVar, String str, String str2, MentionEditText mentionEditText) {
        this.f71792a = bVar;
        this.f71793b = str;
        this.f71794c = str2;
        this.f71795d = mentionEditText;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f71792a;
        String str = this.f71793b;
        String str2 = this.f71794c;
        MentionEditText mentionEditText = this.f71795d;
        if (!bVar.n()) {
            return;
        }
        if (!b.g().isLogin()) {
            c.a(bVar.f71468b.getActivity(), str, "click_comment_at", new ap().a("group_id", str2).a("log_pb", ac.c(str2)).f142646a);
        } else if (!bVar.e() && bVar.f71469c.m() != null && !z.d(bVar.f71469c.m())) {
            bVar.f71473g = true;
            CharSequence hint = mentionEditText.getHint();
            if (bVar.n()) {
                Bundle a2 = bVar.a(hint);
                a2.putBoolean("clickAt", true);
                bVar.a(bz.a(bVar.f71469c.p(), bVar.f(), bVar.f71475i, a2));
            }
        }
    }
}
