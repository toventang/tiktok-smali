package com.ss.android.ugc.aweme.friends.f;

import android.net.Uri;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.invite.e;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c implements InviteContactFriendsModel.IFetchShareConfigCallback {

    /* renamed from: a  reason: collision with root package name */
    final InviteContactFriendsModel f96837a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<a> f96838b;

    /* renamed from: c  reason: collision with root package name */
    private e f96839c;

    public interface a {
        static {
            Covode.recordClassIndex(61449);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(61450);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(61448);
    }

    @Override // com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback
    public final void onFailed() {
    }

    public final void a() {
        this.f96837a.fetchShareConfig(this);
    }

    public final String b() {
        String str;
        try {
            str = this.f96839c.getUrl();
        } catch (Exception e2) {
            e2.printStackTrace();
            str = null;
        }
        if (m.a(str)) {
            return "https://m.tiktok.com/invitef/download";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.IFetchShareConfigCallback
    public final void onSuccess(e eVar) {
        this.f96839c = eVar;
        this.f96838b.get();
    }

    public final String a(String str) {
        String str2;
        try {
            String text = this.f96839c.getText();
            String quote = Pattern.quote("%@");
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            return text.replaceFirst(quote, Matcher.quoteReplacement(str2));
        } catch (Exception e2) {
            e2.printStackTrace();
            return com.a.a(com.ss.android.ugc.aweme.framework.d.a.f96678a.getString(R.string.atr), new Object[]{str});
        } catch (Throwable unused) {
            return com.ss.android.ugc.aweme.framework.d.a.f96678a.getString(R.string.atr);
        }
    }

    public c(InviteContactFriendsModel inviteContactFriendsModel, a aVar) {
        this.f96837a = inviteContactFriendsModel;
        this.f96838b = new WeakReference<>(aVar);
    }

    public final void a(String str, b bVar) {
        com.bytedance.common.utility.b.e.a(new d(this, str, bVar));
    }

    public static String a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (m.a(str)) {
            return " ";
        }
        if (z) {
            str5 = "manual";
        } else {
            str5 = "0";
        }
        if (m.a(str2)) {
            str2 = "0";
        }
        try {
            str = Uri.parse(str).buildUpon().appendQueryParameter("user_id", in.i(curUser)).appendQueryParameter("enter_from", str4).appendQueryParameter("invitemode", str3).appendQueryParameter("invitesystem", str5).appendQueryParameter("platform", str2).appendQueryParameter("copytype", "0").build().toString();
            return str;
        } catch (Exception unused) {
            return str;
        }
    }
}
