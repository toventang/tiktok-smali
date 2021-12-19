package com.ss.android.ugc.aweme.following.ui.viewholder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.following.a.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class RecommendRelationTitleViewHolder extends JediSimpleViewHolder<f> implements au {

    /* renamed from: f  reason: collision with root package name */
    public final View f96611f;

    /* renamed from: g  reason: collision with root package name */
    private final View f96612g;

    /* renamed from: j  reason: collision with root package name */
    private final TextView f96613j;

    static {
        Covode.recordClassIndex(61248);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecommendRelationTitleViewHolder(View view) {
        super(view);
        l.d(view, "");
        View findViewById = this.itemView.findViewById(R.id.an5);
        l.b(findViewById, "");
        this.f96612g = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.fb6);
        l.b(findViewById2, "");
        this.f96613j = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.d9f);
        l.b(findViewById3, "");
        this.f96611f = findViewById3;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendRelationTitleViewHolder f96614a;

        static {
            Covode.recordClassIndex(61249);
        }

        a(RecommendRelationTitleViewHolder recommendRelationTitleViewHolder) {
            this.f96614a = recommendRelationTitleViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "find_friends");
            r.a("click_privacy_tips", hashMap);
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            aj<String> privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            l.b(privacyReminderH5Url, "");
            String c2 = privacyReminderH5Url.c();
            if (!TextUtils.isEmpty(c2)) {
                Intent intent = new Intent(this.f96614a.f96611f.getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(c2));
                Context context = this.f96614a.f96611f.getContext();
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(f fVar) {
        f fVar2 = fVar;
        l.d(fVar2, "");
        this.f96613j.setText(fVar2.f96341b);
        this.f96612g.setVisibility(8);
        if (!b.a().a(true, "enable_privacy_reminder", false) || fVar2.f96340a != 4) {
            this.f96611f.setVisibility(8);
            return;
        }
        this.f96611f.setVisibility(0);
        this.f96612g.setVisibility(0);
        this.f96611f.setOnClickListener(new a(this));
    }
}
