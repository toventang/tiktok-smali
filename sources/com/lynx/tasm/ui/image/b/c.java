package com.lynx.tasm.ui.image.b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public String f56961a;

    /* renamed from: b  reason: collision with root package name */
    public double f56962b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f56963c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f56964d;

    static {
        Covode.recordClassIndex(35436);
    }

    public final Uri a() {
        return (Uri) com.lynx.tasm.base.c.a(this.f56964d);
    }

    private Uri b(Context context) {
        this.f56963c = true;
        return e.a().b(context, this.f56961a);
    }

    private Uri a(Context context) {
        try {
            Uri parse = Uri.parse(this.f56961a);
            if (parse.getScheme() == null) {
                return b(context);
            }
            return parse;
        } catch (Exception unused) {
            return b(context);
        }
    }

    public c(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }

    public c(Context context, String str, double d2, double d3) {
        this.f56961a = str;
        this.f56962b = d2 * d3;
        this.f56964d = a(context);
    }
}
