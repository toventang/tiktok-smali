package com.ss.android.ugc.aweme.account.login.twostep;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import b.i;
import com.bytedance.common.utility.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.twostep.n;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class d extends n {

    /* renamed from: a  reason: collision with root package name */
    public TextView f63899a;

    static {
        Covode.recordClassIndex(39373);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f63900a;

        static {
            Covode.recordClassIndex(39374);
        }

        a(d dVar) {
            this.f63900a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f63900a.f63981h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            return g.a(jSONObject, "description", "");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.n
    public final View a() {
        MethodCollector.i(8893);
        if (this.f63984k.getLayoutResource() <= 0) {
            this.f63984k.setLayoutResource(R.layout.gx);
        }
        View inflate = this.f63984k.inflate();
        View findViewById = inflate.findViewById(R.id.u7);
        l.b(findViewById, "");
        this.f63899a = (TextView) findViewById;
        if (this.f63981h != null) {
            i.b(new a(this), i.f4824a).a(new b(this), i.f4826c, null);
        }
        MethodCollector.o(8893);
        return inflate;
    }

    public static final /* synthetic */ TextView a(d dVar) {
        TextView textView = dVar.f63899a;
        if (textView == null) {
            l.a("errorText");
        }
        return textView;
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f63901a;

        static {
            Covode.recordClassIndex(39375);
        }

        b(d dVar) {
            this.f63901a = dVar;
        }

        @Override // b.g
        public final Object then(i<String> iVar) {
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (!TextUtils.isEmpty(iVar.d())) {
                    d.a(this.f63901a).setText(iVar.d());
                    return null;
                }
            }
            TextView a2 = d.a(this.f63901a);
            androidx.appcompat.app.d d2 = this.f63901a.d();
            if (d2 == null) {
                l.b();
            }
            a2.setText(d2.getString(R.string.art));
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.d dVar, ViewStub viewStub, n.a aVar) {
        super(dVar, viewStub, aVar);
        l.d(dVar, "");
        l.d(viewStub, "");
        l.d(aVar, "");
    }
}
