package com.ss.android.ugc.aweme.account.login.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.view.AutoLinefeedTextView;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1449a f65105a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f65106b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f65107c;

    /* renamed from: d  reason: collision with root package name */
    public final b f65108d;

    /* renamed from: e  reason: collision with root package name */
    private View f65109e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f65110f;

    /* renamed from: g  reason: collision with root package name */
    private AutoLinefeedTextView f65111g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f65112h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f65113i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.view.a$a  reason: collision with other inner class name */
    public interface AbstractC1449a {
        static {
            Covode.recordClassIndex(40017);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(40016);
    }

    public final void onBackPressed() {
    }

    public final void show() {
        super.show();
        r.a("phone_verification_channel_alert", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_type", this.f65108d.f65118e).f62575a);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65120a;

        static {
            Covode.recordClassIndex(40019);
        }

        c(a aVar) {
            this.f65120a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC1449a aVar = this.f65120a.f65105a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65121a;

        static {
            Covode.recordClassIndex(40020);
        }

        d(a aVar) {
            this.f65121a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View.OnClickListener onClickListener = this.f65121a.f65106b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65122a;

        static {
            Covode.recordClassIndex(40021);
        }

        e(a aVar) {
            this.f65122a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            View.OnClickListener onClickListener = this.f65122a.f65107c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.h8);
        this.f65109e = findViewById(R.id.a1p);
        this.f65110f = (TextView) findViewById(R.id.f9l);
        this.f65111g = (AutoLinefeedTextView) findViewById(R.id.eyc);
        this.f65112h = (TextView) findViewById(R.id.ezj);
        this.f65113i = (TextView) findViewById(R.id.f6q);
        TextView textView = this.f65110f;
        if (textView != null) {
            textView.setText(this.f65108d.f65114a);
        }
        AutoLinefeedTextView autoLinefeedTextView = this.f65111g;
        if (autoLinefeedTextView != null) {
            String str = this.f65108d.f65115b;
            String str2 = this.f65108d.f65119f;
            if (!(str == null || str.length() == 0)) {
                autoLinefeedTextView.setText(str);
                autoLinefeedTextView.post(new AutoLinefeedTextView.a(autoLinefeedTextView, str2));
            }
        }
        TextView textView2 = this.f65112h;
        if (textView2 != null) {
            textView2.setText(this.f65108d.f65116c);
        }
        TextView textView3 = this.f65113i;
        if (textView3 != null) {
            textView3.setText(this.f65108d.f65117d);
        }
        View view = this.f65109e;
        if (view != null) {
            view.setOnClickListener(new c(this));
        }
        TextView textView4 = this.f65112h;
        if (textView4 != null) {
            textView4.setOnClickListener(new d(this));
        }
        TextView textView5 = this.f65113i;
        if (textView5 != null) {
            textView5.setOnClickListener(new e(this));
        }
        setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar) {
        super(context, R.style.ug);
        l.d(context, "");
        l.d(bVar, "");
        this.f65108d = bVar;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f65114a;

        /* renamed from: b  reason: collision with root package name */
        public final String f65115b;

        /* renamed from: c  reason: collision with root package name */
        public final String f65116c;

        /* renamed from: d  reason: collision with root package name */
        public final String f65117d;

        /* renamed from: e  reason: collision with root package name */
        public final String f65118e;

        /* renamed from: f  reason: collision with root package name */
        public final String f65119f;

        static {
            Covode.recordClassIndex(40018);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f65114a, bVar.f65114a) && l.a(this.f65115b, bVar.f65115b) && l.a(this.f65116c, bVar.f65116c) && l.a(this.f65117d, bVar.f65117d) && l.a(this.f65118e, bVar.f65118e) && l.a(this.f65119f, bVar.f65119f);
        }

        public final int hashCode() {
            String str = this.f65114a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f65115b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f65116c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f65117d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f65118e;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.f65119f;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            return hashCode5 + i2;
        }

        public final String toString() {
            return "Param(title=" + this.f65114a + ", desc=" + this.f65115b + ", firstItem=" + this.f65116c + ", secondItem=" + this.f65117d + ", enterType=" + this.f65118e + ", phoneNum=" + this.f65119f + ")";
        }

        public b(String str, String str2, String str3, String str4, String str5, String str6) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            l.d(str5, "");
            l.d(str6, "");
            this.f65114a = str;
            this.f65115b = str2;
            this.f65116c = str3;
            this.f65117d = str4;
            this.f65118e = str5;
            this.f65119f = str6;
        }
    }
}
