package com.ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f150323a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f150324b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f150325c;

    /* renamed from: d  reason: collision with root package name */
    public h f150326d;

    /* renamed from: e  reason: collision with root package name */
    public int f150327e;

    /* renamed from: f  reason: collision with root package name */
    public String f150328f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnClickListener f150329g;

    /* renamed from: h  reason: collision with root package name */
    public String f150330h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f150331i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f150332j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f150333k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f150334l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f150335m;
    public boolean n;
    public boolean o;

    static {
        Covode.recordClassIndex(98884);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a$a  reason: collision with other inner class name */
    public static class C4050a {

        /* renamed from: a  reason: collision with root package name */
        public a f150336a = new a();

        /* renamed from: b  reason: collision with root package name */
        private Context f150337b;

        static {
            Covode.recordClassIndex(98885);
        }

        public final C4050a a(int i2) {
            this.f150336a.f150325c = this.f150337b.getString(i2);
            this.f150336a.f150334l = true;
            return this;
        }

        public C4050a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f150337b = applicationContext;
        }
    }
}
