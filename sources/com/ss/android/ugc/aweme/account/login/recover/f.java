package com.ss.android.ugc.aweme.account.login.recover;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.recover.g;
import com.ss.android.ugc.aweme.account.login.v;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class f extends com.ss.android.ugc.aweme.account.login.v2.ui.a.a implements WeakHandler.IHandler, g.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63600b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f63601a;

    /* renamed from: c  reason: collision with root package name */
    private WeakHandler f63602c;

    /* renamed from: d  reason: collision with root package name */
    private final v[] f63603d = v.values();

    /* renamed from: e  reason: collision with root package name */
    private g f63604e;

    /* renamed from: j  reason: collision with root package name */
    private HashMap f63605j;

    static {
        Covode.recordClassIndex(39214);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f63605j == null) {
            this.f63605j = new HashMap();
        }
        View view = (View) this.f63605j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63605j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.h5;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f63605j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39215);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Serializable {
        private final String avatar_url;
        private final String email;
        private final String mobile;
        private boolean needStoreLastMethod;
        private final String nickname;
        private final List<String> oauth_platform;
        private final boolean safe;
        private final String ticket;

        static {
            Covode.recordClassIndex(39216);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.recover.f$b */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b copy$default(b bVar, String str, String str2, String str3, String str4, List list, String str5, boolean z, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.avatar_url;
            }
            if ((i2 & 2) != 0) {
                str2 = bVar.nickname;
            }
            if ((i2 & 4) != 0) {
                str3 = bVar.email;
            }
            if ((i2 & 8) != 0) {
                str4 = bVar.mobile;
            }
            if ((i2 & 16) != 0) {
                list = bVar.oauth_platform;
            }
            if ((i2 & 32) != 0) {
                str5 = bVar.ticket;
            }
            if ((i2 & 64) != 0) {
                z = bVar.safe;
            }
            if ((i2 & 128) != 0) {
                z2 = bVar.needStoreLastMethod;
            }
            return bVar.copy(str, str2, str3, str4, list, str5, z, z2);
        }

        public final String component1() {
            return this.avatar_url;
        }

        public final String component2() {
            return this.nickname;
        }

        public final String component3() {
            return this.email;
        }

        public final String component4() {
            return this.mobile;
        }

        public final List<String> component5() {
            return this.oauth_platform;
        }

        public final String component6() {
            return this.ticket;
        }

        public final boolean component7() {
            return this.safe;
        }

        public final boolean component8() {
            return this.needStoreLastMethod;
        }

        public final b copy(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
            return new b(str, str2, str3, str4, list, str5, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.avatar_url, bVar.avatar_url) && l.a(this.nickname, bVar.nickname) && l.a(this.email, bVar.email) && l.a(this.mobile, bVar.mobile) && l.a(this.oauth_platform, bVar.oauth_platform) && l.a(this.ticket, bVar.ticket) && this.safe == bVar.safe && this.needStoreLastMethod == bVar.needStoreLastMethod;
        }

        public final int hashCode() {
            String str = this.avatar_url;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.nickname;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.email;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.mobile;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<String> list = this.oauth_platform;
            int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
            String str5 = this.ticket;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            int i3 = (hashCode5 + i2) * 31;
            boolean z = this.safe;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = (i3 + i5) * 31;
            if (!this.needStoreLastMethod) {
                i4 = 0;
            }
            return i8 + i4;
        }

        public final String toString() {
            return "RecoverAccountModel(avatar_url=" + this.avatar_url + ", nickname=" + this.nickname + ", email=" + this.email + ", mobile=" + this.mobile + ", oauth_platform=" + this.oauth_platform + ", ticket=" + this.ticket + ", safe=" + this.safe + ", needStoreLastMethod=" + this.needStoreLastMethod + ")";
        }

        public final String getAvatar_url() {
            return this.avatar_url;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getMobile() {
            return this.mobile;
        }

        public final boolean getNeedStoreLastMethod() {
            return this.needStoreLastMethod;
        }

        public final String getNickname() {
            return this.nickname;
        }

        public final List<String> getOauth_platform() {
            return this.oauth_platform;
        }

        public final boolean getSafe() {
            return this.safe;
        }

        public final String getTicket() {
            return this.ticket;
        }

        public final void setNeedStoreLastMethod(boolean z) {
            this.needStoreLastMethod = z;
        }

        public b(String str, String str2, String str3, String str4, List<String> list, String str5, boolean z, boolean z2) {
            this.avatar_url = str;
            this.nickname = str2;
            this.email = str3;
            this.mobile = str4;
            this.oauth_platform = list;
            this.ticket = str5;
            this.safe = z;
            this.needStoreLastMethod = z2;
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(getString(R.string.fa9), null, false, null, null, true, null, false, false, 1358);
    }

    private final String g() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f63601a;
        if (bVar != null) {
            if (!TextUtils.isEmpty(bVar.getMobile())) {
                arrayList.add("mobile");
            }
            b bVar2 = this.f63601a;
            if (bVar2 == null) {
                l.b();
            }
            if (!TextUtils.isEmpty(bVar2.getEmail())) {
                arrayList.add("email");
            }
            b bVar3 = this.f63601a;
            if (bVar3 == null) {
                l.b();
            }
            if (bVar3.getOauth_platform() != null) {
                b bVar4 = this.f63601a;
                if (bVar4 == null) {
                    l.b();
                }
                List<String> oauth_platform = bVar4.getOauth_platform();
                if (oauth_platform == null) {
                    l.b();
                }
                arrayList.addAll(oauth_platform);
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((String) it.next()) + ',');
        }
        if (!TextUtils.isEmpty(sb)) {
            sb.setLength(sb.length() - 1);
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        super.onCreate(bundle);
        this.f63602c = new WeakHandler(this);
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("verify_account_data");
        } else {
            serializable = null;
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.recover.RecoverVerifyAccountFragment.RecoverAccountModel");
        this.f63601a = (b) serializable;
        Context context = getContext();
        List<g.c> a2 = a(this.f63601a);
        b bVar = this.f63601a;
        if (bVar != null) {
            str = bVar.getNickname();
        } else {
            str = null;
        }
        b bVar2 = this.f63601a;
        if (bVar2 != null) {
            str2 = bVar2.getAvatar_url();
        } else {
            str2 = null;
        }
        b bVar3 = this.f63601a;
        if (bVar3 != null) {
            bool = Boolean.valueOf(bVar3.getSafe());
        }
        g gVar = new g(context, a2, str, str2, bool);
        this.f63604e = gVar;
        l.d(this, "");
        gVar.f63608a = this;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63606a;

        static {
            Covode.recordClassIndex(39217);
        }

        c(f fVar) {
            this.f63606a = fVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f63606a.f63601a != null) {
                b bVar = this.f63606a.f63601a;
                if (bVar == null) {
                    l.b();
                }
                boolean z = !TextUtils.isEmpty(bVar.getMobile());
                b bVar2 = this.f63606a.f63601a;
                if (bVar2 == null) {
                    l.b();
                }
                boolean z2 = !TextUtils.isEmpty(bVar2.getEmail());
                Bundle arguments = this.f63606a.getArguments();
                String str2 = null;
                String string = arguments != null ? arguments.getString("feedback_param") : null;
                Context context = this.f63606a.getContext();
                this.f63606a.w();
                this.f63606a.x();
                b bVar3 = this.f63606a.f63601a;
                String nickname = bVar3 != null ? bVar3.getNickname() : null;
                if (context != null) {
                    try {
                        str2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeConfigCollection().getRecoverAccountVerificationFormUrl().getSchema();
                    } catch (com.bytedance.ies.a e2) {
                        e2.printStackTrace();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Frn%2Faccount_recover%2F%3Fhide_nav_bar%3D1&hide_nav_bar=1&rn_schema=aweme%3A%2F%2Freactnative%2F%3Fmodule_name%3Dpage_account_recover%26channel%3Dtiktok_rn_account_recover%26bundle%3Dindex.js";
                    }
                    t a2 = t.a();
                    Uri parse = Uri.parse(str2);
                    Uri.Builder builder = new Uri.Builder();
                    builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                    for (String str3 : parse.getQueryParameterNames()) {
                        String valueOf = String.valueOf(z);
                        String valueOf2 = String.valueOf(z2);
                        if (TextUtils.equals("url", str3) || TextUtils.equals("rn_schema", str3)) {
                            str = com.ss.android.ugc.aweme.account.n.g.a(str3, parse, nickname, valueOf, valueOf2, string);
                        } else {
                            str = parse.getQueryParameter(str3);
                        }
                        builder.appendQueryParameter(str3, str);
                    }
                    t.a(a2, builder.build().toString());
                }
            }
        }
    }

    private final List<g.c> a(b bVar) {
        String string;
        String string2;
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            if (bVar.getMobile() != null && !TextUtils.isEmpty(bVar.getMobile())) {
                g.c cVar = new g.c();
                cVar.setMethodType(1);
                Context context = getContext();
                cVar.setMethodName(context != null ? context.getString(R.string.d__) : null);
                if (bVar.getSafe()) {
                    string2 = bVar.getMobile();
                } else {
                    Context context2 = getContext();
                    string2 = context2 != null ? context2.getString(R.string.f_t) : null;
                }
                cVar.setMethodInfo(string2);
                arrayList.add(cVar);
            }
            if (bVar.getEmail() != null && !TextUtils.isEmpty(bVar.getEmail())) {
                g.c cVar2 = new g.c();
                cVar2.setMethodType(2);
                Context context3 = getContext();
                cVar2.setMethodName(context3 != null ? context3.getString(R.string.d7w) : null);
                if (bVar.getSafe()) {
                    string = bVar.getEmail();
                } else {
                    Context context4 = getContext();
                    string = context4 != null ? context4.getString(R.string.f_t) : null;
                }
                cVar2.setMethodInfo(string);
                arrayList.add(cVar2);
            }
            if (bVar.getOauth_platform() != null) {
                for (String str : bVar.getOauth_platform()) {
                    g.c cVar3 = new g.c();
                    cVar3.setMethodType(3);
                    cVar3.setAuthType(e.valueOf(str));
                    Context context5 = getContext();
                    cVar3.setMethodInfo(context5 != null ? context5.getString(R.string.f_t) : null);
                    cVar3.setMethodName(str);
                    arrayList.add(cVar3);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) c(R.id.cjo);
        l.b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) c(R.id.cjo);
        l.b(recyclerView2, "");
        g gVar = this.f63604e;
        if (gVar == null) {
            l.a("mAdapter");
        }
        recyclerView2.setAdapter(gVar);
        ((TuxTextView) c(R.id.f8e)).setOnClickListener(new c(this));
    }

    @Override // com.ss.android.ugc.aweme.account.login.recover.g.b
    public final void a(int i2, e eVar) {
        boolean z;
        Boolean valueOf;
        String str = "";
        if (i2 == 1) {
            b bVar = this.f63601a;
            if (bVar == null || (valueOf = Boolean.valueOf(bVar.getSafe())) == null) {
                z = false;
            } else {
                z = valueOf.booleanValue();
            }
            IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
            if (iFeed0VVManagerService != null) {
                iFeed0VVManagerService.a("click_login");
                iFeed0VVManagerService.b("LOGIN");
            }
            if (!z) {
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", k.PHONE_EMAIL_LOGIN.getValue());
                arguments.putInt("child_page", k.INPUT_PHONE_LOGIN.getValue());
                arguments.putString("previous_uid", new com.ss.android.ugc.aweme.g().getCurUserId());
                arguments.putString("enter_from", "find_account");
                arguments.putString("enter_method", "find_account");
                arguments.putInt("current_scene", A().getValue());
                arguments.putSerializable("recover_account_data", this.f63601a);
                l.b(arguments, str);
                a(arguments);
            } else {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                arguments2.putInt("next_page", k.PHONE_SMS_LOGIN.getValue());
                arguments2.putInt("current_scene", j.RECOVER_ACCOUNT.getValue());
                arguments2.putSerializable("recover_account_data", this.f63601a);
                arguments2.putBoolean("code_sent", false);
                arguments2.putBoolean("use_whatsapp", false);
                arguments2.putString("previous_uid", new com.ss.android.ugc.aweme.g().getCurUserId());
                arguments2.putString("enter_from", "find_account");
                arguments2.putString("enter_method", "find_account");
                arguments2.putBoolean("email_should_add_email", true);
                arguments2.putBoolean("from_choose_dialog", false);
                l.b(arguments2, str);
                a(arguments2);
            }
            str = "phone";
        } else if (i2 == 2) {
            b bVar2 = this.f63601a;
            if (bVar2 != null) {
                Boolean.valueOf(bVar2.getSafe());
            }
            IFeed0VVManagerService iFeed0VVManagerService2 = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
            if (iFeed0VVManagerService2 != null) {
                iFeed0VVManagerService2.a("click_login");
                iFeed0VVManagerService2.b("LOGIN");
            }
            Bundle arguments3 = getArguments();
            if (arguments3 == null) {
                arguments3 = new Bundle();
            }
            arguments3.putInt("next_page", k.PHONE_EMAIL_LOGIN.getValue());
            arguments3.putInt("child_page", k.INPUT_EMAIL_LOGIN.getValue());
            arguments3.putInt("current_scene", A().getValue());
            arguments3.putString("previous_uid", new com.ss.android.ugc.aweme.g().getCurUserId());
            arguments3.putString("enter_from", "find_account");
            arguments3.putString("enter_method", "find_account");
            arguments3.putBoolean("email_should_add_email", true);
            arguments3.putSerializable("recover_account_data", this.f63601a);
            l.b(arguments3, str);
            a(arguments3);
            str = "email";
        } else if (i2 == 3) {
            getActivity();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = e();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.de8).a();
                return;
            }
            for (v vVar : this.f63603d) {
                String vVar2 = vVar.toString();
                Objects.requireNonNull(vVar2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = vVar2.toLowerCase();
                l.b(lowerCase, str);
                String valueOf2 = String.valueOf(eVar);
                Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = valueOf2.toLowerCase();
                l.b(lowerCase2, str);
                if (l.a((Object) lowerCase, (Object) lowerCase2)) {
                    if (eVar != e.apple) {
                        String valueOf3 = String.valueOf(eVar);
                        IFeed0VVManagerService iFeed0VVManagerService3 = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
                        if (iFeed0VVManagerService3 != null) {
                            iFeed0VVManagerService3.a("Mob.Event.LOGIN_SUBMIT_".concat(String.valueOf(valueOf3)));
                            iFeed0VVManagerService3.b("LOGIN");
                        }
                        Intent intent = new Intent(getActivity(), AuthorizeActivity.class);
                        intent.putExtra("platform", valueOf3).putExtra("enter_from", "find_account").putExtra("enter_method", "find_account").putExtra("enter_type", y()).putExtra("previous_uid", new com.ss.android.ugc.aweme.g().getCurUserId());
                        e activity = getActivity();
                        if (activity != null) {
                            activity.startActivityForResult(intent, 1001);
                        }
                        str = String.valueOf(eVar);
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        r.a("find_account_verify_click", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", g()).a("enter_type", str).a("aid", 1233).f62575a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1001 && i3 == -1) {
            com.ss.android.ugc.aweme.account.f.a.a(13);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.c());
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.e());
        }
    }
}
