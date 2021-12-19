package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.j.b;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a;
import java.util.ArrayList;
import java.util.List;

public final class ae implements IHostShare {
    static {
        Covode.recordClassIndex(69482);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final String getBundleKey(int i2) {
        if (i2 == 0) {
            return "shared_users_id_list";
        }
        if (i2 == 1) {
            return "friends_shared_cnt";
        }
        if (i2 == 2) {
            return "is_create_group_chat";
        }
        if (i2 == 3) {
            return "batch_share_type";
        }
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getUrlModelAndShowAnim(final IHostShare.a aVar) {
        IMService.createIIMServicebyMonsterPlugin(false).getRelationService().a(new b.a() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.ae.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69483);
            }

            @Override // com.ss.android.ugc.aweme.im.service.j.b.a
            public final void a(List<IMContact> list) {
                ArrayList arrayList = new ArrayList();
                for (IMContact iMContact : list) {
                    if (!(iMContact == null || iMContact.getDisplayAvatar() == null)) {
                        com.bytedance.android.live.base.model.b bVar = new com.bytedance.android.live.base.model.b();
                        bVar.f7375a = iMContact.getDisplayAvatar().getUri();
                        bVar.f7376b = iMContact.getDisplayAvatar().getUrlList();
                        arrayList.add(bVar);
                    }
                }
                aVar.a(arrayList);
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isImChannel(String str) {
        String c2 = ShareExtServiceImpl.e().c();
        if (m.a("chat_merge", str)) {
            return true;
        }
        if (!m.a(str) || !m.a("im_channel", c2)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final boolean isShareAvailable(String str, Activity activity) {
        com.ss.android.ugc.aweme.sharer.b a2 = a.C3201a.a(str, activity);
        if (a2 == null || !a2.b(activity)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void getShortUrl(String str, IHostShare.b bVar) {
        String cE_ = ah.f123353b.a("", "", str).cE_();
        if (bVar != null) {
            bVar.a(cE_);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void share(Activity activity, c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        LiveHostOuterService.q().c(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getLongPressShareDialog(Activity activity, c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        return LiveHostOuterService.q().b(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final Dialog getShareDialog(Activity activity, c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        return LiveHostOuterService.q().a(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    public final void showReportDialog(Activity activity, c cVar, String str) {
        if (cVar != null) {
            com.ss.android.ugc.aweme.compliance.api.a.a().a(activity, new Uri.Builder().appendQueryParameter("object_id", String.valueOf(cVar.E)).appendQueryParameter("owner_id", String.valueOf(cVar.F)).appendQueryParameter("report_type", str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == null) goto L_0x0038;
     */
    @Override // com.bytedance.android.livesdkapi.host.IHostShare
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair<java.lang.String, android.graphics.drawable.Drawable> getBreathShareAnimShareRes(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L_0x0004
            return r2
        L_0x0004:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.e()
            android.app.Activity r4 = (android.app.Activity) r4
            android.graphics.drawable.Drawable r1 = r0.a(r4, r5)
            if (r1 != 0) goto L_0x0041
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.e()
            android.graphics.drawable.Drawable r1 = r0.a(r4)
            java.lang.String r5 = com.ss.android.ugc.aweme.feed.ai.c()
            com.ss.android.ugc.aweme.sharer.b r0 = com.ss.android.ugc.aweme.share.improve.a.C3201a.a(r5, r4)
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "other"
            boolean r0 = com.bytedance.common.utility.m.a(r5, r0)
            if (r0 != 0) goto L_0x003e
        L_0x002e:
            com.ss.android.ugc.aweme.share.ShareExtService r0 = com.ss.android.ugc.aweme.share.ShareExtServiceImpl.e()
            android.graphics.drawable.Drawable r1 = r0.a(r4, r6)
            if (r1 != 0) goto L_0x0042
        L_0x0038:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x003e:
            if (r1 != 0) goto L_0x0041
            goto L_0x002e
        L_0x0041:
            r6 = r5
        L_0x0042:
            r2 = r6
            goto L_0x0038
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.ae.getBreathShareAnimShareRes(android.content.Context, java.lang.String, java.lang.String):android.util.Pair");
    }
}
