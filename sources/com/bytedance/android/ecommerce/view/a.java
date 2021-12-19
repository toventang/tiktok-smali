package com.bytedance.android.ecommerce.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0097a f7328a;

    /* renamed from: b  reason: collision with root package name */
    public String f7329b;

    /* renamed from: c  reason: collision with root package name */
    public String f7330c;

    /* renamed from: d  reason: collision with root package name */
    public String f7331d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f7332e;

    /* renamed from: f  reason: collision with root package name */
    private Button f7333f;

    /* renamed from: g  reason: collision with root package name */
    private Button f7334g;

    /* renamed from: com.bytedance.android.ecommerce.view.a$a  reason: collision with other inner class name */
    public interface AbstractC0097a {
        static {
            Covode.recordClassIndex(3512);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(3509);
    }

    public a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xb);
        setCanceledOnTouchOutside(false);
        AssetManager assets = getContext().getAssets();
        Typeface createFromAsset = Typeface.createFromAsset(assets, "font/ProximaNova-Bold.otf");
        Typeface createFromAsset2 = Typeface.createFromAsset(assets, "font/ProximaNova-Regular.otf");
        TextView textView = (TextView) findViewById(R.id.bjp);
        this.f7332e = textView;
        textView.setText(this.f7329b);
        this.f7332e.setTypeface(createFromAsset2);
        Button button = (Button) findViewById(R.id.bjn);
        this.f7333f = button;
        button.setText(this.f7330c);
        this.f7333f.setTypeface(createFromAsset2);
        Button button2 = (Button) findViewById(R.id.bjo);
        this.f7334g = button2;
        button2.setText(this.f7331d);
        this.f7334g.setTypeface(createFromAsset);
        this.f7333f.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.ecommerce.view.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(3510);
            }

            public final void onClick(View view) {
                a.this.f7328a.a();
                a.this.dismiss();
            }
        });
        this.f7334g.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.android.ecommerce.view.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(3511);
            }

            public final void onClick(View view) {
                a.this.f7328a.b();
                a.this.dismiss();
            }
        });
    }
}
