package com.ss.android.ugc.aweme.recommend.users;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Point;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.friends.i.c;
import com.ss.android.ugc.aweme.friends.model.DislikeRecommendParams;
import com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.ss.android.ugc.aweme.inbox.c.a;
import com.ss.android.ugc.aweme.social.api.RecommendUserApiService;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.m.p;

public final class IRecommendUsersServiceImpl implements IRecommendUsersService {

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120111a = new a();

        static {
            Covode.recordClassIndex(78073);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(78072);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final com.ss.android.ugc.aweme.profile.service.f i() {
        return c.f96876a;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final com.ss.android.ugc.aweme.friends.g.a a() {
        return new com.ss.android.ugc.aweme.friends.recommendlist.repository.f();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final t<RecommendUserInDMBean> h() {
        return RecommendUserApiService.f133669a.fetchRecommendUserForDMPage();
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean b() {
        if (com.ss.android.ugc.aweme.recommend.users.a.a.a() == null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean c() {
        com.ss.android.ugc.aweme.recommend.users.a.b a2 = com.ss.android.ugc.aweme.recommend.users.a.a.a();
        if (a2 == null || a2.f120117b != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean d() {
        com.ss.android.ugc.aweme.recommend.users.a.b a2 = com.ss.android.ugc.aweme.recommend.users.a.a.a();
        if (a2 == null || a2.f120118c != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean e() {
        com.ss.android.ugc.aweme.recommend.users.a.b a2 = com.ss.android.ugc.aweme.recommend.users.a.a.a();
        if (a2 == null || a2.f120119d != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean f() {
        com.ss.android.ugc.aweme.recommend.users.a.b a2 = com.ss.android.ugc.aweme.recommend.users.a.a.a();
        if (a2 == null || a2.f120120e != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final boolean g() {
        com.ss.android.ugc.aweme.recommend.users.a.b a2 = com.ss.android.ugc.aweme.recommend.users.a.a.a();
        if (a2 == null || a2.f120121f != 1) {
            return false;
        }
        return true;
    }

    public static IRecommendUsersService j() {
        Object a2 = com.ss.android.ugc.b.a(IRecommendUsersService.class, false);
        if (a2 != null) {
            return (IRecommendUsersService) a2;
        }
        return new IRecommendUsersServiceImpl();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120112a = new b();

        static {
            Covode.recordClassIndex(78074);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void a(e eVar) {
        Display display;
        MethodCollector.i(11970);
        l.d(eVar, "");
        l.d(eVar, "");
        Resources resources = eVar.getResources();
        WindowManager.LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(eVar).inflate(R.layout.lf, (ViewGroup) null);
        l.b(inflate, "");
        View findViewById = inflate.findViewById(R.id.f8h);
        l.b(findViewById, "");
        TextView textView = (TextView) findViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(androidx.core.content.b.c(textView.getContext(), R.color.c9));
        Dialog dialog = new Dialog(eVar, R.style.v2);
        dialog.setCancelable(true);
        dialog.setContentView(inflate);
        WindowManager windowManager = eVar.getWindowManager();
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        Window window = dialog.getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.x = 0;
            layoutParams.gravity = 80;
            layoutParams.windowAnimations = R.style.v1;
        }
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
        }
        if (layoutParams != null) {
            layoutParams.width = point.x;
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        String string = resources.getString(R.string.cwj);
        l.b(string, "");
        String string2 = resources.getString(R.string.cab, string);
        l.b(string2, "");
        int a2 = p.a((CharSequence) string2, string, 0, false, 6);
        int length = string.length() + a2;
        SpannableString spannableString = new SpannableString(string2);
        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a2 >= 0) {
            spannableString.setSpan(new a.C2650a(dialog, eVar, textView), a2, length, 34);
            spannableString.setSpan(new StyleSpan(1), a2, length, 34);
        }
        textView.setText(spannableString);
        dialog.show();
        MethodCollector.o(11970);
    }

    @Override // com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    public final void a(String str, String str2) {
        l.d(str, "");
        new com.ss.android.ugc.aweme.friends.recommendlist.repository.a().c(new DislikeRecommendParams(str, str2)).a(a.f120111a, b.f120112a);
    }
}
