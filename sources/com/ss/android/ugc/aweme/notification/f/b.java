package com.ss.android.ugc.aweme.notification.f;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel;
import com.ss.android.ugc.aweme.notification.redpoint.h;
import com.ss.android.ugc.aweme.notification.service.a;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class b extends com.ss.android.ugc.aweme.common.e.b<MusNewNotificationModel> implements com.ss.android.ugc.aweme.notification.redpoint.b, i, j {

    /* renamed from: a  reason: collision with root package name */
    private final int f113438a = 1;

    /* renamed from: b  reason: collision with root package name */
    private final int f113439b = 3;

    /* renamed from: c  reason: collision with root package name */
    private final int f113440c = 4;

    static {
        Covode.recordClassIndex(72944);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(344, new g(b.class, "onEvent", com.ss.android.ugc.aweme.im.service.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.e.b
    public final void cd_() {
        super.cd_();
        EventBus.a().b(this);
        h.b().f113815b.remove(2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.common.m] */
    @Override // com.ss.android.ugc.aweme.common.c
    public final /* synthetic */ void a_(c cVar) {
        a((c<?>) cVar);
    }

    public final void a(c<?> cVar) {
        l.d(cVar, "");
        super.a_(cVar);
        EventBus.a(EventBus.a(), this);
        h.b().f113815b.put(2, this);
    }

    @r
    public final void onEvent(com.ss.android.ugc.aweme.im.service.b.b bVar) {
        l.d(bVar, "");
        IIMService a2 = a.C2916a.a();
        if (a2 != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("unread_count", h.b().a(11));
            a2.onNewNoticeArrived(this.f113438a, bundle);
        }
    }

    @Override // com.ss.android.ugc.aweme.notification.redpoint.b
    public final void a(com.ss.android.ugc.aweme.notice.api.bean.h hVar) {
        l.d(hVar, "");
        if (hVar.f112680a == 11) {
            int i2 = hVar.f112684e;
            if (i2 == 0) {
                IIMService a2 = a.C2916a.a();
                if (a2 != null) {
                    Bundle bundle = new Bundle();
                    StrangerNoticeMessage strangerNoticeMessage = hVar.f112683d;
                    if (strangerNoticeMessage != null) {
                        bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                        SimpleUser fromUser = strangerNoticeMessage.getFromUser();
                        l.b(fromUser, "");
                        bundle.putString("from_user_name", fromUser.getNickName());
                        bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                        bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
                    }
                    bundle.putInt("unread_count", h.b().a(11));
                    a2.onNewNoticeArrived(this.f113439b, bundle);
                }
            } else if (i2 == 1) {
                a.C2916a.a().onNewNoticeArrived(this.f113440c, new Bundle());
            }
        }
    }
}
