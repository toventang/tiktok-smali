package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public class ChecklistItemView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65347a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private static final int f65348b = R.color.c5;

    /* renamed from: c  reason: collision with root package name */
    private static final int f65349c = R.color.bx;

    /* renamed from: d  reason: collision with root package name */
    private static final int f65350d = R.color.bg;

    /* renamed from: e  reason: collision with root package name */
    private static final int f65351e = R.color.bd;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f65352f;

    public enum b {
        Error,
        Success,
        None;

        static {
            Covode.recordClassIndex(40180);
        }
    }

    public ChecklistItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public View a(int i2) {
        if (this.f65352f == null) {
            this.f65352f = new HashMap();
        }
        View view = (View) this.f65352f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f65352f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40179);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(40178);
    }

    public void setDesc(String str) {
        l.d(str, "");
        TuxTextView tuxTextView = (TuxTextView) a(R.id.a5g);
        l.b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    public void setVariant(b bVar) {
        l.d(bVar, "");
        int i2 = a.f65430a[bVar.ordinal()];
        if (i2 == 1) {
            ((ImageView) a(R.id.a5f)).setColorFilter(getResources().getColor(f65348b), PorterDuff.Mode.SRC_IN);
            ((TuxTextView) a(R.id.a5g)).setTextColor(getResources().getColor(f65351e));
            ImageView imageView = (ImageView) a(R.id.a5f);
            l.b(imageView, "");
            imageView.setAlpha(0.5f);
            TuxTextView tuxTextView = (TuxTextView) a(R.id.a5g);
            l.b(tuxTextView, "");
            tuxTextView.setAlpha(0.5f);
        } else if (i2 == 2) {
            ((ImageView) a(R.id.a5f)).setColorFilter(getResources().getColor(f65350d), PorterDuff.Mode.SRC_IN);
            ((TuxTextView) a(R.id.a5g)).setTextColor(getResources().getColor(f65349c));
            ImageView imageView2 = (ImageView) a(R.id.a5f);
            l.b(imageView2, "");
            imageView2.setAlpha(1.0f);
            TuxTextView tuxTextView2 = (TuxTextView) a(R.id.a5g);
            l.b(tuxTextView2, "");
            tuxTextView2.setAlpha(1.0f);
        } else if (i2 == 3) {
            Resources resources = getResources();
            int i3 = f65348b;
            ((ImageView) a(R.id.a5f)).setColorFilter(resources.getColor(i3), PorterDuff.Mode.SRC_IN);
            ((TuxTextView) a(R.id.a5g)).setTextColor(getResources().getColor(i3));
            ImageView imageView3 = (ImageView) a(R.id.a5f);
            l.b(imageView3, "");
            imageView3.setAlpha(0.5f);
            TuxTextView tuxTextView3 = (TuxTextView) a(R.id.a5g);
            l.b(tuxTextView3, "");
            tuxTextView3.setAlpha(1.0f);
        }
    }

    private /* synthetic */ ChecklistItemView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChecklistItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9472);
        View.inflate(context, R.layout.ft, this);
        setVariant(b.None);
        MethodCollector.o(9472);
    }
}
