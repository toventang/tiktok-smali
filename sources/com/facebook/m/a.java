package com.facebook.m;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.internal.f;
import com.facebook.internal.g;
import com.facebook.m;

final class a {

    /* renamed from: a  reason: collision with root package name */
    protected String f48932a;

    /* renamed from: b  reason: collision with root package name */
    private Fragment f48933b;

    /* renamed from: c  reason: collision with root package name */
    private String f48934c;

    static {
        Covode.recordClassIndex(29493);
    }

    private String b() {
        if (this.f48934c == null) {
            this.f48934c = g.a();
        }
        return this.f48934c;
    }

    private static String c() {
        StringBuilder sb = new StringBuilder("fb");
        ae.a();
        return sb.append(m.f48915a).append("://authorize").toString();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f48933b.getActivity() == null || this.f48933b.getActivity().checkCallingOrSelfPermission("android.permission.INTERNET") != 0 || b() == null) {
            Intent intent = new Intent();
            intent.putExtra("error_message", "Failed to open Referral dialog: Chrome custom tab could not be started. Please make sure internet permission is granted and Chrome is installed");
            a(0, intent);
            return;
        }
        Bundle bundle = new Bundle();
        this.f48932a = ad.b();
        bundle.putString("redirect_uri", g.a(c()));
        ae.a();
        bundle.putString("app_id", m.f48915a);
        bundle.putString("state", this.f48932a);
        if (m.f48923i) {
            com.facebook.login.a.a(f.a("share_referral", bundle));
        }
        Intent intent2 = new Intent(this.f48933b.getActivity(), CustomTabMainActivity.class);
        intent2.putExtra(CustomTabMainActivity.f46509a, "share_referral");
        intent2.putExtra(CustomTabMainActivity.f46510b, bundle);
        intent2.putExtra(CustomTabMainActivity.f46511c, b());
        this.f48933b.startActivityForResult(intent2, 1);
    }

    a(Fragment fragment) {
        this.f48933b = fragment;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private void a(int i2, Intent intent) {
        e activity;
        if (this.f48933b.isAdded() && (activity = this.f48933b.getActivity()) != null) {
            activity.setResult(i2, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, Intent intent) {
        String a2;
        if (i2 == 1) {
            if (!(intent == null || (a2 = a(intent, CustomTabMainActivity.f46512d)) == null || !a2.startsWith(g.a(c())))) {
                Bundle c2 = ad.c(Uri.parse(a2).getQuery());
                if (this.f48932a != null) {
                    boolean equals = this.f48932a.equals(c2.getString("state"));
                    this.f48932a = null;
                    if (!equals) {
                        i3 = 0;
                        intent.putExtra("error_message", "The referral response was missing a valid challenge string.");
                    }
                }
                intent.putExtras(c2);
            }
            a(i3, intent);
        }
    }
}
