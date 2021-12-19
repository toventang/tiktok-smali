package com.bytedance.android.live.publicscreen.a.c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.publicscreen.a.d;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public abstract class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12175a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f12176b;

    /* renamed from: c  reason: collision with root package name */
    private int f12177c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f12178d;

    static {
        Covode.recordClassIndex(6693);
    }

    public View a(int i2) {
        if (this.f12178d == null) {
            this.f12178d = new HashMap();
        }
        View view = (View) this.f12178d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f12178d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public abstract void a(d dVar);

    public abstract void b();

    public abstract void c();

    public static final class a {
        static {
            Covode.recordClassIndex(6694);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public int getState() {
        return this.f12177c;
    }

    public boolean a() {
        return this.f12176b;
    }

    public void setState(int i2) {
        this.f12177c = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, int i2) {
        super(context);
        l.d(context, "");
        this.f12177c = i2;
    }
}
