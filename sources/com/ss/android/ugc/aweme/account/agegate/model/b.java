package com.ss.android.ugc.aweme.account.agegate.model;

import android.os.Message;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.sdk.a.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.account.util.l;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.utils.ai;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class b extends com.ss.android.ugc.aweme.common.b<AgeGateResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f62774a = new HashSet(Arrays.asList("NO", "LT", "ET", "DA", "SK", "LV"));

    /* renamed from: d  reason: collision with root package name */
    private static final String f62775d = "api-va.tiktokv.com/aweme/v3/verification/age/";

    /* renamed from: b  reason: collision with root package name */
    public k f62776b;

    /* renamed from: c  reason: collision with root package name */
    public HashSet<Integer> f62777c = new HashSet<>(Arrays.asList(3008010, 3008011, 3008009, 3008008, 3008012, 3008020, 3008026));

    /* renamed from: e  reason: collision with root package name */
    private int f62778e;

    /* renamed from: f  reason: collision with root package name */
    private int f62779f;

    /* renamed from: g  reason: collision with root package name */
    private int f62780g;

    /* renamed from: h  reason: collision with root package name */
    private j f62781h;

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final boolean e() {
        if (this.f62776b != k.AGE_GATE) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.f62776b == k.AGE_GATE) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.f62776b == k.EDIT_DOB_AGE_GATE) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.f62781h == j.GUEST_MODE) {
            return true;
        }
        return false;
    }

    public final String c() {
        if (this.mData == null || ((AgeGateResponse) this.mData).getStatus_msg() == null) {
            return "";
        }
        return ((AgeGateResponse) this.mData).getStatus_msg();
    }

    public final boolean f() {
        if (this.mData == null || !this.f62777c.contains(Integer.valueOf(((AgeGateResponse) this.mData).getStatus_code()))) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(38684);
    }

    public final boolean b() {
        if (this.mData == null || ((AgeGateResponse) this.mData).getStatus_code() != 0) {
            return false;
        }
        if (((AgeGateResponse) this.mData).getAgeGatePostAction() == 0 && ((AgeGateResponse) this.mData).getRegisterAgeGatePostAction() == 0) {
            return false;
        }
        return true;
    }

    public final String d() {
        String valueOf;
        String valueOf2;
        String valueOf3 = String.valueOf(this.f62778e);
        int i2 = this.f62779f;
        if (i2 < 10) {
            valueOf = "0" + this.f62779f;
        } else {
            valueOf = String.valueOf(i2);
        }
        int i3 = this.f62780g;
        if (i3 < 10) {
            valueOf2 = "0" + this.f62780g;
        } else {
            valueOf2 = String.valueOf(i3);
        }
        return valueOf3 + "-" + valueOf + "-" + valueOf2;
    }

    public final boolean a() {
        if (this.mData != null && ((AgeGateResponse) this.mData).getStatus_code() == 0 && ((AgeGateResponse) this.mData).getAgeGatePostAction() == 0 && ((AgeGateResponse) this.mData).getRegisterAgeGatePostAction() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        super.handleMsg(message);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(AgeGateResponse ageGateResponse) {
        super.handleData(ageGateResponse);
        q.c().edit().putBoolean("ftc_age_gate_response_prompt", ageGateResponse.is_prompt()).apply();
        q.c().edit().putInt("ftc_age_gate_response_mode", ageGateResponse.getAgeGatePostAction()).apply();
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        boolean sendRequest = super.sendRequest(objArr);
        if (sendRequest) {
            boolean z2 = false;
            String valueOf = String.valueOf(objArr[0]);
            if (!cj.f71084b.e().isLogin() || (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue())) {
                z = true;
            } else {
                z = false;
            }
            if (objArr.length > 2 && ((Boolean) objArr[2]).booleanValue()) {
                z2 = true;
            }
            if (!z) {
                i.b(new c(this, valueOf, z2), i.f4824a).c(new d(this)).c(new e(this), i.f4826c).a((g) new com.ss.android.ugc.aweme.account.util.j(this.mHandler));
            } else {
                i.b(new f(this, valueOf), i.f4824a).a((g) new com.ss.android.ugc.aweme.account.util.j(this.mHandler));
            }
        }
        return sendRequest;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ User a(i iVar) {
        String str;
        if (!ai.a(iVar)) {
            return null;
        }
        handleData((AgeGateResponse) iVar.d());
        if (((AgeGateResponse) iVar.d()).getStatus_code() == 0) {
            User queryUser = cj.f71084b.e().queryUser(((IAccountHelperService) a.a(IAccountHelperService.class)).selfUserApi(), false);
            int ageGatePostAction = ((AgeGateResponse) iVar.d()).getAgeGatePostAction();
            if (ageGatePostAction == 0) {
                queryUser.setUserMode(1);
                ShareServiceImpl.d().a(d.a(), false);
            } else {
                queryUser.setUserMode(2);
                if (ageGatePostAction == 1 && com.ss.android.ugc.aweme.account.b.g().allUidList().size() > 1) {
                    com.ss.android.ugc.aweme.account.b.g().logoutAllBackgroundUser();
                }
                ShareServiceImpl.d().a(d.a(), true);
            }
            queryUser.setAgeGatePostAction(ageGatePostAction);
            queryUser.setAgeGateAction(0);
            q.a(queryUser.getUid(), ageGatePostAction);
            h.a(queryUser.getUid(), ageGatePostAction);
            String uid = queryUser.getUid();
            com.ss.android.ugc.aweme.bf.d.a(a.f62426a, "aweme_user", 0).edit().putInt("ftc_user_mode_prefix_".concat(String.valueOf(uid)), queryUser.getUserMode()).apply();
            return queryUser;
        }
        int status_code = ((AgeGateResponse) iVar.d()).getStatus_code();
        Integer valueOf = Integer.valueOf(status_code);
        if (((AgeGateResponse) iVar.d()).getStatus_msg() != null) {
            str = ((AgeGateResponse) iVar.d()).getStatus_msg();
        } else {
            str = "";
        }
        throw new com.ss.android.ugc.aweme.base.api.a.b.a(status_code).setErrorMsg(l.a(valueOf, str));
    }

    public b(k kVar, j jVar) {
        this.f62776b = kVar;
        this.f62781h = jVar;
    }

    public final void a(int i2, int i3, int i4) {
        this.f62778e = i2;
        this.f62779f = i3;
        this.f62780g = i4;
    }

    static AgeGateResponse a(String str, boolean z, boolean z2) {
        int i2;
        String str2 = c.a.f43087a + f62775d;
        HashMap hashMap = new HashMap();
        hashMap.put("birthday", str);
        int i3 = 1;
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        hashMap.put("session_registered", String.valueOf(i2));
        if (z2) {
            i3 = 2;
        }
        hashMap.put("update_birthdate_type", String.valueOf(i3));
        if (GuestModeServiceImpl.d().b()) {
            hashMap.put("is_guest", "1");
        }
        return (AgeGateResponse) new f().a(NetworkProxyAccount.f65195b.a(str2, hashMap), AgeGateResponse.class);
    }
}
