package com.ss.android.ugc.aweme.commercialize.model;

import android.os.Build;
import android.util.ArrayMap;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.AvatarDecoration;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class n {

    /* renamed from: d  reason: collision with root package name */
    public static final a f74893d = new a((byte) 0);
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public String f74894a;
    @c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public String f74895b;
    @c(a = "image")

    /* renamed from: c  reason: collision with root package name */
    public UrlModel f74896c;

    static {
        Covode.recordClassIndex(46178);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46179);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static boolean a(UrlModel urlModel) {
            List<String> urlList;
            if (urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty()) {
                return false;
            }
            return true;
        }

        public static Long b(User user) {
            AvatarDecoration c2;
            if (user == null || (c2 = c(user)) == null) {
                return null;
            }
            return Long.valueOf(c2.getId());
        }

        private static AvatarDecoration c(User user) {
            String str;
            b.a();
            IAccountUserService e2 = b.f62864a.e();
            l.b(e2, "");
            User curUser = e2.getCurUser();
            String uid = user.getUid();
            if (curUser != null) {
                str = curUser.getUid();
            } else {
                str = null;
            }
            if (l.a((Object) uid, (Object) str)) {
                user = curUser;
            }
            l.b(user, "");
            return user.getAvatarDecoration();
        }

        public static boolean a(User user) {
            AvatarDecoration c2;
            String name;
            t tVar = CommerceSettingsApi.f73696a;
            if (tVar != null && tVar.f74913d) {
                UrlModel urlModel = null;
                if (!(user == null || (c2 = c(user)) == null || (name = c2.getName()) == null || name.length() == 0)) {
                    if (c2 != null) {
                        urlModel = c2.getSourceUrl();
                    }
                    if (a(urlModel)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void a(User user, RemoteImageView remoteImageView) {
            UrlModel urlModel;
            AvatarDecoration c2;
            if (remoteImageView != null) {
                if (user == null || (c2 = c(user)) == null) {
                    urlModel = null;
                } else {
                    urlModel = c2.getSourceUrl();
                }
                if (a(urlModel)) {
                    com.facebook.drawee.f.a aVar = (com.facebook.drawee.f.a) remoteImageView.getHierarchy();
                    if (aVar != null) {
                        aVar.c(R.color.c9);
                    }
                    com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) remoteImageView.getHierarchy();
                    if (aVar2 != null) {
                        aVar2.d(R.color.c9);
                    }
                    e.a(remoteImageView, urlModel);
                }
            }
        }

        public static void a(User user, String str) {
            String str2;
            Long b2 = b(user);
            if (user != null) {
                str2 = user.getUid();
            } else {
                str2 = null;
            }
            if (b2 != null) {
                b2.longValue();
                if (str2 != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    ArrayMap arrayMap = new ArrayMap(4);
                    arrayMap.put("dec_id", String.valueOf(b2.longValue()));
                    arrayMap.put("enter_from", str);
                    arrayMap.put("author_id", str2);
                    r.a("show_head_decoration", arrayMap);
                }
            }
        }
    }
}
