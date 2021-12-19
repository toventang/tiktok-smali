package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final s f101466a;

    /* renamed from: b  reason: collision with root package name */
    private final View.OnClickListener f101467b;

    static {
        Covode.recordClassIndex(64884);
    }

    u(s sVar, View.OnClickListener onClickListener) {
        this.f101466a = sVar;
        this.f101467b = onClickListener;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        s sVar = this.f101466a;
        View.OnClickListener onClickListener = this.f101467b;
        Bundle bundle = new Bundle();
        bundle.putLong("ItemPosition", (long) sVar.f101460a);
        view.setTag(50331652, null);
        view.setTag(50331653, null);
        bundle.putSerializable("currentAweme", sVar.y);
        view.setTag(50331652, bundle);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        long currentTimeMillis = System.currentTimeMillis() - sVar.B;
        if (sVar.z != null) {
            r.a("not_fullscreen_play_time", new d().a("enter_from", "chat").a("group_id", sVar.z.getItemId()).a("duration", currentTimeMillis).f66730a);
        }
    }
}
