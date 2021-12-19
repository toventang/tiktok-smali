package com.bytedance.android.livesdk.chatroom.ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.ac.g;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class an extends cz {

    /* renamed from: a  reason: collision with root package name */
    private final int f15891a;

    /* renamed from: b  reason: collision with root package name */
    private final User f15892b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f15893c;

    static {
        Covode.recordClassIndex(8787);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.cz
    public final void a(View view) {
    }

    public an(User user) {
        this.f15892b = user;
        this.f15891a = -1;
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.f15893c) {
            textPaint.setColor(this.f15891a);
        }
    }

    public final void onClick(View view) {
        Object obj;
        String str;
        if (this.f15892b != null) {
            if (view != null) {
                obj = view.getTag(R.id.esv);
            } else {
                obj = null;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (aVar instanceof az) {
                    az azVar = (az) aVar;
                    if (azVar.s != null && "pm_mt_guidance_interaction".equals(azVar.s.f19421a)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_type", "click");
                        hashMap.put("click_module", "message");
                        b.a.a("livesdk_anchor_interact_notice").a((Map<String, String>) hashMap).a().b();
                        str = "interact_guide";
                        com.bytedance.android.livesdk.an.a.a().a(new ap(g.a(this.f15892b), str));
                    }
                }
            }
            str = "positive_reply";
            com.bytedance.android.livesdk.an.a.a().a(new ap(g.a(this.f15892b), str));
        }
    }

    public an(User user, int i2) {
        this.f15892b = user;
        this.f15891a = i2;
        this.f15893c = true;
    }
}
