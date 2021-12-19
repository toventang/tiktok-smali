package com.ss.android.ugc.aweme.comment.util;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f72858a = new a((byte) 0);

    static {
        Covode.recordClassIndex(44878);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44879);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, Comment comment, String str, int i2) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(comment, "");
            a(activity, comment.getCid(), Comment.getAuthorUid(comment), str, i2);
        }

        public static void a(Activity activity, String str, String str2, String str3, int i2) {
            h.f.b.l.d(activity, "");
            Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("object_id", str).appendQueryParameter("comment_with_emoji", "0").appendQueryParameter("owner_id", str2).appendQueryParameter("report_type", UGCMonitor.EVENT_COMMENT);
            appendQueryParameter.appendQueryParameter("locale", SettingServiceImpl.v().h());
            if (!TextUtils.isEmpty(str3)) {
                appendQueryParameter.appendQueryParameter("video_owner_id", str3);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("half_screen_height", i2);
            com.ss.android.ugc.aweme.compliance.api.a.a().a(activity, appendQueryParameter, bundle);
        }
    }
}
