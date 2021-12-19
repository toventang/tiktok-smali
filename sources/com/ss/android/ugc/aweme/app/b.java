package com.ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.app.c;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.app.k.b;
import com.ss.android.ugc.aweme.aw;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.experiment.em;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.music.k.h;
import com.ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.y.a;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.gw;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f66653a = new h((byte) 0);

    public static final class af extends aw {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66654a = new a((byte) 0);

        static {
            Covode.recordClassIndex(40995);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return null;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(40996);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (!h.m.p.a("messages", str, true) || !h.m.p.a("/group", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            o a2 = o.a();
            h.f.b.l.b(a2, "");
            boolean a3 = a2.f66861a.a();
            String queryParameter = uri.getQueryParameter("invite_id");
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (queryParameter.length() != 0) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                if (g2.isLogin()) {
                    if (!a3) {
                        Intent a4 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
                        com.ss.android.ugc.tiktok.security.a.a.a(a4, activity);
                        activity.startActivity(a4);
                    }
                    IMService.createIIMServicebyMonsterPlugin(false).handleGroupInvite(activity, queryParameter);
                }
            }
        }
    }

    public static final class aj extends aw {
        static {
            Covode.recordClassIndex(41000);
        }

        public static final class a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f66655a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f66656b;

            static {
                Covode.recordClassIndex(41001);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            a(Activity activity, Uri uri) {
                this.f66655a = activity;
                this.f66656b = uri;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                h.f.b.l.d(asyncAVService, "");
                Activity activity = this.f66655a;
                Uri uri = this.f66656b;
                h.f.b.l.d(activity, "");
                h.f.b.l.d(uri, "");
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a() {
            return AVExternalServiceImpl.a().classnameService().getVideoPublishActivityClass().getName();
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "publishVideo");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            AVExternalServiceImpl.a().asyncService(activity, "deep_link_publish_video", new a(activity, uri));
        }
    }

    public static final class an extends aw {
        static {
            Covode.recordClassIndex(41005);
        }

        public static final class a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f66657a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f66658b;

            static {
                Covode.recordClassIndex(41006);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            a(Activity activity, Uri uri) {
                this.f66657a = activity;
                this.f66658b = uri;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                h.f.b.l.d(asyncAVService, "");
                AVExternalServiceImpl.a().shoutOutsService().startShoutoutsPublishActivityFromDL(this.f66657a, this.f66658b);
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "shoutouts/publish", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            AVExternalServiceImpl.a().asyncService(activity, "deep_link_shoutouts_publish_video", new a(activity, uri));
        }
    }

    public static final class ao extends aw {
        static {
            Covode.recordClassIndex(41007);
        }

        public static final class a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f66659a;

            static {
                Covode.recordClassIndex(41008);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            a(Activity activity) {
                this.f66659a = activity;
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                h.f.b.l.d(asyncAVService, "");
                asyncAVService.uiService().recordService().startRecord(this.f66659a, new RecordConfig.Builder().shootWay("upload_anchor").build());
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (!h.m.p.a("studio", str, true) || !h.m.p.a("/upload", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            AVExternalServiceImpl.a().asyncServiceWithActivity(activity, "deep_link_upload_video", new a(activity));
        }
    }

    public static final class c extends aw {

        /* renamed from: a  reason: collision with root package name */
        public static final String f66664a = "hot";

        /* renamed from: b  reason: collision with root package name */
        public static final String f66665b = "cold";

        /* renamed from: c  reason: collision with root package name */
        public static final String f66666c = "feed";

        /* renamed from: d  reason: collision with root package name */
        public static final String f66667d = "detail";

        /* renamed from: e  reason: collision with root package name */
        public static final String f66668e = "gids";

        /* renamed from: f  reason: collision with root package name */
        public static final a f66669f = new a((byte) 0);

        public static final class a {
            static {
                Covode.recordClassIndex(41018);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(41017);
        }

        private static Intent a(Activity activity) {
            h.f.b.l.d(activity, "");
            Intent a2 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
            a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            a2.putExtra("tab", 1);
            return a2;
        }

        private static Intent a(Activity activity, Uri uri) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("from_adsapp_activity", true);
            intent.putExtra("from_uid", uri.getQueryParameter("from_uid"));
            return intent;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) (str + str2), (Object) "aweme/push_detail");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent a2;
            int i2;
            String str4;
            String str5 = "";
            h.f.b.l.d(activity, str5);
            h.f.b.l.d(uri, str5);
            h.f.b.l.d(str, str5);
            h.f.b.l.d(str2, str5);
            h.f.b.l.d(str3, str5);
            JSONObject jSONObject = new JSONObject();
            o a3 = o.a();
            h.f.b.l.b(a3, str5);
            if (a3.f66861a.a()) {
                if (TextUtils.equals(uri.getQueryParameter(f66664a), f66666c)) {
                    a2 = a(activity);
                } else {
                    a2 = a(activity, uri);
                }
            } else if (TextUtils.equals(uri.getQueryParameter(f66665b), f66666c)) {
                a2 = a(activity);
            } else {
                a2 = a(activity, uri);
            }
            h.f.b.l.d(uri, str5);
            h.f.b.l.d(str3, str5);
            if (a2 != null) {
                String queryParameter = uri.getQueryParameter(f66668e);
                if (!TextUtils.isEmpty(queryParameter)) {
                    a2.putExtra("ids", queryParameter);
                    a2.putExtra("gids", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("from");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    a2.putExtra("from_micro_app", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = "web";
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = queryParameter3;
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    str3 = "mp_page";
                }
                a2.putExtra("refer", str3);
                a2.putExtra("gd_label", uri.getQueryParameter("gd_label"));
                String queryParameter4 = uri.getQueryParameter("push_params");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    a2.putExtra("push_params", queryParameter4);
                }
                if (TextUtils.equals(uri.getQueryParameter(f66665b), "nearby_detail")) {
                    o a4 = o.a();
                    h.f.b.l.b(a4, str5);
                    if (!a4.f66861a.a()) {
                        a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
                    }
                }
            }
            try {
                o a5 = o.a();
                h.f.b.l.b(a5, str5);
                if (a5.f66861a.a()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                jSONObject.put("is_cold_launch", i2);
                o a6 = o.a();
                h.f.b.l.b(a6, str5);
                if (a6.f66861a.a()) {
                    str4 = f66664a;
                } else {
                    str4 = f66665b;
                }
                jSONObject.put("landing_page", uri.getQueryParameter(str4));
                String queryParameter5 = uri.getQueryParameter("push_id");
                if (queryParameter5 == null) {
                    queryParameter5 = str5;
                }
                jSONObject.put("rule_id", queryParameter5);
                String queryParameter6 = uri.getQueryParameter("gids");
                if (queryParameter6 == null) {
                    queryParameter6 = str5;
                }
                jSONObject.put("group_id", queryParameter6);
                Activity[] activityStack = ActivityStack.getActivityStack();
                if (activityStack == null || activityStack.length <= 1) {
                    jSONObject.put("last_page_path", str5);
                } else {
                    jSONObject.put("last_page_path", activityStack[activityStack.length - 1].getClass().getSimpleName());
                }
                String queryParameter7 = uri.getQueryParameter("gd_label");
                if (queryParameter7 != null) {
                    str5 = queryParameter7;
                }
                jSONObject.put("push_label", str5);
                c.a.a("homepage_hot", uri);
                com.ss.android.ugc.aweme.common.r.a("hot_search_video_push", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return a2;
        }
    }

    public static class j extends aw {

        /* renamed from: c  reason: collision with root package name */
        public static final a f66670c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public final String f66671a = "click_push_videoat";

        /* renamed from: b  reason: collision with root package name */
        public final String f66672b = "follow_card_push_publish";

        static {
            Covode.recordClassIndex(41025);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "detail";
        }

        public static final class a {
            static {
                Covode.recordClassIndex(41026);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.m.p.b(str + str2, "aweme/detail/", false) || h.m.p.b(str + str2, "tuwen/detail/", false) || h.m.p.b(str + str2, "story/detail/", false)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            String queryParameter = uri.getQueryParameter("enter_from");
            String queryParameter2 = uri.getQueryParameter("video_from");
            String queryParameter3 = uri.getQueryParameter("story_type");
            intent.putExtra("id", uri.getLastPathSegment());
            intent.putExtra("video_from", queryParameter2);
            intent.putExtra("refer", "notification_page");
            intent.putExtra("enter_from", queryParameter);
            intent.putExtra("story type", queryParameter3);
            intent.setData(uri);
            String queryParameter4 = uri.getQueryParameter("commentId");
            if (!TextUtils.isEmpty(queryParameter4)) {
                intent.putExtra("cid", queryParameter4);
            }
            o a2 = o.a();
            h.f.b.l.b(a2, "");
            if (a2.f66861a.a()) {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                activity.startActivity(intent);
                return;
            }
            activity.startActivities(new Intent[]{com.ss.android.ugc.aweme.utils.a.c.a(activity), intent});
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
        @Override // com.ss.android.ugc.aweme.aw
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(android.app.Activity r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
            /*
            // Method dump skipped, instructions count: 470
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.b.j.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    public static class k extends aw {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66673a = new a((byte) 0);

        static {
            Covode.recordClassIndex(41027);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(41028);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "detail");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            if (!TextUtils.isEmpty(str3)) {
                str4 = str3;
            } else {
                str4 = "web";
            }
            Intent a2 = h.a(activity, uri, intent, z, uri.getQueryParameter("id"));
            a(uri, a2, z);
            a2.putExtra("refer", str4);
            a2.putExtra("from_token", str3);
            a2.putExtra("id", uri.getQueryParameter("id"));
            c.a.a("detail", uri);
            return a2;
        }
    }

    public static class v extends aw {

        /* renamed from: a  reason: collision with root package name */
        public static final a f66674a = new a((byte) 0);

        static {
            Covode.recordClassIndex(41039);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "detail";
        }

        public static final class a {
            static {
                Covode.recordClassIndex(41040);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) str, (Object) "item") || h.f.b.l.a((Object) str, (Object) "musical")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent a2 = h.a(activity, uri, new Intent(activity, DetailActivity.class), z, uri.getQueryParameter("id"));
            a(uri, a2, z);
            a2.putExtra("refer", "web");
            a2.putExtra("id", uri.getQueryParameter("id"));
            c.a.a("detail", uri);
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(40988);
    }

    public static final class h {
        static {
            Covode.recordClassIndex(41023);
        }

        private h() {
        }

        public /* synthetic */ h(byte b2) {
            this();
        }

        public static void a(Uri uri, Intent intent) {
            h.f.b.l.d(uri, "");
            h.f.b.l.d(intent, "");
            String queryParameter = uri.getQueryParameter("tab");
            if (queryParameter == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            try {
                int parseInt = Integer.parseInt(queryParameter);
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    c.a.a("discovery", uri);
                } else if (parseInt == 5) {
                    c.a.a("follow", uri);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public static String a(String str, Uri uri, boolean z) {
            String str2;
            String str3;
            if (uri != null) {
                str2 = uri.getQueryParameter("sec_uid");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                gw.a().a(str, str2);
            }
            if (z) {
                gw.a();
                if (uri == null || (str3 = uri.toString()) == null) {
                    str3 = "";
                }
                gw.a(str3, str, str2);
            }
            return str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
            if (r0.f66861a.a() == false) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent a(android.app.Activity r6, android.net.Uri r7, android.content.Intent r8, boolean r9, java.lang.String r10) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.b.h.a(android.app.Activity, android.net.Uri, android.content.Intent, boolean, java.lang.String):android.content.Intent");
        }
    }

    public static final class al extends aw {
        static {
            Covode.recordClassIndex(41003);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return null;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a() {
            return AVExternalServiceImpl.a().classnameService().getVideoRecordActivityClass().getName();
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) str, (Object) "openRecord") || h.f.b.l.a((Object) str, (Object) "video_record") || h.m.p.b(str + str2, "studio/task/create", false) || h.m.p.b(str + str2, "studio/create", false)) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String queryParameter = uri.getQueryParameter("target_sec_uid");
            boolean a2 = h.f.b.l.a((Object) "live", (Object) uri.getQueryParameter("record_type"));
            if (!TextUtils.isEmpty(queryParameter)) {
                com.ss.android.ugc.aweme.account.b.a();
                IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                h.f.b.l.b(e2, "");
                if (e2.isLogin()) {
                    com.ss.android.ugc.aweme.account.b.a();
                    IAccountUserService e3 = com.ss.android.ugc.aweme.account.b.f62864a.e();
                    h.f.b.l.b(e3, "");
                    if (!TextUtils.equals(queryParameter, e3.getCurSecUserId())) {
                        String string = activity.getString(R.string.gd1);
                        h.f.b.l.b(string, "");
                        if (!TextUtils.isEmpty(string)) {
                            new com.bytedance.tux.g.b(activity).a().a(string).b();
                        }
                    }
                }
            }
            if (activity.getIntent().getBooleanExtra("from_tile_service", false)) {
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("launch_method", "click_shoot_notificationbar");
                j a4 = j.a();
                h.f.b.l.b(a4, "");
                com.ss.android.ugc.aweme.common.r.a("launch_from_notificationbar", a3.a("is_cold_launch", a4.f66809b ? 1 : 0).f66730a);
            }
            if (z) {
                h.f.b.l.d(activity, "");
                h.f.b.l.d(uri, "");
                RecordConfig.Builder interceptBackground = new RecordConfig.Builder().shootWay("push").enterFrom("push").interceptBackground(false);
                if (a2) {
                    interceptBackground.defaultTab(2);
                }
                com.ss.android.ugc.aweme.shortvideo.y.a.a(activity, interceptBackground, uri);
                interceptBackground.permissionActivityRequired(true);
                if (AVExternalServiceImpl.a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                    o a5 = o.a();
                    h.f.b.l.b(a5, "");
                    boolean a6 = a5.f66861a.a();
                    Intent intent = new Intent(activity, PushLoginActivity.class);
                    intent.putExtra("EXTRA_AV_RECORD_CONFIG", interceptBackground.build());
                    if (a6) {
                        com.ss.android.ugc.aweme.shortvideo.y.a.a(activity, intent);
                        return;
                    }
                    activity.startActivities(new Intent[]{com.ss.android.ugc.aweme.utils.a.c.a(activity), intent});
                    return;
                }
                AVExternalServiceImpl.a().asyncService(activity, "push", new a.C3442a(activity, interceptBackground));
                return;
            }
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            o a7 = o.a();
            h.f.b.l.b(a7, "");
            boolean a8 = a7.f66861a.a();
            RecordConfig.Builder builder = new RecordConfig.Builder();
            com.ss.android.ugc.aweme.shortvideo.y.a.a(activity, builder, uri);
            builder.permissionActivityRequired(true);
            if (a8) {
                AVExternalServiceImpl.a().asyncService(activity, "route", new a.b(activity, builder));
                return;
            }
            Intent intent2 = new Intent();
            intent2.getFlags();
            intent2.setFlags(com.ss.android.ugc.aweme.shortvideo.y.b.a(activity, intent2));
            new Bundle();
            intent2.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
            intent2.putExtras(intent2.putExtra("enter_record_from_other_platform", true));
            com.ss.android.ugc.aweme.shortvideo.y.a.a(activity, intent2);
        }
    }

    public static final class ah extends aw {
        static {
            Covode.recordClassIndex(40998);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "others_homepage";
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "profile");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            c.a.a("personal_homepage", uri);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", uri.getQueryParameter("id"));
            intent.putExtra("sec_user_id", h.a(uri.getQueryParameter("id"), uri, true));
            intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
            String a2 = a(activity.getIntent(), "token_request_id");
            if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(str3)) {
                com.ss.android.ugc.aweme.metrics.q qVar = (com.ss.android.ugc.aweme.metrics.q) new com.ss.android.ugc.aweme.metrics.q().o(str3).a("click_button");
                qVar.q = uri.getLastPathSegment();
                qVar.r = a2;
                qVar.f();
            }
            return intent;
        }
    }

    public static final class w extends aw {
        static {
            Covode.recordClassIndex(41041);
        }

        private static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "login");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin()) {
                o a2 = o.a();
                h.f.b.l.b(a2, "");
                if (a2.f66861a.a()) {
                    a(activity, new Intent(activity, PushLoginActivity.class));
                    return;
                }
                activity.startActivities(new Intent[]{com.ss.android.ugc.aweme.utils.a.c.a(activity), new Intent(activity, PushLoginActivity.class)});
                return;
            }
            a(activity, com.ss.android.ugc.aweme.utils.a.c.a(activity));
        }
    }

    public static final class ab extends aw {
        static {
            Covode.recordClassIndex(40991);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "collection");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (h.f.b.l.a((Object) "0", (Object) uri.getQueryParameter("group"))) {
                return SmartRouter.buildRoute(activity, "aweme://music/category/").withParam("mc_id", uri.getQueryParameter("id")).withParam("title_name", uri.getQueryParameter("collection_name")).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1).buildIntent();
            }
            return null;
        }
    }

    public static final class ad extends aw {
        static {
            Covode.recordClassIndex(40993);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "nearby";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) "nearby", (Object) str);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            int i2;
            Integer num;
            Integer e2;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent a2 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
            h.f.b.l.b(a2, "");
            a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
            String queryParameter = uri.getQueryParameter("feed_type");
            if (queryParameter == null || (e2 = h.m.p.e(queryParameter)) == null) {
                i2 = 0;
            } else {
                i2 = e2.intValue();
            }
            a2.putExtra("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i2);
            String queryParameter2 = uri.getQueryParameter("insert_fresh_aweme_ids");
            String queryParameter3 = uri.getQueryParameter("insert_fresh_type");
            if (queryParameter3 != null) {
                num = h.m.p.e(queryParameter3);
            } else {
                num = null;
            }
            if (!TextUtils.isEmpty(queryParameter2) && num != null) {
                a2.putExtra("insert_aweme_ids", queryParameter2);
                a2.putExtra("insert_type", num.intValue());
            }
            return a2;
        }
    }

    public static final class ai extends aw {
        static {
            Covode.recordClassIndex(40999);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "profile_edit";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "profileEdit");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return new Intent(activity, ProfileEditActivity.class);
        }
    }

    public static final class am extends aw {
        static {
            Covode.recordClassIndex(41004);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "search");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (com.ss.android.ugc.aweme.compliance.api.a.p().e()) {
                return com.ss.android.ugc.aweme.utils.a.c.a(activity);
            }
            com.ss.android.ugc.aweme.account.b.a();
            IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
            h.f.b.l.b(e2, "");
            if (e2.isLogin() || !Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "CH", "GB", "US").contains(com.ss.android.ugc.aweme.language.d.a())) {
                return com.ss.android.ugc.aweme.search.h.f121133a.a(activity, uri);
            }
            o a2 = o.a();
            h.f.b.l.b(a2, "");
            if (a2.f66861a.a()) {
                return null;
            }
            Intent a3 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
            a3.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            a3.putExtra("tab", 1);
            return a3;
        }
    }

    public static final class as extends aw {

        /* renamed from: a  reason: collision with root package name */
        private final String f66660a = "ban_music";

        static {
            Covode.recordClassIndex(41012);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "openVideoEditPage");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String queryParameter = uri.getQueryParameter(StringSet.type);
            if (!TextUtils.isEmpty(queryParameter) && h.f.b.l.a((Object) queryParameter, (Object) this.f66660a)) {
                String queryParameter2 = uri.getQueryParameter("item_id");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    IReplaceMusicDownloadService a2 = ReplaceMusicDownloadService.a();
                    if (queryParameter2 == null) {
                        h.f.b.l.b();
                    }
                    a2.a(queryParameter2, activity, "");
                }
            }
        }
    }

    public static final class av extends aw {
        static {
            Covode.recordClassIndex(41015);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "webview");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            if (!TextUtils.isEmpty(uri.getQueryParameter("rn_schema"))) {
                String uri2 = uri.toString();
                h.f.b.l.b(uri2, "");
                String a2 = h.m.p.a(uri2, com.ss.android.ugc.aweme.deeplink.m.f79501a.e(), "aweme", false);
                String uri3 = com.ss.android.ugc.aweme.music.k.h.a(a2).a().toString();
                h.f.b.l.b(uri3, "");
                h.a a3 = com.ss.android.ugc.aweme.music.k.h.a(a2);
                if (com.ss.android.ugc.aweme.app.j.a.a()) {
                    a3.a("sec_link_scene", "deeplink");
                }
                com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), uri3);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
            if (r5 != null) goto L_0x0047;
         */
        @Override // com.ss.android.ugc.aweme.aw
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(android.app.Activity r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.b.av.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    public static final class f extends aw {
        static {
            Covode.recordClassIndex(41021);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "challenge_detail";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "challenge");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            int i2;
            String queryParameter;
            String queryParameter2;
            Integer e2;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            String queryParameter3 = uri.getQueryParameter("is_commerce");
            String queryParameter4 = uri.getQueryParameter("show_tab");
            boolean z2 = false;
            if (queryParameter4 == null || (e2 = h.m.p.e(queryParameter4)) == null) {
                i2 = 0;
            } else {
                i2 = e2.intValue();
            }
            int i3 = i2 - 1;
            String queryParameter5 = uri.getQueryParameter("enter_from");
            String queryParameter6 = uri.getQueryParameter("extra_challenge_from");
            if (TextUtils.equals(queryParameter3, "1") || h.m.p.a("true", queryParameter3, true)) {
                CommerceChallengeServiceImpl.e().a(uri.getQueryParameter("id"));
            }
            String queryParameter7 = uri.getQueryParameter("group");
            if (!TextUtils.isEmpty(str2) && h.m.p.b(str2, "/detail/", false)) {
                z2 = true;
            }
            if (!h.f.b.l.a((Object) "0", (Object) queryParameter7) && !z2) {
                return null;
            }
            if (!z2 ? (queryParameter = uri.getQueryParameter("id")) == null : (queryParameter = uri.getLastPathSegment()) == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            CommerceChallengeServiceImpl.e().a(uri, queryParameter);
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//challenge/detail");
            if (z2) {
                queryParameter2 = uri.getLastPathSegment();
            } else {
                queryParameter2 = uri.getQueryParameter("id");
            }
            SmartRoute withParam = buildRoute.withParam("id", queryParameter2).withParam("from_token", str3).withParam("show_tab_index", i3).withParam("enter_from", queryParameter5).withParam("extra_challenge_from", queryParameter6);
            try {
                Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
                withParam.withParam("extra_challenge_is_hashtag", true);
            }
            c.a.a("challenge_detail", uri);
            return withParam.buildIntent();
        }
    }

    public static final class g extends aw {
        static {
            Covode.recordClassIndex(41022);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return null;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "change_phone");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            com.ss.android.ugc.aweme.account.b.e().modifyMobile(activity, "scheme", null, null);
        }
    }

    public static final class m extends aw {
        static {
            Covode.recordClassIndex(41030);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) "discovery", (Object) str);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent a2 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
            a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            h.f.b.l.b(a2, "");
            h.a(uri, a2);
            return a2;
        }
    }

    public static final class n extends aw {
        static {
            Covode.recordClassIndex(41031);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "ec_lynxview");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String query = uri.getQuery();
            if (query != null) {
                h.f.b.l.b(query, "");
                HashMap<String, Object> a2 = b.a.a(query);
                String[] strArr = em.f89938b;
                if (strArr != null) {
                    boolean z2 = false;
                    for (String str : strArr) {
                        if (a2.containsKey(str)) {
                            a2.remove(str);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        uri = Uri.parse(uri.getScheme() + "://" + uri.getAuthority() + "?" + b.a.a(a2));
                        h.f.b.l.b(uri, "");
                    }
                }
            }
            SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").authority("lynxview").build().toString()).open();
        }
    }

    public static final class p extends aw {
        static {
            Covode.recordClassIndex(41033);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "feedback_input");
        }

        private static void a(String str, HashMap<String, String> hashMap) {
            if (!(str == null || str.length() == 0)) {
                for (String str2 : h.m.p.b(str, new String[]{"&"})) {
                    List<String> b2 = h.m.p.b(str2, new String[]{"="});
                    if (b2.size() == 2) {
                        hashMap.put(b2.get(0), b2.get(1));
                    }
                }
            }
        }

        private static String b(String str, HashMap<String, String> hashMap) {
            int a2 = h.m.p.a((CharSequence) str, '?', 0, false, 6);
            if (a2 > 0) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                str = str.substring(0, a2);
                h.f.b.l.b(str, "");
            }
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(str);
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                gVar.a(entry.getKey(), entry.getValue());
            }
            String a3 = gVar.a();
            h.f.b.l.b(a3, "");
            return a3;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            int i2;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                h.f.b.l.b(iESSettingsProxy, "");
                FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
                h.f.b.l.b(feedbackConf, "");
                str4 = feedbackConf.getFeHelp();
                h.f.b.l.b(str4, "");
            } catch (com.bytedance.ies.a unused) {
                str4 = "";
            }
            HashMap hashMap = new HashMap();
            String queryParameter = Uri.parse(str4).getQueryParameter("url");
            if (queryParameter == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            int a2 = h.m.p.a((CharSequence) queryParameter, '?', 0, false, 6);
            if (a2 > 0 && queryParameter.length() > (i2 = a2 + 1)) {
                Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type java.lang.String");
                String substring = queryParameter.substring(i2);
                h.f.b.l.b(substring, "");
                a(substring, hashMap);
            }
            a(uri.getEncodedQuery(), hashMap);
            String b2 = b(queryParameter, hashMap);
            String encode = URLEncoder.encode(queryParameter);
            h.f.b.l.b(encode, "");
            String encode2 = URLEncoder.encode(b2);
            h.f.b.l.b(encode2, "");
            return d.a.a(activity, Uri.parse(h.m.p.a(str4, encode, encode2, true)), !z, z);
        }
    }

    public static final class q extends aw {
        static {
            Covode.recordClassIndex(41034);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "feedback_record");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String queryParameter = uri.getQueryParameter("enter_from");
            if (queryParameter == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            com.ss.android.ugc.aweme.feedback.b.a(activity, queryParameter);
        }
    }

    public static final class r extends aw {
        static {
            Covode.recordClassIndex(41035);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) "modern_feed", (Object) str);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent a2 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
            a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            h.f.b.l.b(a2, "");
            h.a(uri, a2);
            return a2;
        }
    }

    public static final class x extends aw {
        static {
            Covode.recordClassIndex(41042);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "lynxview");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String query = uri.getQuery();
            if (query != null) {
                h.f.b.l.b(query, "");
                HashMap<String, Object> a2 = b.a.a(query);
                String[] strArr = em.f89938b;
                if (strArr != null) {
                    boolean z2 = false;
                    for (String str : strArr) {
                        if (a2.containsKey(str)) {
                            a2.remove(str);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        uri = Uri.parse(uri.getScheme() + "://" + uri.getAuthority() + "?" + b.a.a(a2));
                        h.f.b.l.b(uri, "");
                    }
                }
            }
            SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).open();
        }
    }

    public static final class a extends aw {
        static {
            Covode.recordClassIndex(40989);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "friend_recommend";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) (str + str2), (Object) "user/find_friends");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            int i2;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            String queryParameter = uri.getQueryParameter("inviteType");
            if (queryParameter == null) {
                queryParameter = "";
            }
            h.f.b.l.b(queryParameter, "");
            try {
                Integer valueOf = Integer.valueOf(queryParameter);
                h.f.b.l.b(valueOf, "");
                i2 = valueOf.intValue();
            } catch (Exception unused) {
                i2 = 1;
            }
            String queryParameter2 = uri.getQueryParameter("puid");
            String a2 = h.a(queryParameter2, uri, true);
            Intent a3 = com.ss.android.ugc.aweme.friends.service.a.f97047a.a(activity, 0, i2, "", "push");
            if (a3 != null) {
                a3.putExtra("bundle_puid", queryParameter2);
                a3.putExtra("bundle_sec_puid", a2);
                a3.putExtra("bundle_recommend_user_type", queryParameter2);
            }
            return a3;
        }
    }

    public static final class ag extends aw {
        static {
            Covode.recordClassIndex(40997);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (!h.m.p.a("user", str, true) || !h.m.p.a("/favorite/", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            String str = "";
            h.f.b.l.d(activity, str);
            h.f.b.l.d(uri, str);
            String queryParameter = uri.getQueryParameter("tab_name");
            if (queryParameter == null) {
                queryParameter = str;
            }
            String queryParameter2 = uri.getQueryParameter("mix_ids");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            com.ss.android.ugc.aweme.ck.t.a(com.ss.android.ugc.aweme.ck.t.a(), "aweme://favorite?tab_name=" + queryParameter + "&push_ids=" + str);
        }
    }

    public static final class aq extends aw {
        static {
            Covode.recordClassIndex(41010);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) str, (Object) "verify");
        }
    }

    public static final class ar extends aw {
        static {
            Covode.recordClassIndex(41011);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "detail";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) (str + str2), (Object) "user/video");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("enter_from", "push");
            intent.putExtra("refer", "push");
            intent.putExtra("id", uri.getQueryParameter("id"));
            intent.putExtra("cid", uri.getQueryParameter("commentId"));
            c.a.a("detail", uri);
            return intent;
        }
    }

    public static final class at extends aw {
        static {
            Covode.recordClassIndex(41013);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.m.p.b(str, "wallet_index", false) || h.f.b.l.a((Object) str, (Object) "wallet")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    public static final class u extends aw {
        static {
            Covode.recordClassIndex(41038);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "notification";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.f.b.l.a((Object) (str + str2), (Object) "user/imfans");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return SmartRouter.buildRoute(activity, "//notification").withParam("from_where", 0).buildIntent();
        }
    }

    public static final class z extends aw {
        static {
            Covode.recordClassIndex(41044);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "music_detail";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) str, (Object) "music") || h.f.b.l.a((Object) str, (Object) "song")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (h.f.b.l.a((Object) str, (Object) "song")) {
                Intent buildIntent = SmartRouter.buildRoute(activity, "//music/detail").withParam("id", uri.getQueryParameter("trackId")).buildIntent();
                c.a.a("music_detail", uri);
                return buildIntent;
            }
            String queryParameter = uri.getQueryParameter("group");
            boolean z2 = false;
            if (!TextUtils.isEmpty(str2) && h.m.p.b(str2, "/detail/", false)) {
                z2 = true;
            }
            String str4 = null;
            if (!h.f.b.l.a((Object) "0", (Object) queryParameter) && !z2) {
                return null;
            }
            Intent buildIntent2 = SmartRouter.buildRoute(activity, "//music/detail").buildIntent();
            String queryParameter2 = uri.getQueryParameter("id");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = uri.getLastPathSegment();
            }
            if (!h.f.b.l.a((Object) "detail", (Object) queryParameter2) && !h.f.b.l.a((Object) "0", (Object) queryParameter2)) {
                str4 = queryParameter2;
            }
            buildIntent2.putExtra("id", str4);
            buildIntent2.putExtra("from_token", str3);
            buildIntent2.putExtra("partnerName", uri.getQueryParameter("partnerName"));
            buildIntent2.putExtra("partnerMusicId", uri.getQueryParameter("partnerMusicId"));
            buildIntent2.putExtra("extra_music_from", uri.getQueryParameter("enter_from"));
            c.a.a("music_detail", uri);
            return buildIntent2;
        }
    }

    public static final class ae extends aw {
        static {
            Covode.recordClassIndex(40994);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (!h.m.p.a("chatting", str, true) || !h.m.p.a("/message", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            com.ss.android.ugc.aweme.commercialize.im.a.a(activity, uri.getQueryParameter("uid"), uri.getQueryParameter("ext"), null);
        }
    }

    public static final class l extends aw {
        static {
            Covode.recordClassIndex(41029);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "detail";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.m.p.b(str + str2, "aweme/detail_list", false) || h.m.p.b(str + str2, "tuwen/detail_list", false)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
        @Override // com.ss.android.ugc.aweme.aw
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent a(android.app.Activity r11, android.net.Uri r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.b.l.a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    public static final class s extends aw {
        static {
            Covode.recordClassIndex(41036);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "live";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "hotlive/feed", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            ILiveOuterService s = LiveOuterService.s();
            h.f.b.l.b(s, "");
            com.ss.android.ugc.aweme.r.a i2 = s.i();
            if (i2 != null) {
                i2.b(activity, new EnterRoomConfig(), "HotLiveCommand");
            }
        }
    }

    public static final class aa extends aw {
        static {
            Covode.recordClassIndex(40990);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "assmusic/category", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    public static final class ac extends aw {
        static {
            Covode.recordClassIndex(40992);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "personal_homepage";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) "mine", (Object) str) || h.f.b.l.a((Object) (str + str2), (Object) "user/homepage")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin() || z2) {
                Intent a2 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
                h.f.b.l.b(a2, "");
                a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                c.a.a("mine", uri);
                return a2;
            }
            Intent a3 = com.ss.android.ugc.aweme.utils.a.c.a(activity);
            h.f.b.l.b(a3, "");
            return a3;
        }
    }

    public static final class ap extends aw {
        static {
            Covode.recordClassIndex(41009);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "others_homepage";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) (str + str2), (Object) "user/profile") || h.f.b.l.a((Object) str, (Object) "profile")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter == null) {
                queryParameter = uri.getQueryParameter("uid");
            }
            String queryParameter2 = uri.getQueryParameter("unique_id");
            String a2 = h.a(queryParameter, uri, true);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", queryParameter);
            intent.putExtra("sec_user_id", a2);
            intent.putExtra("unique_id", queryParameter2);
            return intent;
        }
    }

    public static final class au extends aw {

        /* renamed from: a  reason: collision with root package name */
        private final int f66661a = 3;

        /* renamed from: b  reason: collision with root package name */
        private final long f66662b = -1;

        /* renamed from: c  reason: collision with root package name */
        private boolean f66663c;

        static {
            Covode.recordClassIndex(41014);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final String a(Uri uri) {
            h.f.b.l.d(uri, "");
            return "live";
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) str, (Object) "sign") || h.f.b.l.a((Object) str, (Object) "webcast_room") || h.f.b.l.a((Object) str, (Object) "webcast_profile") || h.f.b.l.a((Object) str, (Object) "webcast_feed") || h.f.b.l.a((Object) str, (Object) "webcast_feed_activity") || h.f.b.l.a((Object) str, (Object) "webcast_webview") || h.f.b.l.a((Object) str, (Object) "webcast_lynxview")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            int i2;
            String uri2;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            String str = null;
            com.ss.android.ugc.aweme.live.c cVar = null;
            if (h.f.b.l.a((Object) uri.getHost(), (Object) "webcast_feed") || h.f.b.l.a((Object) uri.getHost(), (Object) "webcast_feed_activity")) {
                HashMap hashMap = new HashMap();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        String queryParameter = uri.getQueryParameter(str2);
                        if (queryParameter != null) {
                            hashMap.put(str2, queryParameter);
                        }
                    }
                }
                try {
                    ILiveOuterService s = LiveOuterService.s();
                    h.f.b.l.b(s, "");
                    if (s.l().b()) {
                        if (com.bytedance.android.livesdkapi.f.a() != null) {
                            com.bytedance.android.livesdkapi.service.d a2 = com.bytedance.android.livesdkapi.f.a();
                            if (a2 != null) {
                                Map<String, Object> a3 = a2.a(this.f66662b);
                                if (a3 != null) {
                                    if (a3.get("feed_url") instanceof String) {
                                        Object obj = a3.get("feed_url");
                                        if (obj != null) {
                                            str = (String) obj;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                    }
                                    if (a3.get("feed_style") instanceof Integer) {
                                        Object obj2 = a3.get("feed_style");
                                        if (obj2 != null) {
                                            i2 = ((Integer) obj2).intValue();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    if (com.bytedance.common.utility.m.a(str)) {
                                        return;
                                    }
                                    if (i2 != this.f66661a) {
                                        return;
                                    }
                                    if (com.bytedance.android.livesdkapi.f.a() != null) {
                                        com.bytedance.android.livesdkapi.service.d a4 = com.bytedance.android.livesdkapi.f.a();
                                        if (a4 == null) {
                                            h.f.b.l.b();
                                        }
                                        h.f.b.l.b(a4, "");
                                        if (a4.o() == null) {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (!this.f66663c) {
                            this.f66663c = true;
                        } else {
                            return;
                        }
                        String str3 = (String) hashMap.get("gd_label");
                        String str4 = (String) hashMap.get("enter_from_merge");
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("_param_live_platform", "live");
                        if (str3 != null) {
                            hashMap2.put("gd_label", str3);
                            hashMap2.put("enter_from_merge", "inner_ad");
                        } else {
                            if (str4 == null) {
                                str4 = "";
                            }
                            hashMap2.put("enter_from_merge", str4);
                        }
                        com.ss.android.ugc.aweme.common.r.a("livesdk_enter_live_merge", hashMap2);
                        if (com.bytedance.android.livesdkapi.f.a() != null) {
                            com.bytedance.android.livesdkapi.service.d a5 = com.bytedance.android.livesdkapi.f.a();
                            if (a5 == null) {
                                h.f.b.l.b();
                            }
                            h.f.b.l.b(a5, "");
                            if (a5.o() != null) {
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("intercept", "new_style");
                                String str5 = (String) hashMap.get("gd_label");
                                if (str5 != null) {
                                    hashMap3.put("gd_label", str5);
                                }
                                String str6 = (String) hashMap.get("enter_from_merge");
                                if (str6 != null) {
                                    hashMap3.put("enter_from_merge", str6);
                                }
                                String str7 = (String) hashMap.get("enter_method");
                                if (str7 != null) {
                                    hashMap3.put("enter_method", str7);
                                }
                                com.bytedance.android.livesdkapi.service.d a6 = com.bytedance.android.livesdkapi.f.a();
                                if (a6 == null) {
                                    h.f.b.l.b();
                                }
                                h.f.b.l.b(a6, "");
                                a6.o().a(hashMap3);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                if (h.f.b.l.a((Object) uri.getHost(), (Object) "webcast_webview") || h.f.b.l.a((Object) uri.getHost(), (Object) "webcast_lynxview")) {
                    ILiveOuterService s2 = LiveOuterService.s();
                    h.f.b.l.b(s2, "");
                    ILiveOuterService s3 = LiveOuterService.s();
                    h.f.b.l.b(s3, "");
                    String[] strArr = (String[]) s3.d().a("deeplink_webcast_webview_allowed_list", new String[0]);
                    if (((Boolean) s2.d().a("deeplink_webcast_webview_enable", (Object) false)).booleanValue()) {
                        String queryParameter2 = uri.getQueryParameter("url");
                        if (com.bytedance.common.utility.m.a(queryParameter2) || (uri2 = Uri.parse(queryParameter2).toString()) == null) {
                            uri2 = "";
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            Uri parse = Uri.parse(uri2);
                            h.f.b.l.b(parse, "");
                            for (String str8 : strArr) {
                                if (!h.f.b.l.a((Object) "https", (Object) parse.getScheme()) || parse.getUserInfo() != null || !h.f.b.l.a((Object) str8, (Object) parse.getHost())) {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    Uri.Builder appendQueryParameter = Uri.parse(uri.toString()).buildUpon().appendQueryParameter("is_from_push", String.valueOf(z));
                    if (!z) {
                        appendQueryParameter.appendQueryParameter("sec_link_scene", "deeplink");
                    }
                    Uri build = appendQueryParameter.build();
                    h.f.b.l.b(build, "");
                    uri = build;
                } catch (Throwable th) {
                    com.bytedance.c.a.a.a.b.a(th);
                }
                try {
                    ILiveOuterService s4 = LiveOuterService.s();
                    if (s4 == null || (cVar = s4.d()) == null) {
                        h.f.b.l.b();
                    }
                    cVar.a(activity, uri);
                } catch (Throwable th2) {
                    com.bytedance.c.a.a.a.b.a(th2);
                }
            }
        }
    }

    public static final class e extends aw {
        static {
            Covode.recordClassIndex(41020);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return null;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) str, (Object) "mobile") || h.f.b.l.a((Object) str, (Object) "bind_phone")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            com.ss.android.ugc.aweme.account.b.e().bindMobile(activity, "scheme", null, null);
        }
    }

    public static final class i extends aw {
        static {
            Covode.recordClassIndex(41024);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            if (h.f.b.l.a((Object) (str + str2), (Object) "user/addressbook/list") || h.f.b.l.a((Object) str, (Object) "friendRecommend") || h.f.b.l.a((Object) str, (Object) "newFriendRecommend")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, ContactsActivity.class);
            if (!TextUtils.isEmpty(null)) {
                intent.putExtra("enter_from", (String) null);
            }
            intent.putExtra("just_granted_read_contacts", false);
            return intent;
        }
    }

    public static final class o extends aw {
        static {
            Covode.recordClassIndex(41032);
        }

        private static Uri a(Uri uri, String str) {
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            h.f.b.l.b(queryParameterNames, "");
            ArrayList<String> arrayList = new ArrayList();
            for (T t : queryParameterNames) {
                if (!h.f.b.l.a((Object) t, (Object) str)) {
                    arrayList.add(t);
                }
            }
            for (String str2 : arrayList) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
            Uri build = clearQuery.build();
            h.f.b.l.b(build, "");
            return build;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(Uri uri, String str, String str2, String str3) {
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (!h.f.b.l.a((Object) "ec", (Object) str2)) {
                return false;
            }
            switch (str3.hashCode()) {
                case -685527820:
                    if (str3.equals("/address/edit")) {
                        return true;
                    }
                    return false;
                case -685314168:
                    if (str3.equals("/address/list")) {
                        return true;
                    }
                    return false;
                case -335200235:
                    if (str3.equals("/order_center")) {
                        return true;
                    }
                    return false;
                case 1511021:
                    if (str3.equals("/pdp")) {
                        return true;
                    }
                    return false;
                case 43085793:
                    if (str3.equals("/order/detail")) {
                        return true;
                    }
                    return false;
                case 137278424:
                    if (str3.equals("/order_submit")) {
                        return true;
                    }
                    return false;
                case 852758595:
                    if (str3.equals("/order_submit_v2")) {
                        return true;
                    }
                    return false;
                case 1315188432:
                    if (str3.equals("/bind_result")) {
                        return true;
                    }
                    return false;
                case 1923799401:
                    if (str3.equals("/order/middle_page")) {
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (h.f.b.l.a((Object) uri.getPath(), (Object) "/pdp")) {
                String queryParameter = uri.getQueryParameter("fullScreen");
                if (queryParameter == null) {
                    queryParameter = "false";
                }
                h.f.b.l.b(queryParameter, "");
                if (true ^ h.f.b.l.a((Object) queryParameter, (Object) "true")) {
                    uri = a(uri, "fullScreen").buildUpon().appendQueryParameter("fullScreen", "true").build();
                    h.f.b.l.b(uri, "");
                }
                return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
            }
            String queryParameter2 = uri.getQueryParameter("fallback");
            if (queryParameter2 == null || queryParameter2.length() == 0) {
                return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
            }
            return SmartRouter.buildRoute(activity, a(uri, "fallback").buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    public static final class y extends aw {
        static {
            Covode.recordClassIndex(41043);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            return h.m.p.b(str + str2, "notice/detail", false);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, MusNotificationDetailActivity.class);
            intent.putExtra("from_where", uri.getQueryParameter("from_where"));
            intent.putExtra("unRead_message_count", uri.getQueryParameter("unRead_message_count"));
            intent.putExtra("second_tab_name", uri.getQueryParameter("second_tab_name"));
            intent.putExtra("notice_name", uri.getQueryParameter("notice_name"));
            return intent;
        }
    }

    public static final class ak extends aw {
        static {
            Covode.recordClassIndex(41002);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            SmartRouter.buildRoute(activity, "//qna/detail").withParam("id", uri.getLastPathSegment()).open();
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(Uri uri, String str, String str2, String str3) {
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return h.f.b.l.a((Object) str2, (Object) "qna");
        }
    }

    public static final class d extends aw {
        static {
            Covode.recordClassIndex(41019);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final void a(Activity activity, Uri uri, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            SmartRouter.buildRoute(activity, "//baautomessaging").open();
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(Uri uri, String str, String str2, String str3) {
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return h.f.b.l.a((Object) str2, (Object) "baautomessaging");
        }
    }

    public static final class t extends aw {
        static {
            Covode.recordClassIndex(41037);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2, String str3) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            if (h.f.b.l.a((Object) str, (Object) "https") || h.f.b.l.a((Object) str, (Object) "http")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            Intent intent = new Intent(activity, CrossPlatformActivity.class);
            String uri2 = uri.toString();
            h.f.b.l.b(uri2, "");
            if (z) {
                str4 = "push";
            } else {
                str4 = "deeplink";
            }
            intent.setData(Uri.parse(com.ss.android.ugc.aweme.app.i.a.a(uri2, str4)));
            if (z) {
                intent.putExtra("hide_more", false);
                intent.putExtra("enter_from", "notification");
            }
            c.a.a("h5", uri);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$b  reason: collision with other inner class name */
    public static final class C1494b extends aw {
        static {
            Covode.recordClassIndex(41016);
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final boolean a(String str, String str2, String str3) {
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return h.f.b.l.a((Object) str2, (Object) "anywhere");
        }

        @Override // com.ss.android.ugc.aweme.aw
        public final Intent a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(uri, "");
            h.f.b.l.d(str, "");
            h.f.b.l.d(str2, "");
            h.f.b.l.d(str3, "");
            return SmartRouter.buildRoute(activity, uri.toString()).buildIntent();
        }
    }
}
