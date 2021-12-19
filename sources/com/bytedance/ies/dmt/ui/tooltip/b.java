package com.bytedance.ies.dmt.ui.tooltip;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f33542c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f33543a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final Context f33544b;

    /* renamed from: d  reason: collision with root package name */
    private a f33545d;

    /* renamed from: com.bytedance.ies.dmt.ui.tooltip.b$b  reason: collision with other inner class name */
    public interface AbstractC0734b {
        static {
            Covode.recordClassIndex(20004);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(20005);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(20002);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20003);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final a a() {
        a aVar = this.f33545d;
        if (aVar != null) {
            return aVar;
        }
        if (this.f33543a.f33551f != null) {
            return new e(this.f33544b, this.f33543a);
        }
        return new ToolTipPopupWindow(this.f33544b, this.f33543a);
    }

    public final b a(long j2) {
        this.f33543a.f33556k = j2;
        return this;
    }

    public final b b(int i2) {
        this.f33543a.f33552g = i2;
        return this;
    }

    public final b c(int i2) {
        this.f33543a.f33548c = i2;
        return this;
    }

    public final b a(View.OnClickListener onClickListener) {
        this.f33543a.x = true;
        this.f33543a.w = onClickListener;
        return this;
    }

    public b(Context context) {
        l.d(context, "");
        this.f33544b = context;
    }

    public final b a(int i2) {
        c cVar = this.f33543a;
        String string = this.f33544b.getResources().getString(i2);
        l.b(string, "");
        cVar.a(string);
        return this;
    }

    public final b a(View view) {
        l.d(view, "");
        this.f33543a.f33550e = view;
        return this;
    }

    public final b a(AbstractC0734b bVar) {
        l.d(bVar, "");
        this.f33543a.y = bVar;
        return this;
    }

    public final b a(CharSequence charSequence) {
        l.d(charSequence, "");
        this.f33543a.a(charSequence);
        return this;
    }

    public final b a(boolean z) {
        this.f33543a.v = z;
        return this;
    }
}
