package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.b;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.a.c;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.b.l;

final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass2 f101141a;

    /* renamed from: b  reason: collision with root package name */
    private final View f101142b;

    static {
        Covode.recordClassIndex(64703);
    }

    i(c.AnonymousClass2 r1, View view) {
        this.f101141a = r1;
        this.f101142b = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        c.AnonymousClass2 r5 = this.f101141a;
        Context context = this.f101142b.getContext();
        Bundle bundle = new Bundle();
        SharePackage generateSharePackage = r5.f101130b.generateSharePackage();
        Bundle bundle2 = generateSharePackage.f124595i;
        bundle2.putString("enter_method", "forward");
        bundle2.putString("platform", "chat_forward");
        bundle.putParcelable("share_package", generateSharePackage);
        bundle.putSerializable("share_content", r5.f101130b);
        bundle.putLong("forward_origin_msgid", r5.f101131c.getMsgId());
        String str = generateSharePackage.f124590d;
        if ("aweme".equals(str) || "story_video".equals(str)) {
            ai aiVar = r5.f101131c;
            l.d(generateSharePackage, "");
            l.d(aiVar, "");
            String str2 = aiVar.getLocalExt().get("feed_video_status_flag");
            if (str2 == null) {
                str2 = "0";
            }
            if ((!l.a((Object) str2, (Object) "0")) || b.a(aiVar)) {
                generateSharePackage.f124595i.remove("video_cover");
            }
        }
        RelationSelectActivity.a.a(context, bundle);
        f.a(c.this.n.isGroupChat(), "forward");
    }
}
