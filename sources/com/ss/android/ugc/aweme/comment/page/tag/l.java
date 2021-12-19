package com.ss.android.ugc.aweme.comment.page.tag;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class l extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public static final a f72268g = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private String f72269h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f72270i;

    static {
        Covode.recordClassIndex(44550);
    }

    public final View b(int i2) {
        if (this.f72270i == null) {
            this.f72270i = new SparseArray();
        }
        View view = (View) this.f72270i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f72270i.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44551);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getCloseType() {
        return this.f72269h;
    }

    public final void setCloseType(String str) {
        h.f.b.l.d(str, "");
        this.f72269h = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private l(Context context) {
        super(context, null, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(2350);
        View.inflate(context, R.layout.je, this);
        this.f72269h = "other";
        MethodCollector.o(2350);
    }

    public /* synthetic */ l(Context context, byte b2) {
        this(context);
    }
}
