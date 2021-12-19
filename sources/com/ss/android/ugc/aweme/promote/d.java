package com.ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.settingsrequest.d.c;
import com.ss.android.ugc.aweme.views.i;
import com.ss.android.ugc.aweme.views.o;
import com.ss.android.ugc.tiktok.security.a.a;
import com.zhiliaoapp.musically.R;

public final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    public String f118136a;

    /* renamed from: b  reason: collision with root package name */
    public String f118137b;

    /* renamed from: c  reason: collision with root package name */
    TextView f118138c = ((TextView) this.f118144i.findViewById(R.id.f9l));

    /* renamed from: d  reason: collision with root package name */
    TextView f118139d = ((TextView) this.f118144i.findViewById(R.id.eyc));

    /* renamed from: e  reason: collision with root package name */
    View f118140e = this.f118144i.findViewById(R.id.yu);

    /* renamed from: f  reason: collision with root package name */
    View f118141f = this.f118144i.findViewById(R.id.xx);

    /* renamed from: g  reason: collision with root package name */
    public Activity f118142g;

    /* renamed from: h  reason: collision with root package name */
    private String f118143h;

    /* renamed from: i  reason: collision with root package name */
    private View f118144i;

    /* renamed from: j  reason: collision with root package name */
    private i f118145j;

    static {
        Covode.recordClassIndex(76729);
    }

    public final void dismiss() {
        super.dismiss();
        i iVar = this.f118145j;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public d(Activity activity, String str, c cVar) {
        super(activity, R.style.zo, false, true);
        MethodCollector.i(3068);
        this.f118142g = activity;
        this.f118143h = str;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.xa, (ViewGroup) null);
        this.f118144i = inflate;
        setContentView(inflate);
        Activity activity2 = this.f118142g;
        if (activity2 != null) {
            this.f118136a = activity2.getString(R.string.d_n);
            this.f118137b = this.f118142g.getString(R.string.d_l);
        }
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.d())) {
                this.f118136a = cVar.d();
            }
            if (!TextUtils.isEmpty(cVar.f())) {
                this.f118137b = cVar.f();
            }
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2)) {
                this.f118138c.setText(a2);
            }
            String b2 = cVar.b();
            if (!TextUtils.isEmpty(b2)) {
                this.f118139d.setText(b2);
            }
            String c2 = cVar.c();
            if (!TextUtils.isEmpty(c2)) {
                this.f118140e.setContentDescription(c2);
            }
            String e2 = cVar.e();
            if (!TextUtils.isEmpty(e2)) {
                this.f118141f.setContentDescription(e2);
            }
        }
        this.f118140e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.promote.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(76730);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Activity activity = d.this.f118142g;
                String str = d.this.f118136a;
                if (activity != null) {
                    Intent intent = new Intent(activity, CrossPlatformActivity.class);
                    Bundle bundle = new Bundle();
                    if (TextUtils.isEmpty(str)) {
                        str = "https://www.tiktok.com/aweme/inapp/v2/ad_agreement?hide_nav_bar=1";
                    }
                    intent.setData(Uri.parse(str));
                    intent.putExtra("hide_nav_bar", true);
                    String str2 = "";
                    if (TextUtils.isEmpty(str2)) {
                        str2 = activity.getResources().getString(R.string.ezv);
                    }
                    intent.putExtra("title", str2);
                    intent.putExtra("aweme_model", bundle);
                    a.a(intent, activity);
                    activity.startActivity(intent);
                }
                d.this.dismiss();
            }
        });
        this.f118141f.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.promote.d.AnonymousClass2 */

            static {
                Covode.recordClassIndex(76731);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                new b(d.this.f118142g).a(d.this.f118137b).b();
                d.this.dismiss();
            }
        });
        MethodCollector.o(3068);
    }
}
