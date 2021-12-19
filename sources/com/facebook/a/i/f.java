package com.facebook.a.i;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.a.f.c;
import com.facebook.a.h;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.m;
import com.ss.android.ugc.aweme.bf.d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final Set<Integer> f46853a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static final String f46854b = f.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f46855c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<View> f46856d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<View> f46857e;

    /* renamed from: f  reason: collision with root package name */
    private String f46858f;

    static {
        Covode.recordClassIndex(28533);
    }

    static /* synthetic */ String a(f fVar) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            return fVar.f46858f;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public final void onClick(View view) {
        if (!a.a(this)) {
            try {
                View.OnClickListener onClickListener = this.f46855c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (!a.a(this)) {
                    try {
                        View view2 = this.f46856d.get();
                        View view3 = this.f46857e.get();
                        if (view2 != null && view3 != null) {
                            try {
                                final String b2 = c.b(view3);
                                final String a2 = b.a(view3, b2);
                                if (a2 != null) {
                                    if (!a(a2, b2)) {
                                        final JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("view", c.a(view2, view3));
                                        jSONObject.put("screenname", this.f46858f);
                                        if (!a.a(this)) {
                                            try {
                                                ad.a(new Runnable() {
                                                    /* class com.facebook.a.i.f.AnonymousClass2 */

                                                    static {
                                                        Covode.recordClassIndex(28535);
                                                    }

                                                    public final void run() {
                                                        String[] a2;
                                                        if (!a.a(this)) {
                                                            try {
                                                                ae.a();
                                                                String lowerCase = ad.e(m.f48921g).toLowerCase();
                                                                float[] a3 = a.a(jSONObject, lowerCase);
                                                                String a4 = a.a(b2, f.a(f.this), lowerCase);
                                                                if (a3 != null && (a2 = c.a(c.a.MTML_APP_EVENT_PREDICTION, new float[][]{a3}, new String[]{a4})) != null) {
                                                                    String str = a2[0];
                                                                    String str2 = a2;
                                                                    if (!a.a(b.class)) {
                                                                        try {
                                                                            if (!b.f46841c.get() && !a.a(b.class)) {
                                                                                try {
                                                                                    if (!b.f46841c.get()) {
                                                                                        ae.a();
                                                                                        b.f46840b = d.a(m.f48921g, "com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                                                                                        b.f46839a.putAll(ad.e(b.f46840b.getString("SUGGESTED_EVENTS_HISTORY", "")));
                                                                                        b.f46841c.set(true);
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    a.a(th, b.class);
                                                                                }
                                                                            }
                                                                            b.f46839a.put(str2, str);
                                                                            b.f46840b.edit().putString("SUGGESTED_EVENTS_HISTORY", ad.a(b.f46839a)).apply();
                                                                        } catch (Throwable th2) {
                                                                            a.a(th2, b.class);
                                                                        }
                                                                    }
                                                                    if (!str.equals("other")) {
                                                                        f.a(str, b2, a3);
                                                                    }
                                                                }
                                                            } catch (Exception unused) {
                                                            } catch (Throwable th3) {
                                                                a.a(th3, this);
                                                            }
                                                        }
                                                    }
                                                });
                                            } catch (Throwable th) {
                                                a.a(th, this);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        a.a(th2, this);
                    }
                }
            } catch (Throwable th3) {
                a.a(th3, this);
            }
        }
    }

    private static boolean a(String str, final String str2) {
        if (a.a(f.class)) {
            return false;
        }
        try {
            final String a2 = b.a(str);
            if (a2 == null) {
                return false;
            }
            if (a2.equals("other")) {
                return true;
            }
            ad.a(new Runnable() {
                /* class com.facebook.a.i.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28534);
                }

                public final void run() {
                    if (!a.a(this)) {
                        try {
                            f.a(a2, str2, new float[0]);
                        } catch (Throwable th) {
                            a.a(th, this);
                        }
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            a.a(th, f.class);
            return false;
        }
    }

    f(View view, View view2, String str) {
        this.f46855c = com.facebook.a.b.a.f.g(view);
        this.f46857e = new WeakReference<>(view);
        this.f46856d = new WeakReference<>(view2);
        this.f46858f = str.toLowerCase().replace("activity", "");
    }

    static /* synthetic */ void a(String str, String str2, float[] fArr) {
        if (!a.a(f.class)) {
            try {
                if (!a.a(f.class)) {
                    try {
                        if (d.a(str)) {
                            ae.a();
                            h hVar = new com.facebook.a.m(m.f48921g).f46875a;
                            if (!a.a(hVar)) {
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("_is_suggested_event", "1");
                                    bundle.putString("_button_text", str2);
                                    hVar.b();
                                } catch (Throwable th) {
                                    a.a(th, hVar);
                                }
                            }
                        } else if (d.b(str)) {
                            b(str, str2, fArr);
                        }
                    } catch (Throwable th2) {
                        a.a(th2, f.class);
                    }
                }
            } catch (Throwable th3) {
                a.a(th3, f.class);
            }
        }
    }

    private static void b(String str, String str2, float[] fArr) {
        if (!a.a(f.class)) {
            try {
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float f2 : fArr) {
                        sb.append(f2).append(",");
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle.putString("metadata", jSONObject.toString());
                    Locale locale = Locale.US;
                    ae.a();
                    GraphRequest a2 = GraphRequest.a((AccessToken) null, com.a.a(locale, "%s/suggested_events", new Object[]{m.f48915a}), (JSONObject) null, (GraphRequest.b) null);
                    a2.f46548j = bundle;
                    GraphRequest.a(a2);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                a.a(th, f.class);
            }
        }
    }
}
