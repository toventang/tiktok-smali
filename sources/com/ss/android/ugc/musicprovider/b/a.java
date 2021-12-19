package com.ss.android.ugc.musicprovider.b;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.musicprovider.interfaces.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public d f148538a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f148539b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f148540c = true;

    static {
        Covode.recordClassIndex(97913);
    }

    public a(d dVar) {
        this.f148538a = dVar;
    }

    public final void a(final String str, boolean z) {
        this.f148539b = z;
        new AsyncTask() {
            /* class com.ss.android.ugc.musicprovider.b.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(97914);
            }

            /* access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public final Object doInBackground(Object[] objArr) {
                try {
                    return NetworkUtils.executeGet(0, str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public final void onPostExecute(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (a.this.f148538a != null) {
                        a.this.f148538a.a(str, a.this.f148539b);
                    }
                } else if (a.this.f148538a != null) {
                    a.this.f148538a.b();
                }
            }
        }.execute((Object[]) null);
    }
}
