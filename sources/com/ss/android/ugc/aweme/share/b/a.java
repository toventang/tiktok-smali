package com.ss.android.ugc.aweme.share.b;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f123373a;

    /* renamed from: b  reason: collision with root package name */
    public static final C3194a f123374b = new C3194a((byte) 0);

    public static final void a(String str, Bundle bundle) {
        C3194a.a(str, null, bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.b.a$a  reason: collision with other inner class name */
    public static final class C3194a {
        static {
            Covode.recordClassIndex(81027);
        }

        private C3194a() {
        }

        public /* synthetic */ C3194a(byte b2) {
            this();
        }

        private static boolean a(JSONObject jSONObject) {
            Iterator<String> keys = a.f123373a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.has(next)) {
                    Object opt = jSONObject.opt(next);
                    Object opt2 = a.f123373a.opt(next);
                    if (opt != null && (!l.a(opt, opt2))) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        public static void a(String str, Aweme aweme, Bundle bundle) {
            JSONObject jSONObject;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            l.d(str, "");
            if (com.ss.android.ugc.aweme.share.k.a.a()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ftc_child_mode", in.d() ? 1 : 0);
                jSONObject2.put("teen_mode_status", com.ss.android.ugc.aweme.compliance.api.a.o().a() ? 1 : 0);
                IAccountUserService g2 = b.g();
                l.b(g2, "");
                int i7 = 0;
                if (g2.isLogin()) {
                    IAccountUserService g3 = b.g();
                    l.b(g3, "");
                    User curUser = g3.getCurUser();
                    if (curUser == null || !curUser.isSecret()) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                    jSONObject2.put("current_user_secret", i6);
                }
                jSONObject2.put("region", d.g());
                if (aweme != null) {
                    jSONObject2.put("aweme_is_ads", aweme.isAd() ? 1 : 0);
                    AwemeStatus status = aweme.getStatus();
                    jSONObject2.put("aweme_private_status", status != null ? Integer.valueOf(status.getPrivateStatus()) : null);
                    AwemeStatus status2 = aweme.getStatus();
                    if (status2 == null || !status2.isInReviewing()) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    jSONObject2.put("aweme_in_reviewing", i2);
                    AwemeStatus status3 = aweme.getStatus();
                    if (status3 == null || !status3.isReviewed()) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    jSONObject2.put("aweme_reviewed", i3);
                    AwemeStatus status4 = aweme.getStatus();
                    if (status4 == null || !status4.isSelfSee()) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    jSONObject2.put("aweme_self_see", i4);
                    AwemeStatus status5 = aweme.getStatus();
                    if (status5 == null || !status5.isProhibited()) {
                        i5 = 0;
                    } else {
                        i5 = 1;
                    }
                    jSONObject2.put("aweme_is_prohibited", i5);
                    AwemeRiskModel awemeRiskModel = aweme.getAwemeRiskModel();
                    if (awemeRiskModel != null && awemeRiskModel.isWarn()) {
                        i7 = 1;
                    }
                    jSONObject2.put("aweme_warning", i7);
                    AwemeStatus status6 = aweme.getStatus();
                    jSONObject2.put("aweme_download_status", status6 != null ? Integer.valueOf(status6.getDownloadStatus()) : null);
                    jSONObject2.put("aweme_prevent_download", aweme.isPreventDownload() ? 1 : 0);
                    VideoControl videoControl = aweme.getVideoControl();
                    jSONObject2.put("aweme_prevent_download_type", videoControl != null ? Integer.valueOf(videoControl.preventDownloadType) : null);
                    Music music = aweme.getMusic();
                    if (music != null) {
                        jSONObject2.put("music_prevent_download", music.isPreventDownload() ? 1 : 0);
                        jSONObject2.put("music_mute_share", music.isMuteShare() ? 1 : 0);
                    }
                    User author = aweme.getAuthor();
                    if (author != null) {
                        IAccountUserService g4 = b.g();
                        l.b(g4, "");
                        User curUser2 = g4.getCurUser();
                        if (curUser2 == null || !TextUtils.equals(curUser2.getUid(), author.getUid())) {
                            curUser2 = author;
                        }
                        jSONObject2.put("author_secret", curUser2.isSecret() ? 1 : 0);
                        String uid = author.getUid();
                        IAccountUserService g5 = b.g();
                        l.b(g5, "");
                        User curUser3 = g5.getCurUser();
                        l.b(curUser3, "");
                        jSONObject2.put("author_is_current", TextUtils.equals(uid, curUser3.getUid()) ? 1 : 0);
                        jSONObject2.put("author_follow_status", curUser2.getFollowStatus());
                        jSONObject2.put("author_download_setting", curUser2.getDownloadSetting());
                    }
                    jSONObject = new JSONObject();
                    jSONObject.put("aweme_id", aweme.getAid());
                } else {
                    jSONObject = null;
                }
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        Object a2 = a(bundle, str2);
                        jSONObject2.put(str2, a2 != null ? a2.toString() : null);
                    }
                }
                if (a(jSONObject2)) {
                    com.bytedance.apm.b.a(str, jSONObject2, (JSONObject) null, jSONObject);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(81026);
        JSONObject jSONObject = new JSONObject();
        f123373a = jSONObject;
        jSONObject.put("ftc_child_mode", 0);
        f123373a.put("teen_mode_status", 0);
        f123373a.put("current_user_secret", 0);
        f123373a.put("publish_private_status", 0);
        f123373a.put("aweme_is_ads", 0);
        f123373a.put("aweme_private_status", 0);
        f123373a.put("aweme_in_reviewing", 0);
        f123373a.put("aweme_reviewed", 1);
        f123373a.put("aweme_self_see", 0);
        f123373a.put("aweme_is_prohibited", 0);
        f123373a.put("aweme_warning", 0);
        f123373a.put("aweme_download_status", 0);
        f123373a.put("aweme_prevent_download", 0);
        f123373a.put("aweme_prevent_download_type", 0);
        f123373a.put("music_prevent_download", 0);
        f123373a.put("music_mute_share", 0);
        f123373a.put("author_secret", 0);
        f123373a.put("author_download_setting", 0);
    }
}
