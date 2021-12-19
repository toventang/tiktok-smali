package com.ss.android.ugc.aweme.account.login.e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import b.g;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.i;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.ss.android.ugc.aweme.account.m.b;
import com.ss.android.ugc.aweme.account.n.d;
import com.ss.android.ugc.aweme.account.n.f;
import com.ss.android.ugc.aweme.account.util.m;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import org.json.JSONObject;

public final class a implements i.b, i.c {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f63417b = false;

    /* renamed from: a  reason: collision with root package name */
    public EditText f63418a;

    /* renamed from: c  reason: collision with root package name */
    private i f63419c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f63420d;

    /* renamed from: e  reason: collision with root package name */
    private int f63421e = f.b(com.ss.android.ugc.aweme.a.f62426a);

    /* renamed from: f  reason: collision with root package name */
    private boolean f63422f;

    /* renamed from: g  reason: collision with root package name */
    private String f63423g;

    /* renamed from: h  reason: collision with root package name */
    private Exception f63424h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f63425i;

    @Override // com.google.android.gms.common.api.internal.e
    public final void a(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.m
    public final void a(ConnectionResult connectionResult) {
    }

    @Override // com.google.android.gms.common.api.internal.e
    public final void b(int i2) {
    }

    static {
        Covode.recordClassIndex(39079);
    }

    public final void b() {
        i iVar;
        if (this.f63425i && (iVar = this.f63419c) != null && iVar.g()) {
            this.f63419c.a(this.f63420d.getActivity());
            this.f63419c.f();
        }
    }

    private void c() {
        if (!this.f63425i) {
            a(false, "Feature cannot be used", this.f63422f, this.f63421e);
        } else if (this.f63419c == null) {
            a(false, "Failed to create GoogleApiClient, exception: " + d.a(this.f63424h), this.f63422f, this.f63421e);
        } else {
            Fragment fragment = this.f63420d;
            if (fragment == null || !fragment.isAdded()) {
                a(false, "Unexpected error occurred, fragment: " + this.f63420d, this.f63422f, this.f63421e);
                return;
            }
            HintRequest.a aVar = new HintRequest.a();
            CredentialPickerConfig.a aVar2 = new CredentialPickerConfig.a();
            aVar2.f49730b = true;
            HintRequest.a a2 = aVar.a(aVar2.a());
            a2.f49757b = true;
            try {
                this.f63420d.startIntentSenderForResult(com.google.android.gms.auth.api.a.f49690g.a(this.f63419c, a2.a()).getIntentSender(), 1000, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e2) {
                a(false, "Error when calling startIntentSenderForResult: " + d.a(e2), this.f63422f, this.f63421e);
            }
        }
    }

    public final void a() {
        if (this.f63425i) {
            try {
                this.f63419c = new i.a(this.f63420d.getContext()).a(this).a(this.f63420d.getActivity(), this).a(com.google.android.gms.auth.api.a.f49687d).a();
            } catch (Exception e2) {
                this.f63424h = e2;
            }
        }
    }

    public final void a(EditText editText) {
        this.f63418a = editText;
        c();
    }

    private void b(Intent intent) {
        b.i.b(new b(this, intent), b.i.f4824a).a((g) new c(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(b.i iVar) {
        if (ai.a(iVar) && ((Boolean) iVar.d()).booleanValue()) {
            return null;
        }
        a(false, "Bolts result error: " + d.a(iVar.e()), this.f63422f, this.f63421e);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean a(Intent intent) {
        String str;
        Phonenumber.PhoneNumber phoneNumber;
        Credential credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential");
        boolean z = false;
        if (credential == null) {
            str = "No \"Credential\" retrieved from Credential.EXTRA_KEY";
        } else {
            String str2 = credential.f49708a;
            str = null;
            try {
                phoneNumber = PhoneNumberUtil.getInstance().parse(str2, null);
            } catch (NumberParseException e2) {
                phoneNumber = null;
                str = "NumberParseException: " + e2.getMessage();
            }
            if (phoneNumber != null) {
                z = true;
            }
            if (phoneNumber != null) {
                str2 = String.valueOf(phoneNumber.getNationalNumber());
            }
            ai.b(new d(this, str2), "BoltsUtils");
        }
        a(TextUtils.isEmpty(str), str, this.f63422f, this.f63421e);
        return Boolean.valueOf(z);
    }

    public a(Fragment fragment, String str) {
        boolean z;
        this.f63420d = fragment;
        this.f63423g = str;
        boolean a2 = m.a(com.ss.android.ugc.aweme.a.f62426a);
        this.f63422f = a2;
        if (!a2 || this.f63421e != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f63425i = z;
    }

    public final void a(int i2, int i3, Intent intent) {
        EditText editText;
        if (this.f63425i && i2 == 1000 && (editText = this.f63418a) != null) {
            if (i3 == -1) {
                b(intent);
                return;
            }
            editText.requestFocus();
            a(false, "onActivityResult result code: ".concat(String.valueOf(i3)), this.f63422f, this.f63421e);
        }
    }

    private void a(boolean z, String str, boolean z2, int i2) {
        String str2;
        com.ss.android.ugc.aweme.account.i.a.a(z, str, z2, i2);
        c a2 = new c().a("success", Boolean.valueOf(z));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        JSONObject a3 = a2.a("error_desc", str2).a("has_sim_card", Boolean.valueOf(z2)).a("google_availability", Integer.valueOf(i2)).a();
        int i3 = !z ? 1 : 0;
        l.b(a3, "");
        b.a("phone_auto_fill", i3, a3);
        r.a("phone_auto_fill", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f63423g).a("is_successful", z ? 1 : 0).a("error_desc", str).a("has_sim_card", z2 ? 1 : 0).a("google_availability", i2).f62575a);
    }
}
