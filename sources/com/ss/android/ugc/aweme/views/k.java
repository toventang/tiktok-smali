package com.ss.android.ugc.aweme.views;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class k implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f144627b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final a f144628c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f144629a;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f144630d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f144631e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f144632f;

    public k() {
        this(600, false, 2);
    }

    public k(byte b2) {
        this(0, false, 3);
    }

    public abstract void a(View view);

    public static final class a {
        static {
            Covode.recordClassIndex(94633);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f144633a;

        static {
            Covode.recordClassIndex(94634);
        }

        b(k kVar) {
            this.f144633a = kVar;
        }

        public final void run() {
            this.f144633a.a(true);
        }
    }

    static {
        Covode.recordClassIndex(94632);
    }

    public final void a(boolean z) {
        if (this.f144630d) {
            f144627b = z;
        } else {
            this.f144631e = z;
        }
    }

    public void onClick(View view) {
        boolean z;
        ClickAgent.onClick(view);
        l.d(view, "");
        if (this.f144630d) {
            z = f144627b;
        } else {
            z = this.f144631e;
        }
        if (z) {
            a(false);
            view.postDelayed(this.f144632f, (long) this.f144629a);
            a(view);
        }
    }

    private k(int i2, boolean z) {
        this.f144631e = true;
        this.f144632f = new b(this);
        this.f144629a = i2;
        this.f144630d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, boolean z, int i3) {
        this((i3 & 1) != 0 ? 300 : i2, (i3 & 2) != 0 ? true : z);
    }
}
