package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.ad.feed.f;
import com.ss.android.ugc.aweme.commerce.j;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.f.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.av;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public class EnterpriseTransformLayout extends LinearLayout {
    private static final int n = ((int) n.b(d.a(), 16.0f));

    /* renamed from: a  reason: collision with root package name */
    public TextView f116749a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f116750b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f116751c;

    /* renamed from: d  reason: collision with root package name */
    public View f116752d;

    /* renamed from: e  reason: collision with root package name */
    List<String> f116753e;

    /* renamed from: f  reason: collision with root package name */
    List<String> f116754f;

    /* renamed from: g  reason: collision with root package name */
    SparseBooleanArray f116755g;

    /* renamed from: h  reason: collision with root package name */
    public User f116756h;

    /* renamed from: i  reason: collision with root package name */
    Activity f116757i;

    /* renamed from: j  reason: collision with root package name */
    public Aweme f116758j;

    /* renamed from: k  reason: collision with root package name */
    String f116759k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f116760l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f116761m;
    private boolean o;

    private static int a(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : 5;
        }
        return 6;
    }

    static {
        Covode.recordClassIndex(75413);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f116756h == null) {
            return false;
        }
        return TextUtils.equals(b.g().getCurUserId(), this.f116756h.getUid());
    }

    public final void a() {
        String uid;
        if (in.c() == null || !TextUtils.equals(in.c().getUid(), this.f116756h.getUid())) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (in.c() == null) {
                uid = "0";
            } else {
                uid = in.c().getUid();
            }
            r.a("ttelite_BA_download_link_show", dVar.a("from_user_id", uid).a("to_user_id", this.f116756h.getUid()).a("enter_from", this.f116759k).f66730a);
        }
        this.f116761m = true;
    }

    public void setHasShownDownloadLink(boolean z) {
        this.f116761m = z;
    }

    public void setIsVisibleToUser(boolean z) {
        this.o = z;
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f116763a;

        /* renamed from: b  reason: collision with root package name */
        public String f116764b;

        /* renamed from: c  reason: collision with root package name */
        public String f116765c;

        static {
            Covode.recordClassIndex(75415);
        }

        private a() {
        }

        public /* synthetic */ a(EnterpriseTransformLayout enterpriseTransformLayout, byte b2) {
            this();
        }
    }

    public void setEnterFrom(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "Other";
        }
        this.f116759k = str;
    }

    static JSONObject a(String str) {
        s sVar = new s();
        sVar.a("link_type", str);
        return sVar.a();
    }

    public static boolean a(User user) {
        if (in.g(user)) {
            if (user.getAccountType() != 3 || !ae.a()) {
                return false;
            }
            return true;
        } else if (user.getAccountType() == 3) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean c(String str) {
        Activity activity;
        if (!TextUtils.isEmpty(str) && (activity = this.f116757i) != null) {
            try {
                av.a(str, str, activity, PrivacyCert.Builder.with("bpea-220").usage("On the profile page, long press to copy the email address. ").tag("longPressToCopyEmailAdress").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            }
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f116757i).a(R.string.a7q).a();
        return true;
    }

    public final a a(j jVar) {
        if (jVar == null) {
            return null;
        }
        a aVar = new a(this, (byte) 0);
        aVar.f116763a = a(jVar.getOfflineInfoType());
        aVar.f116765c = jVar.getAction();
        aVar.f116764b = jVar.getText();
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        String str2;
        String str3;
        if (this.f116756h != null) {
            Aweme aweme = this.f116758j;
            if (aweme != null && com.ss.android.ugc.aweme.commercialize.e.a.b.X(aweme)) {
                g.a().m(getContext(), this.f116758j);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "homepagelink_click", this.f116758j.getAwemeRawAd()).c();
            }
            getContext();
            String str4 = "personal_homepage";
            if (b()) {
                str2 = str4;
            } else {
                str2 = "others_homepage";
            }
            r.a("click_link", str2, this.f116756h.getUid(), "0", a(str));
            com.ss.android.ugc.aweme.ad.feed.d.a aVar = f.f65854a.f65855b;
            String str5 = "";
            long j2 = 0;
            if (aVar != null) {
                if (aVar.f65815a != null) {
                    j2 = aVar.f65815a.longValue();
                }
                str3 = aVar.f65816b;
            } else {
                str3 = str5;
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("author_id", this.f116756h.getUid());
            if (!b()) {
                str4 = "others_homepage";
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("enter_from", str4).a("link_type", str);
            Aweme aweme2 = this.f116758j;
            if (aweme2 != null) {
                str5 = aweme2.getAid();
            }
            r.a("click_link", a3.a("group_id", str5).a("cid", j2).a("log_extra", str3).f66730a);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.f116758j)) {
                str.hashCode();
                if (str.equals("web_link")) {
                    g.a().o(getContext(), this.f116758j);
                } else if (str.equals("download_link")) {
                    g.a().n(getContext(), this.f116758j);
                }
            }
        }
    }

    public final void a(List<a> list) {
        User user = this.f116756h;
        if (user != null) {
            if (user.getBizAccountInfo() != null && !TextUtils.isEmpty(this.f116756h.getBizAccountInfo().getAndroidDownloadAppLink())) {
                a aVar = new a(this, (byte) 0);
                aVar.f116763a = 5;
                aVar.f116765c = this.f116756h.getBizAccountInfo().getAndroidDownloadAppLink();
                aVar.f116764b = getResources().getString(R.string.a8);
                list.add(aVar);
            } else if (this.f116756h.getCommerceInfo() != null && !com.bytedance.common.utility.collection.b.a((Collection) this.f116756h.getCommerceInfo().getOfflineInfoList())) {
                for (j jVar : this.f116756h.getCommerceInfo().getOfflineInfoList()) {
                    if (jVar != null && jVar.getOfflineInfoType() == 2) {
                        list.add(a(jVar));
                        return;
                    }
                }
            }
        }
    }

    public EnterpriseTransformLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static void a(View view, int i2) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i2;
            int i3 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginStart(i2);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private EnterpriseTransformLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(9186);
        this.f116753e = new ArrayList();
        this.f116754f = new ArrayList();
        this.f116755g = new SparseBooleanArray(2);
        this.f116759k = null;
        this.f116760l = true;
        this.f116761m = false;
        this.o = false;
        LayoutInflater.from(context).inflate(R.layout.aom, this);
        setOrientation(1);
        this.f116749a = (TextView) findViewById(R.id.eq8);
        this.f116750b = (TextView) findViewById(R.id.eq9);
        this.f116751c = (TextView) findViewById(R.id.eq_);
        this.f116752d = findViewById(R.id.al9);
        this.f116753e.clear();
        this.f116754f.clear();
        MethodCollector.o(9186);
    }

    public final void a(TextView textView, a aVar, int i2) {
        String str;
        String str2;
        String str3 = "";
        if (aVar == null || aVar.f116764b == null) {
            textView.setText(str3);
            return;
        }
        textView.setVisibility(0);
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        this.f116757i = j2;
        if (j2 != null) {
            SpannableString spannableString = new SpannableString("[label] " + aVar.f116764b);
            com.ss.android.ugc.aweme.commercialize.ad.a aVar2 = null;
            if (aVar.f116765c != null) {
                str = aVar.f116765c;
            } else {
                str = str3;
            }
            int i3 = aVar.f116763a;
            if (i3 == 1) {
                aVar2 = new com.ss.android.ugc.aweme.commercialize.ad.a(textView.getContext(), 2131233422);
                textView.setOnClickListener(new z(this, str, str3));
                textView.setOnLongClickListener(new aa(this, str));
            } else if (i3 == 4) {
                aVar2 = new com.ss.android.ugc.aweme.commercialize.ad.a(textView.getContext(), 2131233422);
                textView.setOnClickListener(new ab(this, str3));
            } else if (i3 == 5) {
                str3 = "download_link";
                aVar2 = new com.ss.android.ugc.aweme.commercialize.ad.a(textView.getContext(), 2131233421);
                textView.setOnClickListener(new ac(this, str, str3));
                if (!this.f116761m && this.o) {
                    a();
                }
            } else if (i3 == 6) {
                str3 = "web_link";
                aVar2 = new com.ss.android.ugc.aweme.commercialize.ad.a(textView.getContext(), 2131233432);
                textView.setOnClickListener(new ad(this, str, aVar, str3));
            }
            User user = this.f116756h;
            if (user != null && !TextUtils.isEmpty(user.getUid()) && !this.f116755g.get(i2)) {
                this.f116753e.add(str3);
                this.f116754f.add(str);
                this.f116755g.put(i2, true);
                if (b()) {
                    str2 = "personal_homepage";
                } else {
                    str2 = "others_homepage";
                }
                getContext();
                r.a("show_link", str2, this.f116756h.getUid(), "0", a(str3));
                r.a("show_link", new com.ss.android.ugc.aweme.app.f.d().a("author_id", this.f116756h.getUid()).a("enter_from", str2).a("link_type", str3).f66730a);
            }
            if (aVar2 != null) {
                spannableString.setSpan(aVar2, 0, 7, 17);
                textView.setText(spannableString);
                if (textView == this.f116750b) {
                    a(textView, n);
                }
                if (textView.getLayoutParams().height != -2) {
                    textView.getLayoutParams().height = -2;
                    textView.setLayoutParams(textView.getLayoutParams());
                }
                com.ss.android.ugc.aweme.utils.j.a(textView);
            }
        }
    }
}
