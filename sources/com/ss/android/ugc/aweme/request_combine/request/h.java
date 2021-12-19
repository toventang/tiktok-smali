package com.ss.android.ugc.aweme.request_combine.request;

import android.content.Context;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.main.ay;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.request_combine.a;
import com.ss.android.ugc.aweme.request_combine.model.NoticeCountCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.request.a.c;
import h.f.b.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class h extends b {

    /* renamed from: a  reason: collision with root package name */
    private a f120673a;

    static {
        Covode.recordClassIndex(78595);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final a b() {
        return this.f120673a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            return "/aweme/v1/notice/count/";
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new c());
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final Map<String, String> a(Context context) {
        ay ayVar;
        l.d(context, "");
        HashMap hashMap = new HashMap();
        hashMap.put("source", "1");
        l.b(com.ss.android.ugc.aweme.by.a.a(), "");
        boolean z = false;
        z = false;
        int a2 = com.bytedance.ies.abmock.b.a().a(true, "second_tab_last_status", 0);
        if (a2 == 0) {
            z = true;
        } else if (!(a2 == 1 || (ayVar = (ay) com.ss.android.ugc.aweme.base.b.a.c.a(d.a(), ay.class)) == null)) {
            z = ayVar.d();
        }
        hashMap.put("second_tab_type", String.valueOf(!z ? 1 : 0));
        hashMap.put("follow_tab_position", "1");
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        NoticeCountCombineModel noticeCountCombineModel;
        NoticeList noticeList;
        boolean z;
        boolean z2;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            noticeCountCombineModel = null;
        } else {
            noticeCountCombineModel = data.getNoticeCountModel();
        }
        if (!(noticeCountCombineModel == null || (noticeList = noticeCountCombineModel.getNoticeList()) == null || noticeList.status_code != 0)) {
            this.f120673a = noticeCountCombineModel;
            if (noticeCountCombineModel.httpCode == 200) {
                z = com.bytedance.common.utility.collection.b.a((Collection) noticeCountCombineModel.getNoticeList().getItems());
                Message obtain = Message.obtain();
                obtain.obj = noticeCountCombineModel.getNoticeList();
                obtain.what = 0;
                l.b(obtain, "");
                l.d(obtain, "");
                com.ss.android.ugc.aweme.notice.api.b.a().a(obtain);
                z2 = true;
            } else {
                z = true;
                z2 = false;
            }
            com.ss.android.ugc.aweme.common.r.a("homepage_follow_monitor", new com.ss.android.ugc.aweme.app.f.d().a("error_type", "combine_yellow_dot").a("is_success", Boolean.valueOf(z2)).a("is_empty", Boolean.valueOf(z)).f66730a);
            if (noticeCountCombineModel.httpCode == 200) {
                return true;
            }
        }
        return false;
    }
}
