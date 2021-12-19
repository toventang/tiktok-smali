package com.bytedance.sdk.a.c.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(26459);
    }

    public static class a extends a {

        /* renamed from: a  reason: collision with root package name */
        public String f43132a;

        /* renamed from: b  reason: collision with root package name */
        public String f43133b;

        /* renamed from: c  reason: collision with root package name */
        public String f43134c;

        /* renamed from: d  reason: collision with root package name */
        public String f43135d;

        /* renamed from: e  reason: collision with root package name */
        public String f43136e;

        /* renamed from: f  reason: collision with root package name */
        public String f43137f = "opensdk";

        /* renamed from: g  reason: collision with root package name */
        public int f43138g = -1;

        /* renamed from: h  reason: collision with root package name */
        public String f43139h;

        /* renamed from: i  reason: collision with root package name */
        public String f43140i;

        /* renamed from: j  reason: collision with root package name */
        public String f43141j;

        static {
            Covode.recordClassIndex(26460);
        }

        @Override // com.bytedance.sdk.a.c.a.a
        public final int getType() {
            return 1;
        }

        public a() {
        }

        public a(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.bytedance.sdk.a.c.a.a
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f43132a = bundle.getString("_bytedance_params_state");
            this.f43134c = bundle.getString("_bytedance_params_client_key");
            this.f43135d = bundle.getString("_bytedance_params_client_secret");
            this.f43133b = bundle.getString("_bytedance_params_redirect_uri");
            this.f43136e = bundle.getString("_bytedance_params_next_url");
            this.f43139h = bundle.getString("_bytedance_params_scope");
            this.f43140i = bundle.getString("_bytedance_params_optional_scope0");
            this.f43141j = bundle.getString("_bytedance_params_optional_scope1");
            this.f43138g = bundle.getInt("wap_requested_orientation", -1);
            this.f43137f = bundle.getString("wap_to_native_from_tag", "opensdk");
        }

        @Override // com.bytedance.sdk.a.c.a.a
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_state", this.f43132a);
            bundle.putString("_bytedance_params_client_key", this.f43134c);
            bundle.putString("_bytedance_params_client_secret", this.f43135d);
            bundle.putString("_bytedance_params_redirect_uri", this.f43133b);
            bundle.putString("_bytedance_params_next_url", this.f43136e);
            bundle.putString("_bytedance_params_scope", this.f43139h);
            bundle.putString("_bytedance_params_optional_scope0", this.f43140i);
            bundle.putString("_bytedance_params_optional_scope1", this.f43141j);
            bundle.putInt("wap_requested_orientation", this.f43138g);
            bundle.putString("wap_to_native_from_tag", this.f43137f);
        }
    }

    public static class b extends b {

        /* renamed from: a  reason: collision with root package name */
        public String f43142a;

        /* renamed from: b  reason: collision with root package name */
        public String f43143b;

        /* renamed from: c  reason: collision with root package name */
        public String f43144c;

        static {
            Covode.recordClassIndex(26461);
        }

        @Override // com.bytedance.sdk.a.c.a.b
        public final int getType() {
            return 2;
        }

        @Override // com.bytedance.sdk.a.c.a.b
        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f43142a = bundle.getString("_bytedance_params_authcode");
            this.f43143b = bundle.getString("_bytedance_params_state");
            this.f43144c = bundle.getString("_bytedance_params_granted_permission");
        }

        @Override // com.bytedance.sdk.a.c.a.b
        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_authcode", this.f43142a);
            bundle.putString("_bytedance_params_state", this.f43143b);
            bundle.putString("_bytedance_params_granted_permission", this.f43144c);
        }
    }
}
