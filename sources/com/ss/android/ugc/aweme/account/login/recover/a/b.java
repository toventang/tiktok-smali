package com.ss.android.ugc.aweme.account.login.recover.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.f.h;
import h.f.b.l;
import java.io.Serializable;
import org.json.JSONObject;

public final class b extends h<com.ss.android.ugc.aweme.account.login.recover.a.b.b> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f63557e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.recover.a.b.b f63558f;

    static {
        Covode.recordClassIndex(39184);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.a.f.h
    public final /* bridge */ /* synthetic */ void a(com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar) {
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39185);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b$b  reason: collision with other inner class name */
    public static final class C1417b implements Serializable {
        private final String area_code;
        private final String email;
        private final int find_way;
        private final String login_name;
        private final String mobile;

        static {
            Covode.recordClassIndex(39186);
        }

        public static int com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
            return i2;
        }

        public static /* synthetic */ C1417b copy$default(C1417b bVar, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = bVar.find_way;
            }
            if ((i3 & 2) != 0) {
                str = bVar.area_code;
            }
            if ((i3 & 4) != 0) {
                str2 = bVar.mobile;
            }
            if ((i3 & 8) != 0) {
                str3 = bVar.login_name;
            }
            if ((i3 & 16) != 0) {
                str4 = bVar.email;
            }
            return bVar.copy(i2, str, str2, str3, str4);
        }

        public final int component1() {
            return this.find_way;
        }

        public final String component2() {
            return this.area_code;
        }

        public final String component3() {
            return this.mobile;
        }

        public final String component4() {
            return this.login_name;
        }

        public final String component5() {
            return this.email;
        }

        public final C1417b copy(int i2, String str, String str2, String str3, String str4) {
            return new C1417b(i2, str, str2, str3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1417b)) {
                return false;
            }
            C1417b bVar = (C1417b) obj;
            return this.find_way == bVar.find_way && l.a(this.area_code, bVar.area_code) && l.a(this.mobile, bVar.mobile) && l.a(this.login_name, bVar.login_name) && l.a(this.email, bVar.email);
        }

        public final int hashCode() {
            int com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.find_way) * 31;
            String str = this.area_code;
            int i2 = 0;
            int hashCode = (com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.mobile;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.login_name;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.email;
            if (str4 != null) {
                i2 = str4.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "GetAccountTicketRequestObj(find_way=" + this.find_way + ", area_code=" + this.area_code + ", mobile=" + this.mobile + ", login_name=" + this.login_name + ", email=" + this.email + ")";
        }

        public final String getArea_code() {
            return this.area_code;
        }

        public final String getEmail() {
            return this.email;
        }

        public final int getFind_way() {
            return this.find_way;
        }

        public final String getLogin_name() {
            return this.login_name;
        }

        public final String getMobile() {
            return this.mobile;
        }

        public C1417b(int i2, String str, String str2, String str3, String str4) {
            this.find_way = i2;
            this.area_code = str;
            this.mobile = str2;
            this.login_name = str3;
            this.email = str4;
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.a.f.h
    public final /* synthetic */ com.ss.android.ugc.aweme.account.login.recover.a.b.b a(boolean z, com.bytedance.sdk.a.d.b bVar) {
        com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar2 = this.f63558f;
        if (bVar2 == null) {
            bVar2 = new com.ss.android.ugc.aweme.account.login.recover.a.b.b(z);
        } else {
            bVar2.f43071b = z;
        }
        if (!z && bVar != null) {
            bVar2.f43073d = bVar.f43158b;
            bVar2.f43075f = bVar.f43159c;
        }
        return bVar2;
    }

    @Override // com.bytedance.sdk.a.f.h
    public final void b(JSONObject jSONObject, JSONObject jSONObject2) {
        com.ss.android.ugc.aweme.account.login.recover.a.b.b bVar = new com.ss.android.ugc.aweme.account.login.recover.a.b.b(true);
        this.f63558f = bVar;
        if (jSONObject2 != null) {
            bVar.f63559j = jSONObject2.optString("token");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, com.bytedance.sdk.a.d.a aVar, com.ss.android.ugc.aweme.account.login.recover.a.a.b bVar) {
        super(context, aVar, bVar);
        l.d(bVar, "");
    }
}
