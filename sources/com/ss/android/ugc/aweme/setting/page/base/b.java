package com.ss.android.ugc.aweme.setting.page.base;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    public final /* synthetic */ class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f122443a;

        static {
            Covode.recordClassIndex(80303);
        }

        public d(h.f.a.b bVar) {
            this.f122443a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            l.b(this.f122443a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(80299);
    }

    public static final class a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.setting.page.a $this_configTitle;

        static {
            Covode.recordClassIndex(80300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.ss.android.ugc.aweme.setting.page.a aVar) {
            super(1);
            this.$this_configTitle = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$this_configTitle.h();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.base.b$b  reason: collision with other inner class name */
    public static final class C3169b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.setting.page.a $this_configTitle;

        static {
            Covode.recordClassIndex(80301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3169b(com.ss.android.ugc.aweme.setting.page.a aVar) {
            super(1);
            this.$this_configTitle = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$this_configTitle.h();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<View, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.setting.page.a $this_configTitle;

        static {
            Covode.recordClassIndex(80302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.setting.page.a aVar) {
            super(1);
            this.$this_configTitle = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$this_configTitle.h();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: private */
    public static void a(com.ss.android.ugc.aweme.setting.page.a aVar, h.f.a.b<? super View, z> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        Context context = aVar.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            activity.findViewById(R.id.qb).setOnClickListener(new d(bVar));
        }
    }

    /* access modifiers changed from: private */
    public static void a(com.ss.android.ugc.aweme.setting.page.a aVar, int i2, h.f.a.b<? super View, z> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        String string = aVar.getString(i2);
        l.b(string, "");
        a(aVar, string, bVar);
    }

    public static final void a(com.ss.android.ugc.aweme.setting.page.a aVar, String str, h.f.a.b<? super View, z> bVar) {
        l.d(aVar, "");
        l.d(str, "");
        l.d(bVar, "");
        Context context = aVar.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.title);
            l.b(findViewById, "");
            ((TextView) findViewById).setText(str);
            activity.findViewById(R.id.qb).setOnClickListener(new d(bVar));
        }
    }
}
