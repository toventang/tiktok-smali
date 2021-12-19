package com.bytedance.android.livesdk.chatroom.ui;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.az;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class da extends cz {

    /* renamed from: a  reason: collision with root package name */
    private final int f16104a;

    /* renamed from: b  reason: collision with root package name */
    private final User f16105b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f16106c = false;

    static {
        Covode.recordClassIndex(8915);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.cz
    public final void a(View view) {
        if (this.f16106c) {
            onClick(view);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.f16104a);
    }

    public final void onClick(View view) {
        Object obj;
        if (this.f16105b != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent(this.f16105b.getId(), StringSet.name);
            userProfileEvent.mReportType = "report_user";
            userProfileEvent.mSource = "live_comment";
            if (view != null) {
                obj = view.getTag(R.id.esv);
            } else {
                obj = null;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                userProfileEvent.msgId = aVar.getMessageId();
                if (aVar instanceof i) {
                    userProfileEvent.content = ((i) aVar).f19629f;
                } else if (aVar instanceof az) {
                    az azVar = (az) aVar;
                    if (azVar.s != null && "pm_mt_guidance_interaction".equals(azVar.s.f19421a)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("event_type", "click");
                        hashMap.put("click_module", "username");
                        b.a.a("livesdk_anchor_interact_notice").a((Map<String, String>) hashMap).a().b();
                    }
                }
            }
            com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
        }
    }

    public da(User user, int i2) {
        this.f16105b = user;
        this.f16104a = i2;
    }
}
