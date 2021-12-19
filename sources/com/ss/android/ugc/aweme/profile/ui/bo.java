package com.ss.android.ugc.aweme.profile.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.a.a.a;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class bo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bm f116998a;

    static {
        Covode.recordClassIndex(75549);
    }

    bo(bm bmVar) {
        this.f116998a = bmVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        bm bmVar = this.f116998a;
        Context context = bmVar.getContext();
        if (context != null) {
            String h2 = bm.h(bmVar.Y);
            ClipboardManager clipboardManager = (ClipboardManager) bm.a(context, "clipboard");
            ClipData newPlainText = ClipData.newPlainText(h2, h2);
            if (clipboardManager != null) {
                try {
                    a.C0567a.a(clipboardManager, newPlainText, PrivacyCert.Builder.with("bpea-109").usage("TikTok user can share user name or profile link to others. When username is clicked in user profile page, username is copied. In profile editing page, user's profile link can also be copied.").tag("clickToCopyUserLink").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
                    new com.ss.android.ugc.aweme.tux.a.i.a(context).a(bmVar.getResources().getString(R.string.bkq)).a();
                    r.a("copy_link", new d().a("enter_from", "edit_profile_page").a("link_type", "personal_link").f66730a);
                } catch (com.bytedance.bpea.basics.a e2) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                }
            }
        }
    }
}
