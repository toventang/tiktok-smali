package com.bytedance.android.livesdk.chatroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.aq;
import com.bytedance.android.livesdk.j.aa;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements aq {

    /* renamed from: j  reason: collision with root package name */
    private static final a f14939j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final View f14940a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f14941b;

    /* renamed from: c  reason: collision with root package name */
    public final View f14942c;

    /* renamed from: d  reason: collision with root package name */
    public final View f14943d;

    /* renamed from: e  reason: collision with root package name */
    public final View f14944e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f14945f;

    /* renamed from: g  reason: collision with root package name */
    public final View f14946g;

    /* renamed from: h  reason: collision with root package name */
    public final View f14947h;

    /* renamed from: i  reason: collision with root package name */
    private final View f14948i;

    static {
        Covode.recordClassIndex(8293);
    }

    static final class a {
        static {
            Covode.recordClassIndex(8294);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.aq
    public final View a() {
        return this.f14948i;
    }

    private final Context b() {
        Context context = this.f14947h.getContext();
        l.b(context, "");
        return context;
    }

    public static final boolean a(DataChannel dataChannel) {
        Boolean bool;
        Boolean bool2;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(bc.class)) == null || !bool.booleanValue() || (bool2 = (Boolean) dataChannel.b(aa.class)) == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public b(View view) {
        l.d(view, "");
        MethodCollector.i(2934);
        this.f14947h = view;
        View inflate = LayoutInflater.from(b()).inflate(R.layout.bb9, (ViewGroup) null);
        l.b(inflate, "");
        this.f14940a = inflate;
        View findViewById = inflate.findViewById(R.id.e85);
        l.b(findViewById, "");
        this.f14941b = (ViewGroup) findViewById;
        View inflate2 = LayoutInflater.from(b()).inflate(R.layout.bb8, (ViewGroup) null);
        l.b(inflate2, "");
        this.f14942c = inflate2;
        View findViewById2 = inflate2.findViewById(R.id.e83);
        l.b(findViewById2, "");
        this.f14943d = findViewById2;
        View findViewById3 = inflate2.findViewById(R.id.e80);
        l.b(findViewById3, "");
        this.f14944e = findViewById3;
        View findViewById4 = inflate2.findViewById(R.id.e81);
        l.b(findViewById4, "");
        this.f14945f = (ViewGroup) findViewById4;
        View findViewById5 = inflate2.findViewById(R.id.e82);
        l.b(findViewById5, "");
        this.f14948i = findViewById5;
        View findViewById6 = inflate2.findViewById(R.id.e84);
        l.b(findViewById6, "");
        this.f14946g = findViewById6;
        MethodCollector.o(2934);
    }
}
