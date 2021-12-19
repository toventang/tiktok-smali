package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.ui.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TimerTextView extends TuxTextView implements a.AbstractC1435a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65424a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private a.AbstractC1435a f65425b;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.ui.a f65426e;

    /* renamed from: f  reason: collision with root package name */
    private long f65427f;

    /* renamed from: g  reason: collision with root package name */
    private long f65428g;

    /* renamed from: h  reason: collision with root package name */
    private String f65429h;

    static {
        Covode.recordClassIndex(40215);
    }

    public TimerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40216);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
    public final void a() {
        a.AbstractC1435a aVar = this.f65425b;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
    public final void b() {
        a.AbstractC1435a aVar = this.f65425b;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.ss.android.ugc.aweme.account.login.ui.a aVar = this.f65426e;
        if (aVar != null) {
            aVar.a(null);
        }
        this.f65425b = null;
    }

    public final com.ss.android.ugc.aweme.account.login.ui.a c() {
        if (this.f65426e == null) {
            this.f65426e = new com.ss.android.ugc.aweme.account.login.ui.a(this.f65427f, this.f65428g, this);
        }
        com.ss.android.ugc.aweme.account.login.ui.a aVar = this.f65426e;
        if (aVar == null) {
            l.b();
        }
        aVar.a();
        com.ss.android.ugc.aweme.account.login.ui.a aVar2 = this.f65426e;
        if (aVar2 == null) {
            l.b();
        }
        return aVar2;
    }

    public final void setCallback(a.AbstractC1435a aVar) {
        l.d(aVar, "");
        this.f65425b = aVar;
    }

    public final void a(String str) {
        l.d(str, "");
        a(60000, str);
    }

    @Override // com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
    public final void a(long j2) {
        String str = this.f65429h;
        if (str == null) {
            l.b();
        }
        b(j2, str);
        a.AbstractC1435a aVar = this.f65425b;
        if (aVar != null) {
            aVar.a(j2);
        }
    }

    public final void a(com.ss.android.ugc.aweme.account.login.ui.a aVar) {
        l.d(aVar, "");
        this.f65426e = aVar;
        if (aVar.d()) {
            a();
            aVar.a(this);
            return;
        }
        aVar.a();
    }

    private final void b(long j2, String str) {
        setText(String.valueOf(j2 / 1000) + str);
    }

    public final void a(long j2, String str) {
        l.d(str, "");
        this.f65429h = str;
        this.f65427f = 60000;
        this.f65428g = 1000;
        b(j2, str);
    }

    private /* synthetic */ TimerTextView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TimerTextView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, R.attr.ce);
        String str = "";
        l.d(context, str);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.s9, R.attr.ag1});
        l.b(obtainStyledAttributes, str);
        this.f65427f = (long) obtainStyledAttributes.getInteger(0, 60000);
        String string = obtainStyledAttributes.getString(1);
        this.f65429h = string != null ? string : str;
        obtainStyledAttributes.recycle();
        this.f65428g = 1000;
    }
}
