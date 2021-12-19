package com.ss.android.ugc.aweme.ad.feed.reminder;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.commercialize.util.c;
import com.ss.android.ugc.aweme.feed.model.AdNoticeModel;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;

public final class StickerReminderRouter implements IRouteAction {
    static {
        Covode.recordClassIndex(40595);
    }

    public static int com_ss_android_ugc_aweme_ad_feed_reminder_StickerReminderRouter_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f66000a;

        static {
            Covode.recordClassIndex(40597);
        }

        b(e eVar) {
            this.f66000a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f66000a != null) {
                new com.bytedance.tux.g.b(this.f66000a).e(R.string.de2).b();
            }
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f65991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f65992b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f65993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f65994d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f65995e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f65996f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f65997g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f65998h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f65999i;

        static {
            Covode.recordClassIndex(40596);
        }

        a(Context context, e eVar, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f65991a = context;
            this.f65992b = eVar;
            this.f65993c = str;
            this.f65994d = str2;
            this.f65995e = str3;
            this.f65996f = str4;
            this.f65997g = str5;
            this.f65998h = str6;
            this.f65999i = str7;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            AdNoticeModel adNoticeModel = (AdNoticeModel) obj;
            if (this.f65991a != null && this.f65992b != null) {
                e eVar = this.f65992b;
                String str = this.f65993c;
                String str2 = this.f65994d;
                if (str2 == null) {
                    str2 = "0";
                }
                String str3 = this.f65995e;
                String str4 = this.f65996f;
                String str5 = this.f65997g;
                if (str5 == null) {
                    str5 = "";
                }
                new a.C1112a().a(new a(eVar, str, str2, str3, str4, str5, adNoticeModel.getSubscriptionStatus(), this.f65998h, this.f65999i)).b((int) n.b(this.f65991a, 380.0f)).a(true).f45299a.show(this.f65992b.getSupportFragmentManager(), "stickerReminderSheet");
            }
        }
    }

    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        com_ss_android_ugc_aweme_ad_feed_reminder_StickerReminderRouter_com_ss_android_ugc_aweme_lancet_LogLancet_d("message_shixingyi", "url = " + str + "   extra = " + bundle);
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("account_name");
        String queryParameter2 = parse.getQueryParameter("reminder_time");
        if (queryParameter2 == null) {
            queryParameter2 = "0";
        }
        l.b(queryParameter2, "");
        String queryParameter3 = parse.getQueryParameter("cid");
        if (queryParameter3 == null) {
            queryParameter3 = "";
        }
        l.b(queryParameter3, "");
        String queryParameter4 = parse.getQueryParameter("learn_more_url");
        String queryParameter5 = parse.getQueryParameter("log_id");
        String queryParameter6 = parse.getQueryParameter("log_extra");
        if (queryParameter6 == null) {
            queryParameter6 = "";
        }
        l.b(queryParameter6, "");
        String queryParameter7 = parse.getQueryParameter("enter_from");
        if (queryParameter7 == null) {
            queryParameter7 = "";
        }
        l.b(queryParameter7, "");
        e a2 = b.a(context);
        if (Long.parseLong(queryParameter2) > System.currentTimeMillis()) {
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            if (!createIUserServicebyMonsterPlugin.isLogin()) {
                return false;
            }
        }
        ((AdNoticeApi) com.ss.android.ugc.aweme.commercialize.util.b.a.a(AdNoticeApi.class, c.f75475a)).getAdNotice(queryParameter3).a(new a(context, a2, queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, queryParameter6, queryParameter7), new b(a2));
        return true;
    }
}
