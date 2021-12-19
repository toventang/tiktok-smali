package com.bytedance.tiktok.homepage.mainfragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.homepage.mainfragment.toolbar.b;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.j.d;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class a implements i, j {

    /* renamed from: a  reason: collision with root package name */
    b f44192a;

    static {
        Covode.recordClassIndex(27076);
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(362, new g(a.class, "onPublishStatusUpdate", f.class, ThreadMode.POSTING, 0, true));
        hashMap.put(373, new g(a.class, "onHideUploadRecoverEvent", d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public a(b bVar) {
        this.f44192a = bVar;
    }

    @r
    public void onHideUploadRecoverEvent(d dVar) {
        boolean z = dVar.f128576a;
        if (this.f44192a.ab_()) {
            AVExternalServiceImpl.a().publishService().hideUploadRecoverWindow(this.f44192a.getActivity(), z);
        }
    }

    @r(b = true)
    public void onPublishStatusUpdate(f fVar) {
        if (this.f44192a.ab_()) {
            if (fVar.f128578b == 9 && fVar.f128582f && !fVar.f128587k && !fVar.f128588l) {
                a(fVar, fVar.f128583g, "publish status failed", fVar.f128581e);
            }
            if (fVar.f128578b == 10 && (fVar.f128580d instanceof Aweme)) {
                try {
                    Aweme aweme = (Aweme) fVar.f128580d;
                    long createTime = aweme.getCreateTime() - (Calendar.getInstance().getTimeInMillis() / 1000);
                    if (createTime < -120 || createTime > 10) {
                        com.bytedance.apm.b.a("aweme_publish_upload_create_time_error", new c().a("server_create_time", String.valueOf(aweme.getCreateTime())).a("client_insert_time", String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000)).a("group_id", aweme.getAid()).a());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar, boolean z, String str, String str2) {
        String str3;
        IAVPublishService publishService = AVExternalServiceImpl.a().publishService();
        if (fVar != null) {
            str3 = fVar.f128589m;
        } else {
            str3 = null;
        }
        if (!publishService.isParallelPublishEnabled()) {
            publishService.showUploadRecoverIfNeed(z, this.f44192a.getActivity(), str, str2, str3);
        } else if (fVar == null) {
            publishService.tryRestorePublish(this.f44192a.getActivity(), new b(this, publishService, z, str, str2, str3));
        } else {
            publishService.showUploadRecoverIfNeed(z, this.f44192a.getActivity(), str, str2, str3);
        }
    }
}
