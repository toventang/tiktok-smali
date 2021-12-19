package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notification.utils.ShareFromWebHelper;
import com.ss.android.ugc.aweme.notification.utils.s;
import com.ss.android.ugc.aweme.notification.view.template.c;
import com.ss.android.ugc.aweme.notification.view.template.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.json.JSONObject;

public final class f implements c {
    static {
        Covode.recordClassIndex(72866);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final void a(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final boolean a(com.ss.android.ugc.aweme.notification.view.template.f fVar) {
        Context context;
        l.d(fVar, "");
        View view = fVar.f114032b;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (view == null) {
            return true;
        }
        int id = view.getId();
        try {
            String str = fVar.f114031a.f112850h;
            JSONObject jSONObject = new JSONObject(new JSONObject(fVar.f114031a.f112851i).optString("business_extra"));
            String optString = jSONObject.optString("notice_type");
            if (optString != null) {
                int hashCode = optString.hashCode();
                if (hashCode != -1061766843) {
                    if (hashCode == 735840708 && optString.equals("share_sound.success")) {
                        String optString2 = jSONObject.optString("client_key");
                        if (str == null) {
                            l.b();
                        }
                        l.b(optString2, "");
                        l.d(str, "");
                        l.d(optString2, "");
                        Uri parse = Uri.parse(str);
                        l.b(parse, "");
                        String queryParameter = parse.getQueryParameter("music_id");
                        String queryParameter2 = parse.getQueryParameter("share_id");
                        String queryParameter3 = parse.getQueryParameter("shoot_way");
                        if (queryParameter3 == null) {
                            queryParameter3 = "share_sound";
                        }
                        l.b(queryParameter3, "");
                        if (id == R.id.cww && context != null) {
                            if (queryParameter == null) {
                                l.b();
                            }
                            if (queryParameter2 == null) {
                                l.b();
                            }
                            l.d(context, "");
                            l.d(queryParameter, "");
                            l.d(queryParameter2, "");
                            l.d(queryParameter3, "");
                            l.d(optString2, "");
                            r.a("shoot", new com.ss.android.ugc.aweme.app.f.d().a("shoot_way", queryParameter3).a("open_platform_share_id", queryParameter2).a("channel", optString2).f66730a);
                            AVExternalServiceImpl.a().asyncService(context, queryParameter3, new s.a(context, new RecordConfig.Builder().shootWay(queryParameter3).musicId(queryParameter).shareId(queryParameter2).clientId(optString2)));
                        }
                    }
                } else if (optString.equals("share_video_web.success")) {
                    if (str == null) {
                        l.b();
                    }
                    l.d(str, "");
                    Uri parse2 = Uri.parse(str);
                    l.b(parse2, "");
                    String queryParameter4 = parse2.getQueryParameter("video_id");
                    String queryParameter5 = parse2.getQueryParameter("client_name");
                    String queryParameter6 = parse2.getQueryParameter("share_id");
                    String queryParameter7 = parse2.getQueryParameter("shoot_way");
                    if (queryParameter7 == null) {
                        queryParameter7 = "share_video_web";
                    }
                    l.b(queryParameter7, "");
                    String queryParameter8 = parse2.getQueryParameter("client_key");
                    if (context != null) {
                        l.d(context, "");
                        l.d(queryParameter7, "");
                        com.ss.android.ugc.aweme.shortvideo.view.d a2 = com.ss.android.ugc.aweme.shortvideo.view.d.a(context, context.getResources().getString(R.string.dxa));
                        l.b(a2, "");
                        a2.setIndeterminate(true);
                        a2.setProgress(0);
                        ShareFromWebHelper.f113848a.getVideoInfo(queryParameter4).a(new ShareFromWebHelper.c(queryParameter4, a2, queryParameter7, queryParameter6, queryParameter8, queryParameter5, context), i.f4826c, null);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }
}
