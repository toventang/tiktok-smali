package com.ss.android.ugc.aweme.video.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    Context f143388a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f143389b;

    /* renamed from: c  reason: collision with root package name */
    public TableLayout f143390c;

    static {
        Covode.recordClassIndex(93838);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f143391a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f143392b;

        static {
            Covode.recordClassIndex(93839);
        }

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(String str) {
            TextView textView = this.f143392b;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public c(Context context) {
        this(context, (byte) 0);
    }

    static a a(View view) {
        a aVar = (a) view.getTag();
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        aVar2.f143391a = (TextView) view.findViewById(R.id.cs_);
        aVar2.f143392b = (TextView) view.findViewById(R.id.fer);
        view.setTag(aVar2);
        return aVar2;
    }

    private c(Context context, byte b2) {
        MethodCollector.i(11230);
        this.f143388a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.b3m, (ViewGroup) null);
        this.f143389b = viewGroup;
        this.f143390c = (TableLayout) viewGroup.findViewById(R.id.ehn);
        MethodCollector.o(11230);
    }
}
