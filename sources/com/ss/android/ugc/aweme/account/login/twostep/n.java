package com.ss.android.ugc.aweme.account.login.twostep;

import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<d> f63980a;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f63981h;

    /* renamed from: i  reason: collision with root package name */
    public String f63982i;

    /* renamed from: j  reason: collision with root package name */
    public String f63983j = "";

    /* renamed from: k  reason: collision with root package name */
    public final ViewStub f63984k;

    /* renamed from: l  reason: collision with root package name */
    public a f63985l;

    public interface a {
        static {
            Covode.recordClassIndex(39423);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(39422);
    }

    public View a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final d d() {
        return this.f63980a.get();
    }

    /* access modifiers changed from: protected */
    public final void d(String str) {
        l.d(str, "");
        this.f63983j = str;
    }

    /* access modifiers changed from: protected */
    public final void e(String str) {
        a aVar = this.f63985l;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    /* access modifiers changed from: protected */
    public final String b(Integer num, String str) {
        String str2;
        d dVar = this.f63980a.get();
        if (dVar == null || (str2 = dVar.getString(R.string.bpf)) == null) {
            str2 = "Sorry, error occurred";
        }
        l.b(str2, "");
        if (str == null || num == null) {
            return str2;
        }
        num.intValue();
        if (num.intValue() == 1066) {
            return str2;
        }
        return str;
    }

    public n(d dVar, ViewStub viewStub, a aVar) {
        l.d(dVar, "");
        l.d(viewStub, "");
        this.f63984k = viewStub;
        this.f63985l = aVar;
        this.f63980a = new WeakReference<>(dVar);
    }
}
