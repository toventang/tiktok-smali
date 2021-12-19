package com.facebook.internal;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.af;
import com.facebook.j;
import com.facebook.m;

public final class k extends d {

    /* renamed from: a  reason: collision with root package name */
    public Dialog f48611a;

    static {
        Covode.recordClassIndex(29322);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f48611a;
        if (dialog instanceof af) {
            ((af) dialog).a();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f48611a == null) {
            a(null, null);
            this.mShowsDialog = false;
        }
        return this.f48611a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f48611a instanceof af) && isResumed()) {
            ((af) this.f48611a).a();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        af afVar;
        super.onCreate(bundle);
        if (this.f48611a == null) {
            e activity = getActivity();
            Bundle b2 = y.b(activity.getIntent());
            if (!b2.getBoolean("is_fallback", false)) {
                String string = b2.getString("action");
                Bundle bundle2 = b2.getBundle("params");
                if (ad.a(string)) {
                    activity.finish();
                    return;
                }
                af.a aVar = new af.a(activity, string, bundle2);
                aVar.f48547d = new af.c() {
                    /* class com.facebook.internal.k.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(29323);
                    }

                    @Override // com.facebook.internal.af.c
                    public final void a(Bundle bundle, j jVar) {
                        k.this.a(bundle, jVar);
                    }
                };
                afVar = aVar.a();
            } else {
                String string2 = b2.getString("url");
                if (ad.a(string2)) {
                    activity.finish();
                    return;
                }
                ae.a();
                afVar = n.a(activity, string2, a.a("fb%s://bridge/", new Object[]{m.f48915a}));
                afVar.f48531c = new af.c() {
                    /* class com.facebook.internal.k.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(29324);
                    }

                    @Override // com.facebook.internal.af.c
                    public final void a(Bundle bundle, j jVar) {
                        e activity = k.this.getActivity();
                        Intent intent = new Intent();
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        intent.putExtras(bundle);
                        activity.setResult(-1, intent);
                        activity.finish();
                    }
                };
            }
            this.f48611a = afVar;
        }
    }

    public final void a(Bundle bundle, j jVar) {
        int i2;
        e activity = getActivity();
        Intent a2 = y.a(activity.getIntent(), bundle, jVar);
        if (jVar == null) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        activity.setResult(i2, a2);
        activity.finish();
    }
}
