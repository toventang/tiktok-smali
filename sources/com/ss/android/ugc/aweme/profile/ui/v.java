package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class v extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    public static final a f117167b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Activity f117168a;

    /* renamed from: c  reason: collision with root package name */
    private final int f117169c;

    /* renamed from: d  reason: collision with root package name */
    private final int f117170d;

    /* renamed from: e  reason: collision with root package name */
    private final int f117171e;

    /* renamed from: f  reason: collision with root package name */
    private final int f117172f;

    /* renamed from: g  reason: collision with root package name */
    private final User f117173g;

    static {
        Covode.recordClassIndex(75675);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75676);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f117180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f117181b;

        static {
            Covode.recordClassIndex(75679);
        }

        d(v vVar, View view) {
            this.f117180a = vVar;
            this.f117181b = view;
        }

        public final boolean onLongClick(View view) {
            this.f117180a.dismiss();
            return true;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f117182a;

        static {
            Covode.recordClassIndex(75683);
        }

        h(v vVar) {
            this.f117182a = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117182a.dismiss();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f117183a;

        static {
            Covode.recordClassIndex(75684);
        }

        i(v vVar) {
            this.f117183a = vVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117183a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f117177a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f117178b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f117179c;

        static {
            Covode.recordClassIndex(75678);
        }

        c(b bVar, v vVar, View view) {
            this.f117177a = bVar;
            this.f117178b = vVar;
            this.f117179c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117177a.f117176c.invoke(this.f117177a.f117175b);
            this.f117178b.dismiss();
        }
    }

    static final /* synthetic */ class f extends j implements h.f.a.b<String, z> {
        static {
            Covode.recordClassIndex(75681);
        }

        f(v vVar) {
            super(1, vVar, v.class, "showPhoneDialog", "showPhoneDialog(Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            Activity activity = ((v) this.receiver).f117168a;
            if (!(activity == null || str2 == null)) {
                new x(activity, str2, (byte) 0).show();
            }
            return z.f158842a;
        }
    }

    static final /* synthetic */ class g extends j implements h.f.a.b<String, z> {
        static {
            Covode.recordClassIndex(75682);
        }

        g(v vVar) {
            super(1, vVar, v.class, "showMapDialog", "showMapDialog(Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            Activity activity = ((v) this.receiver).f117168a;
            if (!(activity == null || str2 == null)) {
                new w(activity, str2, (byte) 0).show();
            }
            return z.f158842a;
        }
    }

    static final /* synthetic */ class e extends j implements h.f.a.b<String, z> {
        static {
            Covode.recordClassIndex(75680);
        }

        e(v vVar) {
            super(1, vVar, v.class, "mailTo", "mailTo(Ljava/lang/String;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            l.d(str, "");
            v vVar = (v) this.receiver;
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf(str))));
            try {
                Activity activity = vVar.f117168a;
                com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
                activity.startActivity(intent);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return z.f158842a;
        }
    }

    private final void a(List<b> list) {
        MethodCollector.i(9182);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = new View(this.f117168a);
            view.setBackgroundColor(androidx.core.content.b.c(view.getContext(), R.color.b2));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.f117170d);
            if (i2 == 0) {
                int i3 = this.f117169c;
                layoutParams.setMargins(i3, i3, i3, i3);
            } else {
                int i4 = this.f117172f;
                int i5 = this.f117169c;
                layoutParams.setMargins(i4, i5, this.f117171e, i5);
            }
            view.setLayoutParams(layoutParams);
            ((LinearLayout) findViewById(R.id.ces)).addView(view);
            View a2 = com.a.a(LayoutInflater.from(this.f117168a), R.layout.aok, (ViewGroup) findViewById(R.id.ces), false);
            b bVar = list.get(i2);
            ((ImageView) a2.findViewById(R.id.by0)).setImageResource(bVar.f117174a);
            View findViewById = a2.findViewById(R.id.f9a);
            l.b(findViewById, "");
            ((TextView) findViewById).setText(bVar.f117175b);
            a2.setOnClickListener(new c(bVar, this, a2));
            a2.setOnLongClickListener(new d(this, a2));
            ((LinearLayout) findViewById(R.id.ces)).addView(a2);
        }
        MethodCollector.o(9182);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ane);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, n.b(window.getContext()) - n.e(window.getContext()));
            window.setGravity(80);
            window.getAttributes().gravity = 80;
        }
        setCanceledOnTouchOutside(true);
        ((ImageView) findViewById(R.id.bve)).setOnClickListener(new h(this));
        findViewById(R.id.fj9).setOnClickListener(new i(this));
        ArrayList arrayList = new ArrayList();
        String bioEmail = this.f117173g.getBioEmail();
        if (bioEmail != null && com.ss.android.ugc.aweme.profile.ui.v2.z.a(bioEmail)) {
            String bioEmail2 = this.f117173g.getBioEmail();
            l.b(bioEmail2, "");
            arrayList.add(new b(2131233416, bioEmail2, new e(this)));
        }
        String bioPhone = this.f117173g.getBioPhone();
        if (bioPhone != null && com.ss.android.ugc.aweme.profile.ui.v2.z.a(bioPhone)) {
            String bioPhone2 = this.f117173g.getBioPhone();
            l.b(bioPhone2, "");
            arrayList.add(new b(2131233418, bioPhone2, new f(this)));
        }
        String bioLocation = this.f117173g.getBioLocation();
        if (bioLocation != null && com.ss.android.ugc.aweme.profile.ui.v2.z.a(bioLocation)) {
            String bioLocation2 = this.f117173g.getBioLocation();
            l.b(bioLocation2, "");
            arrayList.add(new b(2131233417, bioLocation2, new g(this)));
        }
        a(arrayList);
    }

    private v(Activity activity, User user) {
        super(activity, R.style.a05);
        this.f117168a = activity;
        this.f117173g = user;
        this.f117170d = (int) n.b(activity, 0.5f);
        this.f117171e = (int) n.b(activity, 16.0f);
        this.f117172f = (int) n.b(activity, 52.0f);
    }

    public /* synthetic */ v(Activity activity, User user, byte b2) {
        this(activity, user);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f117174a;

        /* renamed from: b  reason: collision with root package name */
        public final String f117175b;

        /* renamed from: c  reason: collision with root package name */
        public final h.f.a.b<String, z> f117176c;

        static {
            Covode.recordClassIndex(75677);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f117174a == bVar.f117174a && l.a(this.f117175b, bVar.f117175b) && l.a(this.f117176c, bVar.f117176c);
        }

        public final int hashCode() {
            int i2 = this.f117174a * 31;
            String str = this.f117175b;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            h.f.a.b<String, z> bVar = this.f117176c;
            if (bVar != null) {
                i3 = bVar.hashCode();
            }
            return hashCode + i3;
        }

        public final String toString() {
            return "ListItem(icon=" + this.f117174a + ", text=" + this.f117175b + ", onItemClick=" + this.f117176c + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i2, String str, h.f.a.b<? super String, z> bVar) {
            l.d(str, "");
            l.d(bVar, "");
            this.f117174a = i2;
            this.f117175b = str;
            this.f117176c = bVar;
        }
    }
}
