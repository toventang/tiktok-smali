package com.ss.android.ugc.aweme.story.publish.foreground;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.shortvideo.publish.d;
import com.ss.android.ugc.aweme.shortvideo.publish.x;
import com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.ArrayList;

public final class StoryPublishBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138125a = new a((byte) 0);

    static {
        Covode.recordClassIndex(90331);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90332);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i2;
        l.d(context, "");
        l.d(intent, "");
        StoryPublishNotificationService.a.a();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_retry_task_list");
        StringBuilder sb = new StringBuilder("StoryPublishBroadcastReceiver:onReceive,taskSize:");
        if (parcelableArrayListExtra != null) {
            i2 = parcelableArrayListExtra.size();
        } else {
            i2 = 0;
        }
        q.a(sb.append(i2).toString());
        if (parcelableArrayListExtra != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : parcelableArrayListExtra) {
                x b2 = com.ss.android.ugc.aweme.story.publish.a.a.b(((ScheduleInfo) obj).getScheduleId());
                if ((b2 instanceof x.a) && (((x.a) b2).f129901a instanceof d.b)) {
                    arrayList.add(obj);
                }
            }
            ArrayList<ScheduleInfo> arrayList2 = arrayList;
            if ((!arrayList2.isEmpty()) && arrayList2 != null) {
                a aVar = new a(arrayList2);
                for (ScheduleInfo scheduleInfo : arrayList2) {
                    String scheduleId = scheduleInfo.getScheduleId();
                    q.a("StoryPublishBroadcastReceiver,auto retry task:".concat(String.valueOf(scheduleId)));
                    com.ss.android.ugc.aweme.story.publish.a.a.a(scheduleId);
                    com.ss.android.ugc.aweme.story.publish.a.a.a(aVar, scheduleId, false);
                }
            }
        }
    }
}
